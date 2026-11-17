package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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

@Serializable
/* loaded from: classes3.dex */
public final class HatchCheckoutComponentJson extends C06G {
    public final HatchAddressFormFieldsConfigJson address_form_fields_config;
    public final List<String> supported_cc_types;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, HatchCheckoutComponentJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchCheckoutComponentJson> serializer() {
            return HatchCheckoutComponentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCheckoutComponentJson(String str, List<String> list, HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson) {
        C7384Etj.A0Y(list, 1);
        this.type = str;
        this.supported_cc_types = list;
        this.address_form_fields_config = hatchAddressFormFieldsConfigJson;
    }

    public final HatchCheckoutComponentJson copy(String str, List<String> list, HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson) {
        C7384Etj.A0Y(list, 1);
        return new HatchCheckoutComponentJson(str, list, hatchAddressFormFieldsConfigJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutComponentJson) {
                HatchCheckoutComponentJson hatchCheckoutComponentJson = (HatchCheckoutComponentJson) obj;
                if (!C7384Etj.areEqual(this.type, hatchCheckoutComponentJson.type) || !C7384Etj.areEqual(this.supported_cc_types, hatchCheckoutComponentJson.supported_cc_types) || !C7384Etj.areEqual(this.address_form_fields_config, hatchCheckoutComponentJson.address_form_fields_config)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCheckoutComponentJson copy$default(HatchCheckoutComponentJson hatchCheckoutComponentJson, String str, List list, HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutComponentJson.type;
        }
        if ((i & 2) != 0) {
            list = hatchCheckoutComponentJson.supported_cc_types;
        }
        if ((i & 4) != 0) {
            hatchAddressFormFieldsConfigJson = hatchCheckoutComponentJson.address_form_fields_config;
        }
        return hatchCheckoutComponentJson.copy(str, list, hatchAddressFormFieldsConfigJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutComponentJson hatchCheckoutComponentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCheckoutComponentJson.type != null) {
            c9j5.AAP(hatchCheckoutComponentJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(hatchCheckoutComponentJson.supported_cc_types)) {
            c9j5.AAQ(hatchCheckoutComponentJson.supported_cc_types, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || hatchCheckoutComponentJson.address_form_fields_config != null) {
            c9j5.AAP(hatchCheckoutComponentJson.address_form_fields_config, HatchAddressFormFieldsConfigJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.type;
    }

    public final List<String> component2() {
        return this.supported_cc_types;
    }

    public final HatchAddressFormFieldsConfigJson component3() {
        return this.address_form_fields_config;
    }

    public final HatchAddressFormFieldsConfigJson getAddress_form_fields_config() {
        return this.address_form_fields_config;
    }

    public final List<String> getSupported_cc_types() {
        return this.supported_cc_types;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.supported_cc_types, AnonymousClass006.A0G(this.type) * 31) + C3cH.A02(this.address_form_fields_config);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutComponentJson(int i, String str, List list, HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.supported_cc_types = C0881AGi.A00;
        } else {
            this.supported_cc_types = list;
        }
        if ((i & 4) == 0) {
            this.address_form_fields_config = null;
        } else {
            this.address_form_fields_config = hatchAddressFormFieldsConfigJson;
        }
    }

    public /* synthetic */ HatchCheckoutComponentJson(String str, List list, HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cI.A11(list, i), (i & 4) != 0 ? null : hatchAddressFormFieldsConfigJson);
    }

    public HatchCheckoutComponentJson() {
        this(null, C0881AGi.A00, null);
    }
}
