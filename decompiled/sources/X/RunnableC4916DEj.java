package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.DEj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4916DEj implements Runnable {
    public static final String __redex_internal_original_name = "VideoInFlightRequestListener$emit$1";
    public final /* synthetic */ C4914DEh A00;
    public final /* synthetic */ C4915DEi A01;

    public RunnableC4916DEj(C4914DEh c4914DEh, C4915DEi c4915DEi) {
        this.A00 = c4914DEh;
        this.A01 = c4915DEi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C4914DEh c4914DEh = this.A00;
            F0C<ExecutorService> f0c = C4914DEh.A0C;
            c4914DEh.A05.A5s(this.A01);
        } catch (Throwable th) {
            F0C<ExecutorService> f0c2 = C4914DEh.A0C;
            CFK.A0A("VideoInFlightRequestListener", "Dropped an in-flight diagnostic event", th);
        }
    }
}
