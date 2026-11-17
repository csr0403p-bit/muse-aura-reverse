package X;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class Hu0 {
    public static final Executor A00(GBK gbk) {
        AbstractC9259GBm abstractC9259GBm;
        Executor executor;
        return (!(gbk instanceof AbstractC9259GBm) || (abstractC9259GBm = (AbstractC9259GBm) gbk) == null || (executor = abstractC9259GBm.getExecutor()) == null) ? new ExecutorC10537Hqk(gbk) : executor;
    }

    public static final GBK A01(Executor executor) {
        ExecutorC10537Hqk executorC10537Hqk;
        GBK gbk;
        return (!(executor instanceof ExecutorC10537Hqk) || (executorC10537Hqk = (ExecutorC10537Hqk) executor) == null || (gbk = executorC10537Hqk.A00) == null) ? new Hy1(executor) : gbk;
    }
}
