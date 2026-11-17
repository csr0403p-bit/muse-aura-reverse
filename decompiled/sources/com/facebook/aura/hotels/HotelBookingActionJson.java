package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class HotelBookingActionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String selection_ref;
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<HotelBookingActionJson> serializer() {
            return HotelBookingActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelBookingActionJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.selection_ref = str2;
        this.url = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelBookingActionJson hotelBookingActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelBookingActionJson.type)) {
            c9j5.AAV(hotelBookingActionJson.type, c9iZ, 0);
        }
        if (zAfR || hotelBookingActionJson.selection_ref != null) {
            c9j5.AAP(hotelBookingActionJson.selection_ref, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hotelBookingActionJson.url != null) {
            c9j5.AAP(hotelBookingActionJson.url, C07779iq.A01, c9iZ, 2);
        }
    }

    public final HotelBookingActionJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new HotelBookingActionJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelBookingActionJson) {
                HotelBookingActionJson hotelBookingActionJson = (HotelBookingActionJson) obj;
                if (!C7384Etj.areEqual(this.type, hotelBookingActionJson.type) || !C7384Etj.areEqual(this.selection_ref, hotelBookingActionJson.selection_ref) || !C7384Etj.areEqual(this.url, hotelBookingActionJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HotelBookingAction toDomain(String str) {
        String strHotelWebUrl;
        C7384Etj.A0Y(str, 0);
        String str2 = this.type;
        if ("request_booking_review".equals(str2)) {
            if (str.equals(this.selection_ref)) {
                return new HotelBookingAction(HotelBookingActionType.REQUEST_BOOKING_REVIEW, null, null);
            }
        } else if ("open_expedia".equals(str2) && (strHotelWebUrl = HotelResultsJsonKt.hotelWebUrl(this.url)) != null) {
            return new HotelBookingAction(HotelBookingActionType.OPEN_URL, null, strHotelWebUrl);
        }
        return null;
    }

    public static /* synthetic */ HotelBookingActionJson copy$default(HotelBookingActionJson hotelBookingActionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelBookingActionJson.type;
        }
        if ((i & 2) != 0) {
            str2 = hotelBookingActionJson.selection_ref;
        }
        if ((i & 4) != 0) {
            str3 = hotelBookingActionJson.url;
        }
        return hotelBookingActionJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.selection_ref;
    }

    public final String component3() {
        return this.url;
    }

    public final String getSelection_ref() {
        return this.selection_ref;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.selection_ref)) * 31) + AnonymousClass005.A0H(this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelBookingActionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.selection_ref = null;
        } else {
            this.selection_ref = str2;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public /* synthetic */ HotelBookingActionJson(String str, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public HotelBookingActionJson() {
        this("", null, null);
    }
}
