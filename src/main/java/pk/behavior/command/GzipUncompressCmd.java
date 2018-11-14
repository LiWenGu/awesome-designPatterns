package pk.behavior.command;

public class GzipUncompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.gzip.uncompress(source, to);
    }
}
