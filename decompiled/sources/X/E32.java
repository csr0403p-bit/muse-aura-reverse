package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E32 implements InterfaceC6401E4d {
    public int A00;
    public boolean A01;
    public int A02;
    public long A03 = -9223372036854775807L;
    public final List<E53> A04;
    public final InterfaceC5563Dkg[] A05;

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        int i = 0;
        while (true) {
            InterfaceC5563Dkg[] interfaceC5563DkgArr = this.A05;
            if (i >= interfaceC5563DkgArr.length) {
                return;
            }
            E53 e53 = this.A04.get(i);
            e4i.A03();
            E4I.A02(e4i);
            InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 3);
            C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
            E4I.A02(e4i);
            c6162Dx5A00.A0W = e4i.A01;
            c6162Dx5A00.A05("video/mp2t");
            c6162Dx5A00.A06("application/dvbsubs");
            c6162Dx5A00.A0a = Collections.singletonList(e53.A01);
            c6162Dx5A00.A0Y = e53.A00;
            InterfaceC5563Dkg.A00(c6162Dx5A00, interfaceC5563DkgAhC);
            interfaceC5563DkgArr[i] = interfaceC5563DkgAhC;
            i++;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A01 = false;
        this.A03 = -9223372036854775807L;
    }

    @Override // X.InterfaceC6401E4d
    public final void A6w(E1P e1p) {
        boolean z = this.A01;
        if (z) {
            int i = this.A00;
            if (i == 2) {
                if (e1p.A04() == 0) {
                    return;
                }
                if (e1p.A0A() != 32) {
                    this.A01 = false;
                    z = false;
                }
                this.A00 = 1;
                i = 1;
                if (!z) {
                    return;
                }
            }
            if (i == 1) {
                if (e1p.A04() == 0) {
                    return;
                }
                if (e1p.A0A() != 0) {
                    this.A01 = false;
                    z = false;
                }
                this.A00 = 0;
                if (!z) {
                    return;
                }
            }
            int i2 = e1p.A01;
            int iA04 = e1p.A04();
            for (InterfaceC5563Dkg interfaceC5563Dkg : this.A05) {
                e1p.A0R(i2);
                interfaceC5563Dkg.Abv(e1p, iA04);
            }
            this.A02 += iA04;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
        if (this.A01) {
            C1G.A08(AnonymousClass002.A1L((this.A03 > (-9223372036854775807L) ? 1 : (this.A03 == (-9223372036854775807L) ? 0 : -1))));
            for (InterfaceC5563Dkg interfaceC5563Dkg : this.A05) {
                InterfaceC5563Dkg.A02(interfaceC5563Dkg, this.A02, this.A03);
            }
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        if ((i & 4) != 0) {
            this.A01 = true;
            this.A03 = j;
            this.A02 = 0;
            this.A00 = 2;
        }
    }

    public E32(List list) {
        this.A04 = list;
        this.A05 = new InterfaceC5563Dkg[list.size()];
    }
}
