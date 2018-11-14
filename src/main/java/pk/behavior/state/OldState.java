package pk.behavior.state;

public class OldState extends HumanState {

    // 老年人的工作就是享受天伦之乐
    @Override
    public void work() {
        System.out.println("老年人的工作就是享受天伦之乐！");
    }
}
