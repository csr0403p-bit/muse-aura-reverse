package com.facebook.aura.rentalcars;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface RentalCarMileage {

    public final class Limited extends C06G implements RentalCarMileage {
        public static final int $stable = 0;
        public final long limit;
        public final String unit;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Limited) {
                    Limited limited = (Limited) obj;
                    if (this.limit != limited.limit || !C7384Etj.areEqual(this.unit, limited.unit)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Limited copy$default(Limited limited, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = limited.limit;
            }
            if ((i & 2) != 0) {
                str = limited.unit;
            }
            return new Limited(j, str);
        }

        public final long component1() {
            return this.limit;
        }

        public final String component2() {
            return this.unit;
        }

        public final Limited copy(long j, String str) {
            return new Limited(j, str);
        }

        public final long getLimit() {
            return this.limit;
        }

        public final String getUnit() {
            return this.unit;
        }

        public int hashCode() {
            return (AnonymousClass002.A0A(this.limit) * 31) + AnonymousClass006.A0G(this.unit);
        }

        public Limited(long j, String str) {
            this.limit = j;
            this.unit = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unlimited implements RentalCarMileage {
        public static final int $stable = 0;
        public static final Unlimited INSTANCE = new Unlimited();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unlimited);
        }

        public String toString() {
            return "Unlimited";
        }

        public int hashCode() {
            return 360281352;
        }
    }
}
