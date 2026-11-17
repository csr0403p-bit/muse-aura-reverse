package com.facebook.aura.shopping.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class VariantOptionJson extends C06G {
    public final boolean is_available;
    public final String label;
    public final List<String> product_ids;
    public final JsonElement swatch_hex;
    public final String value;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, VariantOptionJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<VariantOptionJson> serializer() {
            return VariantOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantOptionJson) {
                VariantOptionJson variantOptionJson = (VariantOptionJson) obj;
                if (!C7384Etj.areEqual(this.label, variantOptionJson.label) || !C7384Etj.areEqual(this.value, variantOptionJson.value) || this.is_available != variantOptionJson.is_available || !C7384Etj.areEqual(this.product_ids, variantOptionJson.product_ids) || !C7384Etj.areEqual(this.swatch_hex, variantOptionJson.swatch_hex)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[PHI: r0
  0x0016: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v8 java.lang.String) binds: [B:3:0x000b, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.shopping.model.PdpVariantOption toDomain(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            r6 = r8
            X.C7384Etj.A0Y(r8, r0)
            java.lang.String r0 = r7.label
            java.lang.String r0 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = r7.value
            java.lang.String r0 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            r2 = r8
            if (r0 == 0) goto L17
        L16:
            r2 = r0
        L17:
            java.lang.String r3 = r7.value
            boolean r4 = r7.is_available
            java.util.List<java.lang.String> r5 = r7.product_ids
            kotlinx.serialization.json.JsonElement r1 = r7.swatch_hex
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            r7 = 0
            if (r0 == 0) goto L38
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            if (r1 == 0) goto L38
            boolean r0 = r1.A01()
            if (r0 == 0) goto L38
            java.lang.String r0 = r1.A00()
            if (r0 == 0) goto L38
            java.lang.Integer r7 = com.facebook.aura.shopping.repo.HatchProductDetailsJsonKt.parseSwatchRgb(r0)
        L38:
            com.facebook.aura.shopping.model.PdpVariantOption r1 = new com.facebook.aura.shopping.model.PdpVariantOption
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.VariantOptionJson.toDomain(java.lang.String):com.facebook.aura.shopping.model.PdpVariantOption");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VariantOptionJson copy$default(VariantOptionJson variantOptionJson, String str, String str2, boolean z, List list, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variantOptionJson.label;
        }
        if ((i & 2) != 0) {
            str2 = variantOptionJson.value;
        }
        if ((i & 4) != 0) {
            z = variantOptionJson.is_available;
        }
        if ((i & 8) != 0) {
            list = variantOptionJson.product_ids;
        }
        if ((i & 16) != 0) {
            jsonElement = variantOptionJson.swatch_hex;
        }
        return variantOptionJson.copy(str, str2, z, list, jsonElement);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(VariantOptionJson variantOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(variantOptionJson.label)) {
            c9j5.AAV(variantOptionJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(variantOptionJson.value)) {
            c9j5.AAV(variantOptionJson.value, c9iZ, 1);
        }
        if (zAfR || variantOptionJson.is_available) {
            c9j5.AA7(c9iZ, 2, variantOptionJson.is_available);
        }
        if (zAfR || !C3cG.A1L(variantOptionJson.product_ids)) {
            c9j5.AAQ(variantOptionJson.product_ids, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || variantOptionJson.swatch_hex != null) {
            c9j5.AAP(variantOptionJson.swatch_hex, JsonElementSerializer.A00, c9iZ, 4);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.is_available;
    }

    public final List<String> component4() {
        return this.product_ids;
    }

    public final JsonElement component5() {
        return this.swatch_hex;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<String> getProduct_ids() {
        return this.product_ids;
    }

    public final JsonElement getSwatch_hex() {
        return this.swatch_hex;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.product_ids, C0KA.A01(AnonymousClass005.A0I(this.value, AnonymousClass001.A0G(this.label)), this.is_available)) + AnonymousClass006.A0D(this.swatch_hex);
    }

    public final boolean is_available() {
        return this.is_available;
    }

    public VariantOptionJson(String str, String str2, boolean z, List<String> list, JsonElement jsonElement) {
        AnonymousClass005.A0y(str, str2, list);
        this.label = str;
        this.value = str2;
        this.is_available = z;
        this.product_ids = list;
        this.swatch_hex = jsonElement;
    }

    public final VariantOptionJson copy(String str, String str2, boolean z, List<String> list, JsonElement jsonElement) {
        AnonymousClass005.A0y(str, str2, list);
        return new VariantOptionJson(str, str2, z, list, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VariantOptionJson(String str, String str2, boolean z, List list, JsonElement jsonElement, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? null : jsonElement);
    }

    public /* synthetic */ VariantOptionJson(int i, String str, String str2, boolean z, List list, JsonElement jsonElement, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.is_available = false;
        } else {
            this.is_available = z;
        }
        if ((i & 8) == 0) {
            this.product_ids = C0881AGi.A00;
        } else {
            this.product_ids = list;
        }
        if ((i & 16) == 0) {
            this.swatch_hex = null;
        } else {
            this.swatch_hex = jsonElement;
        }
    }

    public VariantOptionJson() {
        this("", "", false, C0881AGi.A00, null);
    }
}
