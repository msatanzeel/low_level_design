package org.example;

import java.util.Objects;

public class GuitarSpecs {
    private Builder builder;
    private String model;
    private  Type type;
    private  Wood backWood;
    private  Wood frontWood;

    private int numStrings;

    public GuitarSpecs(Builder builder, String model, Type type, Wood backWood, Wood frontWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.frontWood = frontWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getFrontWood() {
        return frontWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public String toString() {
        return "GuitarSpecs{" +
                "builder=" + builder +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", backWood=" + backWood +
                ", frontWood=" + frontWood +
                ", numStrings=" + numStrings +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, type, backWood, frontWood, numStrings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;

        GuitarSpecs that = (GuitarSpecs) o;

        if (builder!= that.builder) return false;
        if (!Objects.equals(model, that.model)) return false;
        if (type!= that.type) return false;
        if (backWood!= that.backWood) return false;
        return frontWood == that.frontWood;
    }
}
