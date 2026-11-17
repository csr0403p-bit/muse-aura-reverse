package com.facebook.aura.conversation.viewmodel;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationViewModel$announcement$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$announcement$1(HatchConversationViewModel hatchConversationViewModel) {
        super(0);
        this.this$0 = hatchConversationViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.this$0.identityProvider.aiIdentityName.getValue();
    }
}
