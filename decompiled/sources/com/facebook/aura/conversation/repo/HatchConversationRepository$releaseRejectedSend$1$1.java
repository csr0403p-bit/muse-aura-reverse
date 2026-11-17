package com.facebook.aura.conversation.repo;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.repo.HatchConversationRepository;

/* loaded from: classes3.dex */
public final class HatchConversationRepository$releaseRejectedSend$1$1 extends AbstractC7559F3s implements G0U<HatchConversationRepository.PendingMessage, Boolean> {
    public final /* synthetic */ String $requestId;

    @Override // X.G0U
    public final Boolean invoke(HatchConversationRepository.PendingMessage pendingMessage) {
        C7384Etj.A0Y(pendingMessage, 0);
        return C60O.A0h(pendingMessage.requestId, this.$requestId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$releaseRejectedSend$1$1(String str) {
        super(1);
        this.$requestId = str;
    }
}
