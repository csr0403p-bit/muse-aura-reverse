package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
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
public final class PdpVariantPricing extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final PdpPrice currentPrice;
    public final PdpPrice originalPrice;
    public final Integer pricePercentOff;
    public final String productId;

    public final class Companion {
        public final C9hr<PdpVariantPricing> serializer() {
            return PdpVariantPricing$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PdpVariantPricing(String str, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num) {
        C7384Etj.A0Y(str, 0);
        this.productId = str;
        this.currentPrice = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.pricePercentOff = num;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpVariantPricing pdpVariantPricing, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pdpVariantPricing.productId, c9iZ, 0);
        PdpPrice$$serializer pdpPrice$$serializer = PdpPrice$$serializer.INSTANCE;
        c9j5.AAP(pdpVariantPricing.currentPrice, pdpPrice$$serializer, c9iZ, 1);
        c9j5.AAP(pdpVariantPricing.originalPrice, pdpPrice$$serializer, c9iZ, 2);
        c9j5.AAP(pdpVariantPricing.pricePercentOff, C07729ii.A00, c9iZ, 3);
    }

    public final PdpVariantPricing copy(String str, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num) {
        C7384Etj.A0Y(str, 0);
        return new PdpVariantPricing(str, pdpPrice, pdpPrice2, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpVariantPricing) {
                PdpVariantPricing pdpVariantPricing = (PdpVariantPricing) obj;
                if (!C7384Etj.areEqual(this.productId, pdpVariantPricing.productId) || !C7384Etj.areEqual(this.currentPrice, pdpVariantPricing.currentPrice) || !C7384Etj.areEqual(this.originalPrice, pdpVariantPricing.originalPrice) || !C7384Etj.areEqual(this.pricePercentOff, pdpVariantPricing.pricePercentOff)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpVariantPricing copy$default(PdpVariantPricing pdpVariantPricing, String str, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpVariantPricing.productId;
        }
        if ((i & 2) != 0) {
            pdpPrice = pdpVariantPricing.currentPrice;
        }
        if ((i & 4) != 0) {
            pdpPrice2 = pdpVariantPricing.originalPrice;
        }
        if ((i & 8) != 0) {
            num = pdpVariantPricing.pricePercentOff;
        }
        C7384Etj.A0Y(str, 0);
        return new PdpVariantPricing(str, pdpPrice, pdpPrice2, num);
    }

    public final String component1() {
        return this.productId;
    }

    public final PdpPrice component2() {
        return this.currentPrice;
    }

    public final PdpPrice component3() {
        return this.originalPrice;
    }

    public final Integer component4() {
        return this.pricePercentOff;
    }

    public final PdpPrice getCurrentPrice() {
        return this.currentPrice;
    }

    public final PdpPrice getOriginalPrice() {
        return this.originalPrice;
    }

    public final Integer getPricePercentOff() {
        return this.pricePercentOff;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.productId) + AnonymousClass006.A0D(this.currentPrice)) * 31) + AnonymousClass006.A0D(this.originalPrice)) * 31) + C3cH.A02(this.pricePercentOff);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpVariantPricing(int i, String str, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(PdpVariantPricing$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.productId = str;
        this.currentPrice = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.pricePercentOff = num;
    }
}
