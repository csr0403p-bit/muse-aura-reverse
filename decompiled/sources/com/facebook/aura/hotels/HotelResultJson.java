package com.facebook.aura.hotels;

import X.AGI;
import X.AHD;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0881AGi;
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
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelResultJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<HotelAmenityHighlightJson> amenity_highlights;
    public final List<String> bed_options;
    public final String description;
    public final HotelBrowseActionJson detail_action;
    public final HotelGuestReviewsJson guest_reviews;
    public final String hotel_id;
    public final HotelImageJson image;
    public final HotelLocationJson location;
    public final String name;
    public final String offer_id;
    public final String phone_number;
    public final String rate_id;
    public final String result_ref;
    public final List<HotelAmenityHighlightJson> room_details;
    public final Integer room_max_guests;
    public final String room_name;
    public final HotelMoneyJson total_price;
    public final String website_url;

    public final class Companion {
        public final C9hr<HotelResultJson> serializer() {
            return HotelResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, HotelResultJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, HotelResultJson$Companion$$childSerializers$2.INSTANCE), null, null, AbstractC5321DgF.A02(num, HotelResultJson$Companion$$childSerializers$3.INSTANCE), null, null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResultJson) {
                HotelResultJson hotelResultJson = (HotelResultJson) obj;
                if (!C7384Etj.areEqual(this.result_ref, hotelResultJson.result_ref) || !C7384Etj.areEqual(this.hotel_id, hotelResultJson.hotel_id) || !C7384Etj.areEqual(this.name, hotelResultJson.name) || !C7384Etj.areEqual(this.offer_id, hotelResultJson.offer_id) || !C7384Etj.areEqual(this.rate_id, hotelResultJson.rate_id) || !C7384Etj.areEqual(this.image, hotelResultJson.image) || !C7384Etj.areEqual(this.location, hotelResultJson.location) || !C7384Etj.areEqual(this.total_price, hotelResultJson.total_price) || !C7384Etj.areEqual(this.room_name, hotelResultJson.room_name) || !C7384Etj.areEqual(this.room_details, hotelResultJson.room_details) || !C7384Etj.areEqual(this.bed_options, hotelResultJson.bed_options) || !C7384Etj.areEqual(this.room_max_guests, hotelResultJson.room_max_guests) || !C7384Etj.areEqual(this.guest_reviews, hotelResultJson.guest_reviews) || !C7384Etj.areEqual(this.amenity_highlights, hotelResultJson.amenity_highlights) || !C7384Etj.areEqual(this.description, hotelResultJson.description) || !C7384Etj.areEqual(this.phone_number, hotelResultJson.phone_number) || !C7384Etj.areEqual(this.website_url, hotelResultJson.website_url) || !C7384Etj.areEqual(this.detail_action, hotelResultJson.detail_action)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HotelResult toDomain(String str) {
        String strHotelReference;
        String strHotelReference2;
        String strHotelNonBlank;
        String strHotelReference3;
        String strHotelReference4;
        HotelImage hotelImage;
        String strHotelNonBlank2;
        HotelMoney domain;
        HotelBrowseActionJson hotelBrowseActionJson;
        if ((str != null && (hotelBrowseActionJson = this.detail_action) != null && (!"open_details".equals(hotelBrowseActionJson.type) || !str.equals(hotelBrowseActionJson.search_ref) || !C7384Etj.areEqual(hotelBrowseActionJson.result_ref, this.result_ref))) || (strHotelReference = HotelResultModelsKt.hotelReference(this.result_ref)) == null || (strHotelReference2 = HotelResultModelsKt.hotelReference(this.hotel_id)) == null || (strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(this.name)) == null || (strHotelReference3 = HotelResultModelsKt.hotelReference(this.offer_id)) == null || (strHotelReference4 = HotelResultModelsKt.hotelReference(this.rate_id)) == null) {
            return null;
        }
        HotelImageJson hotelImageJson = this.image;
        String strHotelWebUrl = HotelResultsJsonKt.hotelWebUrl(hotelImageJson != null ? hotelImageJson.url : null);
        if (strHotelWebUrl != null) {
            HotelImageJson hotelImageJson2 = this.image;
            hotelImage = new HotelImage(strHotelWebUrl, HotelResultModelsKt.hotelNonBlank(hotelImageJson2 != null ? hotelImageJson2.caption : null));
        } else {
            hotelImage = null;
        }
        HotelLocationJson hotelLocationJson = this.location;
        if (hotelLocationJson != null) {
            strHotelNonBlank2 = HotelResultModelsKt.hotelNonBlank(hotelLocationJson.formatted);
            if (strHotelNonBlank2 == null) {
                strHotelNonBlank2 = HotelResultModelsKt.hotelNonBlank(AbstractC06907md.A01(PairsDiscretionDocument.TERMINATOR, hotelLocationJson.addressLines(), null));
            }
        } else {
            strHotelNonBlank2 = null;
        }
        HotelMoneyJson hotelMoneyJson = this.total_price;
        if (hotelMoneyJson == null || (domain = hotelMoneyJson.toDomain()) == null || domain.amount.signum() < 0) {
            domain = null;
        }
        String strHotelNonBlank3 = HotelResultModelsKt.hotelNonBlank(this.room_name);
        List<String> list = this.bed_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strHotelNonBlank4 = HotelResultModelsKt.hotelNonBlank(AnonymousClass005.A0j(it));
            if (strHotelNonBlank4 != null) {
                arrayListA0h.add(strHotelNonBlank4);
            }
        }
        AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0a(arrayListA0h, 8));
        Integer num = this.room_max_guests;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        HotelGuestReviewsJson hotelGuestReviewsJson = this.guest_reviews;
        HotelGuestReviews domain2 = hotelGuestReviewsJson != null ? hotelGuestReviewsJson.toDomain() : null;
        List list2 = this.room_details;
        if (list2 == null) {
            list2 = C0881AGi.A00;
        }
        return new HotelResult(strHotelReference, strHotelReference2, strHotelNonBlank, strHotelReference3, strHotelReference4, hotelImage, strHotelNonBlank2, domain, strHotelNonBlank3, ahdA07, num, domain2, HotelResultsJsonKt.toHotelHighlights(this.amenity_highlights, "property"), HotelResultModelsKt.hotelNonBlank(this.description), HotelResultModelsKt.hotelNonBlank(this.phone_number), HotelResultsJsonKt.hotelWebUrl(this.website_url), HotelResultsJsonKt.toHotelHighlights(list2, "room"));
    }

    public /* synthetic */ HotelResultJson(String str, String str2, String str3, String str4, String str5, HotelImageJson hotelImageJson, HotelLocationJson hotelLocationJson, HotelMoneyJson hotelMoneyJson, String str6, List list, List list2, Integer num, HotelGuestReviewsJson hotelGuestReviewsJson, List list3, String str7, String str8, String str9, HotelBrowseActionJson hotelBrowseActionJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : hotelImageJson, (i & 64) != 0 ? null : hotelLocationJson, (i & 128) != 0 ? null : hotelMoneyJson, C3cG.A0e(str6, i & 256), (i & 512) != 0 ? null : list, (i & 1024) != 0 ? C0881AGi.A00 : list2, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : hotelGuestReviewsJson, (i & 8192) != 0 ? C0881AGi.A00 : list3, C3cG.A0e(str7, i & 16384), C3cI.A0V(i, 32768, str8), C3cI.A0V(i, 65536, str9), (i & 131072) != 0 ? null : hotelBrowseActionJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelResultJson hotelResultJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelResultJson.result_ref)) {
            c9j5.AAV(hotelResultJson.result_ref, c9iZ, 0);
        }
        if (zAfR || !"".equals(hotelResultJson.hotel_id)) {
            c9j5.AAV(hotelResultJson.hotel_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(hotelResultJson.name)) {
            c9j5.AAV(hotelResultJson.name, c9iZ, 2);
        }
        if (zAfR || !"".equals(hotelResultJson.offer_id)) {
            c9j5.AAV(hotelResultJson.offer_id, c9iZ, 3);
        }
        if (zAfR || !"".equals(hotelResultJson.rate_id)) {
            c9j5.AAV(hotelResultJson.rate_id, c9iZ, 4);
        }
        if (zAfR || hotelResultJson.image != null) {
            c9j5.AAP(hotelResultJson.image, HotelImageJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || hotelResultJson.location != null) {
            c9j5.AAP(hotelResultJson.location, HotelLocationJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || hotelResultJson.total_price != null) {
            c9j5.AAP(hotelResultJson.total_price, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || hotelResultJson.room_name != null) {
            c9j5.AAP(hotelResultJson.room_name, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || hotelResultJson.room_details != null) {
            c9j5.AAP(hotelResultJson.room_details, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(hotelResultJson.bed_options)) {
            c9j5.AAQ(hotelResultJson.bed_options, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || hotelResultJson.room_max_guests != null) {
            c9j5.AAP(hotelResultJson.room_max_guests, C07729ii.A00, c9iZ, 11);
        }
        if (zAfR || hotelResultJson.guest_reviews != null) {
            c9j5.AAP(hotelResultJson.guest_reviews, HotelGuestReviewsJson$$serializer.INSTANCE, c9iZ, 12);
        }
        if (zAfR || !C3cG.A1L(hotelResultJson.amenity_highlights)) {
            c9j5.AAQ(hotelResultJson.amenity_highlights, C3cH.A15(f0cArr, 13), c9iZ, 13);
        }
        if (zAfR || hotelResultJson.description != null) {
            c9j5.AAP(hotelResultJson.description, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || hotelResultJson.phone_number != null) {
            c9j5.AAP(hotelResultJson.phone_number, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || hotelResultJson.website_url != null) {
            c9j5.AAP(hotelResultJson.website_url, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || hotelResultJson.detail_action != null) {
            c9j5.AAP(hotelResultJson.detail_action, HotelBrowseActionJson$$serializer.INSTANCE, c9iZ, 17);
        }
    }

    public final String component1() {
        return this.result_ref;
    }

    public final List<HotelAmenityHighlightJson> component10() {
        return this.room_details;
    }

    public final List<String> component11() {
        return this.bed_options;
    }

    public final Integer component12() {
        return this.room_max_guests;
    }

    public final HotelGuestReviewsJson component13() {
        return this.guest_reviews;
    }

    public final List<HotelAmenityHighlightJson> component14() {
        return this.amenity_highlights;
    }

    public final String component15() {
        return this.description;
    }

    public final String component16() {
        return this.phone_number;
    }

    public final String component17() {
        return this.website_url;
    }

    public final HotelBrowseActionJson component18() {
        return this.detail_action;
    }

    public final String component2() {
        return this.hotel_id;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.offer_id;
    }

    public final String component5() {
        return this.rate_id;
    }

    public final HotelImageJson component6() {
        return this.image;
    }

    public final HotelLocationJson component7() {
        return this.location;
    }

    public final HotelMoneyJson component8() {
        return this.total_price;
    }

    public final String component9() {
        return this.room_name;
    }

    public final List<HotelAmenityHighlightJson> getAmenity_highlights() {
        return this.amenity_highlights;
    }

    public final List<String> getBed_options() {
        return this.bed_options;
    }

    public final String getDescription() {
        return this.description;
    }

    public final HotelBrowseActionJson getDetail_action() {
        return this.detail_action;
    }

    public final HotelGuestReviewsJson getGuest_reviews() {
        return this.guest_reviews;
    }

    public final String getHotel_id() {
        return this.hotel_id;
    }

    public final HotelImageJson getImage() {
        return this.image;
    }

    public final HotelLocationJson getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOffer_id() {
        return this.offer_id;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final String getRate_id() {
        return this.rate_id;
    }

    public final String getResult_ref() {
        return this.result_ref;
    }

    public final List<HotelAmenityHighlightJson> getRoom_details() {
        return this.room_details;
    }

    public final Integer getRoom_max_guests() {
        return this.room_max_guests;
    }

    public final String getRoom_name() {
        return this.room_name;
    }

    public final HotelMoneyJson getTotal_price() {
        return this.total_price;
    }

    public final String getWebsite_url() {
        return this.website_url;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.amenity_highlights, (((AnonymousClass005.A0F(this.bed_options, (((((((((AnonymousClass005.A0I(this.rate_id, AnonymousClass005.A0I(this.offer_id, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.hotel_id, AnonymousClass001.A0G(this.result_ref))))) + AnonymousClass006.A0D(this.image)) * 31) + AnonymousClass006.A0D(this.location)) * 31) + AnonymousClass006.A0D(this.total_price)) * 31) + AnonymousClass006.A0G(this.room_name)) * 31) + AnonymousClass006.A0D(this.room_details)) * 31) + AnonymousClass006.A0D(this.room_max_guests)) * 31) + AnonymousClass006.A0D(this.guest_reviews)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.phone_number)) * 31) + AnonymousClass006.A0G(this.website_url)) * 31) + C3cH.A02(this.detail_action);
    }

    public final HotelResultJson copy(String str, String str2, String str3, String str4, String str5, HotelImageJson hotelImageJson, HotelLocationJson hotelLocationJson, HotelMoneyJson hotelMoneyJson, String str6, List<HotelAmenityHighlightJson> list, List<String> list2, Integer num, HotelGuestReviewsJson hotelGuestReviewsJson, List<HotelAmenityHighlightJson> list3, String str7, String str8, String str9, HotelBrowseActionJson hotelBrowseActionJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(list2, 10);
        C7384Etj.A0Y(list3, 13);
        return new HotelResultJson(str, str2, str3, str4, str5, hotelImageJson, hotelLocationJson, hotelMoneyJson, str6, list, list2, num, hotelGuestReviewsJson, list3, str7, str8, str9, hotelBrowseActionJson);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ HotelResultJson copy$default(HotelResultJson hotelResultJson, String str, String str2, String str3, String str4, String str5, HotelImageJson hotelImageJson, HotelLocationJson hotelLocationJson, HotelMoneyJson hotelMoneyJson, String str6, List list, List list2, Integer num, HotelGuestReviewsJson hotelGuestReviewsJson, List list3, String str7, String str8, String str9, HotelBrowseActionJson hotelBrowseActionJson, int i, Object obj) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        HotelImageJson hotelImageJson2 = hotelImageJson;
        HotelLocationJson hotelLocationJson2 = hotelLocationJson;
        HotelMoneyJson hotelMoneyJson2 = hotelMoneyJson;
        String str15 = str6;
        List list4 = list;
        List list5 = list2;
        Integer num2 = num;
        HotelGuestReviewsJson hotelGuestReviewsJson2 = hotelGuestReviewsJson;
        List list6 = list3;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        HotelBrowseActionJson hotelBrowseActionJson2 = hotelBrowseActionJson;
        if ((i & 1) != 0) {
            str10 = hotelResultJson.result_ref;
        }
        if ((i & 2) != 0) {
            str11 = hotelResultJson.hotel_id;
        }
        if ((i & 4) != 0) {
            str12 = hotelResultJson.name;
        }
        if ((i & 8) != 0) {
            str13 = hotelResultJson.offer_id;
        }
        if ((i & 16) != 0) {
            str14 = hotelResultJson.rate_id;
        }
        if ((i & 32) != 0) {
            hotelImageJson2 = hotelResultJson.image;
        }
        if ((i & 64) != 0) {
            hotelLocationJson2 = hotelResultJson.location;
        }
        if ((i & 128) != 0) {
            hotelMoneyJson2 = hotelResultJson.total_price;
        }
        if ((i & 256) != 0) {
            str15 = hotelResultJson.room_name;
        }
        if ((i & 512) != 0) {
            list4 = hotelResultJson.room_details;
        }
        if ((i & 1024) != 0) {
            list5 = hotelResultJson.bed_options;
        }
        if ((i & 2048) != 0) {
            num2 = hotelResultJson.room_max_guests;
        }
        if ((i & 4096) != 0) {
            hotelGuestReviewsJson2 = hotelResultJson.guest_reviews;
        }
        if ((i & 8192) != 0) {
            list6 = hotelResultJson.amenity_highlights;
        }
        if ((i & 16384) != 0) {
            str16 = hotelResultJson.description;
        }
        if ((i & 32768) != 0) {
            str17 = hotelResultJson.phone_number;
        }
        if ((i & 65536) != 0) {
            str18 = hotelResultJson.website_url;
        }
        if ((i & 131072) != 0) {
            hotelBrowseActionJson2 = hotelResultJson.detail_action;
        }
        HotelImageJson hotelImageJson3 = hotelImageJson2;
        HotelLocationJson hotelLocationJson3 = hotelLocationJson2;
        HotelMoneyJson hotelMoneyJson3 = hotelMoneyJson2;
        return hotelResultJson.copy(str10, str11, str12, str13, str14, hotelImageJson3, hotelLocationJson3, hotelMoneyJson3, str15, list4, list5, num2, hotelGuestReviewsJson2, list6, str16, str17, str18, hotelBrowseActionJson2);
    }

    public HotelResultJson(String str, String str2, String str3, String str4, String str5, HotelImageJson hotelImageJson, HotelLocationJson hotelLocationJson, HotelMoneyJson hotelMoneyJson, String str6, List<HotelAmenityHighlightJson> list, List<String> list2, Integer num, HotelGuestReviewsJson hotelGuestReviewsJson, List<HotelAmenityHighlightJson> list3, String str7, String str8, String str9, HotelBrowseActionJson hotelBrowseActionJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(list2, 10);
        C7384Etj.A0Y(list3, 13);
        this.result_ref = str;
        this.hotel_id = str2;
        this.name = str3;
        this.offer_id = str4;
        this.rate_id = str5;
        this.image = hotelImageJson;
        this.location = hotelLocationJson;
        this.total_price = hotelMoneyJson;
        this.room_name = str6;
        this.room_details = list;
        this.bed_options = list2;
        this.room_max_guests = num;
        this.guest_reviews = hotelGuestReviewsJson;
        this.amenity_highlights = list3;
        this.description = str7;
        this.phone_number = str8;
        this.website_url = str9;
        this.detail_action = hotelBrowseActionJson;
    }

    public /* synthetic */ HotelResultJson(int i, String str, String str2, String str3, String str4, String str5, HotelImageJson hotelImageJson, HotelLocationJson hotelLocationJson, HotelMoneyJson hotelMoneyJson, String str6, List list, List list2, Integer num, HotelGuestReviewsJson hotelGuestReviewsJson, List list3, String str7, String str8, String str9, HotelBrowseActionJson hotelBrowseActionJson, C2hx c2hx) {
        List list4 = list3;
        if ((i & 1) == 0) {
            this.result_ref = "";
        } else {
            this.result_ref = str;
        }
        if ((i & 2) == 0) {
            this.hotel_id = "";
        } else {
            this.hotel_id = str2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.offer_id = "";
        } else {
            this.offer_id = str4;
        }
        if ((i & 16) == 0) {
            this.rate_id = "";
        } else {
            this.rate_id = str5;
        }
        if ((i & 32) == 0) {
            this.image = null;
        } else {
            this.image = hotelImageJson;
        }
        if ((i & 64) == 0) {
            this.location = null;
        } else {
            this.location = hotelLocationJson;
        }
        if ((i & 128) == 0) {
            this.total_price = null;
        } else {
            this.total_price = hotelMoneyJson;
        }
        if ((i & 256) == 0) {
            this.room_name = null;
        } else {
            this.room_name = str6;
        }
        if ((i & 512) == 0) {
            this.room_details = null;
        } else {
            this.room_details = list;
        }
        if ((i & 1024) == 0) {
            this.bed_options = C0881AGi.A00;
        } else {
            this.bed_options = list2;
        }
        if ((i & 2048) == 0) {
            this.room_max_guests = null;
        } else {
            this.room_max_guests = num;
        }
        if ((i & 4096) == 0) {
            this.guest_reviews = null;
        } else {
            this.guest_reviews = hotelGuestReviewsJson;
        }
        this.amenity_highlights = (i & 8192) == 0 ? C0881AGi.A00 : list4;
        if ((i & 16384) == 0) {
            this.description = null;
        } else {
            this.description = str7;
        }
        if ((32768 & i) == 0) {
            this.phone_number = null;
        } else {
            this.phone_number = str8;
        }
        if ((65536 & i) == 0) {
            this.website_url = null;
        } else {
            this.website_url = str9;
        }
        if ((i & 131072) == 0) {
            this.detail_action = null;
        } else {
            this.detail_action = hotelBrowseActionJson;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HotelResultJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", "", "", "", "", null, null, null, null, null, c0881AGi, null, null, c0881AGi, null, null, null, null);
    }
}
