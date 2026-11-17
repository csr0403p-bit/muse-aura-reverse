package com.facebook.aura.productactions.lightbox;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class FeaturedProductLightboxInputs {
    public static final int $stable = ShoppingResultProduct.$stable;
    public final Locale locale;
    public final ShoppingResultProduct product;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeaturedProductLightboxInputs) {
                FeaturedProductLightboxInputs featuredProductLightboxInputs = (FeaturedProductLightboxInputs) obj;
                if (!C7384Etj.areEqual(this.product, featuredProductLightboxInputs.product) || !C7384Etj.areEqual(this.locale, featuredProductLightboxInputs.locale)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeaturedProductLightboxInputs copy$default(FeaturedProductLightboxInputs featuredProductLightboxInputs, ShoppingResultProduct shoppingResultProduct, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingResultProduct = featuredProductLightboxInputs.product;
        }
        if ((i & 2) != 0) {
            locale = featuredProductLightboxInputs.locale;
        }
        AnonymousClass003.A0u(shoppingResultProduct, locale);
        return new FeaturedProductLightboxInputs(shoppingResultProduct, locale);
    }

    public final ShoppingResultProduct component1() {
        return this.product;
    }

    public final Locale component2() {
        return this.locale;
    }

    public final String getIdentity() {
        String str = this.product.productId;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        Locale locale = this.locale;
        int iHashCode = hashCode();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(length);
        C60O.A1R(":", str, sbA0w);
        sbA0w.append(locale);
        return C60P.A1O(":", sbA0w, iHashCode);
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.locale, AnonymousClass005.A0E(this.product));
    }

    public String toString() {
        return C3cJ.A0L(this.locale, ", locale=", C3cG.A0f(this.product, "FeaturedProductLightboxInputs(product="));
    }

    public FeaturedProductLightboxInputs(ShoppingResultProduct shoppingResultProduct, Locale locale) {
        AnonymousClass003.A0u(shoppingResultProduct, locale);
        this.product = shoppingResultProduct;
        this.locale = locale;
    }

    public final FeaturedProductLightboxInputs copy(ShoppingResultProduct shoppingResultProduct, Locale locale) {
        AnonymousClass003.A0u(shoppingResultProduct, locale);
        return new FeaturedProductLightboxInputs(shoppingResultProduct, locale);
    }
}
