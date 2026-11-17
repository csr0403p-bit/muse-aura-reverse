package X;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class BkS implements InterfaceC2768Bke {
    public boolean A00 = false;
    public final Bj5 A01;
    public final BkP A02;
    public final int A03;

    @Override // X.InterfaceC2768Bke
    public final boolean AOE() {
        return AnonymousClass002.A1M(this.A03);
    }

    @Override // X.InterfaceC2768Bke
    public final void AYF() {
        if (this.A00) {
            AbstractC2875Bni.A01("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.A01.A09.A05(false, true);
            this.A02.A00 = false;
        }
    }

    @Override // X.InterfaceC2768Bke
    public final ListenableFuture<Boolean> AYH(TotalCaptureResult totalCaptureResult) {
        if (!C2762BkQ.A02(totalCaptureResult, this.A03)) {
            return new BpQ(AnonymousClass001.A0h());
        }
        AbstractC2875Bni.A01("Camera2CapturePipeline", "Trigger AE");
        this.A00 = true;
        return ExecutorC2446BbZ.A01(C2945Bpd.A00(AbstractC2947Bpi.A01(this, 3)), 0);
    }

    public BkS(Bj5 bj5, BkP bkP, int i) {
        this.A01 = bj5;
        this.A03 = i;
        this.A02 = bkP;
    }
}
