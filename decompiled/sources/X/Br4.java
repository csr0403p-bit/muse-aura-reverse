package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public final class Br4<T> implements Runnable {
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
        try {
            hm1.resumeWith(CQV.A01(listenableFuture));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C7384Etj.A0X(cause);
            BV7.A1K(cause, hm1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Br4(ListenableFuture<T> listenableFuture, Hm1<? super T> hm1) {
        this.A00 = listenableFuture;
        this.A01 = hm1;
    }
}
