package com.facebook.aura.shopping.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpCouponJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String coupon_code;
    public final Double expires_at;
    public final Double offer_expires_at;
    public final CouponMoneyJson original_price;
    public final Double percent_off;
    public final CouponMoneyJson price;
    public final String product_id;
    public final CouponMoneyJson savings;

    public final class Companion {
        public final C9hr<PdpCouponJson> serializer() {
            return PdpCouponJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PdpCouponJson copy$default(PdpCouponJson pdpCouponJson, String str, CouponMoneyJson couponMoneyJson, CouponMoneyJson couponMoneyJson2, CouponMoneyJson couponMoneyJson3, Double d, String str2, Double d2, Double d3, int i, Object obj) {
        String str3 = str;
        CouponMoneyJson couponMoneyJson4 = couponMoneyJson;
        CouponMoneyJson couponMoneyJson5 = couponMoneyJson2;
        CouponMoneyJson couponMoneyJson6 = couponMoneyJson3;
        Double d4 = d;
        String str4 = str2;
        Double d5 = d2;
        Double d6 = d3;
        if ((i & 1) != 0) {
            str3 = pdpCouponJson.product_id;
        }
        if ((i & 2) != 0) {
            couponMoneyJson4 = pdpCouponJson.price;
        }
        if ((i & 4) != 0) {
            couponMoneyJson5 = pdpCouponJson.original_price;
        }
        if ((i & 8) != 0) {
            couponMoneyJson6 = pdpCouponJson.savings;
        }
        if ((i & 16) != 0) {
            d4 = pdpCouponJson.percent_off;
        }
        if ((i & 32) != 0) {
            str4 = pdpCouponJson.coupon_code;
        }
        if ((i & 64) != 0) {
            d5 = pdpCouponJson.expires_at;
        }
        if ((i & 128) != 0) {
            d6 = pdpCouponJson.offer_expires_at;
        }
        return new PdpCouponJson(str3, couponMoneyJson4, couponMoneyJson5, couponMoneyJson6, d4, str4, d5, d6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpCouponJson pdpCouponJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || pdpCouponJson.product_id != null) {
            c9j5.AAP(pdpCouponJson.product_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || pdpCouponJson.price != null) {
            c9j5.AAP(pdpCouponJson.price, CouponMoneyJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || pdpCouponJson.original_price != null) {
            c9j5.AAP(pdpCouponJson.original_price, CouponMoneyJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || pdpCouponJson.savings != null) {
            c9j5.AAP(pdpCouponJson.savings, CouponMoneyJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || pdpCouponJson.percent_off != null) {
            c9j5.AAP(pdpCouponJson.percent_off, C07799it.A00, c9iZ, 4);
        }
        if (zAfR || pdpCouponJson.coupon_code != null) {
            c9j5.AAP(pdpCouponJson.coupon_code, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || pdpCouponJson.expires_at != null) {
            c9j5.AAP(pdpCouponJson.expires_at, C07799it.A00, c9iZ, 6);
        }
        if (zAfR || pdpCouponJson.offer_expires_at != null) {
            c9j5.AAP(pdpCouponJson.offer_expires_at, C07799it.A00, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpCouponJson) {
                PdpCouponJson pdpCouponJson = (PdpCouponJson) obj;
                if (!C7384Etj.areEqual(this.product_id, pdpCouponJson.product_id) || !C7384Etj.areEqual(this.price, pdpCouponJson.price) || !C7384Etj.areEqual(this.original_price, pdpCouponJson.original_price) || !C7384Etj.areEqual(this.savings, pdpCouponJson.savings) || !C7384Etj.areEqual(this.percent_off, pdpCouponJson.percent_off) || !C7384Etj.areEqual(this.coupon_code, pdpCouponJson.coupon_code) || !C7384Etj.areEqual(this.expires_at, pdpCouponJson.expires_at) || !C7384Etj.areEqual(this.offer_expires_at, pdpCouponJson.offer_expires_at)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.product_id;
    }

    public final CouponMoneyJson component2() {
        return this.price;
    }

    public final CouponMoneyJson component3() {
        return this.original_price;
    }

    public final CouponMoneyJson component4() {
        return this.savings;
    }

    public final Double component5() {
        return this.percent_off;
    }

    public final String component6() {
        return this.coupon_code;
    }

    public final Double component7() {
        return this.expires_at;
    }

    public final Double component8() {
        return this.offer_expires_at;
    }

    public final PdpCouponJson copy(String str, CouponMoneyJson couponMoneyJson, CouponMoneyJson couponMoneyJson2, CouponMoneyJson couponMoneyJson3, Double d, String str2, Double d2, Double d3) {
        return new PdpCouponJson(str, couponMoneyJson, couponMoneyJson2, couponMoneyJson3, d, str2, d2, d3);
    }

    public final Double deadline(double d) {
        Double d2 = this.expires_at;
        if (d2 != null) {
            double dDoubleValue = d2.doubleValue();
            Double d3 = this.offer_expires_at;
            double dMin = Math.min(dDoubleValue, d3 != null ? d3.doubleValue() : dDoubleValue);
            Double dValueOf = Double.valueOf(dMin);
            if (dMin > d) {
                return dValueOf;
            }
        }
        return null;
    }

    public final String getCoupon_code() {
        return this.coupon_code;
    }

    public final Double getExpires_at() {
        return this.expires_at;
    }

    public final Double getOffer_expires_at() {
        return this.offer_expires_at;
    }

    public final CouponMoneyJson getOriginal_price() {
        return this.original_price;
    }

    public final Double getPercent_off() {
        return this.percent_off;
    }

    public final CouponMoneyJson getPrice() {
        return this.price;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final CouponMoneyJson getSavings() {
        return this.savings;
    }

    public int hashCode() {
        return (((((((((((((AnonymousClass006.A0G(this.product_id) * 31) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0D(this.original_price)) * 31) + AnonymousClass006.A0D(this.savings)) * 31) + AnonymousClass006.A0D(this.percent_off)) * 31) + AnonymousClass006.A0G(this.coupon_code)) * 31) + AnonymousClass006.A0D(this.expires_at)) * 31) + C3cH.A02(this.offer_expires_at);
    }

    public PdpCouponJson(String str, CouponMoneyJson couponMoneyJson, CouponMoneyJson couponMoneyJson2, CouponMoneyJson couponMoneyJson3, Double d, String str2, Double d2, Double d3) {
        this.product_id = str;
        this.price = couponMoneyJson;
        this.original_price = couponMoneyJson2;
        this.savings = couponMoneyJson3;
        this.percent_off = d;
        this.coupon_code = str2;
        this.expires_at = d2;
        this.offer_expires_at = d3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpCouponJson(String str, CouponMoneyJson couponMoneyJson, CouponMoneyJson couponMoneyJson2, CouponMoneyJson couponMoneyJson3, Double d, String str2, Double d2, Double d3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : couponMoneyJson, (i & 4) != 0 ? null : couponMoneyJson2, (i & 8) != 0 ? null : couponMoneyJson3, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : d3);
    }

    public /* synthetic */ PdpCouponJson(int i, String str, CouponMoneyJson couponMoneyJson, CouponMoneyJson couponMoneyJson2, CouponMoneyJson couponMoneyJson3, Double d, String str2, Double d2, Double d3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str;
        }
        if ((i & 2) == 0) {
            this.price = null;
        } else {
            this.price = couponMoneyJson;
        }
        if ((i & 4) == 0) {
            this.original_price = null;
        } else {
            this.original_price = couponMoneyJson2;
        }
        if ((i & 8) == 0) {
            this.savings = null;
        } else {
            this.savings = couponMoneyJson3;
        }
        if ((i & 16) == 0) {
            this.percent_off = null;
        } else {
            this.percent_off = d;
        }
        if ((i & 32) == 0) {
            this.coupon_code = null;
        } else {
            this.coupon_code = str2;
        }
        if ((i & 64) == 0) {
            this.expires_at = null;
        } else {
            this.expires_at = d2;
        }
        if ((i & 128) == 0) {
            this.offer_expires_at = null;
        } else {
            this.offer_expires_at = d3;
        }
    }

    public PdpCouponJson() {
        this(null, null, null, null, null, null, null, null);
    }
}
