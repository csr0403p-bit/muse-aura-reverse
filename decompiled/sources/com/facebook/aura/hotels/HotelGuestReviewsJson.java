package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelGuestReviewsJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer count;
    public final String scale_max;
    public final String score;

    public final class Companion {
        public final C9hr<HotelGuestReviewsJson> serializer() {
            return HotelGuestReviewsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelGuestReviewsJson(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        this.score = str;
        this.count = num;
        this.scale_max = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelGuestReviewsJson hotelGuestReviewsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelGuestReviewsJson.score)) {
            c9j5.AAV(hotelGuestReviewsJson.score, c9iZ, 0);
        }
        if (zAfR || hotelGuestReviewsJson.count != null) {
            c9j5.AAP(hotelGuestReviewsJson.count, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || hotelGuestReviewsJson.scale_max != null) {
            c9j5.AAP(hotelGuestReviewsJson.scale_max, C07779iq.A01, c9iZ, 2);
        }
    }

    public final HotelGuestReviewsJson copy(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HotelGuestReviewsJson(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelGuestReviewsJson) {
                HotelGuestReviewsJson hotelGuestReviewsJson = (HotelGuestReviewsJson) obj;
                if (!C7384Etj.areEqual(this.score, hotelGuestReviewsJson.score) || !C7384Etj.areEqual(this.count, hotelGuestReviewsJson.count) || !C7384Etj.areEqual(this.scale_max, hotelGuestReviewsJson.scale_max)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelGuestReviewsJson copy$default(HotelGuestReviewsJson hotelGuestReviewsJson, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelGuestReviewsJson.score;
        }
        if ((i & 2) != 0) {
            num = hotelGuestReviewsJson.count;
        }
        if ((i & 4) != 0) {
            str2 = hotelGuestReviewsJson.scale_max;
        }
        return hotelGuestReviewsJson.copy(str, num, str2);
    }

    public final String component1() {
        return this.score;
    }

    public final Integer component2() {
        return this.count;
    }

    public final String component3() {
        return this.scale_max;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getScale_max() {
        return this.scale_max;
    }

    public final String getScore() {
        return this.score;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.score) + AnonymousClass006.A0D(this.count)) * 31) + AnonymousClass005.A0H(this.scale_max);
    }

    public final HotelGuestReviews toDomain() {
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(this.score);
        Integer num = null;
        if (strHotelNonBlank == null) {
            return null;
        }
        Integer num2 = this.count;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        return new HotelGuestReviews(strHotelNonBlank, num, HotelResultModelsKt.hotelNonBlank(this.scale_max));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelGuestReviewsJson(int i, String str, Integer num, String str2, C2hx c2hx) {
        this.score = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 4) == 0) {
            this.scale_max = null;
        } else {
            this.scale_max = str2;
        }
    }

    public /* synthetic */ HotelGuestReviewsJson(String str, Integer num, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }

    public HotelGuestReviewsJson() {
        this("", null, null);
    }
}
