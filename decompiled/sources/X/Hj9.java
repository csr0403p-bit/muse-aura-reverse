package X;

/* loaded from: classes6.dex */
public final class Hj9 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A01(java.lang.CharSequence r10, boolean r11) throws java.io.UnsupportedEncodingException {
        /*
            r9 = this;
            r8 = 0
            X.C7384Etj.A0Y(r10, r8)
            java.util.Map<java.lang.Character, java.lang.String> r0 = X.C7l2.A00
            r7 = 1
            java.lang.String r0 = "<>"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.CharSequence r0 = A00(r10, r0)
            java.lang.String r10 = X.C7l2.A00(r0, r7, r11)
            java.lang.StringBuilder r9 = X.C60O.A0w()
            X.Hqd r6 = X.C10534Hqd.A00
            X.C7384Etj.A0Y(r10, r8)
            r5 = 0
        L1f:
            int r0 = r10.length()
            if (r5 >= r0) goto L7e
            int r4 = r6.A00(r10, r5)
            int r11 = X.BV6.A02(r4)
            char r1 = (char) r11
            r0 = 32
            if (r11 != r0) goto L3f
            java.lang.String r0 = "%20"
        L34:
            r9.append(r0)
        L37:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 1
            if (r4 < r1) goto L3d
            r0 = 2
        L3d:
            int r5 = r5 + r0
            goto L1f
        L3f:
            if (r11 < r0) goto L70
            r0 = 128(0x80, float:1.794E-43)
            if (r11 >= r0) goto L51
            java.lang.String r0 = "\".<>\\^_`{|}"
            boolean r0 = X.C7BY.A0k(r0, r1)
            if (r0 != 0) goto L70
            r9.append(r1)
            goto L37
        L51:
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 < r0) goto L70
            r3 = 2
            int r1 = r11 >>> 10
            r0 = 55232(0xd7c0, float:7.7397E-41)
            int r1 = r1 + r0
            char r2 = (char) r1
            r1 = r11 & 1023(0x3ff, float:1.434E-42)
            r0 = 56320(0xdc00, float:7.8921E-41)
            int r1 = r1 + r0
            char r0 = (char) r1
            char[] r1 = new char[r3]
            r1[r8] = r2
            r1[r7] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L74
        L70:
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L74:
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)
            X.C7384Etj.A0U(r0)
            goto L34
        L7e:
            java.lang.String r0 = r9.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hj9.A01(java.lang.CharSequence, boolean):java.lang.String");
    }

    public static final CharSequence A00(CharSequence charSequence, String... strArr) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        for (String str : strArr) {
            if (charSequence.charAt(0) == str.charAt(0) && charSequence.charAt(charSequence.length() - 1) == str.charAt(1)) {
                return charSequence.subSequence(1, charSequence.length() - 1);
            }
        }
        return charSequence;
    }
}
