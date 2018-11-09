package base.visitor.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/28 8:33 PM
 * @Description
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();

    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}