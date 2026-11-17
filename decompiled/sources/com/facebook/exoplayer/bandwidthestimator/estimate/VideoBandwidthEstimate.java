package com.facebook.exoplayer.bandwidthestimator.estimate;

import X.C5480DjH;
import X.C7144EhA;
import X.FGI;
import X.InterfaceC5047DQt;
import X.InterfaceC5903Drm;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

/* loaded from: classes5.dex */
public class VideoBandwidthEstimate implements InterfaceC5903Drm {
    public static final Map<Integer, Float> A09 = new C7144EhA(1);
    public long A00;
    public InterfaceC5047DQt A01;
    public AbrContextAwareConfiguration A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;

    public VideoBandwidthEstimate() {
        this(-1L, -1L, -1L, -1L, -1L, -1L, -1, null);
    }

    @Override // X.InterfaceC5903Drm
    public final C5480DjH ADi() {
        return new C5480DjH(this.A03, this.A00, this.A04, this.A05, this.A06, this.A07, this.A08);
    }

    @Override // X.InterfaceC5903Drm
    public final long AFJ(String str, int i, long j) {
        if (j < 0) {
            return -1L;
        }
        long jAFM = AFM(str, i);
        long jAFL = AFL(i);
        if (jAFM <= 0 || jAFL < 0) {
            return -1L;
        }
        long j2 = (long) (((j * 8000.0d) / jAFM) + jAFL);
        if (j2 <= 0 || j <= 0) {
            return -1L;
        }
        return (8000 * j) / j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[PHI: r6
  0x0019: PHI (r6v4 float) = (r6v0 float), (r6v5 float) binds: [B:7:0x000f, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r5 r6
  0x001d: PHI (r5v0 float) = (r5v3 float), (r5v4 float) binds: [B:11:0x001b, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r6v1 float) = (r6v4 float), (r6v5 float) binds: [B:11:0x001b, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[PHI: r5 r6
  0x0025: PHI (r5v2 float) = (r5v0 float), (r5v3 float) binds: [B:13:0x0023, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0025: PHI (r6v3 float) = (r6v1 float), (r6v4 float) binds: [B:13:0x0023, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r6
  0x0011: PHI (r6v5 float) = (r6v0 float), (r6v6 float) binds: [B:7:0x000f, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5903Drm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AFL(int r14) {
        /*
            r13 = this;
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r1 = r13.A02
            r8 = 0
            if (r1 == 0) goto Ld
            float r6 = r1.getMaxTTFBMultiplier()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L11
        Ld:
            r6 = 1077936128(0x40400000, float:3.0)
            if (r1 == 0) goto L19
        L11:
            float r5 = r1.getMinTTFBMultiplier()
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L1d
        L19:
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L25
        L1d:
            X.DnS r0 = r1.abrSetting
            float r9 = r0.ttfbWeightLimitForBWEDampening
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 > 0) goto L27
        L25:
            r9 = 1133903872(0x43960000, float:300.0)
        L27:
            long r0 = r13.A06
            if (r14 <= 0) goto L78
            r2 = 100
            if (r14 >= r2) goto L78
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L78
            r2 = 50
            r3 = 1
            if (r14 >= r2) goto L3d
            int r14 = 100 - r14
            r3 = -1
        L3d:
            java.util.Map<java.lang.Integer, java.lang.Float> r2 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A09
            java.lang.Object r2 = X.BV5.A0f(r2, r14)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L78
            float r2 = r2.floatValue()
            r10 = 1065353216(0x3f800000, float:1.0)
            float r7 = (float) r3
            float r7 = r7 * r2
            long r2 = r13.A07
            float r4 = (float) r2
            float r7 = r7 * r4
            float r4 = (float) r0
            float r7 = r7 / r4
            float r7 = r7 + r10
            long r1 = r13.A08
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L67
            float r0 = (float) r1
            float r0 = r0 / r9
            float r10 = r10 - r0
            double r2 = (double) r10
            r0 = 0
            double r0 = java.lang.Math.max(r2, r0)
            float r8 = (float) r0
        L67:
            float r7 = r7 + r8
            double r2 = (double) r7
            double r0 = (double) r6
            double r1 = java.lang.Math.min(r2, r0)
            float r0 = (float) r1
            double r2 = (double) r0
            double r0 = (double) r5
            double r1 = java.lang.Math.max(r2, r0)
            float r0 = (float) r1
            float r4 = r4 * r0
            long r0 = (long) r4
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.AFL(int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[PHI: r6
  0x001a: PHI (r6v4 float) = (r6v0 float), (r6v5 float) binds: [B:7:0x0010, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[PHI: r5 r6
  0x001e: PHI (r5v0 float) = (r5v3 float), (r5v4 float) binds: [B:11:0x001c, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r6v1 float) = (r6v4 float), (r6v5 float) binds: [B:11:0x001c, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[PHI: r5 r6
  0x0026: PHI (r5v2 float) = (r5v0 float), (r5v3 float) binds: [B:13:0x0024, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r6v3 float) = (r6v1 float), (r6v4 float) binds: [B:13:0x0024, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[PHI: r6
  0x0012: PHI (r6v5 float) = (r6v0 float), (r6v6 float) binds: [B:7:0x0010, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5903Drm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AFM(java.lang.String r14, int r15) {
        /*
            r13 = this;
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r1 = r13.A02
            r8 = 0
            if (r1 == 0) goto Ld
            float r6 = r1.getMinBandwidthMultiplier()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L12
        Ld:
            r6 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L1a
        L12:
            float r5 = r1.getMaxBandwidthMultiplier()
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L1e
        L1a:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L26
        L1e:
            X.DnS r0 = r1.abrSetting
            float r9 = r0.bwWeightLimitForBWEDampening
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 > 0) goto L28
        L26:
            r9 = 1145569280(0x44480000, float:800.0)
        L28:
            long r0 = r13.A00
            if (r15 <= 0) goto L7a
            r2 = 100
            if (r15 >= r2) goto L7a
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L7a
            r2 = 50
            r3 = 1
            if (r15 >= r2) goto L3e
            int r15 = 100 - r15
            r3 = -1
        L3e:
            java.util.Map<java.lang.Integer, java.lang.Float> r2 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A09
            java.lang.Object r2 = X.BV5.A0f(r2, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L7a
            float r2 = r2.floatValue()
            r10 = 1065353216(0x3f800000, float:1.0)
            float r7 = (float) r3
            float r7 = r7 * r2
            long r2 = r13.A04
            float r4 = (float) r2
            float r7 = r7 * r4
            float r4 = (float) r0
            float r7 = r7 / r4
            float r7 = r10 - r7
            long r1 = r13.A05
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L69
            float r0 = (float) r1
            float r0 = r0 / r9
            float r10 = r10 - r0
            double r2 = (double) r10
            r0 = 0
            double r0 = java.lang.Math.max(r2, r0)
            float r8 = (float) r0
        L69:
            float r7 = r7 - r8
            double r2 = (double) r7
            double r0 = (double) r6
            double r1 = java.lang.Math.max(r2, r0)
            float r0 = (float) r1
            double r2 = (double) r0
            double r0 = (double) r5
            double r1 = java.lang.Math.min(r2, r0)
            float r0 = (float) r1
            float r4 = r4 * r0
            long r0 = (long) r4
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.AFM(java.lang.String, int):long");
    }

    public final String toString() {
        return FGI.A0h(FGI.A0B(this.A06, "ttfb="), FGI.A0B(this.A00 / 1000, ", bw="), FGI.A0B(this.A07, ", ttfb_s="), FGI.A0B(this.A04 / 1000, ", bw_s="), FGI.A0H(", s=", this.A03));
    }

    public VideoBandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6, int i, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        this.A06 = j;
        this.A08 = j2;
        this.A07 = j3;
        this.A00 = j4;
        this.A05 = j5;
        this.A04 = j6;
        this.A03 = i;
        this.A02 = abrContextAwareConfiguration;
    }
}
