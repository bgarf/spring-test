package com.treehouse.projects.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String listGifs() {
        return "List of all the GIFs";
    }

    @RequestMapping(value = "/gif")
    @ResponseBody
    public String getGif() {
        return "Its's a GIF";
    }
}
