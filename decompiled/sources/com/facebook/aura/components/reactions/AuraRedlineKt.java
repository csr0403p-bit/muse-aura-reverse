package com.facebook.aura.components.reactions;

import X.AEk;
import X.AKO;
import X.AT5;
import X.AXN;
import X.AaJ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.InterfaceC1068ATy;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraRedlineKt {
    public static final int REDLINE_GLYPH_DURATION_MS = 340;
    public static final float REDLINE_STROKE_DELAY_MS = 160.0f;
    public static final float REDLINE_STROKE_FADE_MS = 240.0f;
    public static final float REDLINE_STROKE_HOLD_MS = 300.0f;
    public static final float REDLINE_STROKE_REVEAL_MS = 160.0f;
    public static final float REDLINE_STROKE_SHOW_MS = 60.0f;
    public static final int REDLINE_TOTAL_MS = 860;
    public static final float RedlineBaseline = 13.0f;
    public static final float RedlineWidth = 2.4f;
    public static final List<Float> RedlineGlyphScales = C8j4.A13(Float.valueOf(1.5f), Float.valueOf(0.88f), Float.valueOf(1.04f), C8j3.A0t());
    public static final long RedlineStart = (C8j3.A0P(-15.0f) << 32) | (C8j3.A0P(1.5f) & 4294967295L);
    public static final long RedlineControlOne = (C8j3.A0P(-5.0f) << 32) | (C8j3.A0P(3.0f) & 4294967295L);
    public static final long RedlineControlTwo = (C8j3.A0P(6.0f) << 32) | (C8j3.A0P(-3.0f) & 4294967295L);
    public static final long RedlineEnd = (C8j3.A0P(16.0f) << 32) | (C8j3.A0P(-1.0f) & 4294967295L);
    public static final long RedlineColor = C8j3.A0U(4293076027L);

    public static final BRg auraRedlineStroke(BRg bRg, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 860, bfm, C8j3.A09(i));
        BBI bbi = (BBI) bfm;
        AXN axnA04 = AKO.A04(Am0.A04, bbi);
        boolean zA65 = bfm.A65(axnA04);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AaJ(null, axnA04.Ah4(RedlineWidth), 4.0f, 1, 0);
            bfm.Ai0(objAaT);
        }
        AaJ aaJ = (AaJ) objAaT;
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT2, obj);
        boolean zA1S = AnonymousClass005.A1S(bfm, at5RememberBurstProgress, interfaceC1068ATy, aaJ);
        Object objAaT3 = bfm.AaT();
        if (zA1S || objAaT3 == obj) {
            objAaT3 = new AuraRedlineKt$auraRedlineStroke$1$1(at5RememberBurstProgress, interfaceC1068ATy, aaJ);
            BBI.A0O(bbi, objAaT3);
        }
        return AEk.A00(bRg, objAaT3);
    }

    public static final BRg auraRedlineGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, REDLINE_GLYPH_DURATION_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraRedlineKt$auraRedlineGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
