package X;

import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: classes4.dex */
public abstract class AvL {
    public static final void A00(CursorAnchorInfo.Builder builder, AaC aaC, C1958Aux c1958Aux) {
        if (aaC.A05()) {
            return;
        }
        C1956Auv c1956Auv = c1958Aux.A03;
        int i = c1956Auv.A02 - 1;
        if (i < 0) {
            i = 0;
        }
        int iA08 = c1956Auv.A08(aaC.A03);
        if (iA08 < 0) {
            iA08 = 0;
        } else if (iA08 > i) {
            iA08 = i;
        }
        int iA082 = c1956Auv.A08(aaC.A00);
        if (iA082 < 0) {
            iA082 = 0;
        } else if (iA082 > i) {
            iA082 = i;
        }
        if (iA08 > iA082) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c1958Aux.A00(iA08), c1956Auv.A07(iA08), c1958Aux.A01(iA08), c1956Auv.A06(iA08));
            if (iA08 == iA082) {
                return;
            } else {
                iA08++;
            }
        }
    }
}
