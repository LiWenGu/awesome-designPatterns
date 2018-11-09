package base.state.bad;

/**
 * @Author liwenguang
 * @Date 2018/10/25 1:13 AM
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        //电梯的初始条件应该是停止状态
        lift.setState(ILift.STOPPING_STATE);
        //首先是电梯门开启，人进去
        lift.open();
        //然后电梯门关闭
        lift.close();
        //再然后，电梯运行起来，向上或者向下
        lift.run();
        //最后到达目的地，电梯停下来
        lift.stop();
    }
}