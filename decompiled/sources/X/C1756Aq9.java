package X;

/* renamed from: X.Aq9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1756Aq9 extends AbstractC1439Aj8 implements InterfaceC1758AqB, InterfaceC1237AfR, InterfaceC1403AiY, InterfaceC1760AqD, C1Z3 {
    public long A00;
    public C1756Aq9 A01;
    public InterfaceC1758AqB A02;
    public final G0U<C1759AqC, InterfaceC1758AqB> A03;
    public final Object A04;

    @Override // X.InterfaceC1403AiY
    public final /* synthetic */ void AUZ(InterfaceC1497Ak4 interfaceC1497Ak4) {
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A02 = null;
        this.A01 = null;
    }

    @Override // X.InterfaceC1237AfR
    public final Object AM2() {
        return this.A04;
    }

    @Override // X.InterfaceC1758AqB
    public final boolean ASp(C1759AqC c1759AqC) {
        C1756Aq9 c1756Aq9 = this.A01;
        if (c1756Aq9 != null) {
            return c1756Aq9.ASp(c1759AqC);
        }
        InterfaceC1758AqB interfaceC1758AqB = this.A02;
        if (interfaceC1758AqB != null) {
            return interfaceC1758AqB.ASp(c1759AqC);
        }
        return false;
    }

    @Override // X.InterfaceC1758AqB
    public final void ASz(C1759AqC c1759AqC) {
        BUX buxA00 = BUX.A00(c1759AqC, 14);
        if (buxA00.invoke(this) == EnumC1236AfQ.A03) {
            AbstractC1235AfP.A04(this, buxA00);
        }
    }

    @Override // X.InterfaceC1758AqB
    public final void AT1(C1759AqC c1759AqC) {
        InterfaceC1758AqB interfaceC1758AqB = this.A02;
        if (interfaceC1758AqB != null) {
            interfaceC1758AqB.AT1(c1759AqC);
            return;
        }
        C1756Aq9 c1756Aq9 = this.A01;
        if (c1756Aq9 != null) {
            c1756Aq9.AT1(c1759AqC);
        }
    }

    @Override // X.InterfaceC1758AqB
    public final void ATD(C1759AqC c1759AqC) {
        InterfaceC1758AqB interfaceC1758AqB = this.A02;
        if (interfaceC1758AqB != null) {
            interfaceC1758AqB.ATD(c1759AqC);
        }
        C1756Aq9 c1756Aq9 = this.A01;
        if (c1756Aq9 != null) {
            c1756Aq9.ATD(c1759AqC);
        }
        this.A01 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // X.InterfaceC1758AqB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AUD(X.C1759AqC r5) {
        /*
            r4 = this;
            X.Aq9 r3 = r4.A01
            if (r3 == 0) goto L3e
            android.view.DragEvent r0 = r5.A00
            float r1 = r0.getX()
            float r0 = r0.getY()
            long r0 = X.AnonymousClass007.A0A(r1, r0)
            boolean r1 = X.Ao8.A00(r3, r0)
            r0 = 1
            if (r1 != r0) goto L3e
            r1 = r3
        L1a:
            boolean r0 = X.C7384Etj.areEqual(r1, r3)
            if (r0 != 0) goto L30
            if (r1 == 0) goto L28
            r1.AT1(r5)
            r1.AUD(r5)
        L28:
            if (r3 == 0) goto L2d
        L2a:
            r3.ATD(r5)
        L2d:
            r4.A01 = r1
            return
        L30:
            if (r1 == 0) goto L36
            r1.AUD(r5)
            goto L2d
        L36:
            X.AqB r0 = r4.A02
            if (r0 == 0) goto L2d
            r0.AUD(r5)
            goto L2d
        L3e:
            X.Aj8 r0 = r4.node
            boolean r0 = r0.isAttached
            if (r0 != 0) goto L59
            r1 = 0
        L45:
            X.Aq9 r1 = (X.C1756Aq9) r1
            if (r1 == 0) goto L6b
            if (r3 != 0) goto L1a
            r1.AT1(r5)
            r1.AUD(r5)
            X.AqB r0 = r4.A02
            if (r0 == 0) goto L2d
            r0.ATD(r5)
            goto L2d
        L59:
            X.Hqv r2 = X.C3cG.A0z()
            r1 = 7
            X.BUn r0 = new X.BUn
            r0.<init>(r2, r5, r4, r1)
            X.AbstractC1235AfP.A04(r4, r0)
            T r1 = r2.element
            X.AfR r1 = (X.InterfaceC1237AfR) r1
            goto L45
        L6b:
            if (r3 == 0) goto L1a
            X.AqB r0 = r4.A02
            if (r0 == 0) goto L2a
            r0.AT1(r5)
            r0.AUD(r5)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1756Aq9.AUD(X.AqC):void");
    }

    @Override // X.InterfaceC1758AqB
    public final void AWC(C1759AqC c1759AqC) {
        InterfaceC1758AqB interfaceC1758AqB = this.A02;
        if (interfaceC1758AqB != null) {
            interfaceC1758AqB.AWC(c1759AqC);
            return;
        }
        C1756Aq9 c1756Aq9 = this.A01;
        if (c1756Aq9 != null) {
            c1756Aq9.AWC(c1759AqC);
        }
    }

    public C1756Aq9(G0U g0u) {
        this.A03 = g0u;
        this.A04 = C1761AqE.A00;
        this.A00 = 0L;
    }

    @Override // X.InterfaceC1403AiY, X.InterfaceC1407Aic
    public final void AVH(long j) {
        this.A00 = j;
    }

    public C1756Aq9() {
        this(null);
    }
}
