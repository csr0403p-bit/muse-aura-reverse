package X;

/* renamed from: X.E2g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6354E2g implements InterfaceC6401E4d {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C6154Dwx A04;
    public InterfaceC5563Dkg A05;
    public String A06;
    public boolean A07;
    public int A08;
    public final int A09;
    public final C6340E1q A0A;
    public final String A0B;
    public final String A0C;
    public final E1P A0D;

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        r9.A08 = 1;
        r1 = r9.A0D.A02;
        r1[0] = -84;
        r0 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        if (r3 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        r0 = 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
    
        r1[1] = (byte) r0;
        r9.A00 = 2;
     */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6354E2g.A6w(X.E1P):void");
    }

    public C6354E2g(String str, int i, String str2) {
        C6340E1q c6340E1q = new C6340E1q(new byte[16]);
        this.A0A = c6340E1q;
        this.A0D = BV6.A0Z(c6340E1q.A03);
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A03 = -9223372036854775807L;
        this.A0C = str;
        this.A09 = i;
        this.A0B = str2;
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
        this.A03 = j;
    }
}
