package base.proxy.ext_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class cls = null;
    // 被代理的实例
    Object obj = null;

    // 我要代理谁
    public GamePlayIH(Object _obj) {
        this.obj = _obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
