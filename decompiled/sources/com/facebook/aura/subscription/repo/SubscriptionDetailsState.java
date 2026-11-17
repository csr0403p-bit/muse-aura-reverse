package com.facebook.aura.subscription.repo;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface SubscriptionDetailsState {

    public final class Failed implements SubscriptionDetailsState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 287053540;
        }
    }

    /* loaded from: classes4.dex */
    public final class Success extends C06G implements SubscriptionDetailsState {
        public static final int $stable = 0;
        public final SubscriptionDetails details;

        public Success(SubscriptionDetails subscriptionDetails) {
            C7384Etj.A0Y(subscriptionDetails, 0);
            this.details = subscriptionDetails;
        }

        public final Success copy(SubscriptionDetails subscriptionDetails) {
            C7384Etj.A0Y(subscriptionDetails, 0);
            return new Success(subscriptionDetails);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.details, ((Success) obj).details));
        }

        public static /* synthetic */ Success copy$default(Success success, SubscriptionDetails subscriptionDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionDetails = success.details;
            }
            C7384Etj.A0Y(subscriptionDetails, 0);
            return new Success(subscriptionDetails);
        }

        public final SubscriptionDetails component1() {
            return this.details;
        }

        public final SubscriptionDetails getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unresolved implements SubscriptionDetailsState {
        public static final int $stable = 0;
        public static final Unresolved INSTANCE = new Unresolved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unresolved);
        }

        public String toString() {
            return "Unresolved";
        }

        public int hashCode() {
            return -1966737224;
        }
    }
}
