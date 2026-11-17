package X;

/* loaded from: classes5.dex */
public final class DMI extends AbstractC3584CVf<DMK> {
    public final ThreadLocal<DMK> A00 = new ThreadLocal<>();
    public final ThreadLocal<DMJ> A01 = new ThreadLocal<>();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r4 = ((r2 * r4) * 1.0d) / X.C8R.A00;
        r6.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final double A00(X.DMJ r6) {
        /*
            r2 = 1
            r4 = 0
            r1 = 1
        L5:
            boolean r0 = X.DMJ.A02(r6)
            if (r0 == 0) goto L34
            X.DMJ.A00(r6)
            char r0 = r6.A00
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L21
            r0 = 10
            long r4 = r4 * r0
            char r0 = r6.A00
            int r0 = r0 + (-48)
            long r0 = (long) r0
            long r4 = r4 + r0
        L1f:
            r1 = 0
            goto L5
        L21:
            if (r1 == 0) goto L3e
            char r1 = r6.A00
            r0 = 45
            if (r1 != r0) goto L2c
            r2 = -1
            goto L1f
        L2c:
            java.lang.String r1 = "Couldn't read number!"
            com.facebook.battery.metrics.core.ProcFileReader$ParseException r0 = new com.facebook.battery.metrics.core.ProcFileReader$ParseException
            r0.<init>(r1)
            throw r0
        L34:
            if (r1 == 0) goto L4e
            java.lang.String r1 = "Couldn't read number because the file ended!"
            com.facebook.battery.metrics.core.ProcFileReader$ParseException r0 = new com.facebook.battery.metrics.core.ProcFileReader$ParseException
            r0.<init>(r1)
            throw r0
        L3e:
            boolean r0 = r6.A06
            if (r0 != 0) goto L5b
            int r0 = r6.A03
            r1 = 1
            int r0 = r0 - r1
            r6.A03 = r0
            char r0 = r6.A01
            r6.A00 = r0
            r6.A06 = r1
        L4e:
            long r2 = r2 * r4
            double r4 = (double) r2
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            long r2 = X.C8R.A00
            double r0 = (double) r2
            double r4 = r4 / r0
            r6.A03()
            return r4
        L5b:
            java.lang.String r1 = "Can only rewind one step!"
            com.facebook.battery.metrics.core.ProcFileReader$ParseException r0 = new com.facebook.battery.metrics.core.ProcFileReader$ParseException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMI.A00(X.DMJ):double");
    }
}
