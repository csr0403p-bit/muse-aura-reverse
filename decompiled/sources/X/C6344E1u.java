package X;

/* renamed from: X.E1u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6344E1u implements InterfaceC6401E4d {
    public int A00;
    public int A01;
    public InterfaceC5563Dkg A03;
    public boolean A04;
    public final E1P A05 = BV6.A0Y(10);
    public long A02 = -9223372036854775807L;

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A04 = false;
        this.A02 = -9223372036854775807L;
    }

    @Override // X.InterfaceC6401E4d
    public final void A6w(E1P e1p) {
        C1G.A05(this.A03);
        if (this.A04) {
            int iA04 = e1p.A04();
            int i = this.A00;
            if (i < 10) {
                int iMin = Math.min(iA04, 10 - i);
                byte[] bArr = e1p.A02;
                int i2 = e1p.A01;
                E1P e1p2 = this.A05;
                System.arraycopy(bArr, i2, e1p2.A02, i, iMin);
                if (this.A00 + iMin == 10) {
                    e1p2.A0R(0);
                    if (73 != e1p2.A0A() || 68 != e1p2.A0A() || 51 != e1p2.A0A()) {
                        CNC.A04("Id3Reader", "Discarding invalid ID3 tag");
                        this.A04 = false;
                        return;
                    } else {
                        e1p2.A0S(3);
                        this.A01 = e1p2.A09() + 10;
                    }
                }
            }
            int iA0F = C8j3.A0F(this.A01, this.A00, iA04);
            this.A03.Abv(e1p, iA0F);
            this.A00 += iA0F;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
        int i;
        InterfaceC5563Dkg interfaceC5563Dkg = this.A03;
        C1G.A05(interfaceC5563Dkg);
        if (this.A04 && (i = this.A01) != 0 && this.A00 == i) {
            long j = this.A02;
            C1G.A08(AnonymousClass002.A1L((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
            InterfaceC5563Dkg.A02(interfaceC5563Dkg, i, j);
            this.A04 = false;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        if ((i & 4) != 0) {
            this.A04 = true;
            this.A02 = j;
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        e4i.A03();
        E4I.A02(e4i);
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 5);
        this.A03 = interfaceC5563DkgAhC;
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        E4I.A02(e4i);
        c6162Dx5A00.A0W = e4i.A01;
        c6162Dx5A00.A05("video/mp2t");
        c6162Dx5A00.A06("application/id3");
        InterfaceC5563Dkg.A00(c6162Dx5A00, interfaceC5563DkgAhC);
    }
}
