package base.visitor.bad;

/**
 * @Author liwenguang
 * @Date 2018/10/28 8:13 PM
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

    protected String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }
}