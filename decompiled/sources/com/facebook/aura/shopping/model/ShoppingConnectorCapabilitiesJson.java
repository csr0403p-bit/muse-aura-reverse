package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingConnectorCapabilitiesJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean product_details;

    public final class Companion {
        public final C9hr<ShoppingConnectorCapabilitiesJson> serializer() {
            return ShoppingConnectorCapabilitiesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || shoppingConnectorCapabilitiesJson.product_details) {
            c9j5.AA7(c9iZ, 0, shoppingConnectorCapabilitiesJson.product_details);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingConnectorCapabilitiesJson) && this.product_details == ((ShoppingConnectorCapabilitiesJson) obj).product_details);
    }

    public static /* synthetic */ ShoppingConnectorCapabilitiesJson copy$default(ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shoppingConnectorCapabilitiesJson.product_details;
        }
        return new ShoppingConnectorCapabilitiesJson(z);
    }

    public final boolean component1() {
        return this.product_details;
    }

    public final ShoppingConnectorCapabilitiesJson copy(boolean z) {
        return new ShoppingConnectorCapabilitiesJson(z);
    }

    public final boolean getProduct_details() {
        return this.product_details;
    }

    public int hashCode() {
        return this.product_details ? 1231 : 1237;
    }

    public final ShoppingConnectorCapabilities toDomain() {
        return new ShoppingConnectorCapabilities(this.product_details);
    }

    public /* synthetic */ ShoppingConnectorCapabilitiesJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.product_details = false;
        } else {
            this.product_details = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingConnectorCapabilitiesJson(boolean z) {
        this.product_details = z;
    }

    public /* synthetic */ ShoppingConnectorCapabilitiesJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public ShoppingConnectorCapabilitiesJson() {
        this(false);
    }
}
