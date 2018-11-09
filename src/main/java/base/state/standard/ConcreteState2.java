package base.state.standard;

/**
 * @Author liwenguang
 * @Date 2018/10/25 1:44 AM
 * @Description
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        //过渡到state1状态，由Context实现
        super.context.handle1();
    }

    @Override
    public void handle2() {
        //本状态下必须处理的逻辑
    }
}