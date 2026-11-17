package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT2;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AW7;
import X.AW9;
import X.AXN;
import X.AaC;
import X.AaI;
import X.AbstractC1561Alb;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1334AhL;
import X.C16a;
import X.C1710Aot;
import X.C2J7;
import X.C60P;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import X.InterfaceC1279AgP;
import android.graphics.Path;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraCelebrationBlastKt {
    public static final float ART_BOX = 12.0f;
    public static final float BURST_DELAY_MS = 180.0f;
    public static final int CELEBRATION_TOTAL_MS = 1230;
    public static final List<B6A> CelebrationColors;
    public static final float FAN_BASE_DEG = -100.0f;
    public static final float FAN_DROP = 16.0f;
    public static final float FAN_SPREAD_DEG = 70.0f;
    public static final float FLASH_ALPHA = 0.95f;
    public static final float FLASH_DELAY_MS = 180.0f;
    public static final float FLASH_FROM_SCALE = 0.4f;
    public static final float FLASH_MS = 180.0f;
    public static final float FLASH_PEAK = 0.3f;
    public static final float FLASH_TO_SCALE = 1.3f;
    public static final List<Float> FanRadii;
    public static final long FlashColor;
    public static final float FlashSize;
    public static final int PARTICLE_COUNT = 18;
    public static final float PARTICLE_END_SCALE = 0.7f;
    public static final float PARTICLE_FADE_FROM = 0.72f;
    public static final float PARTICLE_LIFE_MS = 950.0f;
    public static final float PARTICLE_LIFT = 4.0f;
    public static final float ParticleSize;
    public static final List<Float> ParticleSizeJitter;
    public static final List<Float> ParticleSpin;
    public static final List<Float> ParticleStartMs;
    public static final long PopperTip;
    public static final float RECOIL_MS = 700.0f;
    public static final List<Float> RecoilDegrees;
    public static final List<Float> RecoilDx;
    public static final List<Float> RecoilDy;
    public static final List<Float> RecoilKeyTimes;
    public static final List<Float> RecoilScaleX;
    public static final List<Float> RecoilScaleY;

    /* renamed from: drawDebris-Rg1IO4c, reason: not valid java name */
    public static final void m386drawDebrisRg1IO4c(AT3 at3, float f, long j, List<? extends InterfaceC1068ATy> list) {
        float fA00 = AXN.A00(at3);
        int i = 0;
        do {
            float fA03 = ((f - 180.0f) - C8j4.A03(ParticleStartMs, i)) / 950.0f;
            if (fA03 > 0.0f && fA03 < 1.0f) {
                float fA032 = C8j4.A03(FanRadii, i);
                double d = ((((i * 70.0f) / 17.0f) - 100.0f) * 3.1415927f) / 180.0f;
                long jM402curvePointAtjyLRC_s = AuraReactionMotionKt.m402curvePointAtjyLRC_s(j, AnonymousClass005.A0L(AnonymousClass001.A00(j) - ((((float) Math.cos(d)) * fA032) * fA00), AnonymousClass001.A01(j, 4294967295L) + (((((float) Math.sin(d)) * fA032) + 16.0f) * fA00)), fA00 * 4.0f, AuraReactionMotionKt.easeOut(fA03));
                float fAh4 = at3.Ah4(ParticleSize) * C8j4.A03(ParticleSizeJitter, i) * C8j3.A02(0.7f, 1.0f, fA03);
                float fA02 = 1.0f - ATD.A02(fA03 - 0.72f, 0.27999997f);
                float f2 = fAh4 / 12.0f;
                InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
                AaI aaI = (AaI) interfaceC1279AgPAEq;
                AW9 aw9 = aaI.A02.A02;
                long jA00 = AW9.A00(aw9);
                try {
                    AT2 at2 = aaI.A01;
                    at2.Abq(((C8j4.A03(ParticleSpin, i) * fA03) * 180.0f) / 3.1415927f, jM402curvePointAtjyLRC_s);
                    float f3 = fAh4 / 2.0f;
                    at2.AhL(AnonymousClass001.A00(jM402curvePointAtjyLRC_s) - f3, AnonymousClass001.A01(jM402curvePointAtjyLRC_s, 4294967295L) - f3);
                    at2.Ac6(f2, f2, 0L);
                    C8j4.A1K(at3, list.get(i % list.size()), fA02, C8j5.A0G(CelebrationColors, i));
                } finally {
                    AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                }
            }
            i++;
        } while (i < 18);
    }

    /* renamed from: drawMuzzleFlash-0AR0LA0, reason: not valid java name */
    public static final void m387drawMuzzleFlash0AR0LA0(AT3 at3, float f, long j) {
        float f2 = (f - 180.0f) / 180.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fAh4 = (at3.Ah4(FlashSize) / 2.0f) * C8j3.A02(1.3f, 0.4f, f2);
        at3.A9M(new C1334AhL(AnonymousClass004.A17(C60P.A04(FlashColor), B6A.A06), null, fAh4, 0, j), null, C16a.A00, fAh4, ATD.A03(f2 < 0.3f ? f2 / 0.3f : 1.0f - ((f2 - 0.3f) / 0.7f), 0.0f, 1.0f) * 0.95f, 3, j);
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf = Float.valueOf(0.26f);
        Float fValueOf2 = Float.valueOf(0.42f);
        Float fValueOf3 = Float.valueOf(0.74f);
        Float fA0t = C8j3.A0t();
        RecoilKeyTimes = C8j4.A14(fA0a, fValueOf, fValueOf2, fValueOf3, fA0t);
        RecoilDegrees = C8j4.A14(Float.valueOf(-6.0f), Float.valueOf(-11.25f), Float.valueOf(8.18f), Float.valueOf(-2.0f), fA0a);
        Float fValueOf4 = Float.valueOf(0.8f);
        Float fA0s = C8j3.A0s();
        RecoilScaleX = Arrays.asList(fValueOf4, fA0s, Float.valueOf(1.06f), fA0t, fA0t);
        RecoilScaleY = Arrays.asList(fValueOf4, Float.valueOf(0.84f), Float.valueOf(1.02f), fA0t, fA0t);
        RecoilDx = Arrays.asList(fA0a, fA0a, Float.valueOf(-5.0f), fA0t, fA0a);
        RecoilDy = Arrays.asList(fA0a, fA0a, Float.valueOf(3.0f), Float.valueOf(-1.0f), fA0a);
        PopperTip = C8j3.A0V(C8j3.A0P(-7.0f), C8j3.A0P(7.0f) << 32);
        FlashSize = 16.0f;
        long j = B6A.A01;
        FlashColor = 4294959242L << 32;
        ParticleSize = 8.0f;
        CelebrationColors = Arrays.asList(C8j4.A0Y(4292883611L), C8j4.A0Y(4281324512L), C8j4.A0Y(4294955583L), C8j4.A0Y(4294937131L), C8j4.A0Y(4288372197L), C8j4.A0Y(4292883503L));
        Float fValueOf5 = Float.valueOf(58.0f);
        Float fValueOf6 = Float.valueOf(44.0f);
        Float fValueOf7 = Float.valueOf(74.0f);
        Float fValueOf8 = Float.valueOf(51.0f);
        Float fValueOf9 = Float.valueOf(66.0f);
        Float fValueOf10 = Float.valueOf(40.0f);
        Float fValueOf11 = Float.valueOf(80.0f);
        FanRadii = Arrays.asList(fValueOf5, fValueOf6, fValueOf7, fValueOf8, fValueOf9, fValueOf10, fValueOf11, Float.valueOf(47.0f), Float.valueOf(62.0f), Float.valueOf(55.0f), Float.valueOf(71.0f), Float.valueOf(43.0f), Float.valueOf(77.0f), Float.valueOf(49.0f), Float.valueOf(64.0f), Float.valueOf(41.0f), Float.valueOf(68.0f), Float.valueOf(53.0f));
        ParticleSizeJitter = Arrays.asList(fA0t, Float.valueOf(0.7f), Float.valueOf(1.25f), Float.valueOf(0.85f), Float.valueOf(1.4f), Float.valueOf(0.6f), Float.valueOf(1.1f), fA0s, Float.valueOf(1.3f), Float.valueOf(0.75f), Float.valueOf(1.15f), Float.valueOf(0.95f), Float.valueOf(1.35f), fValueOf4, Float.valueOf(1.05f), Float.valueOf(0.65f), Float.valueOf(1.2f), fA0s);
        Float fValueOf12 = Float.valueOf(20.0f);
        Float fValueOf13 = Float.valueOf(50.0f);
        Float fValueOf14 = Float.valueOf(10.0f);
        Float fValueOf15 = Float.valueOf(70.0f);
        Float fValueOf16 = Float.valueOf(30.0f);
        Float fValueOf17 = Float.valueOf(90.0f);
        Float fValueOf18 = Float.valueOf(60.0f);
        ParticleStartMs = Arrays.asList(fA0a, fValueOf12, fValueOf13, fValueOf14, fValueOf15, fValueOf16, fValueOf17, fValueOf10, fValueOf18, fValueOf12, fValueOf11, fValueOf14, fValueOf13, fValueOf16, Float.valueOf(100.0f), fValueOf18, fValueOf10, fValueOf15);
        ParticleSpin = Arrays.asList(Float.valueOf(2.4f), Float.valueOf(-1.8f), Float.valueOf(3.1f), Float.valueOf(-2.6f), Float.valueOf(1.5f), Float.valueOf(-3.4f), Float.valueOf(2.0f), Float.valueOf(-1.2f), Float.valueOf(2.8f), Float.valueOf(-2.2f), Float.valueOf(1.7f), Float.valueOf(-2.9f), Float.valueOf(3.3f), Float.valueOf(-1.6f), Float.valueOf(2.1f), Float.valueOf(-2.4f), Float.valueOf(1.9f), Float.valueOf(-3.0f));
    }

    public static final BRg auraCelebrationBlast(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, CELEBRATION_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = celebrationShapes();
            bfm.Ai0(objAaT);
        }
        List list = (List) objAaT;
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, list);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraCelebrationBlastKt$auraCelebrationBlast$1$1(at5RememberBurstProgress, list);
            BBI.A0T(bfm, objAaT2);
        }
        return AEk.A00(bRg, objAaT2);
    }

    public static final BRg auraCelebrationBlastGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, CELEBRATION_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraCelebrationBlastKt$auraCelebrationBlastGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }

    public static final List<InterfaceC1068ATy> celebrationShapes() {
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        AaC aaCA00 = C2J7.A00((C8j3.A0P(3.5f) << 32) | (C8j3.A0P(1.5f) & 4294967295L), (C8j3.A0P(5.0f) << 32) | (C8j3.A0P(9.0f) & 4294967295L));
        long jA0J = C8j4.A0J(1.0f);
        float fA00 = AnonymousClass001.A00(jA0J);
        float fA01 = AnonymousClass001.A01(jA0J, 4294967295L);
        float f = aaCA00.A01;
        float f2 = aaCA00.A03;
        float f3 = aaCA00.A02;
        float f4 = aaCA00.A00;
        long jA0L = AnonymousClass005.A0L(fA00, fA01);
        c1710AotA00.A3t(new AW7(f, f2, f3, f4, jA0L, jA0L, jA0L, jA0L));
        C1710Aot c1710AotA002 = AbstractC1561Alb.A00();
        Path path = c1710AotA002.A03;
        path.moveTo(3.0f, 1.0f);
        path.quadTo(11.0f, 5.0f, 8.0f, 11.0f);
        path.lineTo(5.5f, 11.0f);
        path.quadTo(8.0f, 5.0f, 1.0f, 1.5f);
        path.close();
        C1710Aot c1710AotA003 = AbstractC1561Alb.A00();
        long jA0J2 = C8j4.A0J(3.0f);
        long jA0P = C8j3.A0P(6.0f);
        c1710AotA003.A00(C2J7.A00(jA0J2, (4294967295L & jA0P) | (jA0P << 32)));
        C1710Aot c1710AotA004 = AbstractC1561Alb.A00();
        Path path2 = c1710AotA004.A03;
        path2.moveTo(6.0f, 0.0f);
        path2.quadTo(7.0f, 5.0f, 12.0f, 6.0f);
        path2.quadTo(7.0f, 7.0f, 6.0f, 12.0f);
        path2.quadTo(5.0f, 7.0f, 0.0f, 6.0f);
        path2.quadTo(5.0f, 5.0f, 6.0f, 0.0f);
        path2.close();
        return Arrays.asList(c1710AotA00, c1710AotA00, c1710AotA002, c1710AotA003, c1710AotA004);
    }
}
