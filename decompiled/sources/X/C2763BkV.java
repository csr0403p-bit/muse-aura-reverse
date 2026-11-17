package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.BkV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2763BkV implements InterfaceC2768Bke {
    public boolean A00 = false;
    public final Bj5 A01;

    @Override // X.InterfaceC2768Bke
    public final ListenableFuture<Boolean> AYH(TotalCaptureResult totalCaptureResult) {
        Number numberA0i;
        int iIntValue;
        BpQ bpQ = new BpQ(true);
        if (totalCaptureResult != null && (numberA0i = BV6.A0i(CaptureResult.CONTROL_AF_MODE, totalCaptureResult)) != null && ((iIntValue = numberA0i.intValue()) == 1 || iIntValue == 2)) {
            AbstractC2875Bni.A01("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Number numberA0i2 = BV6.A0i(CaptureResult.CONTROL_AF_STATE, totalCaptureResult);
            if (numberA0i2 != null && numberA0i2.intValue() == 0) {
                AbstractC2875Bni.A01("Camera2CapturePipeline", "Trigger AF");
                this.A00 = true;
                this.A01.A09.A04(false);
                return bpQ;
            }
        }
        return bpQ;
    }

    @Override // X.InterfaceC2768Bke
    public final boolean AOE() {
        return true;
    }

    @Override // X.InterfaceC2768Bke
    public final void AYF() {
        if (this.A00) {
            AbstractC2875Bni.A01("Camera2CapturePipeline", "cancel TriggerAF");
            this.A01.A09.A05(true, false);
        }
    }

    public C2763BkV(Bj5 bj5) {
        this.A01 = bj5;
    }
}
