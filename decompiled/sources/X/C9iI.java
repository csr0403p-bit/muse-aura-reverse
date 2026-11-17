package X;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* renamed from: X.9iI, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9iI {
    public static final void A00(C9iZ c9iZ, int i, int i2) {
        StringBuilder sbA0f;
        String str;
        C7384Etj.A0Y(c9iZ, 2);
        ArrayList arrayListA0h = C3cG.A0h();
        int i3 = (i ^ (-1)) & i2;
        int i4 = 0;
        do {
            if ((i3 & 1) != 0) {
                arrayListA0h.add(c9iZ.AF5(i4));
            }
            i3 >>>= 1;
            i4++;
        } while (i4 < 32);
        String strAKP = c9iZ.AKP();
        C7384Etj.A0Y(strAKP, 1);
        if (arrayListA0h.size() == 1) {
            sbA0f = C60O.A0x("Field '");
            sbA0f.append((String) arrayListA0h.get(0));
            sbA0f.append("' is required for type with serial name '");
            sbA0f.append(strAKP);
            str = "', but it was missing";
        } else {
            sbA0f = C3cG.A0f(arrayListA0h, "Fields ");
            sbA0f.append(" are required for type with serial name '");
            sbA0f.append(strAKP);
            str = "', but they were missing";
        }
        throw new MissingFieldException(AnonymousClass001.A0v(str, sbA0f), null, arrayListA0h);
    }
}
