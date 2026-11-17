package com.facebook.aura.components.reactions;

import X.AEk;
import X.AKO;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AaJ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1710Aot;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraFlexKt {
    public static final float FLEX_SQUASH_MS = 420.0f;
    public static final float FLEX_STROKE_ALPHA = 0.78f;
    public static final int FLEX_TOTAL_MS = 600;
    public static final long FlexColor;
    public static final List<Float> FlexKeyTimes;
    public static final List<Float> FlexScaleX;
    public static final List<Float> FlexScaleY;
    public static final float STROKE_DELAY_MS = 200.0f;
    public static final float STROKE_HOLD_MS = 30.0f;
    public static final float STROKE_REVEAL_MS = 100.0f;
    public static final float STROKE_STAGGER_MS = 25.0f;
    public static final long StrokeControl;
    public static final long StrokeInner;
    public static final long StrokeOuter;
    public static final float StrokeWidth = 1.6f;

    public static final BRg auraFlex(BRg bRg, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 600, bfm, C8j3.A09(i));
        BBI bbi = (BBI) bfm;
        AXN axnA04 = AKO.A04(Am0.A04, bbi);
        boolean zA65 = bfm.A65(axnA04);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AaJ(null, axnA04.Ah4(StrokeWidth), 4.0f, 1, 0);
            bfm.Ai0(objAaT);
        }
        AaJ aaJ = (AaJ) objAaT;
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT2, obj);
        boolean zA1S = AnonymousClass005.A1S(bfm, at5RememberBurstProgress, interfaceC1068ATy, aaJ);
        Object objAaT3 = bfm.AaT();
        if (zA1S || objAaT3 == obj) {
            objAaT3 = new AuraFlexKt$auraFlex$1$1(at5RememberBurstProgress, interfaceC1068ATy, aaJ);
            BBI.A0O(bbi, objAaT3);
        }
        return AEk.A00(bRg, objAaT3);
    }

    public static final void drawTensionStrokes(AT3 at3, float f, InterfaceC1068ATy interfaceC1068ATy, AaJ aaJ) {
        float fA00 = AXN.A00(at3);
        int i = 0;
        Iterator it = Arrays.asList(Float.valueOf(-1.0f), Float.valueOf(1.0f)).iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            float fA02 = AnonymousClass001.A02(it.next());
            float f2 = (f - 200.0f) - (i * 25.0f);
            if (f2 > 0.0f) {
                float fEaseOut = AuraReactionMotionKt.easeOut(ATD.A02(f2, 100.0f));
                if (fEaseOut > 0.0f) {
                    float fStrokeAlpha = AuraReactionStrokesKt.strokeAlpha(f2, 100.0f, 30.0f) * 0.78f;
                    if (fStrokeAlpha > 0.0f) {
                        long jADU = at3.ADU();
                        long j = StrokeInner;
                        long jA03 = AWx.A03(AnonymousClass005.A0M(C8j4.A00(j, fA02), AnonymousClass001.A01(j, 4294967295L)), fA00, jADU);
                        long j2 = StrokeControl;
                        long jA032 = AWx.A03(AnonymousClass005.A0M(C8j4.A00(j2, fA02), AnonymousClass001.A01(j2, 4294967295L)), fA00, jADU);
                        long j3 = StrokeOuter;
                        long jA033 = AWx.A03(AnonymousClass005.A0L(C8j4.A00(j3, fA02), AnonymousClass001.A01(j3, 4294967295L)), fA00, jADU);
                        long jM407lerpWko1d7g = AuraReactionMotionKt.m407lerpWko1d7g(jA03, jA032, fEaseOut);
                        long jM407lerpWko1d7g2 = AuraReactionMotionKt.m407lerpWko1d7g(jM407lerpWko1d7g, AuraReactionMotionKt.m407lerpWko1d7g(jA032, jA033, fEaseOut), fEaseOut);
                        Path path = ((C1710Aot) interfaceC1068ATy).A03;
                        path.reset();
                        path.moveTo(AnonymousClass001.A00(jA03), AnonymousClass001.A01(jA03, 4294967295L));
                        path.quadTo(AnonymousClass001.A00(jM407lerpWko1d7g), AnonymousClass001.A01(jM407lerpWko1d7g, 4294967295L), AnonymousClass001.A00(jM407lerpWko1d7g2), AnonymousClass001.A01(jM407lerpWko1d7g2, 4294967295L));
                        at3.A9d(null, interfaceC1068ATy, aaJ, ATD.A03(fStrokeAlpha, 0.0f, 1.0f), 3, FlexColor);
                    }
                }
            }
            i = i2;
        }
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf = Float.valueOf(0.18f);
        Float fValueOf2 = Float.valueOf(0.45f);
        Float fValueOf3 = Float.valueOf(0.72f);
        Float fA0t = C8j3.A0t();
        FlexKeyTimes = C8j4.A14(fA0a, fValueOf, fValueOf2, fValueOf3, fA0t);
        FlexScaleX = C8j5.A0c(fA0t, Float.valueOf(0.92f), Float.valueOf(1.12f), 0.98f);
        FlexScaleY = C8j5.A0c(fA0t, Float.valueOf(0.96f), Float.valueOf(1.08f), 1.02f);
        StrokeInner = (C8j3.A0P(13.0f) << 32) | (C8j3.A0P(-6.0f) & 4294967295L);
        StrokeControl = (C8j3.A0P(18.0f) << 32) | (C8j3.A0P(-4.0f) & 4294967295L);
        StrokeOuter = (C8j3.A0P(19.0f) << 32) | (C8j3.A0P(-9.0f) & 4294967295L);
        long j = B6A.A01;
        FlexColor = 4293436221L << 32;
    }

    public static final BRg auraFlexGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 600, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraFlexKt$auraFlexGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
