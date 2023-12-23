package org.example;


public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpecs specs;

    public Guitar(String serialNumber, double price,GuitarSpecs specs) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.specs = specs;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuitarSpecs getSpecs() {
        return specs;
    }
}
