package upm.queue;

public class Song {
    private String title;
    private String artist;

    public Song(String Artist, String Title) {
        this.artist = Artist;
        this.title = Title;
    }

    // Method to print song in format Song Artist - Title so it's automatic when called in Spotify class
    // Following sir's example {Artist} - {Title}
    public void printSong() {
        System.out.println(artist + " - " + title);
    }

    // Getter method to access song's title for use outside of this class
    public String getTitle() {
        return title;
    }

    // Getter method to access song's artist for use outside of this class
    public String getArtist() {
        return artist;
    }
}
