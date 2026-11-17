package com.facebook.aura.hotels;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelResultsJson extends C06G {
    public static final int $stable = 0;
    public final HotelAttributionJson attribution;
    public final String captured_at;
    public final List<HotelResultJson> hotels;
    public final HotelResultLimitsJson limits;
    public final String location;
    public final String provider;
    public final Integer returned_count;
    public final int schema_version;
    public final String search_ref;
    public final HotelBrowseActionJson see_all_action;
    public final String title;
    public final HotelTripJson trip;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HotelResultsJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<HotelResultsJson> serializer() {
            return HotelResultsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelResultsJson() {
        this(0, "", "", null, null, null, null, C0881AGi.A00, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResultsJson) {
                HotelResultsJson hotelResultsJson = (HotelResultsJson) obj;
                if (this.schema_version != hotelResultsJson.schema_version || !C7384Etj.areEqual(this.search_ref, hotelResultsJson.search_ref) || !C7384Etj.areEqual(this.provider, hotelResultsJson.provider) || !C7384Etj.areEqual(this.attribution, hotelResultsJson.attribution) || !C7384Etj.areEqual(this.title, hotelResultsJson.title) || !C7384Etj.areEqual(this.location, hotelResultsJson.location) || !C7384Etj.areEqual(this.trip, hotelResultsJson.trip) || !C7384Etj.areEqual(this.hotels, hotelResultsJson.hotels) || !C7384Etj.areEqual(this.see_all_action, hotelResultsJson.see_all_action) || !C7384Etj.areEqual(this.captured_at, hotelResultsJson.captured_at) || !C7384Etj.areEqual(this.returned_count, hotelResultsJson.returned_count) || !C7384Etj.areEqual(this.limits, hotelResultsJson.limits)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelResultsJson copy$default(HotelResultsJson hotelResultsJson, int i, String str, String str2, HotelAttributionJson hotelAttributionJson, String str3, String str4, HotelTripJson hotelTripJson, List list, HotelBrowseActionJson hotelBrowseActionJson, String str5, Integer num, HotelResultLimitsJson hotelResultLimitsJson, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hotelResultsJson.schema_version;
        }
        if ((i2 & 2) != 0) {
            str = hotelResultsJson.search_ref;
        }
        if ((i2 & 4) != 0) {
            str2 = hotelResultsJson.provider;
        }
        if ((i2 & 8) != 0) {
            hotelAttributionJson = hotelResultsJson.attribution;
        }
        if ((i2 & 16) != 0) {
            str3 = hotelResultsJson.title;
        }
        if ((i2 & 32) != 0) {
            str4 = hotelResultsJson.location;
        }
        if ((i2 & 64) != 0) {
            hotelTripJson = hotelResultsJson.trip;
        }
        if ((i2 & 128) != 0) {
            list = hotelResultsJson.hotels;
        }
        if ((i2 & 256) != 0) {
            hotelBrowseActionJson = hotelResultsJson.see_all_action;
        }
        if ((i2 & 512) != 0) {
            str5 = hotelResultsJson.captured_at;
        }
        if ((i2 & 1024) != 0) {
            num = hotelResultsJson.returned_count;
        }
        if ((i2 & 2048) != 0) {
            hotelResultLimitsJson = hotelResultsJson.limits;
        }
        return hotelResultsJson.copy(i, str, str2, hotelAttributionJson, str3, str4, hotelTripJson, list, hotelBrowseActionJson, str5, num, hotelResultLimitsJson);
    }

    public static /* synthetic */ HotelResults toDomain$default(HotelResultsJson hotelResultsJson, HotelAttributionJson hotelAttributionJson, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelAttributionJson = null;
        }
        return hotelResultsJson.toDomain(hotelAttributionJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelResultsJson hotelResultsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelResultsJson.schema_version != 0) {
            c9j5.AAK(c9iZ, 0, hotelResultsJson.schema_version);
        }
        if (zAfR || !"".equals(hotelResultsJson.search_ref)) {
            c9j5.AAV(hotelResultsJson.search_ref, c9iZ, 1);
        }
        if (zAfR || !"".equals(hotelResultsJson.provider)) {
            c9j5.AAV(hotelResultsJson.provider, c9iZ, 2);
        }
        if (zAfR || hotelResultsJson.attribution != null) {
            c9j5.AAP(hotelResultsJson.attribution, HotelAttributionJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || hotelResultsJson.title != null) {
            c9j5.AAP(hotelResultsJson.title, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hotelResultsJson.location != null) {
            c9j5.AAP(hotelResultsJson.location, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || hotelResultsJson.trip != null) {
            c9j5.AAP(hotelResultsJson.trip, HotelTripJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(hotelResultsJson.hotels)) {
            c9j5.AAQ(hotelResultsJson.hotels, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || hotelResultsJson.see_all_action != null) {
            c9j5.AAP(hotelResultsJson.see_all_action, HotelBrowseActionJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || hotelResultsJson.captured_at != null) {
            c9j5.AAP(hotelResultsJson.captured_at, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || hotelResultsJson.returned_count != null) {
            c9j5.AAP(hotelResultsJson.returned_count, C07729ii.A00, c9iZ, 10);
        }
        if (zAfR || hotelResultsJson.limits != null) {
            c9j5.AAP(hotelResultsJson.limits, HotelResultLimitsJson$$serializer.INSTANCE, c9iZ, 11);
        }
    }

    public final int component1() {
        return this.schema_version;
    }

    public final String component10() {
        return this.captured_at;
    }

    public final Integer component11() {
        return this.returned_count;
    }

    public final HotelResultLimitsJson component12() {
        return this.limits;
    }

    public final String component2() {
        return this.search_ref;
    }

    public final String component3() {
        return this.provider;
    }

    public final HotelAttributionJson component4() {
        return this.attribution;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.location;
    }

    public final HotelTripJson component7() {
        return this.trip;
    }

    public final List<HotelResultJson> component8() {
        return this.hotels;
    }

    public final HotelBrowseActionJson component9() {
        return this.see_all_action;
    }

    public final HotelAttributionJson getAttribution() {
        return this.attribution;
    }

    public final String getCaptured_at() {
        return this.captured_at;
    }

    public final List<HotelResultJson> getHotels() {
        return this.hotels;
    }

    public final HotelResultLimitsJson getLimits() {
        return this.limits;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final Integer getReturned_count() {
        return this.returned_count;
    }

    public final int getSchema_version() {
        return this.schema_version;
    }

    public final String getSearch_ref() {
        return this.search_ref;
    }

    public final HotelBrowseActionJson getSee_all_action() {
        return this.see_all_action;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HotelTripJson getTrip() {
        return this.trip;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.hotels, (((((((AnonymousClass005.A0I(this.provider, AnonymousClass005.A0I(this.search_ref, this.schema_version * 31)) + AnonymousClass006.A0D(this.attribution)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.location)) * 31) + AnonymousClass006.A0D(this.trip)) * 31) + AnonymousClass006.A0D(this.see_all_action)) * 31) + AnonymousClass006.A0G(this.captured_at)) * 31) + AnonymousClass006.A0D(this.returned_count)) * 31) + C3cH.A02(this.limits);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5 A[PHI: r2
  0x00e5: PHI (r2v23 java.lang.Integer) = (r2v21 java.lang.Integer), (r2v24 java.lang.Integer) binds: [B:69:0x00e3, B:67:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.hotels.HotelResults toDomain(com.facebook.aura.hotels.HotelAttributionJson r22) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelResultsJson.toDomain(com.facebook.aura.hotels.HotelAttributionJson):com.facebook.aura.hotels.HotelResults");
    }

    public final HotelResultsJson copy(int i, String str, String str2, HotelAttributionJson hotelAttributionJson, String str3, String str4, HotelTripJson hotelTripJson, List<HotelResultJson> list, HotelBrowseActionJson hotelBrowseActionJson, String str5, Integer num, HotelResultLimitsJson hotelResultLimitsJson) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(list, 7);
        return new HotelResultsJson(i, str, str2, hotelAttributionJson, str3, str4, hotelTripJson, list, hotelBrowseActionJson, str5, num, hotelResultLimitsJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelResultsJson(int i, String str, String str2, HotelAttributionJson hotelAttributionJson, String str3, String str4, HotelTripJson hotelTripJson, List list, HotelBrowseActionJson hotelBrowseActionJson, String str5, Integer num, HotelResultLimitsJson hotelResultLimitsJson, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : hotelAttributionJson, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : hotelTripJson, (i2 & 128) != 0 ? C0881AGi.A00 : list, (i2 & 256) != 0 ? null : hotelBrowseActionJson, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : hotelResultLimitsJson);
    }

    public HotelResultsJson(int i, String str, String str2, HotelAttributionJson hotelAttributionJson, String str3, String str4, HotelTripJson hotelTripJson, List<HotelResultJson> list, HotelBrowseActionJson hotelBrowseActionJson, String str5, Integer num, HotelResultLimitsJson hotelResultLimitsJson) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(list, 7);
        this.schema_version = i;
        this.search_ref = str;
        this.provider = str2;
        this.attribution = hotelAttributionJson;
        this.title = str3;
        this.location = str4;
        this.trip = hotelTripJson;
        this.hotels = list;
        this.see_all_action = hotelBrowseActionJson;
        this.captured_at = str5;
        this.returned_count = num;
        this.limits = hotelResultLimitsJson;
    }

    public /* synthetic */ HotelResultsJson(int i, int i2, String str, String str2, HotelAttributionJson hotelAttributionJson, String str3, String str4, HotelTripJson hotelTripJson, List list, HotelBrowseActionJson hotelBrowseActionJson, String str5, Integer num, HotelResultLimitsJson hotelResultLimitsJson, C2hx c2hx) {
        this.schema_version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.search_ref = "";
        } else {
            this.search_ref = str;
        }
        if ((i & 4) == 0) {
            this.provider = "";
        } else {
            this.provider = str2;
        }
        if ((i & 8) == 0) {
            this.attribution = null;
        } else {
            this.attribution = hotelAttributionJson;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 32) == 0) {
            this.location = null;
        } else {
            this.location = str4;
        }
        if ((i & 64) == 0) {
            this.trip = null;
        } else {
            this.trip = hotelTripJson;
        }
        if ((i & 128) == 0) {
            this.hotels = C0881AGi.A00;
        } else {
            this.hotels = list;
        }
        if ((i & 256) == 0) {
            this.see_all_action = null;
        } else {
            this.see_all_action = hotelBrowseActionJson;
        }
        if ((i & 512) == 0) {
            this.captured_at = null;
        } else {
            this.captured_at = str5;
        }
        if ((i & 1024) == 0) {
            this.returned_count = null;
        } else {
            this.returned_count = num;
        }
        if ((i & 2048) == 0) {
            this.limits = null;
        } else {
            this.limits = hotelResultLimitsJson;
        }
    }
}
