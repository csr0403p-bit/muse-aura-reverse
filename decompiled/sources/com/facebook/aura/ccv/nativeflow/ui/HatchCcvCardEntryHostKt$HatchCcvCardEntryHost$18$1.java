package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$18$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchCcvViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$18$1(HatchCcvViewModel hatchCcvViewModel) {
        super(0);
        this.$viewModel = hatchCcvViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchCcvCardEntryHostKt.logCcvClick(HatchComponent.CONFIRM_BUTTON);
        this.$viewModel.onSubmit();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
