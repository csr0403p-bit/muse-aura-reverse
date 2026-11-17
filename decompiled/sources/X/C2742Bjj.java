package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

/* renamed from: X.Bjj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2742Bjj extends CameraManager.AvailabilityCallback implements InterfaceC2801Bld {
    public boolean A00 = true;
    public final String A01;
    public final /* synthetic */ Bj4 A02;

    public C2742Bjj(Bj4 bj4, String str) {
        this.A02 = bj4;
        this.A01 = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) throws CameraAccessException {
        if (this.A01.equals(str)) {
            this.A00 = true;
            Bj4 bj4 = this.A02;
            if (bj4.A0a == C79.A0K) {
                bj4.A0J(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.A01.equals(str)) {
            this.A00 = false;
        }
    }
}
