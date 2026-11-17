package X;

import java.io.IOException;

/* renamed from: X.DDz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4906DDz extends DE1 {
    public int A00;
    public DDj A01;
    public DDj A02;
    public IOException A03;
    public boolean A04;
    public boolean A05;
    public C1O A06;
    public final int A07;
    public final int A08;
    public final DE9 A09;
    public final DDU A0A;
    public final CXO A0B;
    public final String A0C;
    public final boolean A0D;
    public volatile byte[] A0E;

    public C4906DDz(DE9 de9, DDU ddu, DDj dDj, CXO cxo, String str, int i, int i2, int i3) {
        super(i3);
        this.A0A = ddu;
        this.A0C = str;
        this.A07 = i;
        this.A08 = i2;
        this.A09 = de9;
        this.A02 = dDj;
        this.A0B = cxo;
        this.A0D = AnonymousClass002.A1X(de9.A00);
        super.A02 = null;
        super.A03 = null;
        this.A03 = null;
        super.A01 = -1;
        super.A00 = -1;
        this.A00 = -1;
        this.A05 = false;
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
    }

    @Override // X.C1J
    public final long open(C1O c1o) {
        DEK dek;
        C7384Etj.A0Y(c1o, 0);
        this.A06 = c1o;
        synchronized (this) {
            dek = A04() ? DEK.CACHED : DEK.SEMI_CACHED;
        }
        DDj dDj = this.A01;
        if (dDj != null) {
            dDj.AWl(c1o, dek);
        }
        synchronized (this) {
            if (super.A01 < 0 && super.A00 < 0) {
                try {
                    wait(this.A07);
                } catch (InterruptedException e) {
                    CFK.A0A("PrefetchDataSource", "Interrupted while waiting for prefetched data", e);
                }
                if (super.A01 < 0 && super.A00 < 0) {
                    this.A05 = false;
                    IOException iOExceptionA0K = BV4.A0K("prefetch no bytes after connect wait");
                    this.A03 = iOExceptionA0K;
                    DDj dDj2 = this.A01;
                    if (dDj2 == null) {
                        throw iOExceptionA0K;
                    }
                    dDj2.AWi(iOExceptionA0K);
                    throw iOExceptionA0K;
                }
            }
            A03(this.A01);
        }
        DDj dDj3 = this.A01;
        if (dDj3 != null) {
            dDj3.AWm(this, AbstractC4889DDd.A00(c1o, this.A04), true);
        }
        return super.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x007f A[Catch: all -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x000a, B:8:0x0010, B:10:0x0014, B:18:0x002c, B:19:0x002e, B:11:0x0019, B:12:0x001c, B:14:0x0021, B:33:0x0049, B:53:0x007f), top: B:78:0x000a, inners: #0 }] */
    @Override // X.C1L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            r3 = 0
            X.C7384Etj.A0Y(r7, r3)
        L4:
            boolean r0 = r6.A05
            r5 = 1
            if (r0 == 0) goto L33
            monitor-enter(r6)
            int r4 = r6.A00(r7, r8, r9)     // Catch: java.lang.Throwable -> Lab
            if (r4 <= 0) goto L19
            X.DDj r2 = r6.A01     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L31
            X.C1O r1 = r6.A06     // Catch: java.lang.Throwable -> Lab
            X.C1O r0 = X.AbstractC4889DDd.A00     // Catch: java.lang.Throwable -> Lab
            goto L2a
        L19:
            int r0 = r6.A08     // Catch: java.lang.Throwable -> Lab
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lab
            r6.wait(r0)     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> Lab
            goto L28
        L20:
            r2 = move-exception
            java.lang.String r1 = "Interrupted while waiting for prefetched data"
            java.lang.String r0 = "PrefetchDataSource"
            X.CFK.A0A(r0, r1, r2)     // Catch: java.lang.Throwable -> Lab
        L28:
            monitor-exit(r6)
            goto L4
        L2a:
            if (r1 != 0) goto L2e
            X.C1O r1 = X.AbstractC4889DDd.A00     // Catch: java.lang.Throwable -> Lab
        L2e:
            r2.AS2(r6, r1, r4, r5)     // Catch: java.lang.Throwable -> Lab
        L31:
            monitor-exit(r6)
            return r4
        L33:
            java.io.IOException r1 = r6.A03
            if (r1 == 0) goto L3f
            X.DDj r0 = r6.A01
            if (r0 == 0) goto L3e
            r0.AWi(r1)
        L3e:
            throw r1
        L3f:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L66
            r4 = r9
            byte[] r2 = r6.A0E
            if (r2 != 0) goto L4e
            monitor-enter(r6)
            int r4 = r6.A00(r7, r8, r9)     // Catch: java.lang.Throwable -> Lab
            goto L6b
        L4e:
            int r1 = r6.A00
            if (r1 >= 0) goto L55
            r6.A00 = r3
            r1 = 0
        L55:
            int r0 = r6.A00
            int r0 = r0 - r1
            if (r0 == 0) goto L7e
            if (r0 > r9) goto L5d
            r4 = r0
        L5d:
            java.lang.System.arraycopy(r2, r1, r7, r8, r4)
            int r0 = r6.A00
            int r0 = r0 + r4
            r6.A00 = r0
            goto L6c
        L66:
            int r4 = r6.A00(r7, r8, r9)
            goto L6c
        L6b:
            monitor-exit(r6)
        L6c:
            if (r4 <= 0) goto L7e
            X.DDj r2 = r6.A01
            if (r2 == 0) goto L7d
            X.C1O r1 = r6.A06
            X.C1O r0 = X.AbstractC4889DDd.A00
            if (r1 != 0) goto L7a
            X.C1O r1 = X.AbstractC4889DDd.A00
        L7a:
            r2.AS2(r6, r1, r4, r5)
        L7d:
            return r4
        L7e:
            monitor-enter(r6)
            X.CXK r3 = r6.A02     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r6)
            if (r3 != 0) goto L86
            r4 = -1
            return r4
        L86:
            int r4 = r3.read(r7, r8, r9)     // Catch: java.io.IOException -> L9c
            if (r4 <= 0) goto L7d
            X.DDj r2 = r6.A01     // Catch: java.io.IOException -> L9c
            if (r2 == 0) goto L7d
            X.C1O r1 = r6.A06     // Catch: java.io.IOException -> L9c
            X.C1O r0 = X.AbstractC4889DDd.A00     // Catch: java.io.IOException -> L9c
            if (r1 != 0) goto L98
            X.C1O r1 = X.AbstractC4889DDd.A00     // Catch: java.io.IOException -> L9c
        L98:
            r2.AS2(r6, r1, r4, r5)     // Catch: java.io.IOException -> L9c
            return r4
        L9c:
            r1 = move-exception
            X.DDj r0 = r6.A01
            if (r0 == 0) goto La4
            r0.AWi(r1)
        La4:
            A01(r3)
            r0 = 0
            r6.A02 = r0
            throw r1
        Lab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4906DDz.read(byte[], int, int):int");
    }

    private final int A00(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = this.A00;
        if (i3 < 0) {
            this.A00 = 0;
            i3 = 0;
        }
        int i4 = super.A00 - i3;
        if (i4 == 0 || (bArr2 = super.A03) == null) {
            return 0;
        }
        if (i4 <= i2) {
            i2 = i4;
        }
        System.arraycopy(bArr2, i3, bArr, i, i2);
        this.A00 += i2;
        return i2;
    }

    public static final void A01(InterfaceC4891DDk interfaceC4891DDk) {
        if (interfaceC4891DDk != null) {
            try {
                interfaceC4891DDk.close();
            } catch (IOException e) {
                CFK.A0A("PrefetchDataSource", "Failed to close data source", e);
            }
        }
    }

    @Override // X.C1J
    public final void close() {
        DDj dDj = this.A01;
        if (dDj != null) {
            C1O c1o = this.A06;
            C1O c1o2 = AbstractC4889DDd.A00;
            if (c1o == null) {
                c1o = AbstractC4889DDd.A00;
            }
            dDj.AWh(this, c1o, true);
            this.A01 = null;
        }
        synchronized (this) {
            this.A05 = false;
            CXK cxk = super.A02;
            if (cxk != null) {
                A01(cxk);
                super.A02 = null;
            }
        }
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        this.A01 = (DDj) C7384Etj.A08(cxb);
    }
}
