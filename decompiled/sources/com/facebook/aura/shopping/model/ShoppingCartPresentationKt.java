package com.facebook.aura.shopping.model;

import X.AbstractC0878AGe;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingCartSummary;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ShoppingCartPresentationKt {
    public static final int SHOPPING_CART_CARD_MAX_ITEMS = 4;

    public static final ShoppingCartCardUiModel toCardUiModel(ShoppingCart shoppingCart) {
        ShoppingCartSummary subtotal;
        C7384Etj.A0Y(shoppingCart, 0);
        List listA0a = AbstractC0878AGe.A0a(shoppingCart.items, 4);
        String str = shoppingCart.subtotal;
        if (shoppingCart.items.isEmpty()) {
            subtotal = ShoppingCartSummary.Empty.INSTANCE;
        } else {
            int size = shoppingCart.items.size();
            subtotal = str != null ? new ShoppingCartSummary.Subtotal(size, str) : new ShoppingCartSummary.ItemCount(size);
        }
        return new ShoppingCartCardUiModel(subtotal, listA0a, shoppingCart.items.size() - listA0a.size());
    }
}
