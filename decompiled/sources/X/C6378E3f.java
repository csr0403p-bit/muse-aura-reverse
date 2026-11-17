package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.E3f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6378E3f implements InterfaceC6401E4d {
    public InterfaceC5563Dkg A00;
    public boolean A01;
    public long A03;
    public E43 A04;
    public String A05;
    public boolean A06;
    public final E31 A0B;
    public final boolean[] A0C = new boolean[3];
    public final E4B A09 = new E4B(7);
    public final E4B A07 = new E4B(8);
    public final E4B A08 = new E4B(6);
    public long A02 = -9223372036854775807L;
    public final E1P A0A = BV6.A0X();

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
        C1G.A05(this.A00);
        if (z) {
            E33.A00(this.A0B.A00, 0);
            A00(0, 0, this.A03, this.A02);
            long j = this.A03;
            long j2 = this.A02;
            A01(j, j2, 9);
            A00(0, 0, j, j2);
        }
    }

    private void A00(int i, int i2, long j, long j2) {
        if (!this.A01) {
            E4B e4b = this.A09;
            e4b.A02(i2);
            E4B e4b2 = this.A07;
            e4b2.A02(i2);
            if (e4b.A01 && e4b2.A01) {
                ArrayList arrayListA0h = C3cG.A0h();
                arrayListA0h.add(Arrays.copyOf(e4b.A03, e4b.A00));
                arrayListA0h.add(Arrays.copyOf(e4b2.A03, e4b2.A00));
                C6377E3e c6377E3eA06 = AbstractC6381E3i.A06(e4b.A03, 4, e4b.A00);
                E4H e4h = new E4H(e4b2.A03, 4, e4b2.A00);
                int iA00 = E4H.A00(e4h);
                E4H.A00(e4h);
                e4h.A04();
                e4h.A04();
                E5O e5o = new E5O(iA00);
                int i3 = c6377E3eA06.A0A;
                String str = String.format("avc1.%02X%02X%02X", BV8.A1b(Integer.valueOf(i3), c6377E3eA06.A06, c6377E3eA06.A08));
                InterfaceC5563Dkg interfaceC5563Dkg = this.A00;
                C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
                c6162Dx5A00.A0W = this.A05;
                c6162Dx5A00.A05("video/mp2t");
                c6162Dx5A00.A06("video/avc");
                c6162Dx5A00.A0U = str;
                c6162Dx5A00.A0O = c6377E3eA06.A0C;
                c6162Dx5A00.A0B = c6377E3eA06.A07;
                c6162Dx5A00.A0Q = new C6180DxO(null, c6377E3eA06.A04, c6377E3eA06.A03, c6377E3eA06.A05, c6377E3eA06.A02 + 8, c6377E3eA06.A01 + 8);
                c6162Dx5A00.A01 = c6377E3eA06.A00;
                c6162Dx5A00.A0a = arrayListA0h;
                int i4 = c6377E3eA06.A09;
                c6162Dx5A00.A0D = i4;
                InterfaceC5563Dkg.A00(c6162Dx5A00, interfaceC5563Dkg);
                this.A01 = true;
                this.A0B.A00.A01(i4);
                E43 e43 = this.A04;
                e43.A0A.append(c6377E3eA06.A0B, c6377E3eA06);
                e43.A09.append(e5o.A00, e5o);
                e4b.A02 = false;
                e4b.A01 = false;
                e4b2.A02 = false;
                e4b2.A01 = false;
            }
        }
        E4B e4b3 = this.A08;
        if (e4b3.A02(i2)) {
            int iA01 = AbstractC6381E3i.A01(e4b3.A03, e4b3.A00);
            E1P e1p = this.A0A;
            e1p.A0T(e4b3.A03, iA01);
            e1p.A0R(4);
            this.A0B.A00.A02(e1p, j2);
        }
        E43 e432 = this.A04;
        boolean z = this.A01;
        if (e432.A00 == 9) {
            if (z && e432.A06) {
                long j3 = e432.A01;
                int i5 = i + ((int) (j - j3));
                long j4 = e432.A04;
                if (j4 != -9223372036854775807L) {
                    long j5 = e432.A03;
                    if (j3 != j5) {
                        int i6 = (int) (j3 - j5);
                        e432.A0C.Abz(null, e432.A07 ? 1 : 0, i6, i5, j4);
                    }
                }
            }
            e432.A03 = e432.A01;
            e432.A04 = e432.A02;
            e432.A07 = false;
            e432.A06 = true;
        }
        boolean z2 = e432.A05;
        boolean z3 = e432.A07;
        int i7 = e432.A00;
        boolean z4 = true;
        if (i7 != 5 && (!z2 || i7 != 1)) {
            z4 = false;
        }
        boolean z5 = z3 | z4;
        e432.A07 = z5;
        e432.A00 = 24;
        if (z5) {
            this.A06 = false;
        }
    }

    private void A01(long j, long j2, int i) {
        if (!this.A01) {
            this.A09.A00(i);
            this.A07.A00(i);
        }
        this.A08.A00(i);
        E43 e43 = this.A04;
        boolean z = this.A06;
        e43.A00 = i;
        e43.A02 = j2;
        e43.A01 = j;
        e43.A05 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r20) {
        /*
            r19 = this;
            r10 = r19
            X.Dkg r8 = r10.A00
            X.C1G.A05(r8)
            r9 = r20
            int r7 = r9.A01
            int r4 = r9.A00
            byte[] r3 = r9.A02
            long r5 = r10.A03
            int r2 = r9.A04()
            long r0 = (long) r2
            long r5 = r5 + r0
            r10.A03 = r5
            r8.Abv(r9, r2)
        L1c:
            boolean[] r0 = r10.A0C
            int r2 = X.AbstractC6381E3i.A02(r3, r0, r7, r4)
            if (r2 != r4) goto L38
            boolean r0 = r10.A01
            if (r0 != 0) goto L32
            X.E4B r0 = r10.A09
            r0.A01(r3, r7, r4)
            X.E4B r0 = r10.A07
            r0.A01(r3, r7, r4)
        L32:
            X.E4B r0 = r10.A08
            r0.A01(r3, r7, r4)
            return
        L38:
            int r0 = r2 + 3
            r0 = r3[r0]
            r20 = r0 & 31
            if (r2 <= 0) goto L7b
            int r1 = r2 + (-1)
            r0 = r3[r1]
            if (r0 != 0) goto L7b
            r2 = r1
            r6 = 4
        L48:
            int r5 = r2 - r7
            if (r5 <= 0) goto L5f
            boolean r0 = r10.A01
            if (r0 != 0) goto L5a
            X.E4B r0 = r10.A09
            r0.A01(r3, r7, r2)
            X.E4B r0 = r10.A07
            r0.A01(r3, r7, r2)
        L5a:
            X.E4B r0 = r10.A08
            r0.A01(r3, r7, r2)
        L5f:
            int r11 = r4 - r2
            long r13 = r10.A03
            long r0 = (long) r11
            long r13 = r13 - r0
            r12 = 0
            if (r5 >= 0) goto L69
            int r12 = -r5
        L69:
            long r15 = r10.A02
            r10.A00(r11, r12, r13, r15)
            long r0 = r10.A02
            r15 = r10
            r16 = r13
            r18 = r0
            r15.A01(r16, r18, r20)
            int r7 = r2 + r6
            goto L1c
        L7b:
            r6 = 3
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6378E3f.A6w(X.E1P):void");
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A02 = j;
        this.A06 |= AnonymousClass002.A1L(i & 2);
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A03 = 0L;
        this.A06 = false;
        this.A02 = -9223372036854775807L;
        boolean[] zArr = this.A0C;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        E4B e4b = this.A09;
        e4b.A02 = false;
        e4b.A01 = false;
        E4B e4b2 = this.A07;
        e4b2.A02 = false;
        e4b2.A01 = false;
        E4B e4b3 = this.A08;
        e4b3.A02 = false;
        e4b3.A01 = false;
        E33.A00(this.A0B.A00, 0);
        E43 e43 = this.A04;
        if (e43 != null) {
            e43.A06 = false;
        }
    }

    public C6378E3f(E31 e31) {
        this.A0B = e31;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A05 = E4I.A01(e4i);
        E4I.A02(e4i);
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 2);
        this.A00 = interfaceC5563DkgAhC;
        this.A04 = new E43(interfaceC5563DkgAhC);
        this.A0B.A00(interfaceC6413E4p, e4i);
    }
}
