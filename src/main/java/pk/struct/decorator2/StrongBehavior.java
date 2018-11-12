package pk.struct.decorator2;

public class StrongBehavior extends Decorator {
    // 强化谁
    public StrongBehavior(Swan swan) {
        super(swan);
    }

    // 会飞行了
    @Override
    public void fly() {
        System.out.println("会飞行了！");
    }
}
