//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public abstract class Computer {
    private String brand;
    private double processorSpeed;
    private double storageCapacity;

    public Computer(String brand, double processorSpeed, double storageCapacity) {
        this.brand = brand;
        this.processorSpeed = processorSpeed;
        this.storageCapacity = storageCapacity;
    }

    public abstract void powerOn();

    public abstract void powerOff();

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getProcessorSpeed() {
        return this.processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public double getStorageCapacity() {
        return this.storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
