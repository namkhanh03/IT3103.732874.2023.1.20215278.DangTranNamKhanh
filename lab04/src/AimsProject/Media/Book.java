package AimsProject.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public void addAuthor(String authorName){
        if (authors.contains(authorName)){
            System.out.println("Author has already been in list");
            return;
        }
        authors.add(authorName);
        System.out.println("Add successfully");
    }

    public void removeAuthor(String authorName){
        if (!authors.contains(authorName)){
            System.out.println("Author" + authorName + "is not in the list");
            return;
        }
        authors.remove(authorName);
        System.out.println("Remove author" + authorName + "successfully");
    }

    // Method to print a book
    @Override
    public void print() {
        System.out.print(getId() + ". Book - "
                + getTitle() + " - "
                + getCategory() + " - ");
        for (String author: authors) {
            System.out.print(author + " - ");
        }
        System.out.println(getCost() + "$");
    }
}
