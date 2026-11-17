package com.facebook.aura.productactions.impl;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0KA;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C8j5;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;

/* loaded from: classes4.dex */
public final class ProductDetailsHeaderContext {
    public static final int $stable = ShoppingResultProduct.$stable | ShoppingProductSource.$stable;
    public final boolean actionsEnabled;
    public final String displayedImageUrl;
    public final String displayedName;
    public final String entityId;
    public final String hostMessageId;
    public final String productId;
    public final ShoppingProductType productType;
    public final ShoppingSaveTarget saveTarget;
    public final ShoppingResultProduct seededProduct;
    public final String sessionId;
    public final ShoppingProductSource source;
    public final String websiteUrl;

    public static /* synthetic */ ProductDetailsHeaderContext copy$default(ProductDetailsHeaderContext productDetailsHeaderContext, String str, String str2, ShoppingProductType shoppingProductType, String str3, String str4, ShoppingProductSource shoppingProductSource, ShoppingResultProduct shoppingResultProduct, String str5, String str6, String str7, boolean z, ShoppingSaveTarget shoppingSaveTarget, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        ShoppingProductType shoppingProductType2 = shoppingProductType;
        String str10 = str3;
        String str11 = str4;
        ShoppingProductSource shoppingProductSource2 = shoppingProductSource;
        ShoppingResultProduct shoppingResultProduct2 = shoppingResultProduct;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        boolean z2 = z;
        ShoppingSaveTarget shoppingSaveTarget2 = shoppingSaveTarget;
        if ((i & 1) != 0) {
            str8 = productDetailsHeaderContext.productId;
        }
        if ((i & 2) != 0) {
            str9 = productDetailsHeaderContext.websiteUrl;
        }
        if ((i & 4) != 0) {
            shoppingProductType2 = productDetailsHeaderContext.productType;
        }
        if ((i & 8) != 0) {
            str10 = productDetailsHeaderContext.sessionId;
        }
        if ((i & 16) != 0) {
            str11 = productDetailsHeaderContext.hostMessageId;
        }
        if ((i & 32) != 0) {
            shoppingProductSource2 = productDetailsHeaderContext.source;
        }
        if ((i & 64) != 0) {
            shoppingResultProduct2 = productDetailsHeaderContext.seededProduct;
        }
        if ((i & 128) != 0) {
            str12 = productDetailsHeaderContext.displayedName;
        }
        if ((i & 256) != 0) {
            str13 = productDetailsHeaderContext.displayedImageUrl;
        }
        if ((i & 512) != 0) {
            str14 = productDetailsHeaderContext.entityId;
        }
        if ((i & 1024) != 0) {
            z2 = productDetailsHeaderContext.actionsEnabled;
        }
        if ((i & 2048) != 0) {
            shoppingSaveTarget2 = productDetailsHeaderContext.saveTarget;
        }
        AnonymousClass003.A0v(str8, shoppingProductType2);
        return new ProductDetailsHeaderContext(str8, str9, shoppingProductType2, str10, str11, shoppingProductSource2, shoppingResultProduct2, str12, str13, str14, z2, shoppingSaveTarget2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsHeaderContext) {
                ProductDetailsHeaderContext productDetailsHeaderContext = (ProductDetailsHeaderContext) obj;
                if (!C7384Etj.areEqual(this.productId, productDetailsHeaderContext.productId) || !C7384Etj.areEqual(this.websiteUrl, productDetailsHeaderContext.websiteUrl) || this.productType != productDetailsHeaderContext.productType || !C7384Etj.areEqual(this.sessionId, productDetailsHeaderContext.sessionId) || !C7384Etj.areEqual(this.hostMessageId, productDetailsHeaderContext.hostMessageId) || !C7384Etj.areEqual(this.source, productDetailsHeaderContext.source) || !C7384Etj.areEqual(this.seededProduct, productDetailsHeaderContext.seededProduct) || !C7384Etj.areEqual(this.displayedName, productDetailsHeaderContext.displayedName) || !C7384Etj.areEqual(this.displayedImageUrl, productDetailsHeaderContext.displayedImageUrl) || !C7384Etj.areEqual(this.entityId, productDetailsHeaderContext.entityId) || this.actionsEnabled != productDetailsHeaderContext.actionsEnabled || !C7384Etj.areEqual(this.saveTarget, productDetailsHeaderContext.saveTarget)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.productId;
    }

    public final String component10() {
        return this.entityId;
    }

    public final boolean component11() {
        return this.actionsEnabled;
    }

    public final ShoppingSaveTarget component12() {
        return this.saveTarget;
    }

    public final String component2() {
        return this.websiteUrl;
    }

    public final ShoppingProductType component3() {
        return this.productType;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final String component5() {
        return this.hostMessageId;
    }

    public final ShoppingProductSource component6() {
        return this.source;
    }

    public final ShoppingResultProduct component7() {
        return this.seededProduct;
    }

    public final String component8() {
        return this.displayedName;
    }

    public final String component9() {
        return this.displayedImageUrl;
    }

    public final boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    public final String getDisplayedImageUrl() {
        return this.displayedImageUrl;
    }

    public final String getDisplayedName() {
        return this.displayedName;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final ShoppingProductType getProductType() {
        return this.productType;
    }

    public final ShoppingSaveTarget getSaveTarget() {
        return this.saveTarget;
    }

    public final ShoppingResultProduct getSeededProduct() {
        return this.seededProduct;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ShoppingProductSource getSource() {
        return this.source;
    }

    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public int hashCode() {
        return C0KA.A01((((((((((((((AnonymousClass005.A0F(this.productType, (AnonymousClass001.A0G(this.productId) + AnonymousClass006.A0G(this.websiteUrl)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.hostMessageId)) * 31) + AnonymousClass006.A0D(this.source)) * 31) + AnonymousClass006.A0D(this.seededProduct)) * 31) + AnonymousClass006.A0G(this.displayedName)) * 31) + AnonymousClass006.A0G(this.displayedImageUrl)) * 31) + AnonymousClass006.A0G(this.entityId)) * 31, this.actionsEnabled) + C3cH.A02(this.saveTarget);
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.websiteUrl;
        ShoppingProductType shoppingProductType = this.productType;
        String str3 = this.sessionId;
        String str4 = this.hostMessageId;
        ShoppingProductSource shoppingProductSource = this.source;
        ShoppingResultProduct shoppingResultProduct = this.seededProduct;
        String str5 = this.displayedName;
        String str6 = this.displayedImageUrl;
        String str7 = this.entityId;
        boolean z = this.actionsEnabled;
        ShoppingSaveTarget shoppingSaveTarget = this.saveTarget;
        StringBuilder sbA0x = C3cI.A0x("ProductDetailsHeaderContext(productId=", str);
        sbA0x.append(", websiteUrl=");
        sbA0x.append(str2);
        C8j5.A0m(shoppingProductType, ", productType=", str3, str4, sbA0x);
        sbA0x.append(", source=");
        sbA0x.append(shoppingProductSource);
        sbA0x.append(", seededProduct=");
        sbA0x.append(shoppingResultProduct);
        sbA0x.append(", displayedName=");
        sbA0x.append(str5);
        sbA0x.append(", displayedImageUrl=");
        sbA0x.append(str6);
        sbA0x.append(", entityId=");
        sbA0x.append(str7);
        sbA0x.append(", actionsEnabled=");
        sbA0x.append(z);
        return C3cJ.A0L(shoppingSaveTarget, ", saveTarget=", sbA0x);
    }

    public ProductDetailsHeaderContext(String str, String str2, ShoppingProductType shoppingProductType, String str3, String str4, ShoppingProductSource shoppingProductSource, ShoppingResultProduct shoppingResultProduct, String str5, String str6, String str7, boolean z, ShoppingSaveTarget shoppingSaveTarget) {
        AnonymousClass003.A0v(str, shoppingProductType);
        this.productId = str;
        this.websiteUrl = str2;
        this.productType = shoppingProductType;
        this.sessionId = str3;
        this.hostMessageId = str4;
        this.source = shoppingProductSource;
        this.seededProduct = shoppingResultProduct;
        this.displayedName = str5;
        this.displayedImageUrl = str6;
        this.entityId = str7;
        this.actionsEnabled = z;
        this.saveTarget = shoppingSaveTarget;
    }

    public final ProductDetailsHeaderContext copy(String str, String str2, ShoppingProductType shoppingProductType, String str3, String str4, ShoppingProductSource shoppingProductSource, ShoppingResultProduct shoppingResultProduct, String str5, String str6, String str7, boolean z, ShoppingSaveTarget shoppingSaveTarget) {
        AnonymousClass003.A0v(str, shoppingProductType);
        return new ProductDetailsHeaderContext(str, str2, shoppingProductType, str3, str4, shoppingProductSource, shoppingResultProduct, str5, str6, str7, z, shoppingSaveTarget);
    }
}
