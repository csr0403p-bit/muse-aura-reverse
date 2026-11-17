package com.facebook.aura.shopping.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ShoppingResultProductUiModel extends C06G {
    public static final int $stable = 0;
    public final ShoppingDisplayPrices displayPrices;
    public final ShoppingResultProduct product;
    public final ShoppingProductSubtitle subtitle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultProductUiModel) {
                ShoppingResultProductUiModel shoppingResultProductUiModel = (ShoppingResultProductUiModel) obj;
                if (!C7384Etj.areEqual(this.product, shoppingResultProductUiModel.product) || !C7384Etj.areEqual(this.displayPrices, shoppingResultProductUiModel.displayPrices) || !C7384Etj.areEqual(this.subtitle, shoppingResultProductUiModel.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingResultProductUiModel copy$default(ShoppingResultProductUiModel shoppingResultProductUiModel, ShoppingResultProduct shoppingResultProduct, ShoppingDisplayPrices shoppingDisplayPrices, ShoppingProductSubtitle shoppingProductSubtitle, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultProduct = shoppingResultProductUiModel.product;
        }
        if ((i & 2) != 0) {
            shoppingDisplayPrices = shoppingResultProductUiModel.displayPrices;
        }
        if ((i & 4) != 0) {
            shoppingProductSubtitle = shoppingResultProductUiModel.subtitle;
        }
        return shoppingResultProductUiModel.copy(shoppingResultProduct, shoppingDisplayPrices, shoppingProductSubtitle);
    }

    public final ShoppingResultProduct component1() {
        return this.product;
    }

    public final ShoppingDisplayPrices component2() {
        return this.displayPrices;
    }

    public final ShoppingProductSubtitle component3() {
        return this.subtitle;
    }

    public final ShoppingDisplayPrices getDisplayPrices() {
        return this.displayPrices;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public final ShoppingProductSubtitle getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.displayPrices, AnonymousClass005.A0E(this.product)) + AnonymousClass006.A0D(this.subtitle);
    }

    public ShoppingResultProductUiModel(ShoppingResultProduct shoppingResultProduct, ShoppingDisplayPrices shoppingDisplayPrices, ShoppingProductSubtitle shoppingProductSubtitle) {
        AnonymousClass003.A0u(shoppingResultProduct, shoppingDisplayPrices);
        this.product = shoppingResultProduct;
        this.displayPrices = shoppingDisplayPrices;
        this.subtitle = shoppingProductSubtitle;
    }

    public final ShoppingResultProductUiModel copy(ShoppingResultProduct shoppingResultProduct, ShoppingDisplayPrices shoppingDisplayPrices, ShoppingProductSubtitle shoppingProductSubtitle) {
        AnonymousClass003.A0u(shoppingResultProduct, shoppingDisplayPrices);
        return new ShoppingResultProductUiModel(shoppingResultProduct, shoppingDisplayPrices, shoppingProductSubtitle);
    }

    public String toString() {
        return super.toString();
    }
}
