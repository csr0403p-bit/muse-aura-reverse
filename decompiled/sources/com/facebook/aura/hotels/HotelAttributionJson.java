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
public final class HotelAttributionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon;
    public final String icon_url;
    public final String provider;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<HotelAttributionJson> serializer() {
            return HotelAttributionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelAttributionJson hotelAttributionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelAttributionJson.provider)) {
            c9j5.AAV(hotelAttributionJson.provider, c9iZ, 0);
        }
        if (zAfR || !"".equals(hotelAttributionJson.title)) {
            c9j5.AAV(hotelAttributionJson.title, c9iZ, 1);
        }
        if (zAfR || hotelAttributionJson.icon != null) {
            c9j5.AAP(hotelAttributionJson.icon, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hotelAttributionJson.icon_url != null) {
            c9j5.AAP(hotelAttributionJson.icon_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hotelAttributionJson.subtitle != null) {
            c9j5.AAP(hotelAttributionJson.subtitle, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelAttributionJson) {
                HotelAttributionJson hotelAttributionJson = (HotelAttributionJson) obj;
                if (!C7384Etj.areEqual(this.provider, hotelAttributionJson.provider) || !C7384Etj.areEqual(this.title, hotelAttributionJson.title) || !C7384Etj.areEqual(this.icon, hotelAttributionJson.icon) || !C7384Etj.areEqual(this.icon_url, hotelAttributionJson.icon_url) || !C7384Etj.areEqual(this.subtitle, hotelAttributionJson.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelAttributionJson copy$default(HotelAttributionJson hotelAttributionJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelAttributionJson.provider;
        }
        if ((i & 2) != 0) {
            str2 = hotelAttributionJson.title;
        }
        if ((i & 4) != 0) {
            str3 = hotelAttributionJson.icon;
        }
        if ((i & 8) != 0) {
            str4 = hotelAttributionJson.icon_url;
        }
        if ((i & 16) != 0) {
            str5 = hotelAttributionJson.subtitle;
        }
        return hotelAttributionJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.provider;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.icon_url;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.provider)) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.icon_url)) * 31) + AnonymousClass005.A0H(this.subtitle);
    }

    public HotelAttributionJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        this.provider = str;
        this.title = str2;
        this.icon = str3;
        this.icon_url = str4;
        this.subtitle = str5;
    }

    public final HotelAttributionJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        return new HotelAttributionJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelAttributionJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ HotelAttributionJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.provider = "";
        } else {
            this.provider = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str4;
        }
        if ((i & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str5;
        }
    }

    public HotelAttributionJson() {
        this("", "", null, null, null);
    }
}
