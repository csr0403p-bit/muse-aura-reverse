package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C06G;
import X.C7384Etj;
import X.C9jH;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductType;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ProductDetailsAnalytics extends C06G {
    public static final int $stable = 0;
    public final ShoppingFormat entryFormat;
    public final String hostMessageId;
    public final String productId;
    public final String widgetId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsAnalytics) {
                ProductDetailsAnalytics productDetailsAnalytics = (ProductDetailsAnalytics) obj;
                if (!C7384Etj.areEqual(this.hostMessageId, productDetailsAnalytics.hostMessageId) || this.entryFormat != productDetailsAnalytics.entryFormat || !C7384Etj.areEqual(this.widgetId, productDetailsAnalytics.widgetId) || !C7384Etj.areEqual(this.productId, productDetailsAnalytics.productId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final BO6<String, String> metadata(String str, ShoppingProductType shoppingProductType, Map<String, String> map) {
        C7384Etj.A0Y(map, 2);
        return ShoppingAnalyticsMetadataKt.shoppingProductMetadata(this.hostMessageId, this.entryFormat, this.productId, str, this.widgetId, shoppingProductType, map);
    }

    public static /* synthetic */ ProductDetailsAnalytics copy$default(ProductDetailsAnalytics productDetailsAnalytics, String str, ShoppingFormat shoppingFormat, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productDetailsAnalytics.hostMessageId;
        }
        if ((i & 2) != 0) {
            shoppingFormat = productDetailsAnalytics.entryFormat;
        }
        if ((i & 4) != 0) {
            str2 = productDetailsAnalytics.widgetId;
        }
        if ((i & 8) != 0) {
            str3 = productDetailsAnalytics.productId;
        }
        return new ProductDetailsAnalytics(str, shoppingFormat, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BO6 metadata$default(ProductDetailsAnalytics productDetailsAnalytics, String str, ShoppingProductType shoppingProductType, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            shoppingProductType = null;
        }
        if ((i & 4) != 0) {
            map = C9jH.A00;
        }
        return productDetailsAnalytics.metadata(str, shoppingProductType, map);
    }

    public final String component1() {
        return this.hostMessageId;
    }

    public final ShoppingFormat component2() {
        return this.entryFormat;
    }

    public final String component3() {
        return this.widgetId;
    }

    public final String component4() {
        return this.productId;
    }

    public final ProductDetailsAnalytics copy(String str, ShoppingFormat shoppingFormat, String str2, String str3) {
        return new ProductDetailsAnalytics(str, shoppingFormat, str2, str3);
    }

    public final ShoppingFormat getEntryFormat() {
        return this.entryFormat;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.hostMessageId) * 31) + AnonymousClass006.A0D(this.entryFormat)) * 31) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass005.A0H(this.productId);
    }

    public ProductDetailsAnalytics(String str, ShoppingFormat shoppingFormat, String str2, String str3) {
        this.hostMessageId = str;
        this.entryFormat = shoppingFormat;
        this.widgetId = str2;
        this.productId = str3;
    }

    public String toString() {
        return super.toString();
    }
}
