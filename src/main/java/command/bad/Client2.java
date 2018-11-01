package command.bad;

public class Client2 {
    public static void main(String[] args) {
        // 首先客户找到美工组说，过来谈页面，并修改
        System.out.println("----------客户要求删除一个页面--------------");
        Group pg = new PageGroup();
        // 找到需求组
        pg.find();
        // 删除一项需求
        pg.delete();
        // 要求变更计划
        pg.plan();
    }
}
