package X;

import java.util.List;

/* renamed from: X.C0q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3165C0q implements Runnable {
    public static final String __redex_internal_original_name = "ServiceListenerWrapper$flushRunnable$1";
    public final /* synthetic */ C3164C0p A00;

    public RunnableC3165C0q(C3164C0p c3164C0p) {
        this.A00 = c3164C0p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3166C0r c3166C0r;
        try {
            C3164C0p c3164C0p = this.A00;
            List<BYO> list = c3164C0p.A01;
            if (!list.isEmpty()) {
                synchronized (list) {
                    c3166C0r = new C3166C0r(list);
                    list.clear();
                }
                c3164C0p.A00.A00.A0H.A5s(c3166C0r);
            }
            C3164C0p.A00(c3164C0p);
        } catch (Throwable th) {
            C3164C0p.A00(this.A00);
            throw th;
        }
    }
}
