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
public final class HotelRoomOptionsActionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String selection_ref;
    public final String type;

    public final class Companion {
        public final C9hr<HotelRoomOptionsActionJson> serializer() {
            return HotelRoomOptionsActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelRoomOptionsActionJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.selection_ref = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelRoomOptionsActionJson hotelRoomOptionsActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelRoomOptionsActionJson.type)) {
            c9j5.AAV(hotelRoomOptionsActionJson.type, c9iZ, 0);
        }
        if (zAfR || hotelRoomOptionsActionJson.selection_ref != null) {
            c9j5.AAP(hotelRoomOptionsActionJson.selection_ref, C07779iq.A01, c9iZ, 1);
        }
    }

    public final HotelRoomOptionsActionJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HotelRoomOptionsActionJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelRoomOptionsActionJson) {
                HotelRoomOptionsActionJson hotelRoomOptionsActionJson = (HotelRoomOptionsActionJson) obj;
                if (!C7384Etj.areEqual(this.type, hotelRoomOptionsActionJson.type) || !C7384Etj.areEqual(this.selection_ref, hotelRoomOptionsActionJson.selection_ref)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelRoomOptionsActionJson copy$default(HotelRoomOptionsActionJson hotelRoomOptionsActionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelRoomOptionsActionJson.type;
        }
        if ((i & 2) != 0) {
            str2 = hotelRoomOptionsActionJson.selection_ref;
        }
        C7384Etj.A0Y(str, 0);
        return new HotelRoomOptionsActionJson(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.selection_ref;
    }

    public final String getSelection_ref() {
        return this.selection_ref;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.selection_ref);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelRoomOptionsActionJson(int i, String str, String str2, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.selection_ref = null;
        } else {
            this.selection_ref = str2;
        }
    }

    public /* synthetic */ HotelRoomOptionsActionJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public HotelRoomOptionsActionJson() {
        this("", null);
    }
}
