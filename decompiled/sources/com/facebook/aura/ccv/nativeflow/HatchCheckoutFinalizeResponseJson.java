package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutFinalizeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String checkout_status;
    public final HatchCheckoutErrorJson error;
    public final String order_id;

    public final class Companion {
        public final C9hr<HatchCheckoutFinalizeResponseJson> serializer() {
            return HatchCheckoutFinalizeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutFinalizeResponseJson hatchCheckoutFinalizeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCheckoutFinalizeResponseJson.checkout_status != null) {
            c9j5.AAP(hatchCheckoutFinalizeResponseJson.checkout_status, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchCheckoutFinalizeResponseJson.order_id != null) {
            c9j5.AAP(hatchCheckoutFinalizeResponseJson.order_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchCheckoutFinalizeResponseJson.error != null) {
            c9j5.AAP(hatchCheckoutFinalizeResponseJson.error, HatchCheckoutErrorJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutFinalizeResponseJson) {
                HatchCheckoutFinalizeResponseJson hatchCheckoutFinalizeResponseJson = (HatchCheckoutFinalizeResponseJson) obj;
                if (!C7384Etj.areEqual(this.checkout_status, hatchCheckoutFinalizeResponseJson.checkout_status) || !C7384Etj.areEqual(this.order_id, hatchCheckoutFinalizeResponseJson.order_id) || !C7384Etj.areEqual(this.error, hatchCheckoutFinalizeResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckoutFinalizeResponseJson copy$default(HatchCheckoutFinalizeResponseJson hatchCheckoutFinalizeResponseJson, String str, String str2, HatchCheckoutErrorJson hatchCheckoutErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutFinalizeResponseJson.checkout_status;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutFinalizeResponseJson.order_id;
        }
        if ((i & 4) != 0) {
            hatchCheckoutErrorJson = hatchCheckoutFinalizeResponseJson.error;
        }
        return new HatchCheckoutFinalizeResponseJson(str, str2, hatchCheckoutErrorJson);
    }

    public final String component1() {
        return this.checkout_status;
    }

    public final String component2() {
        return this.order_id;
    }

    public final HatchCheckoutErrorJson component3() {
        return this.error;
    }

    public final HatchCheckoutFinalizeResponseJson copy(String str, String str2, HatchCheckoutErrorJson hatchCheckoutErrorJson) {
        return new HatchCheckoutFinalizeResponseJson(str, str2, hatchCheckoutErrorJson);
    }

    public final String getCheckout_status() {
        return this.checkout_status;
    }

    public final HatchCheckoutErrorJson getError() {
        return this.error;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.checkout_status) * 31) + AnonymousClass006.A0G(this.order_id)) * 31) + C3cH.A02(this.error);
    }

    public HatchCheckoutFinalizeResponseJson(String str, String str2, HatchCheckoutErrorJson hatchCheckoutErrorJson) {
        this.checkout_status = str;
        this.order_id = str2;
        this.error = hatchCheckoutErrorJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutFinalizeResponseJson(int i, String str, String str2, HatchCheckoutErrorJson hatchCheckoutErrorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.checkout_status = null;
        } else {
            this.checkout_status = str;
        }
        if ((i & 2) == 0) {
            this.order_id = null;
        } else {
            this.order_id = str2;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = hatchCheckoutErrorJson;
        }
    }

    public /* synthetic */ HatchCheckoutFinalizeResponseJson(String str, String str2, HatchCheckoutErrorJson hatchCheckoutErrorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : hatchCheckoutErrorJson);
    }

    public HatchCheckoutFinalizeResponseJson() {
        this(null, null, null);
    }
}
