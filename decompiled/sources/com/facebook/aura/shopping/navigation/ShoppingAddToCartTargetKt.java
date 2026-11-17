package com.facebook.aura.shopping.navigation;

import X.C7384Etj;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingPrimaryAction;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public abstract class ShoppingAddToCartTargetKt {
    public static final ShoppingAddToCartTarget addToCartTarget(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str) {
        String strTrimToNonEmpty;
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.productId);
        if (strTrimToNonEmpty2 == null || shoppingResultProduct.primaryAction != ShoppingPrimaryAction.ADD_TO_CART || shoppingResultProduct.type != ShoppingProductType.BROWSER || shoppingResultProduct.isUnavailable) {
            return null;
        }
        String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(shoppingProductSource != null ? shoppingProductSource.widgetId : null);
        if (strTrimToNonEmpty3 != null) {
            return new ShoppingAddToCartTarget.Widget(strTrimToNonEmpty3, strTrimToNonEmpty2);
        }
        String strTrimToNonEmpty4 = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty4 == null || (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.citationId)) == null) {
            return null;
        }
        return new ShoppingAddToCartTarget.Citation(strTrimToNonEmpty4, strTrimToNonEmpty);
    }
}
