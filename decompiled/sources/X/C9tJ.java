package X;

/* renamed from: X.9tJ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tJ extends C9tK {
    public static final Double A0v(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            if (A0y(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final Float A0w(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            if (A0y(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070 A[Catch: NumberFormatException -> 0x0098, TryCatch #0 {NumberFormatException -> 0x0098, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0016, B:12:0x0021, B:14:0x002b, B:25:0x0048, B:54:0x0092, B:30:0x004f, B:32:0x0057, B:34:0x005b, B:38:0x0061, B:40:0x006b, B:42:0x0070, B:44:0x0078, B:47:0x0081, B:49:0x0085, B:15:0x002e, B:19:0x0036, B:21:0x0040, B:51:0x008b), top: B:58:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.math.BigDecimal A0x(java.lang.String r9) {
        /*
            r1 = 0
            X.C7384Etj.A0Y(r9, r1)
            r8 = 0
            int r2 = r9.length()     // Catch: java.lang.NumberFormatException -> L98
            if (r2 == 0) goto L32
            char r0 = r9.charAt(r1)     // Catch: java.lang.NumberFormatException -> L98
            r5 = 43
            r4 = 45
            r7 = 1
            if (r0 == r4) goto L1d
            char r0 = r9.charAt(r1)     // Catch: java.lang.NumberFormatException -> L98
            r6 = 0
            if (r0 != r5) goto L1e
        L1d:
            r6 = 1
        L1e:
            r3 = r6
        L1f:
            if (r3 >= r2) goto L46
            char r0 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L98
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.NumberFormatException -> L98
            if (r0 == 0) goto L46
            int r3 = r3 + 1
            goto L1f
        L2e:
            int r1 = r3 + 2
        L30:
            if (r1 != r2) goto L34
        L32:
            r0 = 0
            goto L4c
        L34:
            if (r1 >= r2) goto L43
            char r0 = r9.charAt(r1)     // Catch: java.lang.NumberFormatException -> L98
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.NumberFormatException -> L98
            if (r0 == 0) goto L43
            int r1 = r1 + 1
            goto L34
        L43:
            if (r1 != r2) goto L32
            goto L4b
        L46:
            if (r3 != r2) goto L4f
            int r3 = r3 - r6
            if (r3 <= 0) goto L32
        L4b:
            r0 = 1
        L4c:
            if (r0 == 0) goto L98
            goto L92
        L4f:
            char r1 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L98
            r0 = 46
            if (r1 != r0) goto L6e
            int r3 = r3 + 1
            if (r3 != r2) goto L5f
            int r3 = r3 - r6
            if (r3 <= r7) goto L32
            goto L4b
        L5f:
            if (r3 >= r2) goto L6e
            char r0 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L98
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.NumberFormatException -> L98
            if (r0 == 0) goto L6e
            int r3 = r3 + 1
            goto L5f
        L6e:
            if (r3 == r2) goto L4b
            char r1 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L98
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L81
            char r1 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L98
            r0 = 69
            if (r1 == r0) goto L81
            goto L32
        L81:
            int r1 = r3 + 1
            if (r1 == r2) goto L32
            char r0 = r9.charAt(r1)     // Catch: java.lang.NumberFormatException -> L98
            if (r0 == r5) goto L2e
            char r0 = r9.charAt(r1)     // Catch: java.lang.NumberFormatException -> L98
            if (r0 != r4) goto L30
            goto L2e
        L92:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L98
            r0.<init>(r9)     // Catch: java.lang.NumberFormatException -> L98
            return r0
        L98:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9tJ.A0x(java.lang.String):java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0y(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9tJ.A0y(java.lang.String):boolean");
    }
}
