package X;

/* loaded from: classes4.dex */
public final class ARU extends AbstractC1439Aj8 implements InterfaceC1356Ahh, C1Z2 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // X.InterfaceC1356Ahh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi AQV(X.AXY r7, X.C3TG r8, long r9) {
        /*
            r6 = this;
            X.AKH<X.1DG> r0 = X.ARX.A00
            java.lang.Object r0 = X.ARZ.A01(r0, r6)
            X.1DG r0 = (X.C1DG) r0
            float r2 = r0.A00
            r5 = 0
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L11
            r2 = 0
        L11:
            X.AZE r4 = r8.AQW(r9)
            boolean r0 = r6.isAttached
            if (r0 == 0) goto L26
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L26
            int r0 = X.C1DG.A01(r2, r1)
            r3 = 1
            if (r0 > 0) goto L27
        L26:
            r3 = 0
        L27:
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L31
            int r5 = r7.Abr(r2)
        L31:
            int r2 = r4.A01
            if (r3 == 0) goto L39
            int r2 = java.lang.Math.max(r2, r5)
        L39:
            int r1 = r4.A00
            if (r3 == 0) goto L41
            int r1 = java.lang.Math.max(r1, r5)
        L41:
            X.BIL r0 = new X.BIL
            r0.<init>(r4, r2, r1)
            X.Abi r0 = X.AXY.A01(r7, r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARU.AQV(X.AXY, X.3TG, long):X.Abi");
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
