package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class MessengerPinScreenKt$MessengerPinScreen$5$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MessengerConnectorViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerPinScreenKt$MessengerPinScreen$5$3$1(MessengerConnectorViewModel messengerConnectorViewModel) {
        super(0);
        this.$viewModel = messengerConnectorViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onNeedHelp();
    }
}
