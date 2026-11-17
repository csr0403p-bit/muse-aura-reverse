package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWalletScreenKt$WalletContent$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchWalletViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletScreenKt$WalletContent$1$1(HatchWalletViewModel hatchWalletViewModel) {
        super(0);
        this.$viewModel = hatchWalletViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.loadNextPage();
    }
}
