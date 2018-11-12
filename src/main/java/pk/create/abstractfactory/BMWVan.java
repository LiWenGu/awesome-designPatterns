package pk.create.abstractfactory;

public class BMWVan extends AbsBMW {

    private final static String SEVENT_SEARIES = "7系列车型商务车";

    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
