package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$25$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onLogOutConfirmationDismissed;
    public final /* synthetic */ HatchCcvViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$25$1(Function0<Unit> function0, HatchCcvViewModel hatchCcvViewModel) {
        super(0);
        this.$onLogOutConfirmationDismissed = function0;
        this.$viewModel = hatchCcvViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onLogOutConfirmationDismissed.invoke();
        this.$viewModel.onCancel();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
