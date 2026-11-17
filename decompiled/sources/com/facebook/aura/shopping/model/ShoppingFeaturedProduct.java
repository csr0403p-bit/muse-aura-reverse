package com.facebook.aura.shopping.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingFeaturedProduct extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String citationId;

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<ShoppingFeaturedProduct> serializer() {
            return ShoppingFeaturedProduct$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingFeaturedProduct shoppingFeaturedProduct, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(shoppingFeaturedProduct.citationId)) {
            c9j5.AAV(shoppingFeaturedProduct.citationId, c9iZ, 0);
        }
    }

    public final ShoppingFeaturedProduct copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingFeaturedProduct(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingFeaturedProduct) && C7384Etj.areEqual(this.citationId, ((ShoppingFeaturedProduct) obj).citationId));
    }

    public static /* synthetic */ ShoppingFeaturedProduct copy$default(ShoppingFeaturedProduct shoppingFeaturedProduct, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingFeaturedProduct.citationId;
        }
        C7384Etj.A0Y(str, 0);
        return new ShoppingFeaturedProduct(str);
    }

    public final String component1() {
        return this.citationId;
    }

    public final String getCitationId() {
        return this.citationId;
    }

    public int hashCode() {
        return this.citationId.hashCode();
    }

    public /* synthetic */ ShoppingFeaturedProduct(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.citationId = "";
        } else {
            this.citationId = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingFeaturedProduct(String str) {
        C7384Etj.A0Y(str, 0);
        this.citationId = str;
    }

    public /* synthetic */ ShoppingFeaturedProduct(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ShoppingFeaturedProduct() {
        this("");
    }
}
