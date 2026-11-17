package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$timelineSource$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<Boolean> $isConversationIdle$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$timelineSource$1$1(C1BO<Boolean> c1bo) {
        super(0);
        this.$isConversationIdle$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C1BO.A0F(this.$isConversationIdle$delegate));
    }
}
