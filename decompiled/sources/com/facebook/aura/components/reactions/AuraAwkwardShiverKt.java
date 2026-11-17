package com.facebook.aura.components.reactions;

import X.C1DG;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AuraAwkwardShiverKt {
    public static final int SHIVER_DURATION_MS = 420;
    public static final float SHIVER_JITTER_SCALE = 0.98f;
    public static final float SHIVER_START_SCALE = 0.96f;
    public static final float SHIVER_STEP = 0.25f;
    public static final List<C1DG> ShiverOffsets = Arrays.asList(new C1DG(-2.2f), new C1DG(2.2f), new C1DG(-1.4f));
    public static final List<Float> ShiverDegrees = Arrays.asList(Float.valueOf(-4.0f), Float.valueOf(4.0f), Float.valueOf(-3.0f));

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraAwkwardShiverGlyph(X.BRg r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r4 = X.C78N.A00
            r7 = 0
            java.lang.Object r3 = X.AnonymousClass005.A0e(r10, r0, r4)
            X.AT5 r3 = (X.AT5) r3
            java.lang.Object r6 = X.AnonymousClass005.A0h(r10, r4, r9)
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
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
            boolean r1 = X.AnonymousClass001.A1T(r10, r3, r0)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3b
            if (r0 != r4) goto L43
        L3b:
            com.facebook.aura.components.reactions.AuraAwkwardShiverKt$auraAwkwardShiverGlyph$1$1 r0 = new com.facebook.aura.components.reactions.AuraAwkwardShiverKt$auraAwkwardShiverGlyph$1$1
            r0.<init>(r9, r3, r6, r7)
            r10.Ai0(r0)
        L43:
            X.AnonymousClass001.A18(r10, r0, r5)
            java.util.List<X.1DG> r0 = com.facebook.aura.components.reactions.AuraAwkwardShiverKt.ShiverOffsets
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r1.next()
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            goto L50
        L66:
            boolean r1 = X.AnonymousClass003.A1M(r10, r3, r2)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L72
            if (r0 != r4) goto L7a
        L72:
            com.facebook.aura.components.reactions.AuraAwkwardShiverKt$auraAwkwardShiverGlyph$2$1 r0 = new com.facebook.aura.components.reactions.AuraAwkwardShiverKt$auraAwkwardShiverGlyph$2$1
            r0.<init>(r3, r2)
            r10.Ai0(r0)
        L7a:
            X.BRg r0 = X.AnonymousClass001.A0W(r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraAwkwardShiverKt.auraAwkwardShiverGlyph(X.BRg, boolean, X.BFM, int):X.BRg");
    }

    public static final float shiverEase(float f) {
        return f < 0.5f ? 4.0f * f * f * f : 1.0f - (((float) Math.pow((f * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }
}
