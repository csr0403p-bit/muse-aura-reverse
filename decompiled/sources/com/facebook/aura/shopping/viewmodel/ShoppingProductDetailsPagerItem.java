package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPagerItem extends C06G {
    public static final int $stable = 0;
    public final ShoppingProductDetailsPageKey key;
    public final ShoppingResultProduct seededProduct;

    public ShoppingProductDetailsPagerItem(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingProductDetailsPageKey, 0);
        this.key = shoppingProductDetailsPageKey;
        this.seededProduct = shoppingResultProduct;
    }

    public final ShoppingProductDetailsPagerItem copy(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingProductDetailsPageKey, 0);
        return new ShoppingProductDetailsPagerItem(shoppingProductDetailsPageKey, shoppingResultProduct);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsPagerItem) {
                ShoppingProductDetailsPagerItem shoppingProductDetailsPagerItem = (ShoppingProductDetailsPagerItem) obj;
                if (!C7384Etj.areEqual(this.key, shoppingProductDetailsPagerItem.key) || !C7384Etj.areEqual(this.seededProduct, shoppingProductDetailsPagerItem.seededProduct)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingProductDetailsPagerItem copy$default(ShoppingProductDetailsPagerItem shoppingProductDetailsPagerItem, ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingProductDetailsPageKey = shoppingProductDetailsPagerItem.key;
        }
        if ((i & 2) != 0) {
            shoppingResultProduct = shoppingProductDetailsPagerItem.seededProduct;
        }
        C7384Etj.A0Y(shoppingProductDetailsPageKey, 0);
        return new ShoppingProductDetailsPagerItem(shoppingProductDetailsPageKey, shoppingResultProduct);
    }

    public final ShoppingProductDetailsPageKey component1() {
        return this.key;
    }

    public final ShoppingResultProduct component2() {
        return this.seededProduct;
    }

    public final ShoppingProductDetailsPageKey getKey() {
        return this.key;
    }

    public final ShoppingResultProduct getSeededProduct() {
        return this.seededProduct;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.key) + AnonymousClass006.A0D(this.seededProduct);
    }

    public String toString() {
        return super.toString();
    }
}
