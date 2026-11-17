package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.HxE;
import com.facebook.aura.memory.AuraRetainedSizeSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchConversationRetainedSizes implements AuraRetainedSizeSource {
    public static final HatchConversationRetainedSizes INSTANCE = new HatchConversationRetainedSizes();

    private final Map<String, Long> primaryChatSizes(AbstractC3358CGz abstractC3358CGz) {
        HatchPrimaryConversationRepository hatchPrimaryConversationRepository;
        HatchConversationRepository hatchConversationRepository;
        if (abstractC3358CGz == null || (hatchPrimaryConversationRepository = (HatchPrimaryConversationRepository) abstractC3358CGz.A02(HatchPrimaryConversationRepository.class)) == null || (hatchConversationRepository = hatchPrimaryConversationRepository.repository) == null) {
            return AGH.A0E();
        }
        HatchConversationState value = hatchConversationRepository.conversationState.getValue();
        return C3cH.A0m("chat_envelope_seqs", Long.valueOf(hatchConversationRepository.processedEnvelopeSeqs.size()), C3cG.A0r("chat_history", Long.valueOf(value.history.size())), C3cG.A0r("chat_messages", Long.valueOf(value.messages.size())));
    }

    private final Map<String, Long> allChatSizes() {
        List<HatchConversationRepository> listReachableConversationRepositories = HatchConversationRepositoryKt.reachableConversationRepositories();
        ArrayList arrayListA0i = AnonymousClass003.A0i(listReachableConversationRepositories);
        Iterator<HatchConversationRepository> it = listReachableConversationRepositories.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().conversationState.getValue());
        }
        HxE hxEA0r = C3cG.A0r("all_chat_repos", Long.valueOf(arrayListA0i.size()));
        long size = 0;
        long size2 = 0;
        while (arrayListA0i.iterator().hasNext()) {
            size2 += ((HatchConversationState) r7.next()).history.size();
        }
        HxE hxEA0r2 = C3cG.A0r("all_chat_history", Long.valueOf(size2));
        while (arrayListA0i.iterator().hasNext()) {
            size += ((HatchConversationState) r2.next()).messages.size();
        }
        return C3cH.A0m("all_chat_messages", Long.valueOf(size), hxEA0r, hxEA0r2);
    }

    @Override // com.facebook.aura.memory.AuraRetainedSizeSource
    public Map<String, Long> retainedSizes(AbstractC3358CGz abstractC3358CGz) {
        return AGH.A02(primaryChatSizes(abstractC3358CGz), allChatSizes());
    }
}
