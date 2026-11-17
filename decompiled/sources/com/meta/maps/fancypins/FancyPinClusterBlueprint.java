package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.Hr7;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class FancyPinClusterBlueprint {
    public static final Companion Companion = new Companion();
    public final String defaultVariantId;
    public final List<FancyPinFallbackPolicy> fallbackPolicies;
    public final String id;
    public final Set<String> variantIds;
    public final List<FancyPinClusterVariantRetentionPolicy> variantRetentionPolicies;
    public final List<FancyPinClusterVariantSelectionRule> variantSelectionRules;
    public final List<FancyPinVariant> variants;

    /* JADX WARN: Illegal instructions before constructor call */
    public FancyPinClusterBlueprint(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2) {
        AnonymousClass005.A14(str, list, list2, str2);
        C0881AGi c0881AGi = C0881AGi.A00;
        this(str, list, list2, str2, c0881AGi, c0881AGi);
    }

    public static final FancyPinClusterBlueprint fromJson(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return FancyPinBlueprintKt.decodeClusterBlueprint(bArr);
    }

    public final class Companion {
        public final FancyPinClusterBlueprint fromJson(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            return FancyPinBlueprintKt.decodeClusterBlueprint(bArr);
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

    public final List<FancyPinClusterVariantRetentionPolicy> getVariantRetentionPolicies() {
        return this.variantRetentionPolicies;
    }

    public final List<FancyPinClusterVariantSelectionRule> getVariantSelectionRules() {
        return this.variantSelectionRules;
    }

    public final List<FancyPinVariant> getVariants() {
        return this.variants;
    }

    public final byte[] toJson() throws JSONException {
        FancyPinBlueprintKt.validateBlueprintStructure(this.id, this.variants, this.fallbackPolicies, this.defaultVariantId);
        FancyPinBlueprintKt.validateClusterVariantSelectionRules(this.variantSelectionRules, this.variantIds);
        FancyPinBlueprintKt.validateClusterVariantRetentionPolicies(this.variantRetentionPolicies, this.variantIds);
        JSONObject jSONObjectBlueprintToJsonObject = FancyPinBlueprintKt.blueprintToJsonObject(this.id, this.variants, this.fallbackPolicies, this.defaultVariantId);
        if (!this.variantSelectionRules.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<FancyPinClusterVariantSelectionRule> it = this.variantSelectionRules.iterator();
            while (it.hasNext()) {
                jSONArray.put(FancyPinBlueprintKt.toJsonObject(it.next()));
            }
            jSONObjectBlueprintToJsonObject.put("variantSelectionRules", jSONArray);
        }
        if (!this.variantRetentionPolicies.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<FancyPinClusterVariantRetentionPolicy> it2 = this.variantRetentionPolicies.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(FancyPinBlueprintKt.toJsonObject(it2.next()));
            }
            jSONObjectBlueprintToJsonObject.put("variantRetentionPolicies", jSONArray2);
        }
        return C3cG.A1S(C60O.A0o(jSONObjectBlueprintToJsonObject));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinClusterBlueprint(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2, List<FancyPinClusterVariantSelectionRule> list3) {
        this(str, list, list2, str2, list3, C0881AGi.A00);
        AnonymousClass005.A17(str, list, list2, str2, list3);
    }

    public /* synthetic */ FancyPinClusterBlueprint(String str, List list, List list2, String str2, List list3, List list4, int i, C06H c06h) {
        this(str, list, list2, str2, (i & 16) != 0 ? C0881AGi.A00 : list3, (i & 32) != 0 ? C0881AGi.A00 : list4);
    }

    public FancyPinClusterBlueprint(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2, List<FancyPinClusterVariantSelectionRule> list3, List<FancyPinClusterVariantRetentionPolicy> list4) {
        AnonymousClass005.A17(str, list, list2, str2, list3);
        C7384Etj.A0Y(list4, 5);
        this.id = str;
        this.defaultVariantId = str2;
        this.variants = Hr7.A1H(list);
        this.fallbackPolicies = Hr7.A1H(list2);
        this.variantSelectionRules = Hr7.A1H(list3);
        this.variantRetentionPolicies = Hr7.A1H(list4);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<FancyPinVariant> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(it.next().id);
        }
        this.variantIds = Collections.unmodifiableSet(linkedHashSetA0k);
    }
}
