package X;

/* renamed from: X.EbZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6877EbZ implements InterfaceC6833Eal {
    public boolean A00;
    public boolean A01;
    public final C6818EaW A02 = new C6818EaW();
    public final /* synthetic */ C6878Eba A03;

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) {
        C7384Etj.A0Y(c6818EaW, 0);
        byte[] bArr = AbstractC6843Eav.A06;
        C6818EaW c6818EaW2 = this.A02;
        c6818EaW2.Aib(c6818EaW, j);
        while (c6818EaW2.A00 >= 16384) {
            A00(false);
        }
    }

    public C6877EbZ(C6878Eba c6878Eba, boolean z) {
        this.A03 = c6878Eba;
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r1 = X.BV4.A01(r4, r0 - r2);
        r12 = r8.A0N;
        r9 = java.lang.Math.min(r1, r12.A00);
        r0 = r9;
        r8.A08 = r2 + r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(boolean r14) {
        /*
            r13 = this;
            X.Eba r9 = r13.A03
            monitor-enter(r9)
            X.Ebo r6 = r9.A0D     // Catch: java.lang.Throwable -> Lbd
            r6.A07()     // Catch: java.lang.Throwable -> Lbd
        L8:
            long r2 = r9.A03     // Catch: java.lang.Throwable -> Lb8
            long r0 = r9.A02     // Catch: java.lang.Throwable -> Lb8
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L2b
            boolean r0 = r13.A01     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L2b
            boolean r0 = r13.A00     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L2b
            X.Ec2 r0 = r9.A01()     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L2b
            r9.wait()     // Catch: java.lang.InterruptedException -> L22 java.lang.Throwable -> Lb8
            goto L8
        L22:
            X.BV4.A1A()     // Catch: java.lang.Throwable -> Lb8
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lb8
            r0.<init>()     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        L2b:
            r6.A09()     // Catch: java.lang.Throwable -> Lbd
            r9.A04()     // Catch: java.lang.Throwable -> Lbd
            long r4 = r9.A02     // Catch: java.lang.Throwable -> Lbd
            long r2 = r9.A03     // Catch: java.lang.Throwable -> Lbd
            long r4 = r4 - r2
            X.EaW r7 = r13.A02     // Catch: java.lang.Throwable -> Lbd
            long r0 = r7.A00     // Catch: java.lang.Throwable -> Lbd
            long r4 = java.lang.Math.min(r4, r0)     // Catch: java.lang.Throwable -> Lbd
            long r2 = r2 + r4
            r9.A03 = r2     // Catch: java.lang.Throwable -> Lbd
            if (r14 == 0) goto L48
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r10 = 1
            if (r2 == 0) goto L49
        L48:
            r10 = 0
        L49:
            monitor-exit(r9)
            r6.A07()
            X.Ebb r8 = r9.A09     // Catch: java.lang.Throwable -> Lb3
            int r11 = r9.A07     // Catch: java.lang.Throwable -> Lb3
            r1 = 0
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L5e
            X.EbV r0 = r8.A0N     // Catch: java.lang.Throwable -> Lb3
            r0.A04(r7, r11, r1, r10)     // Catch: java.lang.Throwable -> Lb3
            goto Laf
        L5e:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto Laf
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Lb3
            goto L71
        L64:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
            if (r0 == 0) goto L9b
            r8.wait()     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
        L71:
            long r2 = r8.A08     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
            long r0 = r8.A07     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 < 0) goto L7c
            java.util.Map<java.lang.Integer, X.Eba> r0 = r8.A0F     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
            goto L64
        L7c:
            long r0 = r0 - r2
            int r1 = X.BV4.A01(r4, r0)     // Catch: java.lang.Throwable -> Lac
            X.EbV r12 = r8.A0N     // Catch: java.lang.Throwable -> Lac
            int r0 = r12.A00     // Catch: java.lang.Throwable -> Lac
            int r9 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> Lac
            long r0 = (long) r9     // Catch: java.lang.Throwable -> Lac
            long r2 = r2 + r0
            r8.A08 = r2     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb3
            long r4 = r4 - r0
            if (r10 == 0) goto L96
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L97
        L96:
            r0 = 0
        L97:
            r12.A04(r7, r11, r9, r0)     // Catch: java.lang.Throwable -> Lb3
            goto L5e
        L9b:
            java.lang.String r0 = "stream closed"
            java.io.IOException r0 = X.BV4.A0K(r0)     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
            throw r0     // Catch: java.lang.InterruptedException -> La3 java.lang.Throwable -> Lac
        La3:
            X.BV4.A1A()     // Catch: java.lang.Throwable -> Lac
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lac
            r0.<init>()     // Catch: java.lang.Throwable -> Lac
            throw r0     // Catch: java.lang.Throwable -> Lac
        Lac:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Laf:
            r6.A09()
            return
        Lb3:
            r0 = move-exception
            r6.A09()
            throw r0
        Lb8:
            r0 = move-exception
            r6.A09()     // Catch: java.lang.Throwable -> Lbd
            throw r0     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6877EbZ.A00(boolean):void");
    }

    @Override // X.InterfaceC6833Eal
    public final C6848Eb1 Ags() {
        return this.A03.A0D;
    }

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C6878Eba c6878Eba = this.A03;
        byte[] bArr = AbstractC6843Eav.A06;
        synchronized (c6878Eba) {
            if (this.A00) {
                return;
            }
            boolean zA1Y = AnonymousClass002.A1Y(c6878Eba.A01());
            if (!c6878Eba.A0A.A01) {
                C6818EaW c6818EaW = this.A02;
                if (c6818EaW.A00 > 0) {
                    while (c6818EaW.A00 > 0) {
                        A00(true);
                    }
                } else if (zA1Y) {
                    C6879Ebb c6879Ebb = c6878Eba.A09;
                    c6879Ebb.A0N.A04(null, c6878Eba.A07, 0, true);
                }
            }
            synchronized (c6878Eba) {
                this.A00 = true;
            }
            c6878Eba.A09.A0N.A01();
            c6878Eba.A03();
        }
    }

    @Override // X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() {
        C6878Eba c6878Eba = this.A03;
        byte[] bArr = AbstractC6843Eav.A06;
        synchronized (c6878Eba) {
            c6878Eba.A04();
        }
        while (this.A02.A00 > 0) {
            A00(false);
            c6878Eba.A09.A0N.A01();
        }
    }
}
