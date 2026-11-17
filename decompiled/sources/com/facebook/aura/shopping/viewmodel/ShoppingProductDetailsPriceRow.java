package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpPrice;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPriceRow extends C06G {
    public static final int $stable = 0;
    public final ShoppingProductDetailsCouponTag couponTag;
    public final PdpPrice originalPrice;
    public final Integer percentOff;
    public final PdpPrice price;

    public ShoppingProductDetailsPriceRow(PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag) {
        C7384Etj.A0Y(pdpPrice, 0);
        this.price = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.percentOff = num;
        this.couponTag = shoppingProductDetailsCouponTag;
    }

    public final ShoppingProductDetailsPriceRow copy(PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag) {
        C7384Etj.A0Y(pdpPrice, 0);
        return new ShoppingProductDetailsPriceRow(pdpPrice, pdpPrice2, num, shoppingProductDetailsCouponTag);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsPriceRow) {
                ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow = (ShoppingProductDetailsPriceRow) obj;
                if (!C7384Etj.areEqual(this.price, shoppingProductDetailsPriceRow.price) || !C7384Etj.areEqual(this.originalPrice, shoppingProductDetailsPriceRow.originalPrice) || !C7384Etj.areEqual(this.percentOff, shoppingProductDetailsPriceRow.percentOff) || !C7384Etj.areEqual(this.couponTag, shoppingProductDetailsPriceRow.couponTag)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingProductDetailsPriceRow copy$default(ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag, int i, Object obj) {
        if ((i & 1) != 0) {
            pdpPrice = shoppingProductDetailsPriceRow.price;
        }
        if ((i & 2) != 0) {
            pdpPrice2 = shoppingProductDetailsPriceRow.originalPrice;
        }
        if ((i & 4) != 0) {
            num = shoppingProductDetailsPriceRow.percentOff;
        }
        if ((i & 8) != 0) {
            shoppingProductDetailsCouponTag = shoppingProductDetailsPriceRow.couponTag;
        }
        C7384Etj.A0Y(pdpPrice, 0);
        return new ShoppingProductDetailsPriceRow(pdpPrice, pdpPrice2, num, shoppingProductDetailsCouponTag);
    }

    public final PdpPrice component1() {
        return this.price;
    }

    public final PdpPrice component2() {
        return this.originalPrice;
    }

    public final Integer component3() {
        return this.percentOff;
    }

    public final ShoppingProductDetailsCouponTag component4() {
        return this.couponTag;
    }

    public final ShoppingProductDetailsCouponTag getCouponTag() {
        return this.couponTag;
    }

    public final PdpPrice getOriginalPrice() {
        return this.originalPrice;
    }

    public final Integer getPercentOff() {
        return this.percentOff;
    }

    public final PdpPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.price) + AnonymousClass006.A0D(this.originalPrice)) * 31) + AnonymousClass006.A0D(this.percentOff)) * 31) + C3cH.A02(this.couponTag);
    }

    public String toString() {
        return super.toString();
    }
}
