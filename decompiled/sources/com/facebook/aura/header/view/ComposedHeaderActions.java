package com.facebook.aura.header.view;

import X.C7384Etj;
import com.facebook.aura.header.api.HeaderAction;
import java.util.List;

/* loaded from: classes.dex */
public final class ComposedHeaderActions {
    public List<HeaderAction> value;

    public ComposedHeaderActions(List<HeaderAction> list) {
        C7384Etj.A0Y(list, 0);
        this.value = list;
    }

    public final void setValue(List<HeaderAction> list) {
        C7384Etj.A0Y(list, 0);
        this.value = list;
    }

    public final List<HeaderAction> getValue() {
        return this.value;
    }
}
