package com.facebook.aura.subscription.repo;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SubscriptionManagementActions extends C06G {
    public static final int $stable = 0;
    public final SubscriptionManagementCta primaryCta;
    public final AHD<SubscriptionManagementCta> rows;

    public SubscriptionManagementActions(AHD<SubscriptionManagementCta> ahd, SubscriptionManagementCta subscriptionManagementCta) {
        C7384Etj.A0Y(ahd, 0);
        this.rows = ahd;
        this.primaryCta = subscriptionManagementCta;
    }

    public final SubscriptionManagementActions copy(AHD<SubscriptionManagementCta> ahd, SubscriptionManagementCta subscriptionManagementCta) {
        C7384Etj.A0Y(ahd, 0);
        return new SubscriptionManagementActions(ahd, subscriptionManagementCta);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionManagementActions) {
                SubscriptionManagementActions subscriptionManagementActions = (SubscriptionManagementActions) obj;
                if (!C7384Etj.areEqual(this.rows, subscriptionManagementActions.rows) || !C7384Etj.areEqual(this.primaryCta, subscriptionManagementActions.primaryCta)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionManagementActions copy$default(SubscriptionManagementActions subscriptionManagementActions, AHD ahd, SubscriptionManagementCta subscriptionManagementCta, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = subscriptionManagementActions.rows;
        }
        if ((i & 2) != 0) {
            subscriptionManagementCta = subscriptionManagementActions.primaryCta;
        }
        C7384Etj.A0Y(ahd, 0);
        return new SubscriptionManagementActions(ahd, subscriptionManagementCta);
    }

    public final AHD<SubscriptionManagementCta> component1() {
        return this.rows;
    }

    public final SubscriptionManagementCta component2() {
        return this.primaryCta;
    }

    public final SubscriptionManagementCta getPrimaryCta() {
        return this.primaryCta;
    }

    public final AHD<SubscriptionManagementCta> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.rows) + AnonymousClass006.A0D(this.primaryCta);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SubscriptionManagementActions(AHD ahd, SubscriptionManagementCta subscriptionManagementCta, int i, C06H c06h) {
        this(ahd, (i & 2) != 0 ? null : subscriptionManagementCta);
    }
}
