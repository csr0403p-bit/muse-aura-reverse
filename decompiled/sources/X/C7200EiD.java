package X;

import java.util.Arrays;

/* renamed from: X.EiD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7200EiD {
    public C7262Ejm A00;
    public final C7262Ejm A01;
    public final String A02;

    public static void A00(C7200EiD c7200EiD, Object obj, String str) {
        C7262Ejm c7262Ejm = new C7262Ejm();
        c7200EiD.A00.A00 = c7262Ejm;
        c7200EiD.A00 = c7262Ejm;
        c7262Ejm.A01 = obj;
        c7262Ejm.A02 = str;
    }

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(32);
        BV7.A1J(sbA0p, this.A02);
        String str = "";
        for (C7262Ejm c7262Ejm = this.A01.A00; c7262Ejm != null; c7262Ejm = c7262Ejm.A00) {
            Object obj = c7262Ejm.A01;
            sbA0p.append(str);
            if (c7262Ejm.A02 != null) {
                BV7.A1I(sbA0p, c7262Ejm.A02);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sbA0p.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sbA0p.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            str = ", ";
        }
        return C8j3.A15(sbA0p);
    }

    public C7200EiD(String str) {
        C7262Ejm c7262Ejm = new C7262Ejm();
        this.A01 = c7262Ejm;
        this.A00 = c7262Ejm;
        str.getClass();
        this.A02 = str;
    }

    public static void A01(C7200EiD c7200EiD, String str, int i) {
        A00(c7200EiD, String.valueOf(i), str);
    }

    public final void A02(String str, boolean z) {
        A00(this, String.valueOf(z), str);
    }
}
