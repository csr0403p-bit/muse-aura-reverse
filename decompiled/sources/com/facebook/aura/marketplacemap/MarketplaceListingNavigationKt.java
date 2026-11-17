package com.facebook.aura.marketplacemap;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.G0U;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class MarketplaceListingNavigationKt {
    public static final void openMarketplaceListing(MarketplaceMapListing marketplaceMapListing, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, String str2, G0U<? super String, Unit> g0u) {
        AnonymousClass005.A0x(marketplaceMapListing, auraNavigator, abstractC3358CGz);
        AnonymousClass003.A0y(str2, g0u);
        if (ProductDetailsNavigationKt.isProductDetailsEnabled()) {
            ProductDetailsNavigationKt.navigateToProductDetails(auraNavigator, abstractC3358CGz, toShoppingResultProduct(marketplaceMapListing), str, str2, ShoppingFormat.MAP, null, null, null, null, null);
        } else {
            g0u.invoke(marketplaceMapListing.url);
        }
    }

    public static final ShoppingResultProduct toShoppingResultProduct(MarketplaceMapListing marketplaceMapListing) {
        int i = ShoppingResultProduct.$stable;
        String str = marketplaceMapListing.listingId;
        String str2 = marketplaceMapListing.name;
        String str3 = marketplaceMapListing.imageUrl;
        return new ShoppingResultProduct(str, str2, null, str3, marketplaceMapListing.price, marketplaceMapListing.salePrice, null, marketplaceMapListing.url, ShoppingProductType.MARKETPLACE, false, false, marketplaceMapListing.isUnavailable, null, null, AnonymousClass002.A1X(str3), null, null, null, null, null, null);
    }
}
