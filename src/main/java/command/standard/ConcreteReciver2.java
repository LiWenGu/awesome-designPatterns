package command.standard;

public class ConcreteReciver2 extends Receiver {
    // 每个接收者都必须处理一定的业务逻辑
    public void doSomething() {
        System.out.println("处理2");
    }
}