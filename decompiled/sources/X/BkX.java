package X;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class BkX implements BlF {
    public C3010Brs<TotalCaptureResult> A00;
    public final ListenableFuture<TotalCaptureResult> A01 = AbstractC2947Bpi.A01(this, 5);
    public final InterfaceC2790BlI A02;

    @Override // X.BlF
    public final boolean ASA(TotalCaptureResult totalCaptureResult) {
        InterfaceC2790BlI interfaceC2790BlI = this.A02;
        if (interfaceC2790BlI != null && !interfaceC2790BlI.A69(totalCaptureResult)) {
            return false;
        }
        this.A00.A03(totalCaptureResult);
        return true;
    }

    public BkX(InterfaceC2790BlI interfaceC2790BlI) {
        this.A02 = interfaceC2790BlI;
    }
}
