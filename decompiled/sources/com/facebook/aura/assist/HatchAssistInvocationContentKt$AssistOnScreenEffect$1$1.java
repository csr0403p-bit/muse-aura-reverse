package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;

/* loaded from: classes2.dex */
public final class HatchAssistInvocationContentKt$AssistOnScreenEffect$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ HatchConversationViewModel $conversation;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$conversation.setOnScreen(true);
        final HatchConversationViewModel hatchConversationViewModel = this.$conversation;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.assist.HatchAssistInvocationContentKt$AssistOnScreenEffect$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                hatchConversationViewModel.setOnScreen(false);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistInvocationContentKt$AssistOnScreenEffect$1$1(HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$conversation = hatchConversationViewModel;
    }
}
