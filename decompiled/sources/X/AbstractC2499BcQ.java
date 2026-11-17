package X;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;

/* renamed from: X.BcQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2499BcQ {
    public static boolean A00(C2538BdP c2538BdP, String str) throws InitializationException {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            try {
                int[] iArr = (int[]) c2538BdP.A00(str).A02(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    for (int i : iArr) {
                        if (i != 0) {
                        }
                    }
                }
                return false;
            } catch (CameraAccessExceptionCompat e) {
                throw new InitializationException(AbstractC2494BcL.A00(e));
            }
        }
        return true;
    }
}
