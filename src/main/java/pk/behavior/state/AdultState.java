package pk.behavior.state;

public class AdultState extends HumanState {

    // 成年人的工作就是先养活自己，然后为社会做贡献
    @Override
    public void work() {
        System.out.println("成年人的工作就是先养活自己，然后为社会做贡献！");
        super.human.setState(Human.OLD_STATE);
    }
}
