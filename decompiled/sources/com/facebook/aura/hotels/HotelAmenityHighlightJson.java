package com.facebook.aura.hotels;

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
public final class HotelAmenityHighlightJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String name;
    public final String scope;

    public final class Companion {
        public final C9hr<HotelAmenityHighlightJson> serializer() {
            return HotelAmenityHighlightJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelAmenityHighlightJson hotelAmenityHighlightJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelAmenityHighlightJson.name != null) {
            c9j5.AAP(hotelAmenityHighlightJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hotelAmenityHighlightJson.scope != null) {
            c9j5.AAP(hotelAmenityHighlightJson.scope, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelAmenityHighlightJson) {
                HotelAmenityHighlightJson hotelAmenityHighlightJson = (HotelAmenityHighlightJson) obj;
                if (!C7384Etj.areEqual(this.name, hotelAmenityHighlightJson.name) || !C7384Etj.areEqual(this.scope, hotelAmenityHighlightJson.scope)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelAmenityHighlightJson copy$default(HotelAmenityHighlightJson hotelAmenityHighlightJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelAmenityHighlightJson.name;
        }
        if ((i & 2) != 0) {
            str2 = hotelAmenityHighlightJson.scope;
        }
        return new HotelAmenityHighlightJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.scope;
    }

    public final HotelAmenityHighlightJson copy(String str, String str2) {
        return new HotelAmenityHighlightJson(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.scope);
    }

    public HotelAmenityHighlightJson(String str, String str2) {
        this.name = str;
        this.scope = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelAmenityHighlightJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.scope = null;
        } else {
            this.scope = str2;
        }
    }

    public /* synthetic */ HotelAmenityHighlightJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public HotelAmenityHighlightJson() {
        this(null, null);
    }
}
