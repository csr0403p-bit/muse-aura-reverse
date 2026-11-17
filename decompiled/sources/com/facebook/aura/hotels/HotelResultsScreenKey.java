package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HotelResultsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String searchRef;
    public final String sessionId;

    public final class Companion {
        public final C9hr<HotelResultsScreenKey> serializer() {
            return HotelResultsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelResultsScreenKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.searchRef = str;
        this.sessionId = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_keys_keys(HotelResultsScreenKey hotelResultsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hotelResultsScreenKey.searchRef, c9iZ, 0);
        if (c9j5.AfR() || hotelResultsScreenKey.sessionId != null) {
            c9j5.AAP(hotelResultsScreenKey.sessionId, C07779iq.A01, c9iZ, 1);
        }
    }

    public final HotelResultsScreenKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HotelResultsScreenKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResultsScreenKey) {
                HotelResultsScreenKey hotelResultsScreenKey = (HotelResultsScreenKey) obj;
                if (!C7384Etj.areEqual(this.searchRef, hotelResultsScreenKey.searchRef) || !C7384Etj.areEqual(this.sessionId, hotelResultsScreenKey.sessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelResultsScreenKey copy$default(HotelResultsScreenKey hotelResultsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelResultsScreenKey.searchRef;
        }
        if ((i & 2) != 0) {
            str2 = hotelResultsScreenKey.sessionId;
        }
        C7384Etj.A0Y(str, 0);
        return new HotelResultsScreenKey(str, str2);
    }

    public final String component1() {
        return this.searchRef;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String getSearchRef() {
        return this.searchRef;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.searchRef) + AnonymousClass006.A0G(this.sessionId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelResultsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HotelResultsScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.searchRef = str;
        this.sessionId = C8j4.A0t(i, str2);
    }

    public /* synthetic */ HotelResultsScreenKey(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
