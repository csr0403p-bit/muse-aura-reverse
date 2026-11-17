package com.facebook.aura.confidentialvm.repository;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
/* loaded from: classes4.dex */
public final class ConfidentialVmValuePropsJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<ConfidentialVmValuePropBulletJson> bullets;
    public final JsonElement data_migration;
    public final List<ConfidentialVmValuePropEntityJson> disclosure_entities;
    public final String disclosure_text;
    public final ConfidentialVmValuePropsVariantsJson variants;

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<ConfidentialVmValuePropsJson> serializer() {
            return ConfidentialVmValuePropsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ConfidentialVmValuePropsJson$Companion$$childSerializers$1.INSTANCE), null, null, AbstractC5321DgF.A02(num, ConfidentialVmValuePropsJson$Companion$$childSerializers$2.INSTANCE), null};
    }

    public final ConfidentialVmValuePropsJson copy(List<ConfidentialVmValuePropBulletJson> list, ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, String str, List<ConfidentialVmValuePropEntityJson> list2, JsonElement jsonElement) {
        AnonymousClass005.A11(list, str, list2, 0);
        return new ConfidentialVmValuePropsJson(list, confidentialVmValuePropsVariantsJson, str, list2, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropsJson) {
                ConfidentialVmValuePropsJson confidentialVmValuePropsJson = (ConfidentialVmValuePropsJson) obj;
                if (!C7384Etj.areEqual(this.bullets, confidentialVmValuePropsJson.bullets) || !C7384Etj.areEqual(this.variants, confidentialVmValuePropsJson.variants) || !C7384Etj.areEqual(this.disclosure_text, confidentialVmValuePropsJson.disclosure_text) || !C7384Etj.areEqual(this.disclosure_entities, confidentialVmValuePropsJson.disclosure_entities) || !C7384Etj.areEqual(this.data_migration, confidentialVmValuePropsJson.data_migration)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfidentialVmValuePropsJson copy$default(ConfidentialVmValuePropsJson confidentialVmValuePropsJson, List list, ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, String str, List list2, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            list = confidentialVmValuePropsJson.bullets;
        }
        if ((i & 2) != 0) {
            confidentialVmValuePropsVariantsJson = confidentialVmValuePropsJson.variants;
        }
        if ((i & 4) != 0) {
            str = confidentialVmValuePropsJson.disclosure_text;
        }
        if ((i & 8) != 0) {
            list2 = confidentialVmValuePropsJson.disclosure_entities;
        }
        if ((i & 16) != 0) {
            jsonElement = confidentialVmValuePropsJson.data_migration;
        }
        return confidentialVmValuePropsJson.copy(list, confidentialVmValuePropsVariantsJson, str, list2, jsonElement);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmValuePropsJson confidentialVmValuePropsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(confidentialVmValuePropsJson.bullets)) {
            c9j5.AAQ(confidentialVmValuePropsJson.bullets, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || confidentialVmValuePropsJson.variants != null) {
            c9j5.AAP(confidentialVmValuePropsJson.variants, ConfidentialVmValuePropsVariantsJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cH.A1Q(confidentialVmValuePropsJson.disclosure_text)) {
            c9j5.AAV(confidentialVmValuePropsJson.disclosure_text, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(confidentialVmValuePropsJson.disclosure_entities)) {
            c9j5.AAQ(confidentialVmValuePropsJson.disclosure_entities, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || confidentialVmValuePropsJson.data_migration != null) {
            c9j5.AAP(confidentialVmValuePropsJson.data_migration, JsonElementSerializer.A00, c9iZ, 4);
        }
    }

    public final List<ConfidentialVmValuePropBulletJson> component1() {
        return this.bullets;
    }

    public final ConfidentialVmValuePropsVariantsJson component2() {
        return this.variants;
    }

    public final String component3() {
        return this.disclosure_text;
    }

    public final List<ConfidentialVmValuePropEntityJson> component4() {
        return this.disclosure_entities;
    }

    public final JsonElement component5() {
        return this.data_migration;
    }

    public final List<ConfidentialVmValuePropBulletJson> getBullets() {
        return this.bullets;
    }

    public final JsonElement getData_migration() {
        return this.data_migration;
    }

    public final List<ConfidentialVmValuePropEntityJson> getDisclosure_entities() {
        return this.disclosure_entities;
    }

    public final String getDisclosure_text() {
        return this.disclosure_text;
    }

    public final ConfidentialVmValuePropsVariantsJson getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.disclosure_entities, AnonymousClass005.A0I(this.disclosure_text, (AnonymousClass005.A0E(this.bullets) + AnonymousClass006.A0D(this.variants)) * 31)) + C3cH.A02(this.data_migration);
    }

    public /* synthetic */ ConfidentialVmValuePropsJson(int i, List list, ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, String str, List list2, JsonElement jsonElement, C2hx c2hx) {
        this.bullets = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.variants = null;
        } else {
            this.variants = confidentialVmValuePropsVariantsJson;
        }
        if ((i & 4) == 0) {
            this.disclosure_text = "";
        } else {
            this.disclosure_text = str;
        }
        if ((i & 8) == 0) {
            this.disclosure_entities = C0881AGi.A00;
        } else {
            this.disclosure_entities = list2;
        }
        if ((i & 16) == 0) {
            this.data_migration = null;
        } else {
            this.data_migration = jsonElement;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmValuePropsJson(List<ConfidentialVmValuePropBulletJson> list, ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, String str, List<ConfidentialVmValuePropEntityJson> list2, JsonElement jsonElement) {
        AnonymousClass005.A11(list, str, list2, 0);
        this.bullets = list;
        this.variants = confidentialVmValuePropsVariantsJson;
        this.disclosure_text = str;
        this.disclosure_entities = list2;
        this.data_migration = jsonElement;
    }

    public /* synthetic */ ConfidentialVmValuePropsJson(List list, ConfidentialVmValuePropsVariantsJson confidentialVmValuePropsVariantsJson, String str, List list2, JsonElement jsonElement, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : confidentialVmValuePropsVariantsJson, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? null : jsonElement);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConfidentialVmValuePropsJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, null, "", c0881AGi, null);
    }
}
