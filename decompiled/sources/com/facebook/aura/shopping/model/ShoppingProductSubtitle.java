package com.facebook.aura.shopping.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ShoppingProductSubtitle extends C06G {
    public static final int $stable = 0;
    public final String brand;
    public final ShoppingConnector connector;
    public final String merchant;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductSubtitle) {
                ShoppingProductSubtitle shoppingProductSubtitle = (ShoppingProductSubtitle) obj;
                if (!C7384Etj.areEqual(this.merchant, shoppingProductSubtitle.merchant) || !C7384Etj.areEqual(this.brand, shoppingProductSubtitle.brand) || !C7384Etj.areEqual(this.connector, shoppingProductSubtitle.connector)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingProductSubtitle copy$default(ShoppingProductSubtitle shoppingProductSubtitle, String str, String str2, ShoppingConnector shoppingConnector, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingProductSubtitle.merchant;
        }
        if ((i & 2) != 0) {
            str2 = shoppingProductSubtitle.brand;
        }
        if ((i & 4) != 0) {
            shoppingConnector = shoppingProductSubtitle.connector;
        }
        return new ShoppingProductSubtitle(str, str2, shoppingConnector);
    }

    public final String component1() {
        return this.merchant;
    }

    public final String component2() {
        return this.brand;
    }

    public final ShoppingConnector component3() {
        return this.connector;
    }

    public final ShoppingProductSubtitle copy(String str, String str2, ShoppingConnector shoppingConnector) {
        return new ShoppingProductSubtitle(str, str2, shoppingConnector);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final ShoppingConnector getConnector() {
        return this.connector;
    }

    public final String getMerchant() {
        return this.merchant;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.merchant) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + C3cH.A02(this.connector);
    }

    public ShoppingProductSubtitle(String str, String str2, ShoppingConnector shoppingConnector) {
        this.merchant = str;
        this.brand = str2;
        this.connector = shoppingConnector;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingProductSubtitle(String str, String str2, ShoppingConnector shoppingConnector, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : shoppingConnector);
    }
}
