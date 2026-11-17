package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C8j5;
import X.HwV;
import X.HxE;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ShoppingRailModels {
    public HwV<? extends List<ShoppingResultProduct>, ShoppingCouponPrices, Locale> relatedKey;
    public AHD<ShoppingResultProductUiModel> relatedValue;
    public HxE<? extends List<ShoppingResultProduct>, Locale> sellerKey;
    public AHD<ShoppingResultProductUiModel> sellerValue;

    public final AHD<ShoppingResultProductUiModel> seller(List<ShoppingResultProduct> list) {
        C7384Etj.A0Y(list, 0);
        HxE<? extends List<ShoppingResultProduct>, Locale> hxEA0r = C3cG.A0r(list, Locale.getDefault());
        if (!C7384Etj.areEqual(this.sellerKey, hxEA0r)) {
            this.sellerKey = hxEA0r;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<ShoppingResultProduct> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(ShoppingProductDisplayKt.toUiModel(it.next(), null, null, C60Q.A0w()));
            }
            this.sellerValue = AGI.A07(arrayListA0i);
        }
        return this.sellerValue;
    }

    public ShoppingRailModels() {
        AHI ahi = AHI.A01;
        this.relatedValue = ahi;
        this.sellerValue = ahi;
    }

    public final AHD<ShoppingResultProductUiModel> related(List<ShoppingResultProduct> list, ShoppingCouponPrices shoppingCouponPrices) {
        AnonymousClass003.A0u(list, shoppingCouponPrices);
        HwV<? extends List<ShoppingResultProduct>, ShoppingCouponPrices, Locale> hwV = new HwV<>(list, shoppingCouponPrices, Locale.getDefault());
        if (!C7384Etj.areEqual(this.relatedKey, hwV)) {
            this.relatedKey = hwV;
            double dA00 = C8j5.A00();
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (ShoppingResultProduct shoppingResultProduct : list) {
                arrayListA0i.add(ShoppingProductDisplayKt.toUiModel(shoppingResultProduct, shoppingCouponPrices.liveFor(shoppingResultProduct, dA00), null, C60Q.A0w()));
            }
            this.relatedValue = AGI.A07(arrayListA0i);
        }
        return this.relatedValue;
    }
}
