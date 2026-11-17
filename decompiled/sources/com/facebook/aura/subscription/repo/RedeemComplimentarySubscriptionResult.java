package com.facebook.aura.subscription.repo;

/* loaded from: classes.dex */
public interface RedeemComplimentarySubscriptionResult {

    public final class Ambiguous implements RedeemComplimentarySubscriptionResult {
        public static final int $stable = 0;
        public static final Ambiguous INSTANCE = new Ambiguous();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ambiguous);
        }

        public String toString() {
            return "Ambiguous";
        }

        public int hashCode() {
            return -300214017;
        }
    }

    public final class Failed implements RedeemComplimentarySubscriptionResult {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 318676522;
        }
    }

    public final class Redeemed implements RedeemComplimentarySubscriptionResult {
        public static final int $stable = 0;
        public static final Redeemed INSTANCE = new Redeemed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Redeemed);
        }

        public String toString() {
            return "Redeemed";
        }

        public int hashCode() {
            return -150203928;
        }
    }
}
