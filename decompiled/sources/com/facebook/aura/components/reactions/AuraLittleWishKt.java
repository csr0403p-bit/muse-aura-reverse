package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT5;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraLittleWishKt {
    public static final int LITTLE_WISH_TOTAL_MS = 960;
    public static final float STAR_FADE_IN_AT_MS = 100.0f;
    public static final float STAR_FADE_IN_MS = 160.0f;
    public static final float STAR_RISE_DELAY_MS = 120.0f;
    public static final float STAR_RISE_LIFT = 2.0f;
    public static final float STAR_RISE_MS = 680.0f;
    public static final float StarSize = 5.0f;
    public static final float WISH_SCALE_MS = 300.0f;
    public static final float WISH_SPARKLE_DELAY_MS = 520.0f;
    public static final long WishColor;
    public static final float WishSparkleSize = 13.0f;
    public static final List<Float> WishScales = C8j5.A0a(C8j3.A0s(), Float.valueOf(1.06f), 1.0f);
    public static final long StarFrom = (AnonymousClass002.A0F() << 32) | (C8j3.A0P(-6.0f) & 4294967295L);
    public static final long StarTo = (C8j3.A0P(2.0f) << 32) | (C8j3.A0P(-21.0f) & 4294967295L);

    static {
        long j = B6A.A01;
        WishColor = 4294957450L << 32;
    }

    public static final BRg auraLittleWish(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 960, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraLittleWishKt$auraLittleWish$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AEk.A00(bRg, objAaT);
    }

    public static final BRg auraLittleWishGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 960, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraLittleWishKt$auraLittleWishGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
