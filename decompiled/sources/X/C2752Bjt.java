package X;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: X.Bjt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2752Bjt extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ BjK A00;

    public C2752Bjt(BjK bjK) {
        this.A00 = bjK;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            this.A00.A00 = ImageWriter.newInstance(inputSurface, 1);
        }
    }
}
