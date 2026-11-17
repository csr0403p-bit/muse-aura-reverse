package X;

/* renamed from: X.3bY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bY implements Ht9, G0V {
    public final int $t;
    public final long A00;
    public final Object A01;
    public final Object A02;

    public C3bY(Float f, G0V g0v, int i, long j) {
        this.$t = i;
        if (i != 0) {
            this.A00 = j;
            this.A01 = f;
            this.A02 = g0v;
        } else {
            this.A01 = f;
            this.A02 = g0v;
            this.A00 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[PHI: r9
  0x0077: PHI (r9v2 X.BFM) = (r9v1 X.BFM), (r9v3 X.BFM) binds: [B:10:0x0049, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.G0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int r0 = r8.$t
            if (r0 == 0) goto L33
            long r6 = r8.A00
            java.lang.Object r3 = r8.A01
            java.lang.Float r3 = (java.lang.Float) r3
            java.lang.Object r4 = r8.A02
            X.G0V r4 = (X.G0V) r4
            X.BFM r9 = (X.BFM) r9
            int r1 = X.AnonymousClass001.A0F(r10)
            boolean r0 = X.AnonymousClass004.A1E(r1)
            boolean r0 = X.AnonymousClass001.A1b(r0, r9, r1)
            if (r0 == 0) goto L77
            X.AKH<X.B6A> r0 = X.C17l.A00
            X.AKJ r1 = X.AnonymousClass003.A0T(r0, r6)
            r5 = 0
            X.3bY r2 = new X.3bY
            r2.<init>(r3, r4, r5, r6)
            r0 = -1624601445(0xffffffff9f2a8c9b, float:-3.6115206E-20)
            X.AnonymousClass003.A0m(r9, r1, r2, r0)
        L30:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L33:
            java.lang.Object r5 = r8.A01
            java.lang.Object r4 = r8.A02
            X.G0V r4 = (X.G0V) r4
            long r2 = r8.A00
            X.BFM r9 = (X.BFM) r9
            int r1 = X.AnonymousClass001.A0F(r10)
            boolean r0 = X.AnonymousClass004.A1E(r1)
            boolean r0 = X.AnonymousClass001.A1b(r0, r9, r1)
            if (r0 == 0) goto L77
            if (r5 == 0) goto L62
            r0 = 1484860324(0x58812ba4, float:1.13619548E15)
            r9.AgE(r0)
            X.AKH<java.lang.Float> r0 = X.C17p.A00
            X.AKJ r1 = r0.A04(r5)
        L59:
            r0 = 8
            X.AKT.A01(r9, r1, r4, r0)
            X.AnonymousClass002.A19(r9)
            goto L30
        L62:
            r0 = 1485059902(0x5884373e, float:1.16298239E15)
            r9.AgE(r0)
            X.AKH<java.lang.Float> r1 = X.C17p.A00
            float r0 = X.B6A.A00(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.AKJ r1 = r1.A04(r0)
            goto L59
        L77:
            r9.Afo()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3bY.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
