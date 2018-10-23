package flyweight.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/23 10:43 PM
 * @Description
 */
public abstract class Flyweight {

    // 内部状态
    private String intrinsic;
    // 外部状态
    private final String Extrinsic;

    public Flyweight(String _Extrinsic) {
        this.Extrinsic = _Extrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}