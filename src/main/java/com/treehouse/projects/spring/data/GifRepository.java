package com.treehouse.projects.spring.data;

import com.treehouse.projects.spring.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Ramacciotti", false, LocalDate.of(2015,2,13)),
            new Gif("ben-and-mike", "Ben Jakuben", true, LocalDate.of(2015,10,30)),
            new Gif("book-dominos", "Craig Dennis", false, LocalDate.of(2015,9,15)),
            new Gif("compiler-bot", "Ada Lovelace", true, LocalDate.of(2015,2,13)),
            new Gif("cowboy-coder", "Grace Hopper", false, LocalDate.of(2015,2,13)),
            new Gif("infinite-andrew", "Marissa Mayer", true, LocalDate.of(2015,8,23))
    );

    public Gif findByName(String name) {
        for(Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }
}
