package com.facebook.aura.flights;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightDetailScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean booking;
    public final String offerId;
    public final String presentationId;
    public final String sessionId;

    public final class Companion {
        public final C9hr<FlightDetailScreenKey> serializer() {
            return FlightDetailScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_flights_impl_keys_keys(FlightDetailScreenKey flightDetailScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightDetailScreenKey.presentationId, c9iZ, 0);
        c9j5.AAV(flightDetailScreenKey.offerId, c9iZ, 1);
        c9j5.AAV(flightDetailScreenKey.sessionId, c9iZ, 2);
        if (c9j5.AfR() || flightDetailScreenKey.booking) {
            c9j5.AA7(c9iZ, 3, flightDetailScreenKey.booking);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightDetailScreenKey) {
                FlightDetailScreenKey flightDetailScreenKey = (FlightDetailScreenKey) obj;
                if (!C7384Etj.areEqual(this.presentationId, flightDetailScreenKey.presentationId) || !C7384Etj.areEqual(this.offerId, flightDetailScreenKey.offerId) || !C7384Etj.areEqual(this.sessionId, flightDetailScreenKey.sessionId) || this.booking != flightDetailScreenKey.booking) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightDetailScreenKey copy$default(FlightDetailScreenKey flightDetailScreenKey, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightDetailScreenKey.presentationId;
        }
        if ((i & 2) != 0) {
            str2 = flightDetailScreenKey.offerId;
        }
        if ((i & 4) != 0) {
            str3 = flightDetailScreenKey.sessionId;
        }
        if ((i & 8) != 0) {
            z = flightDetailScreenKey.booking;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new FlightDetailScreenKey(str, str2, str3, z);
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.offerId;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final boolean component4() {
        return this.booking;
    }

    public final boolean getBooking() {
        return this.booking;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.sessionId, AnonymousClass005.A0I(this.offerId, AnonymousClass001.A0G(this.presentationId))), this.booking);
    }

    public FlightDetailScreenKey(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.presentationId = str;
        this.offerId = str2;
        this.sessionId = str3;
        this.booking = z;
    }

    public final FlightDetailScreenKey copy(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new FlightDetailScreenKey(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightDetailScreenKey(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(FlightDetailScreenKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.presentationId = str;
        this.offerId = str2;
        this.sessionId = str3;
        this.booking = (i & 8) == 0 ? false : z;
    }

    public /* synthetic */ FlightDetailScreenKey(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass005.A1P(i, z));
    }
}
