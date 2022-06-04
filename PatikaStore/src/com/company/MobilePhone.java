package com.company;

public class MobilePhone extends Product{

    private int memoryInformation;
    private double screenSize;
    private double batteryPower;
    private int RAM;
    private String color;

    public MobilePhone(){};

    public MobilePhone(int id, String productName, double unitPrice, int discountRate, int stock, Brand brand,
                       int memoryInformation, double screenSize, double batteryPower, int RAM, String color) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.memoryInformation = memoryInformation;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.RAM = RAM;
        this.color = color;
    }

    public int getMemoryInformation() {
        return memoryInformation;
    }

    public void setMemoryInformation(int memoryInformation) {
        this.memoryInformation = memoryInformation;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
