package pk.create.factory;

public class Client {
    // 模拟生产超人
    public static void main(String[] args) {
        // 生产一个成年超人
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
        // 展示一下超人的技能
        adultSuperMan.specialTalent();
    }
}