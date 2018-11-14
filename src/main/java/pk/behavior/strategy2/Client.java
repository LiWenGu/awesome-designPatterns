package pk.behavior.strategy2;

public class Client {
    public static void main(String[] args) {
        // 定义一个环境角色
        Context context = new Context();
        System.out.println("====儿童的主要工作=====");
        context.setWork(new ChildWork());
        context.work();
        System.out.println("\n====成年人的主要工作=====");
        context.setWork(new AdultWork());
        context.work();
        System.out.println("\n====老年人的主要工作=====");
        context.setWork(new OldWork());
        context.work();
    }
}

