package state.bad;

/**
 * @Author liwenguang
 * @Date 2018/10/25 1:09 AM
 * @Description
 */
public class Lift implements ILift {
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    //电梯门关闭
    public void close() {
        //电梯在什么状态下才能关闭
        switch (this.state) {
            case OPENING_STATE: //可以关门，同时修改电梯状态
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE: //电梯是关门状态，则什么都不做
                //do nothing;
                break;
            case RUNNING_STATE: //正在运行，门本来就是关闭的，也什么都不做
                //do nothing;
                break;
            case STOPPING_STATE: //停止状态，门也是关闭的，什么也不做
                //do nothing;
                break;
        }
    }

    //电梯门开启
    public void open() {
        //电梯在什么状态才能开启
        switch (this.state) {
            case OPENING_STATE: //闭门状态，什么都不做
                //do nothing;
                break;
            case CLOSING_STATE: //闭门状态，则可以开启
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE: //运行状态，则不能开门，什么都不做
                //do nothing;
                break;
            case STOPPING_STATE: //停止状态，当然要开门了
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }


    //电梯开始运行起来
    public void run() {
        switch (this.state) {
            case OPENING_STATE: //敞门状态，什么都不做
                //do nothing;
                break;
            case CLOSING_STATE: //闭门状态，则可以运行
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE: //运行状态，则什么都不做
                //do nothing;
                break;
            case STOPPING_STATE: //停止状态，可以运行
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
        }
    }

    //电梯停止
    public void stop() {
        switch (this.state) {
            case OPENING_STATE: //敞门状态，要先停下来的，什么都不做
                //do nothing;
                break;
            case CLOSING_STATE: //闭门状态，则当然可以停止了
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE: //运行状态，有运行当然那也就有停止了
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPING_STATE: //停止状态，什么都不做
                //do nothing;
                break;
        }
    }

    //纯粹的电梯关门，不考虑实际的逻辑
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    //纯粹的电梯开门，不考虑任何条件
    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }

    //纯粹的运行，不考虑其他条件
    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来...");
    }

    //单纯的停止，不考虑其他条件
    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}