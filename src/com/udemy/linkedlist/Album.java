package com.udemy.linkedlist;
//1. Album
//
//          - It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.
//
//          - A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.
//
//          - And three methods, they are:
//
//            - addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean.
//            Returns true if the song was added successfully or false otherwise.
//
//            - findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists,
//            null if it doesn't exists.
//
//            - addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that
//            holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.
//
//            - addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of
//            type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList) {
        Song addSong = this.songs.findSong(trackNo);
        if (addSong != null) {
            playList.add(addSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = this.songs.findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(int trackNo) {
            int index = trackNo - 1;
            if (index >= 0 && index < this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
    }
}
