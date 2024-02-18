package facade;

public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        this.cpu = new CPUImpl();
        this.hardDrive = new HardDriveImpl();
        this.memory = new MemoryImpl();
    }

    public void start(){
        cpu.freeze();
        cpu.execute();
        hardDrive.read();
        memory.load();
    }
}
