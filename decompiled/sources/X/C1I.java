package X;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import com.facebook.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import com.google.common.base.Charsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C1I implements C1J {
    public long A00;
    public long A01;
    public Uri A02;
    public C1J A03;
    public boolean A04;
    public long A05;
    public long A06;
    public long A07;
    public C1O A08;
    public C1O A09;
    public C4890DDe A0A;
    public C0J A0B;
    public boolean A0C;
    public final C1J A0D;
    public final C1J A0E;
    public final C1J A0F;
    public final InterfaceC3158C0g A0G;
    public final CB4 A0H;

    @Override // X.C1J
    public final void close() {
        this.A09 = null;
        this.A02 = null;
        this.A01 = 0L;
        try {
            A00();
        } catch (Throwable th) {
            A02(th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:8:0x001a, B:10:0x0022, B:11:0x0026, B:13:0x0036, B:15:0x003c, B:16:0x0042, B:18:0x0053, B:20:0x0057, B:22:0x005d, B:24:0x0063, B:26:0x0069, B:28:0x0071, B:30:0x0081, B:36:0x008d), top: B:42:0x001a }] */
    @Override // X.C1L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r15, int r16, int r17) {
        /*
            r14 = this;
            r7 = 0
            r9 = r17
            if (r17 != 0) goto L6
            return r7
        L6:
            r8 = r14
            long r0 = r14.A00
            r13 = -1
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L9d
            X.C1O r6 = r14.A09
            r6.getClass()
            X.C1O r14 = r14.A08
            r14.getClass()
            long r2 = r8.A01     // Catch: java.lang.Throwable -> L98
            long r0 = r8.A05     // Catch: java.lang.Throwable -> L98
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 < 0) goto L26
            r0 = 1
            r8.A01(r6, r0, r7)     // Catch: java.lang.Throwable -> L98
        L26:
            X.C1J r0 = r8.A03     // Catch: java.lang.Throwable -> L98
            r0.getClass()     // Catch: java.lang.Throwable -> L98
            r11 = r16
            r12 = r15
            int r10 = r0.read(r15, r11, r9)     // Catch: java.lang.Throwable -> L98
            r15 = -1
            if (r10 == r13) goto L57
            X.C1J r1 = r8.A03     // Catch: java.lang.Throwable -> L98
            X.C1J r0 = r8.A0D     // Catch: java.lang.Throwable -> L98
            if (r1 != r0) goto L42
            long r2 = r8.A07     // Catch: java.lang.Throwable -> L98
            long r0 = (long) r10     // Catch: java.lang.Throwable -> L98
            long r2 = r2 + r0
            r8.A07 = r2     // Catch: java.lang.Throwable -> L98
        L42:
            long r0 = r8.A01     // Catch: java.lang.Throwable -> L98
            long r3 = (long) r10     // Catch: java.lang.Throwable -> L98
            long r0 = r0 + r3
            r8.A01 = r0     // Catch: java.lang.Throwable -> L98
            long r0 = r8.A06     // Catch: java.lang.Throwable -> L98
            long r0 = r0 + r3
            r8.A06 = r0     // Catch: java.lang.Throwable -> L98
            long r1 = r8.A00     // Catch: java.lang.Throwable -> L98
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L8c
            long r1 = r1 - r3
            r8.A00 = r1     // Catch: java.lang.Throwable -> L98
            return r10
        L57:
            X.C1J r13 = r8.A03     // Catch: java.lang.Throwable -> L98
            X.C1J r0 = r8.A0D     // Catch: java.lang.Throwable -> L98
            if (r13 == r0) goto L81
            long r2 = r14.A03     // Catch: java.lang.Throwable -> L98
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 == 0) goto L69
            long r0 = r8.A06     // Catch: java.lang.Throwable -> L98
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 >= 0) goto L81
        L69:
            java.lang.String r3 = r6.A08     // Catch: java.lang.Throwable -> L98
            r8.A00 = r4     // Catch: java.lang.Throwable -> L98
            X.C1J r0 = r8.A0E     // Catch: java.lang.Throwable -> L98
            if (r13 != r0) goto L8c
            X.Bym r2 = new X.Bym     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            long r0 = r8.A01     // Catch: java.lang.Throwable -> L98
            X.C3122Bym.A01(r2, r0)     // Catch: java.lang.Throwable -> L98
            X.C0g r0 = r8.A0G     // Catch: java.lang.Throwable -> L98
            r0.A4U(r2, r3)     // Catch: java.lang.Throwable -> L98
            return r10
        L81:
            long r0 = r8.A00     // Catch: java.lang.Throwable -> L98
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L8d
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L8c
            goto L8d
        L8c:
            return r10
        L8d:
            r8.A00()     // Catch: java.lang.Throwable -> L98
            r8.A01(r6, r7, r7)     // Catch: java.lang.Throwable -> L98
            int r13 = r8.read(r12, r11, r9)     // Catch: java.lang.Throwable -> L98
            return r13
        L98:
            r0 = move-exception
            r8.A02(r0)
            throw r0
        L9d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1I.read(byte[], int, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        C1J c1j = this.A03;
        if (c1j != null) {
            try {
                c1j.close();
            } finally {
                this.A08 = null;
                this.A03 = null;
                C0J c0j = this.A0B;
                if (c0j != null) {
                    this.A0G.AaF(c0j);
                    this.A0B = null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(X.C1O r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1I.A01(X.C1O, boolean, boolean):void");
    }

    private void A02(Throwable th) {
        if (this.A03 == this.A0D || (th instanceof Cache$CacheException)) {
            this.A04 = true;
        }
    }

    @Override // X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        return this.A03 == this.A0D ? Collections.EMPTY_MAP : this.A0F.getResponseHeaders();
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A02;
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0113: INVOKE (r9 I:X.C1I), (r0 I:java.lang.Throwable) DIRECT call: X.C1I.A02(java.lang.Throwable):void A[MD:(java.lang.Throwable):void (m)] (LINE:275), block:B:57:0x0113 */
    @Override // X.C1J
    public final long open(C1O c1o) throws DataSourceException {
        C1I c1iA02;
        Uri uri;
        try {
            Uri uri2 = this.A0H.A00;
            if (uri2 == null) {
                uri2 = c1o.A06;
            }
            String string = uri2.toString();
            if (string != null) {
                byte[] bArrA1T = C3cH.A1T(string);
                C7384Etj.A0X(bArrA1T);
                StringBuilder sbA0p = BV4.A0p(bArrA1T.length * 2);
                for (byte b : bArrA1T) {
                    char[] cArr = DDR.A0M;
                    sbA0p.append(cArr[(b & 255) >>> 4]);
                    sbA0p.append(cArr[b & 15]);
                }
                String strA0M = FGI.A0M("ig_subtitle_", sbA0p.toString());
                if (strA0M != null) {
                    Uri uri3 = c1o.A06;
                    long j = c1o.A05;
                    int i = c1o.A01;
                    byte[] bArr = c1o.A0A;
                    Map<String, String> map = c1o.A09;
                    long j2 = c1o.A04;
                    long j3 = c1o.A03;
                    int i2 = c1o.A00;
                    Object obj = c1o.A07;
                    C1G.A04(uri3);
                    C1O c1o2 = new C1O(uri3, obj, strA0M, map, bArr, i, i2, j, j2, j3);
                    this.A09 = c1o2;
                    InterfaceC3158C0g interfaceC3158C0g = this.A0G;
                    Uri uri4 = c1o2.A06;
                    byte[] bArr2 = interfaceC3158C0g.AE3(strA0M).A01.get("exo_redir");
                    if (bArr2 == null || (uri = Uri.parse(new String(bArr2, Charsets.UTF_8))) == null) {
                        uri = uri4;
                    }
                    this.A02 = uri;
                    this.A01 = j2;
                    this.A0A = C4890DDe.A00(c1o);
                    boolean z = true;
                    boolean z2 = (this.A04 ? (char) 0 : '\uffff') != '\uffff';
                    this.A0C = z2;
                    if (z2) {
                        this.A00 = -1L;
                    } else {
                        long jA00 = AbstractC3127Bys.A00(interfaceC3158C0g.AE3(strA0M));
                        this.A00 = jA00;
                        if (jA00 != -1) {
                            long j4 = jA00 - j2;
                            this.A00 = j4;
                            if (j4 < 0) {
                                throw new DataSourceException();
                            }
                        }
                    }
                    if (C4890DDe.A00(c1o).A0D > 0 || C4890DDe.A00(c1o).A0C > 0) {
                        z = false;
                    }
                    if (j3 != -1) {
                        long j5 = this.A00;
                        this.A00 = j5 == -1 ? j3 : Math.min(j5, j3);
                    }
                    long j6 = this.A00;
                    if (j6 > 0 || j6 == -1) {
                        A01(c1o2, false, z);
                    }
                    return j3 == -1 ? this.A00 : j3;
                }
            }
            throw BV4.A0U();
        } catch (Throwable th) {
            c1iA02.A02(th);
            throw th;
        }
    }

    public C1I(C1N c1n, C1J c1j, C1J c1j2, InterfaceC3158C0g interfaceC3158C0g, CB4 cb4) {
        this.A0G = interfaceC3158C0g;
        this.A0D = c1j2;
        this.A0H = cb4;
        C1M c1m = null;
        if (c1j != null) {
            this.A0F = c1j;
            if (c1n != null) {
                c1m = new C1M(c1n, c1j);
            }
        } else {
            this.A0F = C1K.A00;
        }
        this.A0E = c1m;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        cxb.getClass();
        this.A0D.addTransferListener(cxb);
        this.A0F.addTransferListener(cxb);
    }
}
