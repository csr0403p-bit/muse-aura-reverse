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
public final class DeliveryCheckoutProviderJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String name;

    public final class Companion {
        public final C9hr<DeliveryCheckoutProviderJson> serializer() {
            return DeliveryCheckoutProviderJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || deliveryCheckoutProviderJson.name != null) {
            c9j5.AAP(deliveryCheckoutProviderJson.name, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DeliveryCheckoutProviderJson) && C7384Etj.areEqual(this.name, ((DeliveryCheckoutProviderJson) obj).name));
    }

    public static /* synthetic */ DeliveryCheckoutProviderJson copy$default(DeliveryCheckoutProviderJson deliveryCheckoutProviderJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutProviderJson.name;
        }
        return new DeliveryCheckoutProviderJson(str);
    }

    public final String component1() {
        return this.name;
    }

    public final DeliveryCheckoutProviderJson copy(String str) {
        return new DeliveryCheckoutProviderJson(str);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.name);
    }

    public /* synthetic */ DeliveryCheckoutProviderJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DeliveryCheckoutProviderJson(String str) {
        this.name = str;
    }

    public /* synthetic */ DeliveryCheckoutProviderJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public DeliveryCheckoutProviderJson() {
        this(null);
    }
}
