package X;

import android.hardware.camera2.TotalCaptureResult;
import com.facebook.aura.partners.voice.viewmodel.RtcPreviewPlayoutKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class BkR {
    public final int A01;
    public final Bj5 A02;
    public final BkP A04;
    public final Executor A06;
    public final ScheduledExecutorService A07;
    public final boolean A08;
    public long A00 = 1000000000;
    public final List<InterfaceC2768Bke> A05 = C3cG.A0h();
    public final InterfaceC2768Bke A03 = new BkT(this);

    public final ListenableFuture<TotalCaptureResult> A00(final int i) {
        ListenableFuture listenableFuture = BpQ.A01;
        if (this.A05.isEmpty()) {
            return listenableFuture;
        }
        if (this.A03.AOE()) {
            Bj5 bj5 = this.A02;
            BkX bkX = new BkX(null);
            bj5.A06.A00.add(bkX);
            listenableFuture = bkX.A01;
            listenableFuture.addListener(new BkZ(bj5, bkX), bj5.A0I);
        }
        C2945Bpd c2945BpdA00 = C2945Bpd.A00(listenableFuture);
        InterfaceC2939BpT interfaceC2939BpT = new InterfaceC2939BpT() { // from class: X.BkY
            @Override // X.InterfaceC2939BpT
            public final ListenableFuture A4O(Object obj) {
                BkR bkR = this.A01;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                if (C2762BkQ.A02(totalCaptureResult, i)) {
                    bkR.A00 = RtcPreviewPlayoutKt.STALL_TIMEOUT_NANOS;
                }
                return bkR.A03.AYH(totalCaptureResult);
            }
        };
        Executor executor = this.A06;
        return Bpe.A01(new F4M(this, 0), Bpe.A01(interfaceC2939BpT, c2945BpdA00, executor), executor);
    }

    public BkR(Bj5 bj5, BkP bkP, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, boolean z) {
        this.A01 = i;
        this.A06 = executor;
        this.A07 = scheduledExecutorService;
        this.A02 = bj5;
        this.A08 = z;
        this.A04 = bkP;
    }
}
