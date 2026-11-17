package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
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
public final class FlightCheckoutPassengerSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;
    public final int passengerIndex;

    public final class Companion {
        public final C9hr<FlightCheckoutPassengerSheetKey> serializer() {
            return FlightCheckoutPassengerSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FlightCheckoutPassengerSheetKey(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.approvalId = str;
        this.passengerIndex = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(FlightCheckoutPassengerSheetKey flightCheckoutPassengerSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightCheckoutPassengerSheetKey.approvalId, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, flightCheckoutPassengerSheetKey.passengerIndex);
    }

    public final FlightCheckoutPassengerSheetKey copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new FlightCheckoutPassengerSheetKey(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutPassengerSheetKey) {
                FlightCheckoutPassengerSheetKey flightCheckoutPassengerSheetKey = (FlightCheckoutPassengerSheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, flightCheckoutPassengerSheetKey.approvalId) || this.passengerIndex != flightCheckoutPassengerSheetKey.passengerIndex) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutPassengerSheetKey copy$default(FlightCheckoutPassengerSheetKey flightCheckoutPassengerSheetKey, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightCheckoutPassengerSheetKey.approvalId;
        }
        if ((i2 & 2) != 0) {
            i = flightCheckoutPassengerSheetKey.passengerIndex;
        }
        C7384Etj.A0Y(str, 0);
        return new FlightCheckoutPassengerSheetKey(str, i);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final int component2() {
        return this.passengerIndex;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final int getPassengerIndex() {
        return this.passengerIndex;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.approvalId) + this.passengerIndex;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutPassengerSheetKey(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FlightCheckoutPassengerSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.passengerIndex = i2;
    }
}
