package AimsProject;

public class Aims {
    public static void main(String[] args) {
        // Create a new Cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Aller", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "Geogre Lucas", 87, 24.95f);
        anOrder.removeDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Snow White", "Animation", 18.99f);

        DigitalVideoDisc[] list = new DigitalVideoDisc[2];
        list[0] = new DigitalVideoDisc("Movie 1", "Category 1", "Director 1", 120, 19.99f);
        list[1] = new DigitalVideoDisc("Movie 2", "Category 2", "Director 2", 150, 24.99f);
        anOrder.addDigitalVideoDisc(list);

        // print total cost of the items in the cart
        System.out.println("Total cost is: " + anOrder.totalCost());

        // remove a DVD which exists in the carts
        anOrder.removeDigitalVideoDisc(dvd2);;

        // remove a DVD which doesn't exist in the carts
        anOrder.removeDigitalVideoDisc(dvd4);
    }
}


