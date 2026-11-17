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
public final class HatchCountryFormFieldsJson extends C06G {
    public final String country_code;
    public final List<HatchAddressFormFieldJson> form_fields;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, HatchCountryFormFieldsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchCountryFormFieldsJson> serializer() {
            return HatchCountryFormFieldsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCountryFormFieldsJson(String str, List<HatchAddressFormFieldJson> list) {
        C7384Etj.A0Y(list, 1);
        this.country_code = str;
        this.form_fields = list;
    }

    public final HatchCountryFormFieldsJson copy(String str, List<HatchAddressFormFieldJson> list) {
        C7384Etj.A0Y(list, 1);
        return new HatchCountryFormFieldsJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCountryFormFieldsJson) {
                HatchCountryFormFieldsJson hatchCountryFormFieldsJson = (HatchCountryFormFieldsJson) obj;
                if (!C7384Etj.areEqual(this.country_code, hatchCountryFormFieldsJson.country_code) || !C7384Etj.areEqual(this.form_fields, hatchCountryFormFieldsJson.form_fields)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCountryFormFieldsJson copy$default(HatchCountryFormFieldsJson hatchCountryFormFieldsJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCountryFormFieldsJson.country_code;
        }
        if ((i & 2) != 0) {
            list = hatchCountryFormFieldsJson.form_fields;
        }
        C7384Etj.A0Y(list, 1);
        return new HatchCountryFormFieldsJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCountryFormFieldsJson hatchCountryFormFieldsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCountryFormFieldsJson.country_code != null) {
            c9j5.AAP(hatchCountryFormFieldsJson.country_code, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(hatchCountryFormFieldsJson.form_fields)) {
            c9j5.AAQ(hatchCountryFormFieldsJson.form_fields, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.country_code;
    }

    public final List<HatchAddressFormFieldJson> component2() {
        return this.form_fields;
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final List<HatchAddressFormFieldJson> getForm_fields() {
        return this.form_fields;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.form_fields, AnonymousClass006.A0G(this.country_code) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCountryFormFieldsJson(int i, String str, List list, C2hx c2hx) {
        this.country_code = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.form_fields = C0881AGi.A00;
        } else {
            this.form_fields = list;
        }
    }

    public /* synthetic */ HatchCountryFormFieldsJson(String str, List list, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), C3cI.A11(list, i));
    }

    public HatchCountryFormFieldsJson() {
        this(null, C0881AGi.A00);
    }
}
