package org.example;


public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpecs specs;

    /**
 * Creates a new Guitar with the specified serial number, price, and specifications.
 *
 * @param serialNumber the guitar's serial number
 * @param price the guitar's price
 * @param specs the guitar's specifications (note that if we have taken all the parameters instead of just
     *              the specification, then we will have to change this constructor as well in case of adding
     *          a new specification
 */
public Guitar(String serialNumber, double price, GuitarSpecs specs) {
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
