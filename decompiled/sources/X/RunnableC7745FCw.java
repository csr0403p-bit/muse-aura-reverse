package X;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.FCw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7745FCw implements Runnable {
    public static final String __redex_internal_original_name = "BackgroundPreparer$LayoutPreparerRunnable";
    public final int A00;
    public final C7746FCx A01;
    public final List<T> A02;
    public final boolean A03;

    public static void A00(FEI<?, ?> fei) {
        Future future;
        synchronized (fei) {
            future = ((C10443Hhq) fei).A00;
        }
        if ((future == null || !future.isCancelled()) && !fei.A01() && fei.A02.get() == -1) {
            fei.A00();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A03) {
            List<T> list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0 || this.A01.A00.get()) {
                    return;
                } else {
                    A00(((C7782FEm) list.get(size)).A00);
                }
            }
        } else {
            int i = 0;
            while (true) {
                List<T> list2 = this.A02;
                if (i >= list2.size() || this.A01.A00.get()) {
                    return;
                }
                A00(((C7782FEm) list2.get(i)).A00);
                i++;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<TT;>;LX/FCx;Z)V */
    public RunnableC7745FCw(C7746FCx c7746FCx, List list, int i, boolean z) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = c7746FCx;
        this.A03 = z;
    }
}
