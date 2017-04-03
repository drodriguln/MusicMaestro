package com.developer.drodriguez.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Daniel on 4/3/17.
 */
public class Song {

    private int id;
    private String name;
    private String year;

    @JsonIgnore
    private String filePath;

    public Song() {}

    public Song(int id, String name, String year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Song(int id, String name, String year, String filePath) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }

}
