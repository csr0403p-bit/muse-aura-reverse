package com.facebook.aura.ccv.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
public final class HatchAddressFormFieldsConfigJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<HatchCountryFormFieldsJson> country_to_fields;
    public final String default_country;
    public final boolean should_only_allow_default_country;
    public final List<HatchCountryOptionJson> supported_countries;

    public final class Companion {
        public final C9hr<HatchAddressFormFieldsConfigJson> serializer() {
            return HatchAddressFormFieldsConfigJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, HatchAddressFormFieldsConfigJson$Companion$$childSerializers$1.INSTANCE), HatchAddressFormFieldsConfigJson$Companion$$childSerializers$2.INSTANCE);
    }

    public final HatchAddressFormFieldsConfigJson copy(String str, boolean z, List<HatchCountryOptionJson> list, List<HatchCountryFormFieldsJson> list2) {
        AnonymousClass002.A1B(list, 2, list2);
        return new HatchAddressFormFieldsConfigJson(str, z, list, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddressFormFieldsConfigJson) {
                HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson = (HatchAddressFormFieldsConfigJson) obj;
                if (!C7384Etj.areEqual(this.default_country, hatchAddressFormFieldsConfigJson.default_country) || this.should_only_allow_default_country != hatchAddressFormFieldsConfigJson.should_only_allow_default_country || !C7384Etj.areEqual(this.supported_countries, hatchAddressFormFieldsConfigJson.supported_countries) || !C7384Etj.areEqual(this.country_to_fields, hatchAddressFormFieldsConfigJson.country_to_fields)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAddressFormFieldsConfigJson copy$default(HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson, String str, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAddressFormFieldsConfigJson.default_country;
        }
        if ((i & 2) != 0) {
            z = hatchAddressFormFieldsConfigJson.should_only_allow_default_country;
        }
        if ((i & 4) != 0) {
            list = hatchAddressFormFieldsConfigJson.supported_countries;
        }
        if ((i & 8) != 0) {
            list2 = hatchAddressFormFieldsConfigJson.country_to_fields;
        }
        AnonymousClass002.A1B(list, 2, list2);
        return new HatchAddressFormFieldsConfigJson(str, z, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchAddressFormFieldsConfigJson hatchAddressFormFieldsConfigJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchAddressFormFieldsConfigJson.default_country != null) {
            c9j5.AAP(hatchAddressFormFieldsConfigJson.default_country, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchAddressFormFieldsConfigJson.should_only_allow_default_country) {
            c9j5.AA7(c9iZ, 1, hatchAddressFormFieldsConfigJson.should_only_allow_default_country);
        }
        if (zAfR || !C3cG.A1L(hatchAddressFormFieldsConfigJson.supported_countries)) {
            c9j5.AAQ(hatchAddressFormFieldsConfigJson.supported_countries, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(hatchAddressFormFieldsConfigJson.country_to_fields)) {
            c9j5.AAQ(hatchAddressFormFieldsConfigJson.country_to_fields, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final String component1() {
        return this.default_country;
    }

    public final boolean component2() {
        return this.should_only_allow_default_country;
    }

    public final List<HatchCountryOptionJson> component3() {
        return this.supported_countries;
    }

    public final List<HatchCountryFormFieldsJson> component4() {
        return this.country_to_fields;
    }

    public final List<HatchCountryFormFieldsJson> getCountry_to_fields() {
        return this.country_to_fields;
    }

    public final String getDefault_country() {
        return this.default_country;
    }

    public final boolean getShould_only_allow_default_country() {
        return this.should_only_allow_default_country;
    }

    public final List<HatchCountryOptionJson> getSupported_countries() {
        return this.supported_countries;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.country_to_fields, AnonymousClass005.A0F(this.supported_countries, C0KA.A01(AnonymousClass006.A0G(this.default_country) * 31, this.should_only_allow_default_country)));
    }

    public /* synthetic */ HatchAddressFormFieldsConfigJson(int i, String str, boolean z, List list, List list2, C2hx c2hx) {
        this.default_country = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.should_only_allow_default_country = false;
        } else {
            this.should_only_allow_default_country = z;
        }
        if ((i & 4) == 0) {
            this.supported_countries = C0881AGi.A00;
        } else {
            this.supported_countries = list;
        }
        if ((i & 8) == 0) {
            this.country_to_fields = C0881AGi.A00;
        } else {
            this.country_to_fields = list2;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchAddressFormFieldsConfigJson(String str, boolean z, List<HatchCountryOptionJson> list, List<HatchCountryFormFieldsJson> list2) {
        AnonymousClass002.A1B(list, 2, list2);
        this.default_country = str;
        this.should_only_allow_default_country = z;
        this.supported_countries = list;
        this.country_to_fields = list2;
    }

    public /* synthetic */ HatchAddressFormFieldsConfigJson(String str, boolean z, List list, List list2, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), AnonymousClass001.A1Q(i, z), C3cI.A12(list, i), (i & 8) != 0 ? C0881AGi.A00 : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HatchAddressFormFieldsConfigJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, false, c0881AGi, c0881AGi);
    }
}
