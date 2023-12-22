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


    public void addGuitar(String serialNumber,Builder builder, String model, Type type,
                          Wood backWood, Wood topWood, double price){
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

    public Guitar search(Guitar idealGuitar){
//        Ignore the price and serialNumber fields
        for(Guitar guitar : this.guitars){
            boolean found = true;

            if(idealGuitar.getBuilder()!=null && idealGuitar.getBuilder().equals(guitar.getBuilder())==false){
                found = false;
            }

            if(idealGuitar.getModel()!=null && idealGuitar.getModel().equals(guitar.getModel())==false){
                found = false;
            }

            if(idealGuitar.getType()!=null && idealGuitar.getType().equals(guitar.getType())==false){
                found = false;
            }

            if(idealGuitar.getBackWood()!=null && idealGuitar.getBackWood().equals(guitar.getBackWood())==false){
                found = false;
            }

            if(idealGuitar.getTopWood()!=null && idealGuitar.getTopWood().equals(guitar.getTopWood())==false){
                found = false;
            }

            if(found){
                return guitar;
            }
        }
        return null;
    }



}
