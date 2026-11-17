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
public final class DeliveryCheckoutStopSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;
    public final String stopId;

    public final class Companion {
        public final C9hr<DeliveryCheckoutStopSheetKey> serializer() {
            return DeliveryCheckoutStopSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deliveryCheckoutStopSheetKey.approvalId, c9iZ, 0);
        c9j5.AAV(deliveryCheckoutStopSheetKey.stopId, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutStopSheetKey) {
                DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey = (DeliveryCheckoutStopSheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, deliveryCheckoutStopSheetKey.approvalId) || !C7384Etj.areEqual(this.stopId, deliveryCheckoutStopSheetKey.stopId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutStopSheetKey copy$default(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutStopSheetKey.approvalId;
        }
        if ((i & 2) != 0) {
            str2 = deliveryCheckoutStopSheetKey.stopId;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeliveryCheckoutStopSheetKey(str, str2);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final String component2() {
        return this.stopId;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final String getStopId() {
        return this.stopId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.stopId, AnonymousClass001.A0G(this.approvalId));
    }

    public DeliveryCheckoutStopSheetKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.approvalId = str;
        this.stopId = str2;
    }

    public final DeliveryCheckoutStopSheetKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeliveryCheckoutStopSheetKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutStopSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeliveryCheckoutStopSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.stopId = str2;
    }
}
