package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Bpb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2943Bpb implements Runnable {
    public static final String __redex_internal_original_name = "ListFuture$3";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bpa A01;
    public final /* synthetic */ ListenableFuture A02;

    public RunnableC2943Bpb(Bpa bpa, ListenableFuture listenableFuture, int i) {
        this.A01 = bpa;
        this.A00 = i;
        this.A02 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsDone;
        String str;
        Bpa bpa = this.A01;
        int i = this.A00;
        ListenableFuture listenableFuture = this.A02;
        List<V> list = bpa.A02;
        if (bpa.isDone() || list == 0) {
            zIsDone = bpa.A05;
            str = "Future was done before all dependencies completed";
        } else {
            try {
                try {
                    try {
                        BeS.A07(listenableFuture.isDone(), "Tried to set value from future which is not done");
                        list.set(i, AbstractC2942BpW.A02(listenableFuture));
                    } catch (Error e) {
                        bpa.A00.A04(e);
                    } catch (ExecutionException e2) {
                        if (bpa.A05) {
                            bpa.A00.A04(e2.getCause());
                        }
                    }
                } catch (CancellationException unused) {
                    if (bpa.A05) {
                        bpa.cancel(false);
                    }
                } catch (RuntimeException e3) {
                    if (bpa.A05) {
                        bpa.A00.A04(e3);
                    }
                }
                int iDecrementAndGet = bpa.A04.decrementAndGet();
                BeS.A07(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet != 0) {
                    return;
                }
                Collection collection = bpa.A02;
                if (collection != null) {
                    bpa.A00.A03(BV4.A0t(collection));
                    return;
                } else {
                    zIsDone = bpa.isDone();
                    str = null;
                }
            } catch (Throwable th) {
                int iDecrementAndGet2 = bpa.A04.decrementAndGet();
                BeS.A07(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet2 == 0) {
                    Collection collection2 = bpa.A02;
                    if (collection2 == null) {
                        BeS.A07(bpa.isDone(), null);
                        throw th;
                    }
                    bpa.A00.A03(BV4.A0t(collection2));
                }
                throw th;
            }
        }
        BeS.A07(zIsDone, str);
    }
}
