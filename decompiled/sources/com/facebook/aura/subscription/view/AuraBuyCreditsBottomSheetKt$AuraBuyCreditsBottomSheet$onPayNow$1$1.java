package com.facebook.aura.subscription.view;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.C7438Evz;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.status.viewmodel.CreditProduct;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$onPayNow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ SubscriptionAttribution $attribution;
    public final /* synthetic */ AuraBuyCreditsViewModel $buyCreditsViewModel;
    public final /* synthetic */ Function0<String> $currentTierCode;
    public final /* synthetic */ C98f $entrypoint;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $onNavigateToPage;
    public final /* synthetic */ CreditProduct $selectedProduct;
    public final /* synthetic */ MutableState<String> $selectedProductId$delegate;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;
    public final /* synthetic */ String $usageAddedToast;
    public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$onPayNow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraBuyCreditsViewModel $buyCreditsViewModel;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $showDismissToast;
        public final /* synthetic */ String $usageAddedToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraBuyCreditsViewModel auraBuyCreditsViewModel, G0U<? super String, Unit> g0u, String str, AuraNavigator auraNavigator) {
            super(0);
            this.$buyCreditsViewModel = auraBuyCreditsViewModel;
            this.$showDismissToast = g0u;
            this.$usageAddedToast = str;
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$buyCreditsViewModel.onTopUpPurchaseCompleted();
            this.$showDismissToast.invoke(this.$usageAddedToast);
            this.$navigator.back();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$onPayNow$1$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, AuraBuyCreditsViewModel.class, "onTopUpPurchaseFailed", "onTopUpPurchaseFailed()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuraBuyCreditsViewModel) this.receiver).onTopUpPurchaseFailed();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$onPayNow$1$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass3(Object obj) {
            super(0, obj, AuraBuyCreditsViewModel.class, "onTopUpPurchaseCanceled", "onTopUpPurchaseCanceled()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuraBuyCreditsViewModel) this.receiver).onTopUpPurchaseCanceled();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$onPayNow$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraBuyCreditsViewModel $buyCreditsViewModel;
        public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AuraBuyCreditsViewModel auraBuyCreditsViewModel, MutableState<Boolean> mutableState) {
            super(0);
            this.$buyCreditsViewModel = auraBuyCreditsViewModel;
            this.$showPendingDialog$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$buyCreditsViewModel.onTopUpPurchasePending();
            MutableState.A09(true, this.$showPendingDialog$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$onPayNow$1$1(HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, AuraBuyCreditsViewModel auraBuyCreditsViewModel, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, FragmentActivity fragmentActivity, CreditProduct creditProduct, Function0<String> function0, MutableState<String> mutableState, G0U<? super String, Unit> g0u2, String str, AuraNavigator auraNavigator, MutableState<Boolean> mutableState2) {
        super(0);
        this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
        this.$entrypoint = c98f;
        this.$buyCreditsViewModel = auraBuyCreditsViewModel;
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$attribution = subscriptionAttribution;
        this.$onNavigateToPage = g0u;
        this.$activity = fragmentActivity;
        this.$selectedProduct = creditProduct;
        this.$currentTierCode = function0;
        this.$selectedProductId$delegate = mutableState;
        this.$showDismissToast = g0u2;
        this.$usageAddedToast = str;
        this.$navigator = auraNavigator;
        this.$showPendingDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CreditProduct creditProduct = this.$selectedProduct;
        Function0<String> function0 = this.$currentTierCode;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (creditProduct != null) {
            c0924AIaA0u.put("selected_product_id", creditProduct.id);
            c0924AIaA0u.put(HatchMetadataKey.DCP_CONSUMABLE_PRODUCT_ID.getValue(), creditProduct.dcpProductId);
            String str = creditProduct.analyticsPrice;
            if (str != null) {
                c0924AIaA0u.put("price", str);
            }
        }
        String strInvoke = function0.invoke();
        if (strInvoke != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CURRENT_TIER, strInvoke, c0924AIaA0u);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        this.$waterfallLogger.logEvent(C98e.CONSUMABLE_PAYMENT_SCREEN, C98d.MANAGEMENT, C98b.CLICK, this.$entrypoint, c0924AIaA0K, C98c.TOP_UP_CONTINUE_BUTTON, null);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.CREDITS_SHEET, HatchScreen.BUY_MORE_CREDITS, HatchComponent.PAY_NOW_BUTTON, null, c0924AIaA0K, null);
        AuraBuyCreditsViewModel.PayNowResult payNowResultOnPayNowClicked = this.$buyCreditsViewModel.onPayNowClicked(MutableState.A05(this.$selectedProductId$delegate));
        if (payNowResultOnPayNowClicked instanceof AuraBuyCreditsViewModel.PayNowResult.NeedsName) {
            AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel = this.$nameGateViewModel;
            AuraBuyCreditsViewModel.PayNowResult.NeedsName needsName = (AuraBuyCreditsViewModel.PayNowResult.NeedsName) payNowResultOnPayNowClicked;
            AuraBuyCreditsViewModel.PurchaseAction purchaseAction = needsName.action;
            auraSubscriptionNameGateViewModel.holdForNameConfirmation(new AuraSubscriptionNameGateViewModel.HeldCheckout.TopUp(purchaseAction.externalProductId, purchaseAction.dcpProductId, purchaseAction.productType, c0924AIaA0K, this.$attribution), needsName.dialog, needsName.disclaimer);
            this.$onNavigateToPage.invoke(AuraSubscriptionPage.ConfirmName.INSTANCE);
            return;
        }
        if (!(payNowResultOnPayNowClicked instanceof AuraBuyCreditsViewModel.PayNowResult.Launch)) {
            if (!C7384Etj.areEqual(payNowResultOnPayNowClicked, AuraBuyCreditsViewModel.PayNowResult.Ignored.INSTANCE)) {
                throw C3cG.A0q();
            }
            return;
        }
        FragmentActivity fragmentActivity = this.$activity;
        AuraBuyCreditsViewModel.PurchaseAction purchaseAction2 = ((AuraBuyCreditsViewModel.PayNowResult.Launch) payNowResultOnPayNowClicked).action;
        String str2 = purchaseAction2.externalProductId;
        String str3 = purchaseAction2.dcpProductId;
        String str4 = purchaseAction2.productType;
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = this.$waterfallLogger;
        C98f c98f = this.$entrypoint;
        AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$buyCreditsViewModel;
        AuraBuyCreditsBottomSheetKt.launchTopUpPurchase(fragmentActivity, str2, str3, str4, c0924AIaA0K, hatchNMEGaiWaterfallEventLogger, c98f, new AnonymousClass1(auraBuyCreditsViewModel, this.$showDismissToast, this.$usageAddedToast, this.$navigator), new AnonymousClass2(auraBuyCreditsViewModel), new AnonymousClass3(auraBuyCreditsViewModel), new AnonymousClass4(auraBuyCreditsViewModel, this.$showPendingDialog$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
