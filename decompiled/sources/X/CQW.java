package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class CQW<V> implements Runnable {
    public static final String __redex_internal_original_name = "AbstractFuture$SetFuture";
    public final CQU<V> A00;
    public final ListenableFuture<? extends V> A01;

    @Override // java.lang.Runnable
    public final void run() {
        CQU<V> cqu = this.A00;
        boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
        if (cqu.value == this) {
            if (CQU.ATOMIC_HELPER.A06(cqu, this, CQU.getFutureValue(this.A01))) {
                CQU.complete(cqu, false);
            }
        }
    }

    public CQW(CQU<V> owner, ListenableFuture<? extends V> future) {
        this.A00 = owner;
        this.A01 = future;
    }
}
