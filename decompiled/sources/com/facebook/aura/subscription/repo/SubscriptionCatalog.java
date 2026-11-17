package com.facebook.aura.subscription.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionCatalog extends C06G {
    public static final int $stable = 0;
    public final SubscriptionBlockedActionDialog blockedActionDialog;
    public final AHD<SubscriptionCheckoutAddOn> checkoutAddOns;
    public final SubscriptionNameDialog nameDialog;
    public final boolean planChangeBlocked;
    public final AHD<SubscriptionProduct> plans;
    public final String purchaseCtaLabel;
    public final Disclaimer purchaseDisclaimer;
    public final Disclaimer purchaseNotice;
    public final boolean requiresName;
    public final String suggestedTierId;

    public final SubscriptionCatalog copy(AHD<SubscriptionProduct> ahd, String str, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, boolean z2, SubscriptionNameDialog subscriptionNameDialog, String str2, AHD<SubscriptionCheckoutAddOn> ahd2) {
        AnonymousClass002.A1F(ahd, 0, ahd2);
        return new SubscriptionCatalog(ahd, str, disclaimer, disclaimer2, z, subscriptionBlockedActionDialog, z2, subscriptionNameDialog, str2, ahd2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionCatalog) {
                SubscriptionCatalog subscriptionCatalog = (SubscriptionCatalog) obj;
                if (!C7384Etj.areEqual(this.plans, subscriptionCatalog.plans) || !C7384Etj.areEqual(this.suggestedTierId, subscriptionCatalog.suggestedTierId) || !C7384Etj.areEqual(this.purchaseDisclaimer, subscriptionCatalog.purchaseDisclaimer) || !C7384Etj.areEqual(this.purchaseNotice, subscriptionCatalog.purchaseNotice) || this.planChangeBlocked != subscriptionCatalog.planChangeBlocked || !C7384Etj.areEqual(this.blockedActionDialog, subscriptionCatalog.blockedActionDialog) || this.requiresName != subscriptionCatalog.requiresName || !C7384Etj.areEqual(this.nameDialog, subscriptionCatalog.nameDialog) || !C7384Etj.areEqual(this.purchaseCtaLabel, subscriptionCatalog.purchaseCtaLabel) || !C7384Etj.areEqual(this.checkoutAddOns, subscriptionCatalog.checkoutAddOns)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SubscriptionCatalog(AHD ahd, String str, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, boolean z2, SubscriptionNameDialog subscriptionNameDialog, String str2, AHD ahd2, int i, C06H c06h) {
        this(ahd, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : disclaimer, (i & 8) != 0 ? null : disclaimer2, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : subscriptionBlockedActionDialog, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : subscriptionNameDialog, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? AHI.A01 : ahd2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionCatalog copy$default(SubscriptionCatalog subscriptionCatalog, AHD ahd, String str, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, boolean z2, SubscriptionNameDialog subscriptionNameDialog, String str2, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = subscriptionCatalog.plans;
        }
        if ((i & 2) != 0) {
            str = subscriptionCatalog.suggestedTierId;
        }
        if ((i & 4) != 0) {
            disclaimer = subscriptionCatalog.purchaseDisclaimer;
        }
        if ((i & 8) != 0) {
            disclaimer2 = subscriptionCatalog.purchaseNotice;
        }
        if ((i & 16) != 0) {
            z = subscriptionCatalog.planChangeBlocked;
        }
        if ((i & 32) != 0) {
            subscriptionBlockedActionDialog = subscriptionCatalog.blockedActionDialog;
        }
        if ((i & 64) != 0) {
            z2 = subscriptionCatalog.requiresName;
        }
        if ((i & 128) != 0) {
            subscriptionNameDialog = subscriptionCatalog.nameDialog;
        }
        if ((i & 256) != 0) {
            str2 = subscriptionCatalog.purchaseCtaLabel;
        }
        if ((i & 512) != 0) {
            ahd2 = subscriptionCatalog.checkoutAddOns;
        }
        return subscriptionCatalog.copy(ahd, str, disclaimer, disclaimer2, z, subscriptionBlockedActionDialog, z2, subscriptionNameDialog, str2, ahd2);
    }

    public final AHD<SubscriptionProduct> component1() {
        return this.plans;
    }

    public final AHD<SubscriptionCheckoutAddOn> component10() {
        return this.checkoutAddOns;
    }

    public final String component2() {
        return this.suggestedTierId;
    }

    public final Disclaimer component3() {
        return this.purchaseDisclaimer;
    }

    public final Disclaimer component4() {
        return this.purchaseNotice;
    }

    public final boolean component5() {
        return this.planChangeBlocked;
    }

    public final SubscriptionBlockedActionDialog component6() {
        return this.blockedActionDialog;
    }

    public final boolean component7() {
        return this.requiresName;
    }

    public final SubscriptionNameDialog component8() {
        return this.nameDialog;
    }

    public final String component9() {
        return this.purchaseCtaLabel;
    }

    public final SubscriptionBlockedActionDialog getBlockedActionDialog() {
        return this.blockedActionDialog;
    }

    public final AHD<SubscriptionCheckoutAddOn> getCheckoutAddOns() {
        return this.checkoutAddOns;
    }

    public final SubscriptionNameDialog getNameDialog() {
        return this.nameDialog;
    }

    public final boolean getPlanChangeBlocked() {
        return this.planChangeBlocked;
    }

    public final AHD<SubscriptionProduct> getPlans() {
        return this.plans;
    }

    public final String getPurchaseCtaLabel() {
        return this.purchaseCtaLabel;
    }

    public final Disclaimer getPurchaseDisclaimer() {
        return this.purchaseDisclaimer;
    }

    public final Disclaimer getPurchaseNotice() {
        return this.purchaseNotice;
    }

    public final boolean getRequiresName() {
        return this.requiresName;
    }

    public final String getSuggestedTierId() {
        return this.suggestedTierId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.checkoutAddOns, (((C0KA.A01((C0KA.A01((((((AnonymousClass005.A0E(this.plans) + AnonymousClass006.A0G(this.suggestedTierId)) * 31) + AnonymousClass006.A0D(this.purchaseDisclaimer)) * 31) + AnonymousClass006.A0D(this.purchaseNotice)) * 31, this.planChangeBlocked) + AnonymousClass006.A0D(this.blockedActionDialog)) * 31, this.requiresName) + AnonymousClass006.A0D(this.nameDialog)) * 31) + AnonymousClass005.A0H(this.purchaseCtaLabel)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public SubscriptionCatalog(AHD<SubscriptionProduct> ahd, String str, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, boolean z2, SubscriptionNameDialog subscriptionNameDialog, String str2, AHD<SubscriptionCheckoutAddOn> ahd2) {
        AnonymousClass002.A1F(ahd, 0, ahd2);
        this.plans = ahd;
        this.suggestedTierId = str;
        this.purchaseDisclaimer = disclaimer;
        this.purchaseNotice = disclaimer2;
        this.planChangeBlocked = z;
        this.blockedActionDialog = subscriptionBlockedActionDialog;
        this.requiresName = z2;
        this.nameDialog = subscriptionNameDialog;
        this.purchaseCtaLabel = str2;
        this.checkoutAddOns = ahd2;
    }
}
