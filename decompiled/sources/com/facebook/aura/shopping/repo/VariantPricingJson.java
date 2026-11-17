package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.PdpVariantPricing;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VariantPricingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final PriceJson current_price;
    public final PriceJson original_price;
    public final Integer percent_off;
    public final String product_id;

    public final class Companion {
        public final C9hr<VariantPricingJson> serializer() {
            return VariantPricingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VariantPricingJson() {
        this("", null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(VariantPricingJson variantPricingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(variantPricingJson.product_id)) {
            c9j5.AAV(variantPricingJson.product_id, c9iZ, 0);
        }
        if (zAfR || variantPricingJson.current_price != null) {
            c9j5.AAP(variantPricingJson.current_price, PriceJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || variantPricingJson.original_price != null) {
            c9j5.AAP(variantPricingJson.original_price, PriceJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || variantPricingJson.percent_off != null) {
            c9j5.AAP(variantPricingJson.percent_off, C07729ii.A00, c9iZ, 3);
        }
    }

    public final VariantPricingJson copy(String str, PriceJson priceJson, PriceJson priceJson2, Integer num) {
        C7384Etj.A0Y(str, 0);
        return new VariantPricingJson(str, priceJson, priceJson2, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantPricingJson) {
                VariantPricingJson variantPricingJson = (VariantPricingJson) obj;
                if (!C7384Etj.areEqual(this.product_id, variantPricingJson.product_id) || !C7384Etj.areEqual(this.current_price, variantPricingJson.current_price) || !C7384Etj.areEqual(this.original_price, variantPricingJson.original_price) || !C7384Etj.areEqual(this.percent_off, variantPricingJson.percent_off)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VariantPricingJson copy$default(VariantPricingJson variantPricingJson, String str, PriceJson priceJson, PriceJson priceJson2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variantPricingJson.product_id;
        }
        if ((i & 2) != 0) {
            priceJson = variantPricingJson.current_price;
        }
        if ((i & 4) != 0) {
            priceJson2 = variantPricingJson.original_price;
        }
        if ((i & 8) != 0) {
            num = variantPricingJson.percent_off;
        }
        C7384Etj.A0Y(str, 0);
        return new VariantPricingJson(str, priceJson, priceJson2, num);
    }

    public final String component1() {
        return this.product_id;
    }

    public final PriceJson component2() {
        return this.current_price;
    }

    public final PriceJson component3() {
        return this.original_price;
    }

    public final Integer component4() {
        return this.percent_off;
    }

    public final PriceJson getCurrent_price() {
        return this.current_price;
    }

    public final PriceJson getOriginal_price() {
        return this.original_price;
    }

    public final Integer getPercent_off() {
        return this.percent_off;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.product_id) + AnonymousClass006.A0D(this.current_price)) * 31) + AnonymousClass006.A0D(this.original_price)) * 31) + C3cH.A02(this.percent_off);
    }

    public final PdpVariantPricing toDomain() {
        String str = this.product_id;
        PriceJson priceJson = this.current_price;
        PdpPrice pdpPrice = priceJson != null ? priceJson.toPdpPrice() : null;
        PriceJson priceJson2 = this.original_price;
        return new PdpVariantPricing(str, pdpPrice, priceJson2 != null ? priceJson2.toPdpPrice() : null, this.percent_off);
    }

    public String toString() {
        return super.toString();
    }

    public VariantPricingJson(String str, PriceJson priceJson, PriceJson priceJson2, Integer num) {
        C7384Etj.A0Y(str, 0);
        this.product_id = str;
        this.current_price = priceJson;
        this.original_price = priceJson2;
        this.percent_off = num;
    }

    public /* synthetic */ VariantPricingJson(String str, PriceJson priceJson, PriceJson priceJson2, Integer num, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : priceJson, (i & 4) != 0 ? null : priceJson2, (i & 8) != 0 ? null : num);
    }

    public /* synthetic */ VariantPricingJson(int i, String str, PriceJson priceJson, PriceJson priceJson2, Integer num, C2hx c2hx) {
        this.product_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.current_price = null;
        } else {
            this.current_price = priceJson;
        }
        if ((i & 4) == 0) {
            this.original_price = null;
        } else {
            this.original_price = priceJson2;
        }
        if ((i & 8) == 0) {
            this.percent_off = null;
        } else {
            this.percent_off = num;
        }
    }
}
