package facade;

public class CPUImpl implements CPU{
    @Override
    public void freeze() {
        System.out.println("freezing...");
    }

    @Override
    public void execute() {
        System.out.println("executing the instructions...");
    }
}
