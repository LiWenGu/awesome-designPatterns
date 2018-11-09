package base.visitor.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/28 8:42 PM
 * @Description
 */

public class ConcreteElement2 extends Element{
    //完善业务逻辑
    public void doSomething(){
        //业务处理
    }
    //允许那个访问者访问
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}