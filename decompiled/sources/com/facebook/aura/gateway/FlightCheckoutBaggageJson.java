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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutBaggageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer passenger_index;
    public final String passenger_name;
    public final Integer quantity;
    public final String type;

    public final class Companion {
        public final C9hr<FlightCheckoutBaggageJson> serializer() {
            return FlightCheckoutBaggageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutBaggageJson flightCheckoutBaggageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutBaggageJson.passenger_name != null) {
            c9j5.AAP(flightCheckoutBaggageJson.passenger_name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutBaggageJson.passenger_index != null) {
            c9j5.AAP(flightCheckoutBaggageJson.passenger_index, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || flightCheckoutBaggageJson.type != null) {
            c9j5.AAP(flightCheckoutBaggageJson.type, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightCheckoutBaggageJson.quantity != null) {
            c9j5.AAP(flightCheckoutBaggageJson.quantity, C07729ii.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutBaggageJson) {
                FlightCheckoutBaggageJson flightCheckoutBaggageJson = (FlightCheckoutBaggageJson) obj;
                if (!C7384Etj.areEqual(this.passenger_name, flightCheckoutBaggageJson.passenger_name) || !C7384Etj.areEqual(this.passenger_index, flightCheckoutBaggageJson.passenger_index) || !C7384Etj.areEqual(this.type, flightCheckoutBaggageJson.type) || !C7384Etj.areEqual(this.quantity, flightCheckoutBaggageJson.quantity)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutBaggageJson copy$default(FlightCheckoutBaggageJson flightCheckoutBaggageJson, String str, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutBaggageJson.passenger_name;
        }
        if ((i & 2) != 0) {
            num = flightCheckoutBaggageJson.passenger_index;
        }
        if ((i & 4) != 0) {
            str2 = flightCheckoutBaggageJson.type;
        }
        if ((i & 8) != 0) {
            num2 = flightCheckoutBaggageJson.quantity;
        }
        return new FlightCheckoutBaggageJson(str, num, str2, num2);
    }

    public final String component1() {
        return this.passenger_name;
    }

    public final Integer component2() {
        return this.passenger_index;
    }

    public final String component3() {
        return this.type;
    }

    public final Integer component4() {
        return this.quantity;
    }

    public final FlightCheckoutBaggageJson copy(String str, Integer num, String str2, Integer num2) {
        return new FlightCheckoutBaggageJson(str, num, str2, num2);
    }

    public final Integer getPassenger_index() {
        return this.passenger_index;
    }

    public final String getPassenger_name() {
        return this.passenger_name;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.passenger_name) * 31) + AnonymousClass006.A0D(this.passenger_index)) * 31) + AnonymousClass006.A0G(this.type)) * 31) + C3cH.A02(this.quantity);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutBaggage toDomainOrNull() {
        String strTrimToNonEmpty;
        String str;
        String strTrimToNonEmpty2;
        Integer num;
        String str2 = this.passenger_name;
        if (str2 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) == null || (str = this.type) == null || (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null || (num = this.quantity) == null) {
            return null;
        }
        return new HatchAgentPermissionsRepository.FlightCheckoutBaggage(strTrimToNonEmpty, this.passenger_index, strTrimToNonEmpty2, num.intValue());
    }

    public FlightCheckoutBaggageJson(String str, Integer num, String str2, Integer num2) {
        this.passenger_name = str;
        this.passenger_index = num;
        this.type = str2;
        this.quantity = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutBaggageJson(int i, String str, Integer num, String str2, Integer num2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.passenger_name = null;
        } else {
            this.passenger_name = str;
        }
        if ((i & 2) == 0) {
            this.passenger_index = null;
        } else {
            this.passenger_index = num;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 8) == 0) {
            this.quantity = null;
        } else {
            this.quantity = num2;
        }
    }

    public /* synthetic */ FlightCheckoutBaggageJson(String str, Integer num, String str2, Integer num2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }

    public FlightCheckoutBaggageJson() {
        this(null, null, null, null);
    }
}
