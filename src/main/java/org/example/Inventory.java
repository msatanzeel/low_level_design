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


    public void addGuitar(String serialNumber,String builder, String model, String type,
                          String backWood, String topWood, double price){
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
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

    public boolean compare(String ideal, String actual){
        if(ideal == null || ideal.equals(""))
            return true;
        ideal = ideal.toLowerCase();
        actual = actual.toLowerCase();
        return ideal.equals(actual);
    }


    public Guitar search(Guitar idealGuitar){
//        Ignore the price and serialNumber fields
        for(Guitar guitar : this.guitars){
            boolean found = true;

            if(compare(idealGuitar.getBuilder(), guitar.getBuilder()) == false){
                found = false;
            }

            if(compare(idealGuitar.getModel(), guitar.getModel()) == false){
                found = false;
            }

            if(compare(idealGuitar.getType(), guitar.getType()) == false){
                found = false;
            }

            if(compare(idealGuitar.getBackWood(), guitar.getBackWood())==false){
                found = false;
            }

            if(compare(idealGuitar.getTopWood(), guitar.getTopWood())==false){
                found = false;
            }

            if(found){
                return guitar;
            }
        }
        return null;
    }



}
