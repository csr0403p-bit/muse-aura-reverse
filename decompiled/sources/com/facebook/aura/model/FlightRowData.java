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
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowData extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String airline;
    public final boolean baggageVaries;
    public final FlightRowBags bags;
    public final String changePenalty;
    public final String changePenaltyStatus;
    public final FareCondition changeable;
    public final String ctaText;
    public final String duration;
    public final String flightLink;
    public final String fromPrice;
    public final String fromPricePerPassenger;
    public final List<String> icons;
    public final String id;
    public final int passengerCount;
    public final String price;
    public final List<FlightRowPriceComponent> priceBreakdown;
    public final String pricePerPassenger;
    public final String refundPenalty;
    public final String refundPenaltyStatus;
    public final FareCondition refundable;
    public final String responseMessage;
    public final FlightRowSelectionStage selectionStage;
    public final int sliceIndex;
    public final List<FlightRowSlice> slices;
    public final int stops;

    public final class Companion {
        public final C9hr<FlightRowData> serializer() {
            return FlightRowData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, AbstractC5321DgF.A02(num, FlightRowData$Companion$$childSerializers$1.INSTANCE), null, null, null, AbstractC5321DgF.A02(num, FlightRowData$Companion$$childSerializers$2.INSTANCE), null, null, AbstractC5321DgF.A02(num, FlightRowData$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, FlightRowData$Companion$$childSerializers$4.INSTANCE), null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, FlightRowData$Companion$$childSerializers$5.INSTANCE), null, null, AbstractC5321DgF.A02(num, FlightRowData$Companion$$childSerializers$6.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowData) {
                FlightRowData flightRowData = (FlightRowData) obj;
                if (!C7384Etj.areEqual(this.id, flightRowData.id) || this.sliceIndex != flightRowData.sliceIndex || !C7384Etj.areEqual(this.airline, flightRowData.airline) || !C7384Etj.areEqual(this.icons, flightRowData.icons) || !C7384Etj.areEqual(this.price, flightRowData.price) || !C7384Etj.areEqual(this.duration, flightRowData.duration) || this.stops != flightRowData.stops || !C7384Etj.areEqual(this.slices, flightRowData.slices) || !C7384Etj.areEqual(this.bags, flightRowData.bags) || this.baggageVaries != flightRowData.baggageVaries || this.refundable != flightRowData.refundable || this.changeable != flightRowData.changeable || !C7384Etj.areEqual(this.refundPenalty, flightRowData.refundPenalty) || !C7384Etj.areEqual(this.changePenalty, flightRowData.changePenalty) || !C7384Etj.areEqual(this.refundPenaltyStatus, flightRowData.refundPenaltyStatus) || !C7384Etj.areEqual(this.changePenaltyStatus, flightRowData.changePenaltyStatus) || !C7384Etj.areEqual(this.responseMessage, flightRowData.responseMessage) || !C7384Etj.areEqual(this.flightLink, flightRowData.flightLink) || !C7384Etj.areEqual(this.ctaText, flightRowData.ctaText) || this.passengerCount != flightRowData.passengerCount || !C7384Etj.areEqual(this.pricePerPassenger, flightRowData.pricePerPassenger) || this.selectionStage != flightRowData.selectionStage || !C7384Etj.areEqual(this.fromPrice, flightRowData.fromPrice) || !C7384Etj.areEqual(this.fromPricePerPassenger, flightRowData.fromPricePerPassenger) || !C7384Etj.areEqual(this.priceBreakdown, flightRowData.priceBreakdown)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowData flightRowData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightRowData.id)) {
            c9j5.AAV(flightRowData.id, c9iZ, 0);
        }
        if (zAfR || flightRowData.sliceIndex != 0) {
            c9j5.AAK(c9iZ, 1, flightRowData.sliceIndex);
        }
        if (zAfR || flightRowData.airline != null) {
            c9j5.AAP(flightRowData.airline, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(flightRowData.icons)) {
            c9j5.AAQ(flightRowData.icons, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || flightRowData.price != null) {
            c9j5.AAP(flightRowData.price, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightRowData.duration != null) {
            c9j5.AAP(flightRowData.duration, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || flightRowData.stops != 0) {
            c9j5.AAK(c9iZ, 6, flightRowData.stops);
        }
        if (zAfR || !C3cG.A1L(flightRowData.slices)) {
            c9j5.AAQ(flightRowData.slices, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || flightRowData.bags != null) {
            c9j5.AAP(flightRowData.bags, FlightRowBags$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || flightRowData.baggageVaries) {
            c9j5.AA7(c9iZ, 9, flightRowData.baggageVaries);
        }
        if (zAfR || flightRowData.refundable != FareCondition.NOT_STATED) {
            c9j5.AAQ(flightRowData.refundable, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || flightRowData.changeable != FareCondition.NOT_STATED) {
            c9j5.AAQ(flightRowData.changeable, C3cH.A15(f0cArr, 11), c9iZ, 11);
        }
        if (zAfR || flightRowData.refundPenalty != null) {
            c9j5.AAP(flightRowData.refundPenalty, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || flightRowData.changePenalty != null) {
            c9j5.AAP(flightRowData.changePenalty, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || flightRowData.refundPenaltyStatus != null) {
            c9j5.AAP(flightRowData.refundPenaltyStatus, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || flightRowData.changePenaltyStatus != null) {
            c9j5.AAP(flightRowData.changePenaltyStatus, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || !"".equals(flightRowData.responseMessage)) {
            c9j5.AAV(flightRowData.responseMessage, c9iZ, 16);
        }
        if (zAfR || flightRowData.flightLink != null) {
            c9j5.AAP(flightRowData.flightLink, C07779iq.A01, c9iZ, 17);
        }
        if (zAfR || flightRowData.ctaText != null) {
            c9j5.AAP(flightRowData.ctaText, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || flightRowData.passengerCount != 0) {
            c9j5.AAK(c9iZ, 19, flightRowData.passengerCount);
        }
        if (zAfR || flightRowData.pricePerPassenger != null) {
            c9j5.AAP(flightRowData.pricePerPassenger, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || flightRowData.selectionStage != null) {
            c9j5.AAP(flightRowData.selectionStage, C3cH.A15(f0cArr, 21), c9iZ, 21);
        }
        if (zAfR || flightRowData.fromPrice != null) {
            c9j5.AAP(flightRowData.fromPrice, C07779iq.A01, c9iZ, 22);
        }
        if (zAfR || flightRowData.fromPricePerPassenger != null) {
            c9j5.AAP(flightRowData.fromPricePerPassenger, C07779iq.A01, c9iZ, 23);
        }
        if (zAfR || !C3cG.A1L(flightRowData.priceBreakdown)) {
            c9j5.AAQ(flightRowData.priceBreakdown, C3cH.A15(f0cArr, 24), c9iZ, 24);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.baggageVaries;
    }

    public final FareCondition component11() {
        return this.refundable;
    }

    public final FareCondition component12() {
        return this.changeable;
    }

    public final String component13() {
        return this.refundPenalty;
    }

    public final String component14() {
        return this.changePenalty;
    }

    public final String component15() {
        return this.refundPenaltyStatus;
    }

    public final String component16() {
        return this.changePenaltyStatus;
    }

    public final String component17() {
        return this.responseMessage;
    }

    public final String component18() {
        return this.flightLink;
    }

    public final String component19() {
        return this.ctaText;
    }

    public final int component2() {
        return this.sliceIndex;
    }

    public final int component20() {
        return this.passengerCount;
    }

    public final String component21() {
        return this.pricePerPassenger;
    }

    public final FlightRowSelectionStage component22() {
        return this.selectionStage;
    }

    public final String component23() {
        return this.fromPrice;
    }

    public final String component24() {
        return this.fromPricePerPassenger;
    }

    public final List<FlightRowPriceComponent> component25() {
        return this.priceBreakdown;
    }

    public final String component3() {
        return this.airline;
    }

    public final List<String> component4() {
        return this.icons;
    }

    public final String component5() {
        return this.price;
    }

    public final String component6() {
        return this.duration;
    }

    public final int component7() {
        return this.stops;
    }

    public final List<FlightRowSlice> component8() {
        return this.slices;
    }

    public final FlightRowBags component9() {
        return this.bags;
    }

    public final String getAirline() {
        return this.airline;
    }

    public final boolean getBaggageVaries() {
        return this.baggageVaries;
    }

    public final FlightRowBags getBags() {
        return this.bags;
    }

    public final String getChangePenalty() {
        return this.changePenalty;
    }

    public final String getChangePenaltyStatus() {
        return this.changePenaltyStatus;
    }

    public final FareCondition getChangeable() {
        return this.changeable;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFlightLink() {
        return this.flightLink;
    }

    public final String getFromPrice() {
        return this.fromPrice;
    }

    public final String getFromPricePerPassenger() {
        return this.fromPricePerPassenger;
    }

    public final List<String> getIcons() {
        return this.icons;
    }

    public final String getId() {
        return this.id;
    }

    public final int getPassengerCount() {
        return this.passengerCount;
    }

    public final String getPrice() {
        return this.price;
    }

    public final List<FlightRowPriceComponent> getPriceBreakdown() {
        return this.priceBreakdown;
    }

    public final String getPricePerPassenger() {
        return this.pricePerPassenger;
    }

    public final String getRefundPenalty() {
        return this.refundPenalty;
    }

    public final String getRefundPenaltyStatus() {
        return this.refundPenaltyStatus;
    }

    public final FareCondition getRefundable() {
        return this.refundable;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final FlightRowSelectionStage getSelectionStage() {
        return this.selectionStage;
    }

    public final int getSliceIndex() {
        return this.sliceIndex;
    }

    public final List<FlightRowSlice> getSlices() {
        return this.slices;
    }

    public final int getStops() {
        return this.stops;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.priceBreakdown, (((((((((((((AnonymousClass005.A0I(this.responseMessage, (((((((AnonymousClass005.A0F(this.changeable, AnonymousClass005.A0F(this.refundable, C0KA.A01((AnonymousClass005.A0F(this.slices, (((((AnonymousClass005.A0F(this.icons, (((AnonymousClass001.A0G(this.id) + this.sliceIndex) * 31) + AnonymousClass006.A0G(this.airline)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + this.stops) * 31) + AnonymousClass006.A0D(this.bags)) * 31, this.baggageVaries))) + AnonymousClass006.A0G(this.refundPenalty)) * 31) + AnonymousClass006.A0G(this.changePenalty)) * 31) + AnonymousClass006.A0G(this.refundPenaltyStatus)) * 31) + AnonymousClass006.A0G(this.changePenaltyStatus)) * 31) + AnonymousClass006.A0G(this.flightLink)) * 31) + AnonymousClass006.A0G(this.ctaText)) * 31) + this.passengerCount) * 31) + AnonymousClass006.A0G(this.pricePerPassenger)) * 31) + AnonymousClass006.A0D(this.selectionStage)) * 31) + AnonymousClass006.A0G(this.fromPrice)) * 31) + AnonymousClass005.A0H(this.fromPricePerPassenger)) * 31);
    }

    public final FlightRowData copy(String str, int i, String str2, List<String> list, String str3, String str4, int i2, List<FlightRowSlice> list2, FlightRowBags flightRowBags, boolean z, FareCondition fareCondition, FareCondition fareCondition2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, String str12, FlightRowSelectionStage flightRowSelectionStage, String str13, String str14, List<FlightRowPriceComponent> list3) {
        AnonymousClass003.A0w(str, list);
        C7384Etj.A0Y(list2, 7);
        AnonymousClass002.A1G(fareCondition, 10, fareCondition2);
        C7384Etj.A0Y(str9, 16);
        C7384Etj.A0Y(list3, 24);
        return new FlightRowData(str, i, str2, list, str3, str4, i2, list2, flightRowBags, z, fareCondition, fareCondition2, str5, str6, str7, str8, str9, str10, str11, i3, str12, flightRowSelectionStage, str13, str14, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowData(int i, String str, int i2, String str2, List list, String str3, String str4, int i3, List list2, FlightRowBags flightRowBags, boolean z, FareCondition fareCondition, FareCondition fareCondition2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i4, String str12, FlightRowSelectionStage flightRowSelectionStage, String str13, String str14, List list3, C2hx c2hx) {
        List list4 = list3;
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.sliceIndex = 0;
        } else {
            this.sliceIndex = i2;
        }
        if ((i & 4) == 0) {
            this.airline = null;
        } else {
            this.airline = str2;
        }
        if ((i & 8) == 0) {
            this.icons = C0881AGi.A00;
        } else {
            this.icons = list;
        }
        if ((i & 16) == 0) {
            this.price = null;
        } else {
            this.price = str3;
        }
        if ((i & 32) == 0) {
            this.duration = null;
        } else {
            this.duration = str4;
        }
        if ((i & 64) == 0) {
            this.stops = 0;
        } else {
            this.stops = i3;
        }
        if ((i & 128) == 0) {
            this.slices = C0881AGi.A00;
        } else {
            this.slices = list2;
        }
        if ((i & 256) == 0) {
            this.bags = null;
        } else {
            this.bags = flightRowBags;
        }
        if ((i & 512) == 0) {
            this.baggageVaries = false;
        } else {
            this.baggageVaries = z;
        }
        if ((i & 1024) == 0) {
            this.refundable = FareCondition.NOT_STATED;
        } else {
            this.refundable = fareCondition;
        }
        if ((i & 2048) == 0) {
            this.changeable = FareCondition.NOT_STATED;
        } else {
            this.changeable = fareCondition2;
        }
        if ((i & 4096) == 0) {
            this.refundPenalty = null;
        } else {
            this.refundPenalty = str5;
        }
        if ((i & 8192) == 0) {
            this.changePenalty = null;
        } else {
            this.changePenalty = str6;
        }
        if ((i & 16384) == 0) {
            this.refundPenaltyStatus = null;
        } else {
            this.refundPenaltyStatus = str7;
        }
        if ((32768 & i) == 0) {
            this.changePenaltyStatus = null;
        } else {
            this.changePenaltyStatus = str8;
        }
        if ((65536 & i) == 0) {
            this.responseMessage = "";
        } else {
            this.responseMessage = str9;
        }
        if ((131072 & i) == 0) {
            this.flightLink = null;
        } else {
            this.flightLink = str10;
        }
        if ((262144 & i) == 0) {
            this.ctaText = null;
        } else {
            this.ctaText = str11;
        }
        if ((524288 & i) == 0) {
            this.passengerCount = 0;
        } else {
            this.passengerCount = i4;
        }
        if ((1048576 & i) == 0) {
            this.pricePerPassenger = null;
        } else {
            this.pricePerPassenger = str12;
        }
        if ((2097152 & i) == 0) {
            this.selectionStage = null;
        } else {
            this.selectionStage = flightRowSelectionStage;
        }
        if ((4194304 & i) == 0) {
            this.fromPrice = null;
        } else {
            this.fromPrice = str13;
        }
        if ((8388608 & i) == 0) {
            this.fromPricePerPassenger = null;
        } else {
            this.fromPricePerPassenger = str14;
        }
        this.priceBreakdown = (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) == 0 ? C0881AGi.A00 : list4;
    }

    public static /* synthetic */ FlightRowData copy$default(FlightRowData flightRowData, String str, int i, String str2, List list, String str3, String str4, int i2, List list2, FlightRowBags flightRowBags, boolean z, FareCondition fareCondition, FareCondition fareCondition2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, String str12, FlightRowSelectionStage flightRowSelectionStage, String str13, String str14, List list3, int i4, Object obj) {
        String str15 = str;
        int i5 = i;
        String str16 = str2;
        List list4 = list;
        String str17 = str3;
        String str18 = str4;
        int i6 = i2;
        List list5 = list2;
        FlightRowBags flightRowBags2 = flightRowBags;
        boolean z2 = z;
        FareCondition fareCondition3 = fareCondition;
        FareCondition fareCondition4 = fareCondition2;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        int i7 = i3;
        String str23 = str12;
        FlightRowSelectionStage flightRowSelectionStage2 = flightRowSelectionStage;
        String str24 = str13;
        String str25 = str14;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        List list6 = list3;
        if ((i4 & 1) != 0) {
            str15 = flightRowData.id;
        }
        if ((i4 & 2) != 0) {
            i5 = flightRowData.sliceIndex;
        }
        if ((i4 & 4) != 0) {
            str16 = flightRowData.airline;
        }
        if ((i4 & 8) != 0) {
            list4 = flightRowData.icons;
        }
        if ((i4 & 16) != 0) {
            str17 = flightRowData.price;
        }
        if ((i4 & 32) != 0) {
            str18 = flightRowData.duration;
        }
        if ((i4 & 64) != 0) {
            i6 = flightRowData.stops;
        }
        if ((i4 & 128) != 0) {
            list5 = flightRowData.slices;
        }
        if ((i4 & 256) != 0) {
            flightRowBags2 = flightRowData.bags;
        }
        if ((i4 & 512) != 0) {
            z2 = flightRowData.baggageVaries;
        }
        if ((i4 & 1024) != 0) {
            fareCondition3 = flightRowData.refundable;
        }
        if ((i4 & 2048) != 0) {
            fareCondition4 = flightRowData.changeable;
        }
        if ((i4 & 4096) != 0) {
            str19 = flightRowData.refundPenalty;
        }
        if ((i4 & 8192) != 0) {
            str20 = flightRowData.changePenalty;
        }
        if ((i4 & 16384) != 0) {
            str21 = flightRowData.refundPenaltyStatus;
        }
        if ((i4 & 32768) != 0) {
            str22 = flightRowData.changePenaltyStatus;
        }
        if ((i4 & 65536) != 0) {
            str26 = flightRowData.responseMessage;
        }
        if ((i4 & 131072) != 0) {
            str27 = flightRowData.flightLink;
        }
        if ((i4 & 262144) != 0) {
            str28 = flightRowData.ctaText;
        }
        if ((i4 & 524288) != 0) {
            i7 = flightRowData.passengerCount;
        }
        if ((i4 & 1048576) != 0) {
            str23 = flightRowData.pricePerPassenger;
        }
        if ((i4 & 2097152) != 0) {
            flightRowSelectionStage2 = flightRowData.selectionStage;
        }
        if ((i4 & 4194304) != 0) {
            str24 = flightRowData.fromPrice;
        }
        if ((i4 & 8388608) != 0) {
            str25 = flightRowData.fromPricePerPassenger;
        }
        if ((i4 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            list6 = flightRowData.priceBreakdown;
        }
        String str29 = str19;
        return flightRowData.copy(str15, i5, str16, list4, str17, str18, i6, list5, flightRowBags2, z2, fareCondition3, fareCondition4, str29, str20, str21, str22, str26, str27, str28, i7, str23, flightRowSelectionStage2, str24, str25, list6);
    }

    public /* synthetic */ FlightRowData(String str, int i, String str2, List list, String str3, String str4, int i2, List list2, FlightRowBags flightRowBags, boolean z, FareCondition fareCondition, FareCondition fareCondition2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, String str12, FlightRowSelectionStage flightRowSelectionStage, String str13, String str14, List list3, int i4, C06H c06h) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, C3cG.A0e(str2, i4 & 4), (i4 & 8) != 0 ? C0881AGi.A00 : list, C3cG.A0e(str3, i4 & 16), C3cG.A0e(str4, i4 & 32), (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? C0881AGi.A00 : list2, (i4 & 256) != 0 ? null : flightRowBags, C3cG.A1K(i4 & 512, z), (i4 & 1024) != 0 ? FareCondition.NOT_STATED : fareCondition, (i4 & 2048) != 0 ? FareCondition.NOT_STATED : fareCondition2, C3cG.A0e(str5, i4 & 4096), C3cG.A0e(str6, i4 & 8192), C3cG.A0e(str7, i4 & 16384), C3cI.A0V(i4, 32768, str8), (i4 & 65536) == 0 ? str9 : "", C3cI.A0V(i4, 131072, str10), C3cI.A0V(i4, 262144, str11), (i4 & 524288) != 0 ? 0 : i3, C3cI.A0V(i4, 1048576, str12), (i4 & 2097152) != 0 ? null : flightRowSelectionStage, C3cI.A0V(i4, 4194304, str13), C3cI.A0V(i4, 8388608, str14), (i4 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? C0881AGi.A00 : list3);
    }

    public FlightRowData(String str, int i, String str2, List<String> list, String str3, String str4, int i2, List<FlightRowSlice> list2, FlightRowBags flightRowBags, boolean z, FareCondition fareCondition, FareCondition fareCondition2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, String str12, FlightRowSelectionStage flightRowSelectionStage, String str13, String str14, List<FlightRowPriceComponent> list3) {
        AnonymousClass003.A0w(str, list);
        C7384Etj.A0Y(list2, 7);
        AnonymousClass002.A1G(fareCondition, 10, fareCondition2);
        C7384Etj.A0Y(str9, 16);
        C7384Etj.A0Y(list3, 24);
        this.id = str;
        this.sliceIndex = i;
        this.airline = str2;
        this.icons = list;
        this.price = str3;
        this.duration = str4;
        this.stops = i2;
        this.slices = list2;
        this.bags = flightRowBags;
        this.baggageVaries = z;
        this.refundable = fareCondition;
        this.changeable = fareCondition2;
        this.refundPenalty = str5;
        this.changePenalty = str6;
        this.refundPenaltyStatus = str7;
        this.changePenaltyStatus = str8;
        this.responseMessage = str9;
        this.flightLink = str10;
        this.ctaText = str11;
        this.passengerCount = i3;
        this.pricePerPassenger = str12;
        this.selectionStage = flightRowSelectionStage;
        this.fromPrice = str13;
        this.fromPricePerPassenger = str14;
        this.priceBreakdown = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightRowData() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        this((String) null, 0, (String) objArr, (List) objArr2, (String) objArr3, (String) objArr4, (int) (0 == true ? 1 : 0), (List) objArr5, (FlightRowBags) objArr6, (boolean) (0 == true ? 1 : 0), (FareCondition) objArr7, (FareCondition) objArr8, (String) objArr9, (String) objArr10, (String) objArr11, (String) objArr12, (String) objArr13, (String) objArr14, (String) objArr15, (int) (0 == true ? 1 : 0), (String) objArr16, (FlightRowSelectionStage) objArr17, (String) objArr18, (String) objArr19, (List) objArr20, 33554431, (C06H) objArr21);
    }
}
