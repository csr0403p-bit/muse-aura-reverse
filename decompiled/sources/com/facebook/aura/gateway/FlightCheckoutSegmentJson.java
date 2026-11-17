package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutSegmentJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String airline_icon;
    public final String arriving_display;
    public final List<FlightCheckoutBaggageJson> baggage;
    public final String departing_at_local;
    public final String departing_display;
    public final List<FlightCheckoutDetailRowJson> detail_rows;
    public final String flight_display;
    public final FlightCheckoutCarrierJson marketing_carrier;
    public final String marketing_flight_number;
    public final List<FlightCheckoutSeatAssignmentJson> seat_assignments;
    public final String seats_display;
    public final String title;

    public final class Companion {
        public final C9hr<FlightCheckoutSegmentJson> serializer() {
            return FlightCheckoutSegmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, AbstractC5321DgF.A02(num, FlightCheckoutSegmentJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, FlightCheckoutSegmentJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, FlightCheckoutSegmentJson$Companion$$childSerializers$3.INSTANCE), null, null, null};
    }

    public FlightCheckoutSegmentJson(String str, String str2, String str3, String str4, String str5, List<FlightCheckoutDetailRowJson> list, String str6, List<FlightCheckoutSeatAssignmentJson> list2, List<FlightCheckoutBaggageJson> list3, String str7, FlightCheckoutCarrierJson flightCheckoutCarrierJson, String str8) {
        AnonymousClass005.A13(list, list2, list3, 5);
        this.title = str;
        this.departing_display = str2;
        this.arriving_display = str3;
        this.seats_display = str4;
        this.flight_display = str5;
        this.detail_rows = list;
        this.airline_icon = str6;
        this.seat_assignments = list2;
        this.baggage = list3;
        this.departing_at_local = str7;
        this.marketing_carrier = flightCheckoutCarrierJson;
        this.marketing_flight_number = str8;
    }

    public final FlightCheckoutSegmentJson copy(String str, String str2, String str3, String str4, String str5, List<FlightCheckoutDetailRowJson> list, String str6, List<FlightCheckoutSeatAssignmentJson> list2, List<FlightCheckoutBaggageJson> list3, String str7, FlightCheckoutCarrierJson flightCheckoutCarrierJson, String str8) {
        AnonymousClass005.A13(list, list2, list3, 5);
        return new FlightCheckoutSegmentJson(str, str2, str3, str4, str5, list, str6, list2, list3, str7, flightCheckoutCarrierJson, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutSegmentJson) {
                FlightCheckoutSegmentJson flightCheckoutSegmentJson = (FlightCheckoutSegmentJson) obj;
                if (!C7384Etj.areEqual(this.title, flightCheckoutSegmentJson.title) || !C7384Etj.areEqual(this.departing_display, flightCheckoutSegmentJson.departing_display) || !C7384Etj.areEqual(this.arriving_display, flightCheckoutSegmentJson.arriving_display) || !C7384Etj.areEqual(this.seats_display, flightCheckoutSegmentJson.seats_display) || !C7384Etj.areEqual(this.flight_display, flightCheckoutSegmentJson.flight_display) || !C7384Etj.areEqual(this.detail_rows, flightCheckoutSegmentJson.detail_rows) || !C7384Etj.areEqual(this.airline_icon, flightCheckoutSegmentJson.airline_icon) || !C7384Etj.areEqual(this.seat_assignments, flightCheckoutSegmentJson.seat_assignments) || !C7384Etj.areEqual(this.baggage, flightCheckoutSegmentJson.baggage) || !C7384Etj.areEqual(this.departing_at_local, flightCheckoutSegmentJson.departing_at_local) || !C7384Etj.areEqual(this.marketing_carrier, flightCheckoutSegmentJson.marketing_carrier) || !C7384Etj.areEqual(this.marketing_flight_number, flightCheckoutSegmentJson.marketing_flight_number)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightCheckoutSegmentJson copy$default(FlightCheckoutSegmentJson flightCheckoutSegmentJson, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, FlightCheckoutCarrierJson flightCheckoutCarrierJson, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutSegmentJson.title;
        }
        if ((i & 2) != 0) {
            str2 = flightCheckoutSegmentJson.departing_display;
        }
        if ((i & 4) != 0) {
            str3 = flightCheckoutSegmentJson.arriving_display;
        }
        if ((i & 8) != 0) {
            str4 = flightCheckoutSegmentJson.seats_display;
        }
        if ((i & 16) != 0) {
            str5 = flightCheckoutSegmentJson.flight_display;
        }
        if ((i & 32) != 0) {
            list = flightCheckoutSegmentJson.detail_rows;
        }
        if ((i & 64) != 0) {
            str6 = flightCheckoutSegmentJson.airline_icon;
        }
        if ((i & 128) != 0) {
            list2 = flightCheckoutSegmentJson.seat_assignments;
        }
        if ((i & 256) != 0) {
            list3 = flightCheckoutSegmentJson.baggage;
        }
        if ((i & 512) != 0) {
            str7 = flightCheckoutSegmentJson.departing_at_local;
        }
        if ((i & 1024) != 0) {
            flightCheckoutCarrierJson = flightCheckoutSegmentJson.marketing_carrier;
        }
        if ((i & 2048) != 0) {
            str8 = flightCheckoutSegmentJson.marketing_flight_number;
        }
        return flightCheckoutSegmentJson.copy(str, str2, str3, str4, str5, list, str6, list2, list3, str7, flightCheckoutCarrierJson, str8);
    }

    private final String flightNumber() {
        String str;
        String strTrimToNonEmpty;
        String str2;
        String strTrimToNonEmpty2;
        FlightCheckoutCarrierJson flightCheckoutCarrierJson = this.marketing_carrier;
        if (flightCheckoutCarrierJson == null || (str = flightCheckoutCarrierJson.iata_code) == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null || (str2 = this.marketing_flight_number) == null || (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) == null) {
            return null;
        }
        return FGI.A0U(strTrimToNonEmpty, InviteCodeScratcherKt.CODE_SEPARATOR, strTrimToNonEmpty2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutSegmentJson flightCheckoutSegmentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutSegmentJson.title != null) {
            c9j5.AAP(flightCheckoutSegmentJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutSegmentJson.departing_display != null) {
            c9j5.AAP(flightCheckoutSegmentJson.departing_display, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || flightCheckoutSegmentJson.arriving_display != null) {
            c9j5.AAP(flightCheckoutSegmentJson.arriving_display, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightCheckoutSegmentJson.seats_display != null) {
            c9j5.AAP(flightCheckoutSegmentJson.seats_display, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || flightCheckoutSegmentJson.flight_display != null) {
            c9j5.AAP(flightCheckoutSegmentJson.flight_display, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutSegmentJson.detail_rows)) {
            c9j5.AAQ(flightCheckoutSegmentJson.detail_rows, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || flightCheckoutSegmentJson.airline_icon != null) {
            c9j5.AAP(flightCheckoutSegmentJson.airline_icon, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutSegmentJson.seat_assignments)) {
            c9j5.AAQ(flightCheckoutSegmentJson.seat_assignments, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutSegmentJson.baggage)) {
            c9j5.AAQ(flightCheckoutSegmentJson.baggage, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || flightCheckoutSegmentJson.departing_at_local != null) {
            c9j5.AAP(flightCheckoutSegmentJson.departing_at_local, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || flightCheckoutSegmentJson.marketing_carrier != null) {
            c9j5.AAP(flightCheckoutSegmentJson.marketing_carrier, FlightCheckoutCarrierJson$$serializer.INSTANCE, c9iZ, 10);
        }
        if (zAfR || flightCheckoutSegmentJson.marketing_flight_number != null) {
            c9j5.AAP(flightCheckoutSegmentJson.marketing_flight_number, C07779iq.A01, c9iZ, 11);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.departing_at_local;
    }

    public final FlightCheckoutCarrierJson component11() {
        return this.marketing_carrier;
    }

    public final String component12() {
        return this.marketing_flight_number;
    }

    public final String component2() {
        return this.departing_display;
    }

    public final String component3() {
        return this.arriving_display;
    }

    public final String component4() {
        return this.seats_display;
    }

    public final String component5() {
        return this.flight_display;
    }

    public final List<FlightCheckoutDetailRowJson> component6() {
        return this.detail_rows;
    }

    public final String component7() {
        return this.airline_icon;
    }

    public final List<FlightCheckoutSeatAssignmentJson> component8() {
        return this.seat_assignments;
    }

    public final List<FlightCheckoutBaggageJson> component9() {
        return this.baggage;
    }

    public final String getAirline_icon() {
        return this.airline_icon;
    }

    public final String getArriving_display() {
        return this.arriving_display;
    }

    public final List<FlightCheckoutBaggageJson> getBaggage() {
        return this.baggage;
    }

    public final String getDeparting_at_local() {
        return this.departing_at_local;
    }

    public final String getDeparting_display() {
        return this.departing_display;
    }

    public final List<FlightCheckoutDetailRowJson> getDetail_rows() {
        return this.detail_rows;
    }

    public final String getFlight_display() {
        return this.flight_display;
    }

    public final FlightCheckoutCarrierJson getMarketing_carrier() {
        return this.marketing_carrier;
    }

    public final String getMarketing_flight_number() {
        return this.marketing_flight_number;
    }

    public final List<FlightCheckoutSeatAssignmentJson> getSeat_assignments() {
        return this.seat_assignments;
    }

    public final String getSeats_display() {
        return this.seats_display;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.baggage, AnonymousClass005.A0F(this.seat_assignments, (AnonymousClass005.A0F(this.detail_rows, ((((((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.departing_display)) * 31) + AnonymousClass006.A0G(this.arriving_display)) * 31) + AnonymousClass006.A0G(this.seats_display)) * 31) + AnonymousClass006.A0G(this.flight_display)) * 31) + AnonymousClass006.A0G(this.airline_icon)) * 31)) + AnonymousClass006.A0G(this.departing_at_local)) * 31) + AnonymousClass006.A0D(this.marketing_carrier)) * 31) + AnonymousClass005.A0H(this.marketing_flight_number);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutSegment toDomain() {
        LocalDate localDate;
        Object objA0s;
        LocalDate localDate2;
        String str;
        String str2 = this.title;
        String str3 = this.departing_display;
        String str4 = this.arriving_display;
        String str5 = this.seats_display;
        String str6 = this.flight_display;
        List<FlightCheckoutDetailRowJson> list = this.detail_rows;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<FlightCheckoutDetailRowJson> it = list.iterator();
        while (it.hasNext()) {
            HatchAgentPermissionsRepository.FlightCheckoutDetailRow domainOrNull = it.next().toDomainOrNull();
            if (domainOrNull != null) {
                arrayListA0h.add(domainOrNull);
            }
        }
        String str7 = this.airline_icon;
        List<FlightCheckoutSeatAssignmentJson> list2 = this.seat_assignments;
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<FlightCheckoutSeatAssignmentJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            HatchAgentPermissionsRepository.FlightCheckoutSeatAssignment domainOrNull2 = it2.next().toDomainOrNull();
            if (domainOrNull2 != null) {
                arrayListA0h2.add(domainOrNull2);
            }
        }
        List<FlightCheckoutBaggageJson> list3 = this.baggage;
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator<FlightCheckoutBaggageJson> it3 = list3.iterator();
        while (it3.hasNext()) {
            HatchAgentPermissionsRepository.FlightCheckoutBaggage domainOrNull3 = it3.next().toDomainOrNull();
            if (domainOrNull3 != null) {
                arrayListA0h3.add(domainOrNull3);
            }
        }
        FlightCheckoutCarrierJson flightCheckoutCarrierJson = this.marketing_carrier;
        String strTrimToNonEmpty = null;
        if (flightCheckoutCarrierJson == null || (str = flightCheckoutCarrierJson.name) == null) {
            localDate = null;
        } else {
            localDate = null;
            strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str);
        }
        String strFlightNumber = flightNumber();
        String str8 = this.departing_at_local;
        if (str8 != null) {
            try {
                objA0s = LocalDateTime.parse(str8).toLocalDate();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = localDate;
            }
            localDate2 = (LocalDate) objA0s;
        } else {
            localDate2 = localDate;
        }
        return new HatchAgentPermissionsRepository.FlightCheckoutSegment(str2, str3, str4, str5, str6, arrayListA0h, str7, arrayListA0h2, arrayListA0h3, strTrimToNonEmpty, strFlightNumber, localDate2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutSegmentJson(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, FlightCheckoutCarrierJson flightCheckoutCarrierJson, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? C0881AGi.A00 : list, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? C0881AGi.A00 : list2, (i & 256) != 0 ? C0881AGi.A00 : list3, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : flightCheckoutCarrierJson, (i & 2048) != 0 ? null : str8);
    }

    public /* synthetic */ FlightCheckoutSegmentJson(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, FlightCheckoutCarrierJson flightCheckoutCarrierJson, String str8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.departing_display = null;
        } else {
            this.departing_display = str2;
        }
        if ((i & 4) == 0) {
            this.arriving_display = null;
        } else {
            this.arriving_display = str3;
        }
        if ((i & 8) == 0) {
            this.seats_display = null;
        } else {
            this.seats_display = str4;
        }
        if ((i & 16) == 0) {
            this.flight_display = null;
        } else {
            this.flight_display = str5;
        }
        if ((i & 32) == 0) {
            this.detail_rows = C0881AGi.A00;
        } else {
            this.detail_rows = list;
        }
        if ((i & 64) == 0) {
            this.airline_icon = null;
        } else {
            this.airline_icon = str6;
        }
        if ((i & 128) == 0) {
            this.seat_assignments = C0881AGi.A00;
        } else {
            this.seat_assignments = list2;
        }
        if ((i & 256) == 0) {
            this.baggage = C0881AGi.A00;
        } else {
            this.baggage = list3;
        }
        if ((i & 512) == 0) {
            this.departing_at_local = null;
        } else {
            this.departing_at_local = str7;
        }
        if ((i & 1024) == 0) {
            this.marketing_carrier = null;
        } else {
            this.marketing_carrier = flightCheckoutCarrierJson;
        }
        if ((i & 2048) == 0) {
            this.marketing_flight_number = null;
        } else {
            this.marketing_flight_number = str8;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FlightCheckoutSegmentJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, null, null, null, c0881AGi, null, c0881AGi, c0881AGi, null, null, null);
    }
}
