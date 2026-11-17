package com.facebook.aura.rentalcars;

import X.C7384Etj;

/* loaded from: classes.dex */
public interface RentalCarDecode {

    public final class Failed implements RentalCarDecode {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 1048729160;
        }
    }

    public final class Pending implements RentalCarDecode {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public String toString() {
            return "Pending";
        }

        public int hashCode() {
            return -1445132052;
        }
    }

    public final class Ready implements RentalCarDecode {
        public static final int $stable = 0;
        public final RentalCarResults results;

        public Ready(RentalCarResults rentalCarResults) {
            C7384Etj.A0Y(rentalCarResults, 0);
            this.results = rentalCarResults;
        }

        public final RentalCarResults getResults() {
            return this.results;
        }
    }
}
