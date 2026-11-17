package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchFormField extends C06G {
    public static final int $stable = 0;
    public final HatchAddressAutocomplete addressAutocomplete;
    public final G0W<String, String, Map<String, String>, String> format;
    public final String id;
    public final String initialValue;
    public final boolean isRequired;
    public final HatchFormFieldKind kind;
    public final AHD<HatchFormOption> options;
    public final String placeholder;
    public final Integer trailingIcon;
    public final G0U<String, Integer> trailingIconForValue;
    public final G0V<String, Map<String, String>, HatchFieldValidation> validate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchFormField) {
                HatchFormField hatchFormField = (HatchFormField) obj;
                if (!C7384Etj.areEqual(this.id, hatchFormField.id) || !C7384Etj.areEqual(this.placeholder, hatchFormField.placeholder) || this.kind != hatchFormField.kind || !C7384Etj.areEqual(this.initialValue, hatchFormField.initialValue) || this.isRequired != hatchFormField.isRequired || !C7384Etj.areEqual(this.trailingIcon, hatchFormField.trailingIcon) || !C7384Etj.areEqual(this.trailingIconForValue, hatchFormField.trailingIconForValue) || !C7384Etj.areEqual(this.validate, hatchFormField.validate) || !C7384Etj.areEqual(this.format, hatchFormField.format) || !C7384Etj.areEqual(this.options, hatchFormField.options) || !C7384Etj.areEqual(this.addressAutocomplete, hatchFormField.addressAutocomplete)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchFormField copy$default(HatchFormField hatchFormField, String str, String str2, HatchFormFieldKind hatchFormFieldKind, String str3, boolean z, Integer num, G0U g0u, G0V g0v, G0W g0w, AHD ahd, HatchAddressAutocomplete hatchAddressAutocomplete, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchFormField.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchFormField.placeholder;
        }
        if ((i & 4) != 0) {
            hatchFormFieldKind = hatchFormField.kind;
        }
        if ((i & 8) != 0) {
            str3 = hatchFormField.initialValue;
        }
        if ((i & 16) != 0) {
            z = hatchFormField.isRequired;
        }
        if ((i & 32) != 0) {
            num = hatchFormField.trailingIcon;
        }
        if ((i & 64) != 0) {
            g0u = hatchFormField.trailingIconForValue;
        }
        if ((i & 128) != 0) {
            g0v = hatchFormField.validate;
        }
        if ((i & 256) != 0) {
            g0w = hatchFormField.format;
        }
        if ((i & 512) != 0) {
            ahd = hatchFormField.options;
        }
        if ((i & 1024) != 0) {
            hatchAddressAutocomplete = hatchFormField.addressAutocomplete;
        }
        return hatchFormField.copy(str, str2, hatchFormFieldKind, str3, z, num, g0u, g0v, g0w, ahd, hatchAddressAutocomplete);
    }

    public final String component1() {
        return this.id;
    }

    public final AHD<HatchFormOption> component10() {
        return this.options;
    }

    public final HatchAddressAutocomplete component11() {
        return this.addressAutocomplete;
    }

    public final String component2() {
        return this.placeholder;
    }

    public final HatchFormFieldKind component3() {
        return this.kind;
    }

    public final String component4() {
        return this.initialValue;
    }

    public final boolean component5() {
        return this.isRequired;
    }

    public final Integer component6() {
        return this.trailingIcon;
    }

    public final G0U<String, Integer> component7() {
        return this.trailingIconForValue;
    }

    public final G0V<String, Map<String, String>, HatchFieldValidation> component8() {
        return this.validate;
    }

    public final G0W<String, String, Map<String, String>, String> component9() {
        return this.format;
    }

    public final HatchAddressAutocomplete getAddressAutocomplete() {
        return this.addressAutocomplete;
    }

    public final G0W<String, String, Map<String, String>, String> getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInitialValue() {
        return this.initialValue;
    }

    public final HatchFormFieldKind getKind() {
        return this.kind;
    }

    public final AHD<HatchFormOption> getOptions() {
        return this.options;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getTrailingIcon() {
        return this.trailingIcon;
    }

    public final G0U<String, Integer> getTrailingIconForValue() {
        return this.trailingIconForValue;
    }

    public final G0V<String, Map<String, String>, HatchFieldValidation> getValidate() {
        return this.validate;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.options, (((((((C0KA.A01(AnonymousClass005.A0I(this.initialValue, AnonymousClass005.A0F(this.kind, AnonymousClass005.A0I(this.placeholder, AnonymousClass001.A0G(this.id)))), this.isRequired) + AnonymousClass006.A0D(this.trailingIcon)) * 31) + AnonymousClass006.A0D(this.trailingIconForValue)) * 31) + AnonymousClass006.A0D(this.validate)) * 31) + AnonymousClass006.A0D(this.format)) * 31) + C3cH.A02(this.addressAutocomplete);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchFormField(String str, String str2, HatchFormFieldKind hatchFormFieldKind, String str3, boolean z, Integer num, G0U<? super String, Integer> g0u, G0V<? super String, ? super Map<String, String>, ? extends HatchFieldValidation> g0v, G0W<? super String, ? super String, ? super Map<String, String>, String> g0w, AHD<HatchFormOption> ahd, HatchAddressAutocomplete hatchAddressAutocomplete) {
        AnonymousClass005.A14(str, str2, hatchFormFieldKind, str3);
        C7384Etj.A0Y(ahd, 9);
        this.id = str;
        this.placeholder = str2;
        this.kind = hatchFormFieldKind;
        this.initialValue = str3;
        this.isRequired = z;
        this.trailingIcon = num;
        this.trailingIconForValue = g0u;
        this.validate = g0v;
        this.format = g0w;
        this.options = ahd;
        this.addressAutocomplete = hatchAddressAutocomplete;
    }

    public final HatchFormField copy(String str, String str2, HatchFormFieldKind hatchFormFieldKind, String str3, boolean z, Integer num, G0U<? super String, Integer> g0u, G0V<? super String, ? super Map<String, String>, ? extends HatchFieldValidation> g0v, G0W<? super String, ? super String, ? super Map<String, String>, String> g0w, AHD<HatchFormOption> ahd, HatchAddressAutocomplete hatchAddressAutocomplete) {
        AnonymousClass005.A14(str, str2, hatchFormFieldKind, str3);
        C7384Etj.A0Y(ahd, 9);
        return new HatchFormField(str, str2, hatchFormFieldKind, str3, z, num, g0u, g0v, g0w, ahd, hatchAddressAutocomplete);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchFormField(String str, String str2, HatchFormFieldKind hatchFormFieldKind, String str3, boolean z, Integer num, G0U g0u, G0V g0v, G0W g0w, AHD ahd, HatchAddressAutocomplete hatchAddressAutocomplete, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? HatchFormFieldKind.TEXT : hatchFormFieldKind, (i & 8) != 0 ? "" : str3, C3cI.A1S(i, z), (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : g0u, (i & 128) != 0 ? null : g0v, (i & 256) != 0 ? null : g0w, (i & 512) != 0 ? AHI.A01 : ahd, (i & 1024) != 0 ? null : hatchAddressAutocomplete);
    }
}
