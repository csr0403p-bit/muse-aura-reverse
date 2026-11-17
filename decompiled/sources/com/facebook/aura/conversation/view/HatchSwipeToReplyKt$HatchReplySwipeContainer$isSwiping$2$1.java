package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C00q;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$isSwiping$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C00q $translationPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$isSwiping$2$1(C00q c00q) {
        super(0);
        this.$translationPx = c00q;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!AnonymousClass002.A1M((this.$translationPx.AFn() > 0.0f ? 1 : (this.$translationPx.AFn() == 0.0f ? 0 : -1))));
    }
}
