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
public final class FlightCheckoutCarrierJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String iata_code;
    public final String name;

    public final class Companion {
        public final C9hr<FlightCheckoutCarrierJson> serializer() {
            return FlightCheckoutCarrierJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutCarrierJson flightCheckoutCarrierJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutCarrierJson.name != null) {
            c9j5.AAP(flightCheckoutCarrierJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutCarrierJson.iata_code != null) {
            c9j5.AAP(flightCheckoutCarrierJson.iata_code, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutCarrierJson) {
                FlightCheckoutCarrierJson flightCheckoutCarrierJson = (FlightCheckoutCarrierJson) obj;
                if (!C7384Etj.areEqual(this.name, flightCheckoutCarrierJson.name) || !C7384Etj.areEqual(this.iata_code, flightCheckoutCarrierJson.iata_code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutCarrierJson copy$default(FlightCheckoutCarrierJson flightCheckoutCarrierJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutCarrierJson.name;
        }
        if ((i & 2) != 0) {
            str2 = flightCheckoutCarrierJson.iata_code;
        }
        return new FlightCheckoutCarrierJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.iata_code;
    }

    public final FlightCheckoutCarrierJson copy(String str, String str2) {
        return new FlightCheckoutCarrierJson(str, str2);
    }

    public final String getIata_code() {
        return this.iata_code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.iata_code);
    }

    public FlightCheckoutCarrierJson(String str, String str2) {
        this.name = str;
        this.iata_code = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutCarrierJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.iata_code = null;
        } else {
            this.iata_code = str2;
        }
    }

    public /* synthetic */ FlightCheckoutCarrierJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public FlightCheckoutCarrierJson() {
        this(null, null);
    }
}
