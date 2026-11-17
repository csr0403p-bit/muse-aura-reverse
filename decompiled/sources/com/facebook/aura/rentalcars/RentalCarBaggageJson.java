package com.facebook.aura.rentalcars;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarBaggageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer large;
    public final Integer small;

    public final class Companion {
        public final C9hr<RentalCarBaggageJson> serializer() {
            return RentalCarBaggageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarBaggageJson rentalCarBaggageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || rentalCarBaggageJson.large != null) {
            c9j5.AAP(rentalCarBaggageJson.large, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || rentalCarBaggageJson.small != null) {
            c9j5.AAP(rentalCarBaggageJson.small, C07729ii.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarBaggageJson) {
                RentalCarBaggageJson rentalCarBaggageJson = (RentalCarBaggageJson) obj;
                if (!C7384Etj.areEqual(this.large, rentalCarBaggageJson.large) || !C7384Etj.areEqual(this.small, rentalCarBaggageJson.small)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarBaggageJson copy$default(RentalCarBaggageJson rentalCarBaggageJson, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rentalCarBaggageJson.large;
        }
        if ((i & 2) != 0) {
            num2 = rentalCarBaggageJson.small;
        }
        return new RentalCarBaggageJson(num, num2);
    }

    public final Integer component1() {
        return this.large;
    }

    public final Integer component2() {
        return this.small;
    }

    public final RentalCarBaggageJson copy(Integer num, Integer num2) {
        return new RentalCarBaggageJson(num, num2);
    }

    public final Integer getLarge() {
        return this.large;
    }

    public final Integer getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.large) * 31) + C3cH.A02(this.small);
    }

    public RentalCarBaggageJson(Integer num, Integer num2) {
        this.large = num;
        this.small = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarBaggageJson(int i, Integer num, Integer num2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.large = null;
        } else {
            this.large = num;
        }
        if ((i & 2) == 0) {
            this.small = null;
        } else {
            this.small = num2;
        }
    }

    public /* synthetic */ RentalCarBaggageJson(Integer num, Integer num2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public RentalCarBaggageJson() {
        this(null, null);
    }
}
