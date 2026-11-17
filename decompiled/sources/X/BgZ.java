package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class BgZ {
    public InputConfiguration A01;
    public InterfaceC2641BgM A02;
    public BhS A03;
    public final Set<BhS> A08 = C3cG.A0k();
    public final C2645Bgc A04 = new C2645Bgc();
    public final List<CameraDevice.StateCallback> A05 = C3cG.A0h();
    public final List<CameraCaptureSession.StateCallback> A06 = C3cG.A0h();
    public final List<BeX> A07 = C3cG.A0h();
    public int A00 = 0;
}
