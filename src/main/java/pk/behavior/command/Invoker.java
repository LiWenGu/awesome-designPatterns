package pk.behavior.command;

public class Invoker {
    // 抽象命令的引用
    private AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    // 执行命令
    public boolean execute(String source, String to) {
        return cmd.execute(source, to);
    }
}
