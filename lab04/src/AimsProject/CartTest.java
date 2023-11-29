package AimsProject;

import AimsProject.Media.DigitalVideoDisc;
import AimsProject.Cart;


import java.util.*;

public class CartTest {
    public static void main(String[] args) {
        //Create new cart
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Animation","Aladin",  18.99f);
        cart.addMedia(dvd3);

        //test print method
        cart.printCart();

        //test search method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter title: ");
        String title = sc.nextLine(); //title you want to find
        cart.searchByTitle(title);

        System.out.println("Enter id: ");
        int id = sc.nextInt(); //id you want to find
        cart.searchByID(id);

    }
}