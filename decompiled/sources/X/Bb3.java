package X;

import android.util.Size;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class Bb3 {
    public static Integer A02(int i) {
        return i == 35 ? C79.A01 : i == 256 ? C79.A0C : i == 4101 ? C79.A0K : i == 32 ? C79.A0P : C79.A00;
    }

    public static C2410BaQ A01(Size size, Bb5 bb5, int i) {
        Integer numA02 = A02(i);
        EnumC2408BaN enumC2408BaN = EnumC2408BaN.NOT_SUPPORT;
        Size size2 = AbstractC2484BcB.A00;
        int iA0B = BV7.A0B(size);
        Bb4 bb4 = (Bb4) bb5;
        if (iA0B <= BV7.A0B(bb4.A00)) {
            enumC2408BaN = EnumC2408BaN.VGA;
        } else if (iA0B <= BV7.A0B(bb4.A01)) {
            enumC2408BaN = EnumC2408BaN.PREVIEW;
        } else if (iA0B <= BV7.A0B(bb4.A02)) {
            enumC2408BaN = EnumC2408BaN.RECORD;
        } else {
            Map<Integer, Size> map = bb4.A03;
            Integer numValueOf = Integer.valueOf(i);
            if (iA0B <= BV7.A0B(map.get(numValueOf))) {
                enumC2408BaN = EnumC2408BaN.MAXIMUM;
            } else {
                Size size3 = bb4.A06.get(numValueOf);
                if (size3 != null && iA0B <= BV7.A0B(size3)) {
                    enumC2408BaN = EnumC2408BaN.ULTRA_MAXIMUM;
                }
            }
        }
        return new C2410BaQ(enumC2408BaN, numA02, 0L);
    }
}
