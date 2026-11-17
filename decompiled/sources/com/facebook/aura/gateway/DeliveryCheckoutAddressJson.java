package com.facebook.aura.gateway;

import X.AnonymousClass005;
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
public final class DeliveryCheckoutAddressJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String formatted;

    /* renamed from: short, reason: not valid java name */
    public final String f62short;

    public final class Companion {
        public final C9hr<DeliveryCheckoutAddressJson> serializer() {
            return DeliveryCheckoutAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutAddressJson.formatted != null) {
            c9j5.AAP(deliveryCheckoutAddressJson.formatted, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deliveryCheckoutAddressJson.f62short != null) {
            c9j5.AAP(deliveryCheckoutAddressJson.f62short, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutAddressJson) {
                DeliveryCheckoutAddressJson deliveryCheckoutAddressJson = (DeliveryCheckoutAddressJson) obj;
                if (!C7384Etj.areEqual(this.formatted, deliveryCheckoutAddressJson.formatted) || !C7384Etj.areEqual(this.f62short, deliveryCheckoutAddressJson.f62short)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutAddressJson copy$default(DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutAddressJson.formatted;
        }
        if ((i & 2) != 0) {
            str2 = deliveryCheckoutAddressJson.f62short;
        }
        return new DeliveryCheckoutAddressJson(str, str2);
    }

    public final String component1() {
        return this.formatted;
    }

    public final String component2() {
        return this.f62short;
    }

    public final DeliveryCheckoutAddressJson copy(String str, String str2) {
        return new DeliveryCheckoutAddressJson(str, str2);
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public final String getShort() {
        return this.f62short;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.formatted) * 31) + AnonymousClass005.A0H(this.f62short);
    }

    public DeliveryCheckoutAddressJson(String str, String str2) {
        this.formatted = str;
        this.f62short = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutAddressJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.formatted = null;
        } else {
            this.formatted = str;
        }
        if ((i & 2) == 0) {
            this.f62short = null;
        } else {
            this.f62short = str2;
        }
    }

    public /* synthetic */ DeliveryCheckoutAddressJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public DeliveryCheckoutAddressJson() {
        this(null, null);
    }
}
