package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addGuitar("1234567890", 101.0, new GuitarSpecs(Builder.GIBSON, "Guitar", Type.Bass, Wood.ALDER, Wood.MAHOGANY ));
        inventory.addGuitar("1230567890",101.0, new GuitarSpecs(Builder.GIBSON, "Guitar", Type.Bass, Wood.ALDER, Wood.MAHOGANY));


        GuitarSpecs idealGuitarSpecs = new GuitarSpecs(Builder.GIBSON, "Guitar", Type.Bass, Wood.ALDER, Wood.MAHOGANY);

        List<Guitar> searchResults = inventory.search(idealGuitarSpecs);
        if(searchResults.size()>0) {
            System.out.println("Ideal guitar found");
        }else{
            System.out.println("Ideal guitar not found");
        }
    }
}