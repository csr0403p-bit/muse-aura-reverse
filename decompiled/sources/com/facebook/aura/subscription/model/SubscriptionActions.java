package com.facebook.aura.subscription.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;

/* loaded from: classes.dex */
public final class SubscriptionActions extends C06G {
    public static final int $stable;
    public final boolean canBuyTopUp;
    public final SubscriptionEntryPointDestination entryPointDestination;
    public final SubscriptionManagementCta meterAction;
    public final SubscriptionMeterDestination meterDestination;
    public final boolean needsRetry;
    public final AHD<SubscriptionManagementCta> rows;
    public final SubscriptionManagementCta topUpAction;

    public SubscriptionActions() {
        this(null, null, false, AHI.A01, false, SubscriptionEntryPointDestination.UPGRADE, null);
    }

    public final SubscriptionActions copy(SubscriptionManagementCta subscriptionManagementCta, SubscriptionManagementCta subscriptionManagementCta2, boolean z, AHD<SubscriptionManagementCta> ahd, boolean z2, SubscriptionEntryPointDestination subscriptionEntryPointDestination, SubscriptionMeterDestination subscriptionMeterDestination) {
        AnonymousClass002.A1D(ahd, 3, subscriptionEntryPointDestination);
        return new SubscriptionActions(subscriptionManagementCta, subscriptionManagementCta2, z, ahd, z2, subscriptionEntryPointDestination, subscriptionMeterDestination);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionActions) {
                SubscriptionActions subscriptionActions = (SubscriptionActions) obj;
                if (!C7384Etj.areEqual(this.meterAction, subscriptionActions.meterAction) || !C7384Etj.areEqual(this.topUpAction, subscriptionActions.topUpAction) || this.canBuyTopUp != subscriptionActions.canBuyTopUp || !C7384Etj.areEqual(this.rows, subscriptionActions.rows) || this.needsRetry != subscriptionActions.needsRetry || this.entryPointDestination != subscriptionActions.entryPointDestination || this.meterDestination != subscriptionActions.meterDestination) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = SubscriptionManagementCta.$stable;
        $stable = i | i | i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionActions copy$default(SubscriptionActions subscriptionActions, SubscriptionManagementCta subscriptionManagementCta, SubscriptionManagementCta subscriptionManagementCta2, boolean z, AHD ahd, boolean z2, SubscriptionEntryPointDestination subscriptionEntryPointDestination, SubscriptionMeterDestination subscriptionMeterDestination, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionManagementCta = subscriptionActions.meterAction;
        }
        if ((i & 2) != 0) {
            subscriptionManagementCta2 = subscriptionActions.topUpAction;
        }
        if ((i & 4) != 0) {
            z = subscriptionActions.canBuyTopUp;
        }
        if ((i & 8) != 0) {
            ahd = subscriptionActions.rows;
        }
        if ((i & 16) != 0) {
            z2 = subscriptionActions.needsRetry;
        }
        if ((i & 32) != 0) {
            subscriptionEntryPointDestination = subscriptionActions.entryPointDestination;
        }
        if ((i & 64) != 0) {
            subscriptionMeterDestination = subscriptionActions.meterDestination;
        }
        return subscriptionActions.copy(subscriptionManagementCta, subscriptionManagementCta2, z, ahd, z2, subscriptionEntryPointDestination, subscriptionMeterDestination);
    }

    public final SubscriptionManagementCta component1() {
        return this.meterAction;
    }

    public final SubscriptionManagementCta component2() {
        return this.topUpAction;
    }

    public final boolean component3() {
        return this.canBuyTopUp;
    }

    public final AHD<SubscriptionManagementCta> component4() {
        return this.rows;
    }

    public final boolean component5() {
        return this.needsRetry;
    }

    public final SubscriptionEntryPointDestination component6() {
        return this.entryPointDestination;
    }

    public final SubscriptionMeterDestination component7() {
        return this.meterDestination;
    }

    public final boolean getCanBuyTopUp() {
        return this.canBuyTopUp;
    }

    public final SubscriptionEntryPointDestination getEntryPointDestination() {
        return this.entryPointDestination;
    }

    public final SubscriptionManagementCta getMeterAction() {
        return this.meterAction;
    }

    public final SubscriptionMeterDestination getMeterDestination() {
        return this.meterDestination;
    }

    public final boolean getNeedsRetry() {
        return this.needsRetry;
    }

    public final AHD<SubscriptionManagementCta> getRows() {
        return this.rows;
    }

    public final SubscriptionManagementCta getTopUpAction() {
        return this.topUpAction;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.entryPointDestination, C0KA.A01(AnonymousClass005.A0F(this.rows, C0KA.A01(((AnonymousClass006.A0D(this.meterAction) * 31) + AnonymousClass006.A0D(this.topUpAction)) * 31, this.canBuyTopUp)), this.needsRetry)) + C06G.A04(this.meterDestination);
    }

    public String toString() {
        return super.toString();
    }

    public SubscriptionActions(SubscriptionManagementCta subscriptionManagementCta, SubscriptionManagementCta subscriptionManagementCta2, boolean z, AHD<SubscriptionManagementCta> ahd, boolean z2, SubscriptionEntryPointDestination subscriptionEntryPointDestination, SubscriptionMeterDestination subscriptionMeterDestination) {
        AnonymousClass002.A1D(ahd, 3, subscriptionEntryPointDestination);
        this.meterAction = subscriptionManagementCta;
        this.topUpAction = subscriptionManagementCta2;
        this.canBuyTopUp = z;
        this.rows = ahd;
        this.needsRetry = z2;
        this.entryPointDestination = subscriptionEntryPointDestination;
        this.meterDestination = subscriptionMeterDestination;
    }

    public /* synthetic */ SubscriptionActions(SubscriptionManagementCta subscriptionManagementCta, SubscriptionManagementCta subscriptionManagementCta2, boolean z, AHD ahd, boolean z2, SubscriptionEntryPointDestination subscriptionEntryPointDestination, SubscriptionMeterDestination subscriptionMeterDestination, int i, C06H c06h) {
        this((i & 1) != 0 ? null : subscriptionManagementCta, (i & 2) != 0 ? null : subscriptionManagementCta2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? SubscriptionEntryPointDestination.UPGRADE : subscriptionEntryPointDestination, (i & 64) != 0 ? null : subscriptionMeterDestination);
    }
}
