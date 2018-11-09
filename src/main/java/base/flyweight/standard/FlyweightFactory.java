package base.flyweight.standard;

import java.util.HashMap;

/**
 * @Author liwenguang
 * @Date 2018/10/23 11:39 PM
 * @Description
 */
public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap();

    public static Flyweight getFlyweight(String Extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            flyweight = new ConcreteFlyweight(Extrinsic);
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;
    }
}