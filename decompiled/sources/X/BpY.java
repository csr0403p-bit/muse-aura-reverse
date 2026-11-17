package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class BpY implements Runnable {
    public static final String __redex_internal_original_name = "Futures$4";
    public final /* synthetic */ ListenableFuture A00;

    public BpY(ListenableFuture listenableFuture) {
        this.A00 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.cancel(true);
    }
}
