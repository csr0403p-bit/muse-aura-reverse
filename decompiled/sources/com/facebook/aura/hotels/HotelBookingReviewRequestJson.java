package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelBookingReviewRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String selection_ref;
    public final String session_id;
    public final String type;

    public final class Companion {
        public final C9hr<HotelBookingReviewRequestJson> serializer() {
            return HotelBookingReviewRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelBookingReviewRequestJson hotelBookingReviewRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hotelBookingReviewRequestJson.type, c9iZ, 0);
        c9j5.AAV(hotelBookingReviewRequestJson.selection_ref, c9iZ, 1);
        if (c9j5.AfR() || hotelBookingReviewRequestJson.session_id != null) {
            c9j5.AAP(hotelBookingReviewRequestJson.session_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelBookingReviewRequestJson) {
                HotelBookingReviewRequestJson hotelBookingReviewRequestJson = (HotelBookingReviewRequestJson) obj;
                if (!C7384Etj.areEqual(this.type, hotelBookingReviewRequestJson.type) || !C7384Etj.areEqual(this.selection_ref, hotelBookingReviewRequestJson.selection_ref) || !C7384Etj.areEqual(this.session_id, hotelBookingReviewRequestJson.session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelBookingReviewRequestJson copy$default(HotelBookingReviewRequestJson hotelBookingReviewRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelBookingReviewRequestJson.type;
        }
        if ((i & 2) != 0) {
            str2 = hotelBookingReviewRequestJson.selection_ref;
        }
        if ((i & 4) != 0) {
            str3 = hotelBookingReviewRequestJson.session_id;
        }
        return hotelBookingReviewRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.selection_ref;
    }

    public final String component3() {
        return this.session_id;
    }

    public final String getSelection_ref() {
        return this.selection_ref;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.selection_ref, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.session_id);
    }

    public HotelBookingReviewRequestJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.type = str;
        this.selection_ref = str2;
        this.session_id = str3;
    }

    public final HotelBookingReviewRequestJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HotelBookingReviewRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelBookingReviewRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HotelBookingReviewRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.selection_ref = str2;
        this.session_id = C3cI.A0W(i, str3);
    }

    public /* synthetic */ HotelBookingReviewRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
