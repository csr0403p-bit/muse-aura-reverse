package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
public final class FlightRowSegmentPassengerJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FlightRowBagsJson bags;
    public final String cabin;

    public final class Companion {
        public final C9hr<FlightRowSegmentPassengerJson> serializer() {
            return FlightRowSegmentPassengerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowSegmentPassengerJson flightRowSegmentPassengerJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightRowSegmentPassengerJson.cabin != null) {
            c9j5.AAP(flightRowSegmentPassengerJson.cabin, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightRowSegmentPassengerJson.bags != null) {
            c9j5.AAP(flightRowSegmentPassengerJson.bags, FlightRowBagsJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowSegmentPassengerJson) {
                FlightRowSegmentPassengerJson flightRowSegmentPassengerJson = (FlightRowSegmentPassengerJson) obj;
                if (!C7384Etj.areEqual(this.cabin, flightRowSegmentPassengerJson.cabin) || !C7384Etj.areEqual(this.bags, flightRowSegmentPassengerJson.bags)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightRowSegmentPassengerJson copy$default(FlightRowSegmentPassengerJson flightRowSegmentPassengerJson, String str, FlightRowBagsJson flightRowBagsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightRowSegmentPassengerJson.cabin;
        }
        if ((i & 2) != 0) {
            flightRowBagsJson = flightRowSegmentPassengerJson.bags;
        }
        return new FlightRowSegmentPassengerJson(str, flightRowBagsJson);
    }

    public final String component1() {
        return this.cabin;
    }

    public final FlightRowBagsJson component2() {
        return this.bags;
    }

    public final FlightRowSegmentPassengerJson copy(String str, FlightRowBagsJson flightRowBagsJson) {
        return new FlightRowSegmentPassengerJson(str, flightRowBagsJson);
    }

    public final FlightRowBagsJson getBags() {
        return this.bags;
    }

    public final String getCabin() {
        return this.cabin;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.cabin) * 31) + C3cH.A02(this.bags);
    }

    public final FlightRowSegmentPassenger toDomain() {
        String strA0l;
        String str = this.cabin;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        FlightRowBagsJson flightRowBagsJson = this.bags;
        return new FlightRowSegmentPassenger(strA0l, flightRowBagsJson != null ? flightRowBagsJson.toDomain() : null);
    }

    public FlightRowSegmentPassengerJson(String str, FlightRowBagsJson flightRowBagsJson) {
        this.cabin = str;
        this.bags = flightRowBagsJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowSegmentPassengerJson(int i, String str, FlightRowBagsJson flightRowBagsJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.cabin = null;
        } else {
            this.cabin = str;
        }
        if ((i & 2) == 0) {
            this.bags = null;
        } else {
            this.bags = flightRowBagsJson;
        }
    }

    public /* synthetic */ FlightRowSegmentPassengerJson(String str, FlightRowBagsJson flightRowBagsJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : flightRowBagsJson);
    }

    public FlightRowSegmentPassengerJson() {
        this(null, null);
    }
}
