package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.notification.model.HatchChatLocalNotificationConfig;

/* loaded from: classes2.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$13$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        HatchChatLocalNotificationConfig.Companion.setActiveChatScreen(this.$isMainTab ? new HatchChatLocalNotificationConfig.ActiveChatScreen(null, false) : new HatchChatLocalNotificationConfig.ActiveChatScreen(this.$viewModel.sessionId, true));
        this.$viewModel.syncUnreadMessageCount();
        final HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$13$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                HatchChatLocalNotificationConfig.Companion.setActiveChatScreen(null);
                hatchConversationViewModel.syncUnreadMessageCount();
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$13$1(boolean z, HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$isMainTab = z;
        this.$viewModel = hatchConversationViewModel;
    }
}
