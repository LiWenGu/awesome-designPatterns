package base.state.good;

/**
 * @Author liwenguang
 * @Date 2018/10/25 1:39 AM
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}