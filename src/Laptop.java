//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class Laptop extends Computer {
    private double screenSize;
    private double batteryLife;
    private int brightness;

    public Laptop(String brand, double processorSpeed, double storageCapacity, double screenSize, double batteryLife) {
        super(brand, processorSpeed, storageCapacity);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        this.brightness = this.setBrightness();
    }

    public void powerOn() {
        System.out.println("Laptop is On!");
    }

    public void powerOff() {
        System.out.println("Laptop is Off!");
    }

    public void adjustScreenBrightness(int brightness) {
        this.setBrightness(brightness);
        System.out.println("Brightness adjusted to: " + brightness);
    }

    public void hibernate() {
        this.powerOff();
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBatteryLife() {
        return this.batteryLife;
    }

    public int getBrightness() {
        return this.brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int setBrightness() {
        Random number = new Random();
        return number.nextInt(10, 101);
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String toString() {
        String var10000 = this.getBrand();
        return "Laptop{Brand=" + var10000 + " ProcessorSpeed=" + this.getProcessorSpeed() + " StorageCapacity=" + this.getStorageCapacity() + " screenSize=" + this.screenSize + " batteryLife=" + this.batteryLife + " brightness=" + this.brightness + "},\n";
    }
}
