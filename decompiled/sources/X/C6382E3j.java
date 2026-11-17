package X;

/* renamed from: X.E3j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6382E3j implements InterfaceC6401E4d {
    public static final float[] A0B = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public long A00;
    public long A01;
    public InterfaceC5563Dkg A02;
    public E4D A03;
    public String A04;
    public boolean A05;
    public final E1P A06;
    public final E4K A07;
    public final E4B A08;
    public final C6372E2z A09;
    public final boolean[] A0A = new boolean[4];

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r23) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6382E3j.A6w(X.E1P):void");
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
        E4D e4d = this.A03;
        C1G.A05(e4d);
        if (z) {
            e4d.A00(this.A01, 0, this.A05);
            E4D e4d2 = this.A03;
            e4d2.A04 = false;
            e4d2.A03 = false;
            e4d2.A05 = false;
            e4d2.A00 = -1;
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        E4K e4k = this.A07;
        e4k.A03 = false;
        e4k.A00 = 0;
        e4k.A01 = 0;
        E4D e4d = this.A03;
        if (e4d != null) {
            e4d.A04 = false;
            e4d.A03 = false;
            e4d.A05 = false;
            e4d.A00 = -1;
        }
        E4B e4b = this.A08;
        e4b.A02 = false;
        e4b.A01 = false;
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
    }

    public C6382E3j(C6372E2z c6372E2z) {
        this.A09 = c6372E2z;
        E4K e4k = new E4K();
        e4k.A04 = new byte[128];
        this.A07 = e4k;
        this.A00 = -9223372036854775807L;
        this.A08 = new E4B(178);
        this.A06 = BV6.A0X();
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A04 = E4I.A01(e4i);
        E4I.A02(e4i);
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(e4i.A00, 2);
        this.A02 = interfaceC5563DkgAhC;
        this.A03 = new E4D(interfaceC5563DkgAhC);
        this.A09.A01(interfaceC6413E4p, e4i);
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A00 = j;
    }
}
