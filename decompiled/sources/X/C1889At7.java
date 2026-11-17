package X;

/* renamed from: X.At7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1889At7 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final Integer A00() {
        Integer num = this.A04;
        Integer num2 = C79.A01;
        if (num == num2) {
            long j = this.A01;
            if (Au3.A04(j)) {
                long j2 = this.A02;
                int i = (int) (j2 >> 32);
                int i2 = (int) (j >> 32);
                if (Au3.A04(j2)) {
                    return i > i2 ? C79.A00 : num2;
                }
                if (i == i2 && i == this.A00) {
                    return C79.A0C;
                }
            }
        }
        return C79.A0K;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1889At7(java.lang.String r2, long r3, long r5, long r7, java.lang.String r9, boolean r10, int r11) {
        /*
            r1 = this;
            r1.<init>()
            r1.A00 = r11
            r1.A06 = r2
            r1.A05 = r9
            r1.A02 = r3
            r1.A01 = r5
            r1.A03 = r7
            r1.A07 = r10
            int r0 = r2.length()
            if (r0 != 0) goto L24
            int r0 = r9.length()
            if (r0 == 0) goto L32
            if (r0 <= 0) goto L2f
            java.lang.Integer r0 = X.C79.A00
        L21:
            r1.A04 = r0
            return
        L24:
            if (r0 <= 0) goto L2f
            int r0 = r9.length()
            if (r0 != 0) goto L2f
            java.lang.Integer r0 = X.C79.A01
            goto L21
        L2f:
            java.lang.Integer r0 = X.C79.A0C
            goto L21
        L32:
            java.lang.String r0 = "Either pre or post text must not be empty"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1889At7.<init>(java.lang.String, long, long, long, java.lang.String, boolean, int):void");
    }
}
