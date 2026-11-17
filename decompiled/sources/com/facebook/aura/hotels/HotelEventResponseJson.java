package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelEventResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String selection_ref;
    public final String session_id;
    public final String stream_owner_message_id;

    public final class Companion {
        public final C9hr<HotelEventResponseJson> serializer() {
            return HotelEventResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelEventResponseJson hotelEventResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelEventResponseJson.selection_ref)) {
            c9j5.AAV(hotelEventResponseJson.selection_ref, c9iZ, 0);
        }
        if (zAfR || !"".equals(hotelEventResponseJson.session_id)) {
            c9j5.AAV(hotelEventResponseJson.session_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(hotelEventResponseJson.stream_owner_message_id)) {
            c9j5.AAV(hotelEventResponseJson.stream_owner_message_id, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelEventResponseJson) {
                HotelEventResponseJson hotelEventResponseJson = (HotelEventResponseJson) obj;
                if (!C7384Etj.areEqual(this.selection_ref, hotelEventResponseJson.selection_ref) || !C7384Etj.areEqual(this.session_id, hotelEventResponseJson.session_id) || !C7384Etj.areEqual(this.stream_owner_message_id, hotelEventResponseJson.stream_owner_message_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void validate(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (!str.equals(this.selection_ref)) {
            throw C3cG.A0Q("Check failed.");
        }
        if (str2 != null && !str2.equals(this.session_id)) {
            throw C3cG.A0Q("Check failed.");
        }
        if (C7BY.A0j(this.session_id) || C7BY.A0j(this.stream_owner_message_id)) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    public static /* synthetic */ HotelEventResponseJson copy$default(HotelEventResponseJson hotelEventResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelEventResponseJson.selection_ref;
        }
        if ((i & 2) != 0) {
            str2 = hotelEventResponseJson.session_id;
        }
        if ((i & 4) != 0) {
            str3 = hotelEventResponseJson.stream_owner_message_id;
        }
        return hotelEventResponseJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.selection_ref;
    }

    public final String component2() {
        return this.session_id;
    }

    public final String component3() {
        return this.stream_owner_message_id;
    }

    public final String getSelection_ref() {
        return this.selection_ref;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getStream_owner_message_id() {
        return this.stream_owner_message_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.stream_owner_message_id, AnonymousClass005.A0I(this.session_id, AnonymousClass001.A0G(this.selection_ref)));
    }

    public HotelEventResponseJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.selection_ref = str;
        this.session_id = str2;
        this.stream_owner_message_id = str3;
    }

    public final HotelEventResponseJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HotelEventResponseJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelEventResponseJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.selection_ref = "";
        } else {
            this.selection_ref = str;
        }
        if ((i & 2) == 0) {
            this.session_id = "";
        } else {
            this.session_id = str2;
        }
        if ((i & 4) == 0) {
            this.stream_owner_message_id = "";
        } else {
            this.stream_owner_message_id = str3;
        }
    }

    public /* synthetic */ HotelEventResponseJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public HotelEventResponseJson() {
        this("", "", "");
    }
}
