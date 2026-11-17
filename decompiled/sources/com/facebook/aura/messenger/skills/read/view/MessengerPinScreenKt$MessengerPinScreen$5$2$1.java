package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class MessengerPinScreenKt$MessengerPinScreen$5$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MessengerConnectorViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.submitPin(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerPinScreenKt$MessengerPinScreen$5$2$1(MessengerConnectorViewModel messengerConnectorViewModel) {
        super(1);
        this.$viewModel = messengerConnectorViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
