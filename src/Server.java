//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Server extends Computer {
    private String rackSize;
    private String dataCenterLocation;

    public Server(String brand, double processorSpeed, double storageCapacity, String rackSize, String dataCenterLocation) {
        super(brand, processorSpeed, storageCapacity);
        this.rackSize = rackSize;
        this.dataCenterLocation = dataCenterLocation;
    }

    public void powerOn() {
        System.out.println("Server Powering ON");
    }

    public void powerOff() {
        System.out.println("Server Powering OFF");
    }

    public void manageUserRequest() {
    }

    public void backupData() {
    }

    public String getRackSize() {
        return this.rackSize;
    }

    public void setRackSize(String rackSize) {
        this.rackSize = rackSize;
    }

    public String getDataCenterLocation() {
        return this.dataCenterLocation;
    }

    public void setDataCenterLocation(String dataCenterLocation) {
        this.dataCenterLocation = dataCenterLocation;
    }

    public String toString() {
        String var10000 = this.getBrand();
        return "Server{Brand=" + var10000 + " ProcessorSpeed=" + this.getProcessorSpeed() + " StorageCapacity=" + this.getStorageCapacity() + " rackSize='" + this.rackSize + "' dataCenterLocation='" + this.dataCenterLocation + "'},\n";
    }
}
