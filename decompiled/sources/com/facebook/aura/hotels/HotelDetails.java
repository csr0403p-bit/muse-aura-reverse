package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HotelDetails extends C06G {
    public static final int $stable = 0;
    public final AHD<String> amenities;
    public final String checkInEnd;
    public final AHD<String> checkInInstructions;
    public final String checkInStart;
    public final String checkOut;
    public final String description;
    public final AHD<String> mandatoryFeeDescriptions;
    public final AHD<String> optionalExtras;
    public final AHD<String> policies;
    public final HotelDetailsStatus status;

    public HotelDetails(HotelDetailsStatus hotelDetailsStatus, String str, AHD<String> ahd, String str2, String str3, String str4, AHD<String> ahd2, AHD<String> ahd3, AHD<String> ahd4, AHD<String> ahd5) {
        C7384Etj.A0Y(hotelDetailsStatus, 0);
        AnonymousClass005.A13(ahd2, ahd3, ahd4, 6);
        C7384Etj.A0Y(ahd5, 9);
        this.status = hotelDetailsStatus;
        this.description = str;
        this.amenities = ahd;
        this.checkInStart = str2;
        this.checkInEnd = str3;
        this.checkOut = str4;
        this.checkInInstructions = ahd2;
        this.policies = ahd3;
        this.mandatoryFeeDescriptions = ahd4;
        this.optionalExtras = ahd5;
    }

    public final HotelDetails copy(HotelDetailsStatus hotelDetailsStatus, String str, AHD<String> ahd, String str2, String str3, String str4, AHD<String> ahd2, AHD<String> ahd3, AHD<String> ahd4, AHD<String> ahd5) {
        C7384Etj.A0Y(hotelDetailsStatus, 0);
        AnonymousClass005.A13(ahd2, ahd3, ahd4, 6);
        C7384Etj.A0Y(ahd5, 9);
        return new HotelDetails(hotelDetailsStatus, str, ahd, str2, str3, str4, ahd2, ahd3, ahd4, ahd5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelDetails) {
                HotelDetails hotelDetails = (HotelDetails) obj;
                if (this.status != hotelDetails.status || !C7384Etj.areEqual(this.description, hotelDetails.description) || !C7384Etj.areEqual(this.amenities, hotelDetails.amenities) || !C7384Etj.areEqual(this.checkInStart, hotelDetails.checkInStart) || !C7384Etj.areEqual(this.checkInEnd, hotelDetails.checkInEnd) || !C7384Etj.areEqual(this.checkOut, hotelDetails.checkOut) || !C7384Etj.areEqual(this.checkInInstructions, hotelDetails.checkInInstructions) || !C7384Etj.areEqual(this.policies, hotelDetails.policies) || !C7384Etj.areEqual(this.mandatoryFeeDescriptions, hotelDetails.mandatoryFeeDescriptions) || !C7384Etj.areEqual(this.optionalExtras, hotelDetails.optionalExtras)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelDetails copy$default(HotelDetails hotelDetails, HotelDetailsStatus hotelDetailsStatus, String str, AHD ahd, String str2, String str3, String str4, AHD ahd2, AHD ahd3, AHD ahd4, AHD ahd5, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelDetailsStatus = hotelDetails.status;
        }
        if ((i & 2) != 0) {
            str = hotelDetails.description;
        }
        if ((i & 4) != 0) {
            ahd = hotelDetails.amenities;
        }
        if ((i & 8) != 0) {
            str2 = hotelDetails.checkInStart;
        }
        if ((i & 16) != 0) {
            str3 = hotelDetails.checkInEnd;
        }
        if ((i & 32) != 0) {
            str4 = hotelDetails.checkOut;
        }
        if ((i & 64) != 0) {
            ahd2 = hotelDetails.checkInInstructions;
        }
        if ((i & 128) != 0) {
            ahd3 = hotelDetails.policies;
        }
        if ((i & 256) != 0) {
            ahd4 = hotelDetails.mandatoryFeeDescriptions;
        }
        if ((i & 512) != 0) {
            ahd5 = hotelDetails.optionalExtras;
        }
        return hotelDetails.copy(hotelDetailsStatus, str, ahd, str2, str3, str4, ahd2, ahd3, ahd4, ahd5);
    }

    public final HotelDetailsStatus component1() {
        return this.status;
    }

    public final AHD<String> component10() {
        return this.optionalExtras;
    }

    public final String component2() {
        return this.description;
    }

    public final AHD<String> component3() {
        return this.amenities;
    }

    public final String component4() {
        return this.checkInStart;
    }

    public final String component5() {
        return this.checkInEnd;
    }

    public final String component6() {
        return this.checkOut;
    }

    public final AHD<String> component7() {
        return this.checkInInstructions;
    }

    public final AHD<String> component8() {
        return this.policies;
    }

    public final AHD<String> component9() {
        return this.mandatoryFeeDescriptions;
    }

    public final AHD<String> getAmenities() {
        return this.amenities;
    }

    public final String getCheckInEnd() {
        return this.checkInEnd;
    }

    public final AHD<String> getCheckInInstructions() {
        return this.checkInInstructions;
    }

    public final String getCheckInStart() {
        return this.checkInStart;
    }

    public final String getCheckOut() {
        return this.checkOut;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AHD<String> getMandatoryFeeDescriptions() {
        return this.mandatoryFeeDescriptions;
    }

    public final AHD<String> getOptionalExtras() {
        return this.optionalExtras;
    }

    public final AHD<String> getPolicies() {
        return this.policies;
    }

    public final HotelDetailsStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.optionalExtras, AnonymousClass005.A0F(this.mandatoryFeeDescriptions, AnonymousClass005.A0F(this.policies, AnonymousClass005.A0F(this.checkInInstructions, (((((((((AnonymousClass005.A0E(this.status) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0D(this.amenities)) * 31) + AnonymousClass006.A0G(this.checkInStart)) * 31) + AnonymousClass006.A0G(this.checkInEnd)) * 31) + AnonymousClass005.A0H(this.checkOut)) * 31))));
    }

    public String toString() {
        return super.toString();
    }
}
