package X;

/* loaded from: classes4.dex */
public final class BTM implements Ht9, G0V {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public BTM(C1943Aug c1943Aug, C1949Aun c1949Aun, G0V g0v, int i) {
        this.$t = i;
        if (2 - i != 0) {
            this.A00 = c1949Aun;
            this.A01 = g0v;
            this.A02 = c1943Aug;
        } else {
            this.A00 = c1943Aug;
            this.A01 = c1949Aun;
            this.A02 = g0v;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[PHI: r9
  0x00d1: PHI (r9v3 X.BFM) = (r9v1 X.BFM), (r9v4 X.BFM) binds: [B:16:0x00bb, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.G0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int r0 = r8.$t
            switch(r0) {
                case 0: goto L31;
                case 1: goto L65;
                case 2: goto La1;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r8.A00
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A02
            X.BFM r9 = (X.BFM) r9
            int r1 = X.AnonymousClass001.A0F(r10)
            boolean r0 = X.AnonymousClass004.A1E(r1)
            boolean r0 = X.AnonymousClass001.A1b(r0, r9, r1)
            if (r0 == 0) goto Ld1
            X.AKH<X.Axn> r0 = X.AbstractC1965AvH.A00
            X.AKJ r2 = r0.A04(r2)
            r0 = 10
            X.BTC r1 = new X.BTC
            r1.<init>(r0, r4, r3)
            r0 = 610483127(0x24633bb7, float:4.927336E-17)
            X.AnonymousClass003.A0m(r9, r2, r1, r0)
        L2e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L31:
            java.lang.Object r6 = r8.A00
            X.ASv r6 = (X.C1051ASv) r6
            java.lang.Object r7 = r8.A01
            androidx.compose.foundation.gestures.ScrollingLogic r7 = (androidx.compose.foundation.gestures.ScrollingLogic) r7
            java.lang.Object r5 = r8.A02
            X.Afu r5 = (X.InterfaceC1258Afu) r5
            float r1 = X.AnonymousClass001.A02(r9)
            float r0 = r6.element
            float r1 = r1 - r0
            float r0 = androidx.compose.foundation.gestures.ScrollingLogic.A00(r7, r1, r1)
            long r3 = r7.A04(r0)
            r2 = 1
            X.Afy r5 = (X.C1259Afy) r5
            androidx.compose.foundation.gestures.ScrollingLogic r1 = r5.A00
            X.3Q0 r0 = r1.A04
            long r0 = androidx.compose.foundation.gestures.ScrollingLogic.A01(r0, r1, r2, r3)
            float r0 = r7.A02(r0)
            float r1 = androidx.compose.foundation.gestures.ScrollingLogic.A00(r7, r0, r0)
            float r0 = r6.element
            float r0 = r0 + r1
            r6.element = r0
            goto L2e
        L65:
            java.lang.Object r7 = r8.A00
            X.BO7 r7 = (X.BO7) r7
            java.lang.Object r5 = r8.A01
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r5
            java.lang.Object r6 = r8.A02
            X.BO7 r6 = (X.BO7) r6
            X.Agk r9 = (X.C1299Agk) r9
            X.AWx r10 = (X.AWx) r10
            long r2 = r7.element
            long r0 = r10.A00
            long r3 = X.AWx.A05(r2, r0)
            r7.element = r3
            X.AWv r2 = X.AWv.A02
            long r0 = r6.element
            long r0 = X.AWx.A05(r0, r3)
            r5.A0L(r2, r0)
            long r0 = r5.A09()
            boolean r0 = r5.A0M(r0)
            if (r0 == 0) goto L2e
            r9.A02()
            X.0dx r1 = r5.A05
            if (r1 == 0) goto L2e
            r0 = 9
            r1.AXr(r0)
            goto L2e
        La1:
            java.lang.Object r4 = r8.A00
            X.Aug r4 = (X.C1943Aug) r4
            java.lang.Object r3 = r8.A01
            X.Aun r3 = (X.C1949Aun) r3
            java.lang.Object r2 = r8.A02
            X.G0V r2 = (X.G0V) r2
            X.BFM r9 = (X.BFM) r9
            int r1 = X.AnonymousClass001.A0F(r10)
            boolean r0 = X.AnonymousClass004.A1E(r1)
            boolean r0 = X.AnonymousClass001.A1b(r0, r9, r1)
            if (r0 == 0) goto Ld1
            r0 = 3
            X.BTM r1 = new X.BTM
            r1.<init>(r4, r3, r2, r0)
            r0 = -284825865(0xffffffffef05e6f7, float:-4.1440726E28)
            X.B1U r1 = X.B1V.A00(r9, r1, r0)
            r0 = 48
            X.AbstractC1914Atb.A02(r4, r9, r1, r0)
            goto L2e
        Ld1:
            r9.Afo()
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTM.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public BTM(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
