package facade;

public class HardDriveImpl implements HardDrive{
    @Override
    public void read() {
        System.out.println("Reading from Hard disk..");
    }
}
