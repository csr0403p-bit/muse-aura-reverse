package X;

/* renamed from: X.Ebd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6881Ebd implements InterfaceC6834Eam {
    public C6844Eaw A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final /* synthetic */ C6878Eba A06;
    public final C6818EaW A05 = new C6818EaW();
    public final C6818EaW A04 = new C6818EaW();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        throw X.BV4.A0K("stream closed");
     */
    @Override // X.InterfaceC6834Eam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AZ7(X.C6818EaW r25, long r26) throws java.lang.Throwable {
        /*
            r24 = this;
            r0 = 0
            r10 = r25
            X.C7384Etj.A0Y(r10, r0)
            r12 = 0
            r4 = r26
            int r0 = (r26 > r12 ? 1 : (r26 == r12 ? 0 : -1))
            if (r0 >= 0) goto L19
            java.lang.String r1 = "byteCount < 0: "
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.IllegalArgumentException r8 = X.C7384Etj.A0D(r0, r1)
        L18:
            throw r8
        L19:
            r6 = r24
            X.Eba r9 = r6.A06
            monitor-enter(r9)
            X.Ebo r11 = r9.A0C     // Catch: java.lang.Throwable -> Lc9
            r11.A07()     // Catch: java.lang.Throwable -> Lc9
            X.Ec2 r0 = r9.A01()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L8c
            java.io.IOException r8 = r9.A04     // Catch: java.lang.Throwable -> Lc4
            if (r8 != 0) goto L39
            X.Ec2 r0 = r9.A01()     // Catch: java.lang.Throwable -> Lc4
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Throwable -> Lc4
            okhttp3.internal.http2.StreamResetException r8 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Lc4
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lc4
        L39:
            boolean r0 = r6.A01     // Catch: java.lang.Throwable -> Lc4
            if (r0 != 0) goto Lbc
            X.EaW r3 = r6.A04     // Catch: java.lang.Throwable -> Lc4
            long r0 = r3.A00     // Catch: java.lang.Throwable -> Lc4
            r16 = -1
            r15 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L8e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.lang.Throwable -> Lc4
            long r2 = r3.AZ7(r10, r0)     // Catch: java.lang.Throwable -> Lc4
            long r6 = r9.A01     // Catch: java.lang.Throwable -> Lc4
            long r6 = r6 + r2
            r9.A01 = r6     // Catch: java.lang.Throwable -> Lc4
            long r0 = r9.A00     // Catch: java.lang.Throwable -> Lc4
            long r6 = r6 - r0
            if (r8 != 0) goto L9a
            X.Ebb r12 = r9.A09     // Catch: java.lang.Throwable -> Lc4
            X.EcN r0 = r12.A0P     // Catch: java.lang.Throwable -> Lc4
            int r0 = r0.A00()     // Catch: java.lang.Throwable -> Lc4
            int r0 = r0 / 2
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lc4
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 < 0) goto L9a
            int r13 = r9.A07     // Catch: java.lang.Throwable -> Lc4
            X.EcV r1 = r12.A0J     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r14 = X.BV8.A15(r12, r13)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "] windowUpdate"
            java.lang.String r19 = X.AnonymousClass001.A0v(r0, r14)     // Catch: java.lang.Throwable -> Lc4
            X.EcD r0 = new X.EcD     // Catch: java.lang.Throwable -> Lc4
            r20 = r12
            r21 = r13
            r22 = r6
            r18 = r0
            r18.<init>(r19, r20, r21, r22)     // Catch: java.lang.Throwable -> Lc4
            r1.A02(r0)     // Catch: java.lang.Throwable -> Lc4
            long r0 = r9.A01     // Catch: java.lang.Throwable -> Lc4
            r9.A00 = r0     // Catch: java.lang.Throwable -> Lc4
            goto L9a
        L8c:
            r8 = 0
            goto L39
        L8e:
            boolean r0 = r6.A02     // Catch: java.lang.Throwable -> Lc4
            if (r0 != 0) goto L98
            if (r8 != 0) goto L98
            r9.wait()     // Catch: java.lang.InterruptedException -> Lb3 java.lang.Throwable -> Lc4
            r15 = 1
        L98:
            r2 = -1
        L9a:
            r11.A09()     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r9)
            if (r15 == 0) goto La4
            r12 = 0
            goto L19
        La4:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto Lb0
            byte[] r0 = X.AbstractC6843Eav.A06
            X.Ebb r0 = r9.A09
            r0.A03(r2)
            return r2
        Lb0:
            if (r8 != 0) goto L18
            return r16
        Lb3:
            X.BV4.A1A()     // Catch: java.lang.Throwable -> Lc4
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lc4
            r0.<init>()     // Catch: java.lang.Throwable -> Lc4
            goto Lc3
        Lbc:
            java.lang.String r0 = "stream closed"
            java.io.IOException r0 = X.BV4.A0K(r0)     // Catch: java.lang.Throwable -> Lc4
        Lc3:
            throw r0     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r0 = move-exception
            r11.A09()     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6881Ebd.AZ7(X.EaW, long):long");
    }

    public C6881Ebd(C6878Eba c6878Eba, long j, boolean z) {
        this.A06 = c6878Eba;
        this.A03 = j;
        this.A02 = z;
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A06.A0C;
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C6878Eba c6878Eba = this.A06;
        synchronized (c6878Eba) {
            this.A01 = true;
            C6818EaW c6818EaW = this.A04;
            j = c6818EaW.A00;
            c6818EaW.Afk(j);
            c6878Eba.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = AbstractC6843Eav.A06;
            c6878Eba.A09.A03(j);
        }
        c6878Eba.A03();
    }
}
