package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FancyPinVariantBuilder {
    public final String id;
    public final List<FancyPinPart> parts;

    public FancyPinVariantBuilder(String str) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.parts = C3cG.A0h();
    }

    public final FancyPinVariant build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return new FancyPinVariant(this.id, this.parts);
    }

    public final void part(String str, LayoutSize layoutSize, G0U<? super FancyPinPartBuilder, Unit> g0u) {
        AnonymousClass005.A0x(str, layoutSize, g0u);
        List<FancyPinPart> list = this.parts;
        FancyPinPartBuilder fancyPinPartBuilder = new FancyPinPartBuilder(str, layoutSize);
        g0u.invoke(fancyPinPartBuilder);
        list.add(fancyPinPartBuilder.build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin());
    }
}
