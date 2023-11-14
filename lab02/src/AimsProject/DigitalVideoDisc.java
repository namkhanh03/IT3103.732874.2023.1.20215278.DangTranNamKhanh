package AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDisc = 0;

    // Getter method
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    public int getId(){
        return id;
    }

    // Setter method
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setId(int id){
        this.id = id;
    }

    // Constructor method
    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length ,float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }
}


