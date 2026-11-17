package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.EKj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6616EKj implements ENP {
    public final ExecutorC6622EKr A01;
    public final GBK A03;
    public final GBK A04;
    public final C3UX A05;
    public final Handler A00 = C60O.A02();
    public final Executor A02 = new F53(this, 1);

    public C6616EKj(Executor backgroundExecutor) {
        ExecutorC6622EKr executorC6622EKr = new ExecutorC6622EKr(backgroundExecutor);
        this.A01 = executorC6622EKr;
        Hy1 hy1 = new Hy1(executorC6622EKr);
        this.A04 = hy1;
        this.A03 = new Hy1(new ExecutorC6622EKr(backgroundExecutor));
        this.A05 = Hxb.A02(hy1);
    }
}
