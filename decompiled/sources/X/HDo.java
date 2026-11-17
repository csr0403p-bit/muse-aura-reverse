package X;

import android.graphics.ColorSpace;

/* loaded from: classes6.dex */
public abstract class HDo {
    public static final ColorSpace A00(Hw7 hw7) {
        ColorSpace.Named named;
        if (hw7.equals(HDi.A07)) {
            named = ColorSpace.Named.BT2020_HLG;
        } else {
            if (!hw7.equals(HDi.A08)) {
                return null;
            }
            named = ColorSpace.Named.BT2020_PQ;
        }
        return ColorSpace.get(named);
    }
}
