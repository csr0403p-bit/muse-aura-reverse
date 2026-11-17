package com.facebook.aura.shopping.model;

import X.AbK;
import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.C2273BRq;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ShoppingMerchantRanking {
    public static final int $stable = 0;
    public final Map<String, Integer> positions;

    public ShoppingMerchantRanking(List<ShoppingResultProduct> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ShoppingResultProduct> it = list.iterator();
        while (it.hasNext()) {
            String strShoppingDomainOf = ShoppingMerchantKt.shoppingDomainOf(it.next().url);
            if (strShoppingDomainOf != null) {
                arrayListA0h.add(strShoppingDomainOf);
            }
        }
        AbK abKA0h = AbstractC0878AGe.A0h(C3cG.A0m(arrayListA0h));
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(abKA0h));
        Iterator it2 = abKA0h.iterator();
        while (it2.hasNext()) {
            C2273BRq c2273BRq = (C2273BRq) it2.next();
            C8j4.A1O(c2273BRq.A01, linkedHashMapA15, c2273BRq.A00 + 1);
        }
        this.positions = linkedHashMapA15;
    }

    public final Integer positionOf(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String strShoppingDomainOf = ShoppingMerchantKt.shoppingDomainOf(shoppingResultProduct.url);
        if (strShoppingDomainOf != null) {
            return this.positions.get(strShoppingDomainOf);
        }
        return null;
    }

    public final int getMerchantCount() {
        return this.positions.size();
    }
}
