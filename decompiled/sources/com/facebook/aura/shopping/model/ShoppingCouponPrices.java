package com.facebook.aura.shopping.model;

import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C9jH;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ShoppingCouponPrices extends C06G {
    public static final int $stable = 0;
    public final Map<ShoppingCouponPriceKey, PdpCouponPrice> prices;

    public final ShoppingCouponPrices copy(Map<ShoppingCouponPriceKey, PdpCouponPrice> map) {
        C7384Etj.A0Y(map, 0);
        return new ShoppingCouponPrices(map);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingCouponPrices) && C7384Etj.areEqual(this.prices, ((ShoppingCouponPrices) obj).prices));
    }

    public final PdpCouponPrice liveFor(ShoppingResultProduct shoppingResultProduct, double d) {
        PdpCouponPrice pdpCouponPrice;
        C7384Etj.A0Y(shoppingResultProduct, 0);
        ShoppingCouponPriceKey shoppingCouponPriceKeyCatalogCouponPriceKey = ShoppingProductDisplayKt.catalogCouponPriceKey(shoppingResultProduct);
        if (shoppingCouponPriceKeyCatalogCouponPriceKey == null || (pdpCouponPrice = this.prices.get(shoppingCouponPriceKeyCatalogCouponPriceKey)) == null || pdpCouponPrice.expiresAt <= d) {
            return null;
        }
        return pdpCouponPrice;
    }

    public /* synthetic */ ShoppingCouponPrices(Map map, int i, C06H c06h) {
        this((i & 1) != 0 ? C9jH.A00 : map);
    }

    public static /* synthetic */ ShoppingCouponPrices copy$default(ShoppingCouponPrices shoppingCouponPrices, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = shoppingCouponPrices.prices;
        }
        C7384Etj.A0Y(map, 0);
        return new ShoppingCouponPrices(map);
    }

    public final Map<ShoppingCouponPriceKey, PdpCouponPrice> component1() {
        return this.prices;
    }

    public final Map<ShoppingCouponPriceKey, PdpCouponPrice> getPrices() {
        return this.prices;
    }

    public int hashCode() {
        return this.prices.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingCouponPrices(Map<ShoppingCouponPriceKey, PdpCouponPrice> map) {
        C7384Etj.A0Y(map, 0);
        this.prices = map;
    }

    public ShoppingCouponPrices() {
        this(C9jH.A00);
    }
}
