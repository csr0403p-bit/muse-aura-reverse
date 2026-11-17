package com.facebook.aura.shopping.viewmodel;

import com.facebook.aura.shopping.model.CurrentShoppingCart;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingCart;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;

/* loaded from: classes4.dex */
public abstract class ShoppingCartViewModelKt {
    public static final ShoppingCartNavTitle navTitle(CurrentShoppingCart currentShoppingCart) {
        ShoppingCart shoppingCart = currentShoppingCart.cart;
        ShoppingResultsAttribution shoppingResultsAttribution = shoppingCart.attribution;
        if (shoppingResultsAttribution == null) {
            return null;
        }
        return new ShoppingCartNavTitle(shoppingResultsAttribution.title, shoppingCart.retailerName, ProductDetailsPresentationKt.httpsUrlOrNull(shoppingResultsAttribution.iconUrl));
    }
}
