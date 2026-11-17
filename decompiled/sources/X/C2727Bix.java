package X;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bix, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2727Bix extends CameraCaptureSession.StateCallback {
    public final List<CameraCaptureSession.StateCallback> A00 = C3cG.A0h();

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onActive(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onClosed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onConfigureFailed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onConfigured(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onReady(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        Iterator<CameraCaptureSession.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    public C2727Bix(List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof C2710Big)) {
                this.A00.add(stateCallback);
            }
        }
    }
}
