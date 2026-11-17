package com.facebook.aura.components.reactions;

import X.AT5;
import X.AWx;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraLightningLatchKt {
    public static final float BOLT_HOLD_MS = 50.0f;
    public static final float BOLT_REVEAL_MS = 120.0f;
    public static final float BRANCH_DELAY_MS = 90.0f;
    public static final float BRANCH_HOLD_MS = 40.0f;
    public static final float BRANCH_REVEAL_MS = 80.0f;
    public static final List<AWx> BoltPoints;
    public static final float BoltWidth = 2.2f;
    public static final List<AWx> BranchPoints;
    public static final float BranchWidth = 1.4f;
    public static final float GLYPH_SPRING_MS = 200.0f;
    public static final float GLYPH_STRIKE_AT_MS = 140.0f;
    public static final int LIGHTNING_TOTAL_MS = 460;
    public static final List<Float> LightningScales = C8j4.A12(Float.valueOf(1.3f), C8j3.A0s(), C8j3.A0t());
    public static final float RING_DELAY_MS = 130.0f;
    public static final float RING_MS = 220.0f;
    public static final float RingFrom = 10.0f;
    public static final float RingTo = 21.0f;
    public static final float RingWidth = 2.0f;

    static {
        AWx aWxA0C = AWx.A0C(C8j3.A0P(4.0f) << 32, C8j3.A0P(-34.0f) & 4294967295L);
        long jA0P = C8j3.A0P(-4.0f);
        AWx aWxA0C2 = AWx.A0C(jA0P << 32, C8j3.A0P(-20.0f) & 4294967295L);
        long jA0P2 = (C8j3.A0P(3.0f) << 32) | (C8j3.A0P(-17.0f) & 4294967295L);
        BoltPoints = Arrays.asList(aWxA0C, aWxA0C2, AWx.A0B(jA0P2), AWx.A0C(C8j4.A0K(-3.0f), jA0P & 4294967295L));
        BranchPoints = Arrays.asList(AWx.A0B(jA0P2), AWx.A0C(C8j3.A0P(11.0f) << 32, C8j3.A0P(-12.0f) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraLightningLatch(X.BRg r7, boolean r8, X.AHD<X.B6A> r9, X.BFM r10, int r11) {
        /*
            X.AnonymousClass003.A0v(r7, r9)
            int r1 = X.C8j3.A09(r11)
            r0 = 460(0x1cc, float:6.45E-43)
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
            com.facebook.aura.components.reactions.AuraLightningLatchKt$auraLightningLatch$1$1 r0 = new com.facebook.aura.components.reactions.AuraLightningLatchKt$auraLightningLatch$1$1
            r0.<init>(r6, r9, r4)
            X.BBI.A0T(r10, r0)
        L45:
            X.BRg r0 = X.AEk.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraLightningLatchKt.auraLightningLatch(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraLightningLatchGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, LIGHTNING_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraLightningLatchKt$auraLightningLatchGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
