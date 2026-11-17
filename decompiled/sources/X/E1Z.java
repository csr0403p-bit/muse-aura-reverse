package X;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class E1Z {
    public final E1P A00 = BV6.A0X();
    public final StringBuilder A01 = C60O.A0w();
    public static final Pattern A03 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern A02 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX WARN: Removed duplicated region for block: B:32:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(X.E1P r6, java.lang.StringBuilder r7) {
        /*
            r5 = 0
            r7.setLength(r5)
            int r4 = r6.A01
            r3 = r4
            int r2 = r6.A00
        L9:
            if (r3 >= r2) goto L42
            if (r5 != 0) goto L42
            byte[] r0 = r6.A02
            r0 = r0[r3]
            char r1 = (char) r0
            r0 = 65
            if (r1 < r0) goto L24
            r0 = 90
            if (r1 <= r0) goto L3c
            r0 = 97
            if (r1 < r0) goto L38
            r0 = 122(0x7a, float:1.71E-43)
        L20:
            if (r1 <= r0) goto L3c
        L22:
            r5 = 1
            goto L9
        L24:
            r0 = 48
            if (r1 < r0) goto L2b
            r0 = 57
            goto L20
        L2b:
            r0 = 35
            if (r1 == r0) goto L3c
            r0 = 45
            if (r1 == r0) goto L3c
            r0 = 46
            if (r1 == r0) goto L3c
            goto L22
        L38:
            r0 = 95
            if (r1 != r0) goto L22
        L3c:
            int r3 = r3 + 1
            r7.append(r1)
            goto L9
        L42:
            int r3 = r3 - r4
            r6.A0S(r3)
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1Z.A00(X.E1P, java.lang.StringBuilder):java.lang.String");
    }

    public static void A02(E1P e1p) {
        int i;
        while (true) {
            for (boolean z = true; e1p.A04() > 0 && z; z = false) {
                int i2 = e1p.A01;
                byte[] bArr = e1p.A02;
                byte b = bArr[i2];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    i = 1;
                    e1p.A0S(i);
                } else {
                    int i3 = e1p.A00;
                    int i4 = i2 + 2;
                    if (i4 <= i3) {
                        int i5 = i2 + 1;
                        if (b == 47 && bArr[i5] == 42) {
                            while (true) {
                                int i6 = i4 + 1;
                                if (i6 >= i3) {
                                    break;
                                }
                                if (((char) bArr[i4]) == '*' && ((char) bArr[i6]) == '/') {
                                    i4 += 2;
                                    i3 = i4;
                                } else {
                                    i4 = i6;
                                }
                            }
                            i = i3 - i2;
                            e1p.A0S(i);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String A01(E1P e1p, StringBuilder sb) {
        A02(e1p);
        if (e1p.A04() == 0) {
            return null;
        }
        String strA00 = A00(e1p, sb);
        return !strA00.isEmpty() ? strA00 : FGI.A0E("", (char) e1p.A0A());
    }
}
