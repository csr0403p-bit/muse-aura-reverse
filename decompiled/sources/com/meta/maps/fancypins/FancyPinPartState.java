package com.meta.maps.fancypins;

import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinPartState {
    public final boolean isVisible;
    public final PartLayout layout;

    public FancyPinPartState(PartLayout partLayout, boolean z) {
        C7384Etj.A0Y(partLayout, 0);
        this.layout = partLayout;
        this.isVisible = z;
    }

    public final PartLayout getLayout() {
        return this.layout;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
