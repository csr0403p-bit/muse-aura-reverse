package com.facebook.aura.subscription.model;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0924AIa;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.BuyCreditsEntrySurface;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.repo.HatchSubscriptionStatus;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AuraSubscriptionUsageViewModelKt {
    public static final String DEVICE_INVOKE_PREFIX = "hatch://devices/invoke/";
    public static final String GOOGLE_PURCHASE_PLATFORM = "GOOGLE";
    public static final String SUBSCRIPTIONS_TOPUP_COMMAND = "subscriptions.topup";
    public static final String SUBSCRIPTIONS_UPGRADE_COMMAND = "subscriptions.upgrade";

    public static final AuraSubscriptionPage subscriptionOutOfCreditsPage(SubscriptionDetails subscriptionDetails, BuyCreditsEntrySurface buyCreditsEntrySurface) {
        C7384Etj.A0Y(buyCreditsEntrySurface, 1);
        return (subscriptionDetails == null || !AuraSubscriptionActionsKt.resolveSubscriptionActions(subscriptionDetails.managementActions, subscriptionDetails.isPaidTier, subscriptionDetails.topupEligible).canBuyTopUp) ? AuraSubscriptionPage.Paywall.INSTANCE : new AuraSubscriptionPage.BuyCredits(buyCreditsEntrySurface.getValue());
    }

    public static final Map<String, String> subscriptionAnalyticsMetadata(String str, HatchSubscriptionStatus hatchSubscriptionStatus) {
        C0924AIa c0924AIa = new C0924AIa();
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.SUBSCRIPTION_TIER_CODE, str, c0924AIa);
        }
        if (hatchSubscriptionStatus != null) {
            c0924AIa.put(HatchMetadataKey.SUBSCRIPTION_STATUS.getValue(), hatchSubscriptionStatus.getServerValue());
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
        if (c0924AIaA0K.isEmpty()) {
            return null;
        }
        return c0924AIaA0K;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.UiState toUiState(com.facebook.aura.subscription.repo.SubscriptionDetailsState r38, boolean r39, boolean r40, boolean r41) {
        /*
            r1 = r38
            boolean r0 = r1 instanceof com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success
            if (r0 == 0) goto La4
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success r1 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success) r1
            com.facebook.aura.subscription.repo.SubscriptionDetails r11 = r1.details
            com.facebook.aura.subscription.repo.SubscriptionManagementActions r2 = r11.managementActions
            boolean r1 = r11.isPaidTier
            boolean r0 = r11.topupEligible
            com.facebook.aura.subscription.model.SubscriptionActions r8 = com.facebook.aura.subscription.model.AuraSubscriptionActionsKt.resolveSubscriptionActions(r2, r1, r0)
            java.lang.Integer r0 = r11.monthlyUsedPercent
            r38 = r0
            java.lang.Long r0 = r11.currentPeriodEnd
            r18 = r0
            com.facebook.aura.subscription.repo.HatchSubscriptionStatus r0 = r11.subscriptionStatus
            r19 = r0
            java.lang.String r0 = r11.tierCode
            r20 = r0
            java.lang.Integer r0 = r11.purchasedUsedPercent
            r17 = r0
            java.lang.String r15 = r11.statusSubtitle
            java.lang.String r7 = r11.usageRowLabel
            if (r7 != 0) goto L3b
            java.lang.String r7 = r11.planName
            r1 = 0
            if (r7 == 0) goto La2
            if (r39 == 0) goto La2
            boolean r0 = X.C7BY.A0j(r7)
            if (r0 != 0) goto La2
        L3b:
            java.lang.String r14 = r11.usageRowValueLabel
            java.lang.String r13 = r11.usageRowFooter
            java.lang.String r9 = r11.topupRowLabel
            java.lang.String r6 = r11.topupRowValueLabel
            java.lang.String r5 = r11.billingSubtitle
            java.lang.String r4 = r11.entryPointCtaLabel
            boolean r3 = r11.isPaidTier
            boolean r2 = r11.isCrossPlatform
            java.lang.String r1 = r11.crossPlatformMessage
            com.facebook.aura.subscription.repo.SubscriptionCrossPlatformDialog r0 = r11.crossPlatformDialog
            java.lang.String r12 = r11.purchasePlatform
            java.lang.String r10 = "GOOGLE"
            if (r12 != 0) goto L9d
            r35 = 0
        L57:
            if (r39 != 0) goto L9a
            com.facebook.aura.subscription.repo.HatchSubscriptionStatus r11 = r11.subscriptionStatus
            com.facebook.aura.subscription.repo.HatchSubscriptionStatus r10 = com.facebook.aura.subscription.repo.HatchSubscriptionStatus.PROVISIONING
            if (r11 != r10) goto L93
            if (r40 == 0) goto L9a
        L61:
            com.facebook.aura.subscription.model.UsageActionsSlot r36 = com.facebook.aura.subscription.model.UsageActionsSlot.RETRY
        L63:
            if (r41 == 0) goto L6d
            com.facebook.aura.subscription.model.SubscriptionEntryPointDestination r11 = r8.entryPointDestination
            com.facebook.aura.subscription.model.SubscriptionEntryPointDestination r10 = com.facebook.aura.subscription.model.SubscriptionEntryPointDestination.REDEEM_COMPLIMENTARY
            r37 = 1
            if (r11 == r10) goto L6f
        L6d:
            r37 = 0
        L6f:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState$Loaded r16 = new com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState$Loaded
            r30 = r8
            r31 = r3
            r32 = r2
            r33 = r1
            r34 = r0
            r24 = r14
            r25 = r13
            r26 = r9
            r27 = r6
            r28 = r5
            r29 = r4
            r21 = r17
            r22 = r15
            r23 = r7
            r17 = r38
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r16
        L93:
            boolean r10 = r8.needsRetry
            if (r10 != 0) goto L61
            com.facebook.aura.subscription.model.UsageActionsSlot r36 = com.facebook.aura.subscription.model.UsageActionsSlot.ROWS
            goto L63
        L9a:
            com.facebook.aura.subscription.model.UsageActionsSlot r36 = com.facebook.aura.subscription.model.UsageActionsSlot.SETTLING
            goto L63
        L9d:
            boolean r35 = r12.equalsIgnoreCase(r10)
            goto L57
        La2:
            r7 = r1
            goto L3b
        La4:
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Failed r0 = com.facebook.aura.subscription.repo.SubscriptionDetailsState.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lb1
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState$Error r16 = com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.UiState.Error.INSTANCE
        Lae:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState r16 = (com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.UiState) r16
            return r16
        Lb1:
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Unresolved r0 = com.facebook.aura.subscription.repo.SubscriptionDetailsState.Unresolved.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lbc
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState$Loading r16 = com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.UiState.Loading.INSTANCE
            goto Lae
        Lbc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt.toUiState(com.facebook.aura.subscription.repo.SubscriptionDetailsState, boolean, boolean, boolean):com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$UiState");
    }

    public static final AuraSubscriptionPage subscriptionPageForCommand(String str, BuyCreditsEntrySurface buyCreditsEntrySurface) {
        AuraSubscriptionPage buyCredits;
        AnonymousClass003.A0u(str, buyCreditsEntrySurface);
        if (str.equals(SUBSCRIPTIONS_UPGRADE_COMMAND)) {
            buyCredits = AuraSubscriptionPage.Paywall.INSTANCE;
        } else {
            if (!str.equals(SUBSCRIPTIONS_TOPUP_COMMAND)) {
                return null;
            }
            buyCredits = new AuraSubscriptionPage.BuyCredits(buyCreditsEntrySurface.getValue());
        }
        return buyCredits;
    }

    public static final AuraSubscriptionPage subscriptionPageForCtaUrl(String str, BuyCreditsEntrySurface buyCreditsEntrySurface) {
        AnonymousClass003.A0u(str, buyCreditsEntrySurface);
        return subscriptionPageForCommand(C7BY.A0K("hatch://devices/invoke/", C7BY.A0S(str, str, '?')), buyCreditsEntrySurface);
    }

    public static final Map<String, String> subscriptionAnalyticsMetadata(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        C7384Etj.A0Y(subscriptionDetailsState, 0);
        if (!(subscriptionDetailsState instanceof SubscriptionDetailsState.Success) || (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) == null) {
            return null;
        }
        SubscriptionDetails subscriptionDetails = success.details;
        return subscriptionAnalyticsMetadata(subscriptionDetails.tierCode, subscriptionDetails.subscriptionStatus);
    }

    public static final Map<String, String> subscriptionAnalyticsMetadata(AuraSubscriptionUsageViewModel.UiState uiState) {
        AuraSubscriptionUsageViewModel.UiState.Loaded loaded;
        C7384Etj.A0Y(uiState, 0);
        if (!(uiState instanceof AuraSubscriptionUsageViewModel.UiState.Loaded) || (loaded = (AuraSubscriptionUsageViewModel.UiState.Loaded) uiState) == null) {
            return null;
        }
        return subscriptionAnalyticsMetadata(loaded.tierCode, loaded.status);
    }
}
