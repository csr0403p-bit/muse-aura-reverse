package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelResultLimitsJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer local_result_limit;
    public final Boolean locally_truncated;
    public final String next_cursor;
    public final Integer provider_result_limit;

    public final class Companion {
        public final C9hr<HotelResultLimitsJson> serializer() {
            return HotelResultLimitsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelResultLimitsJson hotelResultLimitsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelResultLimitsJson.provider_result_limit != null) {
            c9j5.AAP(hotelResultLimitsJson.provider_result_limit, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || hotelResultLimitsJson.local_result_limit != null) {
            c9j5.AAP(hotelResultLimitsJson.local_result_limit, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || hotelResultLimitsJson.locally_truncated != null) {
            c9j5.AAP(hotelResultLimitsJson.locally_truncated, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || hotelResultLimitsJson.next_cursor != null) {
            c9j5.AAP(hotelResultLimitsJson.next_cursor, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResultLimitsJson) {
                HotelResultLimitsJson hotelResultLimitsJson = (HotelResultLimitsJson) obj;
                if (!C7384Etj.areEqual(this.provider_result_limit, hotelResultLimitsJson.provider_result_limit) || !C7384Etj.areEqual(this.local_result_limit, hotelResultLimitsJson.local_result_limit) || !C7384Etj.areEqual(this.locally_truncated, hotelResultLimitsJson.locally_truncated) || !C7384Etj.areEqual(this.next_cursor, hotelResultLimitsJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelResultLimitsJson copy$default(HotelResultLimitsJson hotelResultLimitsJson, Integer num, Integer num2, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = hotelResultLimitsJson.provider_result_limit;
        }
        if ((i & 2) != 0) {
            num2 = hotelResultLimitsJson.local_result_limit;
        }
        if ((i & 4) != 0) {
            bool = hotelResultLimitsJson.locally_truncated;
        }
        if ((i & 8) != 0) {
            str = hotelResultLimitsJson.next_cursor;
        }
        return new HotelResultLimitsJson(num, num2, bool, str);
    }

    public final Integer component1() {
        return this.provider_result_limit;
    }

    public final Integer component2() {
        return this.local_result_limit;
    }

    public final Boolean component3() {
        return this.locally_truncated;
    }

    public final String component4() {
        return this.next_cursor;
    }

    public final HotelResultLimitsJson copy(Integer num, Integer num2, Boolean bool, String str) {
        return new HotelResultLimitsJson(num, num2, bool, str);
    }

    public final Integer getLocal_result_limit() {
        return this.local_result_limit;
    }

    public final Boolean getLocally_truncated() {
        return this.locally_truncated;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final Integer getProvider_result_limit() {
        return this.provider_result_limit;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0D(this.provider_result_limit) * 31) + AnonymousClass006.A0D(this.local_result_limit)) * 31) + AnonymousClass006.A0D(this.locally_truncated)) * 31) + AnonymousClass005.A0H(this.next_cursor);
    }

    public /* synthetic */ HotelResultLimitsJson(int i, Integer num, Integer num2, Boolean bool, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.provider_result_limit = null;
        } else {
            this.provider_result_limit = num;
        }
        if ((i & 2) == 0) {
            this.local_result_limit = null;
        } else {
            this.local_result_limit = num2;
        }
        if ((i & 4) == 0) {
            this.locally_truncated = null;
        } else {
            this.locally_truncated = bool;
        }
        if ((i & 8) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HotelResultLimitsJson(Integer num, Integer num2, Boolean bool, String str) {
        this.provider_result_limit = num;
        this.local_result_limit = num2;
        this.locally_truncated = bool;
        this.next_cursor = str;
    }

    public /* synthetic */ HotelResultLimitsJson(Integer num, Integer num2, Boolean bool, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str);
    }

    public HotelResultLimitsJson() {
        this(null, null, null, null);
    }
}
