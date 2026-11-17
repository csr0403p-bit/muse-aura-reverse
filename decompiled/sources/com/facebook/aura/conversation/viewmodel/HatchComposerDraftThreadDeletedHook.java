package com.facebook.aura.conversation.viewmodel;

import X.AbstractC3358CGz;
import X.AnonymousClass004;
import com.facebook.aura.conversation.api.ConversationThreadDeletedHook;

/* loaded from: classes3.dex */
public final class HatchComposerDraftThreadDeletedHook implements ConversationThreadDeletedHook {
    public static final int $stable = 0;
    public static final HatchComposerDraftThreadDeletedHook INSTANCE = new HatchComposerDraftThreadDeletedHook();

    @Override // com.facebook.aura.conversation.api.ConversationThreadDeletedHook
    public void onThreadDeleted(AbstractC3358CGz abstractC3358CGz, String str) {
        HatchComposerDraftStore.Companion.forCurrentVm(abstractC3358CGz).clear(str, AnonymousClass004.A1b(abstractC3358CGz, str));
    }
}
