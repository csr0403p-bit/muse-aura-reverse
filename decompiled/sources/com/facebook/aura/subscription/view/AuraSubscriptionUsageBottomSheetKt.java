package com.facebook.aura.subscription.view;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.B1U;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06H;
import X.C07C;
import X.C0861A6i;
import X.C0881AGi;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3Ue;
import X.C5wL;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.devices.intf.SubscriptionAddOn;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.model.SubscriptionActions;
import com.facebook.aura.subscription.model.SubscriptionMeterDestination;
import com.facebook.aura.subscription.model.UsageActionsSlot;
import com.facebook.aura.subscription.repo.SubscriptionCtaConfirmation;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.ext.ModifierExtKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraCardDimensions;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraSubscriptionUsageBottomSheetKt {

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $onNavigateToPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$attribution = subscriptionAttribution;
            this.$onNavigateToPage = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.AuraSubscriptionUsageBottomSheet(this.$attribution, this.$onNavigateToPage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageContent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionAddOnIntegration $addOnIntegration;
        public final /* synthetic */ boolean $isCancelling;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState.Loaded $loadedState;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
        public final /* synthetic */ Function0<Unit> $onOpenBillingPortal;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ MutableState<SubscriptionManagementCta> $pendingCancel$delegate;
        public final /* synthetic */ MutableState<Boolean> $showCrossPlatformDialog$delegate;
        public final /* synthetic */ MutableState<Boolean> $showResubscribeDialog$delegate;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(AuraSubscriptionUsageViewModel.UiState.Loaded loaded, Function0<Unit> function0, AuraSubscriptionUsageViewModel.UiState uiState, Map<String, String> map, boolean z, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z2, SubscriptionAddOnIntegration subscriptionAddOnIntegration, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u, Function0<Unit> function05, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<SubscriptionManagementCta> mutableState3) {
            super(3);
            this.$loadedState = loaded;
            this.$onOpenBillingPortal = function0;
            this.$uiState = uiState;
            this.$subscriptionMetadata = map;
            this.$isResubscribing = z;
            this.$onOpenPaywall = function02;
            this.$onRedeemComplimentary = function03;
            this.$onBuyExtraUsage = function04;
            this.$isCancelling = z2;
            this.$addOnIntegration = subscriptionAddOnIntegration;
            this.$onClaimSubscriptionAddOn = g0u;
            this.$onRetry = function05;
            this.$showCrossPlatformDialog$delegate = mutableState;
            this.$showResubscribeDialog$delegate = mutableState2;
            this.$pendingCancel$delegate = mutableState3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cd A[PHI: r1 r10 r23
  0x00cd: PHI (r1v4 boolean) = (r1v7 boolean), (r1v8 boolean) binds: [B:30:0x00cb, B:28:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r10v2 boolean) = (r10v11 boolean), (r10v12 boolean) binds: [B:30:0x00cb, B:28:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r23v0 boolean) = (r23v5 boolean), (r23v6 boolean) binds: [B:30:0x00cb, B:28:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d3 A[PHI: r1 r10 r23
  0x00d3: PHI (r1v6 boolean) = (r1v4 boolean), (r1v7 boolean) binds: [B:32:0x00d1, B:30:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r10v10 boolean) = (r10v2 boolean), (r10v11 boolean) binds: [B:32:0x00d1, B:30:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r23v4 boolean) = (r23v0 boolean), (r23v5 boolean) binds: [B:32:0x00d1, B:30:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r38, X.BFM r39, int r40) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt.AnonymousClass5.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageContent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAddOnIntegration $addOnIntegration;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ boolean $isCancelling;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ Function0<Unit> $onCancelSubscription;
        public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
        public final /* synthetic */ Function0<Unit> $onConfirmResubscribe;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenBillingPortal;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AuraSubscriptionUsageViewModel.UiState uiState, SubscriptionAttribution subscriptionAttribution, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, boolean z, Function0<Unit> function06, boolean z2, Function0<Unit> function07, Function0<Unit> function08, SubscriptionAddOnIntegration subscriptionAddOnIntegration, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u, Function0<Unit> function09, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$uiState = uiState;
            this.$attribution = subscriptionAttribution;
            this.$onBack = function0;
            this.$onDismiss = function02;
            this.$onOpenPaywall = function03;
            this.$onRedeemComplimentary = function04;
            this.$onBuyExtraUsage = function05;
            this.$isCancelling = z;
            this.$onCancelSubscription = function06;
            this.$isResubscribing = z2;
            this.$onConfirmResubscribe = function07;
            this.$onOpenBillingPortal = function08;
            this.$addOnIntegration = subscriptionAddOnIntegration;
            this.$onClaimSubscriptionAddOn = g0u;
            this.$onRetry = function09;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.AuraSubscriptionUsageContent(this.$uiState, this.$attribution, this.$onBack, this.$onDismiss, this.$onOpenPaywall, this.$onRedeemComplimentary, this.$onBuyExtraUsage, this.$isCancelling, this.$onCancelSubscription, this.$isResubscribing, this.$onConfirmResubscribe, this.$onOpenBillingPortal, this.$addOnIntegration, this.$onClaimSubscriptionAddOn, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$CancelSubscriptionDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $confirmLabel;
        public final /* synthetic */ String $dismissLabel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Map<String, String> map, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmLabel = str;
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
            this.$dismissLabel = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$dismissLabel, AnonymousClass001.A1R(bfm, this.$onConfirm, AnonymousClass001.A1T(bfm, this.$subscriptionMetadata, bfm.A65(this.$confirmLabel)))));
                String str = this.$confirmLabel;
                String str2 = this.$dismissLabel;
                Map<String, String> map = this.$subscriptionMetadata;
                Function0<Unit> function0 = this.$onConfirm;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionUsageBottomSheetKt$CancelSubscriptionDialog$1$1$1(str, str2, map, function0, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$CancelSubscriptionDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SubscriptionCtaConfirmation $confirmation;
        public final /* synthetic */ Long $nextBillingEpochSeconds;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SubscriptionCtaConfirmation subscriptionCtaConfirmation, Long l, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$confirmation = subscriptionCtaConfirmation;
            this.$nextBillingEpochSeconds = l;
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.CancelSubscriptionDialog(this.$confirmation, this.$nextBillingEpochSeconds, this.$subscriptionMetadata, this.$onConfirm, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $buyCtaLabel;
        public final /* synthetic */ String $label;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ C07C $this_PurchasedUsage;
        public final /* synthetic */ Integer $usedPercent;
        public final /* synthetic */ String $valueLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, Integer num, String str, String str2, String str3, Map<String, String> map, Function0<Unit> function0, int i) {
            super(2);
            this.$this_PurchasedUsage = c07c;
            this.$usedPercent = num;
            this.$label = str;
            this.$valueLabel = str2;
            this.$buyCtaLabel = str3;
            this.$subscriptionMetadata = map;
            this.$onBuyExtraUsage = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.PurchasedUsage(this.$this_PurchasedUsage, this.$usedPercent, this.$label, this.$valueLabel, this.$buyCtaLabel, this.$subscriptionMetadata, this.$onBuyExtraUsage, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $buyCtaLabel;
        public final /* synthetic */ String $label;
        public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ C07C $this_PurchasedUsage;
        public final /* synthetic */ Integer $usedPercent;
        public final /* synthetic */ String $valueLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C07C c07c, Integer num, String str, String str2, String str3, Map<String, String> map, Function0<Unit> function0, int i) {
            super(2);
            this.$this_PurchasedUsage = c07c;
            this.$usedPercent = num;
            this.$label = str;
            this.$valueLabel = str2;
            this.$buyCtaLabel = str3;
            this.$subscriptionMetadata = map;
            this.$onBuyExtraUsage = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.PurchasedUsage(this.$this_PurchasedUsage, this.$usedPercent, this.$label, this.$valueLabel, this.$buyCtaLabel, this.$subscriptionMetadata, this.$onBuyExtraUsage, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C141991 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141991(Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A67(this.$subscriptionMetadata)));
                Map<String, String> map = this.$subscriptionMetadata;
                Function0<Unit> function0 = this.$onConfirm;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$1$1$1(map, function0, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C142002 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142002(Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.ResubscribeConfirmationDialog(this.$subscriptionMetadata, this.$onConfirm, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActionCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C142013 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Integer $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ AuraCardType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142013(Integer num, String str, AuraCardType auraCardType, boolean z, Function0<Unit> function0, BRg bRg, String str2, int i, int i2) {
            super(2);
            this.$iconRes = num;
            this.$title = str;
            this.$type = auraCardType;
            this.$enabled = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageActionCard(this.$iconRes, this.$title, this.$type, this.$enabled, this.$onClick, this.$modifier, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActionRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C142021 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $iconRes;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ String $loadingContentDescription;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142021(Integer num, String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, String str3, int i, int i2) {
            super(2);
            this.$iconRes = num;
            this.$title = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$loading = z;
            this.$loadingContentDescription = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageActionRow(this.$iconRes, this.$title, this.$onClick, this.$modifier, this.$subtitle, this.$loading, this.$loadingContentDescription, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActionRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C142033 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $iconRes;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ String $loadingContentDescription;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142033(Integer num, String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, String str3, int i, int i2) {
            super(2);
            this.$iconRes = num;
            this.$title = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$loading = z;
            this.$loadingContentDescription = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageActionRow(this.$iconRes, this.$title, this.$onClick, this.$modifier, this.$subtitle, this.$loading, this.$loadingContentDescription, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActions$2, reason: invalid class name and case insensitive filesystem */
    public final class C142042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ UsageActionsSlot $actionsSlot;
        public final /* synthetic */ SubscriptionAddOnIntegration $addOnIntegration;
        public final /* synthetic */ String $billingSubtitle;
        public final /* synthetic */ boolean $isCancelling;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ G0U<SubscriptionManagementCta, Unit> $onCancel;
        public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
        public final /* synthetic */ Function0<Unit> $onManagePayment;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onResubscribe;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ AHD<SubscriptionManagementCta> $rows;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ C07C $this_UsageActions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142042(C07C c07c, AHD<SubscriptionManagementCta> ahd, String str, UsageActionsSlot usageActionsSlot, Map<String, String> map, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super SubscriptionManagementCta, Unit> g0u, Function0<Unit> function04, SubscriptionAddOnIntegration subscriptionAddOnIntegration, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u2, Function0<Unit> function05, int i, int i2) {
            super(2);
            this.$this_UsageActions = c07c;
            this.$rows = ahd;
            this.$billingSubtitle = str;
            this.$actionsSlot = usageActionsSlot;
            this.$subscriptionMetadata = map;
            this.$isCancelling = z;
            this.$isResubscribing = z2;
            this.$onOpenPaywall = function0;
            this.$onRedeemComplimentary = function02;
            this.$onManagePayment = function03;
            this.$onCancel = g0u;
            this.$onResubscribe = function04;
            this.$addOnIntegration = subscriptionAddOnIntegration;
            this.$onClaimSubscriptionAddOn = g0u2;
            this.$onRetry = function05;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageActions(this.$this_UsageActions, this.$rows, this.$billingSubtitle, this.$actionsSlot, this.$subscriptionMetadata, this.$isCancelling, this.$isResubscribing, this.$onOpenPaywall, this.$onRedeemComplimentary, this.$onManagePayment, this.$onCancel, this.$onResubscribe, this.$addOnIntegration, this.$onClaimSubscriptionAddOn, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActions$4, reason: invalid class name and case insensitive filesystem */
    public final class C142054 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ UsageActionsSlot $actionsSlot;
        public final /* synthetic */ SubscriptionAddOnIntegration $addOnIntegration;
        public final /* synthetic */ String $billingSubtitle;
        public final /* synthetic */ boolean $isCancelling;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ G0U<SubscriptionManagementCta, Unit> $onCancel;
        public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
        public final /* synthetic */ Function0<Unit> $onManagePayment;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onResubscribe;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ AHD<SubscriptionManagementCta> $rows;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ C07C $this_UsageActions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142054(C07C c07c, AHD<SubscriptionManagementCta> ahd, String str, UsageActionsSlot usageActionsSlot, Map<String, String> map, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super SubscriptionManagementCta, Unit> g0u, Function0<Unit> function04, SubscriptionAddOnIntegration subscriptionAddOnIntegration, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u2, Function0<Unit> function05, int i, int i2) {
            super(2);
            this.$this_UsageActions = c07c;
            this.$rows = ahd;
            this.$billingSubtitle = str;
            this.$actionsSlot = usageActionsSlot;
            this.$subscriptionMetadata = map;
            this.$isCancelling = z;
            this.$isResubscribing = z2;
            this.$onOpenPaywall = function0;
            this.$onRedeemComplimentary = function02;
            this.$onManagePayment = function03;
            this.$onCancel = g0u;
            this.$onResubscribe = function04;
            this.$addOnIntegration = subscriptionAddOnIntegration;
            this.$onClaimSubscriptionAddOn = g0u2;
            this.$onRetry = function05;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageActions(this.$this_UsageActions, this.$rows, this.$billingSubtitle, this.$actionsSlot, this.$subscriptionMetadata, this.$isCancelling, this.$isResubscribing, this.$onOpenPaywall, this.$onRedeemComplimentary, this.$onManagePayment, this.$onCancel, this.$onResubscribe, this.$addOnIntegration, this.$onClaimSubscriptionAddOn, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActions$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ UsageActionsSlot $actionsSlot;
        public final /* synthetic */ SubscriptionAddOnIntegration $addOnIntegration;
        public final /* synthetic */ String $billingSubtitle;
        public final /* synthetic */ boolean $isCancelling;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ G0U<SubscriptionManagementCta, Unit> $onCancel;
        public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
        public final /* synthetic */ Function0<Unit> $onManagePayment;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onResubscribe;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ AHD<SubscriptionManagementCta> $rows;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ C07C $this_UsageActions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(C07C c07c, AHD<SubscriptionManagementCta> ahd, String str, UsageActionsSlot usageActionsSlot, Map<String, String> map, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super SubscriptionManagementCta, Unit> g0u, Function0<Unit> function04, SubscriptionAddOnIntegration subscriptionAddOnIntegration, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u2, Function0<Unit> function05, int i, int i2) {
            super(2);
            this.$this_UsageActions = c07c;
            this.$rows = ahd;
            this.$billingSubtitle = str;
            this.$actionsSlot = usageActionsSlot;
            this.$subscriptionMetadata = map;
            this.$isCancelling = z;
            this.$isResubscribing = z2;
            this.$onOpenPaywall = function0;
            this.$onRedeemComplimentary = function02;
            this.$onManagePayment = function03;
            this.$onCancel = g0u;
            this.$onResubscribe = function04;
            this.$addOnIntegration = subscriptionAddOnIntegration;
            this.$onClaimSubscriptionAddOn = g0u2;
            this.$onRetry = function05;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageActions(this.$this_UsageActions, this.$rows, this.$billingSubtitle, this.$actionsSlot, this.$subscriptionMetadata, this.$isCancelling, this.$isResubscribing, this.$onOpenPaywall, this.$onRedeemComplimentary, this.$onManagePayment, this.$onCancel, this.$onResubscribe, this.$addOnIntegration, this.$onClaimSubscriptionAddOn, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageDisplay$2, reason: invalid class name and case insensitive filesystem */
    public final class C142062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142062(AuraSubscriptionUsageViewModel.UiState uiState, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageDisplay(this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageRowFooter$1, reason: invalid class name and case insensitive filesystem */
    public final class C142071 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142071(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageRowFooter(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSettlingRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C142083 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142083(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageSettlingRow(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$2, reason: invalid class name and case insensitive filesystem */
    public final class C142092 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ UsageActionsSlot $actionsSlot;
        public final /* synthetic */ boolean $isLoaded;
        public final /* synthetic */ boolean $isPaidTier;
        public final /* synthetic */ boolean $isRedeemingComplimentary;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ SubscriptionManagementCta $meterAction;
        public final /* synthetic */ SubscriptionMeterDestination $meterDestination;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onResubscribe;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;
        public final /* synthetic */ C07C $this_UsageSummary;
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142092(C07C c07c, AuraSubscriptionUsageViewModel.UiState uiState, SubscriptionManagementCta subscriptionManagementCta, SubscriptionMeterDestination subscriptionMeterDestination, boolean z, UsageActionsSlot usageActionsSlot, boolean z2, Map<String, String> map, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$this_UsageSummary = c07c;
            this.$uiState = uiState;
            this.$meterAction = subscriptionManagementCta;
            this.$meterDestination = subscriptionMeterDestination;
            this.$isLoaded = z;
            this.$actionsSlot = usageActionsSlot;
            this.$isPaidTier = z2;
            this.$subscriptionMetadata = map;
            this.$isResubscribing = z3;
            this.$isRedeemingComplimentary = z4;
            this.$onOpenPaywall = function0;
            this.$onRedeemComplimentary = function02;
            this.$onResubscribe = function03;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageBottomSheetKt.UsageSummary(this.$this_UsageSummary, this.$uiState, this.$meterAction, this.$meterDestination, this.$isLoaded, this.$actionsSlot, this.$isPaidTier, this.$subscriptionMetadata, this.$isResubscribing, this.$isRedeemingComplimentary, this.$onOpenPaywall, this.$onRedeemComplimentary, this.$onResubscribe, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    public static final BRg redeemComplimentaryCtaImpression(BRg bRg, boolean z, Map<String, String> map) {
        return z ? HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.MONETIZATION, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_MANAGEMENT, HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_LINK, null, map, null, 500L, 0.0f, null, null, null) : bRg;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionManagementAction.values().length];
            try {
                AnonymousClass002.A13(SubscriptionManagementAction.MANAGE_BILLING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionManagementAction.CANCEL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SubscriptionManagementAction.REACTIVATE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SubscriptionManagementAction.REFRESH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(SubscriptionManagementAction.OPEN_URL, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(SubscriptionManagementAction.OPEN_PAYWALL, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(SubscriptionManagementAction.CHANGE_PLAN, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(SubscriptionManagementAction.PURCHASE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(SubscriptionManagementAction.BUY_TOPUP, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(SubscriptionManagementAction.CLAIM_META_HOME_LINK, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(SubscriptionManagementAction.REDEEM_COMPLIMENTARY, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(SubscriptionManagementAction.DISMISS, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AuraSubscriptionUsageBottomSheet(SubscriptionAttribution subscriptionAttribution, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(subscriptionAttribution, g0u);
        bfm.AgG(1883029818);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, subscriptionAttribution) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraSubscriptionUsageViewModel.Factory factory = new AuraSubscriptionUsageViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel = (AuraSubscriptionUsageViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(AuraSubscriptionUsageViewModel.class));
            AuraSubscriptionUsageViewModel.UiState uiState = (AuraSubscriptionUsageViewModel.UiState) C1BO.A07(bfm, auraSubscriptionUsageViewModel.uiState);
            SubscriptionAddOnIntegration subscriptionAddOnIntegrationResolveIntegration = SubscriptionAddOn.INSTANCE.resolveIntegration();
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(auraSubscriptionUsageViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$1$1(auraSubscriptionUsageViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass006.A16(bfm, objAaT, unit, 6);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
            G0U<String, Unit> g0uRememberDismissToast = SubscriptionSheetHelpersKt.rememberDismissToast(bfm, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c1);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass004.A11(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT4;
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA1W = AnonymousClass005.A1W(bfm, contextA0H, g0uRememberDismissToast, strA013, bfm.A67(auraSubscriptionUsageViewModel));
            Object objAaT5 = bfm.AaT();
            if (zA1W || objAaT5 == obj) {
                objAaT5 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1(auraSubscriptionUsageViewModel, g0uRememberDismissToast, strA013, contextA0H, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, auraSubscriptionUsageViewModel);
            boolean zA1O = AnonymousClass003.A1O(bfm, auraNavigatorA0b, strA013, AnonymousClass005.A1W(bfm, auraSubscriptionUsageViewModel, g0uRememberDismissToast, strA012, bfm.A67(c3ux)));
            Object objAaT6 = bfm.AaT();
            if (zA1O || objAaT6 == obj) {
                objAaT6 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$onConfirmResubscribe$1$1(c3ux, mutableState2, auraSubscriptionUsageViewModel, g0uRememberDismissToast, strA012, auraNavigatorA0b, strA013);
                bfm.Ai0(objAaT6);
            }
            Function0 function0 = (Function0) objAaT6;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT7 = bfm.AaT();
            if (zA672 || objAaT7 == obj) {
                objAaT7 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$3$1(auraNavigatorA0b);
                bfm.Ai0(objAaT7);
            }
            Function0 function02 = (Function0) objAaT7;
            boolean zA673 = bfm.A67(auraNavigatorA0b);
            Object objAaT8 = bfm.AaT();
            if (zA673 || objAaT8 == obj) {
                objAaT8 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$4$1(auraNavigatorA0b);
                bfm.Ai0(objAaT8);
            }
            Function0 function03 = (Function0) objAaT8;
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 32);
            Object objAaT9 = bfm.AaT();
            if (zA1Q || objAaT9 == obj) {
                objAaT9 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$5$1(g0u);
                bfm.Ai0(objAaT9);
            }
            Function0 function04 = (Function0) objAaT9;
            boolean zA674 = bfm.A67(auraNavigatorA0b);
            Object objAaT10 = bfm.AaT();
            if (zA674 || objAaT10 == obj) {
                objAaT10 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$6$1(auraNavigatorA0b);
                bfm.Ai0(objAaT10);
            }
            Function0 function05 = (Function0) objAaT10;
            boolean z = i4 == 32;
            Object objAaT11 = bfm.AaT();
            if (z || objAaT11 == obj) {
                objAaT11 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$7$1(g0u);
                bfm.Ai0(objAaT11);
            }
            Function0 function06 = (Function0) objAaT11;
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, AnonymousClass005.A1T(bfm, g0uRememberDismissToast, strA01, strA013, AnonymousClass003.A1M(bfm, c3ux, auraSubscriptionUsageViewModel)));
            Object objAaT12 = bfm.AaT();
            if (zA1T || objAaT12 == obj) {
                objAaT12 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1(c3ux, mutableState, auraSubscriptionUsageViewModel, g0uRememberDismissToast, strA01, strA013, auraNavigatorA0b);
                bfm.Ai0(objAaT12);
            }
            Function0 function07 = (Function0) objAaT12;
            boolean zA0A2 = MutableState.A0A(mutableState2);
            boolean zA675 = bfm.A67(auraSubscriptionUsageViewModel);
            Object objAaT13 = bfm.AaT();
            if (zA675 || objAaT13 == obj) {
                objAaT13 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$9$1(auraSubscriptionUsageViewModel);
                bfm.Ai0(objAaT13);
            }
            Function0<Unit> function0WithDebounce = ModifierExtKt.withDebounce(0L, (Function0) objAaT13, bfm, 0, zA1a ? 1 : 0);
            boolean zA676 = bfm.A67(auraNavigatorA0b);
            Object objAaT14 = bfm.AaT();
            if (zA676 || objAaT14 == obj) {
                objAaT14 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$10$1(auraNavigatorA0b);
                bfm.Ai0(objAaT14);
            }
            G0U g0u2 = (G0U) objAaT14;
            boolean zA677 = bfm.A67(auraSubscriptionUsageViewModel);
            Object objAaT15 = bfm.AaT();
            if (zA677 || objAaT15 == obj) {
                objAaT15 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$11$1(auraSubscriptionUsageViewModel);
                bfm.Ai0(objAaT15);
            }
            AuraSubscriptionUsageContent(uiState, subscriptionAttribution, function02, function03, function04, function05, function06, zA0A, function07, zA0A2, function0, function0WithDebounce, subscriptionAddOnIntegrationResolveIntegration, g0u2, (Function0) ((InterfaceC7353EnQ) objAaT15), bRg2, bfm, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, (iA0T << 9) & 458752, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass12(subscriptionAttribution, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraSubscriptionUsageContent(com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.UiState r71, com.facebook.aura.navigation.key.SubscriptionAttribution r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, boolean r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, boolean r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, kotlin.jvm.functions.Function0<kotlin.Unit> r82, com.facebook.aura.devices.intf.SubscriptionAddOnIntegration r83, X.G0U<? super com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction, kotlin.Unit> r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, X.BRg r86, X.BFM r87, int r88, int r89, int r90) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt.AuraSubscriptionUsageContent(com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState, com.facebook.aura.navigation.key.SubscriptionAttribution, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.devices.intf.SubscriptionAddOnIntegration, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void UsageActionCard(Integer num, String str, AuraCardType auraCardType, boolean z, Function0<Unit> function0, BRg bRg, String str2, BFM bfm, int i, int i2) {
        B1U b1uA00;
        String str3 = str2;
        BRg bRg2 = bRg;
        bfm.AgG(-593404835);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, num) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(auraCardType, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str3);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            ApQ apQ = null;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            if (num == null) {
                AnonymousClass003.A0l(bfm, -37691687);
                b1uA00 = null;
            } else {
                bfm.AgE(-37691686);
                b1uA00 = B1V.A00(bfm, new AuraSubscriptionUsageBottomSheetKt$UsageActionCard$1$1(num.intValue()), 776482423);
                AnonymousClass001.A1D(bfm);
            }
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            C0881AGi c0881AGi = C0881AGi.A00;
            ApQ apQ2 = new ApQ(str, c0881AGi);
            if (str3 != null) {
                apQ = new ApQ(str3, c0881AGi);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(apQ2, auraIconAndHeadlineStyle, (BO6) null, (B6A) null, apQ, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null), auraCardType, b1uA00, null, function0, null, null, null, z, false, null, null, 0L, false, null, null, bfm, (AuraCardType.$stable << 9) | ((iA0d << 3) & 7168) | (3670016 & (iA0d << 6)), (iA0d >> 9) & 14, 261024);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142013(num, str, auraCardType, z, function0, bRg2, str3, i, i2);
        }
    }

    public static final void UsageActionRow(Integer num, String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, String str3, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c142033;
        String str4 = str2;
        boolean z2 = z;
        String str5 = str3;
        BRg bRg2 = bRg;
        bfm.AgG(722148629);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, num) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
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
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str4);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z2);
            iA0d |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str5);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (i5 != 0) {
                z2 = false;
            }
            if (i6 != 0) {
                str5 = null;
            }
            if (!z2) {
                bfm.AgE(38884594);
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                int i7 = (iA0d & 14) | 3456 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                int i8 = iA0d << 6;
                UsageActionCard(num, str, chevronNavigation, true, function0, bRg2, str4, bfm, AnonymousClass004.A02(i8, i7) | (i8 & 3670016), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c142033 = new C142021(num, str, function0, bRg2, str4, z2, str5, i, i2);
                    bBbAAc.A06 = c142033;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 39125805);
            AuraCardDimensions auraCardDimensions = AnonymousClass002.A0d(bfm).cardSettings;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            long j = bbiA0M.A06;
            int i9 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i9);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            BS0 bs0 = BRg.A00;
            int i10 = iA0d << 6;
            UsageActionCard(num, str, none, false, function0, c1062ATq, str4, bfm, (i10 & 3670016) | AnonymousClass001.A0A(i10, 200064 | (iA0d & 14) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 0);
            BRg bRgA0D = C3U4.A0D(C3U4.A0D(c0z7.AQJ(bs0), auraCardDimensions.contentPadding), auraCardDimensions.trailingItemPadding);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0A, false);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA0D);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraSpinnerStyle auraSpinnerStyleSmall = AuraSpinnerStyle.Companion.small(bfm, 6);
            boolean zA1Q = AnonymousClass002.A1Q(iA0d & 3670016, 1048576);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionUsageBottomSheetKt$UsageActionRow$2$1$1$1(str5);
                bfm.Ai0(objAaT);
            }
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bs0, objAaT, false), auraSpinnerStyleSmall, 0L, bfm, AuraSpinnerStyle.$stable << 3, 4);
            AnonymousClass002.A0y(bbiA0M);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c142033 = new C142033(num, str, function0, bRg2, str4, z2, str5, i, i2);
            bBbAAc.A06 = c142033;
        }
    }

    public static final void UsageDisplay(AuraSubscriptionUsageViewModel.UiState uiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-923185602);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(uiState, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRg2, f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (uiState instanceof AuraSubscriptionUsageViewModel.UiState.Error) {
                bfm.AgE(-1018845158);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c7);
                C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                long jA08 = C06G.A08(bfm);
                BRg bRgA0B2 = C3U4.A0B(BRg.A00, 0.0f, f);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AuraSubscriptionUsageBottomSheetKt$UsageDisplay$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0B2, objAaT, false), jA08, c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else if (uiState instanceof AuraSubscriptionUsageViewModel.UiState.Loading) {
                bfm.AgE(-1018413576);
                AuraSubscriptionUsageMetersKt.UsageMeterRow(null, null, null, C3U4.A0C(BRg.A00, 0.0f, f, 0.0f, AuraDimensKt.SpacingSmall), null, bfm, 438, 16);
            } else {
                if (!(uiState instanceof AuraSubscriptionUsageViewModel.UiState.Loaded)) {
                    throw AnonymousClass003.A0k(bfm, bbi, 936963418);
                }
                bfm.AgE(-1018139381);
                AuraSubscriptionUsageViewModel.UiState.Loaded loaded = (AuraSubscriptionUsageViewModel.UiState.Loaded) uiState;
                AuraSubscriptionUsageMetersKt.UsageMeterRow(loaded.usageRowLabel, loaded.statusSubtitle, loaded.monthlyUsedPercent, C3U4.A0C(BRg.A00, 0.0f, f, 0.0f, AuraDimensKt.SpacingSmall), loaded.monthlyValueLabel, bfm, 0, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142062(uiState, bRg2, i, i2);
        }
    }

    public static final void UsageRowFooter(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1675397387);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A07(bRg2, AuraDimensKt.SpacingMedium), C06G.A09(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142071(str, bRg2, i, i2);
        }
    }

    public static final void UsageSettlingRow(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2075758145);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA0R, f, f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraSubscriptionUsageBottomSheetKt$UsageSettlingRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, AuraSpinnerStyle.Companion.small(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 5);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12109a), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142083(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String cancelDialogBody(java.lang.Long r5, X.BFM r6, int r7) {
        /*
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            r4 = 1
            r3 = 0
            if (r0 <= r2) goto Lf
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L14
        Lf:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Object r2 = r6.AaT()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L30
        L1f:
            java.lang.Long r0 = com.facebook.aura.subscription.view.SubscriptionDateFormatKt.epochSecondsToMillis(r5)
            if (r0 == 0) goto L55
            long r0 = r0.longValue()
            java.lang.String r2 = com.facebook.aura.subscription.view.SubscriptionDateFormatKt.formatShortDate(r0)
        L2d:
            r6.Ai0(r2)
        L30:
            if (r2 == 0) goto L47
            r0 = -454316451(0xffffffffe4ebae5d, float:-3.4780392E22)
            r6.AgE(r0)
            r1 = 2131890340(0x7f1210a4, float:1.941537E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
        L3d:
            r0[r3] = r2
            java.lang.String r0 = X.AbstractC2271BQs.A02(r6, r0, r1)
            X.AnonymousClass001.A1D(r6)
            return r0
        L47:
            r0 = -454214461(0xffffffffe4ed3cc3, float:-3.5010054E22)
            r6.AgE(r0)
            r1 = 2131890339(0x7f1210a3, float:1.9415367E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Muse"
            goto L3d
        L55:
            r2 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt.cancelDialogBody(java.lang.Long, X.BFM, int):java.lang.String");
    }

    public static final void logManagementClick(HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_MANAGEMENT, hatchComponent, null, map, null);
    }

    public static /* synthetic */ void logManagementClick$default(HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        logManagementClick(hatchComponent, map);
    }

    public static final void CancelSubscriptionDialog(SubscriptionCtaConfirmation subscriptionCtaConfirmation, Long l, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        String strA01;
        String strCancelDialogBody;
        String strA012;
        String strA013;
        bfm.AgG(819545218);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionCtaConfirmation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(map, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (subscriptionCtaConfirmation == null || (strA01 = subscriptionCtaConfirmation.title) == null) {
                bfm.AgE(1603950400);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210a6);
            } else {
                bfm.AgE(1603949687);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (subscriptionCtaConfirmation == null || (strCancelDialogBody = subscriptionCtaConfirmation.body) == null) {
                bfm.AgE(1603953515);
                strCancelDialogBody = cancelDialogBody(l, bfm, (iA05 >> 3) & 14);
            } else {
                bfm.AgE(1603952833);
            }
            BBI.A0R(bbi, false);
            if (subscriptionCtaConfirmation == null || (strA012 = subscriptionCtaConfirmation.confirmLabel) == null) {
                bfm.AgE(1603956702);
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210a5);
            } else {
                bfm.AgE(1603955772);
            }
            BBI.A0R(bbi, false);
            if (subscriptionCtaConfirmation == null || (strA013 = subscriptionCtaConfirmation.cancelLabel) == null) {
                bfm.AgE(1603960444);
                strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210a7);
            } else {
                bfm.AgE(1603959545);
            }
            BBI.A0R(bbi, false);
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.MONETIZATION, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.CANCEL_SUBSCRIPTION_DIALOG, HatchComponent.CANCEL_SUBSCRIPTION_DIALOG_SCREEN, null, map, null, 500L, 0.0f, null, null, null);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(strA012, map, function0, strA013, function02), 449460563);
            boolean z = ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(map))) | ((57344 & iA05) == 16384);
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionUsageBottomSheetKt$CancelSubscriptionDialog$2$1(map, function02);
                bfm.Ai0(objAaT);
            }
            AuraAlertDialogKt.AuraAlertDialog(bRgHatchImpression, strA01, strCancelDialogBody, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(subscriptionCtaConfirmation, l, map, function0, function02, i);
        }
    }

    public static final void PurchasedUsage(C07C c07c, Integer num, String str, String str2, String str3, Map<String, String> map, Function0<Unit> function0, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        bfm.AgG(-537271211);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, num);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, map, i, 262144) ? 1 : 0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            boolean zA1F = ((458752 & iA0d) == 131072 || ((iA0d & 262144) != 0 && bfm.A67(map))) | AnonymousClass003.A1F(3670016, iA0d, 1048576);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$onBuyClick$1$1(map, function0);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            if (num == null) {
                bfm.AgE(1496838285);
                if (str3 != null) {
                    bfm.AgE(1496867611);
                    boolean zA1R = AnonymousClass001.A1R(bfm, function02, (57344 & iA0d) == 16384);
                    Object objAaT2 = bfm.AaT();
                    if (zA1R || objAaT2 == C78N.A00) {
                        objAaT2 = new AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$1$1(str3, function02);
                        bfm.Ai0(objAaT2);
                    }
                    AnonymousClass007.A0p(c07c, bfm, objAaT2, iA0d);
                } else {
                    bfm.AgE(1497100173);
                }
                AnonymousClass006.A1M(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass2(c07c, num, str, str2, str3, map, function0, i);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            bfm.AgE(1497115053);
            AnonymousClass001.A1W(bfm);
            boolean zA1W = AnonymousClass002.A1W(bfm, function02, AnonymousClass004.A1K(iA0d) | AnonymousClass004.A1I(iA0d) | AnonymousClass004.A1M(iA0d), (57344 & iA0d) == 16384);
            Object objAaT3 = bfm.AaT();
            if (zA1W || objAaT3 == C78N.A00) {
                objAaT3 = new AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$3$1(str3, str, num, str2, function02);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass007.A0q(c07c, (G0U) objAaT3, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(c07c, num, str, str2, str3, map, function0, i);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    public static final void ResubscribeConfirmationDialog(Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-965583119);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(map, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            AuraAlertDialogKt.AuraAlertDialog(HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.MONETIZATION, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.RESUME_SUBSCRIPTION_DIALOG, HatchComponent.RESUME_SUBSCRIPTION_DIALOG_SCREEN, null, map, null, 500L, 0.0f, null, null, null), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210be), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210bc), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C141991(map, function0, function02), 1638401858), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA05 << 12), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142002(map, function0, function02, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void UsageActions(X.C07C r42, X.AHD<com.facebook.aura.subscription.repo.SubscriptionManagementCta> r43, java.lang.String r44, com.facebook.aura.subscription.model.UsageActionsSlot r45, java.util.Map<java.lang.String, java.lang.String> r46, boolean r47, boolean r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.G0U<? super com.facebook.aura.subscription.repo.SubscriptionManagementCta, kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, com.facebook.aura.devices.intf.SubscriptionAddOnIntegration r54, X.G0U<? super com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction, kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, X.BFM r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt.UsageActions(X.07C, X.AHD, java.lang.String, com.facebook.aura.subscription.model.UsageActionsSlot, java.util.Map, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, com.facebook.aura.devices.intf.SubscriptionAddOnIntegration, X.G0U, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void UsageSummary(X.C07C r17, com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.UiState r18, com.facebook.aura.subscription.repo.SubscriptionManagementCta r19, com.facebook.aura.subscription.model.SubscriptionMeterDestination r20, boolean r21, com.facebook.aura.subscription.model.UsageActionsSlot r22, boolean r23, java.util.Map<java.lang.String, java.lang.String> r24, boolean r25, boolean r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt.UsageSummary(X.07C, com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState, com.facebook.aura.subscription.repo.SubscriptionManagementCta, com.facebook.aura.subscription.model.SubscriptionMeterDestination, boolean, com.facebook.aura.subscription.model.UsageActionsSlot, boolean, java.util.Map, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final HatchComponent analyticsComponent(SubscriptionManagementAction subscriptionManagementAction) {
        switch (subscriptionManagementAction.ordinal()) {
            case 0:
            case 1:
            case 7:
            case 8:
            case 9:
            case 11:
                return HatchComponent.MANAGE_SUBSCRIPTION_LINK;
            case 2:
            case 3:
                return HatchComponent.BUY_MORE_CREDITS_ROW;
            case 4:
                return HatchComponent.BILLING_AND_PAYMENT_ROW;
            case 5:
                return HatchComponent.CANCEL_SUBSCRIPTION_BUTTON;
            case 6:
                return HatchComponent.RESUBSCRIBE_BUTTON;
            case 10:
                return HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_LINK;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Integer rowIconRes(SubscriptionManagementAction subscriptionManagementAction) {
        int i;
        switch (subscriptionManagementAction.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
            case 10:
            case 11:
                return null;
            case 4:
                i = R.drawable.wallet_outline_24_wght400;
                break;
            case 5:
                i = R.drawable.circle_x_wght400_outline_24;
                break;
            case 6:
            case 8:
                i = R.drawable.arrow_clockwise_wght400_outline_24;
                break;
            case 7:
                i = R.drawable.ic_link_out;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Integer.valueOf(i);
    }

    public static final String topUpCtaLabel(SubscriptionActions subscriptionActions, BFM bfm, int i) {
        bfm.AgE(-2129875056);
        String strA01 = null;
        if (subscriptionActions != null && subscriptionActions.canBuyTopUp) {
            SubscriptionManagementCta subscriptionManagementCta = subscriptionActions.topUpAction;
            if (subscriptionManagementCta == null || (strA01 = subscriptionManagementCta.label) == null) {
                bfm.AgE(1889476660);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c6);
            } else {
                bfm.AgE(1889475544);
            }
            AnonymousClass002.A19(bfm);
        }
        AnonymousClass002.A19(bfm);
        return strA01;
    }
}
