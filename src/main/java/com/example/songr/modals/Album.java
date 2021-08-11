package com.example.songr.modals;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "album") // column name will be added to song table to indicate in which album the song is
    private List<Song> songs;

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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() { // song.size() is added to avoid stack overflow error
        return "{" + "songCount=" + songCount + ", title='" + title + '\'' + ", artist='" + artist + '\'' + ", " +
                "lengthInSec=" + lengthInSec + ", imageUrl='" + imageUrl + '\'' + ", NumberOfSongs=" + songs.size() + '}';
    }
}
