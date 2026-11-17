package com.facebook.aura.shopping.model;

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
/* loaded from: classes4.dex */
public final class ShoppingFeaturedProductJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String citation_id;

    public final class Companion {
        public final C9hr<ShoppingFeaturedProductJson> serializer() {
            return ShoppingFeaturedProductJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingFeaturedProductJson shoppingFeaturedProductJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || shoppingFeaturedProductJson.citation_id != null) {
            c9j5.AAP(shoppingFeaturedProductJson.citation_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingFeaturedProductJson) && C7384Etj.areEqual(this.citation_id, ((ShoppingFeaturedProductJson) obj).citation_id));
    }

    public static /* synthetic */ ShoppingFeaturedProductJson copy$default(ShoppingFeaturedProductJson shoppingFeaturedProductJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingFeaturedProductJson.citation_id;
        }
        return new ShoppingFeaturedProductJson(str);
    }

    public final String component1() {
        return this.citation_id;
    }

    public final ShoppingFeaturedProductJson copy(String str) {
        return new ShoppingFeaturedProductJson(str);
    }

    public final String getCitation_id() {
        return this.citation_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.citation_id);
    }

    public final ShoppingFeaturedProduct toDomain() {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.citation_id);
        if (strTrimToNonEmpty != null) {
            return new ShoppingFeaturedProduct(strTrimToNonEmpty);
        }
        return null;
    }

    public /* synthetic */ ShoppingFeaturedProductJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.citation_id = null;
        } else {
            this.citation_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingFeaturedProductJson(String str) {
        this.citation_id = str;
    }

    public /* synthetic */ ShoppingFeaturedProductJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ShoppingFeaturedProductJson() {
        this(null);
    }
}
