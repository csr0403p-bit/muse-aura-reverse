package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import com.facebook.aura.settings.HatchTelegramViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$TelegramConnectContent$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchTelegramViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$TelegramConnectContent$5$1(HatchTelegramViewModel hatchTelegramViewModel, Function0<Unit> function0) {
        super(0);
        this.$viewModel = hatchTelegramViewModel;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.dismissOnboarding();
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
