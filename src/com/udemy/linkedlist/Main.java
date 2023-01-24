package com.udemy.linkedlist;

import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Song> playList = new LinkedList<>();
        Album album = new Album("Folk", "Anirudh");
        album.addSong("Marana mass", 4.12);
        album.addSong("Udhungada Sangu", 4.30);
        album.addSong("Chumma Kizhi", 4.40);
        album.addSong("Thaai Kelavi", 5.12);
        albums.add(album);
        album = new Album("Melody", "Yuvan");
        album.addSong("Oru Naalil", 5.30);
        album.addSong("Pogathe", 4.35);
        album.addSong("Oru Devathai", 4.26);
        album.addSong("Vinmegam", 4.23);
        albums.add(album);
        albums.get(0).addToPlayList(2, playList);
        albums.get(0).addToPlayList(1, playList);
        albums.get(1).addToPlayList("Pogathe", playList);
        albums.get(1).addToPlayList("Vinmegam", playList);
        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean previousSong = true;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printOptions();
        }
        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Quitting the app");
                    quit = true;
                    break;
                case 1:
                    goingForward = navigateSongs(!previousSong, goingForward, listIterator);
                    break;
                case 2:
                    goingForward = navigateSongs(previousSong, goingForward, listIterator);
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("You are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("You are at the start of the list");
                        }
                    }
                    break;
                case 4:
                    printOptions();
                    break;
                case 5:
                    printListOfSongs(playList);
                    break;
                case 6:
                    if (!playList.isEmpty()) {
                        listIterator.remove();
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        } else if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;
                case 7:
                    System.out.print("Select the track number you want to play: ");
                    int number = sc.nextInt();
                    int index = number - 1;
                    if (index < playList.size()) {
                        System.out.println("Now playing: " + playList.get(index));
                    } else {
                        System.out.println("The selected track number does not exist");
                    }
                    break;
            }
        }
    }

    private static void printOptions() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - Replay the same song\n" +
                "4 - print menu options\n" +
                "5 - print songs in the playlist\n" +
                "6 - remove a song from playlist\n" +
                "7 - select a song to play");
    }

    private static void printListOfSongs(LinkedList<Song> playList) {
        System.out.println("Available songs in the playlist:");
        for (Song song : playList) {
            System.out.println(song.toString());
        }
    }

    private static boolean navigateSongs(boolean flag, boolean forward, ListIterator<Song> listIterator) {
        if (flag) {
            if (forward) {
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                forward = false;
            }
            if (listIterator.hasPrevious()) {
                System.out.println("Now playing " + listIterator.previous().toString());
            } else {
                System.out.println("You are at the start of the list");
                forward = true;
            }
        } else {
            if (!forward) {
                if (listIterator.hasNext()) {
                    listIterator.next();
                }
                forward = true;
            }
            if (listIterator.hasNext()) {
                System.out.println("Now playing " + listIterator.next().toString());
            } else {
                System.out.println("Reached the end of the list");
                forward = false;
            }
        }
        return forward;
    }
}
