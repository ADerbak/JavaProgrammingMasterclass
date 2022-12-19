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

    public boolean addSong(String title, double duration){
        // TODO: return true if song was added successfully
//        Song newSong = new Song(title, duration);
//        this.songs.add(newSong);
//        return (findSong(title) != null);
        if (findSong(title) == null){
            this.songs.add(new Song(title, duration));
        }
        return false;

    }

    public Song findSong(String title){
        // TODO: return Song if it exists, null otherwise
        for (Song song:this.songs){
            if (song.getTitle().equals(title)) return song;
        }
        return null;

    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        // TODO: Returns true if it exists and it was added successfully using
        //  the track number or false otherwise.
        int index = trackNumber-1;
        if ((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        // TODO: Returns true if it exists and it was added successfully
        //  using the name of the song, or false otherwise.
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not on this album");
        return false;
    }
}
