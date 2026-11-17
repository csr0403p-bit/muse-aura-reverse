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
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$3$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ C1BO<ConfidentialVmSubscriptionEndedViewModel.ContinueCheck> $continueCheck$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$3$2$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ConfidentialVmSubscriptionEndedViewModel.class, "onContinueClick", "onContinueClick()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfidentialVmSubscriptionEndedViewModel) this.receiver).onContinueClick();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$3$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, AuraNavigator auraNavigator) {
            super(0);
            this.$viewModel = confidentialVmSubscriptionEndedViewModel;
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.onRenewClick();
            this.$navigator.navigate((AuraNavKey) new AuraSubscriptionSheetKey(AuraSubscriptionPage.Paywall.INSTANCE, SubscriptionPaywallEntryPoint.CONFIDENTIAL_VM, null), false);
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
        boolean zA1Z = AnonymousClass002.A1Z(this.$continueCheck$delegate.getValue(), ConfidentialVmSubscriptionEndedViewModel.ContinueCheck.CHECKING);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120756, null, null, null, true, zA1Z, null, anonymousClass1, null, null, bs0, i);
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120759, null, null, null, true, false, null, new AnonymousClass2(this.$viewModel, this.$navigator), null, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$3$2$1(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, C1BO<? extends ConfidentialVmSubscriptionEndedViewModel.ContinueCheck> c1bo, AuraNavigator auraNavigator) {
        super(1);
        this.$viewModel = confidentialVmSubscriptionEndedViewModel;
        this.$continueCheck$delegate = c1bo;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
