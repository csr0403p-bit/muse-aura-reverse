package X;

import androidx.media3.common.ParserException;

/* renamed from: X.E3r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6389E3r implements E50 {
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C6154Dwx A04;
    public final InterfaceC6413E4p A05;
    public final InterfaceC5563Dkg A06;
    public final C6403E4f A07;

    @Override // X.E50
    public final void ANY(int i, long j) {
        E4A e4a = new E4A(this.A07, 1, i, j);
        this.A05.AcM(e4a);
        InterfaceC5563Dkg interfaceC5563Dkg = this.A06;
        interfaceC5563Dkg.ABq(this.A04);
        interfaceC5563Dkg.A9m(e4a.A01);
    }

    @Override // X.E50
    public final void AbK(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }

    @Override // X.E50
    public final boolean Abx(E2K e2k, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.A00) < (i2 = this.A03)) {
            int iAbu = this.A06.Abu(e2k, BV4.A01(i2 - i, j2), true);
            if (iAbu == -1) {
                j2 = 0;
            } else {
                this.A00 += iAbu;
                j2 -= iAbu;
            }
        }
        int i3 = this.A07.A01;
        int i4 = this.A00 / i3;
        if (i4 > 0) {
            long jA0I = this.A02 + BV8.A0I(this.A01, r4.A03);
            int i5 = i4 * i3;
            int i6 = this.A00 - i5;
            this.A06.Abz(null, 1, i5, i6, jA0I);
            this.A01 += i4;
            this.A00 = i6;
        }
        return j2 <= 0;
    }

    public C6389E3r(InterfaceC6413E4p interfaceC6413E4p, InterfaceC5563Dkg interfaceC5563Dkg, C6403E4f c6403E4f, String str, int i) throws ParserException {
        this.A05 = interfaceC6413E4p;
        this.A06 = interfaceC5563Dkg;
        this.A07 = c6403E4f;
        int i2 = c6403E4f.A04;
        int i3 = (c6403E4f.A00 * i2) / 8;
        int i4 = c6403E4f.A01;
        if (i4 != i3) {
            throw BV8.A0c(FGI.A0T("Expected block size: ", "; got: ", i3, i4));
        }
        int i5 = c6403E4f.A03;
        int i6 = i5 * i3;
        int i7 = i6 * 8;
        int iMax = Math.max(i3, i6 / 10);
        this.A03 = iMax;
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        c6162Dx5A00.A05("audio/wav");
        c6162Dx5A00.A06(str);
        c6162Dx5A00.A03 = i7;
        c6162Dx5A00.A0G = i7;
        c6162Dx5A00.A0C = iMax;
        c6162Dx5A00.A04 = i2;
        c6162Dx5A00.A0J = i5;
        c6162Dx5A00.A0F = i;
        this.A04 = BV6.A0U(c6162Dx5A00);
    }
}
