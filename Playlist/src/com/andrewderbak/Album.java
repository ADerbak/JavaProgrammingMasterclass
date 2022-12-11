package com.andrewderbak;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public static boolean addSong(String title, double duration){
        // TODO: return true if song was added successfully
    }

    public static Song findSong(String title){
        // TODO: return Song if it exists, null otherwise

    }

    public static boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        // TODO: Returns true if it exists and it was added successfully using the track number
        //  or false otherwise.
    }
}
