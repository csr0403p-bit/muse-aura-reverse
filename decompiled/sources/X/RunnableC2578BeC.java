package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.BeC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2578BeC<T> implements Runnable {
    public static final String __redex_internal_original_name = "RequestExecutor$ReplyRunnable";
    public Handler A00;
    public BeM<T> A01;
    public Callable<T> A02;

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        T tCall;
        try {
            tCall = this.A02.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.A00.post(new RunnableC2472Bbz(this, this.A01, tCall));
    }
}
