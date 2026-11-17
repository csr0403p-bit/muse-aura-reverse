package X;

import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class EA6 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
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
    public long A0J;
    public AudioTrack A0K;
    public Method A0L;
    public C6513EAc A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public long A0R;
    public final C6519EAx A0S;
    public final long[] A0T;

    public final void A01(AudioTrack audioTrack, int i, int i2, int i3) {
        this.A0K = audioTrack;
        this.A01 = i3;
        this.A0M = new C6513EAc(audioTrack);
        int sampleRate = audioTrack.getSampleRate();
        this.A03 = sampleRate;
        boolean zA0O = Util.A0O(i);
        this.A0O = zA0O;
        this.A05 = zA0O ? ((i3 / i2) * 1000000) / sampleRate : -9223372036854775807L;
        this.A0F = 0L;
        this.A0G = 0L;
        this.A0N = false;
        this.A0J = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A08 = 0L;
        this.A0C = 0L;
        this.A00 = 1.0f;
    }

    public EA6(C6519EAx c6519EAx) {
        this.A0S = c6519EAx;
        try {
            this.A0L = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0T = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(X.EA6 r12) {
        /*
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r12.A0J
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L2b
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r4 = r4 - r6
            float r0 = r12.A00
            long r2 = androidx.media3.common.util.Util.A0C(r4, r0)
            int r0 = r12.A03
            long r0 = (long) r0
            long r2 = r2 * r0
            long r4 = X.BV4.A05(r2)
            long r2 = r12.A06
            long r0 = r12.A0I
            long r0 = r0 + r4
            long r3 = java.lang.Math.min(r2, r0)
            return r3
        L2b:
            long r0 = r12.A0R
            long r6 = r4 - r0
            r1 = 5
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L6d
            android.media.AudioTrack r1 = r12.A0K
            r1.getClass()
            int r3 = r1.getPlayState()
            r0 = 1
            if (r3 == r0) goto L6b
            int r0 = r1.getPlaybackHeadPosition()
            long r6 = X.BV4.A03(r0)
            r10 = 0
            int r1 = androidx.media3.common.util.Util.A00
            r0 = 29
            if (r1 > r0) goto L78
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L76
            long r1 = r12.A0F
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L76
            r0 = 3
            if (r3 != r0) goto L76
            long r1 = r12.A07
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L6b
            r12.A07 = r4
        L6b:
            r12.A0R = r4
        L6d:
            long r3 = r12.A0F
            long r1 = r12.A0G
            r0 = 32
            long r1 = r1 << r0
            long r3 = r3 + r1
            return r3
        L76:
            r12.A07 = r8
        L78:
            long r1 = r12.A0F
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L85
            long r2 = r12.A0G
            r0 = 1
            long r2 = r2 + r0
            r12.A0G = r2
        L85:
            r12.A0F = r6
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA6.A00(X.EA6):long");
    }
}
