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
/* loaded from: classes4.dex */
public final class ShoppingConnectorCapabilities extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean productDetails;

    public final class Companion {
        public final C9hr<ShoppingConnectorCapabilities> serializer() {
            return ShoppingConnectorCapabilities$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingConnectorCapabilities shoppingConnectorCapabilities, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || shoppingConnectorCapabilities.productDetails) {
            c9j5.AA7(c9iZ, 0, shoppingConnectorCapabilities.productDetails);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingConnectorCapabilities) && this.productDetails == ((ShoppingConnectorCapabilities) obj).productDetails);
    }

    public static /* synthetic */ ShoppingConnectorCapabilities copy$default(ShoppingConnectorCapabilities shoppingConnectorCapabilities, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shoppingConnectorCapabilities.productDetails;
        }
        return new ShoppingConnectorCapabilities(z);
    }

    public final boolean component1() {
        return this.productDetails;
    }

    public final ShoppingConnectorCapabilities copy(boolean z) {
        return new ShoppingConnectorCapabilities(z);
    }

    public final boolean getProductDetails() {
        return this.productDetails;
    }

    public int hashCode() {
        return this.productDetails ? 1231 : 1237;
    }

    public /* synthetic */ ShoppingConnectorCapabilities(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.productDetails = false;
        } else {
            this.productDetails = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingConnectorCapabilities(boolean z) {
        this.productDetails = z;
    }

    public /* synthetic */ ShoppingConnectorCapabilities(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public ShoppingConnectorCapabilities() {
        this(false);
    }
}
