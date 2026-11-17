package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.view.HeaderLeadingButton;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isArchived;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ boolean $showBackButton;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$4$1(String str, boolean z, boolean z2, HeaderLeadingButton headerLeadingButton) {
        super(1);
        this.$threadId = str;
        this.$showBackButton = z;
        this.$isArchived = z2;
        this.$leadingButton = headerLeadingButton;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new HatchConversationScreenKt$ConversationScreenDecoration$4$1$invoke$$inlined$onDispose$1();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new HatchConversationScreenKt$ConversationScreenDecoration$4$1$invoke$$inlined$onDispose$1();
    }
}
