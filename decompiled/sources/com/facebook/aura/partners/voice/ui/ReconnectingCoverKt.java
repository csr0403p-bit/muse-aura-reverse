package com.facebook.aura.partners.voice.ui;

import X.AEk;
import X.AbstractC1396AiR;
import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ReconnectingCoverKt {
    public static final C1BO<Float> animateReconnectingCover(boolean z, BFM bfm, int i) {
        return EmbodimentLayerAlphaKt.rememberEmbodimentLayerAlpha(z, 250, false, bfm, (i & 14) | 48, 4);
    }

    /* renamed from: reconnectingCover-mxwnekA, reason: not valid java name */
    public static final BRg m1817reconnectingCovermxwnekA(BRg bRg, Function0<Float> function0, long j) {
        AnonymousClass003.A0u(bRg, function0);
        return AbstractC1396AiR.A00(AEk.A03(bRg, new ReconnectingCoverKt$reconnectingCover$1(j, function0)), new ReconnectingCoverKt$reconnectingCover$2(function0));
    }
}
