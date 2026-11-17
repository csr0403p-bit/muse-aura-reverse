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
public final class FlightCheckoutLegSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;
    public final int sliceIndex;

    public final class Companion {
        public final C9hr<FlightCheckoutLegSheetKey> serializer() {
            return FlightCheckoutLegSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FlightCheckoutLegSheetKey(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.approvalId = str;
        this.sliceIndex = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightCheckoutLegSheetKey.approvalId, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, flightCheckoutLegSheetKey.sliceIndex);
    }

    public final FlightCheckoutLegSheetKey copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new FlightCheckoutLegSheetKey(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutLegSheetKey) {
                FlightCheckoutLegSheetKey flightCheckoutLegSheetKey = (FlightCheckoutLegSheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, flightCheckoutLegSheetKey.approvalId) || this.sliceIndex != flightCheckoutLegSheetKey.sliceIndex) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutLegSheetKey copy$default(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightCheckoutLegSheetKey.approvalId;
        }
        if ((i2 & 2) != 0) {
            i = flightCheckoutLegSheetKey.sliceIndex;
        }
        C7384Etj.A0Y(str, 0);
        return new FlightCheckoutLegSheetKey(str, i);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final int component2() {
        return this.sliceIndex;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final int getSliceIndex() {
        return this.sliceIndex;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.approvalId) + this.sliceIndex;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutLegSheetKey(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FlightCheckoutLegSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.sliceIndex = i2;
    }
}
