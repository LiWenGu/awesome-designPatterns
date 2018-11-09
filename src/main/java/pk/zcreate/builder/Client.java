package pk.zcreate.builder;

public class Client {
    public static void main(String[] args) {
        // 建造一个成年超人
        SuperMan adultSuperMan = Director.getAdultSuperMan();
        // 展示一下超人的信息
        adultSuperMan.getSpecialTalent();
    }
}
