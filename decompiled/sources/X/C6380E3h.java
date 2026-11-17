package X;

import androidx.media3.common.util.CodecSpecificDataUtil;
import com.google.common.base.Preconditions;
import java.util.Collections;

/* renamed from: X.E3h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6380E3h implements InterfaceC6401E4d {
    public InterfaceC5563Dkg A00;
    public long A02;
    public E46 A03;
    public String A04;
    public boolean A05;
    public final E31 A0C;
    public final boolean[] A0D = new boolean[3];
    public final E4B A0B = new E4B(32);
    public final E4B A09 = new E4B(33);
    public final E4B A07 = new E4B(34);
    public final E4B A08 = new E4B(39);
    public final E4B A0A = new E4B(40);
    public long A01 = -9223372036854775807L;
    public final E1P A06 = BV6.A0X();

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
        C1G.A05(this.A00);
        if (z) {
            E33.A00(this.A0C.A00, 0);
            A00(0, 0, this.A02, this.A01);
            A01(0, 48, this.A02, this.A01);
        }
    }

    private void A00(int i, int i2, long j, long j2) {
        E46 e46 = this.A03;
        boolean z = this.A05;
        if (e46.A09 && e46.A06) {
            e46.A0B = e46.A08;
            e46.A09 = false;
        } else if (e46.A05 || e46.A06) {
            if (z && e46.A0A) {
                E46.A00(e46, i + ((int) (j - e46.A01)));
            }
            e46.A03 = e46.A01;
            e46.A04 = e46.A02;
            e46.A0B = e46.A08;
            e46.A0A = true;
        }
        if (!this.A05) {
            E4B e4b = this.A0B;
            e4b.A02(i2);
            E4B e4b2 = this.A09;
            e4b2.A02(i2);
            E4B e4b3 = this.A07;
            e4b3.A02(i2);
            if (e4b.A01 && e4b2.A01 && e4b3.A01) {
                String str = this.A04;
                int i3 = e4b.A00;
                byte[] bArr = new byte[i3 + e4b2.A00 + e4b3.A00];
                System.arraycopy(e4b.A03, 0, bArr, 0, i3);
                System.arraycopy(e4b2.A03, 0, bArr, e4b.A00, e4b2.A00);
                System.arraycopy(e4b3.A03, 0, bArr, e4b.A00 + e4b2.A00, e4b3.A00);
                String strA00 = null;
                E47 e47A05 = AbstractC6381E3i.A05(null, e4b2.A03, 3, e4b2.A00);
                C6404E4g c6404E4g = e47A05.A0D;
                if (c6404E4g != null) {
                    int i4 = c6404E4g.A03;
                    boolean z2 = c6404E4g.A04;
                    strA00 = CodecSpecificDataUtil.A00(c6404E4g.A05, i4, c6404E4g.A02, c6404E4g.A01, c6404E4g.A00, z2);
                }
                C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
                c6162Dx5A00.A0W = str;
                c6162Dx5A00.A05("video/mp2t");
                c6162Dx5A00.A06("video/hevc");
                c6162Dx5A00.A0U = strA00;
                c6162Dx5A00.A0O = e47A05.A0B;
                c6162Dx5A00.A0B = e47A05.A08;
                c6162Dx5A00.A08 = e47A05.A07;
                c6162Dx5A00.A07 = e47A05.A06;
                E4S e4s = new E4S();
                e4s.A02 = e47A05.A04;
                e4s.A01 = e47A05.A03;
                e4s.A03 = e47A05.A05;
                e4s.A04 = e47A05.A02 + 8;
                e4s.A00 = e47A05.A01 + 8;
                c6162Dx5A00.A0Q = e4s.A00();
                c6162Dx5A00.A01 = e47A05.A00;
                c6162Dx5A00.A0D = e47A05.A09;
                c6162Dx5A00.A0E = e47A05.A0A + 1;
                c6162Dx5A00.A0a = Collections.singletonList(bArr);
                C6154Dwx c6154DwxA0U = BV6.A0U(c6162Dx5A00);
                this.A00.ABq(c6154DwxA0U);
                int i5 = c6154DwxA0U.A0F;
                Preconditions.checkState(AnonymousClass002.A1P(i5, -1));
                this.A0C.A00.A01(i5);
                this.A05 = true;
            }
        }
        E4B e4b4 = this.A08;
        if (e4b4.A02(i2)) {
            int iA01 = AbstractC6381E3i.A01(e4b4.A03, e4b4.A00);
            E1P e1p = this.A06;
            e1p.A0T(e4b4.A03, iA01);
            e1p.A0S(5);
            this.A0C.A00.A02(e1p, j2);
        }
        E4B e4b5 = this.A0A;
        if (e4b5.A02(i2)) {
            int iA012 = AbstractC6381E3i.A01(e4b5.A03, e4b5.A00);
            E1P e1p2 = this.A06;
            e1p2.A0T(e4b5.A03, iA012);
            e1p2.A0S(5);
            this.A0C.A00.A02(e1p2, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(int r6, int r7, long r8, long r10) {
        /*
            r5 = this;
            X.E46 r2 = r5.A03
            boolean r4 = r5.A05
            r1 = 0
            r2.A06 = r1
            r2.A05 = r1
            r2.A02 = r10
            r2.A00 = r1
            r2.A01 = r8
            r0 = 32
            if (r7 < r0) goto L61
            r0 = 40
            if (r7 == r0) goto L37
            r3 = 1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L27
            boolean r0 = r2.A09
            if (r0 != 0) goto L27
            if (r4 == 0) goto L25
            X.E46.A00(r2, r6)
        L25:
            r2.A0A = r1
        L27:
            r0 = 35
            if (r7 <= r0) goto L2f
            r0 = 39
            if (r7 != r0) goto L37
        L2f:
            boolean r0 = r2.A09
            r0 = r0 ^ 1
            r2.A05 = r0
            r2.A09 = r3
        L37:
            r3 = 0
        L38:
            r2.A08 = r3
            if (r3 != 0) goto L40
            r0 = 9
            if (r7 > r0) goto L41
        L40:
            r1 = 1
        L41:
            r2.A07 = r1
            boolean r0 = r5.A05
            if (r0 != 0) goto L56
            X.E4B r0 = r5.A0B
            r0.A00(r7)
            X.E4B r0 = r5.A09
            r0.A00(r7)
            X.E4B r0 = r5.A07
            r0.A00(r7)
        L56:
            X.E4B r0 = r5.A08
            r0.A00(r7)
            X.E4B r0 = r5.A0A
            r0.A00(r7)
            return
        L61:
            r0 = 16
            if (r7 < r0) goto L37
            r0 = 21
            r3 = 1
            if (r7 <= r0) goto L38
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6380E3h.A01(int, int, long, long):void");
    }

    private void A02(byte[] bArr, int i, int i2) {
        E46 e46 = this.A03;
        if (e46.A07) {
            int i3 = e46.A00;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                e46.A06 = AnonymousClass002.A1L(bArr[i4] & 128);
                e46.A07 = false;
            } else {
                e46.A00 = i3 + (i2 - i);
            }
        }
        if (!this.A05) {
            this.A0B.A01(bArr, i, i2);
            this.A09.A01(bArr, i, i2);
            this.A07.A01(bArr, i, i2);
        }
        this.A08.A01(bArr, i, i2);
        this.A0A.A01(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r21) {
        /*
            r20 = this;
            r9 = r20
            X.Dkg r0 = r9.A00
            X.C1G.A05(r0)
        L7:
            r8 = r21
            int r6 = r8.A04()
            if (r6 <= 0) goto L2d
            int r7 = r8.A01
            int r5 = r8.A00
            byte[] r4 = r8.A02
            long r2 = r9.A02
            long r0 = (long) r6
            long r2 = r2 + r0
            r9.A02 = r2
            X.Dkg r0 = r9.A00
            r0.Abv(r8, r6)
        L20:
            if (r7 >= r5) goto L7
            boolean[] r0 = r9.A0D
            int r3 = X.AbstractC6381E3i.A02(r4, r0, r7, r5)
            if (r3 != r5) goto L2e
            r9.A02(r4, r7, r5)
        L2d:
            return
        L2e:
            int r0 = r3 + 3
            r0 = r4[r0]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r16 = r0 >> 1
            if (r3 <= 0) goto L64
            int r1 = r3 + (-1)
            r0 = r4[r1]
            if (r0 != 0) goto L64
            r3 = r1
            r6 = 4
        L40:
            int r2 = r3 - r7
            if (r2 <= 0) goto L47
            r9.A02(r4, r7, r3)
        L47:
            int r10 = r5 - r3
            long r12 = r9.A02
            long r0 = (long) r10
            long r12 = r12 - r0
            r11 = 0
            if (r2 >= 0) goto L51
            int r11 = -r2
        L51:
            long r14 = r9.A01
            r9.A00(r10, r11, r12, r14)
            long r0 = r9.A01
            r14 = r9
            r15 = r10
            r17 = r12
            r19 = r0
            r14.A01(r15, r16, r17, r19)
            int r7 = r3 + r6
            goto L20
        L64:
            r6 = 3
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6380E3h.A6w(X.E1P):void");
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A02 = 0L;
        this.A01 = -9223372036854775807L;
        boolean[] zArr = this.A0D;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        E4B e4b = this.A0B;
        e4b.A02 = false;
        e4b.A01 = false;
        E4B e4b2 = this.A09;
        e4b2.A02 = false;
        e4b2.A01 = false;
        E4B e4b3 = this.A07;
        e4b3.A02 = false;
        e4b3.A01 = false;
        E4B e4b4 = this.A08;
        e4b4.A02 = false;
        e4b4.A01 = false;
        E4B e4b5 = this.A0A;
        e4b5.A02 = false;
        e4b5.A01 = false;
        E33.A00(this.A0C.A00, 0);
        E46 e46 = this.A03;
        if (e46 != null) {
            e46.A07 = false;
            e46.A06 = false;
            e46.A05 = false;
            e46.A0A = false;
            e46.A09 = false;
        }
    }

    public C6380E3h(E31 e31) {
        this.A0C = e31;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A04 = E4I.A01(e4i);
        E4I.A02(e4i);
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 2);
        this.A00 = interfaceC5563DkgAhC;
        this.A03 = new E46(interfaceC5563DkgAhC);
        this.A0C.A00(interfaceC6413E4p, e4i);
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A01 = j;
    }
}
