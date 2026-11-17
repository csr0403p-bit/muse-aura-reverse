package X;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* renamed from: X.BcL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2494BcL {
    public static CameraUnavailableException A00(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int i = cameraAccessExceptionCompat.mReason;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            i2 = 6;
                            if (i != 10001) {
                                i2 = 0;
                            }
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i2, cameraAccessExceptionCompat);
    }
}
