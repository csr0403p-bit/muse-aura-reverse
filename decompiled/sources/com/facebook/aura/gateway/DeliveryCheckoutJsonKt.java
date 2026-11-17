package com.facebook.aura.gateway;

import X.C3cG;
import X.C7384Etj;
import X.C9sU;
import X.C9sZ;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutJsonKt {
    public static final String TAG = "DeliveryCheckoutJson";

    public static final DeliveryCheckoutApproval toDeliveryCheckoutOrNull(JsonElement jsonElement) {
        Object objA0s;
        C7384Etj.A0Y(jsonElement, 0);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = DeliveryCheckoutApprovalJson.$stable;
            DeliveryCheckoutApprovalJson$$serializer deliveryCheckoutApprovalJson$$serializer = DeliveryCheckoutApprovalJson$$serializer.INSTANCE;
            C7384Etj.A0Y(deliveryCheckoutApprovalJson$$serializer, 0);
            objA0s = (DeliveryCheckoutApprovalJson) C9sZ.A00(deliveryCheckoutApprovalJson$$serializer, c9sU, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null) {
            CFK.A06(TAG, "Failed to decode delivery checkout payload");
            return null;
        }
        DeliveryCheckoutApproval domainOrNull = ((DeliveryCheckoutApprovalJson) objA0s).toDomainOrNull();
        if (domainOrNull == null) {
            CFK.A06(TAG, "Ignoring unsupported delivery checkout payload");
        }
        return domainOrNull;
    }
}
