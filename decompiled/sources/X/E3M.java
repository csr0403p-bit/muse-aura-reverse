package X;

/* loaded from: classes5.dex */
public abstract class E3M {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b A[PHI: r1
  0x005b: PHI (r1v4 boolean) = (r1v3 boolean), (r1v5 boolean) binds: [B:33:0x0052, B:36:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.E1P r9, X.InterfaceC5563Dkg[] r10, long r11) {
        /*
        L0:
            int r0 = r9.A04()
            r8 = 1
            if (r0 <= r8) goto L84
            r3 = 0
        L8:
            int r0 = r9.A04()
            if (r0 != 0) goto L7a
            r3 = -1
        Lf:
            r2 = 0
        L10:
            int r0 = r9.A04()
            if (r0 != 0) goto L70
            r2 = -1
        L17:
            int r7 = r9.A01
            int r7 = r7 + r2
            r0 = -1
            if (r2 == r0) goto L66
            int r0 = r9.A04()
            if (r2 > r0) goto L66
            r0 = 4
            if (r3 != r0) goto L60
            r0 = 8
            if (r2 < r0) goto L60
            int r6 = r9.A0A()
            int r5 = r9.A0D()
            r4 = 49
            if (r5 != r4) goto L64
            int r3 = r9.A05()
        L3a:
            int r2 = r9.A0A()
            r1 = 47
            if (r5 != r1) goto L45
            r9.A0S(r8)
        L45:
            r0 = 181(0xb5, float:2.54E-43)
            if (r6 != r0) goto L51
            if (r5 == r4) goto L4d
            if (r5 != r1) goto L51
        L4d:
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L52
        L51:
            r1 = 0
        L52:
            if (r5 != r4) goto L5b
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r3 != r0) goto L60
            r1 = r1 & 1
        L5b:
            if (r1 == 0) goto L60
            A01(r9, r10, r11)
        L60:
            r9.A0R(r7)
            goto L0
        L64:
            r3 = 0
            goto L3a
        L66:
            java.lang.String r1 = "CeaUtil"
            java.lang.String r0 = "Skipping remainder of malformed SEI NAL unit."
            X.CNC.A04(r1, r0)
            int r7 = r9.A00
            goto L60
        L70:
            int r1 = r9.A0A()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L10
            goto L17
        L7a:
            int r1 = r9.A0A()
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L8
            goto Lf
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3M.A00(X.E1P, X.Dkg[], long):void");
    }

    public static void A01(E1P e1p, InterfaceC5563Dkg[] interfaceC5563DkgArr, long j) {
        int iA0A = e1p.A0A();
        if ((iA0A & 64) != 0) {
            e1p.A0S(1);
            int i = (iA0A & 31) * 3;
            int i2 = e1p.A01;
            for (InterfaceC5563Dkg interfaceC5563Dkg : interfaceC5563DkgArr) {
                e1p.A0R(i2);
                interfaceC5563Dkg.Abv(e1p, i);
                C1G.A08(AnonymousClass002.A1L((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
                InterfaceC5563Dkg.A01(interfaceC5563Dkg, 1, i, j);
            }
        }
    }
}
