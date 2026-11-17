package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$7$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $highlightMessageId;
    public final /* synthetic */ Long $highlightMessageSeq;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$7$1(String str, HatchConversationViewModel hatchConversationViewModel, Long l) {
        super(1);
        this.$highlightMessageId = str;
        this.$viewModel = hatchConversationViewModel;
        this.$highlightMessageSeq = l;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str = this.$highlightMessageId;
        if (str != null) {
            this.$viewModel.jumpToMessage(str, this.$highlightMessageSeq);
            this.$viewModel.setHighlightedMessageId(this.$highlightMessageId);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$7$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
