package pk.struct.adapter;

public class Duckling implements Duck {
    public void cry() {
        System.out.println("叫声是嘎——嘎——嘎");
    }

    public void desAppearance() {
        System.out.println("外形是黄白相间，嘴长");
    }

    // 鸭子的其他行为，如游泳
    public void desBehavior() {
        System.out.println("会游泳");
    }
}
