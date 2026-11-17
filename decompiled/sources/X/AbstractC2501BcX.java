package X;

import android.hardware.camera2.CameraCharacteristics;

/* renamed from: X.BcX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2501BcX {
    public static C2507Bcd A00(C2476Bc3 c2476Bc3) {
        Object objA02 = c2476Bc3.A02(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (objA02 != null) {
            return AbstractC2505Bcb.A00.get(objA02);
        }
        return null;
    }
}
