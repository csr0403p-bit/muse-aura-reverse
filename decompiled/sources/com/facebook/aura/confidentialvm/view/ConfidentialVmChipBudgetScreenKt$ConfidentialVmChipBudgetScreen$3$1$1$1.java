package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BRg;
import X.BS0;
import X.C1BO;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationBugReportScreenKey;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$3$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ C1BO<Boolean> $isRetrying$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmChipBudgetViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$3$1$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ConfidentialVmChipBudgetViewModel.class, "onTryAgain", "onTryAgain()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfidentialVmChipBudgetViewModel) this.receiver).onTryAgain();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$3$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ ConfidentialVmChipBudgetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel, AuraNavigator auraNavigator) {
            super(0);
            this.$viewModel = confidentialVmChipBudgetViewModel;
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetSupportClick();
            this.$navigator.navigate((AuraNavKey) new ActivationBugReportScreenKey(AnonymousClass002.A0k(), null, null), false);
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
        boolean z = !C1BO.A0F(this.$isRetrying$delegate);
        boolean zA0F = C1BO.A0F(this.$isRetrying$delegate);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120234, null, null, null, z, zA0F, null, anonymousClass1, null, null, bs0, i);
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f12077d, null, null, null, true, false, null, new AnonymousClass2(this.$viewModel, this.$navigator), null, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$3$1$1$1(ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel, C1BO<Boolean> c1bo, AuraNavigator auraNavigator) {
        super(1);
        this.$viewModel = confidentialVmChipBudgetViewModel;
        this.$isRetrying$delegate = c1bo;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
