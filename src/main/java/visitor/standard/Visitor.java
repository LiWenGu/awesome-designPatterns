package visitor.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/28 8:44 PM
 * @Description
 */
public class Visitor implements IVisitor {
    //访问el1元素
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    //访问el2元素
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }

    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //计算部门经理的工资总和
    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary
                * MANAGER_COEFFICIENT;
    }

    //计算普通员工的工资总和
    private void calCommonSlary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary +
                salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    //获得所有员工的工资总和
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}