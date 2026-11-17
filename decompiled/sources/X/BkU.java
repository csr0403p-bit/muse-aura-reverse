package X;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class BkU implements InterfaceC2768Bke {
    public boolean A00 = false;
    public final Bj5 A01;
    public final ScheduledExecutorService A02;
    public final boolean A03;
    public final int A04;
    public final Executor A05;

    @Override // X.InterfaceC2768Bke
    public final boolean AOE() {
        return AnonymousClass002.A1M(this.A04);
    }

    @Override // X.InterfaceC2768Bke
    public final void AYF() {
        if (this.A00) {
            Bj5 bj5 = this.A01;
            bj5.A0A.A00(null, false);
            AbstractC2875Bni.A01("Camera2CapturePipeline", "Turning off torch");
            if (this.A03) {
                bj5.A09.A05(false, true);
            }
        }
    }

    @Override // X.InterfaceC2768Bke
    public final ListenableFuture<Boolean> AYH(TotalCaptureResult totalCaptureResult) {
        int i = this.A04;
        AbstractC2875Bni.A01("Camera2CapturePipeline", FGI.A0r("TorchTask#preCapture: isFlashRequired = ", C2762BkQ.A02(totalCaptureResult, i)));
        if (C2762BkQ.A02(totalCaptureResult, i)) {
            if (!this.A01.A0N) {
                AbstractC2875Bni.A01("Camera2CapturePipeline", "Turn on torch");
                this.A00 = true;
                C2945Bpd c2945BpdA00 = C2945Bpd.A00(AbstractC2947Bpi.A01(this, 8));
                F4M f4m = new F4M(this, 5);
                Executor executor = this.A05;
                return ExecutorC2446BbZ.A01(Bpe.A01(new F4M(this, 6), Bpe.A01(f4m, c2945BpdA00, executor), executor), 4);
            }
            AbstractC2875Bni.A01("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return new BpQ(AnonymousClass001.A0h());
    }

    public BkU(Bj5 bj5, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, boolean z) {
        this.A01 = bj5;
        this.A04 = i;
        this.A05 = executor;
        this.A02 = scheduledExecutorService;
        this.A03 = z;
    }
}
