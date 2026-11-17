package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$onSelectionReply$1$1 extends AbstractC7559F3s implements G0U<HatchMessageUiModel, Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchMessageUiModel hatchMessageUiModel) {
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        HatchConversationContentKt.logSelectionReplyClick(this.$isPrimaryThread, this.$threadLogMetadata);
        this.$viewModel.setReplyContextAndDismissOverlay(hatchMessageUiModel.id, hatchMessageUiModel.content);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$onSelectionReply$1$1(boolean z, Map<String, String> map, HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchMessageUiModel hatchMessageUiModel) {
        invoke2(hatchMessageUiModel);
        return Unit.INSTANCE;
    }
}
