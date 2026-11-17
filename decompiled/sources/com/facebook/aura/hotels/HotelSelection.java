package com.facebook.aura.hotels;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.hotels.policy.HotelTaxesDisclosure;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes4.dex */
public final class HotelSelection extends C06G {
    public static final int $stable = 0;
    public final String address;
    public final AHD<String> amenityHighlights;
    public final HotelMoney averageNightlyBaseRate;
    public final String bedNote;
    public final AHD<String> bedOptions;
    public final HotelBookingAction bookingAction;
    public final boolean canAskAboutRooms;
    public final HotelCancellation cancellation;
    public final Integer capacity;
    public final String city;
    public final String description;
    public final HotelGuestReviews guestReviews;
    public final String hotelId;
    public final String hotelName;
    public final AHD<HotelImage> images;
    public final AHD<HotelInfoSection> importantInformation;
    public final AHD<HotelNightlyBase> nightlyBaseRows;
    public final String offerId;
    public final HotelPayment payment;
    public final String phoneNumber;
    public final AHD<String> policies;
    public final HotelPrice price;
    public final boolean priceChanged;
    public final AHD<String> propertyAmenityHighlights;
    public final HotelDetails propertyDetails;
    public final String propertyPageUrl;
    public final String providerIconUrl;
    public final String providerName;
    public final String rateId;
    public final String region;
    public final String roomDescription;
    public final AHD<String> roomDetails;
    public final String roomName;
    public final String roomOccupancyPolicy;
    public final String rulesUrl;
    public final String selectionRef;
    public final String starRating;
    public final HotelTaxesDisclosure taxesDisclosure;
    public final HotelTrip trip;
    public final String visitWebsiteUrl;
    public final String websiteUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelection) {
                HotelSelection hotelSelection = (HotelSelection) obj;
                if (!C7384Etj.areEqual(this.selectionRef, hotelSelection.selectionRef) || !C7384Etj.areEqual(this.hotelId, hotelSelection.hotelId) || !C7384Etj.areEqual(this.hotelName, hotelSelection.hotelName) || !C7384Etj.areEqual(this.offerId, hotelSelection.offerId) || !C7384Etj.areEqual(this.rateId, hotelSelection.rateId) || !C7384Etj.areEqual(this.trip, hotelSelection.trip) || !C7384Etj.areEqual(this.roomName, hotelSelection.roomName) || !C7384Etj.areEqual(this.bedOptions, hotelSelection.bedOptions) || !C7384Etj.areEqual(this.capacity, hotelSelection.capacity) || !C7384Etj.areEqual(this.images, hotelSelection.images) || !C7384Etj.areEqual(this.amenityHighlights, hotelSelection.amenityHighlights) || !C7384Etj.areEqual(this.price, hotelSelection.price) || !C7384Etj.areEqual(this.payment, hotelSelection.payment) || !C7384Etj.areEqual(this.nightlyBaseRows, hotelSelection.nightlyBaseRows) || !C7384Etj.areEqual(this.cancellation, hotelSelection.cancellation) || this.priceChanged != hotelSelection.priceChanged || !C7384Etj.areEqual(this.propertyDetails, hotelSelection.propertyDetails) || !C7384Etj.areEqual(this.bedNote, hotelSelection.bedNote) || !C7384Etj.areEqual(this.rulesUrl, hotelSelection.rulesUrl) || !C7384Etj.areEqual(this.taxesDisclosure, hotelSelection.taxesDisclosure) || !C7384Etj.areEqual(this.averageNightlyBaseRate, hotelSelection.averageNightlyBaseRate) || !C7384Etj.areEqual(this.policies, hotelSelection.policies) || !C7384Etj.areEqual(this.bookingAction, hotelSelection.bookingAction) || !C7384Etj.areEqual(this.providerName, hotelSelection.providerName) || !C7384Etj.areEqual(this.providerIconUrl, hotelSelection.providerIconUrl) || !C7384Etj.areEqual(this.address, hotelSelection.address) || !C7384Etj.areEqual(this.description, hotelSelection.description) || !C7384Etj.areEqual(this.guestReviews, hotelSelection.guestReviews) || !C7384Etj.areEqual(this.phoneNumber, hotelSelection.phoneNumber) || !C7384Etj.areEqual(this.websiteUrl, hotelSelection.websiteUrl) || !C7384Etj.areEqual(this.visitWebsiteUrl, hotelSelection.visitWebsiteUrl) || !C7384Etj.areEqual(this.propertyPageUrl, hotelSelection.propertyPageUrl) || !C7384Etj.areEqual(this.propertyAmenityHighlights, hotelSelection.propertyAmenityHighlights) || !C7384Etj.areEqual(this.roomDescription, hotelSelection.roomDescription) || !C7384Etj.areEqual(this.starRating, hotelSelection.starRating) || this.canAskAboutRooms != hotelSelection.canAskAboutRooms || !C7384Etj.areEqual(this.roomOccupancyPolicy, hotelSelection.roomOccupancyPolicy) || !C7384Etj.areEqual(this.city, hotelSelection.city) || !C7384Etj.areEqual(this.region, hotelSelection.region) || !C7384Etj.areEqual(this.roomDetails, hotelSelection.roomDetails) || !C7384Etj.areEqual(this.importantInformation, hotelSelection.importantInformation)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.selectionRef;
    }

    public final AHD<HotelImage> component10() {
        return this.images;
    }

    public final AHD<String> component11() {
        return this.amenityHighlights;
    }

    public final HotelPrice component12() {
        return this.price;
    }

    public final HotelPayment component13() {
        return this.payment;
    }

    public final AHD<HotelNightlyBase> component14() {
        return this.nightlyBaseRows;
    }

    public final HotelCancellation component15() {
        return this.cancellation;
    }

    public final boolean component16() {
        return this.priceChanged;
    }

    public final HotelDetails component17() {
        return this.propertyDetails;
    }

    public final String component18() {
        return this.bedNote;
    }

    public final String component19() {
        return this.rulesUrl;
    }

    public final String component2() {
        return this.hotelId;
    }

    public final HotelTaxesDisclosure component20() {
        return this.taxesDisclosure;
    }

    public final HotelMoney component21() {
        return this.averageNightlyBaseRate;
    }

    public final AHD<String> component22() {
        return this.policies;
    }

    public final HotelBookingAction component23() {
        return this.bookingAction;
    }

    public final String component24() {
        return this.providerName;
    }

    public final String component25() {
        return this.providerIconUrl;
    }

    public final String component26() {
        return this.address;
    }

    public final String component27() {
        return this.description;
    }

    public final HotelGuestReviews component28() {
        return this.guestReviews;
    }

    public final String component29() {
        return this.phoneNumber;
    }

    public final String component3() {
        return this.hotelName;
    }

    public final String component30() {
        return this.websiteUrl;
    }

    public final String component31() {
        return this.visitWebsiteUrl;
    }

    public final String component32() {
        return this.propertyPageUrl;
    }

    public final AHD<String> component33() {
        return this.propertyAmenityHighlights;
    }

    public final String component34() {
        return this.roomDescription;
    }

    public final String component35() {
        return this.starRating;
    }

    public final boolean component36() {
        return this.canAskAboutRooms;
    }

    public final String component37() {
        return this.roomOccupancyPolicy;
    }

    public final String component38() {
        return this.city;
    }

    public final String component39() {
        return this.region;
    }

    public final String component4() {
        return this.offerId;
    }

    public final AHD<String> component40() {
        return this.roomDetails;
    }

    public final AHD<HotelInfoSection> component41() {
        return this.importantInformation;
    }

    public final String component5() {
        return this.rateId;
    }

    public final HotelTrip component6() {
        return this.trip;
    }

    public final String component7() {
        return this.roomName;
    }

    public final AHD<String> component8() {
        return this.bedOptions;
    }

    public final Integer component9() {
        return this.capacity;
    }

    public final String getAddress() {
        return this.address;
    }

    public final AHD<String> getAmenityHighlights() {
        return this.amenityHighlights;
    }

    public final HotelMoney getAverageNightlyBaseRate() {
        return this.averageNightlyBaseRate;
    }

    public final String getBedNote() {
        return this.bedNote;
    }

    public final AHD<String> getBedOptions() {
        return this.bedOptions;
    }

    public final HotelBookingAction getBookingAction() {
        return this.bookingAction;
    }

    public final boolean getCanAskAboutRooms() {
        return this.canAskAboutRooms;
    }

    public final HotelCancellation getCancellation() {
        return this.cancellation;
    }

    public final Integer getCapacity() {
        return this.capacity;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getDescription() {
        return this.description;
    }

    public final HotelGuestReviews getGuestReviews() {
        return this.guestReviews;
    }

    public final String getHotelId() {
        return this.hotelId;
    }

    public final String getHotelName() {
        return this.hotelName;
    }

    public final AHD<HotelImage> getImages() {
        return this.images;
    }

    public final AHD<HotelInfoSection> getImportantInformation() {
        return this.importantInformation;
    }

    public final AHD<HotelNightlyBase> getNightlyBaseRows() {
        return this.nightlyBaseRows;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final HotelPayment getPayment() {
        return this.payment;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final AHD<String> getPolicies() {
        return this.policies;
    }

    public final HotelPrice getPrice() {
        return this.price;
    }

    public final boolean getPriceChanged() {
        return this.priceChanged;
    }

    public final AHD<String> getPropertyAmenityHighlights() {
        return this.propertyAmenityHighlights;
    }

    public final HotelDetails getPropertyDetails() {
        return this.propertyDetails;
    }

    public final String getPropertyPageUrl() {
        return this.propertyPageUrl;
    }

    public final String getProviderIconUrl() {
        return this.providerIconUrl;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getRateId() {
        return this.rateId;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRoomDescription() {
        return this.roomDescription;
    }

    public final AHD<String> getRoomDetails() {
        return this.roomDetails;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getRoomOccupancyPolicy() {
        return this.roomOccupancyPolicy;
    }

    public final String getRulesUrl() {
        return this.rulesUrl;
    }

    public final String getSelectionRef() {
        return this.selectionRef;
    }

    public final String getStarRating() {
        return this.starRating;
    }

    public final HotelTaxesDisclosure getTaxesDisclosure() {
        return this.taxesDisclosure;
    }

    public final HotelTrip getTrip() {
        return this.trip;
    }

    public final String getVisitWebsiteUrl() {
        return this.visitWebsiteUrl;
    }

    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.importantInformation, AnonymousClass005.A0F(this.roomDetails, (((((C0KA.A01((((AnonymousClass005.A0F(this.propertyAmenityHighlights, (((((((((((((((((((AnonymousClass005.A0F(this.policies, (((((((AnonymousClass005.A0F(this.propertyDetails, C0KA.A01((AnonymousClass005.A0F(this.nightlyBaseRows, (((AnonymousClass005.A0F(this.amenityHighlights, AnonymousClass005.A0F(this.images, (AnonymousClass005.A0F(this.bedOptions, (((AnonymousClass005.A0I(this.rateId, AnonymousClass005.A0I(this.offerId, AnonymousClass005.A0I(this.hotelName, AnonymousClass005.A0I(this.hotelId, AnonymousClass001.A0G(this.selectionRef))))) + AnonymousClass006.A0D(this.trip)) * 31) + AnonymousClass006.A0G(this.roomName)) * 31) + AnonymousClass006.A0D(this.capacity)) * 31)) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0D(this.payment)) * 31) + AnonymousClass006.A0D(this.cancellation)) * 31, this.priceChanged)) + AnonymousClass006.A0G(this.bedNote)) * 31) + AnonymousClass006.A0G(this.rulesUrl)) * 31) + AnonymousClass006.A0D(this.taxesDisclosure)) * 31) + AnonymousClass006.A0D(this.averageNightlyBaseRate)) * 31) + AnonymousClass006.A0D(this.bookingAction)) * 31) + AnonymousClass006.A0G(this.providerName)) * 31) + AnonymousClass006.A0G(this.providerIconUrl)) * 31) + AnonymousClass006.A0G(this.address)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0D(this.guestReviews)) * 31) + AnonymousClass006.A0G(this.phoneNumber)) * 31) + AnonymousClass006.A0G(this.websiteUrl)) * 31) + AnonymousClass006.A0G(this.visitWebsiteUrl)) * 31) + AnonymousClass006.A0G(this.propertyPageUrl)) * 31) + AnonymousClass006.A0G(this.roomDescription)) * 31) + AnonymousClass006.A0G(this.starRating)) * 31, this.canAskAboutRooms) + AnonymousClass006.A0G(this.roomOccupancyPolicy)) * 31) + AnonymousClass006.A0G(this.city)) * 31) + AnonymousClass005.A0H(this.region)) * 31));
    }

    public final HotelSelection copy(String str, String str2, String str3, String str4, String str5, HotelTrip hotelTrip, String str6, AHD<String> ahd, Integer num, AHD<HotelImage> ahd2, AHD<String> ahd3, HotelPrice hotelPrice, HotelPayment hotelPayment, AHD<HotelNightlyBase> ahd4, HotelCancellation hotelCancellation, boolean z, HotelDetails hotelDetails, String str7, String str8, HotelTaxesDisclosure hotelTaxesDisclosure, HotelMoney hotelMoney, AHD<String> ahd5, HotelBookingAction hotelBookingAction, String str9, String str10, String str11, String str12, HotelGuestReviews hotelGuestReviews, String str13, String str14, String str15, String str16, AHD<String> ahd6, String str17, String str18, boolean z2, String str19, String str20, String str21, AHD<String> ahd7, AHD<HotelInfoSection> ahd8) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(ahd, 7);
        C3cH.A18(ahd2, ahd3);
        C7384Etj.A0Y(ahd4, 13);
        C7384Etj.A0Y(hotelDetails, 16);
        C7384Etj.A0Y(ahd5, 21);
        C7384Etj.A0Y(ahd6, 32);
        C7384Etj.A0Y(ahd7, 39);
        C7384Etj.A0Y(ahd8, 40);
        return new HotelSelection(str, str2, str3, str4, str5, hotelTrip, str6, ahd, num, ahd2, ahd3, hotelPrice, hotelPayment, ahd4, hotelCancellation, z, hotelDetails, str7, str8, hotelTaxesDisclosure, hotelMoney, ahd5, hotelBookingAction, str9, str10, str11, str12, hotelGuestReviews, str13, str14, str15, str16, ahd6, str17, str18, z2, str19, str20, str21, ahd7, ahd8);
    }

    public String toString() {
        return super.toString();
    }

    public HotelSelection(String str, String str2, String str3, String str4, String str5, HotelTrip hotelTrip, String str6, AHD<String> ahd, Integer num, AHD<HotelImage> ahd2, AHD<String> ahd3, HotelPrice hotelPrice, HotelPayment hotelPayment, AHD<HotelNightlyBase> ahd4, HotelCancellation hotelCancellation, boolean z, HotelDetails hotelDetails, String str7, String str8, HotelTaxesDisclosure hotelTaxesDisclosure, HotelMoney hotelMoney, AHD<String> ahd5, HotelBookingAction hotelBookingAction, String str9, String str10, String str11, String str12, HotelGuestReviews hotelGuestReviews, String str13, String str14, String str15, String str16, AHD<String> ahd6, String str17, String str18, boolean z2, String str19, String str20, String str21, AHD<String> ahd7, AHD<HotelInfoSection> ahd8) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(ahd, 7);
        C3cH.A18(ahd2, ahd3);
        C7384Etj.A0Y(ahd4, 13);
        C7384Etj.A0Y(hotelDetails, 16);
        C7384Etj.A0Y(ahd5, 21);
        C7384Etj.A0Y(ahd6, 32);
        C7384Etj.A0Y(ahd7, 39);
        C7384Etj.A0Y(ahd8, 40);
        this.selectionRef = str;
        this.hotelId = str2;
        this.hotelName = str3;
        this.offerId = str4;
        this.rateId = str5;
        this.trip = hotelTrip;
        this.roomName = str6;
        this.bedOptions = ahd;
        this.capacity = num;
        this.images = ahd2;
        this.amenityHighlights = ahd3;
        this.price = hotelPrice;
        this.payment = hotelPayment;
        this.nightlyBaseRows = ahd4;
        this.cancellation = hotelCancellation;
        this.priceChanged = z;
        this.propertyDetails = hotelDetails;
        this.bedNote = str7;
        this.rulesUrl = str8;
        this.taxesDisclosure = hotelTaxesDisclosure;
        this.averageNightlyBaseRate = hotelMoney;
        this.policies = ahd5;
        this.bookingAction = hotelBookingAction;
        this.providerName = str9;
        this.providerIconUrl = str10;
        this.address = str11;
        this.description = str12;
        this.guestReviews = hotelGuestReviews;
        this.phoneNumber = str13;
        this.websiteUrl = str14;
        this.visitWebsiteUrl = str15;
        this.propertyPageUrl = str16;
        this.propertyAmenityHighlights = ahd6;
        this.roomDescription = str17;
        this.starRating = str18;
        this.canAskAboutRooms = z2;
        this.roomOccupancyPolicy = str19;
        this.city = str20;
        this.region = str21;
        this.roomDetails = ahd7;
        this.importantInformation = ahd8;
    }

    public static /* synthetic */ HotelSelection copy$default(HotelSelection hotelSelection, String str, String str2, String str3, String str4, String str5, HotelTrip hotelTrip, String str6, AHD ahd, Integer num, AHD ahd2, AHD ahd3, HotelPrice hotelPrice, HotelPayment hotelPayment, AHD ahd4, HotelCancellation hotelCancellation, boolean z, HotelDetails hotelDetails, String str7, String str8, HotelTaxesDisclosure hotelTaxesDisclosure, HotelMoney hotelMoney, AHD ahd5, HotelBookingAction hotelBookingAction, String str9, String str10, String str11, String str12, HotelGuestReviews hotelGuestReviews, String str13, String str14, String str15, String str16, AHD ahd6, String str17, String str18, boolean z2, String str19, String str20, String str21, AHD ahd7, AHD ahd8, int i, int i2, Object obj) {
        String str22 = str;
        String str23 = str2;
        String str24 = str3;
        String str25 = str4;
        String str26 = str5;
        HotelTrip hotelTrip2 = hotelTrip;
        String str27 = str6;
        AHD ahd9 = ahd;
        Integer num2 = num;
        AHD ahd10 = ahd2;
        AHD ahd11 = ahd3;
        HotelPrice hotelPrice2 = hotelPrice;
        HotelPayment hotelPayment2 = hotelPayment;
        AHD ahd12 = ahd4;
        HotelCancellation hotelCancellation2 = hotelCancellation;
        boolean z3 = z;
        boolean z4 = z2;
        String str28 = str19;
        String str29 = str20;
        String str30 = str21;
        AHD ahd13 = ahd7;
        HotelDetails hotelDetails2 = hotelDetails;
        String str31 = str7;
        String str32 = str8;
        HotelTaxesDisclosure hotelTaxesDisclosure2 = hotelTaxesDisclosure;
        HotelMoney hotelMoney2 = hotelMoney;
        AHD ahd14 = ahd5;
        HotelBookingAction hotelBookingAction2 = hotelBookingAction;
        String str33 = str9;
        String str34 = str10;
        String str35 = str11;
        String str36 = str12;
        HotelGuestReviews hotelGuestReviews2 = hotelGuestReviews;
        String str37 = str13;
        String str38 = str14;
        String str39 = str15;
        String str40 = str16;
        AHD ahd15 = ahd6;
        String str41 = str17;
        String str42 = str18;
        AHD ahd16 = ahd8;
        if ((i & 1) != 0) {
            str22 = hotelSelection.selectionRef;
        }
        if ((i & 2) != 0) {
            str23 = hotelSelection.hotelId;
        }
        if ((i & 4) != 0) {
            str24 = hotelSelection.hotelName;
        }
        if ((i & 8) != 0) {
            str25 = hotelSelection.offerId;
        }
        if ((i & 16) != 0) {
            str26 = hotelSelection.rateId;
        }
        if ((i & 32) != 0) {
            hotelTrip2 = hotelSelection.trip;
        }
        if ((i & 64) != 0) {
            str27 = hotelSelection.roomName;
        }
        if ((i & 128) != 0) {
            ahd9 = hotelSelection.bedOptions;
        }
        if ((i & 256) != 0) {
            num2 = hotelSelection.capacity;
        }
        if ((i & 512) != 0) {
            ahd10 = hotelSelection.images;
        }
        if ((i & 1024) != 0) {
            ahd11 = hotelSelection.amenityHighlights;
        }
        if ((i & 2048) != 0) {
            hotelPrice2 = hotelSelection.price;
        }
        if ((i & 4096) != 0) {
            hotelPayment2 = hotelSelection.payment;
        }
        if ((i & 8192) != 0) {
            ahd12 = hotelSelection.nightlyBaseRows;
        }
        if ((i & 16384) != 0) {
            hotelCancellation2 = hotelSelection.cancellation;
        }
        if ((i & 32768) != 0) {
            z3 = hotelSelection.priceChanged;
        }
        if ((i & 65536) != 0) {
            hotelDetails2 = hotelSelection.propertyDetails;
        }
        if ((i & 131072) != 0) {
            str31 = hotelSelection.bedNote;
        }
        if ((i & 262144) != 0) {
            str32 = hotelSelection.rulesUrl;
        }
        if ((i & 524288) != 0) {
            hotelTaxesDisclosure2 = hotelSelection.taxesDisclosure;
        }
        if ((i & 1048576) != 0) {
            hotelMoney2 = hotelSelection.averageNightlyBaseRate;
        }
        if ((i & 2097152) != 0) {
            ahd14 = hotelSelection.policies;
        }
        if ((i & 4194304) != 0) {
            hotelBookingAction2 = hotelSelection.bookingAction;
        }
        if ((i & 8388608) != 0) {
            str33 = hotelSelection.providerName;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str34 = hotelSelection.providerIconUrl;
        }
        if ((i & 33554432) != 0) {
            str35 = hotelSelection.address;
        }
        if ((i & 67108864) != 0) {
            str36 = hotelSelection.description;
        }
        if ((i & 134217728) != 0) {
            hotelGuestReviews2 = hotelSelection.guestReviews;
        }
        if ((i & 268435456) != 0) {
            str37 = hotelSelection.phoneNumber;
        }
        if ((i & 536870912) != 0) {
            str38 = hotelSelection.websiteUrl;
        }
        if ((i & 1073741824) != 0) {
            str39 = hotelSelection.visitWebsiteUrl;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str40 = hotelSelection.propertyPageUrl;
        }
        if ((i2 & 1) != 0) {
            ahd15 = hotelSelection.propertyAmenityHighlights;
        }
        if ((i2 & 2) != 0) {
            str41 = hotelSelection.roomDescription;
        }
        if ((i2 & 4) != 0) {
            str42 = hotelSelection.starRating;
        }
        if ((i2 & 8) != 0) {
            z4 = hotelSelection.canAskAboutRooms;
        }
        if ((i2 & 16) != 0) {
            str28 = hotelSelection.roomOccupancyPolicy;
        }
        if ((i2 & 32) != 0) {
            str29 = hotelSelection.city;
        }
        if ((i2 & 64) != 0) {
            str30 = hotelSelection.region;
        }
        if ((i2 & 128) != 0) {
            ahd13 = hotelSelection.roomDetails;
        }
        if ((i2 & 256) != 0) {
            ahd16 = hotelSelection.importantInformation;
        }
        return hotelSelection.copy(str22, str23, str24, str25, str26, hotelTrip2, str27, ahd9, num2, ahd10, ahd11, hotelPrice2, hotelPayment2, ahd12, hotelCancellation2, z3, hotelDetails2, str31, str32, hotelTaxesDisclosure2, hotelMoney2, ahd14, hotelBookingAction2, str33, str34, str35, str36, hotelGuestReviews2, str37, str38, str39, str40, ahd15, str41, str42, z4, str28, str29, str30, ahd13, ahd16);
    }

    public /* synthetic */ HotelSelection(String str, String str2, String str3, String str4, String str5, HotelTrip hotelTrip, String str6, AHD ahd, Integer num, AHD ahd2, AHD ahd3, HotelPrice hotelPrice, HotelPayment hotelPayment, AHD ahd4, HotelCancellation hotelCancellation, boolean z, HotelDetails hotelDetails, String str7, String str8, HotelTaxesDisclosure hotelTaxesDisclosure, HotelMoney hotelMoney, AHD ahd5, HotelBookingAction hotelBookingAction, String str9, String str10, String str11, String str12, HotelGuestReviews hotelGuestReviews, String str13, String str14, String str15, String str16, AHD ahd6, String str17, String str18, boolean z2, String str19, String str20, String str21, AHD ahd7, AHD ahd8, int i, int i2, C06H c06h) {
        this(str, str2, str3, str4, str5, hotelTrip, str6, ahd, num, ahd2, ahd3, hotelPrice, hotelPayment, ahd4, hotelCancellation, z, hotelDetails, str7, str8, hotelTaxesDisclosure, hotelMoney, ahd5, hotelBookingAction, (i & 8388608) != 0 ? null : str9, (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : str10, (i & 33554432) != 0 ? null : str11, (i & 67108864) != 0 ? null : str12, (i & 134217728) != 0 ? null : hotelGuestReviews, (i & 268435456) != 0 ? null : str13, (i & 536870912) != 0 ? null : str14, (i & 1073741824) != 0 ? null : str15, (i & Integer.MIN_VALUE) != 0 ? null : str16, (i2 & 1) != 0 ? AHI.A01 : ahd6, (i2 & 2) != 0 ? null : str17, (i2 & 4) != 0 ? null : str18, C3cG.A1K(i2 & 8, z2), (i2 & 16) != 0 ? null : str19, (i2 & 32) != 0 ? null : str20, (i2 & 64) != 0 ? null : str21, (i2 & 128) != 0 ? AHI.A01 : ahd7, (i2 & 256) != 0 ? AHI.A01 : ahd8);
    }
}
