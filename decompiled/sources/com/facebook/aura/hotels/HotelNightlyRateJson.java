package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
public final class HotelNightlyRateJson extends C06G {
    public final HotelMoneyJson base_rate;
    public final String stay_date;
    public static final Companion Companion = new Companion();
    public static final int $stable = HotelMoneyJson.$stable;

    public final class Companion {
        public final C9hr<HotelNightlyRateJson> serializer() {
            return HotelNightlyRateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelNightlyRateJson(String str, HotelMoneyJson hotelMoneyJson) {
        C7384Etj.A0Y(str, 0);
        this.stay_date = str;
        this.base_rate = hotelMoneyJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelNightlyRateJson hotelNightlyRateJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelNightlyRateJson.stay_date)) {
            c9j5.AAV(hotelNightlyRateJson.stay_date, c9iZ, 0);
        }
        if (zAfR || hotelNightlyRateJson.base_rate != null) {
            c9j5.AAP(hotelNightlyRateJson.base_rate, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final HotelNightlyRateJson copy(String str, HotelMoneyJson hotelMoneyJson) {
        C7384Etj.A0Y(str, 0);
        return new HotelNightlyRateJson(str, hotelMoneyJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelNightlyRateJson) {
                HotelNightlyRateJson hotelNightlyRateJson = (HotelNightlyRateJson) obj;
                if (!C7384Etj.areEqual(this.stay_date, hotelNightlyRateJson.stay_date) || !C7384Etj.areEqual(this.base_rate, hotelNightlyRateJson.base_rate)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelNightlyRateJson copy$default(HotelNightlyRateJson hotelNightlyRateJson, String str, HotelMoneyJson hotelMoneyJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelNightlyRateJson.stay_date;
        }
        if ((i & 2) != 0) {
            hotelMoneyJson = hotelNightlyRateJson.base_rate;
        }
        C7384Etj.A0Y(str, 0);
        return new HotelNightlyRateJson(str, hotelMoneyJson);
    }

    public final String component1() {
        return this.stay_date;
    }

    public final HotelMoneyJson component2() {
        return this.base_rate;
    }

    public final HotelMoneyJson getBase_rate() {
        return this.base_rate;
    }

    public final String getStay_date() {
        return this.stay_date;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.stay_date) + AnonymousClass006.A0D(this.base_rate);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelNightlyRateJson(int i, String str, HotelMoneyJson hotelMoneyJson, C2hx c2hx) {
        this.stay_date = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.base_rate = null;
        } else {
            this.base_rate = hotelMoneyJson;
        }
    }

    public /* synthetic */ HotelNightlyRateJson(String str, HotelMoneyJson hotelMoneyJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : hotelMoneyJson);
    }

    public HotelNightlyRateJson() {
        this("", null);
    }
}
