package com.facebook.aura.components.reactions;

import X.AEk;
import X.AT5;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.InterfaceC1068ATy;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraHeartEyesKt {
    public static final float HEART_END_SCALE = 0.4f;
    public static final float HEART_EYES_SCALE_MS = 320.0f;
    public static final int HEART_EYES_TOTAL_MS = 680;
    public static final float HEART_OUT_TIME_SHARE = 0.5248f;
    public static final float HEART_STAGGER_MS = 60.0f;
    public static final float HEART_TRAVEL_MS = 620.0f;
    public static final long HeartBack;
    public static final long HeartBackControl;
    public static final List<Float> HeartEyesScales;
    public static final long HeartOut;
    public static final long HeartOutControl;
    public static final List<Float> HeartSides;
    public static final float HeartSize;
    public static final List<B6A> HeartTint;

    static {
        Float fValueOf = Float.valueOf(0.85f);
        Float fValueOf2 = Float.valueOf(1.12f);
        Float fValueOf3 = Float.valueOf(1.0f);
        HeartEyesScales = C8j4.A12(fValueOf, fValueOf2, fValueOf3);
        HeartSides = Arrays.asList(Float.valueOf(-1.0f), fValueOf3);
        HeartOut = (C8j3.A0P(24.0f) << 32) | (C8j3.A0P(-12.0f) & 4294967295L);
        HeartOutControl = (C8j3.A0P(8.0f) << 32) | (C8j3.A0P(-26.0f) & 4294967295L);
        HeartBack = AnonymousClass005.A0L(3.0f, 1.0f);
        HeartBackControl = (C8j3.A0P(22.0f) << 32) | (C8j3.A0P(10.0f) & 4294967295L);
        HeartSize = 9.0f;
        HeartTint = AnonymousClass004.A17(C8j4.A0Y(4294921593L), 4294942400L << 32);
    }

    public static final BRg auraHeartEyes(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, HEART_EYES_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, objAaT, obj);
        boolean zA1M = AnonymousClass003.A1M(bfm, at5RememberBurstProgress, interfaceC1068ATy);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == obj) {
            objAaT2 = new AuraHeartEyesKt$auraHeartEyes$1$1(at5RememberBurstProgress, interfaceC1068ATy);
            BBI.A0T(bfm, objAaT2);
        }
        return AEk.A00(bRg, objAaT2);
    }

    public static final BRg auraHeartEyesGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, HEART_EYES_TOTAL_MS, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraHeartEyesKt$auraHeartEyesGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
