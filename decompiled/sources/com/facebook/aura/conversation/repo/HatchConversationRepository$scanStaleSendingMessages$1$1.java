package com.facebook.aura.conversation.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchConversationRepository$scanStaleSendingMessages$1$1 extends AbstractC7559F3s implements G0U<HatchConversationRepository.PendingMessage, Boolean> {
    public final /* synthetic */ Set<String> $staleRequestIds;

    @Override // X.G0U
    public final Boolean invoke(HatchConversationRepository.PendingMessage pendingMessage) {
        C7384Etj.A0Y(pendingMessage, 0);
        return Boolean.valueOf(this.$staleRequestIds.contains(pendingMessage.requestId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$scanStaleSendingMessages$1$1(Set<String> set) {
        super(1);
        this.$staleRequestIds = set;
    }
}
