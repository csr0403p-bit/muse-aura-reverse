package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.video.heroplayer.cache.CacheDataSinkV2$CacheDataSinkException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.C0l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3162C0l implements C1N {
    public long A00;
    public long A01;
    public long A02;
    public C1O A03;
    public File A04;
    public OutputStream A05;
    public final InterfaceC3158C0g A06;
    public final boolean A07;
    public final boolean A08;
    public final long A09;
    public final C0J A0A;

    private void A00() throws IOException {
        if (this.A05 != null) {
            try {
                C0Q.A01("cacheDataSinkSync");
                this.A05.flush();
                C0Q.A00();
                OutputStream outputStream = this.A05;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A05 = null;
                File file = this.A04;
                this.A04 = null;
                this.A06.A6a(file, this.A02);
            } catch (Throwable th) {
                C0Q.A00();
                OutputStream outputStream2 = this.A05;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A05 = null;
                File file2 = this.A04;
                this.A04 = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void A01(C1O c1o) {
        long j = c1o.A03;
        File fileAg1 = this.A06.Ag1(c1o.A08, null, c1o.A04 + this.A00, j != -1 ? Math.min(j - this.A00, this.A01) : -1L);
        this.A04 = fileAg1;
        this.A05 = BV4.A0I(fileAg1);
        this.A02 = 0L;
    }

    @Override // X.C1N
    public final void AXT(C1O c1o) {
        c1o.A08.getClass();
        if (c1o.A03 == -1 && (c1o.A00 & 2) == 2) {
            this.A03 = null;
            return;
        }
        this.A03 = c1o;
        this.A01 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        this.A00 = 0L;
        try {
            try {
                C0Q.A01("exo-opencachedatasink");
                A01(c1o);
            } catch (IOException e) {
                throw new CacheDataSinkV2$CacheDataSinkException(e);
            }
        } finally {
            C0Q.A00();
        }
    }

    @Override // X.C1N
    public final void close() throws CacheDataSinkV2$CacheDataSinkException {
        if (this.A03 != null) {
            try {
                A00();
            } catch (IOException e) {
                throw new CacheDataSinkV2$CacheDataSinkException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // X.C1N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r14, int r15, int r16) throws java.io.IOException {
        /*
            r13 = this;
            X.C1O r12 = r13.A03
            if (r12 == 0) goto L8c
            long r4 = r13.A01     // Catch: java.io.IOException -> L85
            X.C0J r7 = r13.A0A     // Catch: java.io.IOException -> L85
            boolean r11 = r13.A07     // Catch: java.io.IOException -> L85
            if (r11 != 0) goto L17
            X.C0g r1 = r13.A06     // Catch: java.io.IOException -> L85
            java.lang.String r0 = r7.A06     // Catch: java.io.IOException -> L85
            java.util.NavigableSet r0 = r1.ADD(r0)     // Catch: java.io.IOException -> L85
            r1 = 0
            if (r0 == 0) goto L18
        L17:
            r1 = 1
        L18:
            boolean r10 = r13.A08     // Catch: java.io.IOException -> L85
            if (r10 == 0) goto L1f
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r6 = 0
            if (r0 == 0) goto L32
            X.C0g r1 = r13.A06     // Catch: java.io.IOException -> L85
            java.lang.String r0 = r7.A06     // Catch: java.io.IOException -> L85
            boolean r0 = r1.AOe(r0)     // Catch: java.io.IOException -> L85
            if (r0 == 0) goto L30
            long r4 = r13.A09     // Catch: java.io.IOException -> L85
            goto L32
        L30:
            long r4 = r13.A01     // Catch: java.io.IOException -> L85
        L32:
            r2 = r16
            if (r6 >= r2) goto L8c
            if (r11 != 0) goto L43
            X.C0g r1 = r13.A06     // Catch: java.io.IOException -> L85
            java.lang.String r0 = r7.A06     // Catch: java.io.IOException -> L85
            java.util.NavigableSet r0 = r1.ADD(r0)     // Catch: java.io.IOException -> L85
            r1 = 0
            if (r0 == 0) goto L44
        L43:
            r1 = 1
        L44:
            if (r10 == 0) goto L4d
            if (r1 == 0) goto L4d
            int r0 = r7.A00     // Catch: java.io.IOException -> L85
            r8 = 1
            if (r0 > 0) goto L4e
        L4d:
            r8 = 0
        L4e:
            long r0 = r13.A02     // Catch: java.io.IOException -> L85
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L57
            if (r8 == 0) goto L66
            goto L59
        L57:
            if (r8 == 0) goto L60
        L59:
            X.C0g r1 = r13.A06     // Catch: java.io.IOException -> L85
            java.lang.String r0 = r7.A06     // Catch: java.io.IOException -> L85
            r1.A3e(r0)     // Catch: java.io.IOException -> L85
        L60:
            r13.A00()     // Catch: java.io.IOException -> L85
            r13.A01(r12)     // Catch: java.io.IOException -> L85
        L66:
            int r0 = r16 - r6
            long r8 = (long) r0     // Catch: java.io.IOException -> L85
            long r2 = r13.A02     // Catch: java.io.IOException -> L85
            long r0 = r4 - r2
            int r2 = X.BV4.A01(r8, r0)     // Catch: java.io.IOException -> L85
            java.io.OutputStream r1 = r13.A05     // Catch: java.io.IOException -> L85
            int r0 = r15 + r6
            r1.write(r14, r0, r2)     // Catch: java.io.IOException -> L85
            int r6 = r6 + r2
            long r0 = r13.A02     // Catch: java.io.IOException -> L85
            long r2 = (long) r2     // Catch: java.io.IOException -> L85
            long r0 = r0 + r2
            r13.A02 = r0     // Catch: java.io.IOException -> L85
            long r0 = r13.A00     // Catch: java.io.IOException -> L85
            long r0 = r0 + r2
            r13.A00 = r0     // Catch: java.io.IOException -> L85
            goto L32
        L85:
            r1 = move-exception
            com.facebook.video.heroplayer.cache.CacheDataSinkV2$CacheDataSinkException r0 = new com.facebook.video.heroplayer.cache.CacheDataSinkV2$CacheDataSinkException
            r0.<init>(r1)
            throw r0
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3162C0l.write(byte[], int, int):void");
    }

    public C3162C0l(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, long j, boolean z, boolean z2) {
        this.A06 = interfaceC3158C0g;
        this.A0A = c0j;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = j;
    }
}
