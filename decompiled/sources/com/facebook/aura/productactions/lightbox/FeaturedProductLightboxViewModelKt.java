package com.facebook.aura.productactions.lightbox;

import X.C8j5;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingDisplayPrices;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public abstract class FeaturedProductLightboxViewModelKt {
    public static final long STOP_TIMEOUT_MS = 5000;

    public static final ShoppingDisplayPrices displayPrices(FeaturedProductLightboxInputs featuredProductLightboxInputs, ShoppingCouponPrices shoppingCouponPrices) {
        ShoppingResultProduct shoppingResultProduct = featuredProductLightboxInputs.product;
        return ShoppingProductDisplayKt.shoppingDisplayPrices(shoppingResultProduct, shoppingCouponPrices.liveFor(shoppingResultProduct, C8j5.A00()), featuredProductLightboxInputs.locale);
    }
}
