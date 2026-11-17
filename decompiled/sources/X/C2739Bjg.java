package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Bjg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2739Bjg extends CameraCaptureSession.CaptureCallback {
    public final Set<BlF> A00 = C60O.A13();
    public final Executor A01;

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.A01.execute(new Runnable() { // from class: X.Bjh
            public static final String __redex_internal_original_name = "Camera2CameraControlImpl$CameraControlSessionCallback$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C2739Bjg c2739Bjg = this;
                TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
                HashSet hashSetA13 = C60O.A13();
                Set<BlF> set = c2739Bjg.A00;
                for (BlF blF : set) {
                    if (blF.ASA(totalCaptureResult2)) {
                        hashSetA13.add(blF);
                    }
                }
                if (hashSetA13.isEmpty()) {
                    return;
                }
                set.removeAll(hashSetA13);
            }
        });
    }

    public C2739Bjg(Executor executor) {
        this.A01 = executor;
    }
}
