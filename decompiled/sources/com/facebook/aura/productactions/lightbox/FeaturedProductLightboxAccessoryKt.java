package com.facebook.aura.productactions.lightbox;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentViewerPageContext;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingFeaturedProduct;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class FeaturedProductLightboxAccessoryKt {
    public static volatile WeakReference<FeaturedProductIndex> cachedFeaturedProductIndex;

    public static final String normalizedCitationId(String str) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            if (strA0u.length() != 0) {
                return strA0u;
            }
        }
        return null;
    }

    public static final void open(FeaturedProductLightboxAccessory featuredProductLightboxAccessory, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass005.A0x(featuredProductLightboxAccessory, auraNavigator, abstractC3358CGz);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.PRODUCT_CARD, featuredProductLightboxAccessory.componentId, featuredProductLightboxAccessory.analyticsMetadata, null);
        ProductDetailsNavigationKt.navigateToProductDetails(auraNavigator, abstractC3358CGz, featuredProductLightboxAccessory.product, featuredProductLightboxAccessory.sessionId, featuredProductLightboxAccessory.hostMessageId, ShoppingFormat.LIGHTBOX, featuredProductLightboxAccessory.analyticsWidgetId, featuredProductLightboxAccessory.source, null, null, featuredProductLightboxAccessory.pageImageUrl);
    }

    public static final FeaturedProductLightboxAccessory featuredProductLightboxAccessory(HatchAttachmentFile hatchAttachmentFile, ContentViewerPageContext contentViewerPageContext) {
        FeaturedProductMatch featuredProductMatch;
        ShoppingFeaturedProduct shoppingFeaturedProduct = (ShoppingFeaturedProduct) AbstractC0878AGe.A0G(hatchAttachmentFile.featuredProducts);
        String str = null;
        if (shoppingFeaturedProduct == null || !ProductDetailsNavigationKt.isProductDetailsEnabled() || (featuredProductMatch = featuredProductMatch(contentViewerPageContext.threadMessages, shoppingFeaturedProduct.citationId)) == null) {
            return null;
        }
        ShoppingResultProduct shoppingResultProduct = featuredProductMatch.product;
        ShoppingProductSource shoppingProductSource = featuredProductMatch.source;
        String str2 = contentViewerPageContext.sessionId;
        String str3 = featuredProductMatch.hostMessageId;
        String str4 = shoppingResultProduct.productId;
        if (str4 == null) {
            str4 = shoppingResultProduct.url;
        }
        String str5 = shoppingResultProduct.imageUrl;
        if (str5 != null && ShoppingResultsPresentationKt.getCanAttemptImage(shoppingResultProduct)) {
            str = str5;
        }
        String str6 = shoppingResultProduct.brand;
        String merchantName = ShoppingResultsPresentationKt.getMerchantName(shoppingResultProduct);
        String str7 = featuredProductMatch.cardWidgetId;
        return new FeaturedProductLightboxAccessory(shoppingResultProduct, shoppingProductSource, str2, str3, str4, str, str6, merchantName, str7, ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, contentViewerPageContext.hostMessageId, ShoppingFormat.LIGHTBOX, str7, null, AnonymousClass006.A10(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(hatchAttachmentFile.featuredProducts.size()))), FGI.A0d("lightbox_featured_product:", contentViewerPageContext.hostMessageId, ":", hatchAttachmentFile.path), contentViewerPageContext.imageUri);
    }

    public static final FeaturedProductMatch featuredProductMatch(List<HatchMessage> list, String str) {
        FeaturedProductIndex featuredProductIndex;
        WeakReference<FeaturedProductIndex> weakReference = cachedFeaturedProductIndex;
        if (weakReference == null || (featuredProductIndex = weakReference.get()) == null || featuredProductIndex.messages != list) {
            featuredProductIndex = new FeaturedProductIndex(list);
            cachedFeaturedProductIndex = new WeakReference<>(featuredProductIndex);
        }
        return featuredProductIndex.match(str);
    }
}
