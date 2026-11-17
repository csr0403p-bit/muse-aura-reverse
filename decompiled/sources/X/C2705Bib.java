package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.Bib, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2705Bib extends CameraCaptureSession.CaptureCallback {
    public final BeX A00;

    public C2705Bib(BeX beX) {
        if (beX == null) {
            throw BV4.A0a("cameraCaptureCallback is null");
        }
        this.A00 = beX;
    }

    public static int A00(CaptureRequest captureRequest) {
        Number number;
        if (!(captureRequest.getTag() instanceof BhZ) || (number = (Number) ((BhZ) captureRequest.getTag()).A00.get("CAPTURE_CONFIG_ID_KEY")) == null) {
            return -1;
        }
        return number.intValue();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        BhZ bhZ;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            BeS.A06(tag instanceof BhZ, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            bhZ = (BhZ) tag;
        } else {
            bhZ = BhZ.A01;
        }
        this.A00.A03(new C2858BnD(totalCaptureResult, bhZ), A00(captureRequest));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.A00.A02(new C2792BlO(), A00(captureRequest));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.A00.A01(A00(captureRequest));
    }
}
