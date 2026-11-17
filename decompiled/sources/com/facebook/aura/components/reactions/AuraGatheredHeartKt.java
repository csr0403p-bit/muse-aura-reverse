package com.facebook.aura.components.reactions;

import X.ADq;
import X.AT2;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BNt;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraGatheredHeartKt {
    public static final float GATHERED_SPRING_AT_MS = 660.0f;
    public static final float GATHERED_SPRING_MS = 260.0f;
    public static final float GATHERED_STROKE_ALPHA = 0.85f;
    public static final int GATHERED_TOTAL_MS = 920;
    public static final float GatheredHeartSize = 13.0f;
    public static final List<Float> GatheredScales;
    public static final float GatheredStrokeWidth = 2.0f;
    public static final float HEART_DROP_AT_MS = 460.0f;
    public static final float HEART_DROP_MS = 260.0f;
    public static final float HEART_END_SCALE = 0.4f;
    public static final float HEART_FADE_IN_AT_MS = 280.0f;
    public static final float HEART_FADE_IN_MS = 100.0f;
    public static final float HEART_FROM_SCALE = 0.3f;
    public static final float HEART_GROW_MS = 160.0f;
    public static final long MeetPoint = (AnonymousClass002.A0F() << 32) | (C8j3.A0P(-26.0f) & 4294967295L);
    public static final float STROKE_HOLD_MS = 60.0f;
    public static final float STROKE_REVEAL_MS = 260.0f;
    public static final int STROKE_SAMPLES = 12;
    public static final long StrokeControl;
    public static final long StrokeFrom;
    public static final List<Float> StrokeSides;

    /* renamed from: drawGatheredHeart-g2O1Hgs, reason: not valid java name */
    public static final void m397drawGatheredHeartg2O1Hgs(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f, long j) {
        float f2 = f - 280.0f;
        float fA03 = ATD.A03(f2 / 100.0f, 0.0f, 1.0f);
        if (fA03 > 0.0f) {
            long jA03 = AWx.A03(MeetPoint, AXN.A00(at3), at3.ADU());
            float fA02 = ATD.A02(f2, 160.0f);
            float f3 = (f - 460.0f) / 260.0f;
            if (f3 < 1.0f) {
                if (f3 > 0.0f) {
                    jA03 = AuraReactionMotionKt.m402curvePointAtjyLRC_s(jA03, at3.ADU(), 0.0f, AuraReactionMotionKt.easeInOut(f3));
                }
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                float fA022 = C8j3.A02(1.0f, 0.3f, AuraReactionMotionKt.easeOut(fA02)) * C8j3.A02(0.4f, 1.0f, f3);
                float fA01 = fA03 * (1.0f - ATD.A01(f3));
                float fAh4 = at3.Ah4(GatheredHeartSize) * fA022;
                float f4 = fAh4 / 2.0f;
                float fA032 = AnonymousClass003.A03(jA03) - f4;
                float fA033 = C8j5.A03(jA03) - f4;
                AT2 at2A00 = AT2.A00(at3, fA032, fA033);
                try {
                    AuraReactionShapesKt.heartPath(interfaceC1068ATy, fAh4);
                    C8j4.A1K(at3, interfaceC1068ATy, fA01, j);
                } finally {
                    AT2.A01(at2A00, fA032, fA033);
                }
            }
        }
    }

    /* renamed from: drawGatheringStrokes-g2O1Hgs, reason: not valid java name */
    public static final void m398drawGatheringStrokesg2O1Hgs(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f, long j) {
        float fStrokeAlpha = AuraReactionStrokesKt.strokeAlpha(f, 260.0f, 60.0f) * 0.85f;
        if (fStrokeAlpha > 0.0f) {
            float fA00 = AXN.A00(at3);
            long jA03 = AWx.A03(MeetPoint, fA00, at3.ADU());
            float fEaseOut = AuraReactionMotionKt.easeOut(ATD.A03(f / 260.0f, 0.0f, 1.0f));
            Iterator<Float> it = StrokeSides.iterator();
            while (it.hasNext()) {
                float fA02 = AnonymousClass001.A02(it.next());
                long jADU = at3.ADU();
                long j2 = StrokeFrom;
                long jA032 = AWx.A03(AnonymousClass005.A0L(C8j4.A00(j2, fA02), AnonymousClass001.A01(j2, 4294967295L)), fA00, jADU);
                long j3 = StrokeControl;
                long jA033 = AWx.A03(AnonymousClass005.A0L(C8j4.A00(j3, fA02), AnonymousClass001.A01(j3, 4294967295L)), fA00, jADU);
                ADq aDq = new ADq(0, 12);
                ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
                Iterator<Integer> it2 = aDq.iterator();
                while (it2.hasNext()) {
                    arrayListA0i.add(AWx.A0B(AuraReactionMotionKt.m408quadraticPointAt428G9Dg(jA032, jA033, jA03, ((BNt) it2).A00() / 12.0f)));
                }
                AuraReactionStrokesKt.m412drawRevealedPolylineFTNlnNA(at3, interfaceC1068ATy, arrayListA0i, fEaseOut, j, at3.Ah4(GatheredStrokeWidth), 1, fStrokeAlpha);
            }
        }
    }

    static {
        Float fValueOf = Float.valueOf(-1.0f);
        Float fA0t = C8j3.A0t();
        StrokeSides = Arrays.asList(fValueOf, fA0t);
        StrokeFrom = (C8j3.A0P(28.0f) << 32) | (C8j3.A0P(4.0f) & 4294967295L);
        StrokeControl = (C8j3.A0P(24.0f) << 32) | (4294967295L & C8j3.A0P(-24.0f));
        GatheredScales = C8j5.A0Z(fA0t, 1.14f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraGatheredHeart(X.BRg r7, boolean r8, X.AHD<X.B6A> r9, X.BFM r10, int r11) {
        /*
            X.AnonymousClass003.A0v(r7, r9)
            int r1 = X.C8j3.A09(r11)
            r0 = 920(0x398, float:1.289E-42)
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
            com.facebook.aura.components.reactions.AuraGatheredHeartKt$auraGatheredHeart$1$1 r0 = new com.facebook.aura.components.reactions.AuraGatheredHeartKt$auraGatheredHeart$1$1
            r0.<init>(r6, r9, r4)
            X.BBI.A0T(r10, r0)
        L45:
            X.BRg r0 = X.AEk.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraGatheredHeartKt.auraGatheredHeart(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraGatheredHeartGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 920, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraGatheredHeartKt$auraGatheredHeartGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
