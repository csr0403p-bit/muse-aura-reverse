package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AHD;
import X.AnonymousClass002;
import X.C60Q;
import X.C8j5;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class ProductItemsViewModelKt {
    public static final String TAG = "ProductItemsViewModel";

    public static final ProductItemsUiState withCouponPrices(ProductItemsUiState productItemsUiState, ShoppingCouponPrices shoppingCouponPrices) {
        if (!(productItemsUiState instanceof ProductItemsUiState.Loaded) || shoppingCouponPrices.prices.isEmpty()) {
            return productItemsUiState;
        }
        double dA00 = C8j5.A00();
        ProductItemsUiState.Loaded loaded = (ProductItemsUiState.Loaded) productItemsUiState;
        AHD<ProductItemsSection> ahd = loaded.sections;
        ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
        for (ProductItemsSection productItemsSection : ahd) {
            AHD<ShoppingResultProductUiModel> ahd2 = productItemsSection.products;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
            for (ShoppingResultProductUiModel shoppingResultProductUiModel : ahd2) {
                ShoppingResultProduct shoppingResultProduct = shoppingResultProductUiModel.product;
                arrayListA0m2.add(shoppingResultProductUiModel.copy(shoppingResultProductUiModel.product, ShoppingProductDisplayKt.shoppingDisplayPrices(shoppingResultProduct, shoppingCouponPrices.liveFor(shoppingResultProduct, dA00), C60Q.A0w()), shoppingResultProductUiModel.subtitle));
            }
            arrayListA0m.add(productItemsSection.copy(productItemsSection.label, productItemsSection.subtitle, productItemsSection.presentationId, productItemsSection.presentationEventId, AGI.A07(arrayListA0m2), productItemsSection.widgetId, productItemsSection.kind));
        }
        return loaded.copy(loaded.title, loaded.productCount, AGI.A07(arrayListA0m), loaded.merchant, loaded.merchantDetail);
    }
}
