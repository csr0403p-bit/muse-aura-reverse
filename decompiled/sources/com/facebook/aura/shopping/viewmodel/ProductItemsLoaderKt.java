package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.C8j3;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.viewmodel.ProductItemsNavText;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ProductItemsLoaderKt {
    public static final ProductItemsUiState.Loaded productItemsLoaded(String str, ShoppingResultsAttribution shoppingResultsAttribution, String str2, AHD<ProductItemsSection> ahd) {
        Iterator it = ahd.iterator();
        int iA0L = 0;
        while (it.hasNext()) {
            iA0L = C8j3.A0L(((ProductItemsSection) it.next()).products, iA0L);
        }
        return new ProductItemsUiState.Loaded(str != null ? new ProductItemsNavText.Text(str) : ProductItemsNavText.ResultsTitle.INSTANCE, iA0L, ahd, shoppingResultsAttribution, str2 != null ? new ProductItemsNavText.Text(str2) : new ProductItemsNavText.ProductCount(iA0L));
    }
}
