package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.C1BO;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDataTransferConfirmScreenKt$ConfidentialVmDataTransferConfirmScreen$2$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataTransferConfirmScreenKt$ConfidentialVmDataTransferConfirmScreen$2$1$2$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ConfidentialVmSwitchViewModel.class, "onDataTransferConfirmed", "onDataTransferConfirmed()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfidentialVmSwitchViewModel) this.receiver).onDataTransferConfirmed();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120736, null, null, null, true, this.$uiState$delegate.getValue().isStartingDowngrade, null, new AnonymousClass1(this.$viewModel), null, null, BRg.A00, AuraHaptics.BUTTON_TAP);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataTransferConfirmScreenKt$ConfidentialVmDataTransferConfirmScreen$2$1$2$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo) {
        super(1);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
