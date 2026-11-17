package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutPlaceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String iata_code;

    public final class Companion {
        public final C9hr<FlightCheckoutPlaceJson> serializer() {
            return FlightCheckoutPlaceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutPlaceJson flightCheckoutPlaceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutPlaceJson.iata_code != null) {
            c9j5.AAP(flightCheckoutPlaceJson.iata_code, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutPlaceJson.display_name != null) {
            c9j5.AAP(flightCheckoutPlaceJson.display_name, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutPlaceJson) {
                FlightCheckoutPlaceJson flightCheckoutPlaceJson = (FlightCheckoutPlaceJson) obj;
                if (!C7384Etj.areEqual(this.iata_code, flightCheckoutPlaceJson.iata_code) || !C7384Etj.areEqual(this.display_name, flightCheckoutPlaceJson.display_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutPlaceJson copy$default(FlightCheckoutPlaceJson flightCheckoutPlaceJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutPlaceJson.iata_code;
        }
        if ((i & 2) != 0) {
            str2 = flightCheckoutPlaceJson.display_name;
        }
        return new FlightCheckoutPlaceJson(str, str2);
    }

    public final String component1() {
        return this.iata_code;
    }

    public final String component2() {
        return this.display_name;
    }

    public final FlightCheckoutPlaceJson copy(String str, String str2) {
        return new FlightCheckoutPlaceJson(str, str2);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getIata_code() {
        return this.iata_code;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.iata_code) * 31) + AnonymousClass005.A0H(this.display_name);
    }

    public FlightCheckoutPlaceJson(String str, String str2) {
        this.iata_code = str;
        this.display_name = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutPlaceJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.iata_code = null;
        } else {
            this.iata_code = str;
        }
        if ((i & 2) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str2;
        }
    }

    public /* synthetic */ FlightCheckoutPlaceJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public FlightCheckoutPlaceJson() {
        this(null, null);
    }
}
