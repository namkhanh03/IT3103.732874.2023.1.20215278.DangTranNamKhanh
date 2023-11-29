package AimsProject.Media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost,
                       String director, int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
    }

    // Add tracks
    public void addTrack(Track track) {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            System.out.println("Track is already in the list");
            return;
        }
        tracks.add(track);
        System.out.println("Added");
    }

    // Remove tracks
    public void removeTrack(Track track) {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            System.out.println("Track is absent in the list");
            return;
        }
        tracks.remove(indexOfTrack);
        System.out.println("Removed");
    }

    // Get length
    @Override
    public int getLength() {
        int length = 0;
        for (Track track: tracks) {
            length += track.getLength();
        }
        setLength(length);
        return length;
    }

    // Method play
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + artist);
        System.out.println("CD length: " + this.getLength());
        for (Track track: tracks) {
            track.play();
        }
    }

    // Method to print a cd
    @Override
    public void print() {
        System.out.println(getId() + ". CD - "
                + getTitle() + " - "
                + getCategory() + " - "
                + getDirector() + " - "
                + artist + " - "
                + getLength() + ": "
                + getCost() + "$");
    }
}
