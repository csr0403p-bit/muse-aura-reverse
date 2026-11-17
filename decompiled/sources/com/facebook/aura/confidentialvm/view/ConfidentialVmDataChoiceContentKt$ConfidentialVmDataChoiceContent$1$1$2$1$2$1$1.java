package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1$2$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel) {
        super(0);
        this.$viewModel = confidentialVmSwitchViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onDataChoiceSelected(ConfidentialVmDataChoice.START_FRESH);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
