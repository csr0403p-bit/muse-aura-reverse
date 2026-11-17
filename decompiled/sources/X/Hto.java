package X;

/* loaded from: classes6.dex */
public abstract class Hto {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r0 = 1
            X.C7384Etj.A0Y(r4, r0)
            if (r5 == 0) goto L17
            boolean r0 = X.HiY.A0B(r5)
            if (r0 == 0) goto L17
            int r3 = X.HiY.A05(r5)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L11
            goto L18
        L11:
            java.lang.String r1 = "Error while parsing DateTime format"
            r0 = 0
            X.FFI.A01(r0, r1, r0)
        L17:
            r3 = 2
        L18:
            if (r6 == 0) goto L25
            int r2 = X.HiY.A05(r6)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L1f
            goto L26
        L1f:
            java.lang.String r1 = "Error while parsing Time format"
            r0 = 0
            X.FFI.A01(r0, r1, r0)
        L25:
            r2 = r3
        L26:
            if (r5 != 0) goto L2a
            java.lang.String r5 = "medium"
        L2a:
            int r1 = r4.hashCode()
            r0 = 3076014(0x2eefae, float:4.310414E-39)
            if (r1 == r0) goto L80
            r0 = 3560141(0x3652cd, float:4.98882E-39)
            if (r1 == r0) goto L73
            r0 = 1793702779(0x6ae9bb7b, float:1.4128253E26)
            if (r1 != r0) goto Lab
            java.lang.String r0 = "datetime"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lab
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r3, r2)
        L49:
            X.C7384Etj.A0U(r2)
        L4c:
            if (r7 != 0) goto L5a
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r7 = r0.getID()
        L5a:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r7)
            X.C7384Etj.A0U(r0)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = r2.format(r0)
            X.C7384Etj.A0U(r0)
            return r0
        L73:
            java.lang.String r0 = "time"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lab
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r2)
            goto L49
        L80:
            java.lang.String r0 = "date"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lab
            boolean r0 = X.HiY.A0B(r5)
            if (r0 == 0) goto La3
            int r0 = X.HiY.A05(r5)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L9a
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L9a
            X.C7384Etj.A0X(r2)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L9a
            goto L4c
        L9a:
            r0 = 2
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)
            X.C7384Etj.A0X(r2)
            goto L4c
        La3:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r5, r0)
            goto L4c
        Lab:
            java.lang.String r0 = "Unknown dateformat type: "
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hto.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }
}
