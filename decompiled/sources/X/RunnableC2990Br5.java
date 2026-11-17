package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Br5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2990Br5<T> implements Runnable {
    public static final String __redex_internal_original_name = "ToContinuation";
    public final ListenableFuture<T> A00;
    public final Hm1<T> A01;

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<T> listenableFuture = this.A00;
        boolean zIsCancelled = listenableFuture.isCancelled();
        Hm1<T> hm1 = this.A01;
        if (zIsCancelled) {
            hm1.A5x(null);
            return;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    T t = listenableFuture.get();
                    BV7.A1N(z);
                    hm1.resumeWith(t);
                    return;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    BV7.A1N(z);
                    throw th;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                C7384Etj.A0X(cause);
                BV7.A1K(cause, hm1);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC2990Br5(ListenableFuture<T> listenableFuture, Hm1<? super T> hm1) {
        this.A00 = listenableFuture;
        this.A01 = hm1;
    }
}
