package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.model.HatchWidgetPresentation;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$WidgetPresentations$5$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ PresentationEntryTracker $entryTracker;
    public final /* synthetic */ HatchWidgetPresentation $presentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationPresentationsKt$WidgetPresentations$5$1$1(PresentationEntryTracker presentationEntryTracker, HatchWidgetPresentation hatchWidgetPresentation) {
        super(1);
        this.$entryTracker = presentationEntryTracker;
        this.$presentation = hatchWidgetPresentation;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        PresentationEntryTracker presentationEntryTracker = this.$entryTracker;
        if (presentationEntryTracker != null) {
            presentationEntryTracker.markSeen(this.$presentation.presentationId);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationPresentationsKt$WidgetPresentations$5$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
