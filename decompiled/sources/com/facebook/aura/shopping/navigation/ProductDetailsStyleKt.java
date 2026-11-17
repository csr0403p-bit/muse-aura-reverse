package com.facebook.aura.shopping.navigation;

import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;

/* loaded from: classes4.dex */
public abstract class ProductDetailsStyleKt {
    public static final ProductDetailsStyle productDetailsStyle(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        return (ShoppingResultsPresentationKt.getProductDetailsConnectorId(shoppingResultProduct) == null && ShoppingResultsPresentationKt.getOffersAddToCart(shoppingResultProduct)) ? ProductDetailsStyle.INSTACART : ProductDetailsStyle.SHOPPING;
    }
}
