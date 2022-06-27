package me.dio.soccernews.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class News {

    @PrimaryKey
    public int id;
    public String title;
    public String description;
    public String link;
    public String image;
    public boolean favorite;

}
