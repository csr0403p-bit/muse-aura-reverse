package X;

/* renamed from: X.DiU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5433DiU implements InterfaceC6022DuF {
    public boolean A00;
    public final int A01;
    public final C5422DiI<T> A02;
    public final C5426DiN A03;
    public final /* synthetic */ C5422DiI A04;

    @Override // X.InterfaceC6022DuF
    public final void AQQ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5433DiU(C5426DiN c5426DiN, C5422DiI<T> c5422DiI, C5426DiN c5426DiN2, int i) {
        this.A04 = c5422DiI;
        this.A02 = c5426DiN2;
        this.A03 = c5426DiN;
        this.A01 = i;
    }

    private void A00() {
        if (this.A00) {
            return;
        }
        C5422DiI c5422DiI = this.A04;
        C6013Dtw c6013Dtw = c5422DiI.A0J;
        int[] iArr = c5422DiI.A0X;
        int i = this.A01;
        c6013Dtw.A05(c5422DiI.A0Z[i], null, iArr[i], 0, c5422DiI.A01);
        this.A00 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (X.AbstractC5653Dmh.A03(X.EnumC5618Dlz.A0W) != false) goto L10;
     */
    @Override // X.InterfaceC6022DuF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZE(X.Di2 r6, X.C5406Dhz r7, int r8) {
        /*
            r5 = this;
            X.DiI r3 = r5.A04
            boolean r0 = r3.A0F()
            r4 = -3
            if (r0 != 0) goto L29
            X.DiH r2 = r3.A09
            if (r2 == 0) goto L2a
            int r0 = r5.A01
            int r1 = r0 + 1
            int[] r0 = r2.A01
            X.C1G.A05(r0)
            r2 = r0[r1]
            X.DiN r0 = r5.A03
            int r1 = r0.A00
            int r0 = r0.A03
            int r1 = r1 + r0
            if (r2 > r1) goto L2a
            X.Dlz r0 = X.EnumC5618Dlz.A0W
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            if (r0 == 0) goto L2a
        L29:
            return r4
        L2a:
            r5.A00()
            X.DiN r1 = r5.A03
            boolean r0 = r3.A0E
            int r4 = r1.A05(r6, r7, r8, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5433DiU.AZE(X.Di2, X.Dhz, int):int");
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        C5422DiI c5422DiI = this.A04;
        if (c5422DiI.A0F()) {
            return 0;
        }
        C5426DiN c5426DiN = this.A03;
        int iA04 = c5426DiN.A04(j, c5422DiI.A0E);
        if (c5422DiI.A09 != null && AbstractC5653Dmh.A03(EnumC5618Dlz.A0W)) {
            iA04 = Math.min(iA04, Math.max(0, C1G.A01(c5426DiN, c5422DiI.A09, this.A01 + 1)));
        }
        c5426DiN.A0B(iA04);
        if (iA04 > 0) {
            A00();
        }
        return iA04;
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        C5422DiI c5422DiI = this.A04;
        return !c5422DiI.A0F() && this.A03.A0E(c5422DiI.A0E);
    }
}
