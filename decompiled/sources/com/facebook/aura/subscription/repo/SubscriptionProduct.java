package com.facebook.aura.subscription.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionProduct extends C06G {
    public static final int $stable = 0;
    public final AHD<String> benefits;
    public final SubscriptionBillingInterval billingInterval;
    public final Integer billingIntervalCount;
    public final SubscriptionChangeDirection changeDirection;
    public final boolean isCurrent;
    public final String productId;
    public final Disclaimer purchaseDisclaimer;
    public final int rank;
    public final Long selectedTier;
    public final String tierCode;
    public final String tierName;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionProduct) {
                SubscriptionProduct subscriptionProduct = (SubscriptionProduct) obj;
                if (!C7384Etj.areEqual(this.productId, subscriptionProduct.productId) || !C7384Etj.areEqual(this.tierName, subscriptionProduct.tierName) || !C7384Etj.areEqual(this.tierCode, subscriptionProduct.tierCode) || !C7384Etj.areEqual(this.selectedTier, subscriptionProduct.selectedTier) || !C7384Etj.areEqual(this.benefits, subscriptionProduct.benefits) || this.rank != subscriptionProduct.rank || this.isCurrent != subscriptionProduct.isCurrent || this.changeDirection != subscriptionProduct.changeDirection || !C7384Etj.areEqual(this.purchaseDisclaimer, subscriptionProduct.purchaseDisclaimer) || this.billingInterval != subscriptionProduct.billingInterval || !C7384Etj.areEqual(this.billingIntervalCount, subscriptionProduct.billingIntervalCount)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionProduct copy$default(SubscriptionProduct subscriptionProduct, String str, String str2, String str3, Long l, AHD ahd, int i, boolean z, SubscriptionChangeDirection subscriptionChangeDirection, Disclaimer disclaimer, SubscriptionBillingInterval subscriptionBillingInterval, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscriptionProduct.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = subscriptionProduct.tierName;
        }
        if ((i2 & 4) != 0) {
            str3 = subscriptionProduct.tierCode;
        }
        if ((i2 & 8) != 0) {
            l = subscriptionProduct.selectedTier;
        }
        if ((i2 & 16) != 0) {
            ahd = subscriptionProduct.benefits;
        }
        if ((i2 & 32) != 0) {
            i = subscriptionProduct.rank;
        }
        if ((i2 & 64) != 0) {
            z = subscriptionProduct.isCurrent;
        }
        if ((i2 & 128) != 0) {
            subscriptionChangeDirection = subscriptionProduct.changeDirection;
        }
        if ((i2 & 256) != 0) {
            disclaimer = subscriptionProduct.purchaseDisclaimer;
        }
        if ((i2 & 512) != 0) {
            subscriptionBillingInterval = subscriptionProduct.billingInterval;
        }
        if ((i2 & 1024) != 0) {
            num = subscriptionProduct.billingIntervalCount;
        }
        return subscriptionProduct.copy(str, str2, str3, l, ahd, i, z, subscriptionChangeDirection, disclaimer, subscriptionBillingInterval, num);
    }

    public final String component1() {
        return this.productId;
    }

    public final SubscriptionBillingInterval component10() {
        return this.billingInterval;
    }

    public final Integer component11() {
        return this.billingIntervalCount;
    }

    public final String component2() {
        return this.tierName;
    }

    public final String component3() {
        return this.tierCode;
    }

    public final Long component4() {
        return this.selectedTier;
    }

    public final AHD<String> component5() {
        return this.benefits;
    }

    public final int component6() {
        return this.rank;
    }

    public final boolean component7() {
        return this.isCurrent;
    }

    public final SubscriptionChangeDirection component8() {
        return this.changeDirection;
    }

    public final Disclaimer component9() {
        return this.purchaseDisclaimer;
    }

    public final AHD<String> getBenefits() {
        return this.benefits;
    }

    public final SubscriptionBillingInterval getBillingInterval() {
        return this.billingInterval;
    }

    public final Integer getBillingIntervalCount() {
        return this.billingIntervalCount;
    }

    public final SubscriptionChangeDirection getChangeDirection() {
        return this.changeDirection;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Disclaimer getPurchaseDisclaimer() {
        return this.purchaseDisclaimer;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Long getSelectedTier() {
        return this.selectedTier;
    }

    public final String getTierCode() {
        return this.tierCode;
    }

    public final String getTierName() {
        return this.tierName;
    }

    public int hashCode() {
        return ((((((C0KA.A01((AnonymousClass005.A0F(this.benefits, (((AnonymousClass005.A0I(this.tierName, AnonymousClass001.A0G(this.productId)) + AnonymousClass006.A0G(this.tierCode)) * 31) + AnonymousClass006.A0D(this.selectedTier)) * 31) + this.rank) * 31, this.isCurrent) + AnonymousClass006.A0D(this.changeDirection)) * 31) + AnonymousClass006.A0D(this.purchaseDisclaimer)) * 31) + AnonymousClass006.A0D(this.billingInterval)) * 31) + C3cH.A02(this.billingIntervalCount);
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public SubscriptionProduct(String str, String str2, String str3, Long l, AHD<String> ahd, int i, boolean z, SubscriptionChangeDirection subscriptionChangeDirection, Disclaimer disclaimer, SubscriptionBillingInterval subscriptionBillingInterval, Integer num) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(ahd, 4);
        this.productId = str;
        this.tierName = str2;
        this.tierCode = str3;
        this.selectedTier = l;
        this.benefits = ahd;
        this.rank = i;
        this.isCurrent = z;
        this.changeDirection = subscriptionChangeDirection;
        this.purchaseDisclaimer = disclaimer;
        this.billingInterval = subscriptionBillingInterval;
        this.billingIntervalCount = num;
    }

    public final SubscriptionProduct copy(String str, String str2, String str3, Long l, AHD<String> ahd, int i, boolean z, SubscriptionChangeDirection subscriptionChangeDirection, Disclaimer disclaimer, SubscriptionBillingInterval subscriptionBillingInterval, Integer num) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(ahd, 4);
        return new SubscriptionProduct(str, str2, str3, l, ahd, i, z, subscriptionChangeDirection, disclaimer, subscriptionBillingInterval, num);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SubscriptionProduct(String str, String str2, String str3, Long l, AHD ahd, int i, boolean z, SubscriptionChangeDirection subscriptionChangeDirection, Disclaimer disclaimer, SubscriptionBillingInterval subscriptionBillingInterval, Integer num, int i2, C06H c06h) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : l, ahd, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : subscriptionChangeDirection, (i2 & 256) != 0 ? null : disclaimer, (i2 & 512) != 0 ? null : subscriptionBillingInterval, (i2 & 1024) != 0 ? null : num);
    }
}
