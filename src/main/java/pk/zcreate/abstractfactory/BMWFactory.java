package pk.zcreate.abstractfactory;

public class BMWFactory implements CarFactory {

    // 生产SUV
    public ICar createSuv() {
        return new BMWSuv();
    }

    // 生产商务车
    public ICar createVan() {
        return new BMWVan();
    }
}
