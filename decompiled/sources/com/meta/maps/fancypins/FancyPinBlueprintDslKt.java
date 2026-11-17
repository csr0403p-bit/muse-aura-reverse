package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract class FancyPinBlueprintDslKt {
    public static final FancyPinBlueprint fancyPinBlueprint(String str, String str2, G0U<? super FancyPinBlueprintBuilder, Unit> g0u) {
        AnonymousClass005.A0x(str, str2, g0u);
        FancyPinBlueprintBuilder fancyPinBlueprintBuilder = new FancyPinBlueprintBuilder(str, str2);
        g0u.invoke(fancyPinBlueprintBuilder);
        return fancyPinBlueprintBuilder.build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
    }

    public static final FancyPinClusterBlueprint fancyPinClusterBlueprint(String str, String str2, G0U<? super FancyPinClusterBlueprintBuilder, Unit> g0u) {
        AnonymousClass005.A0x(str, str2, g0u);
        FancyPinClusterBlueprintBuilder fancyPinClusterBlueprintBuilder = new FancyPinClusterBlueprintBuilder(str, str2);
        g0u.invoke(fancyPinClusterBlueprintBuilder);
        return fancyPinClusterBlueprintBuilder.build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
    }
}
