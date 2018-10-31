package adapter.standard;

public class Adapter extends Source implements Target {
    public void request() {
        super.doSomething();
    }
}

