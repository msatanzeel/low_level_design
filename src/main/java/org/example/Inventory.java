package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(List<Guitar> guitars){
        this.guitars = guitars;
    }

    public Inventory(){
        this.guitars = new LinkedList<>();
    }


    public void addGuitar(String serialNumber,double price, GuitarSpecs specs){
        Guitar guitar = new Guitar(serialNumber,price, specs);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Guitar guitar : this.guitars){
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpecs specs){
        List<Guitar> matchingList = new ArrayList<>();
        for(Guitar guitar : this.guitars) {
            if(specs.equals(guitar.getSpecs())){
                matchingList.add(guitar);
            }
        }
        return matchingList;
    }

}
