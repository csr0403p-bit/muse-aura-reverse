package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ShoppingDisplayPrices extends C06G {
    public static final int $stable = 0;
    public final String current;
    public final String original;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingDisplayPrices) {
                ShoppingDisplayPrices shoppingDisplayPrices = (ShoppingDisplayPrices) obj;
                if (!C7384Etj.areEqual(this.current, shoppingDisplayPrices.current) || !C7384Etj.areEqual(this.original, shoppingDisplayPrices.original)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingDisplayPrices copy$default(ShoppingDisplayPrices shoppingDisplayPrices, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingDisplayPrices.current;
        }
        if ((i & 2) != 0) {
            str2 = shoppingDisplayPrices.original;
        }
        return new ShoppingDisplayPrices(str, str2);
    }

    public final String component1() {
        return this.current;
    }

    public final String component2() {
        return this.original;
    }

    public final ShoppingDisplayPrices copy(String str, String str2) {
        return new ShoppingDisplayPrices(str, str2);
    }

    public final String getCurrent() {
        return this.current;
    }

    public final String getOriginal() {
        return this.original;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.current) * 31) + AnonymousClass005.A0H(this.original);
    }

    public ShoppingDisplayPrices(String str, String str2) {
        this.current = str;
        this.original = str2;
    }

    public String toString() {
        return super.toString();
    }
}
