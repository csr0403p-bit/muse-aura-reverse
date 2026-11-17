package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.Bgp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2657Bgp extends BeX {
    public final CameraCaptureSession.CaptureCallback A00;

    public C2657Bgp(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw BV4.A0a("captureCallback is null");
        }
        this.A00 = captureCallback;
    }
}
