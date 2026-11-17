package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT3;
import X.AT5;
import X.AW2;
import X.AW9;
import X.AaI;
import X.AaJ;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C1710Aot;
import X.C1EQ;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.HxE;
import X.InterfaceC1068ATy;
import X.InterfaceC1279AgP;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraSunsetWashKt {
    public static final long Apricot;
    public static final long Coral;
    public static final long EmberRed;
    public static final float FOCUS_DELAY_MS = 200.0f;
    public static final float FOCUS_MS = 1080.0f;
    public static final float FocusDiameter = 60.0f;
    public static final List<Float> FocusOpacity;
    public static final List<Float> FocusOpacityKeyTimes;
    public static final float GLYPH_MS = 960.0f;
    public static final List<Float> GlyphScale;
    public static final List<Float> GlyphScaleKeyTimes;
    public static final float PillCornerRadius = 12.0f;
    public static final float RIM_DELAY_MS = 140.0f;
    public static final float RIM_GLOW_ALPHA = 0.42f;
    public static final float RIM_GLOW_SPREAD = 3.5f;
    public static final float RIM_MS = 1380.0f;
    public static final float RIM_PEAK = 0.34f;
    public static final float RimInset = 1.0f;
    public static final List<Float> RimOpacity;
    public static final List<Float> RimOpacityKeyTimes;
    public static final float RimWidth = 1.5f;
    public static final int SUNSET_WASH_TOTAL_MS = 1620;
    public static final long Sunset;
    public static final float WASH_DELAY_MS = 50.0f;
    public static final float WASH_MS = 1360.0f;
    public static final float WASH_ORIGIN_FRACTION = -0.65f;
    public static final float WASH_WIDTH_FRACTION = 2.3f;
    public static final List<Float> WashOpacity;
    public static final List<Float> WashOpacityKeyTimes;
    public static final List<Float> WashTravelFractions;
    public static final List<Float> WashTravelKeyTimes;

    public static final void drawWashBand(AT3 at3, float f) {
        float f2 = (f - 50.0f) / 1360.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fEaseInOut = AuraReactionMotionKt.easeInOut(f2);
        float fKeyframe = AuraReactionMotionKt.keyframe(WashOpacity, WashOpacityKeyTimes, fEaseInOut);
        if (fKeyframe > 0.0f) {
            float fA00 = AnonymousClass001.A00(at3.AKb());
            float fKeyframe2 = (fA00 * (-0.65f)) + (fA00 * AuraReactionMotionKt.keyframe(WashTravelFractions, WashTravelKeyTimes, fEaseInOut));
            float fA002 = AnonymousClass001.A00(at3.AKb()) * 2.3f;
            Float fValueOf = Float.valueOf(0.0f);
            long j = B6A.A06;
            HxE[] hxEArr = (HxE[]) Arrays.copyOf(new HxE[]{C8j4.A17(fValueOf, j), AnonymousClass007.A0h(Float.valueOf(0.16f), 0.72f, EmberRed), C8j4.A17(Float.valueOf(0.36f), Coral), C8j4.A17(Float.valueOf(0.58f), Sunset), AnonymousClass007.A0h(Float.valueOf(0.78f), 0.72f, Apricot), AnonymousClass007.A0g(1.0f, j)}, 6);
            long jA0P = C8j3.A0P(fKeyframe2);
            long jA0P2 = C8j3.A0P(0.0f) & 4294967295L;
            long j2 = (jA0P << 32) | jA0P2;
            at3.A9f(C1EQ.A03(hxEArr, j2, C8j4.A0K(fKeyframe2 + fA002) | jA0P2), null, C16a.A00, fKeyframe, 3, j2, AnonymousClass005.A0M(fA002, AnonymousClass001.A01(at3.AKb(), 4294967295L)));
        }
    }

    public static final void drawWashFocus(AT3 at3, float f) {
        float f2 = (f - 200.0f) / 1080.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fKeyframe = AuraReactionMotionKt.keyframe(FocusOpacity, FocusOpacityKeyTimes, AuraReactionMotionKt.easeInOut(f2));
        if (fKeyframe > 0.0f) {
            float fAh4 = at3.Ah4(FocusDiameter) / 2.0f;
            at3.A9M(C1EQ.A04(new HxE[]{C8j4.A17(Float.valueOf(0.0f), EmberRed), C8j4.A17(Float.valueOf(0.26f), Coral), AnonymousClass007.A0h(Float.valueOf(0.54f), 0.88f, Sunset), AnonymousClass007.A0h(Float.valueOf(0.8f), 0.54f, Apricot), C8j4.A17(Float.valueOf(1.0f), B6A.A06)}, fAh4, at3.ADU()), null, C16a.A00, fAh4, fKeyframe, 3, at3.ADU());
        }
    }

    public static final void drawWashRim(AT3 at3, float f) {
        float f2 = (f - 140.0f) / 1380.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fKeyframe = AuraReactionMotionKt.keyframe(RimOpacity, RimOpacityKeyTimes, AuraReactionMotionKt.easeInOut(f2));
        if (fKeyframe > 0.0f) {
            float fAh4 = at3.Ah4(RimInset);
            float fAh42 = at3.Ah4(RimWidth);
            long jA0P = C8j3.A0P(fAh4);
            long j = (jA0P << 32) | (jA0P & 4294967295L);
            long jAKb = at3.AKb();
            float f3 = fAh4 * 2.0f;
            long jA0M = AnonymousClass005.A0M(AnonymousClass001.A00(jAKb) - f3, AnonymousClass001.A01(jAKb, 4294967295L) - f3);
            long jA0O = C8j3.A0O(Math.min(AnonymousClass001.A01(jA0M, 4294967295L) / 2.0f, at3.Ah4(PillCornerRadius) - fAh4));
            long j2 = EmberRed;
            at3.A9j(null, new AaJ(null, fAh42 * 3.5f, 4.0f, 0, 0), 0.42f * fKeyframe, 3, j2, j, jA0M, jA0O);
            at3.A9j(null, new AaJ(null, fAh42, 4.0f, 0, 0), fKeyframe, 3, Apricot, j, jA0M, jA0O);
        }
    }

    public static final BRg auraSunsetWashGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, SUNSET_WASH_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT, obj);
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, interfaceC1068ATy);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraSunsetWashKt$auraSunsetWashGlyph$1$1(at5RememberBurstProgress, interfaceC1068ATy);
            BBI.A0T(bfm, objAaT2);
        }
        BRg bRgA00 = AEk.A00(bRg, objAaT2);
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT3 = bfm.AaT();
        if (zA67 || objAaT3 == obj) {
            objAaT3 = new AuraSunsetWashKt$auraSunsetWashGlyph$2$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT3);
        }
        return AnonymousClass001.A0W(bRgA00, objAaT3);
    }

    public static final void drawSunsetWash(AT3 at3, float f, InterfaceC1068ATy interfaceC1068ATy) {
        float fMin = Math.min(AnonymousClass001.A01(at3.AKb(), 4294967295L) / 2.0f, at3.Ah4(PillCornerRadius));
        ((C1710Aot) interfaceC1068ATy).A03.reset();
        long jAKb = at3.AKb();
        float fA00 = AnonymousClass001.A00(jAKb);
        float fA01 = AnonymousClass001.A01(jAKb, 4294967295L);
        long jA0P = C8j3.A0P(fMin);
        interfaceC1068ATy.A3t(AW2.A00(0.0f, 0.0f, fA00, fA01, (jA0P << 32) | (4294967295L & jA0P)));
        InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.A6M(interfaceC1068ATy, 1);
            drawWashBand(at3, f);
            drawWashFocus(at3, f);
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            drawWashRim(at3, f);
        } catch (Throwable th) {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            throw th;
        }
    }

    static {
        long j = B6A.A01;
        EmberRed = 4292429615L << 32;
        Coral = 4294075965L << 32;
        Sunset = 4294940741L << 32;
        Apricot = 4294955418L << 32;
        Float fValueOf = Float.valueOf(-0.24f);
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf2 = Float.valueOf(0.22f);
        WashTravelFractions = C8j4.A12(fValueOf, fA0a, fValueOf2);
        Float fValueOf3 = Float.valueOf(0.56f);
        Float fA0t = C8j3.A0t();
        WashTravelKeyTimes = C8j4.A12(fA0a, fValueOf3, fA0t);
        WashOpacity = Arrays.asList(fA0a, Float.valueOf(0.28f), Float.valueOf(0.44f), Float.valueOf(0.42f), Float.valueOf(0.2f), fA0a);
        Float fValueOf4 = Float.valueOf(0.16f);
        WashOpacityKeyTimes = Arrays.asList(fA0a, fValueOf4, Float.valueOf(0.38f), Float.valueOf(0.64f), Float.valueOf(0.82f), fA0t);
        Float fValueOf5 = Float.valueOf(0.3f);
        FocusOpacity = Arrays.asList(fA0a, fValueOf4, fValueOf5, fValueOf2, fA0a);
        Float fValueOf6 = Float.valueOf(0.46f);
        Float fValueOf7 = Float.valueOf(0.72f);
        FocusOpacityKeyTimes = C8j4.A14(fA0a, fValueOf2, fValueOf6, fValueOf7, fA0t);
        Float fValueOf8 = Float.valueOf(0.34f);
        RimOpacity = Arrays.asList(fA0a, fValueOf8, fValueOf8, Float.valueOf(0.1496f), fA0a);
        RimOpacityKeyTimes = C8j4.A14(fA0a, fValueOf2, fValueOf3, Float.valueOf(0.78f), fA0t);
        GlyphScale = C8j5.A0c(fA0t, Float.valueOf(1.018f), Float.valueOf(1.035f), 1.01f);
        GlyphScaleKeyTimes = C8j4.A14(fA0a, fValueOf5, Float.valueOf(0.5f), fValueOf7, fA0t);
    }
}
