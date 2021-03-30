package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Started work...");
    }

    @Override
    public void stopWork() {
        System.out.println("Stopped work...");
    }
}