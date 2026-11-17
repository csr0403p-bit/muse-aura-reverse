package com.facebook.aura.components.reactions;

import X.AT2;
import X.AT3;
import X.ATD;
import X.AXN;
import X.AaI;
import X.AaJ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.C16a;
import X.C1710Aot;
import X.C2av;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraReactionMotionKt {
    public static final float DIAMOND_EDGE_ALPHA = 0.7f;
    public static final float DIAMOND_FILL_ALPHA = 0.94f;
    public static final float DIAMOND_GLINT_DURATION_MS = 280.0f;
    public static final float DIAMOND_HEIGHT_RATIO = 1.22f;
    public static final float DiamondEdgeWidth = 0.7f;
    public static final List<Float> DiamondFadeKeyTimes;
    public static final List<Float> DiamondFadeTrack;
    public static final List<Float> DiamondScaleKeyTimes;
    public static final float OneDp = 1.0f;
    public static final float POP_HOP_FROM_SCALE = 0.86f;
    public static final float POP_HOP_MS = 500.0f;
    public static final float POP_HOP_REBOUND_END = 0.8f;
    public static final float POP_HOP_REBOUND_SCALE_X = 0.98f;
    public static final float POP_HOP_REBOUND_SCALE_Y = 1.04f;
    public static final float POP_HOP_SETTLE_END = 0.55f;
    public static final float POP_HOP_SETTLE_SCALE_X = 1.06f;
    public static final float POP_HOP_SETTLE_SCALE_Y = 0.9f;
    public static final float PopHopFrom = -15.0f;
    public static final float PopHopRebound = -2.0f;
    public static final float PopHopSettle = 3.0f;
    public static final float SPARKLE_DURATION_MS = 440.0f;
    public static final float SPARKLE_FADE_PEAK = 0.45f;
    public static final float SPARKLE_SCALE_MID = 0.55f;
    public static final float SPECULAR_GLOW_ALPHA = 0.45f;
    public static final float SPECULAR_GLOW_SPREAD = 2.5f;
    public static final float SPECULAR_INSET = 1.0f;
    public static final float SparkleStrokeWidth = 1.6f;
    public static final List<Float> SpecularFadeKeyTimes;
    public static final List<Float> SpecularFadeTrack;
    public static final List<Float> SpecularTravelKeyTimes;
    public static final float TEAR_EDGE_ALPHA = 0.42f;
    public static final float TEAR_FILL_ALPHA = 0.92f;
    public static final float TearEdgeWidth = 0.6f;
    public static final List<Float> SparkleScaleTrack = C8j4.A12(Float.valueOf(0.2f), Float.valueOf(1.15f), Float.valueOf(0.85f));
    public static final List<Float> DiamondScaleTrack = C8j5.A0a(Float.valueOf(0.15f), Float.valueOf(1.08f), 0.62f);

    public static final void applyPopHop(C2av c2av, float f) {
        float fEaseInOut;
        float f2;
        C7384Etj.A0Y(c2av, 0);
        float f3 = 1.0f;
        float fA03 = ATD.A03(f / 500.0f, 0.0f, 1.0f);
        if (fA03 <= 0.0f || fA03 >= 1.0f) {
            return;
        }
        if (fA03 < 0.55f) {
            fEaseInOut = easeInOut(fA03 / 0.55f);
            AXN.A04(c2av, C8j3.A02(PopHopSettle, PopHopFrom, fEaseInOut));
            f2 = 0.86f;
            c2av.AeX(C8j3.A02(1.06f, 0.86f, fEaseInOut));
            f3 = 0.9f;
        } else if (fA03 < 0.8f) {
            fEaseInOut = easeInOut((fA03 - 0.55f) / 0.25f);
            AXN.A04(c2av, C8j3.A02(PopHopRebound, PopHopSettle, fEaseInOut));
            c2av.AeX(C8j3.A02(0.98f, 1.06f, fEaseInOut));
            f2 = 0.9f;
            f3 = 1.04f;
        } else {
            fEaseInOut = easeInOut((fA03 - 0.8f) / 0.19999999f);
            AXN.A04(c2av, C8j3.A02(0.0f, PopHopRebound, fEaseInOut));
            c2av.AeX(C8j3.A02(1.0f, 0.98f, fEaseInOut));
            f2 = 1.04f;
        }
        c2av.AeY(f2 + ((f3 - f2) * fEaseInOut));
    }

    /* renamed from: curvePointAt-jyLRC_s, reason: not valid java name */
    public static final long m402curvePointAtjyLRC_s(long j, long j2, float f, float f2) {
        return m408quadraticPointAt428G9Dg(j, C8j3.A0Q((AnonymousClass001.A00(j) + AnonymousClass001.A00(j2)) / 2.0f, Math.min(AnonymousClass001.A01(j, 4294967295L), AnonymousClass001.A01(j2, 4294967295L)) - f), j2, f2);
    }

    /* renamed from: drawReactionDiamondGlint-6TbYsW0, reason: not valid java name */
    public static final void m403drawReactionDiamondGlint6TbYsW0(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, long j, long j2, float f, float f2) {
        AnonymousClass003.A0u(at3, interfaceC1068ATy);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fKeyframe = keyframe(DiamondScaleTrack, DiamondScaleKeyTimes, f2);
        float fA03 = ATD.A03(keyframe(DiamondFadeTrack, DiamondFadeKeyTimes, f2), 0.0f, 1.0f);
        if (fA03 > 0.0f) {
            float f3 = (f * fKeyframe) / 2.0f;
            float f4 = 1.22f * f3;
            Path path = ((C1710Aot) interfaceC1068ATy).A03;
            path.reset();
            float fA032 = AnonymousClass003.A03(j);
            float fA00 = AnonymousClass004.A00(j);
            path.moveTo(fA032, fA00 - f4);
            path.lineTo(fA032 + f3, fA00);
            path.lineTo(fA032, fA00 + f4);
            path.lineTo(fA032 - f3, fA00);
            path.close();
            long j3 = B6A.A08;
            at3.A9d(null, interfaceC1068ATy, C16a.A00, 0.94f * fA03, 3, j3);
            at3.A9d(null, interfaceC1068ATy, new AaJ(null, at3.Ah4(DiamondEdgeWidth) * fKeyframe, 4.0f, 0, 0), fA03 * 0.7f, 3, j2);
        }
    }

    /* renamed from: drawReactionSparkle-a8Bkb0Q, reason: not valid java name */
    public static final void m404drawReactionSparklea8Bkb0Q(AT3 at3, long j, long j2, float f, float f2) {
        float fA03;
        float fA032;
        float f3;
        C7384Etj.A0Y(at3, 0);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        List<Float> list = SparkleScaleTrack;
        if (f2 < 0.55f) {
            fA03 = C8j4.A03(list, 0);
            fA032 = C8j4.A03(list, 1);
            f3 = f2 / 0.55f;
        } else {
            fA03 = C8j4.A03(list, 1);
            fA032 = C8j4.A03(list, 2);
            f3 = (f2 - 0.55f) / 0.45f;
        }
        float fA02 = C8j3.A02(fA032, fA03, f3);
        float f4 = f2 < 0.45f ? f2 / 0.45f : 1.0f - ((f2 - 0.45f) / 0.55f);
        float f5 = (f / 2.0f) * fA02;
        float fAh4 = at3.Ah4(SparkleStrokeWidth) * fA02;
        float fA033 = ATD.A03(f4, 0.0f, 1.0f);
        float fA00 = AnonymousClass001.A00(j);
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        long jA0P = C8j3.A0P(fA00) << 32;
        at3.A9X(null, null, fAh4, fA033, 0, 3, j2, jA0P | (C8j3.A0P(fA01 - f5) & 4294967295L), jA0P | (C8j3.A0P(fA01 + f5) & 4294967295L));
        long jA0P2 = C8j3.A0P(fA00 - f5);
        long jA0P3 = C8j3.A0P(fA01) & 4294967295L;
        at3.A9X(null, null, fAh4, fA033, 0, 3, j2, jA0P3 | (jA0P2 << 32), jA0P3 | C8j4.A0K(fA00 + f5));
    }

    /* renamed from: drawReactionSpecularSweep-wnzZ9DU, reason: not valid java name */
    public static final void m405drawReactionSpecularSweepwnzZ9DU(AT3 at3, long j, long j2, float f, float f2, float f3, float f4, float f5) {
        C7384Etj.A0Y(at3, 0);
        if (f5 <= 0.0f || f5 >= 1.0f) {
            return;
        }
        float fA03 = ATD.A03(keyframe(SpecularFadeTrack, SpecularFadeKeyTimes, f5), 0.0f, 1.0f);
        if (fA03 > 0.0f) {
            float f6 = (f / 2.0f) - 1.0f;
            float fKeyframe = keyframe(C8j4.A12(Float.valueOf((-f3) * 0.75f), Float.valueOf(0.0f), Float.valueOf(f3)), SpecularTravelKeyTimes, f5);
            float fA00 = AnonymousClass001.A00(j);
            float fA01 = AnonymousClass001.A01(j, 4294967295L);
            long jA0L = AnonymousClass005.A0L((fA00 - f6) + fKeyframe, fA01 + f6);
            long jA0L2 = AnonymousClass005.A0L(fA00 + f6 + fKeyframe, fA01 - f6);
            at3.A9X(null, null, f2 * 2.5f, fA03 * f4 * 0.45f, 1, 3, j2, jA0L, jA0L2);
            at3.A9X(null, null, f2, fA03, 1, 3, j2, jA0L, jA0L2);
        }
    }

    /* renamed from: drawReactionTearDrop-6TbYsW0, reason: not valid java name */
    public static final void m406drawReactionTearDrop6TbYsW0(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, long j, long j2, float f, float f2) {
        AnonymousClass003.A0u(at3, interfaceC1068ATy);
        if (f2 > 0.0f) {
            float fA03 = AnonymousClass003.A03(j) - ((0.72f * f) / 2.0f);
            float fA00 = AnonymousClass004.A00(j) - (f / 2.0f);
            AT2 at2 = ((AaI) at3.AEq()).A01;
            at2.AhL(fA03, fA00);
            try {
                AuraReactionShapesKt.tearDropPath(interfaceC1068ATy, f);
                at3.A9d(null, interfaceC1068ATy, C16a.A00, f2 * 0.92f, 3, j2);
                long j3 = B6A.A08;
                at3.A9d(null, interfaceC1068ATy, new AaJ(null, at3.Ah4(TearEdgeWidth), 4.0f, 0, 0), f2 * 0.42f, 3, j3);
            } finally {
                AT2.A01(at2, fA03, fA00);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public static final float smoothKeyframe(List<Float> list, List<Float> list2, float f) {
        int i;
        float fA03;
        float fA032;
        float fA033;
        float fA034;
        Float f2;
        Float f3;
        int i2 = 0;
        ?? A1a = AnonymousClass002.A1a(list, list2);
        float fA035 = ATD.A03(f, 0.0f, 1.0f);
        int size = list.size();
        int i3 = size - 1;
        if (i3 < A1a) {
            f3 = list.get(0);
        } else {
            int i4 = 0;
            while (true) {
                i = size - 2;
                if (i4 >= i) {
                    break;
                }
                int i5 = i4 + 1;
                if (fA035 <= C8j4.A03(list2, i5)) {
                    break;
                }
                i4 = i5;
            }
            int i6 = i4 + 1;
            float fA036 = C8j4.A03(list2, i6) - C8j4.A03(list2, i4);
            if (fA036 > 0.0f) {
                float fA02 = ATD.A02(fA035 - C8j4.A03(list2, i4), fA036);
                if (i4 == 0) {
                    fA03 = C8j4.A03(list, A1a == true ? 1 : 0) - C8j4.A03(list, 0);
                    fA032 = C8j4.A03(list2, A1a == true ? 1 : 0);
                } else {
                    i2 = i4 - 1;
                    fA03 = C8j4.A03(list, i6) - C8j4.A03(list, i2);
                    fA032 = C8j4.A03(list2, i6);
                }
                float fA022 = fA03 / (fA032 - AnonymousClass001.A02(list2.get(i2)));
                if (i6 == i3) {
                    fA033 = C8j4.A03(list, i3) - C8j4.A03(list, i);
                    fA034 = C8j4.A03(list2, i3);
                    f2 = list2.get(i);
                } else {
                    int i7 = i4 + 2;
                    fA033 = C8j4.A03(list, i7) - C8j4.A03(list, i4);
                    fA034 = C8j4.A03(list2, i7);
                    f2 = list2.get(i4);
                }
                float f4 = fA02 * fA02;
                float f5 = f4 * fA02;
                float f6 = 3.0f * f4;
                return ((((f5 * 2.0f) - f6) + 1.0f) * C8j4.A03(list, i4)) + (((f5 - (2.0f * f4)) + fA02) * fA036 * fA022) + ((((-2.0f) * f5) + f6) * C8j4.A03(list, i6)) + ((f5 - f4) * fA036 * (fA033 / (fA034 - AnonymousClass001.A02(f2))));
            }
            f3 = list.get(i6);
        }
        return AnonymousClass001.A02(f3);
    }

    /* renamed from: arcPosition-jyLRC_s, reason: not valid java name */
    public static final long m401arcPositionjyLRC_s(long j, long j2, float f, float f2) {
        float fPow = 1.0f - ((float) Math.pow(1.0f - f2, 3.0d));
        float fA00 = AnonymousClass001.A00(j);
        float fA002 = fA00 + AnonymousClass001.A00(j2);
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        long jA0L = AnonymousClass005.A0L(fA002, AnonymousClass001.A01(j2, 4294967295L) + fA01);
        float fA003 = AnonymousClass001.A00(jA0L);
        float fA012 = AnonymousClass001.A01(jA0L, 4294967295L);
        long jA0L2 = AnonymousClass005.A0L((fA00 + fA003) / 2.0f, Math.min(fA01, fA012) - f);
        float f3 = 1.0f - fPow;
        float f4 = f3 * f3;
        float f5 = f3 * 2.0f * fPow;
        float f6 = fPow * fPow;
        return AnonymousClass005.A0L((fA00 * f4) + C8j4.A00(jA0L2, f5) + (fA003 * f6), C8j3.A04(f5, AnonymousClass001.A01(jA0L2, 4294967295L), f4 * fA01, f6, fA012));
    }

    public static final float easeIn(float f) {
        return f * f * f;
    }

    public static final float easeInOut(float f) {
        return C8j5.A02((f > 0.5f ? 1 : (f == 0.5f ? 0 : -1)), f);
    }

    public static final float easeOut(float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, 3.0d));
    }

    public static final float getOneDp() {
        return OneDp;
    }

    public static final float getPopHopFrom() {
        return PopHopFrom;
    }

    public static final float getPopHopRebound() {
        return PopHopRebound;
    }

    public static final float getPopHopSettle() {
        return PopHopSettle;
    }

    /* renamed from: quadraticPointAt-428G9Dg, reason: not valid java name */
    public static final long m408quadraticPointAt428G9Dg(long j, long j2, long j3, float f) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2;
        float f4 = f2 * 2.0f * f;
        float f5 = f * f;
        return AnonymousClass005.A0L(C8j4.A00(j, f3) + C8j4.A00(j2, f4) + C8j4.A00(j3, f5), (f3 * AnonymousClass001.A01(j, 4294967295L)) + (f4 * AnonymousClass001.A01(j2, 4294967295L)) + (f5 * AnonymousClass001.A01(j3, 4294967295L)));
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf = Float.valueOf(0.48f);
        Float fA0t = C8j3.A0t();
        DiamondScaleKeyTimes = C8j4.A12(fA0a, fValueOf, fA0t);
        DiamondFadeTrack = Arrays.asList(fA0a, fA0t, fA0a);
        DiamondFadeKeyTimes = C8j4.A12(fA0a, Float.valueOf(0.38f), fA0t);
        SpecularTravelKeyTimes = C8j4.A12(fA0a, fValueOf, fA0t);
        SpecularFadeTrack = Arrays.asList(fA0a, fA0t, fA0t, fA0a);
        SpecularFadeKeyTimes = C8j5.A0d(fA0a, Float.valueOf(0.24f), fA0t, 0.68f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return X.AnonymousClass001.A02(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float keyframe(java.util.List<java.lang.Float> r7, java.util.List<java.lang.Float> r8, float r9) {
        /*
            X.AnonymousClass003.A0u(r7, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            float r5 = X.ATD.A03(r9, r6, r0)
            int r2 = X.C60O.A00(r8)
            r4 = 0
        Lf:
            if (r4 >= r2) goto L33
            int r1 = r4 + 1
            float r0 = X.C8j4.A03(r8, r1)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L31
            float r3 = X.C8j4.A03(r8, r1)
            float r0 = X.C8j4.A03(r8, r4)
            float r3 = r3 - r0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L38
            java.lang.Object r0 = r7.get(r1)
        L2c:
            float r0 = X.AnonymousClass001.A02(r0)
            return r0
        L31:
            r4 = r1
            goto Lf
        L33:
            java.lang.Object r0 = X.AbstractC0878AGe.A0H(r7)
            goto L2c
        L38:
            float r2 = X.C8j4.A03(r7, r4)
            float r1 = X.C8j4.A03(r7, r1)
            float r0 = X.C8j4.A03(r8, r4)
            float r5 = r5 - r0
            float r5 = r5 / r3
            float r0 = X.C8j3.A02(r1, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraReactionMotionKt.keyframe(java.util.List, java.util.List, float):float");
    }

    public static final float lerp(float f, float f2, float f3) {
        return C8j3.A02(f2, f, f3);
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m407lerpWko1d7g(long j, long j2, float f) {
        return AnonymousClass005.A0L(C8j3.A02(AnonymousClass001.A00(j2), AnonymousClass001.A00(j), f), C8j3.A02(AnonymousClass001.A01(j2, 4294967295L), AnonymousClass001.A01(j, 4294967295L), f));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AT5<java.lang.Float, ?> rememberBurstProgress(boolean r11, int r12, X.BFM r13, int r14) {
        /*
            java.lang.Object r0 = r13.AaT()
            java.lang.Object r4 = X.C78N.A00
            r10 = 0
            java.lang.Object r7 = X.AnonymousClass005.A0e(r13, r0, r4)
            X.AT5 r7 = (X.AT5) r7
            r6 = r11
            java.lang.Object r9 = X.C8j3.A0z(r13, r4, r11)
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r0 = r14 & 14
            r0 = r0 ^ 6
            r5 = 0
            r2 = 4
            if (r0 <= r2) goto L26
            boolean r0 = r13.A66(r11)
            if (r0 != 0) goto L2b
        L26:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r2) goto L2c
        L2b:
            r0 = 1
        L2c:
            boolean r2 = X.AnonymousClass001.A1T(r13, r7, r0)
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r8 = r12
            if (r0 <= r1) goto L3f
            boolean r0 = r13.A63(r12)
            if (r0 != 0) goto L43
        L3f:
            r0 = r14 & 48
            if (r0 != r1) goto L44
        L43:
            r5 = 1
        L44:
            r2 = r2 | r5
            java.lang.Object r5 = r13.AaT()
            if (r2 != 0) goto L4d
            if (r5 != r4) goto L55
        L4d:
            com.facebook.aura.components.reactions.AuraReactionMotionKt$rememberBurstProgress$1$1 r5 = new com.facebook.aura.components.reactions.AuraReactionMotionKt$rememberBurstProgress$1$1
            r5.<init>(r6, r7, r8, r9, r10)
            X.BBI.A0T(r13, r5)
        L55:
            X.AnonymousClass001.A18(r13, r5, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraReactionMotionKt.rememberBurstProgress(boolean, int, X.BFM, int):X.AT5");
    }

    public static final float keyframe(List<Float> list, float f) {
        C7384Etj.A0Y(list, 0);
        if (list.size() == 1) {
            return C8j4.A03(list, 0);
        }
        float fA00 = AnonymousClass003.A00(f) * (list.size() - 1);
        int i = (int) fA00;
        int size = list.size() - 2;
        if (i > size) {
            i = size;
        }
        return C8j3.A02(C8j4.A03(list, i + 1), C8j4.A03(list, i), fA00 - i);
    }
}
