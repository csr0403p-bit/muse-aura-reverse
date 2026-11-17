package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2$5$1$3$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchConversationListItem $item;
    public final /* synthetic */ PresentationEntryTracker $presentationEntryTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$24$2$5$1$3$1$1(PresentationEntryTracker presentationEntryTracker, HatchConversationListItem hatchConversationListItem) {
        super(1);
        this.$presentationEntryTracker = presentationEntryTracker;
        this.$item = hatchConversationListItem;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$presentationEntryTracker.markSeen(((HatchConversationListItem.Message) this.$item).key);
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$3$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
