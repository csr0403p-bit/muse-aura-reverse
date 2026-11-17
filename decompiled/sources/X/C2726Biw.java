package X;

import android.hardware.camera2.CameraCaptureSession;
import java.util.List;

/* renamed from: X.Biw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2726Biw extends AbstractC2756Bjx {
    public final CameraCaptureSession.StateCallback A00;

    public C2726Biw(List<CameraCaptureSession.StateCallback> list) {
        this.A00 = list.isEmpty() ? new C2710Big() : list.size() == 1 ? (CameraCaptureSession.StateCallback) C8j4.A0p(list) : new C2727Bix(list);
    }
}
