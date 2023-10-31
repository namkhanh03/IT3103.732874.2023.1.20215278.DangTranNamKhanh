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
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Snow White", "Animation", 18.99f);

        // print total cost of the items in the cart
        System.out.println("Total cost is: " + anOrder.totalCost());

        // remove a DVD which exists in the carts
        anOrder.removeDigitalVideoDisc(dvd2);;

        // remove a DVD which doesn't exist in the carts
        anOrder.removeDigitalVideoDisc(dvd4);
    }
}


