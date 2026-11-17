package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.Hr7;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FancyPinBlueprint {
    public static final Companion Companion = new Companion();
    public final String defaultVariantId;
    public final List<FancyPinFallbackPolicy> fallbackPolicies;
    public final String id;
    public final Set<String> variantIds;
    public final List<FancyPinVariant> variants;

    public static final FancyPinBlueprint fromJson(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return FancyPinBlueprintKt.decodeSourceBlueprint(bArr);
    }

    public final class Companion {
        public final FancyPinBlueprint fromJson(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            return FancyPinBlueprintKt.decodeSourceBlueprint(bArr);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final String getDefaultVariantId() {
        return this.defaultVariantId;
    }

    public final List<FancyPinFallbackPolicy> getFallbackPolicies() {
        return this.fallbackPolicies;
    }

    public final String getId() {
        return this.id;
    }

    public final Set<String> getVariantIds() {
        return this.variantIds;
    }

    public final List<FancyPinVariant> getVariants() {
        return this.variants;
    }

    public final byte[] toJson() {
        FancyPinBlueprintKt.validateBlueprintStructure(this.id, this.variants, this.fallbackPolicies, this.defaultVariantId);
        return C3cG.A1S(C60O.A0o(FancyPinBlueprintKt.blueprintToJsonObject(this.id, this.variants, this.fallbackPolicies, this.defaultVariantId)));
    }

    public FancyPinBlueprint(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2) {
        AnonymousClass005.A14(str, list, list2, str2);
        this.id = str;
        this.defaultVariantId = str2;
        this.variants = Hr7.A1H(list);
        this.fallbackPolicies = Hr7.A1H(list2);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<FancyPinVariant> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(it.next().id);
        }
        this.variantIds = Collections.unmodifiableSet(linkedHashSetA0k);
    }
}
