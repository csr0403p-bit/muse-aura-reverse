package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;

/* loaded from: classes4.dex */
public final class ShoppingResultsCardDisplayState extends C06G {
    public static final int $stable = 0;
    public final boolean hasMore;
    public final int nameMaxLines;
    public final AHD<ProductDetailsHydrationTarget> prefetchTargets;
    public final AHD<ShoppingResultProductUiModel> products;
    public final AHD<ShoppingResultProduct> sourceProducts;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultsCardDisplayState) {
                ShoppingResultsCardDisplayState shoppingResultsCardDisplayState = (ShoppingResultsCardDisplayState) obj;
                if (!C7384Etj.areEqual(this.products, shoppingResultsCardDisplayState.products) || !C7384Etj.areEqual(this.sourceProducts, shoppingResultsCardDisplayState.sourceProducts) || !C7384Etj.areEqual(this.prefetchTargets, shoppingResultsCardDisplayState.prefetchTargets) || this.hasMore != shoppingResultsCardDisplayState.hasMore || this.nameMaxLines != shoppingResultsCardDisplayState.nameMaxLines) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingResultsCardDisplayState copy$default(ShoppingResultsCardDisplayState shoppingResultsCardDisplayState, AHD ahd, AHD ahd2, AHD ahd3, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ahd = shoppingResultsCardDisplayState.products;
        }
        if ((i2 & 2) != 0) {
            ahd2 = shoppingResultsCardDisplayState.sourceProducts;
        }
        if ((i2 & 4) != 0) {
            ahd3 = shoppingResultsCardDisplayState.prefetchTargets;
        }
        if ((i2 & 8) != 0) {
            z = shoppingResultsCardDisplayState.hasMore;
        }
        if ((i2 & 16) != 0) {
            i = shoppingResultsCardDisplayState.nameMaxLines;
        }
        return shoppingResultsCardDisplayState.copy(ahd, ahd2, ahd3, z, i);
    }

    public final AHD<ShoppingResultProductUiModel> component1() {
        return this.products;
    }

    public final AHD<ShoppingResultProduct> component2() {
        return this.sourceProducts;
    }

    public final AHD<ProductDetailsHydrationTarget> component3() {
        return this.prefetchTargets;
    }

    public final boolean component4() {
        return this.hasMore;
    }

    public final int component5() {
        return this.nameMaxLines;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNameMaxLines() {
        return this.nameMaxLines;
    }

    public final AHD<ProductDetailsHydrationTarget> getPrefetchTargets() {
        return this.prefetchTargets;
    }

    public final AHD<ShoppingResultProductUiModel> getProducts() {
        return this.products;
    }

    public final AHD<ShoppingResultProduct> getSourceProducts() {
        return this.sourceProducts;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.prefetchTargets, AnonymousClass005.A0F(this.sourceProducts, AnonymousClass005.A0E(this.products))), this.hasMore) + this.nameMaxLines;
    }

    public ShoppingResultsCardDisplayState(AHD<ShoppingResultProductUiModel> ahd, AHD<ShoppingResultProduct> ahd2, AHD<ProductDetailsHydrationTarget> ahd3, boolean z, int i) {
        AnonymousClass005.A0x(ahd, ahd2, ahd3);
        this.products = ahd;
        this.sourceProducts = ahd2;
        this.prefetchTargets = ahd3;
        this.hasMore = z;
        this.nameMaxLines = i;
    }

    public final ShoppingResultsCardDisplayState copy(AHD<ShoppingResultProductUiModel> ahd, AHD<ShoppingResultProduct> ahd2, AHD<ProductDetailsHydrationTarget> ahd3, boolean z, int i) {
        AnonymousClass005.A0x(ahd, ahd2, ahd3);
        return new ShoppingResultsCardDisplayState(ahd, ahd2, ahd3, z, i);
    }

    public String toString() {
        return super.toString();
    }
}
