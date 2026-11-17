package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C1BO;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isDeleting;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$1$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ConfidentialVmSwitchViewModel.class, "onDeleteConfirmed", "onDeleteConfirmed()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfidentialVmSwitchViewModel) this.receiver).onDeleteConfirmed();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator) {
            super(0);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.onDeleteSheetCancelClick();
            this.$navigator.back();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        boolean confirmsSwitchWithoutData = this.$uiState$delegate.getValue().getConfirmsSwitchWithoutData();
        int i = R.string._name_removed__res_0x7f120743;
        if (confirmsSwitchWithoutData) {
            i = R.string._name_removed__res_0x7f120740;
        }
        boolean z = this.$isDeleting;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(i, null, null, !z, z, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f1206f0, null, null, !this.$isDeleting, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$viewModel, this.$navigator), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$1$1$1(boolean z, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo, AuraNavigator auraNavigator) {
        super(1);
        this.$isDeleting = z;
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$uiState$delegate = c1bo;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
