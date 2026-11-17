package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowFlightDataJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String airline;
    public final boolean baggage_varies;
    public final FlightRowBagsJson bags;
    public final String change_penalty;
    public final String change_penalty_status;
    public final String changeable;
    public final String cta_text;
    public final String duration;
    public final String flight_link;
    public final String from_price;
    public final String from_price_per_passenger;
    public final String id;
    public final List<JsonElement> passengers;
    public final String price;
    public final List<FlightRowPriceComponentJson> price_breakdown;
    public final String price_per_passenger;
    public final String refund_penalty;
    public final String refund_penalty_status;
    public final String refundable;
    public final String response_message;
    public final String selection_stage;
    public final List<FlightRowSliceJson> slices;
    public final int stops;

    public final class Companion {
        public final C9hr<FlightRowFlightDataJson> serializer() {
            return FlightRowFlightDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, AbstractC5321DgF.A02(num, FlightRowFlightDataJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, FlightRowFlightDataJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, FlightRowFlightDataJson$Companion$$childSerializers$3.INSTANCE)};
    }

    public final FlightRowFlightDataJson copy(String str, String str2, String str3, String str4, int i, List<FlightRowSliceJson> list, FlightRowBagsJson flightRowBagsJson, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<? extends JsonElement> list2, String str14, String str15, String str16, String str17, List<FlightRowPriceComponentJson> list3) {
        AnonymousClass002.A1D(str, 0, list);
        C3cI.A1I(str11, 14, list2);
        C7384Etj.A0Y(list3, 22);
        return new FlightRowFlightDataJson(str, str2, str3, str4, i, list, flightRowBagsJson, z, str5, str6, str7, str8, str9, str10, str11, str12, str13, list2, str14, str15, str16, str17, list3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowFlightDataJson) {
                FlightRowFlightDataJson flightRowFlightDataJson = (FlightRowFlightDataJson) obj;
                if (!C7384Etj.areEqual(this.id, flightRowFlightDataJson.id) || !C7384Etj.areEqual(this.airline, flightRowFlightDataJson.airline) || !C7384Etj.areEqual(this.price, flightRowFlightDataJson.price) || !C7384Etj.areEqual(this.duration, flightRowFlightDataJson.duration) || this.stops != flightRowFlightDataJson.stops || !C7384Etj.areEqual(this.slices, flightRowFlightDataJson.slices) || !C7384Etj.areEqual(this.bags, flightRowFlightDataJson.bags) || this.baggage_varies != flightRowFlightDataJson.baggage_varies || !C7384Etj.areEqual(this.refundable, flightRowFlightDataJson.refundable) || !C7384Etj.areEqual(this.changeable, flightRowFlightDataJson.changeable) || !C7384Etj.areEqual(this.refund_penalty, flightRowFlightDataJson.refund_penalty) || !C7384Etj.areEqual(this.change_penalty, flightRowFlightDataJson.change_penalty) || !C7384Etj.areEqual(this.refund_penalty_status, flightRowFlightDataJson.refund_penalty_status) || !C7384Etj.areEqual(this.change_penalty_status, flightRowFlightDataJson.change_penalty_status) || !C7384Etj.areEqual(this.response_message, flightRowFlightDataJson.response_message) || !C7384Etj.areEqual(this.flight_link, flightRowFlightDataJson.flight_link) || !C7384Etj.areEqual(this.cta_text, flightRowFlightDataJson.cta_text) || !C7384Etj.areEqual(this.passengers, flightRowFlightDataJson.passengers) || !C7384Etj.areEqual(this.price_per_passenger, flightRowFlightDataJson.price_per_passenger) || !C7384Etj.areEqual(this.selection_stage, flightRowFlightDataJson.selection_stage) || !C7384Etj.areEqual(this.from_price, flightRowFlightDataJson.from_price) || !C7384Etj.areEqual(this.from_price_per_passenger, flightRowFlightDataJson.from_price_per_passenger) || !C7384Etj.areEqual(this.price_breakdown, flightRowFlightDataJson.price_breakdown)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowFlightDataJson flightRowFlightDataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightRowFlightDataJson.id)) {
            c9j5.AAV(flightRowFlightDataJson.id, c9iZ, 0);
        }
        if (zAfR || flightRowFlightDataJson.airline != null) {
            c9j5.AAP(flightRowFlightDataJson.airline, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || flightRowFlightDataJson.price != null) {
            c9j5.AAP(flightRowFlightDataJson.price, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightRowFlightDataJson.duration != null) {
            c9j5.AAP(flightRowFlightDataJson.duration, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || flightRowFlightDataJson.stops != 0) {
            c9j5.AAK(c9iZ, 4, flightRowFlightDataJson.stops);
        }
        if (zAfR || !C3cG.A1L(flightRowFlightDataJson.slices)) {
            c9j5.AAQ(flightRowFlightDataJson.slices, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || flightRowFlightDataJson.bags != null) {
            c9j5.AAP(flightRowFlightDataJson.bags, FlightRowBagsJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || flightRowFlightDataJson.baggage_varies) {
            c9j5.AA7(c9iZ, 7, flightRowFlightDataJson.baggage_varies);
        }
        if (zAfR || flightRowFlightDataJson.refundable != null) {
            c9j5.AAP(flightRowFlightDataJson.refundable, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || flightRowFlightDataJson.changeable != null) {
            c9j5.AAP(flightRowFlightDataJson.changeable, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || flightRowFlightDataJson.refund_penalty != null) {
            c9j5.AAP(flightRowFlightDataJson.refund_penalty, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || flightRowFlightDataJson.change_penalty != null) {
            c9j5.AAP(flightRowFlightDataJson.change_penalty, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || flightRowFlightDataJson.refund_penalty_status != null) {
            c9j5.AAP(flightRowFlightDataJson.refund_penalty_status, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || flightRowFlightDataJson.change_penalty_status != null) {
            c9j5.AAP(flightRowFlightDataJson.change_penalty_status, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || !"".equals(flightRowFlightDataJson.response_message)) {
            c9j5.AAV(flightRowFlightDataJson.response_message, c9iZ, 14);
        }
        if (zAfR || flightRowFlightDataJson.flight_link != null) {
            c9j5.AAP(flightRowFlightDataJson.flight_link, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || flightRowFlightDataJson.cta_text != null) {
            c9j5.AAP(flightRowFlightDataJson.cta_text, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || !C3cG.A1L(flightRowFlightDataJson.passengers)) {
            c9j5.AAQ(flightRowFlightDataJson.passengers, C3cH.A15(f0cArr, 17), c9iZ, 17);
        }
        if (zAfR || flightRowFlightDataJson.price_per_passenger != null) {
            c9j5.AAP(flightRowFlightDataJson.price_per_passenger, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || flightRowFlightDataJson.selection_stage != null) {
            c9j5.AAP(flightRowFlightDataJson.selection_stage, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || flightRowFlightDataJson.from_price != null) {
            c9j5.AAP(flightRowFlightDataJson.from_price, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || flightRowFlightDataJson.from_price_per_passenger != null) {
            c9j5.AAP(flightRowFlightDataJson.from_price_per_passenger, C07779iq.A01, c9iZ, 21);
        }
        if (zAfR || !C3cG.A1L(flightRowFlightDataJson.price_breakdown)) {
            c9j5.AAQ(flightRowFlightDataJson.price_breakdown, C3cH.A15(f0cArr, 22), c9iZ, 22);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.changeable;
    }

    public final String component11() {
        return this.refund_penalty;
    }

    public final String component12() {
        return this.change_penalty;
    }

    public final String component13() {
        return this.refund_penalty_status;
    }

    public final String component14() {
        return this.change_penalty_status;
    }

    public final String component15() {
        return this.response_message;
    }

    public final String component16() {
        return this.flight_link;
    }

    public final String component17() {
        return this.cta_text;
    }

    public final List<JsonElement> component18() {
        return this.passengers;
    }

    public final String component19() {
        return this.price_per_passenger;
    }

    public final String component2() {
        return this.airline;
    }

    public final String component20() {
        return this.selection_stage;
    }

    public final String component21() {
        return this.from_price;
    }

    public final String component22() {
        return this.from_price_per_passenger;
    }

    public final List<FlightRowPriceComponentJson> component23() {
        return this.price_breakdown;
    }

    public final String component3() {
        return this.price;
    }

    public final String component4() {
        return this.duration;
    }

    public final int component5() {
        return this.stops;
    }

    public final List<FlightRowSliceJson> component6() {
        return this.slices;
    }

    public final FlightRowBagsJson component7() {
        return this.bags;
    }

    public final boolean component8() {
        return this.baggage_varies;
    }

    public final String component9() {
        return this.refundable;
    }

    public final String getAirline() {
        return this.airline;
    }

    public final boolean getBaggage_varies() {
        return this.baggage_varies;
    }

    public final FlightRowBagsJson getBags() {
        return this.bags;
    }

    public final String getChange_penalty() {
        return this.change_penalty;
    }

    public final String getChange_penalty_status() {
        return this.change_penalty_status;
    }

    public final String getChangeable() {
        return this.changeable;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFlight_link() {
        return this.flight_link;
    }

    public final String getFrom_price() {
        return this.from_price;
    }

    public final String getFrom_price_per_passenger() {
        return this.from_price_per_passenger;
    }

    public final String getId() {
        return this.id;
    }

    public final List<JsonElement> getPassengers() {
        return this.passengers;
    }

    public final String getPrice() {
        return this.price;
    }

    public final List<FlightRowPriceComponentJson> getPrice_breakdown() {
        return this.price_breakdown;
    }

    public final String getPrice_per_passenger() {
        return this.price_per_passenger;
    }

    public final String getRefund_penalty() {
        return this.refund_penalty;
    }

    public final String getRefund_penalty_status() {
        return this.refund_penalty_status;
    }

    public final String getRefundable() {
        return this.refundable;
    }

    public final String getResponse_message() {
        return this.response_message;
    }

    public final String getSelection_stage() {
        return this.selection_stage;
    }

    public final List<FlightRowSliceJson> getSlices() {
        return this.slices;
    }

    public final int getStops() {
        return this.stops;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.price_breakdown, (((((((AnonymousClass005.A0F(this.passengers, (((AnonymousClass005.A0I(this.response_message, (((((((((((C0KA.A01((AnonymousClass005.A0F(this.slices, (((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.airline)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + this.stops) * 31) + AnonymousClass006.A0D(this.bags)) * 31, this.baggage_varies) + AnonymousClass006.A0G(this.refundable)) * 31) + AnonymousClass006.A0G(this.changeable)) * 31) + AnonymousClass006.A0G(this.refund_penalty)) * 31) + AnonymousClass006.A0G(this.change_penalty)) * 31) + AnonymousClass006.A0G(this.refund_penalty_status)) * 31) + AnonymousClass006.A0G(this.change_penalty_status)) * 31) + AnonymousClass006.A0G(this.flight_link)) * 31) + AnonymousClass006.A0G(this.cta_text)) * 31) + AnonymousClass006.A0G(this.price_per_passenger)) * 31) + AnonymousClass006.A0G(this.selection_stage)) * 31) + AnonymousClass006.A0G(this.from_price)) * 31) + AnonymousClass005.A0H(this.from_price_per_passenger)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowFlightDataJson(int i, String str, String str2, String str3, String str4, int i2, List list, FlightRowBagsJson flightRowBagsJson, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list2, String str14, String str15, String str16, String str17, List list3, C2hx c2hx) {
        List list4 = list2;
        List list5 = list3;
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.airline = null;
        } else {
            this.airline = str2;
        }
        if ((i & 4) == 0) {
            this.price = null;
        } else {
            this.price = str3;
        }
        if ((i & 8) == 0) {
            this.duration = null;
        } else {
            this.duration = str4;
        }
        if ((i & 16) == 0) {
            this.stops = 0;
        } else {
            this.stops = i2;
        }
        if ((i & 32) == 0) {
            this.slices = C0881AGi.A00;
        } else {
            this.slices = list;
        }
        if ((i & 64) == 0) {
            this.bags = null;
        } else {
            this.bags = flightRowBagsJson;
        }
        if ((i & 128) == 0) {
            this.baggage_varies = false;
        } else {
            this.baggage_varies = z;
        }
        if ((i & 256) == 0) {
            this.refundable = null;
        } else {
            this.refundable = str5;
        }
        if ((i & 512) == 0) {
            this.changeable = null;
        } else {
            this.changeable = str6;
        }
        if ((i & 1024) == 0) {
            this.refund_penalty = null;
        } else {
            this.refund_penalty = str7;
        }
        if ((i & 2048) == 0) {
            this.change_penalty = null;
        } else {
            this.change_penalty = str8;
        }
        if ((i & 4096) == 0) {
            this.refund_penalty_status = null;
        } else {
            this.refund_penalty_status = str9;
        }
        if ((i & 8192) == 0) {
            this.change_penalty_status = null;
        } else {
            this.change_penalty_status = str10;
        }
        if ((i & 16384) == 0) {
            this.response_message = "";
        } else {
            this.response_message = str11;
        }
        if ((32768 & i) == 0) {
            this.flight_link = null;
        } else {
            this.flight_link = str12;
        }
        if ((65536 & i) == 0) {
            this.cta_text = null;
        } else {
            this.cta_text = str13;
        }
        this.passengers = (131072 & i) == 0 ? C0881AGi.A00 : list4;
        if ((262144 & i) == 0) {
            this.price_per_passenger = null;
        } else {
            this.price_per_passenger = str14;
        }
        if ((524288 & i) == 0) {
            this.selection_stage = null;
        } else {
            this.selection_stage = str15;
        }
        if ((1048576 & i) == 0) {
            this.from_price = null;
        } else {
            this.from_price = str16;
        }
        if ((2097152 & i) == 0) {
            this.from_price_per_passenger = null;
        } else {
            this.from_price_per_passenger = str17;
        }
        this.price_breakdown = (i & 4194304) == 0 ? C0881AGi.A00 : list5;
    }

    public static /* synthetic */ FlightRowFlightDataJson copy$default(FlightRowFlightDataJson flightRowFlightDataJson, String str, String str2, String str3, String str4, int i, List list, FlightRowBagsJson flightRowBagsJson, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list2, String str14, String str15, String str16, String str17, List list3, int i2, Object obj) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        int i3 = i;
        List list4 = list;
        FlightRowBagsJson flightRowBagsJson2 = flightRowBagsJson;
        boolean z2 = z;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str14;
        String str31 = str15;
        String str32 = str16;
        String str33 = str17;
        String str34 = str13;
        List list5 = list2;
        List list6 = list3;
        if ((i2 & 1) != 0) {
            str18 = flightRowFlightDataJson.id;
        }
        if ((i2 & 2) != 0) {
            str19 = flightRowFlightDataJson.airline;
        }
        if ((i2 & 4) != 0) {
            str20 = flightRowFlightDataJson.price;
        }
        if ((i2 & 8) != 0) {
            str21 = flightRowFlightDataJson.duration;
        }
        if ((i2 & 16) != 0) {
            i3 = flightRowFlightDataJson.stops;
        }
        if ((i2 & 32) != 0) {
            list4 = flightRowFlightDataJson.slices;
        }
        if ((i2 & 64) != 0) {
            flightRowBagsJson2 = flightRowFlightDataJson.bags;
        }
        if ((i2 & 128) != 0) {
            z2 = flightRowFlightDataJson.baggage_varies;
        }
        if ((i2 & 256) != 0) {
            str22 = flightRowFlightDataJson.refundable;
        }
        if ((i2 & 512) != 0) {
            str23 = flightRowFlightDataJson.changeable;
        }
        if ((i2 & 1024) != 0) {
            str24 = flightRowFlightDataJson.refund_penalty;
        }
        if ((i2 & 2048) != 0) {
            str25 = flightRowFlightDataJson.change_penalty;
        }
        if ((i2 & 4096) != 0) {
            str26 = flightRowFlightDataJson.refund_penalty_status;
        }
        if ((i2 & 8192) != 0) {
            str27 = flightRowFlightDataJson.change_penalty_status;
        }
        if ((i2 & 16384) != 0) {
            str28 = flightRowFlightDataJson.response_message;
        }
        if ((i2 & 32768) != 0) {
            str29 = flightRowFlightDataJson.flight_link;
        }
        if ((i2 & 65536) != 0) {
            str34 = flightRowFlightDataJson.cta_text;
        }
        if ((i2 & 131072) != 0) {
            list5 = flightRowFlightDataJson.passengers;
        }
        if ((i2 & 262144) != 0) {
            str30 = flightRowFlightDataJson.price_per_passenger;
        }
        if ((i2 & 524288) != 0) {
            str31 = flightRowFlightDataJson.selection_stage;
        }
        if ((i2 & 1048576) != 0) {
            str32 = flightRowFlightDataJson.from_price;
        }
        if ((i2 & 2097152) != 0) {
            str33 = flightRowFlightDataJson.from_price_per_passenger;
        }
        if ((i2 & 4194304) != 0) {
            list6 = flightRowFlightDataJson.price_breakdown;
        }
        String str35 = str24;
        String str36 = str25;
        String str37 = str26;
        return flightRowFlightDataJson.copy(str18, str19, str20, str21, i3, list4, flightRowBagsJson2, z2, str22, str23, str35, str36, str37, str27, str28, str29, str34, list5, str30, str31, str32, str33, list6);
    }

    public /* synthetic */ FlightRowFlightDataJson(String str, String str2, String str3, String str4, int i, List list, FlightRowBagsJson flightRowBagsJson, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list2, String str14, String str15, String str16, String str17, List list3, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, C3cG.A0e(str2, i2 & 2), C3cG.A0e(str3, i2 & 4), C3cG.A0e(str4, i2 & 8), (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? C0881AGi.A00 : list, (i2 & 64) != 0 ? null : flightRowBagsJson, (i2 & 128) == 0 ? z : false, C3cG.A0e(str5, i2 & 256), C3cG.A0e(str6, i2 & 512), C3cG.A0e(str7, i2 & 1024), C3cG.A0e(str8, i2 & 2048), C3cG.A0e(str9, i2 & 4096), C3cG.A0e(str10, i2 & 8192), (i2 & 16384) == 0 ? str11 : "", C3cI.A0V(32768, i2, str12), C3cI.A0V(i2, 65536, str13), (i2 & 131072) != 0 ? C0881AGi.A00 : list2, C3cI.A0V(i2, 262144, str14), C3cI.A0V(i2, 524288, str15), C3cI.A0V(i2, 1048576, str16), C3cI.A0V(i2, 2097152, str17), (i2 & 4194304) != 0 ? C0881AGi.A00 : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightRowFlightDataJson(String str, String str2, String str3, String str4, int i, List<FlightRowSliceJson> list, FlightRowBagsJson flightRowBagsJson, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<? extends JsonElement> list2, String str14, String str15, String str16, String str17, List<FlightRowPriceComponentJson> list3) {
        AnonymousClass002.A1D(str, 0, list);
        C3cI.A1I(str11, 14, list2);
        C7384Etj.A0Y(list3, 22);
        this.id = str;
        this.airline = str2;
        this.price = str3;
        this.duration = str4;
        this.stops = i;
        this.slices = list;
        this.bags = flightRowBagsJson;
        this.baggage_varies = z;
        this.refundable = str5;
        this.changeable = str6;
        this.refund_penalty = str7;
        this.change_penalty = str8;
        this.refund_penalty_status = str9;
        this.change_penalty_status = str10;
        this.response_message = str11;
        this.flight_link = str12;
        this.cta_text = str13;
        this.passengers = list2;
        this.price_per_passenger = str14;
        this.selection_stage = str15;
        this.from_price = str16;
        this.from_price_per_passenger = str17;
        this.price_breakdown = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FlightRowFlightDataJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", null, null, null, 0, c0881AGi, null, false, null, null, null, null, null, null, "", null, null, c0881AGi, null, null, null, null, c0881AGi);
    }
}
