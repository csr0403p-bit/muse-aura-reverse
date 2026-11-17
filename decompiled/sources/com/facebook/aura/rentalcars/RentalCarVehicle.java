package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RentalCarVehicle extends C06G {
    public static final int $stable = 0;
    public final Boolean airConditioning;
    public final String category;
    public final String fuel;
    public final String imageUrl;
    public final Integer largeBags;
    public final Integer maxPassengers;
    public final String name;
    public final Integer smallBags;
    public final String transmission;
    public final String type;

    public RentalCarVehicle(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Boolean bool, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.category = str2;
        this.type = str3;
        this.transmission = str4;
        this.maxPassengers = num;
        this.largeBags = num2;
        this.smallBags = num3;
        this.airConditioning = bool;
        this.fuel = str5;
        this.imageUrl = str6;
    }

    public final RentalCarVehicle copy(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Boolean bool, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        return new RentalCarVehicle(str, str2, str3, str4, num, num2, num3, bool, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarVehicle) {
                RentalCarVehicle rentalCarVehicle = (RentalCarVehicle) obj;
                if (!C7384Etj.areEqual(this.name, rentalCarVehicle.name) || !C7384Etj.areEqual(this.category, rentalCarVehicle.category) || !C7384Etj.areEqual(this.type, rentalCarVehicle.type) || !C7384Etj.areEqual(this.transmission, rentalCarVehicle.transmission) || !C7384Etj.areEqual(this.maxPassengers, rentalCarVehicle.maxPassengers) || !C7384Etj.areEqual(this.largeBags, rentalCarVehicle.largeBags) || !C7384Etj.areEqual(this.smallBags, rentalCarVehicle.smallBags) || !C7384Etj.areEqual(this.airConditioning, rentalCarVehicle.airConditioning) || !C7384Etj.areEqual(this.fuel, rentalCarVehicle.fuel) || !C7384Etj.areEqual(this.imageUrl, rentalCarVehicle.imageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarVehicle copy$default(RentalCarVehicle rentalCarVehicle, String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Boolean bool, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarVehicle.name;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarVehicle.category;
        }
        if ((i & 4) != 0) {
            str3 = rentalCarVehicle.type;
        }
        if ((i & 8) != 0) {
            str4 = rentalCarVehicle.transmission;
        }
        if ((i & 16) != 0) {
            num = rentalCarVehicle.maxPassengers;
        }
        if ((i & 32) != 0) {
            num2 = rentalCarVehicle.largeBags;
        }
        if ((i & 64) != 0) {
            num3 = rentalCarVehicle.smallBags;
        }
        if ((i & 128) != 0) {
            bool = rentalCarVehicle.airConditioning;
        }
        if ((i & 256) != 0) {
            str5 = rentalCarVehicle.fuel;
        }
        if ((i & 512) != 0) {
            str6 = rentalCarVehicle.imageUrl;
        }
        return rentalCarVehicle.copy(str, str2, str3, str4, num, num2, num3, bool, str5, str6);
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.transmission;
    }

    public final Integer component5() {
        return this.maxPassengers;
    }

    public final Integer component6() {
        return this.largeBags;
    }

    public final Integer component7() {
        return this.smallBags;
    }

    public final Boolean component8() {
        return this.airConditioning;
    }

    public final String component9() {
        return this.fuel;
    }

    public final Boolean getAirConditioning() {
        return this.airConditioning;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getFuel() {
        return this.fuel;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getLargeBags() {
        return this.largeBags;
    }

    public final Integer getMaxPassengers() {
        return this.maxPassengers;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSmallBags() {
        return this.smallBags;
    }

    public final String getTransmission() {
        return this.transmission;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((((((((((AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.category)) * 31) + AnonymousClass006.A0G(this.type)) * 31) + AnonymousClass006.A0G(this.transmission)) * 31) + AnonymousClass006.A0D(this.maxPassengers)) * 31) + AnonymousClass006.A0D(this.largeBags)) * 31) + AnonymousClass006.A0D(this.smallBags)) * 31) + AnonymousClass006.A0D(this.airConditioning)) * 31) + AnonymousClass006.A0G(this.fuel)) * 31) + AnonymousClass005.A0H(this.imageUrl);
    }

    public String toString() {
        return super.toString();
    }
}
