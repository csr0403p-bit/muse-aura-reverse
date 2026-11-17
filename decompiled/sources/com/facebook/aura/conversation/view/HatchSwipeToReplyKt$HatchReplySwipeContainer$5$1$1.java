package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C00q;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$5$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ float $towardsReply;
    public final /* synthetic */ C00q $translationPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$5$1$1(C00q c00q, float f) {
        super(0);
        this.$translationPx = c00q;
        this.$towardsReply = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$translationPx.AFn() * this.$towardsReply);
    }
}
