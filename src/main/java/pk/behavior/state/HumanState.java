package pk.behavior.state;

public abstract class HumanState {
    //指向一个具体的人
    protected Human human;

    //设置一个具体的人
    public void setHuman(Human _human) {
        this.human = _human;
    }

    //不管人是什么状态都要工作
    public abstract void work();
}
