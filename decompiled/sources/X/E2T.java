package X;

/* loaded from: classes5.dex */
public final class E2T implements InterfaceC6401E4d {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public C6154Dwx A08;
    public InterfaceC5563Dkg A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public final int A0I;
    public final C6340E1q A0J;
    public final E1P A0K;
    public final String A0L;

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A0H = 0;
        this.A07 = -9223372036854775807L;
        this.A0D = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0221, code lost:
    
        throw new androidx.media3.common.ParserException(null, null, 1, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r16) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2T.A6w(X.E1P):void");
    }

    public E2T(String str, int i) {
        this.A0L = str;
        this.A0I = i;
        E1P e1pA0Y = BV6.A0Y(1024);
        this.A0K = e1pA0Y;
        this.A0J = new C6340E1q(e1pA0Y.A02);
        this.A07 = -9223372036854775807L;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        e4i.A03();
        this.A09 = E4I.A00(interfaceC6413E4p, e4i);
        E4I.A02(e4i);
        this.A0B = e4i.A01;
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A07 = j;
    }
}
