package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel;

/* loaded from: classes.dex */
public final class HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchThreadsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$1$1(HatchThreadsViewModel hatchThreadsViewModel) {
        super(1);
        this.$viewModel = hatchThreadsViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.refresh();
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
