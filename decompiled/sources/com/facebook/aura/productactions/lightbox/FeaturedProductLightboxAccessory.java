package com.facebook.aura.productactions.lightbox;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60N;
import X.C7384Etj;
import X.C8j5;
import com.facebook.aura.file.view.api.ContentViewerPageAccessory;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class FeaturedProductLightboxAccessory implements ContentViewerPageAccessory {
    public static final int $stable = 0;
    public final BO6<String, String> analyticsMetadata;
    public final String analyticsWidgetId;
    public final String brand;
    public final String componentId;
    public final String hostMessageId;
    public final String impressionDedupeKey;
    public final String merchant;
    public final String pageImageUrl;
    public final ShoppingResultProduct product;
    public final String sessionId;
    public final ShoppingProductSource source;
    public final String thumbnailUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeaturedProductLightboxAccessory) {
                FeaturedProductLightboxAccessory featuredProductLightboxAccessory = (FeaturedProductLightboxAccessory) obj;
                if (!C7384Etj.areEqual(this.product, featuredProductLightboxAccessory.product) || !C7384Etj.areEqual(this.source, featuredProductLightboxAccessory.source) || !C7384Etj.areEqual(this.sessionId, featuredProductLightboxAccessory.sessionId) || !C7384Etj.areEqual(this.hostMessageId, featuredProductLightboxAccessory.hostMessageId) || !C7384Etj.areEqual(this.componentId, featuredProductLightboxAccessory.componentId) || !C7384Etj.areEqual(this.thumbnailUrl, featuredProductLightboxAccessory.thumbnailUrl) || !C7384Etj.areEqual(this.brand, featuredProductLightboxAccessory.brand) || !C7384Etj.areEqual(this.merchant, featuredProductLightboxAccessory.merchant) || !C7384Etj.areEqual(this.analyticsWidgetId, featuredProductLightboxAccessory.analyticsWidgetId) || !C7384Etj.areEqual(this.analyticsMetadata, featuredProductLightboxAccessory.analyticsMetadata) || !C7384Etj.areEqual(this.impressionDedupeKey, featuredProductLightboxAccessory.impressionDedupeKey) || !C7384Etj.areEqual(this.pageImageUrl, featuredProductLightboxAccessory.pageImageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturedProductLightboxAccessory copy$default(FeaturedProductLightboxAccessory featuredProductLightboxAccessory, ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, String str3, String str4, String str5, String str6, String str7, BO6 bo6, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultProduct = featuredProductLightboxAccessory.product;
        }
        if ((i & 2) != 0) {
            shoppingProductSource = featuredProductLightboxAccessory.source;
        }
        if ((i & 4) != 0) {
            str = featuredProductLightboxAccessory.sessionId;
        }
        if ((i & 8) != 0) {
            str2 = featuredProductLightboxAccessory.hostMessageId;
        }
        if ((i & 16) != 0) {
            str3 = featuredProductLightboxAccessory.componentId;
        }
        if ((i & 32) != 0) {
            str4 = featuredProductLightboxAccessory.thumbnailUrl;
        }
        if ((i & 64) != 0) {
            str5 = featuredProductLightboxAccessory.brand;
        }
        if ((i & 128) != 0) {
            str6 = featuredProductLightboxAccessory.merchant;
        }
        if ((i & 256) != 0) {
            str7 = featuredProductLightboxAccessory.analyticsWidgetId;
        }
        if ((i & 512) != 0) {
            bo6 = featuredProductLightboxAccessory.analyticsMetadata;
        }
        if ((i & 1024) != 0) {
            str8 = featuredProductLightboxAccessory.impressionDedupeKey;
        }
        if ((i & 2048) != 0) {
            str9 = featuredProductLightboxAccessory.pageImageUrl;
        }
        return featuredProductLightboxAccessory.copy(shoppingResultProduct, shoppingProductSource, str, str2, str3, str4, str5, str6, str7, bo6, str8, str9);
    }

    public final ShoppingResultProduct component1() {
        return this.product;
    }

    public final BO6<String, String> component10() {
        return this.analyticsMetadata;
    }

    public final String component11() {
        return this.impressionDedupeKey;
    }

    public final String component12() {
        return this.pageImageUrl;
    }

    public final ShoppingProductSource component2() {
        return this.source;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4() {
        return this.hostMessageId;
    }

    public final String component5() {
        return this.componentId;
    }

    public final String component6() {
        return this.thumbnailUrl;
    }

    public final String component7() {
        return this.brand;
    }

    public final String component8() {
        return this.merchant;
    }

    public final String component9() {
        return this.analyticsWidgetId;
    }

    public final BO6<String, String> getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    public final String getAnalyticsWidgetId() {
        return this.analyticsWidgetId;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getComponentId() {
        return this.componentId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getImpressionDedupeKey() {
        return this.impressionDedupeKey;
    }

    public final String getMerchant() {
        return this.merchant;
    }

    public final String getPageImageUrl() {
        return this.pageImageUrl;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ShoppingProductSource getSource() {
        return this.source;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.impressionDedupeKey, AnonymousClass005.A0F(this.analyticsMetadata, (((((((((AnonymousClass005.A0I(this.hostMessageId, (AnonymousClass005.A0F(this.source, AnonymousClass005.A0E(this.product)) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.componentId)) * 31) + AnonymousClass006.A0G(this.thumbnailUrl)) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + AnonymousClass006.A0G(this.merchant)) * 31) + AnonymousClass006.A0G(this.analyticsWidgetId)) * 31)) + AnonymousClass005.A0H(this.pageImageUrl);
    }

    public String toString() {
        ShoppingResultProduct shoppingResultProduct = this.product;
        ShoppingProductSource shoppingProductSource = this.source;
        String str = this.sessionId;
        String str2 = this.hostMessageId;
        String str3 = this.componentId;
        String str4 = this.thumbnailUrl;
        String str5 = this.brand;
        String str6 = this.merchant;
        String str7 = this.analyticsWidgetId;
        BO6<String, String> bo6 = this.analyticsMetadata;
        String str8 = this.impressionDedupeKey;
        String str9 = this.pageImageUrl;
        StringBuilder sbA0f = C3cG.A0f(shoppingResultProduct, "FeaturedProductLightboxAccessory(product=");
        C8j5.A0m(shoppingProductSource, ", source=", str, str2, sbA0f);
        sbA0f.append(", componentId=");
        sbA0f.append(str3);
        sbA0f.append(C60N.A00(11));
        sbA0f.append(str4);
        sbA0f.append(", brand=");
        sbA0f.append(str5);
        sbA0f.append(", merchant=");
        sbA0f.append(str6);
        sbA0f.append(", analyticsWidgetId=");
        sbA0f.append(str7);
        sbA0f.append(", analyticsMetadata=");
        sbA0f.append(bo6);
        sbA0f.append(", impressionDedupeKey=");
        sbA0f.append(str8);
        return C3cJ.A0N(", pageImageUrl=", str9, sbA0f);
    }

    public FeaturedProductLightboxAccessory(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, String str3, String str4, String str5, String str6, String str7, BO6<String, String> bo6, String str8, String str9) {
        AnonymousClass005.A0y(shoppingResultProduct, shoppingProductSource, str2);
        C3cH.A18(bo6, str8);
        this.product = shoppingResultProduct;
        this.source = shoppingProductSource;
        this.sessionId = str;
        this.hostMessageId = str2;
        this.componentId = str3;
        this.thumbnailUrl = str4;
        this.brand = str5;
        this.merchant = str6;
        this.analyticsWidgetId = str7;
        this.analyticsMetadata = bo6;
        this.impressionDedupeKey = str8;
        this.pageImageUrl = str9;
    }

    public final FeaturedProductLightboxAccessory copy(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, String str3, String str4, String str5, String str6, String str7, BO6<String, String> bo6, String str8, String str9) {
        AnonymousClass005.A0y(shoppingResultProduct, shoppingProductSource, str2);
        C3cH.A18(bo6, str8);
        return new FeaturedProductLightboxAccessory(shoppingResultProduct, shoppingProductSource, str, str2, str3, str4, str5, str6, str7, bo6, str8, str9);
    }
}
