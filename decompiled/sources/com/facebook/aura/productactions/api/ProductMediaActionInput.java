package com.facebook.aura.productactions.api;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class ProductMediaActionInput {
    public static final int $stable = ShoppingResultProduct.$stable;
    public final ProductDetailsPresentation details;
    public final ShoppingResultProduct product;

    public ProductMediaActionInput(ShoppingResultProduct shoppingResultProduct, ProductDetailsPresentation productDetailsPresentation) {
        C7384Etj.A0Y(productDetailsPresentation, 1);
        this.product = shoppingResultProduct;
        this.details = productDetailsPresentation;
    }

    public final ProductMediaActionInput copy(ShoppingResultProduct shoppingResultProduct, ProductDetailsPresentation productDetailsPresentation) {
        C7384Etj.A0Y(productDetailsPresentation, 1);
        return new ProductMediaActionInput(shoppingResultProduct, productDetailsPresentation);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductMediaActionInput) {
                ProductMediaActionInput productMediaActionInput = (ProductMediaActionInput) obj;
                if (!C7384Etj.areEqual(this.product, productMediaActionInput.product) || !C7384Etj.areEqual(this.details, productMediaActionInput.details)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProductMediaActionInput copy$default(ProductMediaActionInput productMediaActionInput, ShoppingResultProduct shoppingResultProduct, ProductDetailsPresentation productDetailsPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultProduct = productMediaActionInput.product;
        }
        if ((i & 2) != 0) {
            productDetailsPresentation = productMediaActionInput.details;
        }
        C7384Etj.A0Y(productDetailsPresentation, 1);
        return new ProductMediaActionInput(shoppingResultProduct, productDetailsPresentation);
    }

    public final ShoppingResultProduct component1() {
        return this.product;
    }

    public final ProductDetailsPresentation component2() {
        return this.details;
    }

    public final ProductDetailsPresentation getDetails() {
        return this.details;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.details, AnonymousClass006.A0D(this.product) * 31);
    }

    public String toString() {
        return C3cJ.A0L(this.details, ", details=", C3cG.A0f(this.product, "ProductMediaActionInput(product="));
    }
}
