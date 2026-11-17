package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CarRentalReservationVehicleJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String category;
    public final String name;
    public final Integer seats;
    public final String transmission;

    public final class Companion {
        public final C9hr<CarRentalReservationVehicleJson> serializer() {
            return CarRentalReservationVehicleJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CarRentalReservationVehicleJson carRentalReservationVehicleJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || carRentalReservationVehicleJson.name != null) {
            c9j5.AAP(carRentalReservationVehicleJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || carRentalReservationVehicleJson.category != null) {
            c9j5.AAP(carRentalReservationVehicleJson.category, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || carRentalReservationVehicleJson.transmission != null) {
            c9j5.AAP(carRentalReservationVehicleJson.transmission, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || carRentalReservationVehicleJson.seats != null) {
            c9j5.AAP(carRentalReservationVehicleJson.seats, C07729ii.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CarRentalReservationVehicleJson) {
                CarRentalReservationVehicleJson carRentalReservationVehicleJson = (CarRentalReservationVehicleJson) obj;
                if (!C7384Etj.areEqual(this.name, carRentalReservationVehicleJson.name) || !C7384Etj.areEqual(this.category, carRentalReservationVehicleJson.category) || !C7384Etj.areEqual(this.transmission, carRentalReservationVehicleJson.transmission) || !C7384Etj.areEqual(this.seats, carRentalReservationVehicleJson.seats)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CarRentalReservationVehicleJson copy$default(CarRentalReservationVehicleJson carRentalReservationVehicleJson, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carRentalReservationVehicleJson.name;
        }
        if ((i & 2) != 0) {
            str2 = carRentalReservationVehicleJson.category;
        }
        if ((i & 4) != 0) {
            str3 = carRentalReservationVehicleJson.transmission;
        }
        if ((i & 8) != 0) {
            num = carRentalReservationVehicleJson.seats;
        }
        return new CarRentalReservationVehicleJson(str, str2, str3, num);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.transmission;
    }

    public final Integer component4() {
        return this.seats;
    }

    public final CarRentalReservationVehicleJson copy(String str, String str2, String str3, Integer num) {
        return new CarRentalReservationVehicleJson(str, str2, str3, num);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSeats() {
        return this.seats;
    }

    public final String getTransmission() {
        return this.transmission;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.category)) * 31) + AnonymousClass006.A0G(this.transmission)) * 31) + C3cH.A02(this.seats);
    }

    public CarRentalReservationVehicleJson(String str, String str2, String str3, Integer num) {
        this.name = str;
        this.category = str2;
        this.transmission = str3;
        this.seats = num;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CarRentalReservationVehicleJson(int i, String str, String str2, String str3, Integer num, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.category = null;
        } else {
            this.category = str2;
        }
        if ((i & 4) == 0) {
            this.transmission = null;
        } else {
            this.transmission = str3;
        }
        if ((i & 8) == 0) {
            this.seats = null;
        } else {
            this.seats = num;
        }
    }

    public /* synthetic */ CarRentalReservationVehicleJson(String str, String str2, String str3, Integer num, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }

    public CarRentalReservationVehicleJson() {
        this(null, null, null, null);
    }
}
