package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowSegmentJson extends C06G {
    public static final int $stable = 8;
    public final String aircraft;
    public final String airline_icon;
    public final FlightTimestampJson arrive;
    public final String carrier;
    public final FlightTimestampJson depart;
    public final String duration;
    public final String flight;
    public final String from;
    public final String operating_carrier;
    public final String operating_flight;
    public final List<FlightRowSegmentPassengerJson> passengers;
    public final String to;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FlightRowSegmentJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<FlightRowSegmentJson> serializer() {
            return FlightRowSegmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowSegmentJson) {
                FlightRowSegmentJson flightRowSegmentJson = (FlightRowSegmentJson) obj;
                if (!C7384Etj.areEqual(this.from, flightRowSegmentJson.from) || !C7384Etj.areEqual(this.to, flightRowSegmentJson.to) || !C7384Etj.areEqual(this.depart, flightRowSegmentJson.depart) || !C7384Etj.areEqual(this.arrive, flightRowSegmentJson.arrive) || !C7384Etj.areEqual(this.duration, flightRowSegmentJson.duration) || !C7384Etj.areEqual(this.flight, flightRowSegmentJson.flight) || !C7384Etj.areEqual(this.carrier, flightRowSegmentJson.carrier) || !C7384Etj.areEqual(this.airline_icon, flightRowSegmentJson.airline_icon) || !C7384Etj.areEqual(this.operating_carrier, flightRowSegmentJson.operating_carrier) || !C7384Etj.areEqual(this.operating_flight, flightRowSegmentJson.operating_flight) || !C7384Etj.areEqual(this.passengers, flightRowSegmentJson.passengers) || !C7384Etj.areEqual(this.aircraft, flightRowSegmentJson.aircraft)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightRowSegmentJson copy$default(FlightRowSegmentJson flightRowSegmentJson, String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightRowSegmentJson.from;
        }
        if ((i & 2) != 0) {
            str2 = flightRowSegmentJson.to;
        }
        if ((i & 4) != 0) {
            flightTimestampJson = flightRowSegmentJson.depart;
        }
        if ((i & 8) != 0) {
            flightTimestampJson2 = flightRowSegmentJson.arrive;
        }
        if ((i & 16) != 0) {
            str3 = flightRowSegmentJson.duration;
        }
        if ((i & 32) != 0) {
            str4 = flightRowSegmentJson.flight;
        }
        if ((i & 64) != 0) {
            str5 = flightRowSegmentJson.carrier;
        }
        if ((i & 128) != 0) {
            str6 = flightRowSegmentJson.airline_icon;
        }
        if ((i & 256) != 0) {
            str7 = flightRowSegmentJson.operating_carrier;
        }
        if ((i & 512) != 0) {
            str8 = flightRowSegmentJson.operating_flight;
        }
        if ((i & 1024) != 0) {
            list = flightRowSegmentJson.passengers;
        }
        if ((i & 2048) != 0) {
            str9 = flightRowSegmentJson.aircraft;
        }
        return flightRowSegmentJson.copy(str, str2, flightTimestampJson, flightTimestampJson2, str3, str4, str5, str6, str7, str8, list, str9);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowSegmentJson flightRowSegmentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightRowSegmentJson.from)) {
            c9j5.AAV(flightRowSegmentJson.from, c9iZ, 0);
        }
        if (zAfR || !"".equals(flightRowSegmentJson.to)) {
            c9j5.AAV(flightRowSegmentJson.to, c9iZ, 1);
        }
        if (zAfR || flightRowSegmentJson.depart != null) {
            c9j5.AAP(flightRowSegmentJson.depart, FlightTimestampJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || flightRowSegmentJson.arrive != null) {
            c9j5.AAP(flightRowSegmentJson.arrive, FlightTimestampJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || flightRowSegmentJson.duration != null) {
            c9j5.AAP(flightRowSegmentJson.duration, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightRowSegmentJson.flight != null) {
            c9j5.AAP(flightRowSegmentJson.flight, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || flightRowSegmentJson.carrier != null) {
            c9j5.AAP(flightRowSegmentJson.carrier, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || flightRowSegmentJson.airline_icon != null) {
            c9j5.AAP(flightRowSegmentJson.airline_icon, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || flightRowSegmentJson.operating_carrier != null) {
            c9j5.AAP(flightRowSegmentJson.operating_carrier, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || flightRowSegmentJson.operating_flight != null) {
            c9j5.AAP(flightRowSegmentJson.operating_flight, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(flightRowSegmentJson.passengers)) {
            c9j5.AAQ(flightRowSegmentJson.passengers, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || flightRowSegmentJson.aircraft != null) {
            c9j5.AAP(flightRowSegmentJson.aircraft, C07779iq.A01, c9iZ, 11);
        }
    }

    public final String component1() {
        return this.from;
    }

    public final String component10() {
        return this.operating_flight;
    }

    public final List<FlightRowSegmentPassengerJson> component11() {
        return this.passengers;
    }

    public final String component12() {
        return this.aircraft;
    }

    public final String component2() {
        return this.to;
    }

    public final FlightTimestampJson component3() {
        return this.depart;
    }

    public final FlightTimestampJson component4() {
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
        return this.airline_icon;
    }

    public final String component9() {
        return this.operating_carrier;
    }

    public final String getAircraft() {
        return this.aircraft;
    }

    public final String getAirline_icon() {
        return this.airline_icon;
    }

    public final FlightTimestampJson getArrive() {
        return this.arrive;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final FlightTimestampJson getDepart() {
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

    public final String getOperating_carrier() {
        return this.operating_carrier;
    }

    public final String getOperating_flight() {
        return this.operating_flight;
    }

    public final List<FlightRowSegmentPassengerJson> getPassengers() {
        return this.passengers;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.passengers, (((((((((((((((AnonymousClass005.A0I(this.to, AnonymousClass001.A0G(this.from)) + AnonymousClass006.A0D(this.depart)) * 31) + AnonymousClass006.A0D(this.arrive)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + AnonymousClass006.A0G(this.flight)) * 31) + AnonymousClass006.A0G(this.carrier)) * 31) + AnonymousClass006.A0G(this.airline_icon)) * 31) + AnonymousClass006.A0G(this.operating_carrier)) * 31) + AnonymousClass006.A0G(this.operating_flight)) * 31) + AnonymousClass005.A0H(this.aircraft);
    }

    public final FlightRowSegment toDomain() {
        FlightTimestamp domain;
        FlightTimestampJson flightTimestampJson;
        FlightTimestamp domain2;
        String strA0l;
        String strA0l2;
        String strA0l3;
        String strA0l4;
        String strA0l5;
        String strA0l6;
        String strA0l7;
        FlightTimestampJson flightTimestampJson2 = this.depart;
        if (flightTimestampJson2 == null || (domain = flightTimestampJson2.toDomain()) == null || (flightTimestampJson = this.arrive) == null || (domain2 = flightTimestampJson.toDomain()) == null) {
            return null;
        }
        String strA0l8 = AnonymousClass002.A0l(this.from);
        String strA0l9 = AnonymousClass002.A0l(this.to);
        String str = this.duration;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str2 = this.flight;
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        String str3 = this.carrier;
        if (str3 == null || (strA0l3 = AnonymousClass002.A0l(str3)) == null || strA0l3.length() <= 0) {
            strA0l3 = null;
        }
        String str4 = this.airline_icon;
        if (str4 == null || (strA0l4 = AnonymousClass002.A0l(str4)) == null || strA0l4.length() <= 0) {
            strA0l4 = null;
        }
        String str5 = this.operating_carrier;
        if (str5 == null || (strA0l5 = AnonymousClass002.A0l(str5)) == null || strA0l5.length() <= 0) {
            strA0l5 = null;
        }
        String str6 = this.operating_flight;
        if (str6 == null || (strA0l6 = AnonymousClass002.A0l(str6)) == null || strA0l6.length() <= 0) {
            strA0l6 = null;
        }
        List<FlightRowSegmentPassengerJson> list = this.passengers;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FlightRowSegmentPassengerJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        String str7 = this.aircraft;
        if (str7 == null || (strA0l7 = AnonymousClass002.A0l(str7)) == null || strA0l7.length() <= 0) {
            strA0l7 = null;
        }
        return new FlightRowSegment(strA0l8, strA0l9, domain, domain2, strA0l, strA0l2, strA0l3, strA0l4, strA0l5, strA0l6, arrayListA0i, strA0l7);
    }

    public FlightRowSegmentJson(String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, String str4, String str5, String str6, String str7, String str8, List<FlightRowSegmentPassengerJson> list, String str9) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 10);
        this.from = str;
        this.to = str2;
        this.depart = flightTimestampJson;
        this.arrive = flightTimestampJson2;
        this.duration = str3;
        this.flight = str4;
        this.carrier = str5;
        this.airline_icon = str6;
        this.operating_carrier = str7;
        this.operating_flight = str8;
        this.passengers = list;
        this.aircraft = str9;
    }

    public final FlightRowSegmentJson copy(String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, String str4, String str5, String str6, String str7, String str8, List<FlightRowSegmentPassengerJson> list, String str9) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 10);
        return new FlightRowSegmentJson(str, str2, flightTimestampJson, flightTimestampJson2, str3, str4, str5, str6, str7, str8, list, str9);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowSegmentJson(String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : flightTimestampJson, (i & 8) != 0 ? null : flightTimestampJson2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? C0881AGi.A00 : list, (i & 2048) != 0 ? null : str9);
    }

    public /* synthetic */ FlightRowSegmentJson(int i, String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, C2hx c2hx) {
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
            this.depart = flightTimestampJson;
        }
        if ((i & 8) == 0) {
            this.arrive = null;
        } else {
            this.arrive = flightTimestampJson2;
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
            this.airline_icon = null;
        } else {
            this.airline_icon = str6;
        }
        if ((i & 256) == 0) {
            this.operating_carrier = null;
        } else {
            this.operating_carrier = str7;
        }
        if ((i & 512) == 0) {
            this.operating_flight = null;
        } else {
            this.operating_flight = str8;
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

    public FlightRowSegmentJson() {
        this("", "", null, null, null, null, null, null, null, null, C0881AGi.A00, null);
    }
}
