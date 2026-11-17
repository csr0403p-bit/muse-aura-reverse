package X;

/* renamed from: X.DnF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5676DnF {
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public long A01 = -1;
    public long A00 = -1;

    public C5676DnF(int i, int i2, long j, long j2, long j3, long j4, long j5) {
        this.A02 = i;
        this.A04 = j;
        this.A03 = i2;
        this.A07 = j2;
        this.A08 = j3;
        this.A05 = j4;
        this.A06 = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.Dn3 r8, X.C5676DnF r9, java.lang.String r10) {
        /*
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r9.A01
            r5 = 0
            r7 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L16
            long r5 = r3 - r0
            long r1 = r9.A05
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L16
        L15:
            return r7
        L16:
            r9.A01 = r3
            int r5 = r9.A03
            if (r5 <= 0) goto L60
            long r2 = r9.A07
            X.Dlw r0 = r8.A00
            X.Dlu r4 = r0.A2j
            if (r4 == 0) goto L60
            android.os.Looper r0 = X.AbstractC5797Dph.A01(r4)
            if (r0 == 0) goto L60
            android.os.Handler r1 = X.BV4.A09(r0)
            X.Dlr r0 = new X.Dlr
            r0.<init>(r4, r5, r2)
            r1.post(r0)
            r3 = 1
        L37:
            boolean r2 = r8.A02()
            java.lang.String r0 = "cancel_load reason="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r10)
            java.lang.String r0 = " canceled="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " floorW="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " floorApplied="
            java.lang.String r0 = X.C60P.A1P(r0, r1, r3)
            r8.A01(r0)
            if (r2 != 0) goto L5e
            if (r3 == 0) goto L15
        L5e:
            r7 = 1
            return r7
        L60:
            r3 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5676DnF.A00(X.Dn3, X.DnF, java.lang.String):boolean");
    }
}
