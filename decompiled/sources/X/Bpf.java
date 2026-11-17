package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public final class Bpf implements Runnable {
    public static final String __redex_internal_original_name = "ChainingListenableFuture$1";
    public final /* synthetic */ Bpe A00;
    public final /* synthetic */ ListenableFuture A01;

    @Override // java.lang.Runnable
    public final void run() {
        Bpe bpe;
        try {
            try {
                bpe = this.A00;
                Object objA02 = AbstractC2942BpW.A02(this.A01);
                C3010Brs<V> c3010Brs = ((C2945Bpd) bpe).A00;
                if (c3010Brs != 0) {
                    c3010Brs.A03(objA02);
                }
            } catch (CancellationException unused) {
                bpe = this.A00;
                bpe.cancel(false);
            } catch (ExecutionException e) {
                bpe = this.A00;
                Throwable cause = e.getCause();
                C3010Brs<V> c3010Brs2 = ((C2945Bpd) bpe).A00;
                if (c3010Brs2 != 0) {
                    c3010Brs2.A04(cause);
                }
            }
            bpe.A04 = null;
        } catch (Throwable th) {
            this.A00.A04 = null;
            throw th;
        }
    }

    public Bpf(Bpe bpe, ListenableFuture listenableFuture) {
        this.A00 = bpe;
        this.A01 = listenableFuture;
    }
}
