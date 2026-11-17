package X;

/* renamed from: X.Ceb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3792Ceb {
    public static String A00(int i, int i2, String str) {
        Object[] objArrA1b;
        String str2;
        if (i < 0) {
            objArrA1b = BV5.A1a(str, i);
            str2 = "%s (%s) must not be negative";
        } else {
            if (i2 < 0) {
                throw BV5.A0Q("negative size: ", i2);
            }
            objArrA1b = BV8.A1b(str, i, i2);
            str2 = "%s (%s) must not be greater than size (%s)";
        }
        return CL1.A00(str2, objArrA1b);
    }

    public static void A01(int i, int i2) {
        Object[] objArrA1a;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArrA1a = BV5.A1a("index", i);
                str = "%s (%s) must not be negative";
            } else {
                if (i2 < 0) {
                    throw BV5.A0Q("negative size: ", i2);
                }
                objArrA1a = BV8.A1b("index", i, i2);
                str = "%s (%s) must be less than size (%s)";
            }
            throw BV6.A0g(CL1.A00(str, objArrA1a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(int r1, int r2, int r3) {
        /*
            if (r1 < 0) goto L7
            if (r2 < r1) goto Lf
            if (r2 > r3) goto Lf
            return
        L7:
            java.lang.String r0 = "start index"
            java.lang.String r0 = A00(r1, r3, r0)
            goto L1f
        Lf:
            if (r1 > r3) goto L7
            if (r2 < 0) goto L24
            if (r2 > r3) goto L24
            java.lang.Object[] r1 = X.BV5.A1Z(r2, r1)
            java.lang.String r0 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r0 = X.CL1.A00(r0, r1)
        L1f:
            java.lang.IndexOutOfBoundsException r0 = X.BV6.A0g(r0)
            throw r0
        L24:
            java.lang.String r0 = "end index"
            java.lang.String r0 = A00(r2, r3, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3792Ceb.A02(int, int, int):void");
    }
}
