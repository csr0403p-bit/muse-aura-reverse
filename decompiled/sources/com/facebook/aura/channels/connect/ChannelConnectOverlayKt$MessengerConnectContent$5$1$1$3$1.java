package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import com.facebook.aura.settings.HatchMessengerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$MessengerConnectContent$5$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchMessengerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$MessengerConnectContent$5$1$1$3$1(HatchMessengerViewModel hatchMessengerViewModel) {
        super(0);
        this.$viewModel = hatchMessengerViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.disconnect();
    }
}
