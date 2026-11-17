package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C3cG;
import X.C7384Etj;
import X.C78g;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.model.PurchaseTap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ G0U<Boolean, Unit> $finishPurchase;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel.HeldPurchase $held;
    public final /* synthetic */ Function0<Unit> $leavePage;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;
    public final /* synthetic */ String $tierPurchaseToast;
    public final /* synthetic */ AuraBuyCreditsViewModel $topUpViewModel;
    public final /* synthetic */ String $usageAddedToast;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;
    public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> {
        public final /* synthetic */ Function0<Unit> $leavePage;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AuraSubscriptionPaywallViewModel.PurchaseOutcome purchaseOutcome) {
            C7384Etj.A0Y(purchaseOutcome, 0);
            this.$viewModel.onPurchaseResult(purchaseOutcome);
            if (purchaseOutcome == AuraSubscriptionPaywallViewModel.PurchaseOutcome.CANCELED || purchaseOutcome == AuraSubscriptionPaywallViewModel.PurchaseOutcome.FAILED) {
                this.$leavePage.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, Function0<Unit> function0) {
            super(1);
            this.$viewModel = auraSubscriptionPaywallViewModel;
            this.$leavePage = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPaywallViewModel.PurchaseOutcome purchaseOutcome) {
            invoke2(purchaseOutcome);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $finishPurchase;
        public final /* synthetic */ G0U<String, Unit> $showDismissToast;
        public final /* synthetic */ String $tierPurchaseToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, G0U<? super String, Unit> g0u, G0U<? super Boolean, Unit> g0u2) {
            super(0);
            this.$tierPurchaseToast = str;
            this.$showDismissToast = g0u;
            this.$finishPurchase = g0u2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String str = this.$tierPurchaseToast;
            if (str != null) {
                this.$showDismissToast.invoke(str);
            }
            AnonymousClass001.A1K(true, this.$finishPurchase);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableState<Boolean> mutableState) {
            super(0);
            this.$showPendingDialog$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState.A09(true, this.$showPendingDialog$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $finishPurchase;
        public final /* synthetic */ G0U<String, Unit> $showDismissToast;
        public final /* synthetic */ AuraBuyCreditsViewModel $topUpViewModel;
        public final /* synthetic */ String $usageAddedToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AuraBuyCreditsViewModel auraBuyCreditsViewModel, G0U<? super String, Unit> g0u, String str, G0U<? super Boolean, Unit> g0u2) {
            super(0);
            this.$topUpViewModel = auraBuyCreditsViewModel;
            this.$showDismissToast = g0u;
            this.$usageAddedToast = str;
            this.$finishPurchase = g0u2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$topUpViewModel;
            if (auraBuyCreditsViewModel != null) {
                auraBuyCreditsViewModel.onTopUpPurchaseCompleted();
            }
            this.$showDismissToast.invoke(this.$usageAddedToast);
            AnonymousClass001.A1K(true, this.$finishPurchase);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $leavePage;
        public final /* synthetic */ AuraBuyCreditsViewModel $topUpViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AuraBuyCreditsViewModel auraBuyCreditsViewModel, Function0<Unit> function0) {
            super(0);
            this.$topUpViewModel = auraBuyCreditsViewModel;
            this.$leavePage = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$topUpViewModel;
            if (auraBuyCreditsViewModel != null) {
                auraBuyCreditsViewModel.onTopUpPurchaseFailed();
            }
            this.$leavePage.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $leavePage;
        public final /* synthetic */ AuraBuyCreditsViewModel $topUpViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AuraBuyCreditsViewModel auraBuyCreditsViewModel, Function0<Unit> function0) {
            super(0);
            this.$topUpViewModel = auraBuyCreditsViewModel;
            this.$leavePage = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$topUpViewModel;
            if (auraBuyCreditsViewModel != null) {
                auraBuyCreditsViewModel.onTopUpPurchaseCanceled();
            }
            this.$leavePage.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;
        public final /* synthetic */ AuraBuyCreditsViewModel $topUpViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AuraBuyCreditsViewModel auraBuyCreditsViewModel, MutableState<Boolean> mutableState) {
            super(0);
            this.$topUpViewModel = auraBuyCreditsViewModel;
            this.$showPendingDialog$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$topUpViewModel;
            if (auraBuyCreditsViewModel != null) {
                auraBuyCreditsViewModel.onTopUpPurchasePending();
            }
            MutableState.A09(true, this.$showPendingDialog$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AuraSubscriptionNameGateViewModel.HeldPurchase heldPurchase;
        C7384Etj.A0Y(c0Yr, 0);
        AuraSubscriptionNameGateViewModel.HeldPurchase heldPurchaseClaimCheckoutLaunch = this.$nameGateViewModel.claimCheckoutLaunch();
        AuraSubscriptionNameGateViewModel.HeldCheckout heldCheckout = heldPurchaseClaimCheckoutLaunch != null ? heldPurchaseClaimCheckoutLaunch.checkout : null;
        if (heldCheckout instanceof AuraSubscriptionNameGateViewModel.HeldCheckout.Tier) {
            AuraSubscriptionNameGateViewModel.HeldCheckout.Tier tier = (AuraSubscriptionNameGateViewModel.HeldCheckout.Tier) heldCheckout;
            AuraSubscriptionPaywallViewModel.PayNowResult payNowResultOnPayNowClicked = this.$viewModel.onPayNowClicked(tier.tap.selectedId);
            if (payNowResultOnPayNowClicked instanceof AuraSubscriptionPaywallViewModel.PayNowResult.Launch) {
                FragmentActivity fragmentActivity = this.$activity;
                String str = ((AuraSubscriptionPaywallViewModel.PayNowResult.Launch) payNowResultOnPayNowClicked).productId;
                PurchaseTap purchaseTap = tier.tap;
                Map<String, String> map = purchaseTap.payMetadata;
                String str2 = purchaseTap.payDirection;
                C98f nmeEntryPoint = AuraSubscriptionPaywallBottomSheetKt.toNmeEntryPoint(tier.getAttribution());
                PurchaseTap purchaseTap2 = tier.tap;
                AuraSubscriptionPaywallBottomSheetKt.launchTierPurchase(fragmentActivity, str, map, str2, nmeEntryPoint, purchaseTap2.priceEventData, purchaseTap2.isPaidTier, purchaseTap2.selectedTier, new AnonymousClass1(this.$viewModel, this.$leavePage), SubscriptionSheetHelpersKt.withAddOnContinuation(tier.checkoutAddOn, tier.getAttribution().localEntryPoint, this.$navigator, new AnonymousClass2(this.$tierPurchaseToast, this.$showDismissToast, this.$finishPurchase)), new AnonymousClass3(this.$showPendingDialog$delegate));
            } else if (C7384Etj.areEqual(payNowResultOnPayNowClicked, AuraSubscriptionPaywallViewModel.PayNowResult.Settling.INSTANCE)) {
                MutableState.A09(true, this.$showPendingDialog$delegate);
            } else {
                if (!(payNowResultOnPayNowClicked instanceof AuraSubscriptionPaywallViewModel.PayNowResult.NeedsName) && !C7384Etj.areEqual(payNowResultOnPayNowClicked, AuraSubscriptionPaywallViewModel.PayNowResult.Ignored.INSTANCE)) {
                    throw C3cG.A0q();
                }
                this.$leavePage.invoke();
            }
        } else if (heldCheckout instanceof AuraSubscriptionNameGateViewModel.HeldCheckout.TopUp) {
            FragmentActivity fragmentActivity2 = this.$activity;
            AuraSubscriptionNameGateViewModel.HeldCheckout.TopUp topUp = (AuraSubscriptionNameGateViewModel.HeldCheckout.TopUp) heldCheckout;
            String str3 = topUp.externalProductId;
            String str4 = topUp.dcpProductId;
            String str5 = topUp.productType;
            Map<String, String> payMetadata = topUp.getPayMetadata();
            HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = this.$waterfallLogger;
            C98f nmeEntryPoint2 = AuraSubscriptionPaywallBottomSheetKt.toNmeEntryPoint(topUp.getAttribution());
            AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$topUpViewModel;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(auraBuyCreditsViewModel, this.$showDismissToast, this.$usageAddedToast, this.$finishPurchase);
            Function0<Unit> function0 = this.$leavePage;
            AuraBuyCreditsBottomSheetKt.launchTopUpPurchase(fragmentActivity2, str3, str4, str5, payMetadata, hatchNMEGaiWaterfallEventLogger, nmeEntryPoint2, anonymousClass4, new AnonymousClass5(auraBuyCreditsViewModel, function0), new AnonymousClass6(auraBuyCreditsViewModel, function0), new AnonymousClass7(auraBuyCreditsViewModel, this.$showPendingDialog$delegate));
        } else if (heldCheckout != null) {
            throw C3cG.A0q();
        }
        if (heldPurchaseClaimCheckoutLaunch == null && (heldPurchase = this.$held) != null && heldPurchase.launched) {
            this.$leavePage.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$2$1(AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, FragmentActivity fragmentActivity, AuraNavigator auraNavigator, Function0<Unit> function0, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, AuraSubscriptionNameGateViewModel.HeldPurchase heldPurchase, String str, G0U<? super String, Unit> g0u, G0U<? super Boolean, Unit> g0u2, MutableState<Boolean> mutableState, AuraBuyCreditsViewModel auraBuyCreditsViewModel, String str2) {
        super(1);
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$viewModel = auraSubscriptionPaywallViewModel;
        this.$activity = fragmentActivity;
        this.$navigator = auraNavigator;
        this.$leavePage = function0;
        this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
        this.$held = heldPurchase;
        this.$tierPurchaseToast = str;
        this.$showDismissToast = g0u;
        this.$finishPurchase = g0u2;
        this.$showPendingDialog$delegate = mutableState;
        this.$topUpViewModel = auraBuyCreditsViewModel;
        this.$usageAddedToast = str2;
    }
}
