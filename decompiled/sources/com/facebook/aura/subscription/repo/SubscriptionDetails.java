package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes.dex */
public final class SubscriptionDetails extends C06G {
    public static final int $stable = 0;
    public final String billingSubtitle;
    public final Long cancelAt;
    public final boolean cancelAtPeriodEnd;
    public final String catalogItemId;
    public final ComplimentaryRedeemPage complimentaryRedeemPage;
    public final SubscriptionCrossPlatformDialog crossPlatformDialog;
    public final String crossPlatformMessage;
    public final Long currentPeriodEnd;
    public final Long currentPeriodStart;
    public final Long endedAt;
    public final String entryPointCtaLabel;
    public final String id;
    public final boolean isComplimentary;
    public final boolean isCrossPlatform;
    public final boolean isNewSubscriptionBlocked;
    public final boolean isOutOfCredits;
    public final boolean isPaidTier;
    public final SubscriptionManagementActions managementActions;
    public final Integer monthlyUsedPercent;
    public final String ownerId;
    public final Long pendingDowngradeEffectiveAt;
    public final String pendingDowngradeTargetPlanName;
    public final String planName;
    public final CurrencyAmount price;
    public final String purchasePlatform;
    public final Integer purchasedUsedPercent;
    public final Long startedAt;
    public final String statusSubtitle;
    public final HatchSubscriptionStatus subscriptionStatus;
    public final String tierCode;
    public final String tierId;
    public final long topupBalance;
    public final boolean topupEligible;
    public final String topupRowLabel;
    public final String topupRowValueLabel;
    public final String usageRowFooter;
    public final String usageRowLabel;
    public final String usageRowValueLabel;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionDetails) {
                SubscriptionDetails subscriptionDetails = (SubscriptionDetails) obj;
                if (!C7384Etj.areEqual(this.id, subscriptionDetails.id) || !C7384Etj.areEqual(this.ownerId, subscriptionDetails.ownerId) || !C7384Etj.areEqual(this.catalogItemId, subscriptionDetails.catalogItemId) || this.subscriptionStatus != subscriptionDetails.subscriptionStatus || !C7384Etj.areEqual(this.planName, subscriptionDetails.planName) || !C7384Etj.areEqual(this.tierId, subscriptionDetails.tierId) || !C7384Etj.areEqual(this.tierCode, subscriptionDetails.tierCode) || this.isPaidTier != subscriptionDetails.isPaidTier || this.isComplimentary != subscriptionDetails.isComplimentary || this.isCrossPlatform != subscriptionDetails.isCrossPlatform || !C7384Etj.areEqual(this.crossPlatformMessage, subscriptionDetails.crossPlatformMessage) || !C7384Etj.areEqual(this.crossPlatformDialog, subscriptionDetails.crossPlatformDialog) || !C7384Etj.areEqual(this.monthlyUsedPercent, subscriptionDetails.monthlyUsedPercent) || this.isOutOfCredits != subscriptionDetails.isOutOfCredits || !C7384Etj.areEqual(this.purchasedUsedPercent, subscriptionDetails.purchasedUsedPercent) || !C7384Etj.areEqual(this.statusSubtitle, subscriptionDetails.statusSubtitle) || !C7384Etj.areEqual(this.usageRowLabel, subscriptionDetails.usageRowLabel) || !C7384Etj.areEqual(this.usageRowValueLabel, subscriptionDetails.usageRowValueLabel) || !C7384Etj.areEqual(this.usageRowFooter, subscriptionDetails.usageRowFooter) || !C7384Etj.areEqual(this.topupRowLabel, subscriptionDetails.topupRowLabel) || !C7384Etj.areEqual(this.topupRowValueLabel, subscriptionDetails.topupRowValueLabel) || this.topupBalance != subscriptionDetails.topupBalance || this.topupEligible != subscriptionDetails.topupEligible || this.isNewSubscriptionBlocked != subscriptionDetails.isNewSubscriptionBlocked || !C7384Etj.areEqual(this.billingSubtitle, subscriptionDetails.billingSubtitle) || !C7384Etj.areEqual(this.entryPointCtaLabel, subscriptionDetails.entryPointCtaLabel) || !C7384Etj.areEqual(this.complimentaryRedeemPage, subscriptionDetails.complimentaryRedeemPage) || !C7384Etj.areEqual(this.managementActions, subscriptionDetails.managementActions) || !C7384Etj.areEqual(this.currentPeriodStart, subscriptionDetails.currentPeriodStart) || !C7384Etj.areEqual(this.currentPeriodEnd, subscriptionDetails.currentPeriodEnd) || this.cancelAtPeriodEnd != subscriptionDetails.cancelAtPeriodEnd || !C7384Etj.areEqual(this.cancelAt, subscriptionDetails.cancelAt) || !C7384Etj.areEqual(this.startedAt, subscriptionDetails.startedAt) || !C7384Etj.areEqual(this.endedAt, subscriptionDetails.endedAt) || !C7384Etj.areEqual(this.pendingDowngradeTargetPlanName, subscriptionDetails.pendingDowngradeTargetPlanName) || !C7384Etj.areEqual(this.pendingDowngradeEffectiveAt, subscriptionDetails.pendingDowngradeEffectiveAt) || !C7384Etj.areEqual(this.purchasePlatform, subscriptionDetails.purchasePlatform) || !C7384Etj.areEqual(this.price, subscriptionDetails.price)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isCrossPlatform;
    }

    public final String component11() {
        return this.crossPlatformMessage;
    }

    public final SubscriptionCrossPlatformDialog component12() {
        return this.crossPlatformDialog;
    }

    public final Integer component13() {
        return this.monthlyUsedPercent;
    }

    public final boolean component14() {
        return this.isOutOfCredits;
    }

    public final Integer component15() {
        return this.purchasedUsedPercent;
    }

    public final String component16() {
        return this.statusSubtitle;
    }

    public final String component17() {
        return this.usageRowLabel;
    }

    public final String component18() {
        return this.usageRowValueLabel;
    }

    public final String component19() {
        return this.usageRowFooter;
    }

    public final String component2() {
        return this.ownerId;
    }

    public final String component20() {
        return this.topupRowLabel;
    }

    public final String component21() {
        return this.topupRowValueLabel;
    }

    public final long component22() {
        return this.topupBalance;
    }

    public final boolean component23() {
        return this.topupEligible;
    }

    public final boolean component24() {
        return this.isNewSubscriptionBlocked;
    }

    public final String component25() {
        return this.billingSubtitle;
    }

    public final String component26() {
        return this.entryPointCtaLabel;
    }

    public final ComplimentaryRedeemPage component27() {
        return this.complimentaryRedeemPage;
    }

    public final SubscriptionManagementActions component28() {
        return this.managementActions;
    }

    public final Long component29() {
        return this.currentPeriodStart;
    }

    public final String component3() {
        return this.catalogItemId;
    }

    public final Long component30() {
        return this.currentPeriodEnd;
    }

    public final boolean component31() {
        return this.cancelAtPeriodEnd;
    }

    public final Long component32() {
        return this.cancelAt;
    }

    public final Long component33() {
        return this.startedAt;
    }

    public final Long component34() {
        return this.endedAt;
    }

    public final String component35() {
        return this.pendingDowngradeTargetPlanName;
    }

    public final Long component36() {
        return this.pendingDowngradeEffectiveAt;
    }

    public final String component37() {
        return this.purchasePlatform;
    }

    public final CurrencyAmount component38() {
        return this.price;
    }

    public final HatchSubscriptionStatus component4() {
        return this.subscriptionStatus;
    }

    public final String component5() {
        return this.planName;
    }

    public final String component6() {
        return this.tierId;
    }

    public final String component7() {
        return this.tierCode;
    }

    public final boolean component8() {
        return this.isPaidTier;
    }

    public final boolean component9() {
        return this.isComplimentary;
    }

    public final String getBillingSubtitle() {
        return this.billingSubtitle;
    }

    public final Long getCancelAt() {
        return this.cancelAt;
    }

    public final boolean getCancelAtPeriodEnd() {
        return this.cancelAtPeriodEnd;
    }

    public final String getCatalogItemId() {
        return this.catalogItemId;
    }

    public final ComplimentaryRedeemPage getComplimentaryRedeemPage() {
        return this.complimentaryRedeemPage;
    }

    public final SubscriptionCrossPlatformDialog getCrossPlatformDialog() {
        return this.crossPlatformDialog;
    }

    public final String getCrossPlatformMessage() {
        return this.crossPlatformMessage;
    }

    public final Long getCurrentPeriodEnd() {
        return this.currentPeriodEnd;
    }

    public final Long getCurrentPeriodStart() {
        return this.currentPeriodStart;
    }

    public final Long getEndedAt() {
        return this.endedAt;
    }

    public final String getEntryPointCtaLabel() {
        return this.entryPointCtaLabel;
    }

    public final String getId() {
        return this.id;
    }

    public final SubscriptionManagementActions getManagementActions() {
        return this.managementActions;
    }

    public final Integer getMonthlyUsedPercent() {
        return this.monthlyUsedPercent;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final Long getPendingDowngradeEffectiveAt() {
        return this.pendingDowngradeEffectiveAt;
    }

    public final String getPendingDowngradeTargetPlanName() {
        return this.pendingDowngradeTargetPlanName;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final CurrencyAmount getPrice() {
        return this.price;
    }

    public final String getPurchasePlatform() {
        return this.purchasePlatform;
    }

    public final Integer getPurchasedUsedPercent() {
        return this.purchasedUsedPercent;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    public final HatchSubscriptionStatus getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public final String getTierCode() {
        return this.tierCode;
    }

    public final String getTierId() {
        return this.tierId;
    }

    public final long getTopupBalance() {
        return this.topupBalance;
    }

    public final boolean getTopupEligible() {
        return this.topupEligible;
    }

    public final String getTopupRowLabel() {
        return this.topupRowLabel;
    }

    public final String getTopupRowValueLabel() {
        return this.topupRowValueLabel;
    }

    public final String getUsageRowFooter() {
        return this.usageRowFooter;
    }

    public final String getUsageRowLabel() {
        return this.usageRowLabel;
    }

    public final String getUsageRowValueLabel() {
        return this.usageRowValueLabel;
    }

    public int hashCode() {
        return ((((((((((((C0KA.A01((((((((((((C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.topupBalance, (((((((((((((C0KA.A01((((((C0KA.A01(C0KA.A01(C0KA.A01((((((((AnonymousClass005.A0I(this.catalogItemId, AnonymousClass005.A0I(this.ownerId, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0D(this.subscriptionStatus)) * 31) + AnonymousClass006.A0G(this.planName)) * 31) + AnonymousClass006.A0G(this.tierId)) * 31) + AnonymousClass006.A0G(this.tierCode)) * 31, this.isPaidTier), this.isComplimentary), this.isCrossPlatform) + AnonymousClass006.A0G(this.crossPlatformMessage)) * 31) + AnonymousClass006.A0D(this.crossPlatformDialog)) * 31) + AnonymousClass006.A0D(this.monthlyUsedPercent)) * 31, this.isOutOfCredits) + AnonymousClass006.A0D(this.purchasedUsedPercent)) * 31) + AnonymousClass006.A0G(this.statusSubtitle)) * 31) + AnonymousClass006.A0G(this.usageRowLabel)) * 31) + AnonymousClass006.A0G(this.usageRowValueLabel)) * 31) + AnonymousClass006.A0G(this.usageRowFooter)) * 31) + AnonymousClass006.A0G(this.topupRowLabel)) * 31) + AnonymousClass006.A0G(this.topupRowValueLabel)) * 31), this.topupEligible), this.isNewSubscriptionBlocked) + AnonymousClass006.A0G(this.billingSubtitle)) * 31) + AnonymousClass006.A0G(this.entryPointCtaLabel)) * 31) + AnonymousClass006.A0D(this.complimentaryRedeemPage)) * 31) + AnonymousClass006.A0D(this.managementActions)) * 31) + AnonymousClass006.A0D(this.currentPeriodStart)) * 31) + AnonymousClass006.A0D(this.currentPeriodEnd)) * 31, this.cancelAtPeriodEnd) + AnonymousClass006.A0D(this.cancelAt)) * 31) + AnonymousClass006.A0D(this.startedAt)) * 31) + AnonymousClass006.A0D(this.endedAt)) * 31) + AnonymousClass006.A0G(this.pendingDowngradeTargetPlanName)) * 31) + AnonymousClass006.A0D(this.pendingDowngradeEffectiveAt)) * 31) + AnonymousClass006.A0G(this.purchasePlatform)) * 31) + C06G.A04(this.price);
    }

    public final boolean isComplimentary() {
        return this.isComplimentary;
    }

    public final boolean isCrossPlatform() {
        return this.isCrossPlatform;
    }

    public final boolean isNewSubscriptionBlocked() {
        return this.isNewSubscriptionBlocked;
    }

    public final boolean isOutOfCredits() {
        return this.isOutOfCredits;
    }

    public final boolean isPaidTier() {
        return this.isPaidTier;
    }

    public String toString() {
        return super.toString();
    }

    public final SubscriptionDetails copy(String str, String str2, String str3, HatchSubscriptionStatus hatchSubscriptionStatus, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, Integer num, boolean z4, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13, long j, boolean z5, boolean z6, String str14, String str15, ComplimentaryRedeemPage complimentaryRedeemPage, SubscriptionManagementActions subscriptionManagementActions, Long l, Long l2, boolean z7, Long l3, Long l4, Long l5, String str16, Long l6, String str17, CurrencyAmount currencyAmount) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SubscriptionDetails(str, str2, str3, hatchSubscriptionStatus, str4, str5, str6, z, z2, z3, str7, subscriptionCrossPlatformDialog, num, z4, num2, str8, str9, str10, str11, str12, str13, j, z5, z6, str14, str15, complimentaryRedeemPage, subscriptionManagementActions, l, l2, z7, l3, l4, l5, str16, l6, str17, currencyAmount);
    }

    public SubscriptionDetails(String str, String str2, String str3, HatchSubscriptionStatus hatchSubscriptionStatus, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, Integer num, boolean z4, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13, long j, boolean z5, boolean z6, String str14, String str15, ComplimentaryRedeemPage complimentaryRedeemPage, SubscriptionManagementActions subscriptionManagementActions, Long l, Long l2, boolean z7, Long l3, Long l4, Long l5, String str16, Long l6, String str17, CurrencyAmount currencyAmount) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.ownerId = str2;
        this.catalogItemId = str3;
        this.subscriptionStatus = hatchSubscriptionStatus;
        this.planName = str4;
        this.tierId = str5;
        this.tierCode = str6;
        this.isPaidTier = z;
        this.isComplimentary = z2;
        this.isCrossPlatform = z3;
        this.crossPlatformMessage = str7;
        this.crossPlatformDialog = subscriptionCrossPlatformDialog;
        this.monthlyUsedPercent = num;
        this.isOutOfCredits = z4;
        this.purchasedUsedPercent = num2;
        this.statusSubtitle = str8;
        this.usageRowLabel = str9;
        this.usageRowValueLabel = str10;
        this.usageRowFooter = str11;
        this.topupRowLabel = str12;
        this.topupRowValueLabel = str13;
        this.topupBalance = j;
        this.topupEligible = z5;
        this.isNewSubscriptionBlocked = z6;
        this.billingSubtitle = str14;
        this.entryPointCtaLabel = str15;
        this.complimentaryRedeemPage = complimentaryRedeemPage;
        this.managementActions = subscriptionManagementActions;
        this.currentPeriodStart = l;
        this.currentPeriodEnd = l2;
        this.cancelAtPeriodEnd = z7;
        this.cancelAt = l3;
        this.startedAt = l4;
        this.endedAt = l5;
        this.pendingDowngradeTargetPlanName = str16;
        this.pendingDowngradeEffectiveAt = l6;
        this.purchasePlatform = str17;
        this.price = currencyAmount;
    }

    public static /* synthetic */ SubscriptionDetails copy$default(SubscriptionDetails subscriptionDetails, String str, String str2, String str3, HatchSubscriptionStatus hatchSubscriptionStatus, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, Integer num, boolean z4, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13, long j, boolean z5, boolean z6, String str14, String str15, ComplimentaryRedeemPage complimentaryRedeemPage, SubscriptionManagementActions subscriptionManagementActions, Long l, Long l2, boolean z7, Long l3, Long l4, Long l5, String str16, Long l6, String str17, CurrencyAmount currencyAmount, int i, int i2, Object obj) {
        String str18 = str2;
        String str19 = str3;
        HatchSubscriptionStatus hatchSubscriptionStatus2 = hatchSubscriptionStatus;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        String str23 = str7;
        SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog2 = subscriptionCrossPlatformDialog;
        Integer num3 = num;
        boolean z11 = z4;
        String str24 = str8;
        String str25 = str10;
        String str26 = str11;
        String str27 = str12;
        String str28 = str13;
        long j2 = j;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        Long l7 = l4;
        Long l8 = l5;
        String str29 = str16;
        Long l9 = l6;
        String str30 = str17;
        String str31 = str;
        Integer num4 = num2;
        String str32 = str9;
        String str33 = str14;
        String str34 = str15;
        ComplimentaryRedeemPage complimentaryRedeemPage2 = complimentaryRedeemPage;
        SubscriptionManagementActions subscriptionManagementActions2 = subscriptionManagementActions;
        Long l10 = l;
        Long l11 = l2;
        Long l12 = l3;
        CurrencyAmount currencyAmount2 = currencyAmount;
        if ((i & 1) != 0) {
            str31 = subscriptionDetails.id;
        }
        if ((i & 2) != 0) {
            str18 = subscriptionDetails.ownerId;
        }
        if ((i & 4) != 0) {
            str19 = subscriptionDetails.catalogItemId;
        }
        if ((i & 8) != 0) {
            hatchSubscriptionStatus2 = subscriptionDetails.subscriptionStatus;
        }
        if ((i & 16) != 0) {
            str20 = subscriptionDetails.planName;
        }
        if ((i & 32) != 0) {
            str21 = subscriptionDetails.tierId;
        }
        if ((i & 64) != 0) {
            str22 = subscriptionDetails.tierCode;
        }
        if ((i & 128) != 0) {
            z8 = subscriptionDetails.isPaidTier;
        }
        if ((i & 256) != 0) {
            z9 = subscriptionDetails.isComplimentary;
        }
        if ((i & 512) != 0) {
            z10 = subscriptionDetails.isCrossPlatform;
        }
        if ((i & 1024) != 0) {
            str23 = subscriptionDetails.crossPlatformMessage;
        }
        if ((i & 2048) != 0) {
            subscriptionCrossPlatformDialog2 = subscriptionDetails.crossPlatformDialog;
        }
        if ((i & 4096) != 0) {
            num3 = subscriptionDetails.monthlyUsedPercent;
        }
        if ((i & 8192) != 0) {
            z11 = subscriptionDetails.isOutOfCredits;
        }
        if ((i & 16384) != 0) {
            num4 = subscriptionDetails.purchasedUsedPercent;
        }
        if ((i & 32768) != 0) {
            str24 = subscriptionDetails.statusSubtitle;
        }
        if ((i & 65536) != 0) {
            str32 = subscriptionDetails.usageRowLabel;
        }
        if ((i & 131072) != 0) {
            str25 = subscriptionDetails.usageRowValueLabel;
        }
        if ((i & 262144) != 0) {
            str26 = subscriptionDetails.usageRowFooter;
        }
        if ((i & 524288) != 0) {
            str27 = subscriptionDetails.topupRowLabel;
        }
        if ((i & 1048576) != 0) {
            str28 = subscriptionDetails.topupRowValueLabel;
        }
        if ((i & 2097152) != 0) {
            j2 = subscriptionDetails.topupBalance;
        }
        if ((i & 4194304) != 0) {
            z12 = subscriptionDetails.topupEligible;
        }
        if ((i & 8388608) != 0) {
            z13 = subscriptionDetails.isNewSubscriptionBlocked;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str33 = subscriptionDetails.billingSubtitle;
        }
        if ((i & 33554432) != 0) {
            str34 = subscriptionDetails.entryPointCtaLabel;
        }
        if ((i & 67108864) != 0) {
            complimentaryRedeemPage2 = subscriptionDetails.complimentaryRedeemPage;
        }
        if ((i & 134217728) != 0) {
            subscriptionManagementActions2 = subscriptionDetails.managementActions;
        }
        if ((i & 268435456) != 0) {
            l10 = subscriptionDetails.currentPeriodStart;
        }
        if ((i & 536870912) != 0) {
            l11 = subscriptionDetails.currentPeriodEnd;
        }
        if ((i & 1073741824) != 0) {
            z14 = subscriptionDetails.cancelAtPeriodEnd;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            l12 = subscriptionDetails.cancelAt;
        }
        if ((i2 & 1) != 0) {
            l7 = subscriptionDetails.startedAt;
        }
        if ((i2 & 2) != 0) {
            l8 = subscriptionDetails.endedAt;
        }
        if ((i2 & 4) != 0) {
            str29 = subscriptionDetails.pendingDowngradeTargetPlanName;
        }
        if ((i2 & 8) != 0) {
            l9 = subscriptionDetails.pendingDowngradeEffectiveAt;
        }
        if ((i2 & 16) != 0) {
            str30 = subscriptionDetails.purchasePlatform;
        }
        if ((i2 & 32) != 0) {
            currencyAmount2 = subscriptionDetails.price;
        }
        AnonymousClass005.A0x(str31, str18, str19);
        return new SubscriptionDetails(str31, str18, str19, hatchSubscriptionStatus2, str20, str21, str22, z8, z9, z10, str23, subscriptionCrossPlatformDialog2, num3, z11, num4, str24, str32, str25, str26, str27, str28, j2, z12, z13, str33, str34, complimentaryRedeemPage2, subscriptionManagementActions2, l10, l11, z14, l12, l7, l8, str29, l9, str30, currencyAmount2);
    }
}
