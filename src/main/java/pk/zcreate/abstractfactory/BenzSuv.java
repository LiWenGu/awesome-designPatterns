package pk.zcreate.abstractfactory;

public class BenzSuv extends AbsBenz {
    private final static String G_SERIES = "G系列SUV";

    @Override
    public String getModel() {
        return G_SERIES;
    }
}
