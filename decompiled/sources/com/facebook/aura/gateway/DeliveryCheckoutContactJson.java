package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutContactJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String name;

    public final class Companion {
        public final C9hr<DeliveryCheckoutContactJson> serializer() {
            return DeliveryCheckoutContactJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutContactJson deliveryCheckoutContactJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || deliveryCheckoutContactJson.name != null) {
            c9j5.AAP(deliveryCheckoutContactJson.name, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DeliveryCheckoutContactJson) && C7384Etj.areEqual(this.name, ((DeliveryCheckoutContactJson) obj).name));
    }

    public static /* synthetic */ DeliveryCheckoutContactJson copy$default(DeliveryCheckoutContactJson deliveryCheckoutContactJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutContactJson.name;
        }
        return new DeliveryCheckoutContactJson(str);
    }

    public final String component1() {
        return this.name;
    }

    public final DeliveryCheckoutContactJson copy(String str) {
        return new DeliveryCheckoutContactJson(str);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.name);
    }

    public /* synthetic */ DeliveryCheckoutContactJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DeliveryCheckoutContactJson(String str) {
        this.name = str;
    }

    public /* synthetic */ DeliveryCheckoutContactJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public DeliveryCheckoutContactJson() {
        this(null);
    }
}
