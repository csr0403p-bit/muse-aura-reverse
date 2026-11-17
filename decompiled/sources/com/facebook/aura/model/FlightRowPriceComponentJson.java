package com.facebook.aura.model;

import X.AnonymousClass002;
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
public final class FlightRowPriceComponentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String price;
    public final String price_per_passenger;
    public final String type;

    public final class Companion {
        public final C9hr<FlightRowPriceComponentJson> serializer() {
            return FlightRowPriceComponentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowPriceComponentJson flightRowPriceComponentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightRowPriceComponentJson.type != null) {
            c9j5.AAP(flightRowPriceComponentJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightRowPriceComponentJson.price != null) {
            c9j5.AAP(flightRowPriceComponentJson.price, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || flightRowPriceComponentJson.price_per_passenger != null) {
            c9j5.AAP(flightRowPriceComponentJson.price_per_passenger, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowPriceComponentJson) {
                FlightRowPriceComponentJson flightRowPriceComponentJson = (FlightRowPriceComponentJson) obj;
                if (!C7384Etj.areEqual(this.type, flightRowPriceComponentJson.type) || !C7384Etj.areEqual(this.price, flightRowPriceComponentJson.price) || !C7384Etj.areEqual(this.price_per_passenger, flightRowPriceComponentJson.price_per_passenger)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightRowPriceComponentJson copy$default(FlightRowPriceComponentJson flightRowPriceComponentJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightRowPriceComponentJson.type;
        }
        if ((i & 2) != 0) {
            str2 = flightRowPriceComponentJson.price;
        }
        if ((i & 4) != 0) {
            str3 = flightRowPriceComponentJson.price_per_passenger;
        }
        return new FlightRowPriceComponentJson(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.price;
    }

    public final String component3() {
        return this.price_per_passenger;
    }

    public final FlightRowPriceComponentJson copy(String str, String str2, String str3) {
        return new FlightRowPriceComponentJson(str, str2, str3);
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPrice_per_passenger() {
        return this.price_per_passenger;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass005.A0H(this.price_per_passenger);
    }

    public final FlightRowPriceComponent toDomainOrNull() {
        String strA0l;
        String strA0l2;
        String strA0l3;
        String str = this.price;
        String str2 = null;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        String str3 = this.type;
        if (str3 == null || (strA0l2 = AnonymousClass002.A0l(str3)) == null) {
            strA0l2 = "";
        }
        String str4 = this.price_per_passenger;
        if (str4 != null && (strA0l3 = AnonymousClass002.A0l(str4)) != null && strA0l3.length() > 0) {
            str2 = strA0l3;
        }
        return new FlightRowPriceComponent(strA0l2, strA0l, str2);
    }

    public FlightRowPriceComponentJson(String str, String str2, String str3) {
        this.type = str;
        this.price = str2;
        this.price_per_passenger = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowPriceComponentJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.price = null;
        } else {
            this.price = str2;
        }
        if ((i & 4) == 0) {
            this.price_per_passenger = null;
        } else {
            this.price_per_passenger = str3;
        }
    }

    public /* synthetic */ FlightRowPriceComponentJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public FlightRowPriceComponentJson() {
        this(null, null, null);
    }
}
