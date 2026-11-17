package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
public final class HotelImageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String caption;
    public final String url;

    public final class Companion {
        public final C9hr<HotelImageJson> serializer() {
            return HotelImageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelImageJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.caption = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelImageJson hotelImageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelImageJson.url)) {
            c9j5.AAV(hotelImageJson.url, c9iZ, 0);
        }
        if (zAfR || hotelImageJson.caption != null) {
            c9j5.AAP(hotelImageJson.caption, C07779iq.A01, c9iZ, 1);
        }
    }

    public final HotelImageJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HotelImageJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelImageJson) {
                HotelImageJson hotelImageJson = (HotelImageJson) obj;
                if (!C7384Etj.areEqual(this.url, hotelImageJson.url) || !C7384Etj.areEqual(this.caption, hotelImageJson.caption)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelImageJson copy$default(HotelImageJson hotelImageJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelImageJson.url;
        }
        if ((i & 2) != 0) {
            str2 = hotelImageJson.caption;
        }
        C7384Etj.A0Y(str, 0);
        return new HotelImageJson(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.caption;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.caption);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelImageJson(int i, String str, String str2, C2hx c2hx) {
        this.url = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.caption = null;
        } else {
            this.caption = str2;
        }
    }

    public /* synthetic */ HotelImageJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public HotelImageJson() {
        this("", null);
    }
}
