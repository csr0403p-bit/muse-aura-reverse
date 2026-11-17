package com.facebook.aura.navigation.key;

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
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightOfferDetailsSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String offerId;
    public final String sessionId;
    public final int sliceIndex;

    public final class Companion {
        public final C9hr<FlightOfferDetailsSheetKey> serializer() {
            return FlightOfferDetailsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightOfferDetailsSheetKey.offerId, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, flightOfferDetailsSheetKey.sliceIndex);
        c9j5.AAV(flightOfferDetailsSheetKey.sessionId, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightOfferDetailsSheetKey) {
                FlightOfferDetailsSheetKey flightOfferDetailsSheetKey = (FlightOfferDetailsSheetKey) obj;
                if (!C7384Etj.areEqual(this.offerId, flightOfferDetailsSheetKey.offerId) || this.sliceIndex != flightOfferDetailsSheetKey.sliceIndex || !C7384Etj.areEqual(this.sessionId, flightOfferDetailsSheetKey.sessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightOfferDetailsSheetKey copy$default(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightOfferDetailsSheetKey.offerId;
        }
        if ((i2 & 2) != 0) {
            i = flightOfferDetailsSheetKey.sliceIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = flightOfferDetailsSheetKey.sessionId;
        }
        return flightOfferDetailsSheetKey.copy(str, i, str2);
    }

    public final String component1() {
        return this.offerId;
    }

    public final int component2() {
        return this.sliceIndex;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSliceIndex() {
        return this.sliceIndex;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sessionId, (AnonymousClass001.A0G(this.offerId) + this.sliceIndex) * 31);
    }

    public FlightOfferDetailsSheetKey(String str, int i, String str2) {
        AnonymousClass003.A0v(str, str2);
        this.offerId = str;
        this.sliceIndex = i;
        this.sessionId = str2;
    }

    public final FlightOfferDetailsSheetKey copy(String str, int i, String str2) {
        AnonymousClass003.A0v(str, str2);
        return new FlightOfferDetailsSheetKey(str, i, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightOfferDetailsSheetKey(int i, String str, int i2, String str2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(FlightOfferDetailsSheetKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.offerId = str;
        this.sliceIndex = i2;
        this.sessionId = str2;
    }
}
