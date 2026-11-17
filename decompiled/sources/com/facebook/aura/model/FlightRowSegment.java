package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowSegment extends C06G {
    public static final int $stable = 0;
    public final String aircraft;
    public final String airlineIcon;
    public final FlightTimestamp arrive;
    public final String carrier;
    public final FlightTimestamp depart;
    public final String duration;
    public final String flight;
    public final String from;
    public final String operatingCarrier;
    public final String operatingFlight;
    public final List<FlightRowSegmentPassenger> passengers;
    public final String to;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FlightRowSegment$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<FlightRowSegment> serializer() {
            return FlightRowSegment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowSegment) {
                FlightRowSegment flightRowSegment = (FlightRowSegment) obj;
                if (!C7384Etj.areEqual(this.from, flightRowSegment.from) || !C7384Etj.areEqual(this.to, flightRowSegment.to) || !C7384Etj.areEqual(this.depart, flightRowSegment.depart) || !C7384Etj.areEqual(this.arrive, flightRowSegment.arrive) || !C7384Etj.areEqual(this.duration, flightRowSegment.duration) || !C7384Etj.areEqual(this.flight, flightRowSegment.flight) || !C7384Etj.areEqual(this.carrier, flightRowSegment.carrier) || !C7384Etj.areEqual(this.airlineIcon, flightRowSegment.airlineIcon) || !C7384Etj.areEqual(this.operatingCarrier, flightRowSegment.operatingCarrier) || !C7384Etj.areEqual(this.operatingFlight, flightRowSegment.operatingFlight) || !C7384Etj.areEqual(this.passengers, flightRowSegment.passengers) || !C7384Etj.areEqual(this.aircraft, flightRowSegment.aircraft)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightRowSegment copy$default(FlightRowSegment flightRowSegment, String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightRowSegment.from;
        }
        if ((i & 2) != 0) {
            str2 = flightRowSegment.to;
        }
        if ((i & 4) != 0) {
            flightTimestamp = flightRowSegment.depart;
        }
        if ((i & 8) != 0) {
            flightTimestamp2 = flightRowSegment.arrive;
        }
        if ((i & 16) != 0) {
            str3 = flightRowSegment.duration;
        }
        if ((i & 32) != 0) {
            str4 = flightRowSegment.flight;
        }
        if ((i & 64) != 0) {
            str5 = flightRowSegment.carrier;
        }
        if ((i & 128) != 0) {
            str6 = flightRowSegment.airlineIcon;
        }
        if ((i & 256) != 0) {
            str7 = flightRowSegment.operatingCarrier;
        }
        if ((i & 512) != 0) {
            str8 = flightRowSegment.operatingFlight;
        }
        if ((i & 1024) != 0) {
            list = flightRowSegment.passengers;
        }
        if ((i & 2048) != 0) {
            str9 = flightRowSegment.aircraft;
        }
        return flightRowSegment.copy(str, str2, flightTimestamp, flightTimestamp2, str3, str4, str5, str6, str7, str8, list, str9);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowSegment flightRowSegment, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightRowSegment.from)) {
            c9j5.AAV(flightRowSegment.from, c9iZ, 0);
        }
        if (zAfR || !"".equals(flightRowSegment.to)) {
            c9j5.AAV(flightRowSegment.to, c9iZ, 1);
        }
        if (zAfR || flightRowSegment.depart != null) {
            c9j5.AAP(flightRowSegment.depart, FlightTimestamp$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || flightRowSegment.arrive != null) {
            c9j5.AAP(flightRowSegment.arrive, FlightTimestamp$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || flightRowSegment.duration != null) {
            c9j5.AAP(flightRowSegment.duration, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightRowSegment.flight != null) {
            c9j5.AAP(flightRowSegment.flight, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || flightRowSegment.carrier != null) {
            c9j5.AAP(flightRowSegment.carrier, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || flightRowSegment.airlineIcon != null) {
            c9j5.AAP(flightRowSegment.airlineIcon, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || flightRowSegment.operatingCarrier != null) {
            c9j5.AAP(flightRowSegment.operatingCarrier, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || flightRowSegment.operatingFlight != null) {
            c9j5.AAP(flightRowSegment.operatingFlight, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(flightRowSegment.passengers)) {
            c9j5.AAQ(flightRowSegment.passengers, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || flightRowSegment.aircraft != null) {
            c9j5.AAP(flightRowSegment.aircraft, C07779iq.A01, c9iZ, 11);
        }
    }

    public final String component1() {
        return this.from;
    }

    public final String component10() {
        return this.operatingFlight;
    }

    public final List<FlightRowSegmentPassenger> component11() {
        return this.passengers;
    }

    public final String component12() {
        return this.aircraft;
    }

    public final String component2() {
        return this.to;
    }

    public final FlightTimestamp component3() {
        return this.depart;
    }

    public final FlightTimestamp component4() {
        return this.arrive;
    }

    public final String component5() {
        return this.duration;
    }

    public final String component6() {
        return this.flight;
    }

    public final String component7() {
        return this.carrier;
    }

    public final String component8() {
        return this.airlineIcon;
    }

    public final String component9() {
        return this.operatingCarrier;
    }

    public final String getAircraft() {
        return this.aircraft;
    }

    public final String getAirlineIcon() {
        return this.airlineIcon;
    }

    public final FlightTimestamp getArrive() {
        return this.arrive;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final FlightTimestamp getDepart() {
        return this.depart;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFlight() {
        return this.flight;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getOperatingCarrier() {
        return this.operatingCarrier;
    }

    public final String getOperatingFlight() {
        return this.operatingFlight;
    }

    public final List<FlightRowSegmentPassenger> getPassengers() {
        return this.passengers;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.passengers, (((((((((((((((AnonymousClass005.A0I(this.to, AnonymousClass001.A0G(this.from)) + AnonymousClass006.A0D(this.depart)) * 31) + AnonymousClass006.A0D(this.arrive)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + AnonymousClass006.A0G(this.flight)) * 31) + AnonymousClass006.A0G(this.carrier)) * 31) + AnonymousClass006.A0G(this.airlineIcon)) * 31) + AnonymousClass006.A0G(this.operatingCarrier)) * 31) + AnonymousClass006.A0G(this.operatingFlight)) * 31) + AnonymousClass005.A0H(this.aircraft);
    }

    public FlightRowSegment(String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, String str4, String str5, String str6, String str7, String str8, List<FlightRowSegmentPassenger> list, String str9) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 10);
        this.from = str;
        this.to = str2;
        this.depart = flightTimestamp;
        this.arrive = flightTimestamp2;
        this.duration = str3;
        this.flight = str4;
        this.carrier = str5;
        this.airlineIcon = str6;
        this.operatingCarrier = str7;
        this.operatingFlight = str8;
        this.passengers = list;
        this.aircraft = str9;
    }

    public final FlightRowSegment copy(String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, String str4, String str5, String str6, String str7, String str8, List<FlightRowSegmentPassenger> list, String str9) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 10);
        return new FlightRowSegment(str, str2, flightTimestamp, flightTimestamp2, str3, str4, str5, str6, str7, str8, list, str9);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowSegment(String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : flightTimestamp, (i & 8) != 0 ? null : flightTimestamp2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? C0881AGi.A00 : list, (i & 2048) != 0 ? null : str9);
    }

    public /* synthetic */ FlightRowSegment(int i, String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.depart = null;
        } else {
            this.depart = flightTimestamp;
        }
        if ((i & 8) == 0) {
            this.arrive = null;
        } else {
            this.arrive = flightTimestamp2;
        }
        if ((i & 16) == 0) {
            this.duration = null;
        } else {
            this.duration = str3;
        }
        if ((i & 32) == 0) {
            this.flight = null;
        } else {
            this.flight = str4;
        }
        if ((i & 64) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str5;
        }
        if ((i & 128) == 0) {
            this.airlineIcon = null;
        } else {
            this.airlineIcon = str6;
        }
        if ((i & 256) == 0) {
            this.operatingCarrier = null;
        } else {
            this.operatingCarrier = str7;
        }
        if ((i & 512) == 0) {
            this.operatingFlight = null;
        } else {
            this.operatingFlight = str8;
        }
        if ((i & 1024) == 0) {
            this.passengers = C0881AGi.A00;
        } else {
            this.passengers = list;
        }
        if ((i & 2048) == 0) {
            this.aircraft = null;
        } else {
            this.aircraft = str9;
        }
    }

    public FlightRowSegment() {
        this("", "", null, null, null, null, null, null, null, null, C0881AGi.A00, null);
    }
}
