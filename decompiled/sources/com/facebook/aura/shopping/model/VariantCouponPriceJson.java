package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VariantCouponPriceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String coupon_code;
    public final CouponMoneyJson coupon_price;
    public final String product_id;

    public final class Companion {
        public final C9hr<VariantCouponPriceJson> serializer() {
            return VariantCouponPriceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(VariantCouponPriceJson variantCouponPriceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || variantCouponPriceJson.product_id != null) {
            c9j5.AAP(variantCouponPriceJson.product_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || variantCouponPriceJson.coupon_price != null) {
            c9j5.AAP(variantCouponPriceJson.coupon_price, CouponMoneyJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || variantCouponPriceJson.coupon_code != null) {
            c9j5.AAP(variantCouponPriceJson.coupon_code, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantCouponPriceJson) {
                VariantCouponPriceJson variantCouponPriceJson = (VariantCouponPriceJson) obj;
                if (!C7384Etj.areEqual(this.product_id, variantCouponPriceJson.product_id) || !C7384Etj.areEqual(this.coupon_price, variantCouponPriceJson.coupon_price) || !C7384Etj.areEqual(this.coupon_code, variantCouponPriceJson.coupon_code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VariantCouponPriceJson copy$default(VariantCouponPriceJson variantCouponPriceJson, String str, CouponMoneyJson couponMoneyJson, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variantCouponPriceJson.product_id;
        }
        if ((i & 2) != 0) {
            couponMoneyJson = variantCouponPriceJson.coupon_price;
        }
        if ((i & 4) != 0) {
            str2 = variantCouponPriceJson.coupon_code;
        }
        return new VariantCouponPriceJson(str, couponMoneyJson, str2);
    }

    public final String component1() {
        return this.product_id;
    }

    public final CouponMoneyJson component2() {
        return this.coupon_price;
    }

    public final String component3() {
        return this.coupon_code;
    }

    public final VariantCouponPriceJson copy(String str, CouponMoneyJson couponMoneyJson, String str2) {
        return new VariantCouponPriceJson(str, couponMoneyJson, str2);
    }

    public final String getCoupon_code() {
        return this.coupon_code;
    }

    public final CouponMoneyJson getCoupon_price() {
        return this.coupon_price;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.product_id) * 31) + AnonymousClass006.A0D(this.coupon_price)) * 31) + AnonymousClass005.A0H(this.coupon_code);
    }

    public VariantCouponPriceJson(String str, CouponMoneyJson couponMoneyJson, String str2) {
        this.product_id = str;
        this.coupon_price = couponMoneyJson;
        this.coupon_code = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VariantCouponPriceJson(int i, String str, CouponMoneyJson couponMoneyJson, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str;
        }
        if ((i & 2) == 0) {
            this.coupon_price = null;
        } else {
            this.coupon_price = couponMoneyJson;
        }
        if ((i & 4) == 0) {
            this.coupon_code = null;
        } else {
            this.coupon_code = str2;
        }
    }

    public /* synthetic */ VariantCouponPriceJson(String str, CouponMoneyJson couponMoneyJson, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : couponMoneyJson, (i & 4) != 0 ? null : str2);
    }

    public VariantCouponPriceJson() {
        this(null, null, null);
    }
}
