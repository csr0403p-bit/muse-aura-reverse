package com.facebook.aura.conversation.api;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C10650I0u;
import X.C20Q;
import X.C20Y;
import X.C7384Etj;
import X.GDB;
import com.facebook.aura.modellock.ModelLockInputBlockProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ConversationInputBlocks {
    public static final int $stable = 0;
    public static final ConversationInputBlocks INSTANCE = new ConversationInputBlocks();

    private final List<ConversationInputBlock> sources(AbstractC3358CGz abstractC3358CGz) {
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(ModelLockInputBlockProvider.INSTANCE.source(abstractC3358CGz));
        return arrayList;
    }

    public final boolean isBlocked(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        List<ConversationInputBlock> listSources = sources(abstractC3358CGz);
        if (!(listSources instanceof Collection) || !listSources.isEmpty()) {
            Iterator<ConversationInputBlock> it = listSources.iterator();
            while (it.hasNext()) {
                if (it.next().isBlocked()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C20Q<Boolean> observe(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        List<ConversationInputBlock> listSources = sources(abstractC3358CGz);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listSources);
        for (ConversationInputBlock conversationInputBlock : listSources) {
            arrayListA0i.add(new C10650I0u(new ConversationInputBlocks$observe$changes$1$1(conversationInputBlock, null), conversationInputBlock.getBlockedChanges(), 1));
        }
        return arrayListA0i.isEmpty() ? new C20Y(false) : GDB.A01(new ConversationInputBlocks$observe$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayListA0i).toArray(new C20Q[0])));
    }
}
