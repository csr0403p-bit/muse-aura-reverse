package X;

/* renamed from: X.CqC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4207CqC {
    public static String A00(C4386Cum c4386Cum, String str) {
        StringBuilder sbA0p = BV4.A0p(32);
        BV7.A1J(sbA0p, str);
        C4386Cum c4386Cum2 = c4386Cum.A00;
        String str2 = "";
        while (c4386Cum2 != null) {
            Object obj = c4386Cum2.A01;
            sbA0p.append(str2);
            String str3 = c4386Cum2.A02;
            if (str3 != null) {
                BV7.A1I(sbA0p, str3);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sbA0p.append(obj);
            } else {
                BV8.A1O(sbA0p, obj);
            }
            c4386Cum2 = c4386Cum2.A00;
            str2 = ", ";
        }
        return C8j3.A15(sbA0p);
    }
}
