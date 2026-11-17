package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleKt$HatchMessageBubble$2$1$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ C1BO<Float> $pendingAlpha$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleKt$HatchMessageBubble$2$1$1$1(float f, C1BO<Float> c1bo) {
        super(0);
        this.$alpha = f;
        this.$pendingAlpha$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$alpha * C1BO.A01(this.$pendingAlpha$delegate));
    }
}
