package bridge.standard;

public class RefineAbstraction extends Abstraction{

    public RefineAbstraction(Implementor _imp) {
        super(_imp);
    }

    // 修正父类的行为
    @Override
    public void request() {
        super.request();
        // 特殊操作
        super.getImp().doAnything();
    }
}
