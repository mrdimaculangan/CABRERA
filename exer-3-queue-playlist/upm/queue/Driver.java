package upm.queue;

public class Driver {
    public static void main(String[] args) {
        Spotify Spotify = new Spotify();

        // List of songs to test if Methods work
        // This playlist is for my fave prof who passed away.
        // Happy birthday, sir olops! I'll never forget u. rest in power <3
        Song song1 = new Song("The Red Jumpsuit Apparatus", "Your Guardian Angel");
        Song song2 = new Song("Before You Exit", "Clouds");
        Song song3 = new Song ("The Goo Goo Dolls", "Iris");
        Song song4 = new Song ("The Fray", "How to Save a Life");
        Song song5 = new Song ("Breathe", "Hands to Heaven");

        // Call Methods to add songs
        Spotify.addSong(song1);
        Spotify.addSong(song2);
        Spotify.addSong(song3);
        Spotify.addSong(song4);
        Spotify.addSong(song5);

        // Call method from Spotify class to display all songs
        Spotify.displayAllSongs();

        // Call method from Spotify class to play next song
        Spotify.playNext();

        Spotify.printCurrentSong();

        // Call method from Spotify class again to display all songs to show off the amazing queue that I love so much it's really giving Spotify
        Spotify.displayAllSongs();



    }
}
