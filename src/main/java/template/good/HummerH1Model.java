package template.good;

public class HummerH1Model extends HummerModel {

    //H1型号的悍马车鸣笛
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    //引擎轰鸣声
    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    //汽车发动
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    //停车
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }
}
