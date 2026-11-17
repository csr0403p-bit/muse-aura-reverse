package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.C3cG;
import X.G0U;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FancyPinBlueprintBuilder {
    public final String defaultVariantId;
    public final List<FancyPinFallbackPolicy> fallbackPolicies;
    public final String id;
    public final List<FancyPinVariant> variants;

    public final FancyPinBlueprint build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return new FancyPinBlueprint(this.id, this.variants, this.fallbackPolicies, this.defaultVariantId);
    }

    public FancyPinBlueprintBuilder(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.defaultVariantId = str2;
        this.variants = C3cG.A0h();
        this.fallbackPolicies = C3cG.A0h();
    }

    public final void fallback(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        this.fallbackPolicies.add(new FancyPinFallbackPolicy(str, list));
    }

    public final void variant(String str, G0U<? super FancyPinVariantBuilder, Unit> g0u) {
        AnonymousClass003.A0u(str, g0u);
        List<FancyPinVariant> list = this.variants;
        FancyPinVariantBuilder fancyPinVariantBuilder = new FancyPinVariantBuilder(str);
        g0u.invoke(fancyPinVariantBuilder);
        list.add(fancyPinVariantBuilder.build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin());
    }
}
