package pk.create.abstractfactory;

public abstract class AbsBMW implements ICar {

    private final static String BMW_BAND = "宝马汽车";

    // 宝马车
    public String getBand() {
        return BMW_BAND;
    }

    // 型号由具体的实现类实现
    public abstract String getModel();
}
