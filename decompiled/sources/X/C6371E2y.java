package X;

/* renamed from: X.E2y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6371E2y {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C6421E4x A04;
    public C6366E2t A05;
    public boolean A06;
    public final C6154Dwx A07;
    public final InterfaceC5563Dkg A09;
    public final E3G A0A = new E3G();
    public final E1P A08 = BV6.A0X();
    public final E1P A0C = BV6.A0Y(1);
    public final E1P A0B = BV6.A0X();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int A00() {
        ?? A1L = !this.A06 ? this.A05.A04[this.A01] : AnonymousClass002.A1L(this.A0A.A0F[this.A01] ? 1 : 0);
        return A02() != null ? A1L | 1073741824 : A1L;
    }

    public final C6365E2s A02() {
        C6365E2s[] c6365E2sArr;
        if (this.A06) {
            E3G e3g = this.A0A;
            int i = e3g.A05.A02;
            C6365E2s c6365E2s = e3g.A06;
            if ((c6365E2s != null || ((c6365E2sArr = this.A05.A03.A0B) != null && (c6365E2s = c6365E2sArr[i]) != null)) && c6365E2s.A03) {
                return c6365E2s;
            }
        }
        return null;
    }

    public final void A03() {
        E3G e3g = this.A0A;
        e3g.A01 = 0;
        e3g.A04 = 0L;
        e3g.A08 = false;
        e3g.A07 = false;
        e3g.A09 = false;
        e3g.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final boolean A04() {
        this.A01++;
        if (this.A06) {
            int i = this.A00 + 1;
            this.A00 = i;
            int[] iArr = this.A0A.A0B;
            int i2 = this.A02;
            if (i != iArr[i2]) {
                return true;
            }
            this.A02 = i2 + 1;
            this.A00 = 0;
        }
        return false;
    }

    public C6371E2y(C6154Dwx c6154Dwx, InterfaceC5563Dkg interfaceC5563Dkg, C6421E4x c6421E4x, C6366E2t c6366E2t) {
        this.A09 = interfaceC5563Dkg;
        this.A05 = c6366E2t;
        this.A04 = c6421E4x;
        this.A07 = c6154Dwx;
        this.A05 = c6366E2t;
        this.A04 = c6421E4x;
        interfaceC5563Dkg.ABq(c6154Dwx);
        A03();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(int r14, int r15) {
        /*
            r13 = this;
            X.E2s r0 = r13.A02()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r8 = r0.A00
            if (r8 == 0) goto L43
            X.E3G r0 = r13.A0A
            X.E1P r5 = r0.A0G
        L10:
            X.E3G r11 = r13.A0A
            int r2 = r13.A01
            boolean r0 = r11.A07
            if (r0 == 0) goto L1f
            boolean[] r0 = r11.A0E
            boolean r0 = r0[r2]
            r12 = 1
            if (r0 != 0) goto L20
        L1f:
            r12 = 0
        L20:
            r9 = 1
            if (r12 != 0) goto L26
            r4 = 0
            if (r15 == 0) goto L27
        L26:
            r4 = 1
        L27:
            X.E1P r3 = r13.A0C
            byte[] r2 = r3.A02
            r0 = 0
            if (r4 == 0) goto L30
            r0 = 128(0x80, float:1.794E-43)
        L30:
            X.BV6.A0x(r0, r2, r8, r1)
            r3.A0R(r1)
            X.Dkg r7 = r13.A09
            r7.Abw(r3, r9, r9)
            r7.Abw(r5, r8, r9)
            if (r4 != 0) goto L4c
            int r0 = r8 + 1
            return r0
        L43:
            byte[] r0 = r0.A04
            X.E1P r5 = r13.A0B
            int r8 = r0.length
            r5.A0T(r0, r8)
            goto L10
        L4c:
            r4 = 6
            r6 = 3
            r5 = 2
            r10 = 8
            if (r12 != 0) goto L84
            X.E1P r3 = r13.A08
            r3.A0P(r10)
            byte[] r2 = r3.A02
            r2[r1] = r1
            r2[r9] = r9
            r2[r5] = r1
            X.BV5.A1C(r15, r2, r6)
            int r0 = r14 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0
            r0 = 4
            r2[r0] = r1
            int r0 = r14 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0
            r0 = 5
            r2[r0] = r1
            int r0 = r14 >> 8
            X.BV5.A1C(r0, r2, r4)
            r0 = r14 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0
            r0 = 7
            r2[r0] = r1
            r7.Abw(r3, r10, r9)
            int r0 = r8 + 9
            return r0
        L84:
            X.E1P r11 = r11.A0G
            int r2 = r11.A0D()
            r0 = -2
            r11.A0S(r0)
            int r0 = r2 * 6
            int r4 = r0 + 2
            if (r15 == 0) goto Lb2
            X.E1P r3 = r13.A08
            r3.A0P(r4)
            byte[] r2 = r3.A02
            r11.A0U(r2, r1, r4)
            r0 = r2[r5]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r10
            r0 = r2[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r1 = r1 + r15
            int r0 = r1 >> 8
            X.BV5.A1C(r0, r2, r5)
            X.BV5.A1C(r1, r2, r6)
            r11 = r3
        Lb2:
            r7.Abw(r11, r4, r9)
            int r0 = r8 + 1
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6371E2y.A01(int, int):int");
    }
}
