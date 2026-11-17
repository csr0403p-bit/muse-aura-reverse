package X;

/* loaded from: classes5.dex */
public final class E2F implements InterfaceC6401E4d {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public long A04;
    public InterfaceC5563Dkg A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final E1P A0A;
    public final E2M A0B;
    public final String A0C;
    public final String A0D;

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2F.A6w(X.E1P):void");
    }

    public E2F(String str, int i, String str2) {
        E1P e1pA0Y = BV6.A0Y(4);
        this.A0A = e1pA0Y;
        e1pA0Y.A02[0] = -1;
        this.A0B = new E2M();
        this.A04 = -9223372036854775807L;
        this.A0D = str;
        this.A09 = i;
        this.A0C = str2;
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A06 = E4I.A01(e4i);
        this.A05 = E4I.A00(interfaceC6413E4p, e4i);
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A04 = j;
    }
}
