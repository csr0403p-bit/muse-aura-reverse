package com.facebook.aura.components.reactions;

import X.AT2;
import X.AT3;
import X.ATD;
import X.AW9;
import X.AWx;
import X.AXN;
import X.AaI;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.C16a;
import X.C1EQ;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.HxE;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraFireSmokeBurstKt {
    public static final float EMBER_ALPHA = 0.95f;
    public static final float EMBER_CORNER_RATIO = 0.16666667f;
    public static final float EMBER_END_SCALE = 0.4f;
    public static final float EMBER_HEIGHT_RATIO = 0.6666667f;
    public static final float EMBER_LIFETIME_MS = 600.0f;
    public static final float EMBER_SPIN_PER_DX = 0.025f;
    public static final float EMBER_STAGGER_STEP_MS = 22.0f;
    public static final float EMBER_WAVE_DELAY_MS = 120.0f;
    public static final float EMBER_WIDTH_RATIO = 0.33333334f;
    public static final List<HxE<Float, Float>> EmberAlphaTrack;
    public static final float EmberSize;
    public static final List<AWx> EmberTravel;
    public static final int FIRE_SMOKE_DURATION_MS = 1530;
    public static final List<B6A> FireTint;
    public static final float SMOKE_END_SCALE = 2.0f;
    public static final float SMOKE_LIFETIME_MS = 1150.0f;
    public static final float SMOKE_PEAK_ALPHA = 0.34f;
    public static final float SMOKE_SUSTAIN_ALPHA = 0.28f;
    public static final float SMOKE_WAVE_DELAY_MS = 80.0f;
    public static final List<HxE<Float, Float>> SmokeAlphaTrack;
    public static final List<B6A> SmokeGreys;
    public static final List<Float> SmokeSizeJitter;
    public static final List<Float> SmokeSpin;
    public static final List<Float> SmokeStaggerMs;
    public static final List<AWx> SmokeTravel;
    public static final float ArcLift = 4.0f;
    public static final float SmokeSize = 13.0f;

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraFireSmokeBurst(X.BRg r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r5 = X.C78N.A00
            r7 = 0
            java.lang.Object r4 = X.AnonymousClass005.A0e(r10, r0, r5)
            X.AT5 r4 = (X.AT5) r4
            java.lang.Object r6 = X.C8j3.A0z(r10, r5, r9)
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L29
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L2e
        L29:
            r1 = r11 & 48
            r0 = 0
            if (r1 != r2) goto L2f
        L2e:
            r0 = 1
        L2f:
            boolean r1 = X.AnonymousClass001.A1T(r10, r4, r0)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3b
            if (r0 != r5) goto L43
        L3b:
            com.facebook.aura.components.reactions.AuraFireSmokeBurstKt$auraFireSmokeBurst$1$1 r0 = new com.facebook.aura.components.reactions.AuraFireSmokeBurstKt$auraFireSmokeBurst$1$1
            r0.<init>(r9, r4, r6, r7)
            X.BBI.A0T(r10, r0)
        L43:
            X.AnonymousClass001.A18(r10, r0, r3)
            boolean r1 = r10.A67(r4)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L52
            if (r0 != r5) goto L5a
        L52:
            com.facebook.aura.components.reactions.AuraFireSmokeBurstKt$auraFireSmokeBurst$2$1 r0 = new com.facebook.aura.components.reactions.AuraFireSmokeBurstKt$auraFireSmokeBurst$2$1
            r0.<init>(r4)
            X.BBI.A0T(r10, r0)
        L5a:
            X.BRg r0 = X.AEk.A00(r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraFireSmokeBurstKt.auraFireSmokeBurst(X.BRg, boolean, X.BFM, int):X.BRg");
    }

    public static final Float particleProgress(float f, float f2, float f3) {
        float f4 = (f - f2) / f3;
        if (f4 <= 0.0f || f4 >= 1.0f) {
            return null;
        }
        return Float.valueOf(f4);
    }

    static {
        AWx aWxA0C = AWx.A0C(C8j3.A0P(-5.0f) << 32, C8j3.A0P(-46.0f) & 4294967295L);
        AWx aWxA0C2 = AWx.A0C(C8j3.A0P(11.0f) << 32, C8j3.A0P(-58.0f) & 4294967295L);
        AWx aWxA0C3 = AWx.A0C(C8j3.A0P(-14.0f) << 32, C8j3.A0P(-38.0f) & 4294967295L);
        long jA0P = C8j3.A0P(4.0f) << 32;
        SmokeTravel = Arrays.asList(aWxA0C, aWxA0C2, aWxA0C3, AWx.A0C(jA0P, C8j3.A0P(-66.0f) & 4294967295L), AWx.A0C(C8j3.A0P(-8.0f) << 32, C8j3.A0P(-52.0f) & 4294967295L), AWx.A0C(C8j3.A0P(16.0f) << 32, C8j3.A0P(-43.0f) & 4294967295L), AWx.A0C(C8j3.A0P(-60.0f) & 4294967295L, C8j3.A0P(-2.0f) << 32));
        Float fA0t = C8j3.A0t();
        Float fValueOf = Float.valueOf(1.25f);
        Float fValueOf2 = Float.valueOf(0.85f);
        Float fValueOf3 = Float.valueOf(1.15f);
        Float fValueOf4 = Float.valueOf(0.95f);
        SmokeSizeJitter = Arrays.asList(fA0t, fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(1.3f), Float.valueOf(1.05f));
        Float fA0a = AnonymousClass005.A0a();
        SmokeStaggerMs = Arrays.asList(fA0a, Float.valueOf(90.0f), Float.valueOf(180.0f), Float.valueOf(50.0f), Float.valueOf(240.0f), Float.valueOf(130.0f), Float.valueOf(300.0f));
        SmokeSpin = Arrays.asList(Float.valueOf(0.5f), Float.valueOf(-0.4f), Float.valueOf(0.8f), Float.valueOf(-0.7f), Float.valueOf(0.3f), Float.valueOf(-0.55f), Float.valueOf(0.65f));
        SmokeGreys = Arrays.asList(C8j4.A0Y(4283058762L), C8j4.A0Y(4286216826L), C8j4.A0Y(4285227356L));
        EmberSize = 6.0f;
        EmberTravel = Arrays.asList(AWx.A0C(C8j3.A0P(-7.0f) << 32, C8j3.A0P(-26.0f) & 4294967295L), AWx.A0C(C8j3.A0P(9.0f) << 32, C8j3.A0P(-33.0f) & 4294967295L), AWx.A0C(C8j3.A0P(-13.0f) << 32, C8j3.A0P(-20.0f) & 4294967295L), AWx.A0C(jA0P, 4294967295L & C8j3.A0P(-29.0f)));
        FireTint = AnonymousClass004.A17(C8j4.A0Y(4294933016L), 4292881691L << 32);
        HxE hxE = new HxE(fA0a, fA0a);
        HxE hxEA0r = C3cG.A0r(Float.valueOf(0.18f), Float.valueOf(0.34f));
        Float fValueOf5 = Float.valueOf(0.55f);
        SmokeAlphaTrack = Arrays.asList(hxE, hxEA0r, C3cG.A0r(fValueOf5, Float.valueOf(0.28f)), C3cG.A0r(fA0t, fA0a));
        EmberAlphaTrack = Arrays.asList(C3cG.A0r(fA0a, fValueOf4), C3cG.A0r(fValueOf5, fValueOf4), C3cG.A0r(fA0t, fA0a));
    }

    public static final void drawEmbers(AT3 at3, float f, AXN axn) {
        float f2 = AuraReactionMotionKt.OneDp;
        C7384Etj.A0Y(axn, 1);
        float fA01 = AXN.A01(axn, f2);
        float fA012 = AXN.A01(axn, ArcLift);
        float fA013 = AXN.A01(axn, EmberSize);
        long jADU = at3.ADU();
        List<AWx> list = EmberTravel;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Float fParticleProgress = particleProgress(f, (i * 22.0f) + 120.0f, 600.0f);
            if (fParticleProgress != null) {
                float fFloatValue = fParticleProgress.floatValue();
                long jA09 = AWx.A09(list, i);
                long jM401arcPositionjyLRC_s = AuraReactionMotionKt.m401arcPositionjyLRC_s(jADU, AWx.A02(jA09, fA01), fA012, fFloatValue);
                float fA02 = C8j3.A02(0.4f, 1.0f, fFloatValue);
                float f3 = 0.33333334f * fA013 * fA02;
                float f4 = 0.6666667f * fA013 * fA02;
                float fA00 = AnonymousClass001.A00(jA09) * 0.025f * fFloatValue;
                float fA002 = AnonymousClass001.A00(jM401arcPositionjyLRC_s);
                float fA014 = AnonymousClass001.A01(jM401arcPositionjyLRC_s, 4294967295L);
                AaI aaI = (AaI) at3.AEq();
                AT2 at2 = aaI.A01;
                at2.AhL(fA002, fA014);
                try {
                    float degrees = (float) Math.toDegrees(fA00);
                    AW9 aw9 = aaI.A02.A02;
                    long j = aw9.A00;
                    aw9.A01.Ac2();
                    try {
                        at2.Abq(degrees, 0L);
                        float f5 = 0.16666667f * fA013 * fA02;
                        at3.A9j(null, C16a.A00, ATD.A03(alphaAt(fFloatValue, EmberAlphaTrack), 0.0f, 1.0f), 3, C8j5.A0G(FireTint, i), AnonymousClass005.A0L((-f3) / 2.0f, (-f4) / 2.0f), AnonymousClass005.A0L(f3, f4), (C8j3.A0P(f5) << 32) | (C8j3.A0P(f5) & 4294967295L));
                    } finally {
                    }
                } finally {
                    AT2.A01(at2, fA002, fA014);
                }
            }
        }
    }

    public static final void drawSmoke(AT3 at3, float f, AXN axn) {
        float f2 = AuraReactionMotionKt.OneDp;
        C7384Etj.A0Y(axn, 1);
        float fA01 = AXN.A01(axn, f2);
        float fA012 = AXN.A01(axn, ArcLift);
        float fA013 = AXN.A01(axn, SmokeSize);
        long jADU = at3.ADU();
        List<AWx> list = SmokeTravel;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Float fParticleProgress = particleProgress(f, C8j4.A03(SmokeStaggerMs, i) + 80.0f, 1150.0f);
            if (fParticleProgress != null) {
                float fFloatValue = fParticleProgress.floatValue();
                long jM401arcPositionjyLRC_s = AuraReactionMotionKt.m401arcPositionjyLRC_s(jADU, AWx.A02(AWx.A09(list, i), fA01), fA012, fFloatValue);
                float fA03 = C8j4.A03(SmokeSizeJitter, i) * fA013 * C8j3.A02(2.0f, 1.0f, fFloatValue);
                float fAlphaAt = alphaAt(fFloatValue, SmokeAlphaTrack);
                long jA0G = C8j5.A0G(SmokeGreys, i);
                float fA032 = AnonymousClass003.A03(jM401arcPositionjyLRC_s);
                float fA00 = AnonymousClass004.A00(jM401arcPositionjyLRC_s);
                AaI aaI = (AaI) at3.AEq();
                AT2 at2 = aaI.A01;
                at2.AhL(fA032, fA00);
                try {
                    float degrees = (float) Math.toDegrees(C8j4.A03(SmokeSpin, i) * fFloatValue);
                    long jA00 = AW9.A00(aaI.A02.A02);
                    try {
                        at2.Abq(degrees, 0L);
                        float f3 = fA03 / 2.0f;
                        at3.A9M(C1EQ.A04(new HxE[]{AnonymousClass007.A0h(AnonymousClass005.A0a(), fAlphaAt, jA0G), AnonymousClass007.A0h(Float.valueOf(0.45f), fAlphaAt * 0.45f, jA0G), C8j4.A17(Float.valueOf(1.0f), B6A.A06)}, f3, 0L), null, C16a.A00, f3, 1.0f, 3, 0L);
                    } finally {
                    }
                } finally {
                    AT2.A01(at2, fA032, fA00);
                }
            }
        }
    }

    public static final float alphaAt(float f, List<HxE<Float, Float>> list) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            HxE<Float, Float> hxE = list.get(i);
            float fA02 = AnonymousClass001.A02(hxE.first);
            float fA022 = AnonymousClass001.A02(hxE.second);
            if (f <= fA02) {
                HxE<Float, Float> hxE2 = list.get(i - 1);
                float fA023 = AnonymousClass001.A02(hxE2.first);
                float f2 = fA02 - fA023;
                return f2 <= 0.0f ? fA022 : C8j3.A02(fA022, AnonymousClass001.A02(hxE2.second), (f - fA023) / f2);
            }
        }
        return AnonymousClass001.A02(((HxE) AbstractC0878AGe.A0H(list)).second);
    }
}
