package com.example.songr.modals;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trackNumber;
    private String title;
    private int lengthInSec;
    @ManyToOne
    private Album album;

    public Song() {
    }

    public Song(String title, int lengthInSec, Album album) {
        this.title = title;
        this.lengthInSec = lengthInSec;
        this.album = album;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthInSec() {
        return lengthInSec;
    }

    public void setLengthInSec(int lengthInSec) {
        this.lengthInSec = lengthInSec;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "{" + "trackNumber=" + trackNumber + ", title='" + title + '\'' + ", lengthInSec=" + lengthInSec + ", album=" + album + '}';
    }
}
