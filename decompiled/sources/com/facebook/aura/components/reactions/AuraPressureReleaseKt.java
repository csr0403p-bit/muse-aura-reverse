package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C16a;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraPressureReleaseKt {
    public static final float FRAGMENT_ANGLE_BIAS = 0.9f;
    public static final float FRAGMENT_DELAY_MS = 60.0f;
    public static final float FRAGMENT_END_SCALE = 0.4f;
    public static final float FRAGMENT_LIFT = 10.0f;
    public static final float FRAGMENT_MS = 480.0f;
    public static final float FRAGMENT_STAGGER_MS = 20.0f;
    public static final float FragmentDrop = 6.0f;
    public static final float FragmentSize = 4.6f;
    public static final float PRESSURE_GLYPH_MS = 460.0f;
    public static final int PRESSURE_TOTAL_MS = 620;
    public static final float RING_ALPHA = 0.9f;
    public static final float RING_DELAY_MS = 60.0f;
    public static final float RING_MS = 400.0f;
    public static final float RingFrom = 5.0f;
    public static final float RingTo = 30.0f;
    public static final float RingWidth = 1.8f;
    public static final List<Float> PressureScales = C8j4.A14(Float.valueOf(0.8f), Float.valueOf(1.34f), Float.valueOf(0.94f), Float.valueOf(1.04f), C8j3.A0t());
    public static final List<Float> FragmentAngles = C8j4.A13(Float.valueOf(-1.35f), Float.valueOf(-0.75f), Float.valueOf(-0.25f), Float.valueOf(0.35f));
    public static final List<Float> FragmentDistances = C8j4.A13(Float.valueOf(30.0f), Float.valueOf(24.0f), Float.valueOf(33.0f), Float.valueOf(27.0f));

    public static final void drawFragments(AT3 at3, float f, AHD<B6A> ahd) {
        float fA00 = AXN.A00(at3);
        List<Float> list = FragmentAngles;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f2 = ((f - 60.0f) - (i * 20.0f)) / 480.0f;
            if (f2 > 0.0f && f2 < 1.0f) {
                float fA03 = (C8j4.A03(list, i) - 1.5707964f) + 0.9f;
                float fA002 = AnonymousClass001.A00(at3.ADU());
                double d = fA03;
                float fCos = (float) Math.cos(d);
                List<Float> list2 = FragmentDistances;
                long jA0L = AnonymousClass005.A0L(fA002 + (fCos * C8j4.A03(list2, i) * fA00), (AnonymousClass001.A01(at3.ADU(), 4294967295L) + ((((float) Math.sin(d)) * C8j4.A03(list2, i)) * fA00)) - (FragmentDrop * fA00));
                long jA0G = C8j5.A0G(ahd, i);
                at3.A9N(null, C16a.A00, C8j5.A01(at3.Ah4(FragmentSize), f2), 1.0f - ATD.A01(f2), 3, jA0G, AuraReactionMotionKt.m402curvePointAtjyLRC_s(at3.ADU(), jA0L, 10.0f * fA00, AuraReactionMotionKt.easeInOut(f2)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraPressureRelease(X.BRg r5, boolean r6, X.AHD<X.B6A> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0v(r5, r7)
            int r1 = X.C8j3.A09(r9)
            r0 = 620(0x26c, float:8.69E-43)
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
            com.facebook.aura.components.reactions.AuraPressureReleaseKt$auraPressureRelease$1$1 r0 = new com.facebook.aura.components.reactions.AuraPressureReleaseKt$auraPressureRelease$1$1
            r0.<init>(r4, r7)
            X.BBI.A0T(r8, r0)
        L38:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraPressureReleaseKt.auraPressureRelease(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraPressureReleaseGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, PRESSURE_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraPressureReleaseKt$auraPressureReleaseGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
