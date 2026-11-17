package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class MessengerPinScreenKt$MessengerPinScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MessengerConnectorViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerPinScreenKt$MessengerPinScreen$2$1(MessengerConnectorViewModel messengerConnectorViewModel, Context context) {
        super(0);
        this.$viewModel = messengerConnectorViewModel;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.openMessengerForPin(this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
