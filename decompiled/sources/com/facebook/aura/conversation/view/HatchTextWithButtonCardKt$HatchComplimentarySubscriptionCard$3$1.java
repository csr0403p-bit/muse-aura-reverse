package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchTextWithButtonCardKt$HatchComplimentarySubscriptionCard$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ComplimentarySubscriptionRedemptionController $controller;
    public final /* synthetic */ String $presentationId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTextWithButtonCardKt$HatchComplimentarySubscriptionCard$3$1(ComplimentarySubscriptionRedemptionController complimentarySubscriptionRedemptionController, String str) {
        super(0);
        this.$controller = complimentarySubscriptionRedemptionController;
        this.$presentationId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controller.dismissFailure(this.$presentationId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
