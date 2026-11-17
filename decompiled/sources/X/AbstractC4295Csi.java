package X;

/* renamed from: X.Csi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4295Csi {
    public static String A00(C4387Cun c4387Cun, String str) {
        StringBuilder sbA0p = BV4.A0p(32);
        BV7.A1J(sbA0p, str);
        C4387Cun c4387Cun2 = c4387Cun.A00;
        String str2 = "";
        while (c4387Cun2 != null) {
            Object obj = c4387Cun2.A01;
            sbA0p.append(str2);
            String str3 = c4387Cun2.A02;
            if (str3 != null) {
                BV7.A1I(sbA0p, str3);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sbA0p.append(obj);
            } else {
                BV8.A1O(sbA0p, obj);
            }
            c4387Cun2 = c4387Cun2.A00;
            str2 = ", ";
        }
        return C8j3.A15(sbA0p);
    }
}
