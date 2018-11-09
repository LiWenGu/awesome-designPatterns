package pk.zcreate.abstractfactory;

public interface CarFactory {
    // 生产SUV
    public ICar createSuv();

    // 生产商务车
    public ICar createVan();
}
