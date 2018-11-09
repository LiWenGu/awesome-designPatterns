package base.flyweight.multierror;

import java.util.HashMap;

/**
 * @Author liwenguang
 * @Date 2018/10/24 1:30 AM
 * @Description
 */
public class SignInfoFactory {
    //池容器
    private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
    //从池中获得对象
    public static SignInfo getSignInfo(String key){
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象，则建立，并放入池中
        if(!pool.containsKey(key)){
            result = new SignInfo();
            pool.put(key, result);
        }else{
            result = pool.get(key);
        }
        return result;
    }
}