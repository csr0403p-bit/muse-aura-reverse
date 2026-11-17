package com.facebook.aura.ccv.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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

@Serializable
/* loaded from: classes3.dex */
public final class HatchAddressFormFieldJson extends C06G {
    public final String field_id;
    public final String field_type;
    public final boolean is_optional;
    public final String label;
    public final String placeholder;
    public final List<HatchCcvValidationRuleJson> validation_rules;
    public final String value_type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchAddressFormFieldJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<HatchAddressFormFieldJson> serializer() {
            return HatchAddressFormFieldJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchAddressFormFieldJson copy(String str, String str2, String str3, String str4, boolean z, String str5, List<HatchCcvValidationRuleJson> list) {
        C7384Etj.A0Y(list, 6);
        return new HatchAddressFormFieldJson(str, str2, str3, str4, z, str5, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddressFormFieldJson) {
                HatchAddressFormFieldJson hatchAddressFormFieldJson = (HatchAddressFormFieldJson) obj;
                if (!C7384Etj.areEqual(this.field_id, hatchAddressFormFieldJson.field_id) || !C7384Etj.areEqual(this.field_type, hatchAddressFormFieldJson.field_type) || !C7384Etj.areEqual(this.label, hatchAddressFormFieldJson.label) || !C7384Etj.areEqual(this.placeholder, hatchAddressFormFieldJson.placeholder) || this.is_optional != hatchAddressFormFieldJson.is_optional || !C7384Etj.areEqual(this.value_type, hatchAddressFormFieldJson.value_type) || !C7384Etj.areEqual(this.validation_rules, hatchAddressFormFieldJson.validation_rules)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchAddressFormFieldJson copy$default(HatchAddressFormFieldJson hatchAddressFormFieldJson, String str, String str2, String str3, String str4, boolean z, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAddressFormFieldJson.field_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchAddressFormFieldJson.field_type;
        }
        if ((i & 4) != 0) {
            str3 = hatchAddressFormFieldJson.label;
        }
        if ((i & 8) != 0) {
            str4 = hatchAddressFormFieldJson.placeholder;
        }
        if ((i & 16) != 0) {
            z = hatchAddressFormFieldJson.is_optional;
        }
        if ((i & 32) != 0) {
            str5 = hatchAddressFormFieldJson.value_type;
        }
        if ((i & 64) != 0) {
            list = hatchAddressFormFieldJson.validation_rules;
        }
        return hatchAddressFormFieldJson.copy(str, str2, str3, str4, z, str5, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchAddressFormFieldJson hatchAddressFormFieldJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchAddressFormFieldJson.field_id != null) {
            c9j5.AAP(hatchAddressFormFieldJson.field_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchAddressFormFieldJson.field_type != null) {
            c9j5.AAP(hatchAddressFormFieldJson.field_type, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchAddressFormFieldJson.label != null) {
            c9j5.AAP(hatchAddressFormFieldJson.label, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAddressFormFieldJson.placeholder != null) {
            c9j5.AAP(hatchAddressFormFieldJson.placeholder, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchAddressFormFieldJson.is_optional) {
            c9j5.AA7(c9iZ, 4, hatchAddressFormFieldJson.is_optional);
        }
        if (zAfR || hatchAddressFormFieldJson.value_type != null) {
            c9j5.AAP(hatchAddressFormFieldJson.value_type, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(hatchAddressFormFieldJson.validation_rules)) {
            c9j5.AAQ(hatchAddressFormFieldJson.validation_rules, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
    }

    public final String component1() {
        return this.field_id;
    }

    public final String component2() {
        return this.field_type;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.placeholder;
    }

    public final boolean component5() {
        return this.is_optional;
    }

    public final String component6() {
        return this.value_type;
    }

    public final List<HatchCcvValidationRuleJson> component7() {
        return this.validation_rules;
    }

    public final String getField_id() {
        return this.field_id;
    }

    public final String getField_type() {
        return this.field_type;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final List<HatchCcvValidationRuleJson> getValidation_rules() {
        return this.validation_rules;
    }

    public final String getValue_type() {
        return this.value_type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.validation_rules, (C0KA.A01(((((((AnonymousClass006.A0G(this.field_id) * 31) + AnonymousClass006.A0G(this.field_type)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.placeholder)) * 31, this.is_optional) + AnonymousClass005.A0H(this.value_type)) * 31);
    }

    public final boolean is_optional() {
        return this.is_optional;
    }

    public /* synthetic */ HatchAddressFormFieldJson(int i, String str, String str2, String str3, String str4, boolean z, String str5, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.field_id = null;
        } else {
            this.field_id = str;
        }
        if ((i & 2) == 0) {
            this.field_type = null;
        } else {
            this.field_type = str2;
        }
        if ((i & 4) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str4;
        }
        if ((i & 16) == 0) {
            this.is_optional = false;
        } else {
            this.is_optional = z;
        }
        if ((i & 32) == 0) {
            this.value_type = null;
        } else {
            this.value_type = str5;
        }
        if ((i & 64) == 0) {
            this.validation_rules = C0881AGi.A00;
        } else {
            this.validation_rules = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAddressFormFieldJson(String str, String str2, String str3, String str4, boolean z, String str5, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str5, (i & 64) != 0 ? C0881AGi.A00 : list);
    }

    public HatchAddressFormFieldJson(String str, String str2, String str3, String str4, boolean z, String str5, List<HatchCcvValidationRuleJson> list) {
        C7384Etj.A0Y(list, 6);
        this.field_id = str;
        this.field_type = str2;
        this.label = str3;
        this.placeholder = str4;
        this.is_optional = z;
        this.value_type = str5;
        this.validation_rules = list;
    }

    public HatchAddressFormFieldJson() {
        this(null, null, null, null, false, null, C0881AGi.A00);
    }
}
