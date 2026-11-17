package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.time.LocalDate;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengerSeat extends C06G {
    public static final int $stable = 8;
    public final String airlineIconUrl;
    public final String cabinLabel;
    public final String carrierName;
    public final LocalDate departingDate;
    public final String designator;
    public final String flightNumber;
    public final String segmentTitle;
    public final HatchAgentPermissionsRepository.FlightCheckoutSlice slice;

    public static /* synthetic */ FlightCheckoutPassengerSeat copy$default(FlightCheckoutPassengerSeat flightCheckoutPassengerSeat, String str, HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, String str2, String str3, String str4, String str5, String str6, LocalDate localDate, int i, Object obj) {
        String str7 = str;
        HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice2 = flightCheckoutSlice;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        LocalDate localDate2 = localDate;
        if ((i & 1) != 0) {
            str7 = flightCheckoutPassengerSeat.segmentTitle;
        }
        if ((i & 2) != 0) {
            flightCheckoutSlice2 = flightCheckoutPassengerSeat.slice;
        }
        if ((i & 4) != 0) {
            str8 = flightCheckoutPassengerSeat.designator;
        }
        if ((i & 8) != 0) {
            str9 = flightCheckoutPassengerSeat.cabinLabel;
        }
        if ((i & 16) != 0) {
            str10 = flightCheckoutPassengerSeat.airlineIconUrl;
        }
        if ((i & 32) != 0) {
            str11 = flightCheckoutPassengerSeat.carrierName;
        }
        if ((i & 64) != 0) {
            str12 = flightCheckoutPassengerSeat.flightNumber;
        }
        if ((i & 128) != 0) {
            localDate2 = flightCheckoutPassengerSeat.departingDate;
        }
        AnonymousClass003.A0x(flightCheckoutSlice2, str8);
        return new FlightCheckoutPassengerSeat(str7, flightCheckoutSlice2, str8, str9, str10, str11, str12, localDate2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutPassengerSeat) {
                FlightCheckoutPassengerSeat flightCheckoutPassengerSeat = (FlightCheckoutPassengerSeat) obj;
                if (!C7384Etj.areEqual(this.segmentTitle, flightCheckoutPassengerSeat.segmentTitle) || !C7384Etj.areEqual(this.slice, flightCheckoutPassengerSeat.slice) || !C7384Etj.areEqual(this.designator, flightCheckoutPassengerSeat.designator) || !C7384Etj.areEqual(this.cabinLabel, flightCheckoutPassengerSeat.cabinLabel) || !C7384Etj.areEqual(this.airlineIconUrl, flightCheckoutPassengerSeat.airlineIconUrl) || !C7384Etj.areEqual(this.carrierName, flightCheckoutPassengerSeat.carrierName) || !C7384Etj.areEqual(this.flightNumber, flightCheckoutPassengerSeat.flightNumber) || !C7384Etj.areEqual(this.departingDate, flightCheckoutPassengerSeat.departingDate)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.segmentTitle;
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutSlice component2() {
        return this.slice;
    }

    public final String component3() {
        return this.designator;
    }

    public final String component4() {
        return this.cabinLabel;
    }

    public final String component5() {
        return this.airlineIconUrl;
    }

    public final String component6() {
        return this.carrierName;
    }

    public final String component7() {
        return this.flightNumber;
    }

    public final LocalDate component8() {
        return this.departingDate;
    }

    public final String getAirlineIconUrl() {
        return this.airlineIconUrl;
    }

    public final String getCabinLabel() {
        return this.cabinLabel;
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final LocalDate getDepartingDate() {
        return this.departingDate;
    }

    public final String getDesignator() {
        return this.designator;
    }

    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public final String getSegmentTitle() {
        return this.segmentTitle;
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutSlice getSlice() {
        return this.slice;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.designator, AnonymousClass005.A0F(this.slice, AnonymousClass006.A0G(this.segmentTitle) * 31)) + AnonymousClass006.A0G(this.cabinLabel)) * 31) + AnonymousClass006.A0G(this.airlineIconUrl)) * 31) + AnonymousClass006.A0G(this.carrierName)) * 31) + AnonymousClass006.A0G(this.flightNumber)) * 31) + C3cH.A02(this.departingDate);
    }

    public FlightCheckoutPassengerSeat(String str, HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, String str2, String str3, String str4, String str5, String str6, LocalDate localDate) {
        AnonymousClass003.A0x(flightCheckoutSlice, str2);
        this.segmentTitle = str;
        this.slice = flightCheckoutSlice;
        this.designator = str2;
        this.cabinLabel = str3;
        this.airlineIconUrl = str4;
        this.carrierName = str5;
        this.flightNumber = str6;
        this.departingDate = localDate;
    }

    public final FlightCheckoutPassengerSeat copy(String str, HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, String str2, String str3, String str4, String str5, String str6, LocalDate localDate) {
        AnonymousClass003.A0x(flightCheckoutSlice, str2);
        return new FlightCheckoutPassengerSeat(str, flightCheckoutSlice, str2, str3, str4, str5, str6, localDate);
    }

    public String toString() {
        return super.toString();
    }
}
