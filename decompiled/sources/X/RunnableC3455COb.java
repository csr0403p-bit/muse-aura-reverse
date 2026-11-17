package X;

import java.io.File;

/* renamed from: X.COb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3455COb implements Runnable {
    public static final String __redex_internal_original_name = "TraceListenerNotifier$1";
    public final /* synthetic */ C3454COa A00;

    public RunnableC3455COb(C3454COa c3454COa) {
        this.A00 = c3454COa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3454COa c3454COa = this.A00;
        File file = C3454COa.A03;
        synchronized (c3454COa.A01) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                BV4.A1A();
            }
            c3454COa.A00();
        }
    }
}
