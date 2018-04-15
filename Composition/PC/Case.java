package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSuplly;
    private Dimensions dimension;

    public Case(String model, String manufacturer, String powerSuplly, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuplly = powerSuplly;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSuplly() {
        return powerSuplly;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
