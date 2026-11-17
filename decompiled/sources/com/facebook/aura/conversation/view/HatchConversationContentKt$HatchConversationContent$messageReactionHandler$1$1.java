package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$messageReactionHandler$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$messageReactionHandler$1$1(HatchConversationViewModel hatchConversationViewModel) {
        super(2);
        this.$viewModel = hatchConversationViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.$viewModel.toggleReaction(str2, str);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
