package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.shopping.model.PdpPrice;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ProductDetailsResponseJson$couponPrices$variantRows$1 extends AbstractC7559F3s implements G0U<String, PdpPrice> {
    public final /* synthetic */ ProductDetailsResponseJson this$0;

    @Override // X.G0U
    public final PdpPrice invoke(String str) {
        VariantPricingJson next;
        PriceJson priceJson;
        C7384Etj.A0Y(str, 0);
        Iterator<VariantPricingJson> it = this.this$0.product.variant_pricing.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.product_id)) {
                break;
            }
        }
        VariantPricingJson variantPricingJson = next;
        if (variantPricingJson == null || (priceJson = variantPricingJson.current_price) == null || priceJson.amount <= 0) {
            return null;
        }
        return priceJson.toPdpPrice();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsResponseJson$couponPrices$variantRows$1(ProductDetailsResponseJson productDetailsResponseJson) {
        super(1);
        this.this$0 = productDetailsResponseJson;
    }
}
