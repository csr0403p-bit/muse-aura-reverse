package com.facebook.aura.shopping.navigation;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingConnector;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingPrimaryAction;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.repo.HatchProductDetailsHydrationKt;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ShoppingProductDetailsNavigationKt {
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public static final void navigateToShoppingProductDetails(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, ShoppingResultProduct shoppingResultProduct, String str, String str2, ShoppingFormat shoppingFormat, String str3, ShoppingProductSource shoppingProductSource, String str4, List<ShoppingResultProduct> list, String str5) {
        ?? A1Z = AnonymousClass005.A1Z(auraNavigator, abstractC3358CGz, shoppingResultProduct);
        HatchShoppingSeedStore companion = HatchShoppingSeedStore.Companion.getInstance(abstractC3358CGz);
        String strShoppingProductCollectionId = null;
        if (list == null || list.size() <= A1Z || (strShoppingProductCollectionId = shoppingProductCollectionId(shoppingFormat, shoppingProductSource)) == null || shoppingProductSource == null) {
            companion.pendingProduct = shoppingResultProduct;
        } else {
            companion.rememberCollection(strShoppingProductCollectionId, list, shoppingProductSource.index);
        }
        auraNavigator.navigate((AuraNavKey) shoppingProductDetailsKey(shoppingResultProduct, str, str2, shoppingFormat, str3, shoppingProductSource, str4, strShoppingProductCollectionId, str5), false);
    }

    public static final String shoppingProductCollectionId(ShoppingFormat shoppingFormat, ShoppingProductSource shoppingProductSource) {
        String str;
        if (shoppingProductSource == null || (str = shoppingProductSource.presentationId) == null || shoppingFormat == null) {
            return null;
        }
        return FGI.A0U(shoppingFormat.name(), "_", str);
    }

    public static final String shoppingProductSharedElementKey(ShoppingFormat shoppingFormat, String str, int i) {
        C7384Etj.A0Y(shoppingFormat, 0);
        if (str == null) {
            return null;
        }
        StringBuilder sbA0x = C3cI.A0x("shopping_product_", shoppingFormat.name());
        C60O.A1R("_", str, sbA0x);
        sbA0x.append(i);
        return sbA0x.toString();
    }

    public static final ShoppingProductDetailsPageKey collectionPage(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingResultProduct shoppingResultProduct, int i) {
        AnonymousClass003.A0u(shoppingProductDetailsPageKey, shoppingResultProduct);
        ShoppingProductSource source = shoppingProductDetailsPageKey.getSource();
        ShoppingProductSource shoppingProductSourceCopy$default = source != null ? ShoppingProductSource.copy$default(source, null, null, i, null, shoppingResultProduct.wireIndex, null, null, null, 235, null) : null;
        ShoppingFormat shoppingFormat = shoppingProductDetailsPageKey.entryFormat;
        if (shoppingProductDetailsPageKey.sharedElementKey != null && shoppingFormat != null) {
            ShoppingProductSource source2 = shoppingProductDetailsPageKey.getSource();
            strShoppingProductSharedElementKey = shoppingProductSharedElementKey(shoppingFormat, source2 != null ? source2.presentationId : null, i);
        }
        return shoppingProductDetailsKey(shoppingResultProduct, shoppingProductDetailsPageKey.getSessionId(), shoppingProductDetailsPageKey.getHostMessageId(), shoppingProductDetailsPageKey.entryFormat, shoppingProductDetailsPageKey.widgetId, shoppingProductSourceCopy$default, strShoppingProductSharedElementKey, shoppingProductDetailsPageKey.collectionId, null);
    }

    public static final ShoppingProductDetailsPageKey shoppingProductDetailsKey(ShoppingResultProduct shoppingResultProduct, String str, String str2, ShoppingFormat shoppingFormat, String str3, ShoppingProductSource shoppingProductSource, String str4, String str5, String str6) {
        String str7;
        String str8;
        ProductDetailsHydrationTarget hydrationTarget = HatchProductDetailsHydrationKt.getHydrationTarget(shoppingResultProduct);
        String resolvedProductId = ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProduct);
        String str9 = shoppingResultProduct.brand;
        String merchantName = ShoppingResultsPresentationKt.getMerchantName(shoppingResultProduct);
        ShoppingConnector merchantConnector = ShoppingResultsPresentationKt.getMerchantConnector(shoppingResultProduct);
        ShoppingAddToCartTarget shoppingAddToCartTarget = null;
        String str10 = merchantConnector != null ? merchantConnector.iconUrl : null;
        boolean zA1X = AnonymousClass002.A1X(ShoppingResultsPresentationKt.getMerchantConnector(shoppingResultProduct));
        ShoppingProductType shoppingProductType = shoppingResultProduct.type;
        boolean canOfferBuyNow = ShoppingResultsPresentationKt.getCanOfferBuyNow(shoppingResultProduct);
        String str11 = shoppingResultProduct.url;
        if (hydrationTarget != null) {
            str7 = hydrationTarget.productId;
            str8 = hydrationTarget.connectorId;
        } else {
            str7 = null;
            str8 = null;
        }
        String str12 = shoppingResultProduct.priceCurrency;
        ShoppingPrimaryAction shoppingPrimaryAction = shoppingResultProduct.primaryAction;
        ShoppingAddToCartTarget shoppingAddToCartTargetAddToCartTarget = ShoppingAddToCartTargetKt.addToCartTarget(shoppingResultProduct, shoppingProductSource, str2);
        if (shoppingAddToCartTargetAddToCartTarget != null && hydrationTarget != null && hydrationTarget.connectorId != null) {
            shoppingAddToCartTarget = shoppingAddToCartTargetAddToCartTarget;
        }
        return new ShoppingProductDetailsPageKey(resolvedProductId, str, str9, merchantName, str10, zA1X, shoppingProductType, canOfferBuyNow, str11, str7, str8, str12, str2, shoppingPrimaryAction, shoppingAddToCartTarget, ShoppingResultsPresentationKt.saveTarget(shoppingResultProduct, shoppingProductSource, str2), shoppingResultProduct.secondaryAction, shoppingFormat, str3, ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.productId), shoppingProductSource, str4, str5, str6);
    }
}
