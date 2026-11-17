package X;

/* renamed from: X.E3l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6384E3l implements InterfaceC6401E4d {
    public static final double[] A0H = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC5563Dkg A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final E1P A0B;
    public final E4R A0C;
    public final E4B A0D;
    public final C6372E2z A0E;
    public final String A0F;
    public final boolean[] A0G = new boolean[4];

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r27) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6384E3l.A6w(X.E1P):void");
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
        InterfaceC5563Dkg interfaceC5563Dkg = this.A05;
        C1G.A05(interfaceC5563Dkg);
        if (z) {
            boolean z2 = this.A09;
            InterfaceC5563Dkg.A01(interfaceC5563Dkg, z2 ? 1 : 0, (int) (this.A04 - this.A02), this.A03);
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        boolean[] zArr = this.A0G;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        E4R e4r = this.A0C;
        e4r.A02 = false;
        e4r.A00 = 0;
        e4r.A01 = 0;
        E4B e4b = this.A0D;
        if (e4b != null) {
            e4b.A02 = false;
            e4b.A01 = false;
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    public C6384E3l(C6372E2z c6372E2z, String str) {
        E1P e1pA0X;
        this.A0E = c6372E2z;
        this.A0F = str;
        E4R e4r = new E4R();
        e4r.A03 = new byte[128];
        this.A0C = e4r;
        if (c6372E2z != null) {
            this.A0D = new E4B(178);
            e1pA0X = BV6.A0X();
        } else {
            e1pA0X = null;
            this.A0D = null;
        }
        this.A0B = e1pA0X;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A06 = E4I.A01(e4i);
        E4I.A02(e4i);
        this.A05 = interfaceC6413E4p.AhC(e4i.A00, 2);
        C6372E2z c6372E2z = this.A0E;
        if (c6372E2z != null) {
            c6372E2z.A01(interfaceC6413E4p, e4i);
        }
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A01 = j;
    }
}
