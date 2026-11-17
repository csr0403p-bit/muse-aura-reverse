package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutStopsJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int count;
    public final String display;

    public final class Companion {
        public final C9hr<FlightCheckoutStopsJson> serializer() {
            return FlightCheckoutStopsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutStopsJson flightCheckoutStopsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutStopsJson.count != 0) {
            c9j5.AAK(c9iZ, 0, flightCheckoutStopsJson.count);
        }
        if (zAfR || flightCheckoutStopsJson.display != null) {
            c9j5.AAP(flightCheckoutStopsJson.display, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutStopsJson) {
                FlightCheckoutStopsJson flightCheckoutStopsJson = (FlightCheckoutStopsJson) obj;
                if (this.count != flightCheckoutStopsJson.count || !C7384Etj.areEqual(this.display, flightCheckoutStopsJson.display)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutStopsJson copy$default(FlightCheckoutStopsJson flightCheckoutStopsJson, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flightCheckoutStopsJson.count;
        }
        if ((i2 & 2) != 0) {
            str = flightCheckoutStopsJson.display;
        }
        return new FlightCheckoutStopsJson(i, str);
    }

    public final int component1() {
        return this.count;
    }

    public final String component2() {
        return this.display;
    }

    public final FlightCheckoutStopsJson copy(int i, String str) {
        return new FlightCheckoutStopsJson(i, str);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getDisplay() {
        return this.display;
    }

    public int hashCode() {
        return (this.count * 31) + AnonymousClass006.A0G(this.display);
    }

    public FlightCheckoutStopsJson(int i, String str) {
        this.count = i;
        this.display = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutStopsJson(int i, int i2, String str, C2hx c2hx) {
        this.count = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.display = null;
        } else {
            this.display = str;
        }
    }

    public /* synthetic */ FlightCheckoutStopsJson(int i, String str, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), AnonymousClass006.A0s(i2, str));
    }

    public FlightCheckoutStopsJson() {
        this(0, null);
    }
}
