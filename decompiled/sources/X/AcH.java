package X;

import androidx.compose.foundation.gestures.ScrollableKt;

/* loaded from: classes4.dex */
public abstract class AcH {
    public static final AcI A00(BFM bfm) {
        C1YC c1ycA00 = AZn.A00(bfm);
        boolean zA65 = bfm.A65(c1ycA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AcI(c1ycA00, ScrollableKt.A01);
            BBI.A0T(bfm, objAaT);
        }
        return (AcI) objAaT;
    }
}
