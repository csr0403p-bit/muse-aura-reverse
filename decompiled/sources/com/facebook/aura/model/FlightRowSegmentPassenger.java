package com.facebook.aura.model;

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
public final class FlightRowSegmentPassenger extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FlightRowBags bags;
    public final String cabin;

    public final class Companion {
        public final C9hr<FlightRowSegmentPassenger> serializer() {
            return FlightRowSegmentPassenger$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowSegmentPassenger flightRowSegmentPassenger, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightRowSegmentPassenger.cabin != null) {
            c9j5.AAP(flightRowSegmentPassenger.cabin, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightRowSegmentPassenger.bags != null) {
            c9j5.AAP(flightRowSegmentPassenger.bags, FlightRowBags$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowSegmentPassenger) {
                FlightRowSegmentPassenger flightRowSegmentPassenger = (FlightRowSegmentPassenger) obj;
                if (!C7384Etj.areEqual(this.cabin, flightRowSegmentPassenger.cabin) || !C7384Etj.areEqual(this.bags, flightRowSegmentPassenger.bags)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightRowSegmentPassenger copy$default(FlightRowSegmentPassenger flightRowSegmentPassenger, String str, FlightRowBags flightRowBags, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightRowSegmentPassenger.cabin;
        }
        if ((i & 2) != 0) {
            flightRowBags = flightRowSegmentPassenger.bags;
        }
        return new FlightRowSegmentPassenger(str, flightRowBags);
    }

    public final String component1() {
        return this.cabin;
    }

    public final FlightRowBags component2() {
        return this.bags;
    }

    public final FlightRowSegmentPassenger copy(String str, FlightRowBags flightRowBags) {
        return new FlightRowSegmentPassenger(str, flightRowBags);
    }

    public final FlightRowBags getBags() {
        return this.bags;
    }

    public final String getCabin() {
        return this.cabin;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.cabin) * 31) + C3cH.A02(this.bags);
    }

    public FlightRowSegmentPassenger(String str, FlightRowBags flightRowBags) {
        this.cabin = str;
        this.bags = flightRowBags;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowSegmentPassenger(int i, String str, FlightRowBags flightRowBags, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.cabin = null;
        } else {
            this.cabin = str;
        }
        if ((i & 2) == 0) {
            this.bags = null;
        } else {
            this.bags = flightRowBags;
        }
    }

    public /* synthetic */ FlightRowSegmentPassenger(String str, FlightRowBags flightRowBags, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : flightRowBags);
    }

    public FlightRowSegmentPassenger() {
        this(null, null);
    }
}
