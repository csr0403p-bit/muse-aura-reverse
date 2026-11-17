package X;

import java.util.ArrayList;

/* renamed from: X.F8z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7657F8z {
    public static F90 A00(F94 f94) {
        F90 f90 = new F90();
        if (f94.AXl() != C79.A0C) {
            f94.Afp();
            return null;
        }
        while (f94.ARK() != C79.A0K) {
            String strAXk = f94.AXk();
            boolean zA1P = BV5.A1P(FBK.A00(strAXk), 32);
            f94.ARK();
            if (!zA1P && "components".equals(strAXk)) {
                ArrayList arrayListA0h = null;
                if (f94.AXl() == C79.A00) {
                    arrayListA0h = C3cG.A0h();
                    while (f94.ARK() != C79.A01) {
                        C7616F6s c7616F6sA00 = AbstractC7656F8y.A00(null, f94, null);
                        if (c7616F6sA00 != null) {
                            arrayListA0h.add(c7616F6sA00);
                        }
                    }
                }
                f90.A00 = arrayListA0h;
            }
            f94.Afp();
        }
        return f90;
    }
}
