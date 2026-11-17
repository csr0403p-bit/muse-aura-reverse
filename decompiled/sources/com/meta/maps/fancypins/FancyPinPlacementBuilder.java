package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.C3cG;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinPlacementBuilder {
    public final List<FancyPinPlacement> placements = C3cG.A0h();

    public final void placement(FancyPinPlacement fancyPinPlacement) {
        C7384Etj.A0Y(fancyPinPlacement, 0);
        this.placements.add(fancyPinPlacement);
    }

    public final List<FancyPinPlacement> build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return AbstractC0878AGe.A0X(this.placements);
    }
}
