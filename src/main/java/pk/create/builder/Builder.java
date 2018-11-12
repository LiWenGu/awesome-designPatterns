package pk.create.builder;

public abstract class Builder {
    // 定义一个超人的应用
    protected final SuperMan superMan = new SuperMan();

    // 构建出超人的躯体
    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    // 构建出超人的特殊技能
    public void setSpecialTalent(String st) {
        this.superMan.setSpecialTalent(st);
    }

    // 构建出超人的特殊标记
    public void setSpecialSymbol(String ss) {
        this.superMan.setSpecialSymbol(ss);
    }

    // 构建出一个完整的超人
    public abstract SuperMan getSuperMan();
}
