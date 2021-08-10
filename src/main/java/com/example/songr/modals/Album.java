package com.example.songr.modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// to make this modal as table in database
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songCount;
    private String title;
    private String artist;
    private int lengthInSec;
    private String imageUrl;

    public Album() {
    }

    public Album(String title, String artist, int lengthInSec, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.lengthInSec = lengthInSec;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLengthInSec() {
        return lengthInSec;
    }

    public void setLengthInSec(int lengthInSec) {
        this.lengthInSec = lengthInSec;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Album{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", songCount=" + songCount + ", " +
                "lengthInSec=" + lengthInSec + ", imageUrl='" + imageUrl + '\'' + '}';
    }
}
