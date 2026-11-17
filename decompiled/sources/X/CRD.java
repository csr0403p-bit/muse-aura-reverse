package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class CRD implements Runnable {
    public static final String __redex_internal_original_name = "b";
    public final CR8 A00;
    public final ListenableFuture A01;

    @Override // java.lang.Runnable
    public final void run() {
        CR8 cr8 = this.A00;
        if (cr8.a == this) {
            if (CR9.A00.A05(cr8, this, CR8.A00(this.A01))) {
                CR8.A02(cr8, false);
            }
        }
    }

    public CRD(CR8 cr8, ListenableFuture listenableFuture) {
        this.A00 = cr8;
        this.A01 = listenableFuture;
    }
}
