package visitor.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/28 8:42 PM
 * @Description
 */
public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 el1);

    public void visit(ConcreteElement2 el2);

    //统计所有员工工资总和
    public int getTotalSalary();
}