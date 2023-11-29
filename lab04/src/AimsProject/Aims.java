package AimsProject;

import AimsProject.Media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Create a new Cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation",
                "Roger Aller", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction",
                "Geogre Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc( 3,"Animation","Aladin", 18.99f);
        anOrder.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc( 4,"Animation","Snow White", 18.99f);

        // print total cost of the items in the cart

        // remove a DVD which exists in the carts
        anOrder.removeMedia(dvd2);;

        // remove a DVD which doesn't exist in the carts
        anOrder.removeMedia(dvd4);

        System.out.println("Total cost is: " + anOrder.totalCost());
    }
}