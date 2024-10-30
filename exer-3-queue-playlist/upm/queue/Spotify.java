package upm.queue;
import java.util.LinkedList;
import java.util.Queue;

// Queue is FIFO
public class Spotify {
    // Creation of queue using Linked List
    // Name queue "playlist"
    static Queue<Song> playlist = new LinkedList<>(); // holds Song objects

    // Constructor to initialize playlist queue
    // Created constructor to make sure that when creating a Spotify object, starts with a valid empty playlist
    public Spotify() {
        playlist = new LinkedList<>();
    }

    // Method to play next song
    // My understanding of the playNext method is like in Spotify, wherein when you queue it, to play next song, it would still match the current song
    public void playNext() {
        if (playlist.isEmpty()) {
            System.out.println("There are currently no songs in the queue"); // error handling if playlist is empty
        } else {
            Song removeFirstSong = playlist.poll(); // Use poll to remove song at front of queue
            Song nextSong = playlist.peek(); // Use peek to display next song
            System.out.print("\nNow playing: ");
            nextSong.printSong(); // print nextSong
        }
    }

    // Method to print Current Song
    void printCurrentSong() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty."); // Error handling if playlist is empty
        } else {
            System.out.print("\nCurrent song: ");
            playlist.peek().printSong(); // Use peek to point at song at the head/front without removing it
        }
    }

    // Method to add new song to playlist
    public void addSong(Song song) {
        playlist.add(song); // Use add to add song to rear of queue
        System.out.println("Added song: " + song.getArtist() + " - " + song.getTitle()); // Call getter methods from Song class
    }


    // Method to Display all songs including song currently being played, list of songs queued
    static void displayAllSongs() {
        if (playlist.isEmpty()){
            System.out.println("There are currently no songs in the queue"); // Error handling if playlist is empty
        } else {
            Song currentSong = playlist.peek(); // Create instance of currentSong inside the method
            System.out.print("\nCurrent Song playing: ");
            playlist.peek().printSong(); // Use peek again to show current song

            System.out.println("Queued Songs:");
            for (Song song : playlist) { // for loop to print all songs in the playlist
                if (song != currentSong) { // Create if statement so that queued songs wouldn't add the currentSong so it really looks like Spotify
                    song.printSong();
                }
            }
        }

    }
}
