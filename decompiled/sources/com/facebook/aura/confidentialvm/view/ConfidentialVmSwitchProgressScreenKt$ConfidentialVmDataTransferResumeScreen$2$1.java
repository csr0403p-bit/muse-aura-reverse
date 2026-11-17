package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferResumeScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConfidentialVmSwitchDirection $direction;
    public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferResumeScreen$2$1(ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        super(0);
        this.$viewModel = confidentialVmDataTransferResumeViewModel;
        this.$direction = confidentialVmSwitchDirection;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onLeft(this.$direction);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
