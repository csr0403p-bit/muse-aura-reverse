package androidx.camera.camera2.internal.compat.quirk;

import X.BV7;
import X.BX1;
import X.C2476Bc3;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;

/* loaded from: classes5.dex */
public class AeFpsRangeLegacyQuirk implements BX1 {
    public final Range<Integer> A00;

    public AeFpsRangeLegacyQuirk(C2476Bc3 c2476Bc3) {
        int length;
        Range[] rangeArr = (Range[]) c2476Bc3.A02(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr != null && (length = rangeArr.length) != 0) {
            int i = 0;
            do {
                Range range2 = rangeArr[i];
                int iA09 = BV7.A09(range2);
                Range<Integer> range3 = new Range<>(Integer.valueOf(BV7.A0A(range2) >= 1000 ? BV7.A0A(range2) / 1000 : BV7.A0A(range2)), Integer.valueOf(BV7.A09(range2) >= 1000 ? BV7.A09(range2) / 1000 : iA09));
                if (BV7.A09(range3) == 30 && (range == null || BV7.A0A(range3) < BV7.A0A(range))) {
                    range = range3;
                }
                i++;
            } while (i < length);
        }
        this.A00 = range;
    }
}
