package com.facebook.aura.productactions.api;

import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.tryon.TryOnMediaActionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class ProductMediaActions {
    public static final int $stable = 0;
    public static final ProductMediaActions INSTANCE = new ProductMediaActions();

    public final List<ProductMediaAction> all() {
        ArrayList arrayListA11 = C60O.A11(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayListA11.add(TryOnMediaActionProvider.INSTANCE.action());
        return arrayListA11;
    }

    public final List<ProductMediaAction> withIds(Collection<String> collection) {
        C7384Etj.A0Y(collection, 0);
        List<ProductMediaAction> listAll = all();
        ArrayList arrayListA0h = C3cG.A0h();
        for (ProductMediaAction productMediaAction : listAll) {
            if (collection.contains(productMediaAction.getId())) {
                arrayListA0h.add(productMediaAction);
            }
        }
        return arrayListA0h;
    }
}
