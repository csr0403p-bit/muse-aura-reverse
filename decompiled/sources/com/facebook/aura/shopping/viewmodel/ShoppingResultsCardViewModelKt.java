package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C3cG;
import X.C8j4;
import X.C8j5;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.repo.HatchProductDetailsHydrationKt;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ShoppingResultsCardViewModelKt {
    public static final long STOP_TIMEOUT_MS = 5000;

    public static final ShoppingResultsCardDisplayState displayState(ShoppingResultsCardInputs shoppingResultsCardInputs, ShoppingCouponPrices shoppingCouponPrices) {
        int i;
        double dA00 = C8j5.A00();
        List<ShoppingResultProduct> listA0a = AbstractC0878AGe.A0a(shoppingResultsCardInputs.products, shoppingResultsCardInputs.maxVisible);
        AHD ahdA07 = AGI.A07(shoppingResultsCardInputs.products);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0a);
        for (ShoppingResultProduct shoppingResultProduct : listA0a) {
            arrayListA0i.add(ShoppingProductDisplayKt.toUiModel(shoppingResultProduct, shoppingCouponPrices.liveFor(shoppingResultProduct, dA00), shoppingResultsCardInputs.attribution, shoppingResultsCardInputs.locale));
        }
        AHD ahdA072 = AGI.A07(arrayListA0i);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0a.iterator();
        while (it.hasNext()) {
            ProductDetailsHydrationTarget prefetchTarget = HatchProductDetailsHydrationKt.getPrefetchTarget((ShoppingResultProduct) it.next());
            if (prefetchTarget != null) {
                arrayListA0h.add(prefetchTarget);
            }
        }
        AHD ahdA073 = AGI.A07(arrayListA0h);
        boolean zA1V = C8j4.A1V(shoppingResultsCardInputs.products.size(), shoppingResultsCardInputs.maxVisible);
        if ((listA0a instanceof Collection) && listA0a.isEmpty()) {
            i = 2;
        } else {
            Iterator it2 = listA0a.iterator();
            while (it2.hasNext()) {
                if (((ShoppingResultProduct) it2.next()).highlightedAttribute != null) {
                    i = 1;
                    break;
                }
            }
            i = 2;
        }
        return new ShoppingResultsCardDisplayState(ahdA072, ahdA07, ahdA073, zA1V, i);
    }
}
