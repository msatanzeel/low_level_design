package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addGuitar("1234567890", Builder.FENDER, "Guitar", Type.Electric, Wood.CEDAR, Wood.ALDER, 100.0);
        inventory.addGuitar("1234567890", Builder.GIBSON, "Guitar", Type.Bass, Wood.CEDAR, Wood.ALDER, 100.0);

        Guitar idealGuitar = new Guitar("1234567890", Builder.FENDER, "Guitar", Type.Electric, Wood.CEDAR, Wood.ALDER, 100.0);

        if(inventory.search(idealGuitar) != null) {
            System.out.println("Ideal guitar found");
        }else{
            System.out.println("Ideal guitar not found");
        }



    }
}