package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.BQG;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class PairsTextKt {
    public static final int FORMAT_CHAR = 16;

    public static final String peerDisplayText(String str, int i) {
        C7384Etj.A0Y(str, 0);
        StringBuilder sbA0w = C60O.A0w();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!Character.isISOControl(cCharAt) && Character.getType(cCharAt) != 16) {
                sbA0w.append(cCharAt);
            }
        }
        return C60O.A0q(BQG.A17(AnonymousClass002.A0l(sbA0w.toString()), i));
    }
}
