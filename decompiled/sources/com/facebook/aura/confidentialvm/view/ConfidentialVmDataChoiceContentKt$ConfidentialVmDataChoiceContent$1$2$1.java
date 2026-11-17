package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchFlowKey;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $continueText;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmSwitchUiState $uiState;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$2$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ConfidentialVmSwitchViewModel.class, "onDataChoiceContinue", "onDataChoiceContinue()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfidentialVmSwitchViewModel) this.receiver).onDataChoiceContinue();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$2$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // X.G0U
            public final Boolean invoke(AuraNavKey auraNavKey) {
                C7384Etj.A0Y(auraNavKey, 0);
                return Boolean.valueOf(auraNavKey instanceof ConfidentialVmSwitchFlowKey);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator) {
            super(0);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.onDataChoiceNotNowClick();
            this.$navigator.popAll(AnonymousClass1.INSTANCE);
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
        String str = this.$continueText;
        boolean canContinueDataChoice = this.$uiState.getCanContinueDataChoice();
        boolean zIsContinuingDataChoice = this.$uiState.isContinuingDataChoice();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(str, null, null, canContinueDataChoice, zIsContinuingDataChoice, null, anonymousClass1, null, bs0, i);
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$cancelText, null, null, true, false, null, new AnonymousClass2(this.$viewModel, this.$navigator), null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$2$1(String str, ConfidentialVmSwitchUiState confidentialVmSwitchUiState, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, String str2, AuraNavigator auraNavigator) {
        super(1);
        this.$continueText = str;
        this.$uiState = confidentialVmSwitchUiState;
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$cancelText = str2;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
