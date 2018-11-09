package base.observer.bad;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        // 定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 观察早餐
        Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
        // 开始启动线程，监控
        watchBreakfast.start();
        // 观察娱乐情况
        Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
        watchFun.start();
        // 然后我们看看韩非子在干什么
        Thread.sleep(1000); //主线程等待1秒后后再往下执行
        hanFeiZi.haveBreakfast();
        // 韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
