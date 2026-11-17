package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Bjp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2748Bjp {
    public final Handler A00;
    public final C2722Bis A01;
    public final C2511Bch A02;
    public final C2511Bch A03;
    public final Executor A04;
    public final ScheduledExecutorService A05;

    public C2748Bjp(Handler handler, C2722Bis c2722Bis, C2511Bch c2511Bch, C2511Bch c2511Bch2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = executor;
        this.A05 = scheduledExecutorService;
        this.A00 = handler;
        this.A01 = c2722Bis;
        this.A02 = c2511Bch;
        this.A03 = c2511Bch2;
    }
}
