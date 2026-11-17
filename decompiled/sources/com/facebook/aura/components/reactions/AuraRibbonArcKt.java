package com.facebook.aura.components.reactions;

import X.ADq;
import X.AHD;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BNt;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraRibbonArcKt {
    public static final float BAND_ALPHA = 0.55f;
    public static final float BAND_HOLD_MS = 240.0f;
    public static final float BAND_INSET = 2.4f;
    public static final float BAND_REVEAL_MS = 300.0f;
    public static final int BAND_SAMPLES = 16;
    public static final float BAND_STAGGER_MS = 25.0f;
    public static final long BandControl;
    public static final long BandFrom;
    public static final long BandTo;
    public static final float BandWidth = 2.0f;
    public static final float MOTE_ANGLE_STEP = 0.5f;
    public static final int MOTE_COUNT = 4;
    public static final float MOTE_DELAY_MS = 620.0f;
    public static final float MOTE_END_SCALE = 0.4f;
    public static final float MOTE_LIFT = 6.0f;
    public static final float MOTE_MS = 420.0f;
    public static final float MOTE_REACH_X = 26.0f;
    public static final float MOTE_REACH_Y = 20.0f;
    public static final long MoteOrigin;
    public static final float MoteSize = 3.6f;
    public static final int RIBBON_BAND_LIMIT = 5;
    public static final float RIBBON_SCALE_MS = 300.0f;
    public static final int RIBBON_TOTAL_MS = 1040;
    public static final List<Float> RibbonScales = C8j5.A0a(C8j3.A0s(), Float.valueOf(1.08f), 1.0f);

    public static final void drawRibbonMotes(AT3 at3, float f, AHD<B6A> ahd) {
        float f2 = (f - 620.0f) / 420.0f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        float fA00 = AXN.A00(at3);
        long jA03 = AWx.A03(MoteOrigin, fA00, at3.ADU());
        float fA01 = 1.0f - ATD.A01(f2);
        float fA012 = C8j5.A01(at3.Ah4(MoteSize), f2);
        int i = 0;
        do {
            long jADU = at3.ADU();
            double d = ((i - 1.5f) * 0.5f) - 1.5707964f;
            at3.A9N(null, C16a.A00, fA012, fA01, 3, C8j5.A0G(ahd, i), AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA03, AnonymousClass005.A0L(AnonymousClass001.A00(jADU) + (((float) Math.cos(d)) * 26.0f * fA00), AnonymousClass001.A01(jADU, 4294967295L) + (((float) Math.sin(d)) * 20.0f * fA00)), fA00 * 6.0f, AuraReactionMotionKt.easeInOut(f2)));
            i++;
        } while (i < 4);
    }

    static {
        long jA0P = C8j3.A0P(-30.0f);
        long jA0P2 = C8j3.A0P(10.0f) & 4294967295L;
        BandFrom = (jA0P << 32) | jA0P2;
        BandTo = C8j4.A0K(30.0f) | jA0P2;
        long jA0F = AnonymousClass002.A0F() << 32;
        BandControl = jA0F | (C8j3.A0P(-26.0f) & 4294967295L);
        MoteOrigin = jA0F | (C8j3.A0P(-12.0f) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraRibbonArc(X.BRg r7, boolean r8, X.AHD<X.B6A> r9, X.BFM r10, int r11) {
        /*
            X.AnonymousClass003.A0v(r7, r9)
            int r1 = X.C8j3.A09(r11)
            r0 = 1040(0x410, float:1.457E-42)
            X.AT5 r6 = com.facebook.aura.components.reactions.AuraReactionMotionKt.rememberBurstProgress(r8, r0, r10, r1)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r5 = X.C78N.A00
            java.lang.Object r4 = X.C8j4.A0o(r10, r0, r5)
            X.ATy r4 = (X.InterfaceC1068ATy) r4
            boolean r3 = r10.A67(r6)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L2b
            boolean r0 = r10.A65(r9)
            if (r0 != 0) goto L30
        L2b:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L31
        L30:
            r0 = 1
        L31:
            boolean r1 = X.AnonymousClass002.A1V(r10, r4, r0, r3)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3d
            if (r0 != r5) goto L45
        L3d:
            com.facebook.aura.components.reactions.AuraRibbonArcKt$auraRibbonArc$1$1 r0 = new com.facebook.aura.components.reactions.AuraRibbonArcKt$auraRibbonArc$1$1
            r0.<init>(r6, r9, r4)
            X.BBI.A0T(r10, r0)
        L45:
            X.BRg r0 = X.AEk.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraRibbonArcKt.auraRibbonArc(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraRibbonArcGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, RIBBON_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraRibbonArcKt$auraRibbonArcGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }

    public static final void drawRibbonBands(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f, AHD<B6A> ahd) {
        float fA00 = AXN.A00(at3);
        int iMin = Math.min(5, ahd.size());
        for (int i = 0; i < iMin; i++) {
            float f2 = i;
            float f3 = f - (25.0f * f2);
            float fStrokeAlpha = AuraReactionStrokesKt.strokeAlpha(f3, 300.0f, 240.0f) * 0.55f;
            if (fStrokeAlpha > 0.0f) {
                float f4 = f2 * 2.4f;
                long jADU = at3.ADU();
                long j = BandFrom;
                long jA03 = AWx.A03(AnonymousClass005.A0M(AnonymousClass001.A00(j), AnonymousClass001.A01(j, 4294967295L) + f4), fA00, jADU);
                long j2 = BandTo;
                long jA032 = AWx.A03(AnonymousClass005.A0M(AnonymousClass001.A00(j2), AnonymousClass001.A01(j2, 4294967295L) + f4), fA00, jADU);
                long j3 = BandControl;
                long jA033 = AWx.A03(AnonymousClass005.A0M(AnonymousClass001.A00(j3), AnonymousClass001.A01(j3, 4294967295L) + f4), fA00, jADU);
                ADq aDq = new ADq(0, 16);
                ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
                Iterator<Integer> it = aDq.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(AWx.A0B(AuraReactionMotionKt.m408quadraticPointAt428G9Dg(jA03, jA033, jA032, ((BNt) it).A00() / 16.0f)));
                }
                AuraReactionStrokesKt.m412drawRevealedPolylineFTNlnNA(at3, interfaceC1068ATy, arrayListA0i, AuraReactionMotionKt.easeOut(ATD.A03(f3 / 300.0f, 0.0f, 1.0f)), C8j4.A0P(ahd, i), at3.Ah4(BandWidth), 1, fStrokeAlpha);
            }
        }
    }
}
