package X;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.util.List;

/* loaded from: classes5.dex */
public final class Dl8 extends Timeline {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C5580Dky A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C5777DpJ A08;
    public final C5704Dnm A09;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[PHI: r0
  0x007c: PHI (r0v3 long) = (r0v1 long), (r0v6 long) binds: [B:9:0x0026, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5998Dth A0E(X.C5998Dth r32, int r33, long r34) {
        /*
            r31 = this;
            r6 = 0
            r15 = 1
            r0 = r33
            X.C1G.A03(r0, r15)
            r9 = r31
            long r0 = r9.A02
            X.Dky r8 = r9.A04
            boolean r10 = r8.A0S
            if (r10 == 0) goto L35
            long r2 = r8.A0B
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L35
            long r2 = r8.A07
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L35
            r13 = 0
            int r2 = (r34 > r13 ? 1 : (r34 == r13 ? 0 : -1))
            if (r2 <= 0) goto L7c
            long r0 = r0 + r34
            long r2 = r9.A03
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L7c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L35:
            java.lang.Object r19 = X.C5998Dth.A0G
            X.Dnm r2 = r9.A09
            r18 = r2
            long r13 = r9.A06
            long r11 = r9.A07
            long r6 = r9.A05
            if (r10 == 0) goto L56
            long r2 = r8.A0B
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 == 0) goto L56
            long r2 = r8.A07
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r35 = 1
            if (r4 == 0) goto L58
        L56:
            r35 = 0
        L58:
            X.DpJ r10 = r9.A08
            long r4 = r9.A03
            int r2 = r9.A01()
            int r21 = r2 + (-1)
            long r2 = r9.A01
            r16 = r32
            r22 = r13
            r24 = r11
            r26 = r6
            r28 = r0
            r30 = r4
            r32 = r2
            r34 = r15
            r17 = r10
            r20 = r8
            r16.A00(r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r32, r34, r35)
            return r16
        L7c:
            long r4 = r9.A01
            long r4 = r4 + r0
            long r2 = X.C5580Dky.A01(r8, r6)
            r11 = 0
        L84:
            java.util.List<X.DlC> r7 = r8.A0R
            int r6 = X.C60O.A00(r7)
            if (r11 >= r6) goto L98
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L98
            long r4 = r4 - r2
            int r11 = r11 + 1
            long r2 = X.C5580Dky.A01(r8, r11)
            goto L84
        L98:
            java.lang.Object r11 = r7.get(r11)
            X.DlC r11 = (X.C5585DlC) r11
            r6 = 2
            int r7 = r11.A00(r6)
            r6 = -1
            if (r7 == r6) goto L35
            java.util.List<X.Dl9> r6 = r11.A03
            java.util.List r6 = X.Dl9.A03(r6, r7)
            X.DhD r7 = X.AbstractC5553DkW.A01(r6)
            if (r7 == 0) goto L35
            long r11 = r7.AK9(r2)
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 == 0) goto L35
            long r2 = r7.AKA(r4, r2)
            long r2 = r7.ALf(r2)
            long r0 = r0 + r2
            long r0 = r0 - r4
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dl8.A0E(X.Dth, int, long):X.Dth");
    }

    public Dl8(C5777DpJ c5777DpJ, C5704Dnm c5704Dnm, C5580Dky c5580Dky, int i, long j, long j2, long j3, long j4, long j5, long j6) {
        C1G.A08(c5580Dky.A0S == AnonymousClass002.A1X(c5777DpJ));
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A00 = i;
        this.A01 = j4;
        this.A03 = j5;
        this.A02 = j6;
        this.A04 = c5580Dky;
        this.A09 = c5704Dnm;
        this.A08 = c5777DpJ;
    }

    @Override // androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        String str;
        C1G.A03(i, A01());
        Integer numValueOf = null;
        if (z) {
            str = this.A04.A0R.get(i).A02;
            int i2 = this.A00;
            C1G.A03(i, A01());
            numValueOf = Integer.valueOf(i2 + i);
        } else {
            str = null;
        }
        C5580Dky c5580Dky = this.A04;
        long jA01 = C5580Dky.A01(c5580Dky, i);
        List<C5585DlC> list = c5580Dky.A0R;
        e6b.A04(str, numValueOf, jA01, Util.A0A(list.get(i).A00 - list.get(0).A00) - this.A01);
        return e6b;
    }
}
