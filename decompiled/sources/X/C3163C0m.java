package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import com.facebook.video.heroplayer.cache.CacheDataSink$CacheDataSinkException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.C0m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3163C0m implements C1N {
    public long A00;
    public long A01 = -9223372036854775807L;
    public boolean A02;
    public long A03;
    public C1O A04;
    public File A05;
    public OutputStream A06;
    public final long A07;
    public final long A08;
    public final InterfaceC3158C0g A09;
    public final boolean A0A;
    public final long A0B;
    public final C0J A0C;

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            C0Q.A01("cacheDataSinkSync");
            this.A06.flush();
            C0Q.A00();
            OutputStream outputStream = this.A06;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
            this.A06 = null;
            File file = this.A05;
            this.A05 = null;
            if (file != null) {
                this.A09.A6a(file, file.length());
            }
        } finally {
        }
    }

    private void A01() {
        C1O c1o = this.A04;
        c1o.getClass();
        long jMin = Math.min(c1o.A03 - this.A03, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        InterfaceC3158C0g interfaceC3158C0g = this.A09;
        String str = c1o.A08;
        str.getClass();
        File fileAg1 = interfaceC3158C0g.Ag1(str, null, c1o.A02 + this.A03, jMin);
        this.A05 = fileAg1;
        FileOutputStream fileOutputStreamA0I = BV4.A0I(fileAg1);
        this.A00 = 0L;
        this.A01 = -9223372036854775807L;
        this.A06 = fileOutputStreamA0I;
    }

    private boolean A02() {
        long j = this.A08;
        if (j <= 0) {
            return false;
        }
        C1O c1o = this.A04;
        c1o.getClass();
        long j2 = c1o.A03 - this.A03;
        return j2 > 0 && j2 < j && this.A00 + j2 <= LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    }

    @Override // X.C1N
    public final void AXT(C1O c1o) {
        C1G.A08(AnonymousClass002.A1L((c1o.A03 > (-1L) ? 1 : (c1o.A03 == (-1L) ? 0 : -1))));
        try {
            try {
                C0Q.A01("exo-opencachedatasink");
                this.A04 = c1o;
                this.A03 = 0L;
                A01();
            } catch (Cache$CacheException e) {
            } catch (FileNotFoundException e2) {
                throw new CacheDataSink$CacheDataSinkException(e2);
            }
        } finally {
            C0Q.A00();
        }
    }

    public C3163C0m(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, long j, long j2, long j3, boolean z) {
        this.A09 = interfaceC3158C0g;
        this.A0C = c0j;
        this.A0A = z;
        this.A0B = j;
        this.A08 = j2;
        this.A07 = j3;
    }

    @Override // X.C1N
    public final void close() throws CacheDataSink$CacheDataSinkException {
        try {
            A00();
        } catch (IOException e) {
            throw new CacheDataSink$CacheDataSinkException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r3 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[Catch: IOException -> 0x00a9, TryCatch #0 {IOException -> 0x00a9, blocks: (B:2:0x0000, B:4:0x0012, B:6:0x001c, B:11:0x0025, B:13:0x0029, B:15:0x0032, B:17:0x0038, B:19:0x003c, B:20:0x003f, B:22:0x004e, B:25:0x0054, B:27:0x005a, B:31:0x0066, B:33:0x006c, B:38:0x0077, B:39:0x007e, B:40:0x0084, B:42:0x0093, B:43:0x009a), top: B:48:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a A[SYNTHETIC] */
    @Override // X.C1N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r21, int r22, int r23) throws java.io.IOException {
        /*
            r20 = this;
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r20
            X.C0J r12 = r7.A0C     // Catch: java.io.IOException -> La9
            boolean r14 = r7.A0A     // Catch: java.io.IOException -> La9
            if (r14 == 0) goto L1e
            X.C0g r1 = r7.A09     // Catch: java.io.IOException -> La9
            java.lang.String r0 = r12.A06     // Catch: java.io.IOException -> La9
            boolean r0 = r1.AOe(r0)     // Catch: java.io.IOException -> La9
            if (r0 == 0) goto L1e
            long r8 = r7.A0B     // Catch: java.io.IOException -> La9
        L1e:
            r6 = 0
        L1f:
            r13 = r23
            if (r6 >= r13) goto La8
            if (r14 == 0) goto L65
            int r0 = r12.A00     // Catch: java.io.IOException -> La9
            if (r0 <= 0) goto L65
            long r4 = r7.A08     // Catch: java.io.IOException -> La9
            r1 = 1
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L63
            long r2 = r7.A00     // Catch: java.io.IOException -> La9
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L65
            boolean r0 = r7.A02     // Catch: java.io.IOException -> La9
            if (r0 != 0) goto L3f
            r7.A02 = r1     // Catch: java.io.IOException -> La9
            goto L63
        L3f:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> La9
            long r10 = r7.A01     // Catch: java.io.IOException -> La9
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r15 != 0) goto L50
            r7.A01 = r0     // Catch: java.io.IOException -> La9
        L50:
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 < 0) goto L5a
            boolean r2 = r7.A02()     // Catch: java.io.IOException -> La9
            if (r2 == 0) goto L63
        L5a:
            long r2 = r7.A01     // Catch: java.io.IOException -> La9
            long r0 = r0 - r2
            long r2 = r7.A07     // Catch: java.io.IOException -> La9
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L65
        L63:
            r3 = 1
            goto L66
        L65:
            r3 = 0
        L66:
            long r0 = r7.A00     // Catch: java.io.IOException -> La9
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L75
            boolean r0 = r7.A02()     // Catch: java.io.IOException -> La9
            if (r0 != 0) goto L75
            if (r3 == 0) goto L7e
            goto L77
        L75:
            if (r3 == 0) goto L84
        L77:
            X.C0g r1 = r7.A09     // Catch: java.io.IOException -> La9
            java.lang.String r0 = r12.A06     // Catch: java.io.IOException -> La9
            r1.A3e(r0)     // Catch: java.io.IOException -> La9
        L7e:
            r7.A00()     // Catch: java.io.IOException -> La9
            r7.A01()     // Catch: java.io.IOException -> La9
        L84:
            int r0 = r23 - r6
            long r4 = (long) r0     // Catch: java.io.IOException -> La9
            long r2 = r7.A00     // Catch: java.io.IOException -> La9
            long r0 = r18 - r2
            int r2 = X.BV4.A01(r4, r0)     // Catch: java.io.IOException -> La9
            java.io.OutputStream r1 = r7.A06     // Catch: java.io.IOException -> La9
            if (r1 == 0) goto L9a
            int r0 = r22 + r6
            r3 = r21
            r1.write(r3, r0, r2)     // Catch: java.io.IOException -> La9
        L9a:
            int r6 = r6 + r2
            long r0 = r7.A00     // Catch: java.io.IOException -> La9
            long r2 = (long) r2     // Catch: java.io.IOException -> La9
            long r0 = r0 + r2
            r7.A00 = r0     // Catch: java.io.IOException -> La9
            long r0 = r7.A03     // Catch: java.io.IOException -> La9
            long r0 = r0 + r2
            r7.A03 = r0     // Catch: java.io.IOException -> La9
            goto L1f
        La8:
            return
        La9:
            r1 = move-exception
            com.facebook.video.heroplayer.cache.CacheDataSink$CacheDataSinkException r0 = new com.facebook.video.heroplayer.cache.CacheDataSink$CacheDataSinkException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3163C0m.write(byte[], int, int):void");
    }
}
