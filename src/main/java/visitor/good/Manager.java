package visitor.good;

/**
 * @Author liwenguang
 * @Date 2018/10/28 8:24 PM
 * @Description
 */
public class Manager extends Employee {
    //这类人物的职责非常明确：业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    //部门经理允许访问者访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}