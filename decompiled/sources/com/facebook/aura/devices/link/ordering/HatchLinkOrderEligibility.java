package com.facebook.aura.devices.link.ordering;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HatchLinkOrderEligibility {

    public final class Blocked extends C06G implements HatchLinkOrderEligibility {
        public static final int $stable = 0;
        public final HatchLinkOrderBlockReason reason;

        public Blocked(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
            C7384Etj.A0Y(hatchLinkOrderBlockReason, 0);
            this.reason = hatchLinkOrderBlockReason;
        }

        public final Blocked copy(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
            C7384Etj.A0Y(hatchLinkOrderBlockReason, 0);
            return new Blocked(hatchLinkOrderBlockReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Blocked) && this.reason == ((Blocked) obj).reason);
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderBlockReason = blocked.reason;
            }
            C7384Etj.A0Y(hatchLinkOrderBlockReason, 0);
            return new Blocked(hatchLinkOrderBlockReason);
        }

        public final HatchLinkOrderBlockReason component1() {
            return this.reason;
        }

        public final HatchLinkOrderBlockReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Eligible extends C06G implements HatchLinkOrderEligibility {
        public static final int $stable = 0;
        public final String subscriptionId;

        public Eligible(String str) {
            C7384Etj.A0Y(str, 0);
            this.subscriptionId = str;
        }

        public final Eligible copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Eligible(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Eligible) && C7384Etj.areEqual(this.subscriptionId, ((Eligible) obj).subscriptionId));
        }

        public static /* synthetic */ Eligible copy$default(Eligible eligible, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eligible.subscriptionId;
            }
            C7384Etj.A0Y(str, 0);
            return new Eligible(str);
        }

        public final String component1() {
            return this.subscriptionId;
        }

        public final String getSubscriptionId() {
            return this.subscriptionId;
        }

        public int hashCode() {
            return this.subscriptionId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
