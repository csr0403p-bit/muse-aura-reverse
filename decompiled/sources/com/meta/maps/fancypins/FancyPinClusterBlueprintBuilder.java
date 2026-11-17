package com.meta.maps.fancypins;

import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FancyPinClusterBlueprintBuilder {
    public final String defaultVariantId;
    public final List<FancyPinFallbackPolicy> fallbackPolicies;
    public final String id;
    public final List<FancyPinClusterVariantRetentionPolicy> variantRetentionPolicies;
    public final List<FancyPinClusterVariantSelectionRule> variantSelectionRules;
    public final List<FancyPinVariant> variants;

    /* renamed from: com.meta.maps.fancypins.FancyPinClusterBlueprintBuilder$retainedWhileActive$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<FancyPinClusterVariantRetentionPolicy, Boolean> {
        public final /* synthetic */ String $variantId;

        @Override // X.G0U
        public final Boolean invoke(FancyPinClusterVariantRetentionPolicy fancyPinClusterVariantRetentionPolicy) {
            C7384Etj.A0Y(fancyPinClusterVariantRetentionPolicy, 0);
            return Boolean.valueOf(C7384Etj.areEqual(fancyPinClusterVariantRetentionPolicy.variantId, this.$variantId));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$variantId = str;
        }
    }

    public final void memberCountVariant(String str, long j) {
        C7384Etj.A0Y(str, 0);
        memberCountVariant(str, j, null);
    }

    public final void retainedWhileActive(String str) {
        C7384Etj.A0Y(str, 0);
        retainedWhileActive(str, FancyPinClusterRetentionScope.PRESENTATION);
    }

    public static /* synthetic */ void memberCountVariant$default(FancyPinClusterBlueprintBuilder fancyPinClusterBlueprintBuilder, String str, long j, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        fancyPinClusterBlueprintBuilder.memberCountVariant(str, j, l);
    }

    public static /* synthetic */ void retainedWhileActive$default(FancyPinClusterBlueprintBuilder fancyPinClusterBlueprintBuilder, String str, FancyPinClusterRetentionScope fancyPinClusterRetentionScope, int i, Object obj) {
        if ((i & 2) != 0) {
            fancyPinClusterRetentionScope = FancyPinClusterRetentionScope.PRESENTATION;
        }
        fancyPinClusterBlueprintBuilder.retainedWhileActive(str, fancyPinClusterRetentionScope);
    }

    public final FancyPinClusterBlueprint build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return new FancyPinClusterBlueprint(this.id, this.variants, this.fallbackPolicies, this.defaultVariantId, this.variantSelectionRules, this.variantRetentionPolicies);
    }

    public FancyPinClusterBlueprintBuilder(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.defaultVariantId = str2;
        this.variants = C3cG.A0h();
        this.fallbackPolicies = C3cG.A0h();
        this.variantSelectionRules = C3cG.A0h();
        this.variantRetentionPolicies = C3cG.A0h();
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

    public final void memberCountVariant(String str, long j, Long l) {
        C7384Etj.A0Y(str, 0);
        this.variantSelectionRules.add(new FancyPinClusterVariantSelectionRule(str, j, l));
    }

    public final void retainedWhileActive(String str, FancyPinClusterRetentionScope fancyPinClusterRetentionScope) {
        AnonymousClass003.A0u(str, fancyPinClusterRetentionScope);
        AbstractC0882AGj.A0v(this.variantRetentionPolicies, new AnonymousClass1(str));
        this.variantRetentionPolicies.add(new FancyPinClusterVariantRetentionPolicy(str, fancyPinClusterRetentionScope));
    }
}
