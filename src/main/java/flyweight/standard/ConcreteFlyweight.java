package flyweight.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/23 10:59 PM
 * @Description
 */
public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String _Extrinsic) {
        super(_Extrinsic);
    }

    public void operate() {
        // 业务逻辑
    }
}