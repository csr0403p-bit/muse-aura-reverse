package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C00q;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$5$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ ReplySwipeMetrics $metrics;
    public final /* synthetic */ C00q $translationPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$5$2$1(C00q c00q, ReplySwipeMetrics replySwipeMetrics) {
        super(0);
        this.$translationPx = c00q;
        this.$metrics = replySwipeMetrics;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(AnonymousClass003.A00(this.$translationPx.AFn() / this.$metrics.thresholdPx));
    }
}
