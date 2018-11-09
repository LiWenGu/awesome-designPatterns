package base.bridge;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的IPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的IPod卖出去了...");
    }
}
