package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$ConnectedScreen$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchTelegramViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$ConnectedScreen$1$3$1(HatchTelegramViewModel hatchTelegramViewModel) {
        super(0);
        this.$viewModel = hatchTelegramViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.showDisconnectDialog();
    }
}
