package com.facebook.aura.subscription.view;

import X.AGH;
import X.AHD;
import X.AIW;
import X.AKO;
import X.AKQ;
import X.AX9;
import X.AbstractC0885AGm;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BO6;
import X.BOD;
import X.BOI;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0924AIa;
import X.C0M7;
import X.C0jP;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C19U;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DE;
import X.C1DI;
import X.C1b8;
import X.C1qN;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7bA;
import X.C8j5;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import X.DBJ;
import X.EnumC3085Bxl;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointAttribution;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.devices.intf.SubscriptionAddOnKt;
import com.facebook.aura.devices.intf.SubscriptionCheckoutAddOnUi;
import com.facebook.aura.iap.HatchSubscriptionPurchase;
import com.facebook.aura.iap.HatchTierPrice;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.model.PaywallCta;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.DisclaimerRun;
import com.facebook.aura.subscription.repo.SubscriptionBillingInterval;
import com.facebook.aura.subscription.repo.SubscriptionBlockedActionDialog;
import com.facebook.aura.subscription.repo.SubscriptionChangeDirection;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraSubscriptionPaywallBottomSheetKt {
    public static final String TAG = "AuraSubscriptionPaywallBottomSheet";

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $onNavigateToPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function0<Unit> function0, SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$attribution = subscriptionAttribution;
            this.$onNavigateToPage = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.AuraSubscriptionPaywallBottomSheet(this.$onBack, this.$attribution, this.$onNavigateToPage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FragmentActivity $activity;
        public final /* synthetic */ SubscriptionAddOnIntegration $availableAddOnIntegration;
        public final /* synthetic */ SubscriptionBlockedActionDialog $blockedActionDialog;
        public final /* synthetic */ PaywallCta $cta;
        public final /* synthetic */ String $currentTierCode;
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ MutableState<Boolean> $isAddOnSelected$delegate;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
        public final /* synthetic */ NameGate $nameGate;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ G0U<String, AuraSubscriptionPaywallViewModel.PayNowResult> $onPayNowClicked;
        public final /* synthetic */ Function0<Unit> $onPurchaseConfirmed;
        public final /* synthetic */ G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> $onPurchaseResult;
        public final /* synthetic */ Disclaimer $purchaseDisclaimer;
        public final /* synthetic */ SubscriptionAddOnIntegration $selectedCheckoutAddOn;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ MutableState<Boolean> $showBlockedActionDialog$delegate;
        public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState $uiState;
        public final /* synthetic */ C98d $waterfallStage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, String str, PaywallCta paywallCta, Disclaimer disclaimer, String str2, C98d c98d, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, C98f c98f, AuraSubscriptionPaywallViewModel.UiState uiState, G0U<? super String, ? extends AuraSubscriptionPaywallViewModel.PayNowResult> g0u, G0U<? super AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u2, Function0<Unit> function0, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, SubscriptionAddOnIntegration subscriptionAddOnIntegration, FragmentActivity fragmentActivity, NameGate nameGate, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, SubscriptionAddOnIntegration subscriptionAddOnIntegration2) {
            super(2);
            this.$loaded = loaded;
            this.$selectedId = str;
            this.$cta = paywallCta;
            this.$purchaseDisclaimer = disclaimer;
            this.$currentTierCode = str2;
            this.$waterfallStage = c98d;
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$nmeEntryPoint = c98f;
            this.$uiState = uiState;
            this.$onPayNowClicked = g0u;
            this.$onPurchaseResult = g0u2;
            this.$onPurchaseConfirmed = function0;
            this.$blockedActionDialog = subscriptionBlockedActionDialog;
            this.$selectedCheckoutAddOn = subscriptionAddOnIntegration;
            this.$activity = fragmentActivity;
            this.$nameGate = nameGate;
            this.$showPendingDialog$delegate = mutableState;
            this.$showBlockedActionDialog$delegate = mutableState2;
            this.$isAddOnSelected$delegate = mutableState3;
            this.$availableAddOnIntegration = subscriptionAddOnIntegration2;
        }

        public final void invoke(BFM bfm, int i) {
            Function0 function0;
            boolean zA1V;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            AuraSubscriptionPaywallViewModel.UiState.Loaded loaded = this.$loaded;
            String str = this.$selectedId;
            PaywallCta paywallCta = this.$cta;
            Disclaimer disclaimer = this.$purchaseDisclaimer;
            String str2 = this.$currentTierCode;
            C98d c98d = this.$waterfallStage;
            SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint = this.$entryPoint;
            C98f c98f = this.$nmeEntryPoint;
            boolean z = this.$uiState instanceof AuraSubscriptionPaywallViewModel.UiState.Loading;
            G0U<String, AuraSubscriptionPaywallViewModel.PayNowResult> g0u = this.$onPayNowClicked;
            G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u2 = this.$onPurchaseResult;
            Function0<Unit> function02 = this.$onPurchaseConfirmed;
            MutableState<Boolean> mutableState = this.$showPendingDialog$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$6$1$1(mutableState);
                BBI.A0T(bfm, objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            if (this.$blockedActionDialog == null) {
                zA1V = AnonymousClass004.A1P(bfm, -372551069);
                function0 = null;
            } else {
                bfm.AgE(-372551068);
                MutableState<Boolean> mutableState2 = this.$showBlockedActionDialog$delegate;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$6$2$1$1(mutableState2);
                    BBI.A0T(bfm, objAaT2);
                }
                function0 = (Function0) objAaT2;
                zA1V = AnonymousClass001.A1V(bfm);
            }
            SubscriptionAddOnIntegration subscriptionAddOnIntegration = this.$selectedCheckoutAddOn;
            Boolean boolValueOf = Boolean.valueOf(MutableState.A0A((MutableState) this.$isAddOnSelected$delegate));
            SubscriptionAddOnIntegration subscriptionAddOnIntegration2 = this.$availableAddOnIntegration;
            if (!SubscriptionAddOnKt.META_HOME_LINK_CATALOG_TYPE.equals(subscriptionAddOnIntegration2 != null ? subscriptionAddOnIntegration2.getCatalogType() : null)) {
                boolValueOf = null;
            }
            AuraSubscriptionPaywallBottomSheetKt.PaywallFooter(loaded, str, paywallCta, disclaimer, str2, c98d, subscriptionPaywallEntryPoint, c98f, z, g0u, g0u2, function02, function03, function0, subscriptionAddOnIntegration, boolValueOf, this.$activity, this.$nameGate, null, null, null, null, zA1V, bfm, zA1V ? 1 : 0, 384, zA1V ? 1 : 0, 8126464);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.CheckoutAddOnOffer $availableAddOn;
        public final /* synthetic */ String $currentTierCode;
        public final /* synthetic */ boolean $hasDowngradeOption;
        public final /* synthetic */ boolean $hasUpgradeOption;
        public final /* synthetic */ PaywallImpressionState $impressions;
        public final /* synthetic */ MutableState<Boolean> $isAddOnSelected$delegate;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState $uiState;
        public final /* synthetic */ MutableState<String> $userSelectedId$delegate;
        public final /* synthetic */ C98d $waterfallStage;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            AuraSubscriptionPaywallViewModel.UiState uiState = this.$uiState;
            if (uiState instanceof AuraSubscriptionPaywallViewModel.UiState.Loading) {
                bfm.AgE(2123983591);
                AuraSubscriptionPaywallBottomSheetKt.PaywallLoadingPlans(null, bfm, 0, 1);
            } else if (uiState instanceof AuraSubscriptionPaywallViewModel.UiState.Error) {
                bfm.AgE(2123986712);
                SubscriptionSheetHelpersKt.SubscriptionLoadError(HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_PAYWALL, this.$onRetry, C10G.A01, bfm, 3126, 0);
            } else {
                if (!(uiState instanceof AuraSubscriptionPaywallViewModel.UiState.Loaded)) {
                    throw AnonymousClass005.A0k(bfm, 2123982366);
                }
                bfm.AgE(1419385782);
                AuraSubscriptionPaywallViewModel.UiState.Loaded loaded = (AuraSubscriptionPaywallViewModel.UiState.Loaded) this.$uiState;
                PaywallImpressionState paywallImpressionState = this.$impressions;
                String str = this.$selectedId;
                C98d c98d = this.$waterfallStage;
                String str2 = this.$currentTierCode;
                C98f c98f = this.$nmeEntryPoint;
                boolean z = this.$hasUpgradeOption;
                boolean z2 = this.$hasDowngradeOption;
                boolean zA65 = bfm.A65(this.$userSelectedId$delegate);
                MutableState<String> mutableState = this.$userSelectedId$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$7$1$1(mutableState);
                    BBI.A0T(bfm, objAaT);
                }
                AuraSubscriptionPaywallBottomSheetKt.PaywallPlans(loaded, paywallImpressionState, str, c98d, str2, c98f, z, z2, (G0U) objAaT, null, bfm, 0, 512);
                if (this.$availableAddOn != null) {
                    bfm.AgE(1419827594);
                    SubscriptionCheckoutAddOnUi subscriptionCheckoutAddOnUiUi = this.$availableAddOn.integration.ui();
                    AuraSubscriptionPaywallViewModel.CheckoutAddOnOffer checkoutAddOnOffer = this.$availableAddOn;
                    String str3 = checkoutAddOnOffer.label;
                    String str4 = checkoutAddOnOffer.subtitle;
                    boolean zA0A = MutableState.A0A((MutableState) this.$isAddOnSelected$delegate);
                    boolean zA652 = bfm.A65(this.$isAddOnSelected$delegate);
                    MutableState<Boolean> mutableState2 = this.$isAddOnSelected$delegate;
                    Object objAaT2 = bfm.AaT();
                    if (zA652 || objAaT2 == C78N.A00) {
                        objAaT2 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$7$2$1(mutableState2);
                        BBI.A0T(bfm, objAaT2);
                    }
                    subscriptionCheckoutAddOnUiUi.Offer(str3, str4, zA0A, (G0U) objAaT2, BRg.A00, bfm, RuntimeInternals.IOPRIO_BACKGROUND);
                } else {
                    bfm.AgE(1420171632);
                }
                AnonymousClass001.A1D(bfm);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            AuraSubscriptionPaywallViewModel.UiState.Loaded loaded2 = this.$loaded;
            if (loaded2 == null || !loaded2.canBuyTopUp) {
                bfm.AgE(1420503952);
            } else {
                bfm.AgE(1420231989);
                String strA01 = this.$loaded.topUpLabel;
                if (strA01 == null) {
                    bfm.AgE(2124026774);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c6);
                } else {
                    bfm.AgE(2124025565);
                }
                BBI.A0R(bbiA07, false);
                AuraSubscriptionPaywallBottomSheetKt.PaywallTopUpRow(strA01, this.$loaded.analyticsMetadata, this.$onBuyExtraUsage, null, bfm, 0, 8);
            }
            BBI.A0R(bbiA07, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AuraSubscriptionPaywallViewModel.UiState uiState, Function0<Unit> function0, PaywallImpressionState paywallImpressionState, String str, C98d c98d, String str2, C98f c98f, boolean z, boolean z2, MutableState<String> mutableState, AuraSubscriptionPaywallViewModel.CheckoutAddOnOffer checkoutAddOnOffer, MutableState<Boolean> mutableState2, AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, Function0<Unit> function02) {
            super(3);
            this.$uiState = uiState;
            this.$onRetry = function0;
            this.$impressions = paywallImpressionState;
            this.$selectedId = str;
            this.$waterfallStage = c98d;
            this.$currentTierCode = str2;
            this.$nmeEntryPoint = c98f;
            this.$hasUpgradeOption = z;
            this.$hasDowngradeOption = z2;
            this.$userSelectedId$delegate = mutableState;
            this.$availableAddOn = checkoutAddOnOffer;
            this.$isAddOnSelected$delegate = mutableState2;
            this.$loaded = loaded;
            this.$onBuyExtraUsage = function02;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NameGate $nameGate;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ G0U<String, AuraSubscriptionPaywallViewModel.PayNowResult> $onPayNowClicked;
        public final /* synthetic */ G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> $onPurchaseResult;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(AuraSubscriptionPaywallViewModel.UiState uiState, Function0<Unit> function0, SubscriptionAttribution subscriptionAttribution, Function0<Unit> function02, G0U<? super String, ? extends AuraSubscriptionPaywallViewModel.PayNowResult> g0u, G0U<? super AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u2, Function0<Unit> function03, NameGate nameGate, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onBack = function0;
            this.$attribution = subscriptionAttribution;
            this.$onRetry = function02;
            this.$onPayNowClicked = g0u;
            this.$onPurchaseResult = g0u2;
            this.$onBuyExtraUsage = function03;
            this.$nameGate = nameGate;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.AuraSubscriptionPaywallContent(this.$uiState, this.$onBack, this.$attribution, this.$onRetry, this.$onPayNowClicked, this.$onPurchaseResult, this.$onBuyExtraUsage, this.$nameGate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$BenefitRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $benefit;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$benefit = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.BenefitRow(this.$benefit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FragmentActivity $activity;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ SubscriptionAddOnIntegration $checkoutAddOn;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ PaywallCta $cta;
        public final /* synthetic */ AuraButtonSize $ctaSize;
        public final /* synthetic */ String $currentTierCode;
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ Boolean $homeLinkSelected;
        public final /* synthetic */ boolean $isCompletingPurchase;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NameGate $nameGate;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ G0U<String, AuraSubscriptionPaywallViewModel.PayNowResult> $onPayNowClicked;
        public final /* synthetic */ Function0<Unit> $onPlanChangeBlocked;
        public final /* synthetic */ Function0<Unit> $onPurchaseConfirmed;
        public final /* synthetic */ Function0<Unit> $onPurchasePending;
        public final /* synthetic */ G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> $onPurchaseResult;
        public final /* synthetic */ Disclaimer $purchaseDisclaimer;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ C98d $waterfallStage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, String str, PaywallCta paywallCta, Disclaimer disclaimer, String str2, C98d c98d, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, C98f c98f, boolean z, G0U<? super String, ? extends AuraSubscriptionPaywallViewModel.PayNowResult> g0u, G0U<? super AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, SubscriptionAddOnIntegration subscriptionAddOnIntegration, Boolean bool, FragmentActivity fragmentActivity, NameGate nameGate, BRg bRg, C3TQ c3tq, AuraButtonSize auraButtonSize, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z2, int i, int i2, int i3, int i4) {
            super(2);
            this.$loaded = loaded;
            this.$selectedId = str;
            this.$cta = paywallCta;
            this.$purchaseDisclaimer = disclaimer;
            this.$currentTierCode = str2;
            this.$waterfallStage = c98d;
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$nmeEntryPoint = c98f;
            this.$isLoading = z;
            this.$onPayNowClicked = g0u;
            this.$onPurchaseResult = g0u2;
            this.$onPurchaseConfirmed = function0;
            this.$onPurchasePending = function02;
            this.$onPlanChangeBlocked = function03;
            this.$checkoutAddOn = subscriptionAddOnIntegration;
            this.$homeLinkSelected = bool;
            this.$activity = fragmentActivity;
            this.$nameGate = nameGate;
            this.$modifier = bRg;
            this.$contentPadding = c3tq;
            this.$ctaSize = auraButtonSize;
            this.$appDisclosureLegalText = g0v;
            this.$isCompletingPurchase = z2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallFooter(this.$loaded, this.$selectedId, this.$cta, this.$purchaseDisclaimer, this.$currentTierCode, this.$waterfallStage, this.$entryPoint, this.$nmeEntryPoint, this.$isLoading, this.$onPayNowClicked, this.$onPurchaseResult, this.$onPurchaseConfirmed, this.$onPurchasePending, this.$onPlanChangeBlocked, this.$checkoutAddOn, this.$homeLinkSelected, this.$activity, this.$nameGate, this.$modifier, this.$contentPadding, this.$ctaSize, this.$appDisclosureLegalText, this.$isCompletingPurchase, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallLegalClause$1, reason: invalid class name and case insensitive filesystem */
    public final class C141811 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Disclaimer $disclaimer;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141811(Disclaimer disclaimer, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
            super(2);
            this.$disclaimer = disclaimer;
            this.$screen = hatchScreen;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallLegalClause(this.$disclaimer, this.$screen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallLegalText$1, reason: invalid class name and case insensitive filesystem */
    public final class C141821 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Disclaimer $disclaimer;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141821(Disclaimer disclaimer, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$disclaimer = disclaimer;
            this.$isLoading = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallLegalText(this.$disclaimer, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallLegalTextShimmer$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallLegalTextShimmer(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallLoadingPlans$3, reason: invalid class name and case insensitive filesystem */
    public final class C141833 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141833(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallLoadingPlans(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallPlans$2, reason: invalid class name and case insensitive filesystem */
    public final class C141842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $currentTierCode;
        public final /* synthetic */ boolean $hasDowngradeOption;
        public final /* synthetic */ boolean $hasUpgradeOption;
        public final /* synthetic */ PaywallImpressionState $impressions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ G0U<String, Unit> $onSelect;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $state;
        public final /* synthetic */ C98d $waterfallStage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141842(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, PaywallImpressionState paywallImpressionState, String str, C98d c98d, String str2, C98f c98f, boolean z, boolean z2, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = loaded;
            this.$impressions = paywallImpressionState;
            this.$selectedId = str;
            this.$waterfallStage = c98d;
            this.$currentTierCode = str2;
            this.$nmeEntryPoint = c98f;
            this.$hasUpgradeOption = z;
            this.$hasDowngradeOption = z2;
            this.$onSelect = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallPlans(this.$state, this.$impressions, this.$selectedId, this.$waterfallStage, this.$currentTierCode, this.$nmeEntryPoint, this.$hasUpgradeOption, this.$hasDowngradeOption, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallPriceImpressions$2, reason: invalid class name and case insensitive filesystem */
    public final class C141852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ boolean $screenImpressionLogged;
        public final /* synthetic */ C98d $waterfallStage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141852(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, boolean z, C98d c98d, C98f c98f, int i) {
            super(2);
            this.$loaded = loaded;
            this.$screenImpressionLogged = z;
            this.$waterfallStage = c98d;
            this.$nmeEntryPoint = c98f;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallPriceImpressions(this.$loaded, this.$screenImpressionLogged, this.$waterfallStage, this.$nmeEntryPoint, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallPurchaseNotice$1, reason: invalid class name and case insensitive filesystem */
    public final class C141861 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Disclaimer $notice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141861(Disclaimer disclaimer, BRg bRg, int i, int i2) {
            super(2);
            this.$notice = disclaimer;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallPurchaseNotice(this.$notice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PaywallTopUpRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C141872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141872(String str, Map<String, String> map, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$subscriptionMetadata = map;
            this.$onBuyExtraUsage = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PaywallTopUpRow(this.$label, this.$subscriptionMetadata, this.$onBuyExtraUsage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C141883 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $price;
        public final /* synthetic */ SubscriptionProduct $product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141883(SubscriptionProduct subscriptionProduct, String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$product = subscriptionProduct;
            this.$price = str;
            this.$isSelected = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanCard(this.$product, this.$price, this.$isSelected, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanCardBenefits$2, reason: invalid class name and case insensitive filesystem */
    public final class C141892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $benefits;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141892(AHD<String> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$benefits = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanCardBenefits(this.$benefits, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanCardDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C141901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141901(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanCardDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanCardHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C141912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $price;
        public final /* synthetic */ SubscriptionProduct $product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141912(SubscriptionProduct subscriptionProduct, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$product = subscriptionProduct;
            this.$price = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanCardHeader(this.$product, this.$price, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanCardSkeleton$2, reason: invalid class name and case insensitive filesystem */
    public final class C141922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141922(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanCardSkeleton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanChangeBlockedDialog$3, reason: invalid class name and case insensitive filesystem */
    public final class C141933 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SubscriptionBlockedActionDialog $dialog;
        public final /* synthetic */ Map<String, String> $metadata;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141933(SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, Map<String, String> map, Function0<Unit> function0, int i) {
            super(2);
            this.$dialog = subscriptionBlockedActionDialog;
            this.$metadata = map;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanChangeBlockedDialog(this.$dialog, this.$metadata, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanPriceShimmer$1, reason: invalid class name and case insensitive filesystem */
    public final class C141941 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ BO4 $shimmerState;
        public final /* synthetic */ C1822Arm $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141941(BRg bRg, BO4 bo4, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$shimmerState = bo4;
            this.$style = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanPriceShimmer(this.$modifier, this.$shimmerState, this.$style, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanSectionHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C141951 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141951(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionPaywallBottomSheetKt.PlanSectionHeader(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$dismissSubscriptionSheets$1, reason: invalid class name and case insensitive filesystem */
    public final class C141961 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final C141961 INSTANCE = new C141961();

        public C141961() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof AuraSubscriptionSheetKey);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$launchTierPurchase$1, reason: invalid class name and case insensitive filesystem */
    public final class C141971 extends AbstractC7559F3s implements G0U<HatchSubscriptionPurchase.Result, Unit> {
        public final /* synthetic */ boolean $isPaidTier;
        public final /* synthetic */ G0V<String, String, Unit> $logOutcome;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ Function0<Unit> $onPending;
        public final /* synthetic */ G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> $onPurchaseResult;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ Map<String, String> $payMetadata;
        public final /* synthetic */ Map<String, String> $priceEventData;
        public final /* synthetic */ Long $selectedTier;
        public final /* synthetic */ String $xgradeDirection;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchSubscriptionPurchase.Result result) {
            G0V<String, String, Unit> g0v;
            String str;
            G0U<AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u;
            AuraSubscriptionPaywallViewModel.PurchaseOutcome purchaseOutcome;
            Function0<Unit> function0;
            C7384Etj.A0Y(result, 0);
            if (!result.equals(HatchSubscriptionPurchase.Result.Success.INSTANCE)) {
                if (result.equals(HatchSubscriptionPurchase.Result.Canceled.INSTANCE)) {
                    this.$logOutcome.invoke(null, "cancelled");
                    g0u = this.$onPurchaseResult;
                    purchaseOutcome = AuraSubscriptionPaywallViewModel.PurchaseOutcome.CANCELED;
                } else if (result instanceof HatchSubscriptionPurchase.Result.Pending) {
                    this.$logOutcome.invoke(null, ((HatchSubscriptionPurchase.Result.Pending) result).reason);
                    this.$onPurchaseResult.invoke(AuraSubscriptionPaywallViewModel.PurchaseOutcome.PENDING);
                    function0 = this.$onPending;
                } else {
                    if (result instanceof HatchSubscriptionPurchase.Result.Failed) {
                        g0v = this.$logOutcome;
                        str = ((HatchSubscriptionPurchase.Result.Failed) result).reason;
                    } else {
                        if (!result.equals(HatchSubscriptionPurchase.Result.Unavailable.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                        g0v = this.$logOutcome;
                        str = "unavailable";
                    }
                    g0v.invoke(str, null);
                    AuraSubscriptionPaywallBottomSheetKt.logPurchaseOutcome(this.$payMetadata, this.$xgradeDirection, this.$nmeEntryPoint, this.$priceEventData, false, this.$isPaidTier, this.$selectedTier);
                    g0u = this.$onPurchaseResult;
                    purchaseOutcome = AuraSubscriptionPaywallViewModel.PurchaseOutcome.FAILED;
                }
                g0u.invoke(purchaseOutcome);
                return;
            }
            this.$logOutcome.invoke(null, null);
            AuraSubscriptionPaywallBottomSheetKt.logPurchaseOutcome(this.$payMetadata, this.$xgradeDirection, this.$nmeEntryPoint, this.$priceEventData, true, this.$isPaidTier, this.$selectedTier);
            this.$onPurchaseResult.invoke(AuraSubscriptionPaywallViewModel.PurchaseOutcome.SUCCESS);
            function0 = this.$onSuccess;
            function0.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141971(G0V<? super String, ? super String, Unit> g0v, Map<String, String> map, String str, C98f c98f, Map<String, String> map2, boolean z, Long l, G0U<? super AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02) {
            super(1);
            this.$logOutcome = g0v;
            this.$payMetadata = map;
            this.$xgradeDirection = str;
            this.$nmeEntryPoint = c98f;
            this.$priceEventData = map2;
            this.$isPaidTier = z;
            this.$selectedTier = l;
            this.$onPurchaseResult = g0u;
            this.$onSuccess = function0;
            this.$onPending = function02;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchSubscriptionPurchase.Result result) {
            invoke2(result);
            return Unit.INSTANCE;
        }
    }

    public static final void PaywallLegalText(Disclaimer disclaimer, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-228941450);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, disclaimer) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (disclaimer != null) {
                bfm.AgE(13470584);
                PaywallLegalClause(disclaimer, HatchScreen.SUBSCRIPTION_PAYWALL, bRg2, bfm, (iA0d & 14) | 48 | (iA0d & 896), 0);
            } else if (z) {
                bfm.AgE(13573473);
                PaywallLegalTextShimmer(bRg2, bfm, (iA0d >> 6) & 14, 0);
            } else {
                bfm.AgE(13614796);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141821(disclaimer, z, bRg2, i, i2);
        }
    }

    public static final void PaywallPriceImpressions(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, boolean z, C98d c98d, C98f c98f, BFM bfm, int i) {
        C7384Etj.A0Y(c98d, 2);
        bfm.AgG(2089341839);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, loaded) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, c98d);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(c98f));
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            int i2 = iA0d & 7168;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 2048);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A07(null, bfm);
            }
            MutableState mutableState = (MutableState) objAaT;
            BO6<String, HatchTierPrice> bo6 = loaded != null ? loaded.prices : null;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableState, bfm.A67(bo6) | AnonymousClass003.A1C(iA0d), AnonymousClass003.A1B(iA0d)) | AnonymousClass003.A1D(iA0d) | (i2 == 2048);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new AuraSubscriptionPaywallBottomSheetKt$PaywallPriceImpressions$1$1(bo6, z, loaded, c98d, c98f, mutableState);
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, boolValueOf, bo6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141852(loaded, z, c98d, c98f, i);
        }
    }

    public static final void PlanChangeBlockedDialog(SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, Map<String, String> map, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass002.A1A(subscriptionBlockedActionDialog, 0, function0);
        bfm.AgG(440779294);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionBlockedActionDialog, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            String str = subscriptionBlockedActionDialog.title;
            String str2 = subscriptionBlockedActionDialog.body;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.MONETIZATION, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.PLAN_CHANGE_BLOCKED_DIALOG, HatchComponent.PLAN_CHANGE_BLOCKED_DIALOG_SCREEN, null, map, null, 500L, 0.0f, null, null, null);
            int i2 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i3 = iA05 & 896;
            boolean zA1Q = (i2 == 32 || ((iA05 & 64) != 0 && bfm.A67(map))) | AnonymousClass002.A1Q(i3, 256);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionPaywallBottomSheetKt$PlanChangeBlockedDialog$1$1(map, function0);
                BBI.A0T(bfm, objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            boolean z = (i2 == 32 || ((iA05 & 64) != 0 && bfm.A67(map))) | (i3 == 256);
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new AuraSubscriptionPaywallBottomSheetKt$PlanChangeBlockedDialog$2$1(map, function0);
                BBI.A0T(bfm, objAaT2);
            }
            SubscriptionSheetHelpersKt.SubscriptionInfoDialog(str, str2, null, null, function02, bRgHatchImpression, (Function0) objAaT2, bfm, 0, 12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141933(subscriptionBlockedActionDialog, map, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PlanPriceShimmer(X.BRg r9, X.BO4 r10, X.C1822Arm r11, X.BFM r12, int r13, int r14) {
        /*
            r8 = r9
            r7 = r10
            r4 = r11
            r0 = 858923732(0x333222d4, float:4.147553E-8)
            r9 = r12
            r12.AgG(r0)
            r3 = r14 & 1
            if (r3 == 0) goto Laa
            r0 = r13 | 6
        L10:
            r1 = r13 & 48
            if (r1 != 0) goto L23
            r1 = r14 & 2
            if (r1 != 0) goto L20
            boolean r2 = r12.A65(r10)
            r1 = 32
            if (r2 != 0) goto L22
        L20:
            r1 = 16
        L22:
            r0 = r0 | r1
        L23:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L36
            r1 = r14 & 4
            if (r1 != 0) goto L33
            boolean r2 = r12.A65(r11)
            r1 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L35
        L33:
            r1 = 128(0x80, float:1.794E-43)
        L35:
            r0 = r0 | r1
        L36:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            r11 = 0
            boolean r1 = X.AnonymousClass002.A1P(r2, r1)
            boolean r1 = X.AnonymousClass001.A1b(r1, r12, r0)
            if (r1 == 0) goto La6
            r12.Afy()
            r1 = r13 & 1
            if (r1 == 0) goto L8d
            boolean r1 = r12.AEk()
            if (r1 != 0) goto L8d
            r12.Afo()
            r1 = r14 & 2
            if (r1 == 0) goto L5b
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
        L5b:
            r1 = r14 & 4
            if (r1 == 0) goto L61
        L5f:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
        L61:
            r12.AAb()
            r5 = 1115684864(0x42800000, float:64.0)
            r6 = 1096810496(0x41600000, float:14.0)
            int r1 = r0 >> 6
            r1 = r1 & 14
            r2 = r1 | 432(0x1b0, float:6.05E-43)
            int r1 = r0 << 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r1
            int r0 = r0 << 12
            int r10 = X.AnonymousClass001.A0B(r0, r2)
            m2272TextLineShimmero3XDK20(r4, r5, r6, r7, r8, r9, r10, r11)
        L7c:
            X.BBb r0 = r12.AAc()
            if (r0 == 0) goto L8c
            com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanPriceShimmer$1 r9 = new com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt$PlanPriceShimmer$1
            r10 = r8
            r11 = r7
            r12 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A06 = r9
        L8c:
            return
        L8d:
            if (r3 == 0) goto L91
            X.BS0 r8 = X.BRg.A00
        L91:
            r1 = r14 & 2
            if (r1 == 0) goto L9b
            X.BO4 r7 = rememberPaywallShimmerState(r12, r11)
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
        L9b:
            r1 = r14 & 4
            if (r1 == 0) goto L61
            com.facebook.aura.vds.compose.theme.AuraTypography r1 = X.C8j4.A0l(r12)
            X.Arm r4 = r1.subheadlineRegular
            goto L5f
        La6:
            r12.Afo()
            goto L7c
        Laa:
            r0 = r13 & 6
            if (r0 != 0) goto Lb5
            int r0 = X.AnonymousClass004.A0d(r12, r8)
            r0 = r0 | r13
            goto L10
        Lb5:
            r0 = r13
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.PlanPriceShimmer(X.BRg, X.BO4, X.Arm, X.BFM, int, int):void");
    }

    public static final void dismissSubscriptionSheets(AuraNavigator auraNavigator) {
        C7384Etj.A0Y(auraNavigator, 0);
        auraNavigator.popAll(C141961.INSTANCE);
    }

    public static final void launchTierPurchase(FragmentActivity fragmentActivity, String str, Map<String, String> map, String str2, C98f c98f, Map<String, String> map2, boolean z, Long l, G0U<? super AuraSubscriptionPaywallViewModel.PurchaseOutcome, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0x(str, map);
        C7384Etj.A0Y(g0u, 8);
        C3cH.A18(function0, function02);
        AuraSubscriptionPaywallBottomSheetKt$launchTierPurchase$logOutcome$1 auraSubscriptionPaywallBottomSheetKt$launchTierPurchase$logOutcome$1 = new AuraSubscriptionPaywallBottomSheetKt$launchTierPurchase$logOutcome$1(map);
        if (fragmentActivity != null) {
            HatchSubscriptionPurchase.INSTANCE.launch(fragmentActivity, str, c98f != null ? c98f.mValue : null, new C141971(auraSubscriptionPaywallBottomSheetKt$launchTierPurchase$logOutcome$1, map, str2, c98f, map2, z, l, g0u, function0, function02));
            return;
        }
        auraSubscriptionPaywallBottomSheetKt$launchTierPurchase$logOutcome$1.invoke("precondition", (String) null);
        logPurchaseOutcome(map, str2, c98f, map2, false, z, l);
        g0u.invoke(AuraSubscriptionPaywallViewModel.PurchaseOutcome.FAILED);
    }

    public static final void logPaywallScreenImpression(PaywallFunnel paywallFunnel, C98f c98f, String str, SubscriptionProduct subscriptionProduct, boolean z) {
        C7384Etj.A0Y(paywallFunnel, 0);
        C98d c98d = paywallFunnel.waterfallStage;
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = new HatchNMEGaiWaterfallEventLogger(null, 1, null);
        C98e c98e = C98e.COMBINED_TIER_PAYMENT_SCREEN;
        hatchNMEGaiWaterfallEventLogger.logEvent(c98e, c98d, C98b.IMPRESSION, c98f, paywallImpressionEventData(str, c98d, paywallFunnel.hasUpgradeOption, paywallFunnel.hasDowngradeOption), C98c.WHOLE_SCREEN, subscriptionProduct != null ? subscriptionProduct.selectedTier : null);
        if (z || subscriptionProduct == null) {
            return;
        }
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger2 = new HatchNMEGaiWaterfallEventLogger(null, 1, null);
        C98b c98b = C98b.CLICK;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.SELECTED_PRODUCT_ID.getValue(), subscriptionProduct.productId);
        c0924AIaA0u.put(HatchMetadataKey.IS_DEFAULT_SELECTION.getValue(), "true");
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CURRENT_TIER, str, c0924AIaA0u);
        }
        String str2 = subscriptionProduct.tierCode;
        if (str2 != null && !C7BY.A0j(str2)) {
            AnonymousClass001.A1C(HatchMetadataKey.TARGET_TIER, str2, c0924AIaA0u);
        }
        hatchNMEGaiWaterfallEventLogger2.logEvent(c98e, c98d, c98b, c98f, AIW.A0K(c0924AIaA0u), C98c.TIER_CARD, subscriptionProduct.selectedTier);
    }

    public static final void logPlanTierClick(SubscriptionProduct subscriptionProduct, String str, C98d c98d, String str2, C98f c98f) {
        AnonymousClass003.A0v(subscriptionProduct, c98d);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.MONETIZATION;
        HatchSubsurface hatchSubsurface = HatchSubsurface.SUBSCRIPTION;
        HatchScreen hatchScreen = HatchScreen.SUBSCRIPTION_PAYWALL;
        HatchComponent hatchComponent = HatchComponent.PLAN_TIER_CARD;
        String value = HatchMetadataKey.SELECTED_PRODUCT_ID.getValue();
        String str3 = subscriptionProduct.productId;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AGH.A0D(C3cG.A0r(value, str3), C3cH.A0r(HatchMetadataKey.IS_CURRENT_PLAN.getValue(), C7384Etj.areEqual(str3, str))), null);
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = new HatchNMEGaiWaterfallEventLogger(null, 1, null);
        C98e c98e = C98e.COMBINED_TIER_PAYMENT_SCREEN;
        C98b c98b = C98b.CLICK;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.SELECTED_PRODUCT_ID.getValue(), subscriptionProduct.productId);
        c0924AIaA0u.put(HatchMetadataKey.IS_DEFAULT_SELECTION.getValue(), "false");
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CURRENT_TIER, str2, c0924AIaA0u);
        }
        String str4 = subscriptionProduct.tierCode;
        if (str4 != null && !C7BY.A0j(str4)) {
            AnonymousClass001.A1C(HatchMetadataKey.TARGET_TIER, str4, c0924AIaA0u);
        }
        hatchNMEGaiWaterfallEventLogger.logEvent(c98e, c98d, c98b, c98f, AIW.A0K(c0924AIaA0u), C98c.TIER_CARD, subscriptionProduct.selectedTier);
    }

    public static final void logTierPriceImpressions(List<SubscriptionProduct> list, Map<String, HatchTierPrice> map, SubscriptionProduct subscriptionProduct, C98d c98d, C98f c98f) {
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = new HatchNMEGaiWaterfallEventLogger(null, 1, null);
        Iterator<SubscriptionProduct> it = list.iterator();
        while (it.hasNext()) {
            logTierPriceImpressions$logPrice(map, hatchNMEGaiWaterfallEventLogger, c98d, c98f, it.next(), C98c.TIER_SELECTION_CARD_WITH_PRICE_INFO);
        }
        if (subscriptionProduct != null) {
            logTierPriceImpressions$logPrice(map, hatchNMEGaiWaterfallEventLogger, c98d, c98f, subscriptionProduct, C98c.PRICE_CONTENT_WITH_PRICE_INFO);
        }
    }

    public static final String purchaseConfirmationToast(PaywallCta paywallCta, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(paywallCta, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = paywallCta.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(1495070621);
            i2 = R.string._name_removed__res_0x7f1210c3;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw AnonymousClass005.A0k(bfm, 1495069536);
                }
                AnonymousClass003.A0l(bfm, -897254185);
                return null;
            }
            bfm.AgE(1495074205);
            i2 = R.string._name_removed__res_0x7f1210c1;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public static final ApQ renderBenefit(String str) {
        C7384Etj.A0Y(str, 0);
        int i = 0;
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        List listA0i = C7BY.A0i(str, new String[]{"**"}, 0);
        if (listA0i.size() % 2 == 0) {
            c1731ApSA0W.A0E(str);
        } else {
            for (Object obj : listA0i) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                String str2 = (String) obj;
                if (i % 2 == 1) {
                    C1736ApY c1736ApY = C1736ApY.A05;
                    long j = B6A.A07;
                    long j2 = C1809ArT.A01;
                    int iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, j));
                    try {
                        c1731ApSA0W.A0E(str2);
                    } finally {
                        c1731ApSA0W.A06(iA00);
                    }
                } else {
                    c1731ApSA0W.A0E(str2);
                }
                i = i2;
            }
        }
        return c1731ApSA0W.A04();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String subscriptionPricePerPeriod(java.lang.String r5, com.facebook.aura.subscription.repo.SubscriptionBillingInterval r6, X.BFM r7, int r8) {
        /*
            r4 = 0
            X.C7384Etj.A0Y(r5, r4)
            r3 = -1
            if (r6 == 0) goto L4d
            int[] r0 = com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r6.ordinal()
            r1 = 2
            r0 = 1
            if (r2 == r3) goto L4d
            if (r2 == r0) goto L2a
            if (r2 == r1) goto L26
            r0 = 3
            if (r2 == r0) goto L22
            r0 = 4
            if (r2 == r0) goto L2e
            if (r2 == r4) goto L4d
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L22:
            r0 = 2131890336(0x7f1210a0, float:1.941536E38)
            goto L31
        L26:
            r0 = 2131890337(0x7f1210a1, float:1.9415363E38)
            goto L31
        L2a:
            r0 = 2131890335(0x7f12109f, float:1.9415359E38)
            goto L31
        L2e:
            r0 = 2131890338(0x7f1210a2, float:1.9415365E38)
        L31:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1731764713(0x6738a1e9, float:8.7190215E23)
            r7.AgE(r0)
            int r0 = r1.intValue()
            r1 = 2131890356(0x7f1210b4, float:1.9415401E38)
            java.lang.String r0 = X.AbstractC2271BQs.A01(r7, r0)
            java.lang.String r0 = X.C3cJ.A0H(r7, r5, r0, r1)
            if (r0 == 0) goto L53
            return r0
        L4d:
            r0 = 1731764712(0x6738a1e8, float:8.719021E23)
            X.AnonymousClass003.A0l(r7, r0)
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.subscriptionPricePerPeriod(java.lang.String, com.facebook.aura.subscription.repo.SubscriptionBillingInterval, X.BFM, int):java.lang.String");
    }

    public static final Map<String, String> tierPriceEventData(SubscriptionProduct subscriptionProduct, HatchTierPrice hatchTierPrice) {
        if (subscriptionProduct == null || hatchTierPrice == null) {
            return null;
        }
        String str = subscriptionProduct.productId;
        String str2 = hatchTierPrice.formattedPrice;
        Integer num = hatchTierPrice.amountInHundredths;
        String str3 = hatchTierPrice.currencyCode;
        SubscriptionBillingInterval subscriptionBillingInterval = subscriptionProduct.billingInterval;
        return HatchPriceImpressionEventDataKt.subscriptionPriceImpressionEventData(str, str2, num, str3, subscriptionBillingInterval != null ? subscriptionBillingInterval.name() : null, subscriptionProduct.billingIntervalCount);
    }

    public static final String xgradeDirection(SubscriptionProduct subscriptionProduct) {
        SubscriptionChangeDirection subscriptionChangeDirection;
        if (subscriptionProduct == null || (subscriptionChangeDirection = subscriptionProduct.changeDirection) == null) {
            return null;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = subscriptionChangeDirection.ordinal();
        if (iOrdinal == 0) {
            return DBJ.FIRST_RUN_UPGRADE;
        }
        if (iOrdinal == 1) {
            return "downgrade";
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[PaywallCta.values().length];
            try {
                AnonymousClass005.A0v(PaywallCta.PayNow, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(PaywallCta.Upgrade, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(PaywallCta.Downgrade, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(PaywallCta.CurrentPlan, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubscriptionChangeDirection.values().length];
            try {
                AnonymousClass005.A0v(SubscriptionChangeDirection.UPGRADE, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionChangeDirection.DOWNGRADE, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SubscriptionPaywallEntryPoint.values().length];
            try {
                AnonymousClass005.A0v(SubscriptionPaywallEntryPoint.SETTINGS, iArr3, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionPaywallEntryPoint.CONFIDENTIAL_VM, iArr3, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionPaywallEntryPoint.HOME_LINK_CLAIM, iArr3, 3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionPaywallEntryPoint.STATUS, iArr3, 4);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionPaywallEntryPoint.CHAT, iArr3, 5);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass002.A18(SubscriptionPaywallEntryPoint.DEEPLINK, iArr3);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass006.A1G(SubscriptionPaywallEntryPoint.CREDITS_SCREEN, iArr3);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass006.A1H(SubscriptionPaywallEntryPoint.ACTIVATION, iArr3);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass006.A1I(SubscriptionPaywallEntryPoint.DEFAULT, iArr3);
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SubscriptionBillingInterval.values().length];
            try {
                AnonymousClass005.A0v(SubscriptionBillingInterval.DAY, iArr4, 1);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionBillingInterval.WEEK, iArr4, 2);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionBillingInterval.MONTH, iArr4, 3);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionBillingInterval.YEAR, iArr4, 4);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AnonymousClass005.A0v(SubscriptionBillingInterval.MINUTE, iArr4, 5);
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void AuraSubscriptionPaywallBottomSheet(Function0<Unit> function0, SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(subscriptionAttribution, 1);
        C7384Etj.A0Y(g0u, 2);
        bfm.AgG(70953552);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, subscriptionAttribution);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            Context applicationContext = AKO.A01(bbi).getApplicationContext();
            C7384Etj.A0X(applicationContext);
            SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint = subscriptionAttribution.localEntryPoint;
            AuraSubscriptionPaywallViewModel.Factory factory = new AuraSubscriptionPaywallViewModel.Factory(abstractC3358CGzA06, applicationContext, subscriptionPaywallEntryPoint, AnonymousClass002.A1Z(subscriptionPaywallEntryPoint, SubscriptionPaywallEntryPoint.ACTIVATION));
            BOD bodA00 = C5wL.A00(bfm);
            String strA00 = AnonymousClass000.A00(1);
            if (bodA00 == null) {
                throw C3cG.A0Q(strA00);
            }
            AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel = (AuraSubscriptionPaywallViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), AuraSubscriptionPaywallViewModel.class);
            AuraSubscriptionNameGateViewModel.Factory factory2 = new AuraSubscriptionNameGateViewModel.Factory(abstractC3358CGzA06);
            BOD bodA002 = C5wL.A00(bfm);
            if (bodA002 == null) {
                throw C3cG.A0Q(strA00);
            }
            AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel = (AuraSubscriptionNameGateViewModel) C3cH.A0H(factory2, bodA002, AnonymousClass005.A0Y(bodA002), C3cG.A0x(AuraSubscriptionNameGateViewModel.class));
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$clearedStaleNotice$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Unit unit = Unit.INSTANCE;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0N, auraSubscriptionPaywallViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$1$1(auraSubscriptionPaywallViewModel, mutableStateA0N);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA67 = bfm.A67(auraSubscriptionPaywallViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$2$1(auraSubscriptionPaywallViewModel);
                BBI.A0O(bbi, objAaT3);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT3, 6, 2);
            AuraSubscriptionPaywallViewModel.UiState uiState = (AuraSubscriptionPaywallViewModel.UiState) C1BO.A07(bfm, auraSubscriptionPaywallViewModel.uiState);
            boolean zA672 = bfm.A67(auraSubscriptionPaywallViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$3$1(auraSubscriptionPaywallViewModel);
                BBI.A0O(bbi, objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT4;
            boolean zA673 = bfm.A67(auraSubscriptionPaywallViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$4$1(auraSubscriptionPaywallViewModel);
                BBI.A0O(bbi, objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT5;
            boolean zA674 = bfm.A67(auraSubscriptionPaywallViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == obj) {
                objAaT6 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$5$1(auraSubscriptionPaywallViewModel);
                BBI.A0O(bbi, objAaT6);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT6;
            boolean zA1M = AnonymousClass003.A1M(bfm, auraSubscriptionNameGateViewModel, subscriptionAttribution);
            Object objAaT7 = bfm.AaT();
            if (zA1M || objAaT7 == obj) {
                objAaT7 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$6$1(auraSubscriptionNameGateViewModel, subscriptionAttribution);
                BBI.A0O(bbi, objAaT7);
            }
            G2k g2k = (G2k) objAaT7;
            int i4 = iA0T & 896;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 256);
            Object objAaT8 = bfm.AaT();
            if (zA1Q || objAaT8 == obj) {
                objAaT8 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$7$1(g0u);
                BBI.A0O(bbi, objAaT8);
            }
            NameGate nameGate = new NameGate(g2k, (Function0) objAaT8);
            Function0 function02 = (Function0) interfaceC7353EnQ;
            G0U g0u2 = (G0U) interfaceC7353EnQ2;
            G0U g0u3 = (G0U) interfaceC7353EnQ3;
            boolean z = i4 == 256;
            Object objAaT9 = bfm.AaT();
            if (z || objAaT9 == obj) {
                objAaT9 = new AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallBottomSheet$8$1(g0u);
                BBI.A0O(bbi, objAaT9);
            }
            AuraSubscriptionPaywallContent(uiState, function0, subscriptionAttribution, function02, g0u2, g0u3, (Function0) objAaT9, nameGate, bRg2, bfm, ((iA0T << 15) & 234881024) | ((iA0T << 3) & 1008), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(function0, subscriptionAttribution, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0246 A[PHI: r20
  0x0246: PHI (r20v3 boolean) = (r20v0 boolean), (r20v4 boolean) binds: [B:141:0x0244, B:139:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0484 A[PHI: r20
  0x0484: PHI (r20v1 boolean) = (r20v0 boolean), (r20v3 boolean), (r20v3 boolean) binds: [B:141:0x0244, B:143:0x0248, B:144:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x048a A[PHI: r0
  0x048a: PHI (r0v123 boolean) = (r0v64 boolean), (r0v124 boolean) binds: [B:122:0x020a, B:120:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraSubscriptionPaywallContent(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState r93, kotlin.jvm.functions.Function0<kotlin.Unit> r94, com.facebook.aura.navigation.key.SubscriptionAttribution r95, kotlin.jvm.functions.Function0<kotlin.Unit> r96, X.G0U<? super java.lang.String, ? extends com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PayNowResult> r97, X.G0U<? super com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PurchaseOutcome, kotlin.Unit> r98, kotlin.jvm.functions.Function0<kotlin.Unit> r99, com.facebook.aura.subscription.view.NameGate r100, X.BRg r101, X.BFM r102, int r103, int r104) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.AuraSubscriptionPaywallContent(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState, kotlin.jvm.functions.Function0, com.facebook.aura.navigation.key.SubscriptionAttribution, kotlin.jvm.functions.Function0, X.G0U, X.G0U, kotlin.jvm.functions.Function0, com.facebook.aura.subscription.view.NameGate, X.BRg, X.BFM, int, int):void");
    }

    public static final void BenefitRow(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1106933589);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = renderBenefit(str);
                bfm.Ai0(objAaT);
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C60Q.A04()), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final void PaywallLegalClause(Disclaimer disclaimer, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(disclaimer, hatchScreen);
        bfm.AgG(344626388);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, disclaimer) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).accent;
            C0jP c0jP = (C0jP) AKO.A07(Am0.A0G, (BBI) bfm);
            boolean zA1W = AnonymousClass002.A1W(bfm, c0jP, AnonymousClass003.A1B(iA0d) | AnonymousClass001.A1O(iA0d), bfm.A64(j));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                AHD<DisclaimerRun> ahd = disclaimer.runs;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    C8j5.A0p(arrayListA0i, it);
                }
                objAaT = HatchInlineLinkTextKt.m1186buildClauseTextbw27NRU(arrayListA0i, j, new AuraSubscriptionPaywallBottomSheetKt$PaywallLegalClause$clause$1$2(disclaimer, hatchScreen, c0jP));
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(5), 0L, zA1b, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, null, null, null, bfm, zA1b ? 1 : 0, zA1b ? 1 : 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141811(disclaimer, hatchScreen, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PaywallPlans(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Loaded r34, com.facebook.aura.subscription.view.PaywallImpressionState r35, java.lang.String r36, X.C98d r37, java.lang.String r38, X.C98f r39, boolean r40, boolean r41, X.G0U<? super java.lang.String, kotlin.Unit> r42, X.BRg r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.PaywallPlans(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded, com.facebook.aura.subscription.view.PaywallImpressionState, java.lang.String, X.98d, java.lang.String, X.98f, boolean, boolean, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void PaywallPurchaseNotice(Disclaimer disclaimer, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1959507789);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, disclaimer) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).accent;
            C0jP c0jP = (C0jP) AKO.A07(Am0.A0G, (BBI) bfm);
            boolean zA1W = AnonymousClass002.A1W(bfm, c0jP, bfm.A64(j), AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                AHD<DisclaimerRun> ahd = disclaimer.runs;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    C8j5.A0p(arrayListA0i, it);
                }
                objAaT = HatchInlineLinkTextKt.m1186buildClauseTextbw27NRU(arrayListA0i, j, new AuraSubscriptionPaywallBottomSheetKt$PaywallPurchaseNotice$clause$1$2(disclaimer, c0jP));
                bfm.Ai0(objAaT);
            }
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).caption1Regular;
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingLarge;
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, C3U4.A0C(bRgA0R, f, 0.0f, f, AuraDimensKt.SpacingMedium), jA07, c1822Arm, null, null, C3cH.A0F(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141861(disclaimer, bRg2, i, i2);
        }
    }

    public static final void PaywallTopUpRow(String str, Map<String, String> map, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1555496556);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(AuraDimensKt.SpacingLarge);
            BRg bRgA03 = C1b8.A03(C11U.A03(C3U4.A07(bRg2, AuraDimensKt.SpacingMedium), c1d3A00), c1d3A00, C3cH.A0W(bfm).card);
            boolean zA1D = ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(map))) | AnonymousClass003.A1D(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionPaywallBottomSheetKt$PaywallTopUpRow$1$1(map, function0);
                BBI.A0T(bfm, objAaT);
            }
            AuraSubscriptionUsageMetersKt.m2274UsageCtaRowgF0flNs(str, (Function0) objAaT, bRgA03, 0L, Integer.valueOf(R.drawable.circleplus_outline_24_wght400_light), false, false, null, false, bfm, (iA0d & 14) | 196608, 456);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141872(str, map, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PlanCard(SubscriptionProduct subscriptionProduct, String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbi;
        int i3;
        BRg bRgA01;
        BRg bRg2 = bRg;
        bfm.AgG(1531361823);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(AuraDimensKt.SpacingLarge);
            BRg bRgA03 = C11U.A03(AnonymousClass001.A0R(bRg2), c1d3A00);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA032 = C1b8.A03(bRgA03, c1d3A00, auraTheme.getColors(bfm, 6).card);
            if (z) {
                bRgA01 = C1DI.A01(C0M7.A00(2.0f, auraTheme.getColors(bfm, 6).link), C3cG.A09(bfm, -342117907), c1d3A00);
                bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-341935503);
                bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
                bRgA01 = BRg.A00;
            }
            BRg bRgThen = bRgA032.then(bRgA01);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C1qN();
                BBI.A0O(bbi, objAaT);
            }
            BRg bRgA09 = C3U4.A09(bRgThen.then(new AX9(null, (InterfaceC1072AWd) objAaT, C3cG.A0A(3), function0, z, i3, true)), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, i3);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA012, iA0J);
            PlanCardHeader(subscriptionProduct, str, null, bfm, SubscriptionProduct.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
            PlanCardDivider(null, bfm, i3, 1);
            PlanCardBenefits(subscriptionProduct.benefits, null, bfm, i3, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141883(subscriptionProduct, str, z, function0, bRg2, i, i2);
        }
    }

    public static final void PlanCardHeader(SubscriptionProduct subscriptionProduct, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(549570036);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str2 = subscriptionProduct.tierName;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(22)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (str.length() == 0) {
                bfm.AgE(479853988);
                PlanPriceShimmer(null, null, null, bfm, 0, 7);
            } else {
                bfm.AgE(479908455);
                AuraTextKt.m2639AuraTextUY9GdpU(subscriptionPricePerPeriod(str, subscriptionProduct.billingInterval, bfm, (iA05 >> 3) & 14), null, C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C60Q.A04()), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141912(subscriptionProduct, str, bRg2, i, i2);
        }
    }

    public static final void PlanSectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1307920395);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
            long jA07 = C3cH.A07(bfm, auraTheme);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingXsmall;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(bRg2, f, f2, f, f2), jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141951(str, bRg2, i, i2);
        }
    }

    /* renamed from: TextLineShimmer-o3XDK20, reason: not valid java name */
    public static final void m2272TextLineShimmero3XDK20(C1822Arm c1822Arm, float f, float f2, BO4 bo4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        AnonymousClass002.A1B(c1822Arm, 0, bo4);
        bfm.AgG(-1345145243);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1822Arm) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bo4);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C1D8.A00(AuraDimensKt.SpacingMicro);
                bfm.Ai0(objAaT);
            }
            C1DE c1de = (C1DE) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AuraSubscriptionPaywallBottomSheetKt$TextLineShimmer$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA0P, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0B, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(InviteCodeScratcherKt.CODE_SEPARATOR, null, B6A.A06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0d << 9) & 7168) | 390, 0, 16370);
            BOI.A02(bfm, C10G.A0C(BRg.A00, f, f2), c1de, bo4);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraSubscriptionPaywallBottomSheetKt$TextLineShimmer$3(c1822Arm, f, f2, bo4, bRgA0P, i, i2);
        }
    }

    public static final void logPurchaseOutcome(Map<String, String> map, String str, C98f c98f, Map<String, String> map2, boolean z, boolean z2, Long l) {
        new HatchNMEGaiWaterfallEventLogger(null, 1, null).logEvent(C98e.COMBINED_TIER_PAYMENT_SCREEN, z2 ? C98d.XGRADE : C98d.ONBOARDING, z2 ? z ? C98b.XGRADE_PURCHASE_SUCCESSFUL : C98b.XGRADE_PURCHASE_ERROR : z ? C98b.CLIENT_PURCHASE_SUCCESSFUL : C98b.CLIENT_PURCHASE_ERROR, c98f, waterfallEventData(map, str, map2), null, l);
    }

    public static final void logTierPriceImpressions$logPrice(Map<String, HatchTierPrice> map, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98d c98d, C98f c98f, SubscriptionProduct subscriptionProduct, C98c c98c) {
        Map<String, String> mapTierPriceEventData = tierPriceEventData(subscriptionProduct, map.get(subscriptionProduct.productId));
        if (mapTierPriceEventData != null) {
            hatchNMEGaiWaterfallEventLogger.logEvent(C98e.COMBINED_TIER_PAYMENT_SCREEN, c98d, C98b.PRICE_IMPRESSION, c98f, mapTierPriceEventData, c98c, subscriptionProduct.selectedTier);
        }
    }

    public static final String paywallCtaType(PaywallCta paywallCta) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = paywallCta.ordinal();
        if (iOrdinal == 0) {
            return "pay_now";
        }
        if (iOrdinal == 1) {
            return DBJ.FIRST_RUN_UPGRADE;
        }
        if (iOrdinal == 2) {
            return "downgrade";
        }
        if (iOrdinal != 3) {
            throw C3cG.A0q();
        }
        return "pay_now";
    }

    public static final PaywallFunnel paywallFunnel(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded) {
        C98d c98d = (loaded == null || !loaded.isPaidTier) ? C98d.ONBOARDING : C98d.XGRADE;
        return new PaywallFunnel(c98d, paywallFunnel$offers(c98d, loaded, SubscriptionChangeDirection.UPGRADE), paywallFunnel$offers(c98d, loaded, SubscriptionChangeDirection.DOWNGRADE));
    }

    public static final boolean paywallFunnel$offers(C98d c98d, AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, SubscriptionChangeDirection subscriptionChangeDirection) {
        AHD<SubscriptionProduct> ahd;
        if (c98d != C98d.XGRADE || loaded == null || (ahd = loaded.products) == null) {
            return false;
        }
        if ((ahd instanceof Collection) && ahd.isEmpty()) {
            return false;
        }
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            if (((SubscriptionProduct) it.next()).changeDirection == subscriptionChangeDirection) {
                return true;
            }
        }
        return false;
    }

    public static final BO4 rememberPaywallShimmerState(BFM bfm, int i) {
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        return BOI.A01(bfm, null, 0.0f, 252, auraTheme.getColors(bfm, 6).shimmeringBase, auraTheme.getColors(bfm, 6).shimmeringHighlight);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberTierCardImpressionModifier(com.facebook.aura.subscription.repo.SubscriptionProduct r24, java.lang.String r25, X.C98d r26, java.lang.String r27, X.C98f r28, boolean r29, boolean r30, com.facebook.aura.subscription.view.PaywallImpressionState r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.rememberTierCardImpressionModifier(com.facebook.aura.subscription.repo.SubscriptionProduct, java.lang.String, X.98d, java.lang.String, X.98f, boolean, boolean, com.facebook.aura.subscription.view.PaywallImpressionState, X.BFM, int, int):X.BRg");
    }

    public static final C98f toNmeEntryPoint(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (subscriptionPaywallEntryPoint.ordinal()) {
            case 0:
            case 4:
            case 8:
                return null;
            case 1:
            case 6:
            case 7:
                return C98f.A04;
            case 2:
                return C98f.A03;
            case 3:
                return C98f.A01;
            case 5:
                return C98f.A02;
            default:
                throw C3cG.A0q();
        }
    }

    public static final void PaywallLegalTextShimmer(BRg bRg, BFM bfm, int i, int i2) {
        BS0 bs0;
        bfm.AgG(-95372528);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BO4 bo4RememberPaywallShimmerState = rememberPaywallShimmerState(bfm, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            C1D3 c1d3A00 = C1D8.A00(4.0f);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg.then(c1062ATq);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionPaywallBottomSheetKt$PaywallLegalTextShimmer$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgThen, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            bfm.AgE(874938505);
            int i4 = 0;
            do {
                bs0 = BRg.A00;
                BOI.A02(bfm, C10G.A04(c1062ATq, 12.0f), c1d3A00, bo4RememberPaywallShimmerState);
                i4++;
            } while (i4 < 2);
            BBI.A0R(bbi, false);
            BOI.A02(bfm, C10G.A04(C10G.A03(bs0, 0.6f), 12.0f), c1d3A00, bo4RememberPaywallShimmerState);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }

    public static final void PaywallLoadingPlans(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-343273603);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b0);
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA07 = C3U4.A07(bRgA0R, f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionPaywallBottomSheetKt$PaywallLoadingPlans$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            bfm.AgE(1754276455);
            int i4 = 0;
            do {
                PlanCardSkeleton(null, bfm, 0, 1);
                i4++;
            } while (i4 < 2);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141833(bRg, i, i2);
        }
    }

    public static final void PlanCardBenefits(AHD<String> ahd, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-307141064);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -326210878);
            while (itA0w.hasNext()) {
                BenefitRow(AnonymousClass005.A0j(itA0w), null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141892(ahd, bRg, i, i2);
        }
    }

    public static final void PlanCardDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(493728157);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C1b8.A04(bfm, C10G.A04(AnonymousClass001.A0R(bRg), 1.0f), C3cH.A0W(bfm).fillDivider);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141901(bRg, i, i2);
        }
    }

    public static final void PlanCardSkeleton(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1430616187);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BO4 bo4RememberPaywallShimmerState = rememberPaywallShimmerState(bfm, 0);
            C1D3 c1d3A00 = C1D8.A00(AuraDimensKt.SpacingLarge);
            C1D3 c1d3A002 = C1D8.A00(AuraDimensKt.SpacingMicro);
            BRg bRgA09 = C3U4.A09(C1b8.A03(C11U.A03(AnonymousClass001.A0R(bRg), c1d3A00), c1d3A00, C3cH.A0W(bfm).card), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            BOI.A02(bfm, C10G.A0C(bs0, 120.0f, 20.0f), c1d3A002, bo4RememberPaywallShimmerState);
            BOI.A02(bfm, C10G.A0C(bs0, 80.0f, 16.0f), c1d3A002, bo4RememberPaywallShimmerState);
            BOI.A02(bfm, C10G.A0C(bs0, 220.0f, 14.0f), c1d3A002, bo4RememberPaywallShimmerState);
            BOI.A02(bfm, C10G.A0C(bs0, 180.0f, 14.0f), c1d3A002, bo4RememberPaywallShimmerState);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141922(bRg, i, i2);
        }
    }

    public static final /* synthetic */ Integer access$PaywallPriceImpressions$lambda$1(MutableState mutableState) {
        return (Integer) mutableState.getValue();
    }

    public static final Map<String, String> paywallImpressionEventData(String str, C98d c98d, boolean z, boolean z2) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CURRENT_TIER, str, c0924AIaA0u);
        }
        if (c98d == C98d.XGRADE) {
            AnonymousClass003.A0s(HatchMetadataKey.HAS_UPGRADE_OPTION, c0924AIaA0u, z);
            AnonymousClass003.A0s(HatchMetadataKey.HAS_DOWNGRADE_OPTION, c0924AIaA0u, z2);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    public static final Map<String, String> waterfallEventData(Map<String, String> map, String str, Map<String, String> map2) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.XGRADE_DIRECTION, str, c0924AIaA0u);
        }
        if (map2 != null) {
            c0924AIaA0u.putAll(map2);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PaywallFooter(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Loaded r75, java.lang.String r76, com.facebook.aura.subscription.model.PaywallCta r77, com.facebook.aura.subscription.repo.Disclaimer r78, java.lang.String r79, X.C98d r80, com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint r81, X.C98f r82, boolean r83, X.G0U<? super java.lang.String, ? extends com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PayNowResult> r84, X.G0U<? super com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PurchaseOutcome, kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, com.facebook.aura.devices.intf.SubscriptionAddOnIntegration r89, java.lang.Boolean r90, androidx.fragment.app.FragmentActivity r91, com.facebook.aura.subscription.view.NameGate r92, X.BRg r93, X.C3TQ r94, com.facebook.aura.vds.compose.button.AuraButtonSize r95, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r96, boolean r97, X.BFM r98, int r99, int r100, int r101, int r102) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionPaywallBottomSheetKt.PaywallFooter(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded, java.lang.String, com.facebook.aura.subscription.model.PaywallCta, com.facebook.aura.subscription.repo.Disclaimer, java.lang.String, X.98d, com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint, X.98f, boolean, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.devices.intf.SubscriptionAddOnIntegration, java.lang.Boolean, androidx.fragment.app.FragmentActivity, com.facebook.aura.subscription.view.NameGate, X.BRg, X.3TQ, com.facebook.aura.vds.compose.button.AuraButtonSize, X.G0V, boolean, X.BFM, int, int, int, int):void");
    }

    public static final C98f toNmeEntryPoint(SubscriptionAttribution subscriptionAttribution) {
        C7384Etj.A0Y(subscriptionAttribution, 0);
        String str = subscriptionAttribution.canonicalNmeEntryPoint;
        if (str == null) {
            return toNmeEntryPoint(subscriptionAttribution.localEntryPoint);
        }
        return HatchNMEEntrypointAttribution.INSTANCE.fromRawValue(str);
    }
}
