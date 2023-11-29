package AimsProject;

import AimsProject.Media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();

    public Store() {
    }

    // Method add
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added");
    }

    // Method remove
    public void removeMedia(Media media) {
        int indexOfRemoved = itemsInStore.indexOf(media);
        if (indexOfRemoved == -1) {
            System.out.println("Not found");
            return;
        }
        itemsInStore.remove(indexOfRemoved);
        System.out.println("Removed");
    }

    // Getter and Setter
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

}
