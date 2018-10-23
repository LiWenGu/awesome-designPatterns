package bridge.standard;

public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abs = new RefineAbstraction(imp);
        // 执行行文
        abs.request();

    }
}
