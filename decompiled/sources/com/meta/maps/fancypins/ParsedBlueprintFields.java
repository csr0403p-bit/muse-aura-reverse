package com.meta.maps.fancypins;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class ParsedBlueprintFields {
    public final String defaultVariantId;
    public final List<FancyPinFallbackPolicy> fallbackPolicies;
    public final String id;
    public final List<FancyPinVariant> variants;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParsedBlueprintFields) {
                ParsedBlueprintFields parsedBlueprintFields = (ParsedBlueprintFields) obj;
                if (!C7384Etj.areEqual(this.id, parsedBlueprintFields.id) || !C7384Etj.areEqual(this.variants, parsedBlueprintFields.variants) || !C7384Etj.areEqual(this.fallbackPolicies, parsedBlueprintFields.fallbackPolicies) || !C7384Etj.areEqual(this.defaultVariantId, parsedBlueprintFields.defaultVariantId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParsedBlueprintFields copy$default(ParsedBlueprintFields parsedBlueprintFields, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedBlueprintFields.id;
        }
        if ((i & 2) != 0) {
            list = parsedBlueprintFields.variants;
        }
        if ((i & 4) != 0) {
            list2 = parsedBlueprintFields.fallbackPolicies;
        }
        if ((i & 8) != 0) {
            str2 = parsedBlueprintFields.defaultVariantId;
        }
        return parsedBlueprintFields.copy(str, list, list2, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final List<FancyPinVariant> component2() {
        return this.variants;
    }

    public final List<FancyPinFallbackPolicy> component3() {
        return this.fallbackPolicies;
    }

    public final String component4() {
        return this.defaultVariantId;
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

    public final List<FancyPinVariant> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.defaultVariantId, AnonymousClass005.A0F(this.fallbackPolicies, AnonymousClass005.A0F(this.variants, AnonymousClass001.A0G(this.id))));
    }

    public String toString() {
        String str = this.id;
        List<FancyPinVariant> list = this.variants;
        List<FancyPinFallbackPolicy> list2 = this.fallbackPolicies;
        String str2 = this.defaultVariantId;
        StringBuilder sbA0x = C3cI.A0x("ParsedBlueprintFields(id=", str);
        sbA0x.append(", variants=");
        sbA0x.append(list);
        sbA0x.append(", fallbackPolicies=");
        sbA0x.append(list2);
        return C3cJ.A0N(", defaultVariantId=", str2, sbA0x);
    }

    public ParsedBlueprintFields(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2) {
        AnonymousClass005.A14(str, list, list2, str2);
        this.id = str;
        this.variants = list;
        this.fallbackPolicies = list2;
        this.defaultVariantId = str2;
    }

    public final ParsedBlueprintFields copy(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2) {
        AnonymousClass005.A14(str, list, list2, str2);
        return new ParsedBlueprintFields(str, list, list2, str2);
    }
}
