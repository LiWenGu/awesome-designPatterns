package bridge.standard;

public abstract class Abstraction {
    private Implementor imp;

    // 约束子类必须实现构造方法
    public Abstraction(Implementor _imp) {
        this.imp = _imp;
    }

    // 自身的行为和属性，比继承更加解耦
    public void request() {
        this.imp.doSomething();
    }

    public Implementor getImp() {
        return imp;
    }
}
