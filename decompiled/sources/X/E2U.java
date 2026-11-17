package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E2U implements InterfaceC6401E4d {
    public static final byte[] A0N = {73, 68, 51};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public InterfaceC5563Dkg A0A;
    public InterfaceC5563Dkg A0B;
    public InterfaceC5563Dkg A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final int A0H;
    public final C6340E1q A0I = new C6340E1q(new byte[7]);
    public final E1P A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;

    /* JADX WARN: Removed duplicated region for block: B:137:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0225  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r21) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2U.A6w(X.E1P):void");
    }

    public E2U(int i, String str, boolean z, String str2) {
        char[] cArr = E1P.A04;
        this.A0J = BV6.A0Z(Arrays.copyOf(A0N, 10));
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A0M = z;
        this.A0L = str;
        this.A0H = i;
        this.A0K = str2;
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A0D = E4I.A01(e4i);
        InterfaceC5563Dkg interfaceC5563DkgA00 = E4I.A00(interfaceC6413E4p, e4i);
        this.A0C = interfaceC5563DkgA00;
        this.A0A = interfaceC5563DkgA00;
        if (!this.A0M) {
            this.A0B = new C5551DkU();
            return;
        }
        e4i.A03();
        E4I.A02(e4i);
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 5);
        this.A0B = interfaceC5563DkgAhC;
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        E4I.A02(e4i);
        c6162Dx5A00.A0W = e4i.A01;
        c6162Dx5A00.A05(this.A0K);
        c6162Dx5A00.A06("application/id3");
        InterfaceC5563Dkg.A00(c6162Dx5A00, interfaceC5563DkgAhC);
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A09 = j;
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A09 = -9223372036854775807L;
        this.A0E = false;
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }
}
