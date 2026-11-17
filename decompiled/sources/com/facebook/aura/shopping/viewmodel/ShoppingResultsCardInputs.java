package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ShoppingResultsCardInputs extends C06G {
    public static final int $stable = 0;
    public final ShoppingResultsAttribution attribution;
    public final Locale locale;
    public final int maxVisible;
    public final List<ShoppingResultProduct> products;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultsCardInputs) {
                ShoppingResultsCardInputs shoppingResultsCardInputs = (ShoppingResultsCardInputs) obj;
                if (!C7384Etj.areEqual(this.products, shoppingResultsCardInputs.products) || !C7384Etj.areEqual(this.attribution, shoppingResultsCardInputs.attribution) || this.maxVisible != shoppingResultsCardInputs.maxVisible || !C7384Etj.areEqual(this.locale, shoppingResultsCardInputs.locale)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingResultsCardInputs copy$default(ShoppingResultsCardInputs shoppingResultsCardInputs, List list, ShoppingResultsAttribution shoppingResultsAttribution, int i, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = shoppingResultsCardInputs.products;
        }
        if ((i2 & 2) != 0) {
            shoppingResultsAttribution = shoppingResultsCardInputs.attribution;
        }
        if ((i2 & 4) != 0) {
            i = shoppingResultsCardInputs.maxVisible;
        }
        if ((i2 & 8) != 0) {
            locale = shoppingResultsCardInputs.locale;
        }
        AnonymousClass003.A0w(list, locale);
        return new ShoppingResultsCardInputs(list, shoppingResultsAttribution, i, locale);
    }

    public final List<ShoppingResultProduct> component1() {
        return this.products;
    }

    public final ShoppingResultsAttribution component2() {
        return this.attribution;
    }

    public final int component3() {
        return this.maxVisible;
    }

    public final Locale component4() {
        return this.locale;
    }

    public final ShoppingResultsAttribution getAttribution() {
        return this.attribution;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final int getMaxVisible() {
        return this.maxVisible;
    }

    public final List<ShoppingResultProduct> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.locale, (((AnonymousClass005.A0E(this.products) + AnonymousClass006.A0D(this.attribution)) * 31) + this.maxVisible) * 31);
    }

    public ShoppingResultsCardInputs(List<ShoppingResultProduct> list, ShoppingResultsAttribution shoppingResultsAttribution, int i, Locale locale) {
        AnonymousClass003.A0w(list, locale);
        this.products = list;
        this.attribution = shoppingResultsAttribution;
        this.maxVisible = i;
        this.locale = locale;
    }

    public final ShoppingResultsCardInputs copy(List<ShoppingResultProduct> list, ShoppingResultsAttribution shoppingResultsAttribution, int i, Locale locale) {
        AnonymousClass003.A0w(list, locale);
        return new ShoppingResultsCardInputs(list, shoppingResultsAttribution, i, locale);
    }

    public final String identity(String str) {
        int iA02 = C60R.A02(str);
        int iHashCode = hashCode();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(iA02);
        C60O.A1R(":", str, sbA0w);
        sbA0w.append(iHashCode);
        return sbA0w.toString();
    }

    public String toString() {
        return super.toString();
    }
}
