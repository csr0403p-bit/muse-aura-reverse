package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class Dq5 implements Runnable {
    public static final String __redex_internal_original_name = "VideoPlayerSessionLogger$reportVideoLoggingEvents$runnable$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5700Dnh A01;
    public final /* synthetic */ List<E1D> A02;

    public Dq5(C5700Dnh c5700Dnh, List<E1D> list, long j) {
        this.A01 = c5700Dnh;
        this.A02 = list;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5700Dnh c5700Dnh = this.A01;
        c5700Dnh.videoLoggerHandler.Ab6(this.A02, c5700Dnh.A00, this.A00);
    }
}
