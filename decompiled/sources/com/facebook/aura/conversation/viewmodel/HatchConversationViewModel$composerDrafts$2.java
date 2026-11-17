package com.facebook.aura.conversation.viewmodel;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationViewModel$composerDrafts$2 extends AbstractC7559F3s implements Function0<HatchComposerDraftStore> {
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$composerDrafts$2(HatchConversationViewModel hatchConversationViewModel) {
        super(0);
        this.this$0 = hatchConversationViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchComposerDraftStore invoke() {
        return HatchComposerDraftStore.Companion.forCurrentVm(this.this$0.userSession);
    }
}
