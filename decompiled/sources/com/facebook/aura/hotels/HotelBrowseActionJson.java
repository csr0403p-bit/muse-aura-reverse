package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelBrowseActionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String result_ref;
    public final String search_ref;
    public final String type;

    public final class Companion {
        public final C9hr<HotelBrowseActionJson> serializer() {
            return HotelBrowseActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelBrowseActionJson hotelBrowseActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelBrowseActionJson.type)) {
            c9j5.AAV(hotelBrowseActionJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(hotelBrowseActionJson.search_ref)) {
            c9j5.AAV(hotelBrowseActionJson.search_ref, c9iZ, 1);
        }
        if (zAfR || hotelBrowseActionJson.result_ref != null) {
            c9j5.AAP(hotelBrowseActionJson.result_ref, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelBrowseActionJson) {
                HotelBrowseActionJson hotelBrowseActionJson = (HotelBrowseActionJson) obj;
                if (!C7384Etj.areEqual(this.type, hotelBrowseActionJson.type) || !C7384Etj.areEqual(this.search_ref, hotelBrowseActionJson.search_ref) || !C7384Etj.areEqual(this.result_ref, hotelBrowseActionJson.result_ref)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelBrowseActionJson copy$default(HotelBrowseActionJson hotelBrowseActionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelBrowseActionJson.type;
        }
        if ((i & 2) != 0) {
            str2 = hotelBrowseActionJson.search_ref;
        }
        if ((i & 4) != 0) {
            str3 = hotelBrowseActionJson.result_ref;
        }
        return hotelBrowseActionJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.search_ref;
    }

    public final String component3() {
        return this.result_ref;
    }

    public final String getResult_ref() {
        return this.result_ref;
    }

    public final String getSearch_ref() {
        return this.search_ref;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.search_ref, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.result_ref);
    }

    public HotelBrowseActionJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.type = str;
        this.search_ref = str2;
        this.result_ref = str3;
    }

    public final HotelBrowseActionJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HotelBrowseActionJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelBrowseActionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.search_ref = "";
        } else {
            this.search_ref = str2;
        }
        if ((i & 4) == 0) {
            this.result_ref = null;
        } else {
            this.result_ref = str3;
        }
    }

    public /* synthetic */ HotelBrowseActionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public HotelBrowseActionJson() {
        this("", "", null);
    }
}
