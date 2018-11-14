package pk.behavior.observer;

import pk.behavior.chainofresponsibility.Recorder;

public class ChinaTopDnsServer extends DnsServer {

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }
}