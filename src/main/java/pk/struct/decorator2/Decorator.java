package pk.struct.decorator2;

public class Decorator implements Swan {
    private Swan swan;

    //修饰的是谁
    public Decorator(Swan swan) {
        this.swan = swan;
    }

    public void cry() {
        swan.cry();
    }

    public void desAppaearance() {
        swan.desAppaearance();
    }

    public void fly() {
        swan.fly();
    }
}

