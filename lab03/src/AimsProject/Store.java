package AimsProject;

public class Store {
    private DigitalVideoDisc[] store;
    private int NOD;

    public Store(int NOD) {
        store = new DigitalVideoDisc[NOD];
        this.NOD = NOD;
    }
    public int getNumberOfDVD() {
        return NOD;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < store.length; i++) {
            if (store[i] == null) {
                store[i] = dvd;
                System.out.println("DVD has been added to store");
                return;
            }
        }
        System.out.println("Store is full");
    }
    public void removeDVD(String title) {
        for (int i = 0; i < store.length; i++) {
            if (store[i] != null && store[i].getTitle().equalsIgnoreCase(title)) {
                store[i] = null;
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("DVD not found in the store: " + title);
    }
    //method to print items in store
    public void printItems() {
        for(int i = 0; i < store.length; i++) {
            if(store[i] != null) {
                System.out.println(store[i].getTitle());
            }
        }
    }

}
