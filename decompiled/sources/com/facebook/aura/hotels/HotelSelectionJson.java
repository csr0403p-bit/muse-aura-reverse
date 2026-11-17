package com.facebook.aura.hotels;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class HotelSelectionJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement address;
    public final List<HotelAmenityHighlightJson> amenity_highlights;
    public final HotelAttributionJson attribution;
    public final HotelBookingActionJson booking_action;
    public final HotelSelectionCancellationJson cancellation;
    public final String captured_at;
    public final String description;
    public final List<HotelImageJson> gallery;
    public final HotelGuestReviewJson guest_review;
    public final HotelResultJson hotel;
    public final HotelPaymentJson payment;
    public final JsonElement phone_number;
    public final HotelSelectionPoliciesJson policies;
    public final HotelSelectionPriceJson price;
    public final boolean price_changed;
    public final JsonElement property_page_url;
    public final String provider;
    public final String room_description;
    public final Integer room_max_guests;
    public final HotelRoomOptionsActionJson room_options_action;
    public final int schema_version;
    public final String selection_ref;
    public final String star_rating;
    public final HotelTripJson trip;
    public final HotelBookingActionJson website_action;

    public final class Companion {
        public final C9hr<HotelSelectionJson> serializer() {
            return HotelSelectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, HotelSelectionJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, AbstractC5321DgF.A02(num, HotelSelectionJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null, null, null, null};
    }

    public HotelSelectionJson(int i, String str, HotelAttributionJson hotelAttributionJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, String str2, HotelTripJson hotelTripJson, HotelResultJson hotelResultJson, List<HotelImageJson> list, String str3, HotelGuestReviewJson hotelGuestReviewJson, String str4, String str5, Integer num, List<HotelAmenityHighlightJson> list2, HotelSelectionPriceJson hotelSelectionPriceJson, HotelPaymentJson hotelPaymentJson, HotelSelectionCancellationJson hotelSelectionCancellationJson, HotelSelectionPoliciesJson hotelSelectionPoliciesJson, String str6, boolean z, HotelBookingActionJson hotelBookingActionJson, HotelBookingActionJson hotelBookingActionJson2, HotelRoomOptionsActionJson hotelRoomOptionsActionJson) {
        AnonymousClass002.A1E(str, 1, str2);
        C60Q.A1F(list, 9, list2);
        this.schema_version = i;
        this.provider = str;
        this.attribution = hotelAttributionJson;
        this.address = jsonElement;
        this.phone_number = jsonElement2;
        this.property_page_url = jsonElement3;
        this.selection_ref = str2;
        this.trip = hotelTripJson;
        this.hotel = hotelResultJson;
        this.gallery = list;
        this.star_rating = str3;
        this.guest_review = hotelGuestReviewJson;
        this.description = str4;
        this.room_description = str5;
        this.room_max_guests = num;
        this.amenity_highlights = list2;
        this.price = hotelSelectionPriceJson;
        this.payment = hotelPaymentJson;
        this.cancellation = hotelSelectionCancellationJson;
        this.policies = hotelSelectionPoliciesJson;
        this.captured_at = str6;
        this.price_changed = z;
        this.booking_action = hotelBookingActionJson;
        this.website_action = hotelBookingActionJson2;
        this.room_options_action = hotelRoomOptionsActionJson;
    }

    public final HotelSelectionJson copy(int i, String str, HotelAttributionJson hotelAttributionJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, String str2, HotelTripJson hotelTripJson, HotelResultJson hotelResultJson, List<HotelImageJson> list, String str3, HotelGuestReviewJson hotelGuestReviewJson, String str4, String str5, Integer num, List<HotelAmenityHighlightJson> list2, HotelSelectionPriceJson hotelSelectionPriceJson, HotelPaymentJson hotelPaymentJson, HotelSelectionCancellationJson hotelSelectionCancellationJson, HotelSelectionPoliciesJson hotelSelectionPoliciesJson, String str6, boolean z, HotelBookingActionJson hotelBookingActionJson, HotelBookingActionJson hotelBookingActionJson2, HotelRoomOptionsActionJson hotelRoomOptionsActionJson) {
        AnonymousClass002.A1E(str, 1, str2);
        C60Q.A1F(list, 9, list2);
        return new HotelSelectionJson(i, str, hotelAttributionJson, jsonElement, jsonElement2, jsonElement3, str2, hotelTripJson, hotelResultJson, list, str3, hotelGuestReviewJson, str4, str5, num, list2, hotelSelectionPriceJson, hotelPaymentJson, hotelSelectionCancellationJson, hotelSelectionPoliciesJson, str6, z, hotelBookingActionJson, hotelBookingActionJson2, hotelRoomOptionsActionJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelectionJson) {
                HotelSelectionJson hotelSelectionJson = (HotelSelectionJson) obj;
                if (this.schema_version != hotelSelectionJson.schema_version || !C7384Etj.areEqual(this.provider, hotelSelectionJson.provider) || !C7384Etj.areEqual(this.attribution, hotelSelectionJson.attribution) || !C7384Etj.areEqual(this.address, hotelSelectionJson.address) || !C7384Etj.areEqual(this.phone_number, hotelSelectionJson.phone_number) || !C7384Etj.areEqual(this.property_page_url, hotelSelectionJson.property_page_url) || !C7384Etj.areEqual(this.selection_ref, hotelSelectionJson.selection_ref) || !C7384Etj.areEqual(this.trip, hotelSelectionJson.trip) || !C7384Etj.areEqual(this.hotel, hotelSelectionJson.hotel) || !C7384Etj.areEqual(this.gallery, hotelSelectionJson.gallery) || !C7384Etj.areEqual(this.star_rating, hotelSelectionJson.star_rating) || !C7384Etj.areEqual(this.guest_review, hotelSelectionJson.guest_review) || !C7384Etj.areEqual(this.description, hotelSelectionJson.description) || !C7384Etj.areEqual(this.room_description, hotelSelectionJson.room_description) || !C7384Etj.areEqual(this.room_max_guests, hotelSelectionJson.room_max_guests) || !C7384Etj.areEqual(this.amenity_highlights, hotelSelectionJson.amenity_highlights) || !C7384Etj.areEqual(this.price, hotelSelectionJson.price) || !C7384Etj.areEqual(this.payment, hotelSelectionJson.payment) || !C7384Etj.areEqual(this.cancellation, hotelSelectionJson.cancellation) || !C7384Etj.areEqual(this.policies, hotelSelectionJson.policies) || !C7384Etj.areEqual(this.captured_at, hotelSelectionJson.captured_at) || this.price_changed != hotelSelectionJson.price_changed || !C7384Etj.areEqual(this.booking_action, hotelSelectionJson.booking_action) || !C7384Etj.areEqual(this.website_action, hotelSelectionJson.website_action) || !C7384Etj.areEqual(this.room_options_action, hotelSelectionJson.room_options_action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelSelectionJson hotelSelectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelSelectionJson.schema_version != 0) {
            c9j5.AAK(c9iZ, 0, hotelSelectionJson.schema_version);
        }
        if (zAfR || !"".equals(hotelSelectionJson.provider)) {
            c9j5.AAV(hotelSelectionJson.provider, c9iZ, 1);
        }
        if (zAfR || hotelSelectionJson.attribution != null) {
            c9j5.AAP(hotelSelectionJson.attribution, HotelAttributionJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || hotelSelectionJson.address != null) {
            c9j5.AAP(hotelSelectionJson.address, JsonElementSerializer.A00, c9iZ, 3);
        }
        if (zAfR || hotelSelectionJson.phone_number != null) {
            c9j5.AAP(hotelSelectionJson.phone_number, JsonElementSerializer.A00, c9iZ, 4);
        }
        if (zAfR || hotelSelectionJson.property_page_url != null) {
            c9j5.AAP(hotelSelectionJson.property_page_url, JsonElementSerializer.A00, c9iZ, 5);
        }
        if (zAfR || !"".equals(hotelSelectionJson.selection_ref)) {
            c9j5.AAV(hotelSelectionJson.selection_ref, c9iZ, 6);
        }
        if (zAfR || hotelSelectionJson.trip != null) {
            c9j5.AAP(hotelSelectionJson.trip, HotelTripJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || hotelSelectionJson.hotel != null) {
            c9j5.AAP(hotelSelectionJson.hotel, HotelResultJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionJson.gallery)) {
            c9j5.AAQ(hotelSelectionJson.gallery, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
        if (zAfR || hotelSelectionJson.star_rating != null) {
            c9j5.AAP(hotelSelectionJson.star_rating, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || hotelSelectionJson.guest_review != null) {
            c9j5.AAP(hotelSelectionJson.guest_review, HotelGuestReviewJson$$serializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || hotelSelectionJson.description != null) {
            c9j5.AAP(hotelSelectionJson.description, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || hotelSelectionJson.room_description != null) {
            c9j5.AAP(hotelSelectionJson.room_description, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || hotelSelectionJson.room_max_guests != null) {
            c9j5.AAP(hotelSelectionJson.room_max_guests, C07729ii.A00, c9iZ, 14);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionJson.amenity_highlights)) {
            c9j5.AAQ(hotelSelectionJson.amenity_highlights, C3cH.A15(f0cArr, 15), c9iZ, 15);
        }
        if (zAfR || hotelSelectionJson.price != null) {
            c9j5.AAP(hotelSelectionJson.price, HotelSelectionPriceJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || hotelSelectionJson.payment != null) {
            c9j5.AAP(hotelSelectionJson.payment, HotelPaymentJson$$serializer.INSTANCE, c9iZ, 17);
        }
        if (zAfR || hotelSelectionJson.cancellation != null) {
            c9j5.AAP(hotelSelectionJson.cancellation, HotelSelectionCancellationJson$$serializer.INSTANCE, c9iZ, 18);
        }
        if (zAfR || hotelSelectionJson.policies != null) {
            c9j5.AAP(hotelSelectionJson.policies, HotelSelectionPoliciesJson$$serializer.INSTANCE, c9iZ, 19);
        }
        if (zAfR || hotelSelectionJson.captured_at != null) {
            c9j5.AAP(hotelSelectionJson.captured_at, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || hotelSelectionJson.price_changed) {
            c9j5.AA7(c9iZ, 21, hotelSelectionJson.price_changed);
        }
        if (zAfR || hotelSelectionJson.booking_action != null) {
            c9j5.AAP(hotelSelectionJson.booking_action, HotelBookingActionJson$$serializer.INSTANCE, c9iZ, 22);
        }
        if (zAfR || hotelSelectionJson.website_action != null) {
            c9j5.AAP(hotelSelectionJson.website_action, HotelBookingActionJson$$serializer.INSTANCE, c9iZ, 23);
        }
        if (zAfR || hotelSelectionJson.room_options_action != null) {
            c9j5.AAP(hotelSelectionJson.room_options_action, HotelRoomOptionsActionJson$$serializer.INSTANCE, c9iZ, 24);
        }
    }

    public final int component1() {
        return this.schema_version;
    }

    public final List<HotelImageJson> component10() {
        return this.gallery;
    }

    public final String component11() {
        return this.star_rating;
    }

    public final HotelGuestReviewJson component12() {
        return this.guest_review;
    }

    public final String component13() {
        return this.description;
    }

    public final String component14() {
        return this.room_description;
    }

    public final Integer component15() {
        return this.room_max_guests;
    }

    public final List<HotelAmenityHighlightJson> component16() {
        return this.amenity_highlights;
    }

    public final HotelSelectionPriceJson component17() {
        return this.price;
    }

    public final HotelPaymentJson component18() {
        return this.payment;
    }

    public final HotelSelectionCancellationJson component19() {
        return this.cancellation;
    }

    public final String component2() {
        return this.provider;
    }

    public final HotelSelectionPoliciesJson component20() {
        return this.policies;
    }

    public final String component21() {
        return this.captured_at;
    }

    public final boolean component22() {
        return this.price_changed;
    }

    public final HotelBookingActionJson component23() {
        return this.booking_action;
    }

    public final HotelBookingActionJson component24() {
        return this.website_action;
    }

    public final HotelRoomOptionsActionJson component25() {
        return this.room_options_action;
    }

    public final HotelAttributionJson component3() {
        return this.attribution;
    }

    public final JsonElement component4() {
        return this.address;
    }

    public final JsonElement component5() {
        return this.phone_number;
    }

    public final JsonElement component6() {
        return this.property_page_url;
    }

    public final String component7() {
        return this.selection_ref;
    }

    public final HotelTripJson component8() {
        return this.trip;
    }

    public final HotelResultJson component9() {
        return this.hotel;
    }

    public final JsonElement getAddress() {
        return this.address;
    }

    public final List<HotelAmenityHighlightJson> getAmenity_highlights() {
        return this.amenity_highlights;
    }

    public final HotelAttributionJson getAttribution() {
        return this.attribution;
    }

    public final HotelBookingActionJson getBooking_action() {
        return this.booking_action;
    }

    public final HotelSelectionCancellationJson getCancellation() {
        return this.cancellation;
    }

    public final String getCaptured_at() {
        return this.captured_at;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<HotelImageJson> getGallery() {
        return this.gallery;
    }

    public final HotelGuestReviewJson getGuest_review() {
        return this.guest_review;
    }

    public final HotelResultJson getHotel() {
        return this.hotel;
    }

    public final HotelPaymentJson getPayment() {
        return this.payment;
    }

    public final JsonElement getPhone_number() {
        return this.phone_number;
    }

    public final HotelSelectionPoliciesJson getPolicies() {
        return this.policies;
    }

    public final HotelSelectionPriceJson getPrice() {
        return this.price;
    }

    public final boolean getPrice_changed() {
        return this.price_changed;
    }

    public final JsonElement getProperty_page_url() {
        return this.property_page_url;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getRoom_description() {
        return this.room_description;
    }

    public final Integer getRoom_max_guests() {
        return this.room_max_guests;
    }

    public final HotelRoomOptionsActionJson getRoom_options_action() {
        return this.room_options_action;
    }

    public final int getSchema_version() {
        return this.schema_version;
    }

    public final String getSelection_ref() {
        return this.selection_ref;
    }

    public final String getStar_rating() {
        return this.star_rating;
    }

    public final HotelTripJson getTrip() {
        return this.trip;
    }

    public final HotelBookingActionJson getWebsite_action() {
        return this.website_action;
    }

    public int hashCode() {
        return ((((C0KA.A01((((((((((AnonymousClass005.A0F(this.amenity_highlights, (((((((((AnonymousClass005.A0F(this.gallery, (((AnonymousClass005.A0I(this.selection_ref, (((((((AnonymousClass005.A0I(this.provider, this.schema_version * 31) + AnonymousClass006.A0D(this.attribution)) * 31) + AnonymousClass006.A0D(this.address)) * 31) + AnonymousClass006.A0D(this.phone_number)) * 31) + AnonymousClass006.A0D(this.property_page_url)) * 31) + AnonymousClass006.A0D(this.trip)) * 31) + AnonymousClass006.A0D(this.hotel)) * 31) + AnonymousClass006.A0G(this.star_rating)) * 31) + AnonymousClass006.A0D(this.guest_review)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.room_description)) * 31) + AnonymousClass006.A0D(this.room_max_guests)) * 31) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0D(this.payment)) * 31) + AnonymousClass006.A0D(this.cancellation)) * 31) + AnonymousClass006.A0D(this.policies)) * 31) + AnonymousClass006.A0G(this.captured_at)) * 31, this.price_changed) + AnonymousClass006.A0D(this.booking_action)) * 31) + AnonymousClass006.A0D(this.website_action)) * 31) + C3cH.A02(this.room_options_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.hotels.HotelSelection toDomain() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionJson.toDomain():com.facebook.aura.hotels.HotelSelection");
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ HotelSelectionJson copy$default(HotelSelectionJson hotelSelectionJson, int i, String str, HotelAttributionJson hotelAttributionJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, String str2, HotelTripJson hotelTripJson, HotelResultJson hotelResultJson, List list, String str3, HotelGuestReviewJson hotelGuestReviewJson, String str4, String str5, Integer num, List list2, HotelSelectionPriceJson hotelSelectionPriceJson, HotelPaymentJson hotelPaymentJson, HotelSelectionCancellationJson hotelSelectionCancellationJson, HotelSelectionPoliciesJson hotelSelectionPoliciesJson, String str6, boolean z, HotelBookingActionJson hotelBookingActionJson, HotelBookingActionJson hotelBookingActionJson2, HotelRoomOptionsActionJson hotelRoomOptionsActionJson, int i2, Object obj) {
        int i3 = i;
        String str7 = str;
        HotelAttributionJson hotelAttributionJson2 = hotelAttributionJson;
        JsonElement jsonElement4 = jsonElement;
        JsonElement jsonElement5 = jsonElement2;
        JsonElement jsonElement6 = jsonElement3;
        String str8 = str2;
        HotelTripJson hotelTripJson2 = hotelTripJson;
        HotelResultJson hotelResultJson2 = hotelResultJson;
        List list3 = list;
        String str9 = str3;
        HotelGuestReviewJson hotelGuestReviewJson2 = hotelGuestReviewJson;
        String str10 = str4;
        String str11 = str5;
        Integer num2 = num;
        List list4 = list2;
        HotelSelectionPoliciesJson hotelSelectionPoliciesJson2 = hotelSelectionPoliciesJson;
        String str12 = str6;
        boolean z2 = z;
        HotelBookingActionJson hotelBookingActionJson3 = hotelBookingActionJson;
        HotelBookingActionJson hotelBookingActionJson4 = hotelBookingActionJson2;
        HotelSelectionPriceJson hotelSelectionPriceJson2 = hotelSelectionPriceJson;
        HotelPaymentJson hotelPaymentJson2 = hotelPaymentJson;
        HotelSelectionCancellationJson hotelSelectionCancellationJson2 = hotelSelectionCancellationJson;
        HotelRoomOptionsActionJson hotelRoomOptionsActionJson2 = hotelRoomOptionsActionJson;
        if ((i2 & 1) != 0) {
            i3 = hotelSelectionJson.schema_version;
        }
        if ((i2 & 2) != 0) {
            str7 = hotelSelectionJson.provider;
        }
        if ((i2 & 4) != 0) {
            hotelAttributionJson2 = hotelSelectionJson.attribution;
        }
        if ((i2 & 8) != 0) {
            jsonElement4 = hotelSelectionJson.address;
        }
        if ((i2 & 16) != 0) {
            jsonElement5 = hotelSelectionJson.phone_number;
        }
        if ((i2 & 32) != 0) {
            jsonElement6 = hotelSelectionJson.property_page_url;
        }
        if ((i2 & 64) != 0) {
            str8 = hotelSelectionJson.selection_ref;
        }
        if ((i2 & 128) != 0) {
            hotelTripJson2 = hotelSelectionJson.trip;
        }
        if ((i2 & 256) != 0) {
            hotelResultJson2 = hotelSelectionJson.hotel;
        }
        if ((i2 & 512) != 0) {
            list3 = hotelSelectionJson.gallery;
        }
        if ((i2 & 1024) != 0) {
            str9 = hotelSelectionJson.star_rating;
        }
        if ((i2 & 2048) != 0) {
            hotelGuestReviewJson2 = hotelSelectionJson.guest_review;
        }
        if ((i2 & 4096) != 0) {
            str10 = hotelSelectionJson.description;
        }
        if ((i2 & 8192) != 0) {
            str11 = hotelSelectionJson.room_description;
        }
        if ((i2 & 16384) != 0) {
            num2 = hotelSelectionJson.room_max_guests;
        }
        if ((i2 & 32768) != 0) {
            list4 = hotelSelectionJson.amenity_highlights;
        }
        if ((i2 & 65536) != 0) {
            hotelSelectionPriceJson2 = hotelSelectionJson.price;
        }
        if ((i2 & 131072) != 0) {
            hotelPaymentJson2 = hotelSelectionJson.payment;
        }
        if ((i2 & 262144) != 0) {
            hotelSelectionCancellationJson2 = hotelSelectionJson.cancellation;
        }
        if ((i2 & 524288) != 0) {
            hotelSelectionPoliciesJson2 = hotelSelectionJson.policies;
        }
        if ((i2 & 1048576) != 0) {
            str12 = hotelSelectionJson.captured_at;
        }
        if ((i2 & 2097152) != 0) {
            z2 = hotelSelectionJson.price_changed;
        }
        if ((i2 & 4194304) != 0) {
            hotelBookingActionJson3 = hotelSelectionJson.booking_action;
        }
        if ((i2 & 8388608) != 0) {
            hotelBookingActionJson4 = hotelSelectionJson.website_action;
        }
        if ((i2 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            hotelRoomOptionsActionJson2 = hotelSelectionJson.room_options_action;
        }
        String str13 = str10;
        return hotelSelectionJson.copy(i3, str7, hotelAttributionJson2, jsonElement4, jsonElement5, jsonElement6, str8, hotelTripJson2, hotelResultJson2, list3, str9, hotelGuestReviewJson2, str13, str11, num2, list4, hotelSelectionPriceJson2, hotelPaymentJson2, hotelSelectionCancellationJson2, hotelSelectionPoliciesJson2, str12, z2, hotelBookingActionJson3, hotelBookingActionJson4, hotelRoomOptionsActionJson2);
    }

    public /* synthetic */ HotelSelectionJson(int i, int i2, String str, HotelAttributionJson hotelAttributionJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, String str2, HotelTripJson hotelTripJson, HotelResultJson hotelResultJson, List list, String str3, HotelGuestReviewJson hotelGuestReviewJson, String str4, String str5, Integer num, List list2, HotelSelectionPriceJson hotelSelectionPriceJson, HotelPaymentJson hotelPaymentJson, HotelSelectionCancellationJson hotelSelectionCancellationJson, HotelSelectionPoliciesJson hotelSelectionPoliciesJson, String str6, boolean z, HotelBookingActionJson hotelBookingActionJson, HotelBookingActionJson hotelBookingActionJson2, HotelRoomOptionsActionJson hotelRoomOptionsActionJson, C2hx c2hx) {
        List list3 = list2;
        if ((i & 1) == 0) {
            this.schema_version = 0;
        } else {
            this.schema_version = i2;
        }
        if ((i & 2) == 0) {
            this.provider = "";
        } else {
            this.provider = str;
        }
        if ((i & 4) == 0) {
            this.attribution = null;
        } else {
            this.attribution = hotelAttributionJson;
        }
        if ((i & 8) == 0) {
            this.address = null;
        } else {
            this.address = jsonElement;
        }
        if ((i & 16) == 0) {
            this.phone_number = null;
        } else {
            this.phone_number = jsonElement2;
        }
        if ((i & 32) == 0) {
            this.property_page_url = null;
        } else {
            this.property_page_url = jsonElement3;
        }
        if ((i & 64) == 0) {
            this.selection_ref = "";
        } else {
            this.selection_ref = str2;
        }
        if ((i & 128) == 0) {
            this.trip = null;
        } else {
            this.trip = hotelTripJson;
        }
        if ((i & 256) == 0) {
            this.hotel = null;
        } else {
            this.hotel = hotelResultJson;
        }
        if ((i & 512) == 0) {
            this.gallery = C0881AGi.A00;
        } else {
            this.gallery = list;
        }
        if ((i & 1024) == 0) {
            this.star_rating = null;
        } else {
            this.star_rating = str3;
        }
        if ((i & 2048) == 0) {
            this.guest_review = null;
        } else {
            this.guest_review = hotelGuestReviewJson;
        }
        if ((i & 4096) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 8192) == 0) {
            this.room_description = null;
        } else {
            this.room_description = str5;
        }
        if ((i & 16384) == 0) {
            this.room_max_guests = null;
        } else {
            this.room_max_guests = num;
        }
        this.amenity_highlights = (32768 & i) == 0 ? C0881AGi.A00 : list3;
        if ((65536 & i) == 0) {
            this.price = null;
        } else {
            this.price = hotelSelectionPriceJson;
        }
        if ((131072 & i) == 0) {
            this.payment = null;
        } else {
            this.payment = hotelPaymentJson;
        }
        if ((262144 & i) == 0) {
            this.cancellation = null;
        } else {
            this.cancellation = hotelSelectionCancellationJson;
        }
        if ((524288 & i) == 0) {
            this.policies = null;
        } else {
            this.policies = hotelSelectionPoliciesJson;
        }
        if ((1048576 & i) == 0) {
            this.captured_at = null;
        } else {
            this.captured_at = str6;
        }
        if ((2097152 & i) == 0) {
            this.price_changed = false;
        } else {
            this.price_changed = z;
        }
        if ((4194304 & i) == 0) {
            this.booking_action = null;
        } else {
            this.booking_action = hotelBookingActionJson;
        }
        if ((8388608 & i) == 0) {
            this.website_action = null;
        } else {
            this.website_action = hotelBookingActionJson2;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) == 0) {
            this.room_options_action = null;
        } else {
            this.room_options_action = hotelRoomOptionsActionJson;
        }
    }

    public /* synthetic */ HotelSelectionJson(int i, String str, HotelAttributionJson hotelAttributionJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, String str2, HotelTripJson hotelTripJson, HotelResultJson hotelResultJson, List list, String str3, HotelGuestReviewJson hotelGuestReviewJson, String str4, String str5, Integer num, List list2, HotelSelectionPriceJson hotelSelectionPriceJson, HotelPaymentJson hotelPaymentJson, HotelSelectionCancellationJson hotelSelectionCancellationJson, HotelSelectionPoliciesJson hotelSelectionPoliciesJson, String str6, boolean z, HotelBookingActionJson hotelBookingActionJson, HotelBookingActionJson hotelBookingActionJson2, HotelRoomOptionsActionJson hotelRoomOptionsActionJson, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : hotelAttributionJson, (i2 & 8) != 0 ? null : jsonElement, (i2 & 16) != 0 ? null : jsonElement2, (i2 & 32) != 0 ? null : jsonElement3, (i2 & 64) == 0 ? str2 : "", (i2 & 128) != 0 ? null : hotelTripJson, (i2 & 256) != 0 ? null : hotelResultJson, (i2 & 512) != 0 ? C0881AGi.A00 : list, C3cG.A0e(str3, i2 & 1024), (i2 & 2048) != 0 ? null : hotelGuestReviewJson, C3cG.A0e(str4, i2 & 4096), C3cG.A0e(str5, i2 & 8192), (i2 & 16384) != 0 ? null : num, (i2 & 32768) != 0 ? C0881AGi.A00 : list2, (i2 & 65536) != 0 ? null : hotelSelectionPriceJson, (i2 & 131072) != 0 ? null : hotelPaymentJson, (i2 & 262144) != 0 ? null : hotelSelectionCancellationJson, (i2 & 524288) != 0 ? null : hotelSelectionPoliciesJson, C3cI.A0V(i2, 1048576, str6), C3cH.A1L(i2, 2097152, z), (i2 & 4194304) != 0 ? null : hotelBookingActionJson, (i2 & 8388608) != 0 ? null : hotelBookingActionJson2, (i2 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : hotelRoomOptionsActionJson);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HotelSelectionJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(0, "", null, null, null, null, "", null, null, c0881AGi, null, null, null, null, null, c0881AGi, null, null, null, null, null, false, null, null, null);
    }
}
