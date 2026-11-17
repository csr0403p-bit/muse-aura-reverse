package com.facebook.aura.conversation.widget.api;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.view.ConfidentialVmSupportAccessStatusProvider;
import com.facebook.aura.modellock.view.ModelLockStatusProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class ConversationComposerStatusCards {
    public static final int $stable = 0;
    public static final ConversationComposerStatusCards INSTANCE = new ConversationComposerStatusCards();

    public final List<ConversationComposerStatusCard> cards() {
        ConversationComposerStatusCard conversationComposerStatusCardCard;
        int[] iArrA1a = AnonymousClass003.A1a();
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        do {
            int i2 = iArrA1a[i];
            if (i2 == 0) {
                conversationComposerStatusCardCard = ConfidentialVmSupportAccessStatusProvider.INSTANCE.card();
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                conversationComposerStatusCardCard = ModelLockStatusProvider.INSTANCE.card();
            }
            arrayList.add(conversationComposerStatusCardCard);
            i++;
        } while (i < 2);
        return AbstractC0878AGe.A0c(arrayList, new Comparator() { // from class: com.facebook.aura.conversation.widget.api.ConversationComposerStatusCards$cards$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((ConversationComposerStatusCard) t2).getRank()).compareTo(Integer.valueOf(((ConversationComposerStatusCard) t).getRank()));
            }
        });
    }
}
