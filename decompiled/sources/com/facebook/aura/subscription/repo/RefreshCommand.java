package com.facebook.aura.subscription.repo;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface RefreshCommand {

    public final class ApplyDetails extends C06G implements RefreshCommand {
        public static final int $stable = 8;
        public final SubscriptionDetailsState details;

        public ApplyDetails(SubscriptionDetailsState subscriptionDetailsState) {
            C7384Etj.A0Y(subscriptionDetailsState, 0);
            this.details = subscriptionDetailsState;
        }

        public final ApplyDetails copy(SubscriptionDetailsState subscriptionDetailsState) {
            C7384Etj.A0Y(subscriptionDetailsState, 0);
            return new ApplyDetails(subscriptionDetailsState);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ApplyDetails) && C7384Etj.areEqual(this.details, ((ApplyDetails) obj).details));
        }

        public static /* synthetic */ ApplyDetails copy$default(ApplyDetails applyDetails, SubscriptionDetailsState subscriptionDetailsState, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionDetailsState = applyDetails.details;
            }
            C7384Etj.A0Y(subscriptionDetailsState, 0);
            return new ApplyDetails(subscriptionDetailsState);
        }

        public final SubscriptionDetailsState component1() {
            return this.details;
        }

        public final SubscriptionDetailsState getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PostPurchase implements RefreshCommand {
        public static final int $stable = 0;
        public static final PostPurchase INSTANCE = new PostPurchase();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PostPurchase);
        }

        public String toString() {
            return "PostPurchase";
        }

        public int hashCode() {
            return -68056796;
        }
    }

    public final class Refresh implements RefreshCommand {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public String toString() {
            return "Refresh";
        }

        public int hashCode() {
            return 707664280;
        }
    }

    public final class WithdrawHomeLinkClaim implements RefreshCommand {
        public static final int $stable = 0;
        public static final WithdrawHomeLinkClaim INSTANCE = new WithdrawHomeLinkClaim();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WithdrawHomeLinkClaim);
        }

        public String toString() {
            return "WithdrawHomeLinkClaim";
        }

        public int hashCode() {
            return -1784510634;
        }
    }
}
