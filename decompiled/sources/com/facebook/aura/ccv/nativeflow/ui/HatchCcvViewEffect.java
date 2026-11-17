package com.facebook.aura.ccv.nativeflow.ui;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutUnavailableReason;

/* loaded from: classes3.dex */
public interface HatchCcvViewEffect {

    public final class Cancelled implements HatchCcvViewEffect {
        public static final int $stable = 0;
        public static final Cancelled INSTANCE = new Cancelled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public String toString() {
            return "Cancelled";
        }

        public int hashCode() {
            return -790803800;
        }
    }

    public final class CheckoutUnavailable extends C06G implements HatchCcvViewEffect {
        public static final int $stable = 0;
        public final HatchCheckoutUnavailableReason reason;

        public CheckoutUnavailable(HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason) {
            C7384Etj.A0Y(hatchCheckoutUnavailableReason, 0);
            this.reason = hatchCheckoutUnavailableReason;
        }

        public final CheckoutUnavailable copy(HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason) {
            C7384Etj.A0Y(hatchCheckoutUnavailableReason, 0);
            return new CheckoutUnavailable(hatchCheckoutUnavailableReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CheckoutUnavailable) && this.reason == ((CheckoutUnavailable) obj).reason);
        }

        public static /* synthetic */ CheckoutUnavailable copy$default(CheckoutUnavailable checkoutUnavailable, HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchCheckoutUnavailableReason = checkoutUnavailable.reason;
            }
            C7384Etj.A0Y(hatchCheckoutUnavailableReason, 0);
            return new CheckoutUnavailable(hatchCheckoutUnavailableReason);
        }

        public final HatchCheckoutUnavailableReason component1() {
            return this.reason;
        }

        public final HatchCheckoutUnavailableReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
