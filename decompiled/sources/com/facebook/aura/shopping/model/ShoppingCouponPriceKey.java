package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ShoppingCouponPriceKey extends C06G {
    public static final int $stable = 0;
    public final String priceCurrency;
    public final String productId;

    public ShoppingCouponPriceKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.productId = str;
        this.priceCurrency = str2;
    }

    public final ShoppingCouponPriceKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingCouponPriceKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCouponPriceKey) {
                ShoppingCouponPriceKey shoppingCouponPriceKey = (ShoppingCouponPriceKey) obj;
                if (!C7384Etj.areEqual(this.productId, shoppingCouponPriceKey.productId) || !C7384Etj.areEqual(this.priceCurrency, shoppingCouponPriceKey.priceCurrency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCouponPriceKey copy$default(ShoppingCouponPriceKey shoppingCouponPriceKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCouponPriceKey.productId;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCouponPriceKey.priceCurrency;
        }
        C7384Etj.A0Y(str, 0);
        return new ShoppingCouponPriceKey(str, str2);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.priceCurrency;
    }

    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.productId) + AnonymousClass006.A0G(this.priceCurrency);
    }

    public String toString() {
        return super.toString();
    }
}
