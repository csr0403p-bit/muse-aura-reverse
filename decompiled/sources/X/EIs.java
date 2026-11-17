package X;

/* loaded from: classes5.dex */
public final class EIs {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public static final boolean A00(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        int length = str.length();
        if (length != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < length) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        if (cCharAt != '(') {
                            if (cCharAt == ')' && i2 - 1 == 0 && i3 != length - 1) {
                                return false;
                            }
                        }
                        i++;
                        i3 = i4;
                    } else if (cCharAt != '(') {
                        break;
                    }
                    i2++;
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return C7384Etj.areEqual(AnonymousClass002.A0l(str.substring(1, length - 1)), str2);
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EIs)) {
            return false;
        }
        EIs eIs = (EIs) obj;
        if (AnonymousClass002.A1N(this.A02) != AnonymousClass002.A1N(eIs.A02) || !this.A04.equals(eIs.A04) || this.A06 != eIs.A06) {
            return false;
        }
        String str = this.A03;
        String str2 = eIs.A03;
        int i = this.A01;
        if (i == 1 && eIs.A01 == 2 && str != null && !A00(str, str2)) {
            return false;
        }
        if (i == 2 && eIs.A01 == 1 && str2 != null && !A00(str2, str)) {
            return false;
        }
        if (i == eIs.A01) {
            if (str != null) {
                if (!A00(str, str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return this.A00 == eIs.A00;
    }

    public final int hashCode() {
        return ((((AnonymousClass001.A0G(this.A04) + this.A00) * 31) + BV7.A02(this.A06 ? 1 : 0)) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("\n            |Column {\n            |   name = '");
        sbA0x.append(this.A04);
        sbA0x.append("',\n            |   type = '");
        sbA0x.append(this.A05);
        sbA0x.append("',\n            |   affinity = '");
        sbA0x.append(this.A00);
        sbA0x.append("',\n            |   notNull = '");
        sbA0x.append(this.A06);
        sbA0x.append("',\n            |   primaryKeyPosition = '");
        sbA0x.append(this.A02);
        sbA0x.append("',\n            |   defaultValue = '");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        sbA0x.append(str);
        return C6tn.A07(C6tn.A04(AnonymousClass001.A0v("'\n            |}\n        ", sbA0x)), "    ");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EIs(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int r9, boolean r10) {
        /*
            r4 = this;
            X.AnonymousClass003.A0u(r5, r6)
            r4.<init>()
            r4.A04 = r5
            r4.A05 = r6
            r4.A06 = r10
            r4.A02 = r8
            r4.A03 = r7
            r4.A01 = r9
            r3 = 5
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r6.toUpperCase(r0)
            java.lang.String r0 = "INT"
            r1 = 0
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 == 0) goto L26
            r3 = 3
        L23:
            r4.A00 = r3
            return
        L26:
            java.lang.String r0 = "CHAR"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "CLOB"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "TEXT"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "BLOB"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "REAL"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "FLOA"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "DOUB"
            boolean r0 = X.C7BY.A0q(r2, r0, r1)
            r3 = 1
            if (r0 == 0) goto L23
        L5f:
            r3 = 4
            goto L23
        L61:
            r3 = 2
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIs.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
