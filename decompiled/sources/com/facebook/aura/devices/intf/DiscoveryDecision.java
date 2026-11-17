package com.facebook.aura.devices.intf;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface DiscoveryDecision {

    public final class Claimed extends C06G implements DiscoveryDecision {
        public static final int $stable = 8;
        public final ClaimedDeviceRow row;

        public Claimed(ClaimedDeviceRow claimedDeviceRow) {
            C7384Etj.A0Y(claimedDeviceRow, 0);
            this.row = claimedDeviceRow;
        }

        public final Claimed copy(ClaimedDeviceRow claimedDeviceRow) {
            C7384Etj.A0Y(claimedDeviceRow, 0);
            return new Claimed(claimedDeviceRow);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Claimed) && C7384Etj.areEqual(this.row, ((Claimed) obj).row));
        }

        public static /* synthetic */ Claimed copy$default(Claimed claimed, ClaimedDeviceRow claimedDeviceRow, int i, Object obj) {
            if ((i & 1) != 0) {
                claimedDeviceRow = claimed.row;
            }
            C7384Etj.A0Y(claimedDeviceRow, 0);
            return new Claimed(claimedDeviceRow);
        }

        public final ClaimedDeviceRow component1() {
            return this.row;
        }

        public final ClaimedDeviceRow getRow() {
            return this.row;
        }

        public int hashCode() {
            return this.row.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Hidden implements DiscoveryDecision {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public String toString() {
            return "Hidden";
        }

        public int hashCode() {
            return -1795203390;
        }
    }

    public final class LinkSetup implements DiscoveryDecision {
        public static final int $stable = 0;
        public static final LinkSetup INSTANCE = new LinkSetup();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkSetup);
        }

        public String toString() {
            return "LinkSetup";
        }

        public int hashCode() {
            return 1857425035;
        }
    }

    public final class Unclaimed implements DiscoveryDecision {
        public static final int $stable = 0;
        public static final Unclaimed INSTANCE = new Unclaimed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unclaimed);
        }

        public String toString() {
            return "Unclaimed";
        }

        public int hashCode() {
            return 1763385610;
        }
    }
}
