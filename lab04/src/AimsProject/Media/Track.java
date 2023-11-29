package AimsProject.Media;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Method play
    public void play() {
        System.out.println("Playing track: " + title);
        System.out.println("Track length : " + length);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Track track) {
            return title.equals(track.getTitle()) && length == track.getLength();
        }
        return false;
    }
}
