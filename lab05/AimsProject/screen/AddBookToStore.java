package AimsProject.screen;

import AimsProject.Cart;
import AimsProject.Store;
import AimsProject.media.Book;
import AimsProject.media.CompactDisc;
import AimsProject.media.DigitalVideoDisc;
import AimsProject.media.Media;

import javax.swing.*;
import java.awt.*;

public class AddBookToStore extends AddMediaToStoreScreen{
    // Constructor
    public AddBookToStore(Store store, Cart cart) {
        super(store, cart, "Add Book to store", "ADD BOOK TO STORE");
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout (new GridLayout(4, 2, 2, 2));
        addInputRow(center, "Id", tfId);
        addInputRow(center, "Title", tfTitle);
        addInputRow(center, "Category", tfCategory);
        addInputRow(center, "Cost", tfCost);
        return center;
    }

    public Media createMedia() {
        return new Book(Integer.parseInt(tfId.getText()), tfTitle.getText(),
                tfCategory.getText(), Float.parseFloat(tfCost.getText()));
    }
}
