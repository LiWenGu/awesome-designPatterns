package base.memento.bad;

public class Boy {
    //男孩的状态
    private String state = "";

    //认识女孩子后状态肯定改变，比如心情、手中的花等
    public void changeState() {
        this.state = "心情可能很不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
