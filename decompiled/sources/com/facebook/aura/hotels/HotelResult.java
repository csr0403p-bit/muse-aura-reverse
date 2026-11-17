package com.facebook.aura.hotels;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HotelResult extends C06G {
    public static final int $stable = 0;
    public final AHD<String> amenityHighlights;
    public final AHD<String> bedOptions;
    public final Integer capacity;
    public final String description;
    public final HotelGuestReviews guestReviews;
    public final String hotelId;
    public final HotelImage image;
    public final String location;
    public final String name;
    public final String offerId;
    public final String phoneNumber;
    public final String rateId;
    public final String resultRef;
    public final AHD<String> roomDetails;
    public final String roomName;
    public final HotelMoney totalPrice;
    public final String websiteUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResult) {
                HotelResult hotelResult = (HotelResult) obj;
                if (!C7384Etj.areEqual(this.resultRef, hotelResult.resultRef) || !C7384Etj.areEqual(this.hotelId, hotelResult.hotelId) || !C7384Etj.areEqual(this.name, hotelResult.name) || !C7384Etj.areEqual(this.offerId, hotelResult.offerId) || !C7384Etj.areEqual(this.rateId, hotelResult.rateId) || !C7384Etj.areEqual(this.image, hotelResult.image) || !C7384Etj.areEqual(this.location, hotelResult.location) || !C7384Etj.areEqual(this.totalPrice, hotelResult.totalPrice) || !C7384Etj.areEqual(this.roomName, hotelResult.roomName) || !C7384Etj.areEqual(this.bedOptions, hotelResult.bedOptions) || !C7384Etj.areEqual(this.capacity, hotelResult.capacity) || !C7384Etj.areEqual(this.guestReviews, hotelResult.guestReviews) || !C7384Etj.areEqual(this.amenityHighlights, hotelResult.amenityHighlights) || !C7384Etj.areEqual(this.description, hotelResult.description) || !C7384Etj.areEqual(this.phoneNumber, hotelResult.phoneNumber) || !C7384Etj.areEqual(this.websiteUrl, hotelResult.websiteUrl) || !C7384Etj.areEqual(this.roomDetails, hotelResult.roomDetails)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelResult copy$default(HotelResult hotelResult, String str, String str2, String str3, String str4, String str5, HotelImage hotelImage, String str6, HotelMoney hotelMoney, String str7, AHD ahd, Integer num, HotelGuestReviews hotelGuestReviews, AHD ahd2, String str8, String str9, String str10, AHD ahd3, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        HotelImage hotelImage2 = hotelImage;
        String str16 = str6;
        HotelMoney hotelMoney2 = hotelMoney;
        String str17 = str7;
        AHD ahd4 = ahd;
        Integer num2 = num;
        HotelGuestReviews hotelGuestReviews2 = hotelGuestReviews;
        AHD ahd5 = ahd2;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        AHD ahd6 = ahd3;
        if ((i & 1) != 0) {
            str11 = hotelResult.resultRef;
        }
        if ((i & 2) != 0) {
            str12 = hotelResult.hotelId;
        }
        if ((i & 4) != 0) {
            str13 = hotelResult.name;
        }
        if ((i & 8) != 0) {
            str14 = hotelResult.offerId;
        }
        if ((i & 16) != 0) {
            str15 = hotelResult.rateId;
        }
        if ((i & 32) != 0) {
            hotelImage2 = hotelResult.image;
        }
        if ((i & 64) != 0) {
            str16 = hotelResult.location;
        }
        if ((i & 128) != 0) {
            hotelMoney2 = hotelResult.totalPrice;
        }
        if ((i & 256) != 0) {
            str17 = hotelResult.roomName;
        }
        if ((i & 512) != 0) {
            ahd4 = hotelResult.bedOptions;
        }
        if ((i & 1024) != 0) {
            num2 = hotelResult.capacity;
        }
        if ((i & 2048) != 0) {
            hotelGuestReviews2 = hotelResult.guestReviews;
        }
        if ((i & 4096) != 0) {
            ahd5 = hotelResult.amenityHighlights;
        }
        if ((i & 8192) != 0) {
            str18 = hotelResult.description;
        }
        if ((i & 16384) != 0) {
            str19 = hotelResult.phoneNumber;
        }
        if ((i & 32768) != 0) {
            str20 = hotelResult.websiteUrl;
        }
        if ((i & 65536) != 0) {
            ahd6 = hotelResult.roomDetails;
        }
        String str21 = str15;
        return hotelResult.copy(str11, str12, str13, str14, str21, hotelImage2, str16, hotelMoney2, str17, ahd4, num2, hotelGuestReviews2, ahd5, str18, str19, str20, ahd6);
    }

    public final String component1() {
        return this.resultRef;
    }

    public final AHD<String> component10() {
        return this.bedOptions;
    }

    public final Integer component11() {
        return this.capacity;
    }

    public final HotelGuestReviews component12() {
        return this.guestReviews;
    }

    public final AHD<String> component13() {
        return this.amenityHighlights;
    }

    public final String component14() {
        return this.description;
    }

    public final String component15() {
        return this.phoneNumber;
    }

    public final String component16() {
        return this.websiteUrl;
    }

    public final AHD<String> component17() {
        return this.roomDetails;
    }

    public final String component2() {
        return this.hotelId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.offerId;
    }

    public final String component5() {
        return this.rateId;
    }

    public final HotelImage component6() {
        return this.image;
    }

    public final String component7() {
        return this.location;
    }

    public final HotelMoney component8() {
        return this.totalPrice;
    }

    public final String component9() {
        return this.roomName;
    }

    public final AHD<String> getAmenityHighlights() {
        return this.amenityHighlights;
    }

    public final AHD<String> getBedOptions() {
        return this.bedOptions;
    }

    public final Integer getCapacity() {
        return this.capacity;
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

    public final HotelImage getImage() {
        return this.image;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getRateId() {
        return this.rateId;
    }

    public final String getResultRef() {
        return this.resultRef;
    }

    public final AHD<String> getRoomDetails() {
        return this.roomDetails;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final HotelMoney getTotalPrice() {
        return this.totalPrice;
    }

    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.roomDetails, (((((AnonymousClass005.A0F(this.amenityHighlights, (((AnonymousClass005.A0F(this.bedOptions, (((((((AnonymousClass005.A0I(this.rateId, AnonymousClass005.A0I(this.offerId, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.hotelId, AnonymousClass001.A0G(this.resultRef))))) + AnonymousClass006.A0D(this.image)) * 31) + AnonymousClass006.A0G(this.location)) * 31) + AnonymousClass006.A0D(this.totalPrice)) * 31) + AnonymousClass006.A0G(this.roomName)) * 31) + AnonymousClass006.A0D(this.capacity)) * 31) + AnonymousClass006.A0D(this.guestReviews)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.phoneNumber)) * 31) + AnonymousClass005.A0H(this.websiteUrl)) * 31);
    }

    public HotelResult(String str, String str2, String str3, String str4, String str5, HotelImage hotelImage, String str6, HotelMoney hotelMoney, String str7, AHD<String> ahd, Integer num, HotelGuestReviews hotelGuestReviews, AHD<String> ahd2, String str8, String str9, String str10, AHD<String> ahd3) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(ahd, 9);
        C7384Etj.A0Y(ahd2, 12);
        C7384Etj.A0Y(ahd3, 16);
        this.resultRef = str;
        this.hotelId = str2;
        this.name = str3;
        this.offerId = str4;
        this.rateId = str5;
        this.image = hotelImage;
        this.location = str6;
        this.totalPrice = hotelMoney;
        this.roomName = str7;
        this.bedOptions = ahd;
        this.capacity = num;
        this.guestReviews = hotelGuestReviews;
        this.amenityHighlights = ahd2;
        this.description = str8;
        this.phoneNumber = str9;
        this.websiteUrl = str10;
        this.roomDetails = ahd3;
    }

    public final HotelResult copy(String str, String str2, String str3, String str4, String str5, HotelImage hotelImage, String str6, HotelMoney hotelMoney, String str7, AHD<String> ahd, Integer num, HotelGuestReviews hotelGuestReviews, AHD<String> ahd2, String str8, String str9, String str10, AHD<String> ahd3) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(ahd, 9);
        C7384Etj.A0Y(ahd2, 12);
        C7384Etj.A0Y(ahd3, 16);
        return new HotelResult(str, str2, str3, str4, str5, hotelImage, str6, hotelMoney, str7, ahd, num, hotelGuestReviews, ahd2, str8, str9, str10, ahd3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelResult(String str, String str2, String str3, String str4, String str5, HotelImage hotelImage, String str6, HotelMoney hotelMoney, String str7, AHD ahd, Integer num, HotelGuestReviews hotelGuestReviews, AHD ahd2, String str8, String str9, String str10, AHD ahd3, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, hotelImage, str6, hotelMoney, str7, ahd, num, hotelGuestReviews, (i & 4096) != 0 ? AHI.A01 : ahd2, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (i & 65536) != 0 ? AHI.A01 : ahd3);
    }
}
