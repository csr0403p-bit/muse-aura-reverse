package com.facebook.aura.components.reactions;

import X.AT3;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraShootingStarKt {
    public static final float DOCK_DELAY_MS = 470.0f;
    public static final float FLIGHT_DELAY_MS = 60.0f;
    public static final float FLIGHT_MS = 420.0f;
    public static final List<Float> FlightKeyTimes;
    public static final List<Float> FlightX;
    public static final List<Float> FlightY;
    public static final int SHOOTING_STAR_TOTAL_MS = 700;
    public static final float TRAIL_ALPHA_STEP = 0.1f;
    public static final int TRAIL_COUNT = 5;
    public static final float TRAIL_DELAY_MS = 100.0f;
    public static final float TRAIL_END_SCALE = 0.4f;
    public static final float TRAIL_HEAD_ALPHA = 0.72f;
    public static final float TRAIL_HEAD_SIZE = 4.4f;
    public static final float TRAIL_MS = 310.0f;
    public static final float TRAIL_SIZE_STEP = 0.62f;
    public static final float TRAIL_STAGGER_MS = 35.0f;
    public static final long TrailControl;
    public static final long TrailStart;

    /* renamed from: drawStarTrail-mxwnekA, reason: not valid java name */
    public static final void m417drawStarTrailmxwnekA(AT3 at3, float f, long j) {
        float fA00 = AXN.A00(at3);
        long jADU = at3.ADU();
        long jA03 = AWx.A03(TrailStart, fA00, jADU);
        long jA032 = AWx.A03(TrailControl, fA00, jADU);
        int i = 0;
        do {
            float f2 = i;
            float f3 = ((f - 100.0f) - (35.0f * f2)) / 310.0f;
            if (f3 > 0.0f && f3 < 1.0f) {
                at3.A9N(null, C16a.A00, C8j5.A01((4.4f - (0.62f * f2)) * fA00, f3), (0.72f - (f2 * 0.1f)) * (1.0f - ATD.A01(f3)), 3, j, AuraReactionMotionKt.m408quadraticPointAt428G9Dg(jA03, jA032, at3.ADU(), AuraReactionMotionKt.easeInOut(f3)));
            }
            i++;
        } while (i < 5);
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        FlightKeyTimes = Arrays.asList(fA0a, Float.valueOf(0.2f), Float.valueOf(0.48f), Float.valueOf(0.76f), C8j3.A0s(), C8j3.A0t());
        FlightX = Arrays.asList(Float.valueOf(-30.0f), Float.valueOf(-20.0f), Float.valueOf(-8.0f), Float.valueOf(3.0f), Float.valueOf(-2.0f), fA0a);
        FlightY = Arrays.asList(Float.valueOf(-22.0f), Float.valueOf(-28.0f), Float.valueOf(-18.0f), Float.valueOf(2.0f), Float.valueOf(-1.0f), fA0a);
        TrailStart = (C8j3.A0P(-30.0f) << 32) | (C8j3.A0P(-22.0f) & 4294967295L);
        TrailControl = (C8j3.A0P(-13.0f) << 32) | (C8j3.A0P(-32.0f) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraShootingStar(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 700(0x2bc, float:9.81E-43)
            X.AT5 r4 = com.facebook.aura.components.reactions.AuraReactionMotionKt.rememberBurstProgress(r6, r0, r8, r1)
            boolean r3 = r8.A67(r4)
            r0 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L1f
            boolean r0 = r8.A65(r7)
            if (r0 != 0) goto L24
        L1f:
            r0 = r9 & 384(0x180, float:5.38E-43)
            r1 = 0
            if (r0 != r2) goto L25
        L24:
            r1 = 1
        L25:
            r1 = r1 | r3
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L30
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L38
        L30:
            com.facebook.aura.components.reactions.AuraShootingStarKt$auraShootingStar$1$1 r0 = new com.facebook.aura.components.reactions.AuraShootingStarKt$auraShootingStar$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraShootingStarKt.auraShootingStar(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraShootingStarGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 700, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraShootingStarKt$auraShootingStarGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
