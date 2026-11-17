package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchCcvCountryConfig extends C06G {
    public final String country;
    public final String label;
    public final HatchCcvPostalFieldConfig postalField;

    public HatchCcvCountryConfig(String str, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, String str2) {
        C7384Etj.A0Y(str, 0);
        this.country = str;
        this.postalField = hatchCcvPostalFieldConfig;
        this.label = str2;
    }

    public final HatchCcvCountryConfig copy(String str, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchCcvCountryConfig(str, hatchCcvPostalFieldConfig, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCcvCountryConfig) {
                HatchCcvCountryConfig hatchCcvCountryConfig = (HatchCcvCountryConfig) obj;
                if (!C7384Etj.areEqual(this.country, hatchCcvCountryConfig.country) || !C7384Etj.areEqual(this.postalField, hatchCcvCountryConfig.postalField) || !C7384Etj.areEqual(this.label, hatchCcvCountryConfig.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCcvCountryConfig copy$default(HatchCcvCountryConfig hatchCcvCountryConfig, String str, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCcvCountryConfig.country;
        }
        if ((i & 2) != 0) {
            hatchCcvPostalFieldConfig = hatchCcvCountryConfig.postalField;
        }
        if ((i & 4) != 0) {
            str2 = hatchCcvCountryConfig.label;
        }
        return hatchCcvCountryConfig.copy(str, hatchCcvPostalFieldConfig, str2);
    }

    public final String component1() {
        return this.country;
    }

    public final HatchCcvPostalFieldConfig component2() {
        return this.postalField;
    }

    public final String component3() {
        return this.label;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLabel() {
        return this.label;
    }

    public final HatchCcvPostalFieldConfig getPostalField() {
        return this.postalField;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.country) + AnonymousClass006.A0D(this.postalField)) * 31) + AnonymousClass005.A0H(this.label);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCcvCountryConfig(String str, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : hatchCcvPostalFieldConfig, (i & 4) != 0 ? null : str2);
    }
}
