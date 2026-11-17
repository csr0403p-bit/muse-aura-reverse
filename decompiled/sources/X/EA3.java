package X;

import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class EA3 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public AudioTrack A0J;
    public EAG A0K;
    public Method A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public E7C A0S;
    public boolean A0T;
    public final EB9 A0U;
    public final long[] A0V;

    private long A00() {
        AudioTrack audioTrack = this.A0J;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.A0G;
        }
        return this.A0G + Util.A0F(RoundingMode.UP, Util.A0C(BV7.A0R() - this.A0H, this.A00), this.A04, 1000000L);
    }

    private long A01(long j) {
        long jA0C;
        if (this.A05 != 0) {
            jA0C = Util.A0C(j + this.A0F, this.A00);
        } else if (this.A0H != -9223372036854775807L) {
            jA0C = BV7.A0X(RoundingMode.DOWN, A00(), this.A04);
        } else {
            jA0C = BV7.A0X(RoundingMode.DOWN, A02(this), this.A04);
        }
        long jA07 = BV5.A07(jA0C - this.A0B);
        if (this.A0H == -9223372036854775807L) {
            return jA07;
        }
        return Math.min(BV7.A0X(RoundingMode.DOWN, this.A07, this.A04), jA07);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A02(X.EA3 r12) {
        /*
            long r3 = r12.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L16
            long r2 = r12.A00()
            long r0 = r12.A07
            long r3 = java.lang.Math.min(r0, r2)
            return r3
        L16:
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r12.A0Q
            long r3 = r6 - r0
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L5c
            android.media.AudioTrack r1 = r12.A0J
            r1.getClass()
            int r3 = r1.getPlayState()
            r0 = 1
            if (r3 == r0) goto L5a
            int r0 = r1.getPlaybackHeadPosition()
            long r4 = X.BV4.A03(r0)
            r10 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 > r0) goto L6a
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L68
            long r1 = r12.A0D
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L68
            r0 = 3
            if (r3 != r0) goto L68
            long r1 = r12.A08
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L5a
            r12.A08 = r6
        L5a:
            r12.A0Q = r6
        L5c:
            long r3 = r12.A0D
            long r0 = r12.A0I
            long r3 = r3 + r0
            long r1 = r12.A0E
            r0 = 32
            long r1 = r1 << r0
            long r3 = r3 + r1
            return r3
        L68:
            r12.A08 = r8
        L6a:
            long r2 = r12.A0D
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7c
            boolean r0 = r12.A0N
            if (r0 == 0) goto L7f
            long r0 = r12.A0I
            long r0 = r0 + r2
            r12.A0I = r0
            r0 = 0
            r12.A0N = r0
        L7c:
            r12.A0D = r4
            goto L5a
        L7f:
            long r2 = r12.A0E
            r0 = 1
            long r2 = r2 + r0
            r12.A0E = r2
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA3.A02(X.EA3):long");
    }

    public static void A03(EA3 ea3) {
        ea3.A0F = 0L;
        ea3.A05 = 0;
        ea3.A03 = 0;
        ea3.A0A = 0L;
        ea3.A0P = -9223372036854775807L;
        ea3.A0R = -9223372036854775807L;
        ea3.A0T = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02cc A[PHI: r6 r11 r13
  0x02cc: PHI (r6v14 java.lang.StringBuilder) = (r6v13 java.lang.StringBuilder), (r6v18 java.lang.StringBuilder) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x02cc: PHI (r11v7 X.EA2) = (r11v6 X.EA2), (r11v10 X.EA2) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x02cc: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a8, blocks: (B:21:0x0075, B:23:0x009a), top: B:117:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129 A[PHI: r2 r6 r11 r13
  0x0129: PHI (r2v27 X.EAV) = (r2v26 X.EAV), (r2v31 X.EAV) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r6v16 java.lang.StringBuilder) = (r6v13 java.lang.StringBuilder), (r6v18 java.lang.StringBuilder) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r11v9 X.EA2) = (r11v6 X.EA2), (r11v10 X.EA2) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:110:0x02c8, B:38:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A04() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA3.A04():long");
    }

    public EA3(EB9 eb9) {
        this.A0U = eb9;
        try {
            this.A0L = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0V = new long[10];
        this.A0R = -9223372036854775807L;
        this.A0P = -9223372036854775807L;
        this.A0S = E7C.A00;
    }
}
