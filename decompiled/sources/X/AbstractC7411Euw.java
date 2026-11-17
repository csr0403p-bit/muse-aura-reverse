package X;

import java.util.Map;

/* renamed from: X.Euw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7411Euw {
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String[] A00(java.lang.String r10) {
        /*
            r4 = 0
            r0 = 40
            int r0 = X.C7BY.A08(r10, r0, r4)
            r5 = 1
            if (r0 >= 0) goto Lf
            java.lang.String[] r0 = new java.lang.String[]{r10}
            return r0
        Lf:
            java.util.ArrayList r3 = X.C3cG.A0h()
            int r2 = r0 + 1
            r7 = r2
            r6 = 0
            r9 = 0
            r8 = 0
        L19:
            int r0 = r10.length()
            if (r2 >= r0) goto L71
            if (r9 == 0) goto L25
            int r2 = r2 + 1
            r9 = 0
            goto L19
        L25:
            char r1 = r10.charAt(r2)
            r0 = 34
            if (r1 == r0) goto L6e
            r0 = 41
            if (r1 == r0) goto L4e
            r0 = 44
            if (r1 == r0) goto L4e
            r0 = 58
            if (r1 == r0) goto L4b
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L4b
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L4e
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L47;
                case 93: goto L4e;
                default: goto L44;
            }
        L44:
            int r2 = r2 + 1
            goto L19
        L47:
            if (r8 == 0) goto L44
            r9 = 1
            goto L44
        L4b:
            if (r8 != 0) goto L44
            goto L6b
        L4e:
            if (r8 != 0) goto L44
            java.lang.String r1 = r10.substring(r7, r2)
            r0 = 36
            boolean r0 = X.C7BY.A0m(r1, r0)
            if (r0 == 0) goto L6b
            java.lang.String r0 = r10.substring(r6, r7)
            r3.add(r0)
            java.lang.String r0 = r1.substring(r5)
            r3.add(r0)
            r6 = r2
        L6b:
            int r7 = r2 + 1
            goto L44
        L6e:
            r8 = r8 ^ 1
            goto L44
        L71:
            java.lang.String r0 = r10.substring(r6)
            r3.add(r0)
            java.lang.String[] r0 = X.BV5.A1b(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7411Euw.A00(java.lang.String):java.lang.String[]");
    }

    public final String A01(Map<String, String> map) {
        if (!(this instanceof C2462Bbp)) {
            return ((C2463Bbq) this).A00;
        }
        C7384Etj.A0Y(map, 0);
        StringBuilder sbA0w = C60O.A0w();
        String[] strArr = ((C2462Bbp) this).A00;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String strA0p = strArr[i];
            if (i % 2 != 0 && (strA0p = C60O.A0p(strA0p, map)) == null) {
                strA0p = "def";
            }
            sbA0w.append(strA0p);
        }
        return sbA0w.toString();
    }
}
