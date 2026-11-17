package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C00q;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $towardsReply;
    public final /* synthetic */ C00q $translationPx;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Af5(this.$translationPx.AFn() * this.$towardsReply);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4$1$1(C00q c00q, float f) {
        super(1);
        this.$translationPx = c00q;
        this.$towardsReply = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
