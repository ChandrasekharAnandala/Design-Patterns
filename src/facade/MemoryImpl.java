package facade;

public class MemoryImpl implements Memory{
    @Override
    public void load() {
        System.out.println("Loading the data...");
    }
}
