package X;

/* loaded from: classes5.dex */
public abstract class E44 {
    public E4G A00;
    public final E4C A01;
    public final E51 A02;
    public final int A03;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r5 == r23.AIu()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        r24.A00 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(X.E2K r23, X.C5542DkK r24) {
        /*
            r22 = this;
        L0:
            r9 = r22
            X.E4G r4 = r9.A00
            X.C1G.A05(r4)
            long r2 = r4.A02
            long r7 = r4.A00
            long r5 = r4.A04
            long r7 = r7 - r2
            int r0 = r9.A03
            long r0 = (long) r0
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = r23
            r7 = r24
            if (r10 > 0) goto L2d
            r0 = 0
            r9.A00 = r0
            X.E51 r0 = r9.A02
            r0.AVf()
        L21:
            long r0 = r8.AIu()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto Lbd
            r7.A00 = r2
        L2b:
            r0 = 1
            return r0
        L2d:
            long r2 = r8.AIu()
            long r0 = r5 - r2
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 < 0) goto Lb1
            r10 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto Lb1
            int r2 = (int) r0
            r8.Afm(r2)
            r8.AbN()
            X.E51 r1 = r9.A02
            long r10 = r4.A07
            X.E4y r2 = r1.AcJ(r8, r10)
            int r3 = r2.A00
            r0 = -3
            if (r3 == r0) goto Lab
            r0 = -2
            if (r3 == r0) goto L7a
            r0 = -1
            if (r3 == r0) goto L8f
            long r2 = r2.A01
            long r10 = r8.AIu()
            long r4 = r2 - r10
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L73
            r10 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L73
            int r0 = (int) r4
            r8.Afm(r0)
        L73:
            r0 = 0
            r9.A00 = r0
            r1.AVf()
            goto L21
        L7a:
            long r12 = r2.A02
            long r2 = r2.A01
            r4.A03 = r12
            r4.A02 = r2
            long r14 = r4.A01
            long r5 = r4.A00
            long r0 = r4.A05
            r20 = r0
            r16 = r2
            r18 = r5
            goto La3
        L8f:
            long r14 = r2.A02
            long r2 = r2.A01
            r4.A01 = r14
            r4.A00 = r2
            long r12 = r4.A03
            long r5 = r4.A02
            long r0 = r4.A05
            r20 = r0
            r16 = r5
            r18 = r2
        La3:
            long r0 = X.E4G.A00(r10, r12, r14, r16, r18, r20)
            r4.A04 = r0
            goto L0
        Lab:
            r0 = 0
            r9.A00 = r0
            r1.AVf()
        Lb1:
            long r1 = r8.AIu()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbd
            r7.A00 = r5
            goto L2b
        Lbd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E44.A00(X.E2K, X.DkK):int");
    }

    public final void A01(long j) {
        E4G e4g = this.A00;
        if (e4g == null || e4g.A06 != j) {
            E4C e4c = this.A01;
            this.A00 = new E4G(j, e4c.A04.Agr(j), e4c.A02, e4c.A03, e4c.A01, e4c.A00);
        }
    }

    public E44(E5Y e5y, E51 e51, int i, long j, long j2, long j3, long j4, long j5) {
        this.A02 = e51;
        this.A03 = i;
        this.A01 = new E4C(e5y, j, j2, j3, j4, j5);
    }
}
