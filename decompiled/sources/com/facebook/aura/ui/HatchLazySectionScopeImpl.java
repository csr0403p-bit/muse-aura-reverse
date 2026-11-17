package com.facebook.aura.ui;

import X.BFM;
import X.C7384Etj;
import X.G0V;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLazySectionScopeImpl implements HatchLazySectionScope {
    public final List<HatchLazySectionItem> items = new ArrayList();

    @Override // com.facebook.aura.ui.HatchLazySectionScope
    public void item(Object obj, Object obj2, G0V<? super BFM, ? super Integer, Unit> g0v) {
        C7384Etj.A0Y(g0v, 2);
        this.items.add(new HatchLazySectionItem(obj, obj2, g0v));
    }

    public final List<HatchLazySectionItem> getItems() {
        return this.items;
    }
}
