package proxy.ext_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println("开始时间");
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangSan", "password");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
