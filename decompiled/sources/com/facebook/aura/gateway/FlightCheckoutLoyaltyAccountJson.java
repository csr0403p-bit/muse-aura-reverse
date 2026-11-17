package com.facebook.aura.gateway;

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
public final class FlightCheckoutLoyaltyAccountJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_text;

    public final class Companion {
        public final C9hr<FlightCheckoutLoyaltyAccountJson> serializer() {
            return FlightCheckoutLoyaltyAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutLoyaltyAccountJson flightCheckoutLoyaltyAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || flightCheckoutLoyaltyAccountJson.display_text != null) {
            c9j5.AAP(flightCheckoutLoyaltyAccountJson.display_text, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FlightCheckoutLoyaltyAccountJson) && C7384Etj.areEqual(this.display_text, ((FlightCheckoutLoyaltyAccountJson) obj).display_text));
    }

    public static /* synthetic */ FlightCheckoutLoyaltyAccountJson copy$default(FlightCheckoutLoyaltyAccountJson flightCheckoutLoyaltyAccountJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutLoyaltyAccountJson.display_text;
        }
        return new FlightCheckoutLoyaltyAccountJson(str);
    }

    public final String component1() {
        return this.display_text;
    }

    public final FlightCheckoutLoyaltyAccountJson copy(String str) {
        return new FlightCheckoutLoyaltyAccountJson(str);
    }

    public final String getDisplay_text() {
        return this.display_text;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.display_text);
    }

    public /* synthetic */ FlightCheckoutLoyaltyAccountJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_text = null;
        } else {
            this.display_text = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FlightCheckoutLoyaltyAccountJson(String str) {
        this.display_text = str;
    }

    public /* synthetic */ FlightCheckoutLoyaltyAccountJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public FlightCheckoutLoyaltyAccountJson() {
        this(null);
    }
}
