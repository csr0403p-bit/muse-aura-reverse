package com.facebook.aura.shopping.model;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07799it;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpCouponPrice extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final double expiresAt;
    public final PdpPrice originalPrice;
    public final Double percentOff;
    public final PdpPrice price;
    public final PdpPrice savings;

    public final class Companion {
        public final C9hr<PdpCouponPrice> serializer() {
            return PdpCouponPrice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpCouponPrice) {
                PdpCouponPrice pdpCouponPrice = (PdpCouponPrice) obj;
                if (!C7384Etj.areEqual(this.price, pdpCouponPrice.price) || !C7384Etj.areEqual(this.originalPrice, pdpCouponPrice.originalPrice) || Double.compare(this.expiresAt, pdpCouponPrice.expiresAt) != 0 || !C7384Etj.areEqual(this.percentOff, pdpCouponPrice.percentOff) || !C7384Etj.areEqual(this.savings, pdpCouponPrice.savings)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PdpCouponPrice(int i, PdpPrice pdpPrice, PdpPrice pdpPrice2, double d, Double d2, PdpPrice pdpPrice3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PdpCouponPrice$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.price = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.expiresAt = d;
        if ((i & 8) == 0) {
            this.percentOff = null;
        } else {
            this.percentOff = d2;
        }
        if ((i & 16) == 0) {
            this.savings = null;
        } else {
            this.savings = pdpPrice3;
        }
    }

    public static /* synthetic */ PdpCouponPrice copy$default(PdpCouponPrice pdpCouponPrice, PdpPrice pdpPrice, PdpPrice pdpPrice2, double d, Double d2, PdpPrice pdpPrice3, int i, Object obj) {
        if ((i & 1) != 0) {
            pdpPrice = pdpCouponPrice.price;
        }
        if ((i & 2) != 0) {
            pdpPrice2 = pdpCouponPrice.originalPrice;
        }
        if ((i & 4) != 0) {
            d = pdpCouponPrice.expiresAt;
        }
        if ((i & 8) != 0) {
            d2 = pdpCouponPrice.percentOff;
        }
        if ((i & 16) != 0) {
            pdpPrice3 = pdpCouponPrice.savings;
        }
        return pdpCouponPrice.copy(pdpPrice, pdpPrice2, d, d2, pdpPrice3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpCouponPrice pdpCouponPrice, C9j5 c9j5, C9iZ c9iZ) {
        PdpPrice$$serializer pdpPrice$$serializer = PdpPrice$$serializer.INSTANCE;
        c9j5.AAQ(pdpCouponPrice.price, pdpPrice$$serializer, c9iZ, 0);
        c9j5.AAQ(pdpCouponPrice.originalPrice, pdpPrice$$serializer, c9iZ, 1);
        c9j5.AAD(c9iZ, pdpCouponPrice.expiresAt, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || pdpCouponPrice.percentOff != null) {
            c9j5.AAP(pdpCouponPrice.percentOff, C07799it.A00, c9iZ, 3);
        }
        if (zAfR || pdpCouponPrice.savings != null) {
            c9j5.AAP(pdpCouponPrice.savings, pdpPrice$$serializer, c9iZ, 4);
        }
    }

    public final PdpPrice component1() {
        return this.price;
    }

    public final PdpPrice component2() {
        return this.originalPrice;
    }

    public final double component3() {
        return this.expiresAt;
    }

    public final Double component4() {
        return this.percentOff;
    }

    public final PdpPrice component5() {
        return this.savings;
    }

    public final double getExpiresAt() {
        return this.expiresAt;
    }

    public final PdpPrice getOriginalPrice() {
        return this.originalPrice;
    }

    public final Double getPercentOff() {
        return this.percentOff;
    }

    public final PdpPrice getPrice() {
        return this.price;
    }

    public final PdpPrice getSavings() {
        return this.savings;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.originalPrice, AnonymousClass005.A0E(this.price)) + AnonymousClass002.A0A(Double.doubleToLongBits(this.expiresAt))) * 31) + AnonymousClass006.A0D(this.percentOff)) * 31) + C3cH.A02(this.savings);
    }

    public final PdpCouponPrice copy(PdpPrice pdpPrice, PdpPrice pdpPrice2, double d, Double d2, PdpPrice pdpPrice3) {
        AnonymousClass003.A0u(pdpPrice, pdpPrice2);
        return new PdpCouponPrice(pdpPrice, pdpPrice2, d, d2, pdpPrice3);
    }

    public String toString() {
        return super.toString();
    }

    public PdpCouponPrice(PdpPrice pdpPrice, PdpPrice pdpPrice2, double d, Double d2, PdpPrice pdpPrice3) {
        AnonymousClass003.A0u(pdpPrice, pdpPrice2);
        this.price = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.expiresAt = d;
        this.percentOff = d2;
        this.savings = pdpPrice3;
    }

    public /* synthetic */ PdpCouponPrice(PdpPrice pdpPrice, PdpPrice pdpPrice2, double d, Double d2, PdpPrice pdpPrice3, int i, C06H c06h) {
        this(pdpPrice, pdpPrice2, d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : pdpPrice3);
    }
}
