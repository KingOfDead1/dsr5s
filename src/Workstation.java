//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Workstation extends Computer {
    private int numMonitors;
    private int processingUnits;

    public Workstation(String brand, double processorSpeed, double storageCapacity, int numMonitors, int processingUnits) {
        super(brand, processorSpeed, storageCapacity);
        this.numMonitors = numMonitors;
        this.processingUnits = processingUnits;
    }

    public void powerOn() {
        System.out.println("Workstation is powering ON");
    }

    public void powerOff() {
        System.out.println("Workstation is powering Off");
    }

    public void runMultipleTasks() {
    }

    public void coolingSystemControl() {
    }

    public int getNumMonitors() {
        return this.numMonitors;
    }

    public void setNumMonitors(int numMonitors) {
        this.numMonitors = numMonitors;
    }

    public int getProcessingUnits() {
        return this.processingUnits;
    }

    public void setProcessingUnits(int processingUnits) {
        this.processingUnits = processingUnits;
    }

    public String toString() {
        String var10000 = this.getBrand();
        return "Workstation{Brand=" + var10000 + " ProcessorSpeed=" + this.getProcessorSpeed() + " StorageCapacity=" + this.getStorageCapacity() + " numMonitors=" + this.numMonitors + " processingUnits=" + this.processingUnits + "},\n";
    }
}
