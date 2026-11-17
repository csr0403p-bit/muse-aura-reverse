package com.facebook.aura.flights;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
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
public final class FlightResultsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String presentationId;
    public final String sessionId;

    public final class Companion {
        public final C9hr<FlightResultsScreenKey> serializer() {
            return FlightResultsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_flights_impl_keys_keys(FlightResultsScreenKey flightResultsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightResultsScreenKey.presentationId, c9iZ, 0);
        c9j5.AAV(flightResultsScreenKey.sessionId, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightResultsScreenKey) {
                FlightResultsScreenKey flightResultsScreenKey = (FlightResultsScreenKey) obj;
                if (!C7384Etj.areEqual(this.presentationId, flightResultsScreenKey.presentationId) || !C7384Etj.areEqual(this.sessionId, flightResultsScreenKey.sessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightResultsScreenKey copy$default(FlightResultsScreenKey flightResultsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightResultsScreenKey.presentationId;
        }
        if ((i & 2) != 0) {
            str2 = flightResultsScreenKey.sessionId;
        }
        AnonymousClass003.A0u(str, str2);
        return new FlightResultsScreenKey(str, str2);
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sessionId, AnonymousClass001.A0G(this.presentationId));
    }

    public FlightResultsScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.presentationId = str;
        this.sessionId = str2;
    }

    public final FlightResultsScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FlightResultsScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightResultsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FlightResultsScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.presentationId = str;
        this.sessionId = str2;
    }
}
