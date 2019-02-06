package com.treehouse.projects.spring.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private String username;
    private Boolean favourite;
    private LocalDate dateUploaded;

    public Gif(String name, String username, Boolean favourite, LocalDate dateUploaded) {
        this.name = name;
        this.username = username;
        this.favourite = favourite;
        this.dateUploaded = dateUploaded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }
}
