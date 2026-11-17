package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;

/* renamed from: X.BcZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2503BcZ {
    public final InterfaceC2502BcY A00;

    public static C2503BcZ A00(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        BeS.A07(BV5.A1P(Build.VERSION.SDK_INT, 33), "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C2503BcZ(new C2504Bca(dynamicRangeProfiles));
    }

    public static C2503BcZ A01(C2476Bc3 c2476Bc3) {
        C2503BcZ c2503BcZA00;
        return (Build.VERSION.SDK_INT < 33 || (c2503BcZA00 = A00((DynamicRangeProfiles) c2476Bc3.A02(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) == null) ? C2506Bcc.A00 : c2503BcZA00;
    }

    public final DynamicRangeProfiles A02() {
        BeS.A07(BV5.A1P(Build.VERSION.SDK_INT, 33), "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.A00.Aho();
    }

    public C2503BcZ(InterfaceC2502BcY interfaceC2502BcY) {
        this.A00 = interfaceC2502BcY;
    }
}
