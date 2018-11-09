package base.flyweight.multierror;

/**
 * @Author liwenguang
 * @Date 2018/10/24 1:33 AM
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //在对象池中初始化4个对象
        SignInfoFactory.getSignInfo("科目1");
        SignInfoFactory.getSignInfo("科目2");
        SignInfoFactory.getSignInfo("科目3");
        SignInfoFactory.getSignInfo("科目4");
        //取得对象
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
        testCreateTime();
        while (true) {
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            (new MultiThread(signInfo)).start();
            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            (new MultiThread(signInfo)).start();
        }
    }

    private static void testCreateTime() {
        //计算执行10万次需要的时间
        long currentTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            SignInfoFactory.getSignInfo("kkkkkk");
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间："+(tailTime - currentTime) + " ms"); // 46ms
    }
}