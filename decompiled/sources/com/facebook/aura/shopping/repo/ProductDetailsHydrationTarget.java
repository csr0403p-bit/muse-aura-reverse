package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingProductType;

/* loaded from: classes4.dex */
public final class ProductDetailsHydrationTarget extends C06G {
    public final String connectorId;
    public final String priceCurrency;
    public final String productId;
    public final String productName;
    public final ShoppingProductType productType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsHydrationTarget) {
                ProductDetailsHydrationTarget productDetailsHydrationTarget = (ProductDetailsHydrationTarget) obj;
                if (!C7384Etj.areEqual(this.productId, productDetailsHydrationTarget.productId) || this.productType != productDetailsHydrationTarget.productType || !C7384Etj.areEqual(this.priceCurrency, productDetailsHydrationTarget.priceCurrency) || !C7384Etj.areEqual(this.productName, productDetailsHydrationTarget.productName) || !C7384Etj.areEqual(this.connectorId, productDetailsHydrationTarget.connectorId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ProductDetailsHydrationTarget(String str, ShoppingProductType shoppingProductType, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, shoppingProductType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ ProductDetailsHydrationTarget copy$default(ProductDetailsHydrationTarget productDetailsHydrationTarget, String str, ShoppingProductType shoppingProductType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productDetailsHydrationTarget.productId;
        }
        if ((i & 2) != 0) {
            shoppingProductType = productDetailsHydrationTarget.productType;
        }
        if ((i & 4) != 0) {
            str2 = productDetailsHydrationTarget.priceCurrency;
        }
        if ((i & 8) != 0) {
            str3 = productDetailsHydrationTarget.productName;
        }
        if ((i & 16) != 0) {
            str4 = productDetailsHydrationTarget.connectorId;
        }
        return productDetailsHydrationTarget.copy(str, shoppingProductType, str2, str3, str4);
    }

    public final String component1() {
        return this.productId;
    }

    public final ShoppingProductType component2() {
        return this.productType;
    }

    public final String component3() {
        return this.priceCurrency;
    }

    public final String component4() {
        return this.productName;
    }

    public final String component5() {
        return this.connectorId;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final ShoppingProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.productType, AnonymousClass001.A0G(this.productId)) + AnonymousClass006.A0G(this.priceCurrency)) * 31) + AnonymousClass006.A0G(this.productName)) * 31) + AnonymousClass005.A0H(this.connectorId);
    }

    public final ProductDetailsHydrationTarget copy(String str, ShoppingProductType shoppingProductType, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, shoppingProductType);
        return new ProductDetailsHydrationTarget(str, shoppingProductType, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public ProductDetailsHydrationTarget(String str, ShoppingProductType shoppingProductType, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, shoppingProductType);
        this.productId = str;
        this.productType = shoppingProductType;
        this.priceCurrency = str2;
        this.productName = str3;
        this.connectorId = str4;
    }
}
