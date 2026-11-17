package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.C78g;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$16$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HatchConversationViewModel $viewModel$inlined;

    public HatchConversationScreenKt$HatchConversationScreen$16$1$invoke$$inlined$onDispose$1(HatchConversationViewModel hatchConversationViewModel) {
        this.$viewModel$inlined = hatchConversationViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        if (AnonymousClass001.A1X(this.$viewModel$inlined.dictation.isActive.getValue())) {
            this.$viewModel$inlined.dictation.end();
        }
    }
}
