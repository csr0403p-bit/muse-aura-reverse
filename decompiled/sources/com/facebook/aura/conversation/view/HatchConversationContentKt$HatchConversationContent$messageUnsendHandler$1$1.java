package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$messageUnsendHandler$1$1 extends AbstractC7559F3s implements G0U<HatchMessageUiModel, Unit> {
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchMessageUiModel hatchMessageUiModel) {
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
        String str = hatchMessageUiModel.id;
        String str2 = hatchMessageUiModel.serverMessageId;
        if (str2 == null) {
            str2 = str;
        }
        hatchConversationViewModel.unsendMessage(str, str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$messageUnsendHandler$1$1(HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchMessageUiModel hatchMessageUiModel) {
        invoke2(hatchMessageUiModel);
        return Unit.INSTANCE;
    }
}
