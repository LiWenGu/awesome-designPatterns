package pk.struct.decorator;

public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}