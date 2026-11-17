package com.facebook.aura.productactions.lightbox;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class FeaturedProductMatch {
    public final String cardWidgetId;
    public final String hostMessageId;
    public final ShoppingResultProduct product;
    public final ShoppingProductSource source;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeaturedProductMatch) {
                FeaturedProductMatch featuredProductMatch = (FeaturedProductMatch) obj;
                if (!C7384Etj.areEqual(this.product, featuredProductMatch.product) || !C7384Etj.areEqual(this.source, featuredProductMatch.source) || !C7384Etj.areEqual(this.hostMessageId, featuredProductMatch.hostMessageId) || !C7384Etj.areEqual(this.cardWidgetId, featuredProductMatch.cardWidgetId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeaturedProductMatch copy$default(FeaturedProductMatch featuredProductMatch, ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultProduct = featuredProductMatch.product;
        }
        if ((i & 2) != 0) {
            shoppingProductSource = featuredProductMatch.source;
        }
        if ((i & 4) != 0) {
            str = featuredProductMatch.hostMessageId;
        }
        if ((i & 8) != 0) {
            str2 = featuredProductMatch.cardWidgetId;
        }
        AnonymousClass005.A0x(shoppingResultProduct, shoppingProductSource, str);
        return new FeaturedProductMatch(shoppingResultProduct, shoppingProductSource, str, str2);
    }

    public final ShoppingResultProduct component1() {
        return this.product;
    }

    public final ShoppingProductSource component2() {
        return this.source;
    }

    public final String component3() {
        return this.hostMessageId;
    }

    public final String component4() {
        return this.cardWidgetId;
    }

    public final String getCardWidgetId() {
        return this.cardWidgetId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public final ShoppingProductSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.hostMessageId, AnonymousClass005.A0F(this.source, AnonymousClass005.A0E(this.product))) + AnonymousClass006.A0G(this.cardWidgetId);
    }

    public String toString() {
        ShoppingResultProduct shoppingResultProduct = this.product;
        ShoppingProductSource shoppingProductSource = this.source;
        String str = this.hostMessageId;
        String str2 = this.cardWidgetId;
        StringBuilder sbA0f = C3cG.A0f(shoppingResultProduct, "FeaturedProductMatch(product=");
        sbA0f.append(", source=");
        sbA0f.append(shoppingProductSource);
        sbA0f.append(", hostMessageId=");
        sbA0f.append(str);
        return C3cJ.A0N(", cardWidgetId=", str2, sbA0f);
    }

    public FeaturedProductMatch(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2) {
        AnonymousClass005.A0x(shoppingResultProduct, shoppingProductSource, str);
        this.product = shoppingResultProduct;
        this.source = shoppingProductSource;
        this.hostMessageId = str;
        this.cardWidgetId = str2;
    }

    public final FeaturedProductMatch copy(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str, String str2) {
        AnonymousClass005.A0x(shoppingResultProduct, shoppingProductSource, str);
        return new FeaturedProductMatch(shoppingResultProduct, shoppingProductSource, str, str2);
    }
}
