package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class ConversationListRowsKt$ConversationAgentPermissionRow$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $approvalKey;
    public final /* synthetic */ PresentationEntryTracker $presentationEntryTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListRowsKt$ConversationAgentPermissionRow$1$1(String str, PresentationEntryTracker presentationEntryTracker) {
        super(1);
        this.$approvalKey = str;
        this.$presentationEntryTracker = presentationEntryTracker;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        PresentationEntryTracker presentationEntryTracker;
        String str = this.$approvalKey;
        if (str != null && (presentationEntryTracker = this.$presentationEntryTracker) != null) {
            presentationEntryTracker.markSeen(str);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.ConversationListRowsKt$ConversationAgentPermissionRow$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
