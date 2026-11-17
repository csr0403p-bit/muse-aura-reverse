package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C0881AGi;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.model.HatchWidgetPresentation;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$12$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<String> $approvalBatchKeySnapshot;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ PresentationEntryTracker $presentationEntryTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$12$1(Function0<String> function0, PresentationEntryTracker presentationEntryTracker, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
        super(1);
        this.$approvalBatchKeySnapshot = function0;
        this.$presentationEntryTracker = presentationEntryTracker;
        this.$currentItems$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchConversationListItem.Message message;
        AHD<HatchConversationListItem> value = this.$currentItems$delegate.getValue();
        PresentationEntryTracker presentationEntryTracker = this.$presentationEntryTracker;
        for (HatchConversationListItem hatchConversationListItem : value) {
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null) {
                presentationEntryTracker.markSeen(message.key);
                Iterable iterable = message.message.presentations;
                if (iterable == null) {
                    iterable = C0881AGi.A00;
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    presentationEntryTracker.markSeen(((HatchWidgetPresentation) it.next()).presentationId);
                }
            }
        }
        String strInvoke = this.$approvalBatchKeySnapshot.invoke();
        if (strInvoke != null) {
            this.$presentationEntryTracker.markSeen(strInvoke);
        }
        this.$presentationEntryTracker.warm = true;
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$12$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
