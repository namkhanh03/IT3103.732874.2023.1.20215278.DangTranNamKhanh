package AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qtyOrdered = 0;

    // Method to add DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The DVD has been added successfully.");
        } else {
            System.out.println("You can't add more because the cart is full.");
        }
    }

    // Overloading
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("The disc has been added");
            }
        }
    }

    // Method to remove DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        boolean a = false;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i] == disc){
                a = true;
                for (int j = i; j < qtyOrdered; j++){
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The DVD has been removed");
                break;
            }
        }
        if(!a){
            System.out.println("Can't find this DVD in the cart");
        }
    }

    // Method to count total cost of all DVD in the cart
    public float totalCost(){
        float total = 0f;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemOrdered[i].getCost();
        }
        return total;
    }
}
