package X;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: X.E3w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6394E3w implements InterfaceC6417E4t {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public int A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C6392E3u A0A;
    public final AbstractC6395E3x A0B;

    @Override // X.InterfaceC6417E4t
    public final /* bridge */ /* synthetic */ InterfaceC5509Djl A81() {
        if (this.A05 != 0) {
            return new C6397E3z(this);
        }
        return null;
    }

    @Override // X.InterfaceC6417E4t
    public final long AZ6(E2K e2k) throws IOException {
        long j;
        long jMax;
        int i = this.A06;
        if (i == 0) {
            long jAIu = e2k.AIu();
            this.A07 = jAIu;
            this.A06 = 1;
            long j2 = this.A08 - 65307;
            if (j2 > jAIu) {
                return j2;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j3 = this.A02;
                long j4 = this.A00;
                if (j3 != j4) {
                    long jAIu2 = e2k.AIu();
                    C6392E3u c6392E3u = this.A0A;
                    if (c6392E3u.A00(e2k, j4)) {
                        c6392E3u.A01(e2k, false);
                        e2k.AbN();
                        long j5 = this.A04;
                        long j6 = c6392E3u.A04;
                        long j7 = j5 - j6;
                        int i2 = c6392E3u.A01 + c6392E3u.A00;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.A00 = jAIu2;
                                this.A01 = j6;
                            } else {
                                this.A02 = e2k.AIu() + i2;
                                this.A03 = j6;
                            }
                            long j8 = this.A00;
                            jMax = this.A02;
                            long j9 = j8 - jMax;
                            if (j9 < 100000) {
                                this.A00 = jMax;
                            } else {
                                jMax = Math.max(jMax, Math.min((e2k.AIu() - (i2 * (j7 <= 0 ? 2L : 1L))) + ((j7 * j9) / (this.A01 - this.A03)), j8 - 1));
                            }
                        }
                    } else {
                        jMax = this.A02;
                        if (jMax == jAIu2) {
                            throw BV4.A0K("No ogg page can be found.");
                        }
                    }
                    if (jMax != -1) {
                        return jMax;
                    }
                }
                this.A06 = 3;
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                C6392E3u c6392E3u2 = this.A0A;
                c6392E3u2.A00(e2k, -1L);
                c6392E3u2.A01(e2k, false);
                if (c6392E3u2.A04 > this.A04) {
                    e2k.AbN();
                    this.A06 = 4;
                    return -(this.A03 + 2);
                }
                e2k.Afm(c6392E3u2.A01 + c6392E3u2.A00);
                this.A02 = e2k.AIu();
                this.A03 = c6392E3u2.A04;
            }
        }
        C6392E3u c6392E3u3 = this.A0A;
        c6392E3u3.A03 = 0;
        c6392E3u3.A04 = 0L;
        c6392E3u3.A02 = 0;
        c6392E3u3.A01 = 0;
        c6392E3u3.A00 = 0;
        if (!c6392E3u3.A00(e2k, -1L)) {
            throw new EOFException();
        }
        c6392E3u3.A01(e2k, false);
        e2k.Afm(c6392E3u3.A01 + c6392E3u3.A00);
        while (true) {
            j = c6392E3u3.A04;
            if ((c6392E3u3.A03 & 4) == 4 || !c6392E3u3.A00(e2k, -1L) || e2k.AIu() >= this.A08 || !c6392E3u3.A01(e2k, true)) {
                break;
            }
            try {
                e2k.Afm(c6392E3u3.A01 + c6392E3u3.A00);
            } catch (EOFException unused) {
            }
        }
        this.A05 = j;
        this.A06 = 4;
        return this.A07;
    }

    @Override // X.InterfaceC6417E4t
    public final void AgJ(long j) {
        long j2 = this.A05;
        this.A04 = Math.max(0L, Math.min(j, j2 - 1));
        this.A06 = 2;
        this.A02 = this.A09;
        this.A00 = this.A08;
        this.A03 = 0L;
        this.A01 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6394E3w(X.AbstractC6395E3x r6, long r7, long r9, long r11, long r13, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            r3 = 0
            r2 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto Lf
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L10
        Lf:
            r0 = 0
        L10:
            X.C1G.A07(r0)
            r5.A0B = r6
            r5.A09 = r7
            r5.A08 = r9
            long r9 = r9 - r7
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L2a
            if (r15 != 0) goto L2a
            r5.A06 = r2
        L22:
            X.E3u r0 = new X.E3u
            r0.<init>()
            r5.A0A = r0
            return
        L2a:
            r5.A05 = r13
            r0 = 4
            r5.A06 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6394E3w.<init>(X.E3x, long, long, long, long, boolean):void");
    }
}
