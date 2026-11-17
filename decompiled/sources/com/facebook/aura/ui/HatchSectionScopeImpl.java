package com.facebook.aura.ui;

import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0W;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSectionScopeImpl implements HatchSectionScope {
    public static final int $stable = 8;
    public final List<G0W<C07C, BFM, Integer, Unit>> items = new ArrayList();

    @Override // com.facebook.aura.ui.HatchSectionScope
    public void item(G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
        C7384Etj.A0Y(g0w, 0);
        this.items.add(g0w);
    }

    public final List<G0W<C07C, BFM, Integer, Unit>> getItems$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return this.items;
    }
}
