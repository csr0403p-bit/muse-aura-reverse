package com.facebook.aura.shopping.navigation;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingConnector;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;

/* loaded from: classes4.dex */
public abstract class InstacartProductDetailsNavigationKt {
    public static final void navigateToInstacartProductDetails(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, ShoppingResultProduct shoppingResultProduct, String str, String str2, ShoppingFormat shoppingFormat, String str3, ShoppingProductSource shoppingProductSource) {
        AnonymousClass005.A10(auraNavigator, abstractC3358CGz, shoppingResultProduct);
        HatchShoppingSeedStore.Companion.getInstance(abstractC3358CGz).pendingProduct = shoppingResultProduct;
        F0C<C9hr<Object>>[] f0cArr = InstacartProductDetailsSheetKey.$childSerializers;
        String resolvedProductId = ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProduct);
        String str4 = shoppingResultProduct.brand;
        String merchantName = ShoppingResultsPresentationKt.getMerchantName(shoppingResultProduct);
        ShoppingConnector merchantConnector = ShoppingResultsPresentationKt.getMerchantConnector(shoppingResultProduct);
        auraNavigator.navigate((AuraNavKey) new InstacartProductDetailsSheetKey(resolvedProductId, str, str2, str4, merchantName, merchantConnector != null ? merchantConnector.iconUrl : null, AnonymousClass002.A1X(ShoppingResultsPresentationKt.getMerchantConnector(shoppingResultProduct)), shoppingResultProduct.type, shoppingResultProduct.url, ShoppingAddToCartTargetKt.addToCartTarget(shoppingResultProduct, shoppingProductSource, str2), shoppingResultProduct.secondaryAction, shoppingFormat, str3, ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.productId), shoppingProductSource), false);
    }
}
