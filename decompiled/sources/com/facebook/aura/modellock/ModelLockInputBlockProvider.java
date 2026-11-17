package com.facebook.aura.modellock;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.conversation.api.ConversationInputBlock;
import com.facebook.aura.conversation.api.ConversationInputBlockProvider;

/* loaded from: classes2.dex */
public final class ModelLockInputBlockProvider implements ConversationInputBlockProvider {
    public static final ModelLockInputBlockProvider INSTANCE = new ModelLockInputBlockProvider();

    @Override // com.facebook.aura.conversation.api.ConversationInputBlockProvider
    public ConversationInputBlock source(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return ModelLockRepository.Companion.getInstance(abstractC3358CGz);
    }
}
