package X;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: X.Biq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2720Biq extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C2715Bil A00;

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C3010Brs<Void> c3010Brs;
        try {
            C2715Bil c2715Bil = this.A00;
            c2715Bil.A0B(cameraCaptureSession);
            c2715Bil.A07(c2715Bil);
            synchronized (c2715Bil.A0H) {
                BeS.A03(c2715Bil.A02, "OpenCaptureSession completer should not null");
                c3010Brs = c2715Bil.A02;
                c2715Bil.A02 = null;
            }
            c3010Brs.A04(C3cG.A0Q("onConfigureFailed"));
        } catch (Throwable th) {
            C2715Bil c2715Bil2 = this.A00;
            synchronized (c2715Bil2.A0H) {
                BeS.A03(c2715Bil2.A02, "OpenCaptureSession completer should not null");
                C3010Brs<Void> c3010Brs2 = c2715Bil2.A02;
                c2715Bil2.A02 = null;
                c3010Brs2.A04(C3cG.A0Q("onConfigureFailed"));
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C3010Brs<Void> c3010Brs;
        try {
            C2715Bil c2715Bil = this.A00;
            c2715Bil.A0B(cameraCaptureSession);
            c2715Bil.A08(c2715Bil);
            synchronized (c2715Bil.A0H) {
                BeS.A03(c2715Bil.A02, "OpenCaptureSession completer should not null");
                c3010Brs = c2715Bil.A02;
                c2715Bil.A02 = null;
            }
            c3010Brs.A03(null);
        } catch (Throwable th) {
            C2715Bil c2715Bil2 = this.A00;
            synchronized (c2715Bil2.A0H) {
                BeS.A03(c2715Bil2.A02, "OpenCaptureSession completer should not null");
                C3010Brs<Void> c3010Brs2 = c2715Bil2.A02;
                c2715Bil2.A02 = null;
                c3010Brs2.A03(null);
                throw th;
            }
        }
    }

    public C2720Biq(C2715Bil c2715Bil) {
        this.A00 = c2715Bil;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        C2715Bil c2715Bil = this.A00;
        c2715Bil.A0B(cameraCaptureSession);
        c2715Bil.A04(c2715Bil);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        C2715Bil c2715Bil = this.A00;
        c2715Bil.A0B(cameraCaptureSession);
        c2715Bil.A05(c2715Bil);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        C2715Bil c2715Bil = this.A00;
        c2715Bil.A0B(cameraCaptureSession);
        c2715Bil.A06(c2715Bil);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        C2715Bil c2715Bil = this.A00;
        c2715Bil.A0B(cameraCaptureSession);
        c2715Bil.A09(c2715Bil);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        C2715Bil c2715Bil = this.A00;
        c2715Bil.A0B(cameraCaptureSession);
        c2715Bil.A03(surface, c2715Bil);
    }
}
