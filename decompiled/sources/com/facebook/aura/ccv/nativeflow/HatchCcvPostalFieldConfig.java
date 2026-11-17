package com.facebook.aura.ccv.nativeflow;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchCcvPostalFieldConfig extends C06G {
    public final boolean isOptional;
    public final HatchPostalKeyboardType keyboardType;
    public final String label;
    public final String placeholder;
    public final AHD<HatchPostalValidationRule> validationRules;

    public HatchCcvPostalFieldConfig(AHD<HatchPostalValidationRule> ahd, HatchPostalKeyboardType hatchPostalKeyboardType, String str, String str2, boolean z) {
        C7384Etj.A0Y(ahd, 0);
        this.validationRules = ahd;
        this.keyboardType = hatchPostalKeyboardType;
        this.label = str;
        this.placeholder = str2;
        this.isOptional = z;
    }

    public final HatchCcvPostalFieldConfig copy(AHD<HatchPostalValidationRule> ahd, HatchPostalKeyboardType hatchPostalKeyboardType, String str, String str2, boolean z) {
        C7384Etj.A0Y(ahd, 0);
        return new HatchCcvPostalFieldConfig(ahd, hatchPostalKeyboardType, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCcvPostalFieldConfig) {
                HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig = (HatchCcvPostalFieldConfig) obj;
                if (!C7384Etj.areEqual(this.validationRules, hatchCcvPostalFieldConfig.validationRules) || this.keyboardType != hatchCcvPostalFieldConfig.keyboardType || !C7384Etj.areEqual(this.label, hatchCcvPostalFieldConfig.label) || !C7384Etj.areEqual(this.placeholder, hatchCcvPostalFieldConfig.placeholder) || this.isOptional != hatchCcvPostalFieldConfig.isOptional) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCcvPostalFieldConfig copy$default(HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, AHD ahd, HatchPostalKeyboardType hatchPostalKeyboardType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchCcvPostalFieldConfig.validationRules;
        }
        if ((i & 2) != 0) {
            hatchPostalKeyboardType = hatchCcvPostalFieldConfig.keyboardType;
        }
        if ((i & 4) != 0) {
            str = hatchCcvPostalFieldConfig.label;
        }
        if ((i & 8) != 0) {
            str2 = hatchCcvPostalFieldConfig.placeholder;
        }
        if ((i & 16) != 0) {
            z = hatchCcvPostalFieldConfig.isOptional;
        }
        return hatchCcvPostalFieldConfig.copy(ahd, hatchPostalKeyboardType, str, str2, z);
    }

    public final AHD<HatchPostalValidationRule> component1() {
        return this.validationRules;
    }

    public final HatchPostalKeyboardType component2() {
        return this.keyboardType;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.placeholder;
    }

    public final boolean component5() {
        return this.isOptional;
    }

    public final HatchPostalKeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final AHD<HatchPostalValidationRule> getValidationRules() {
        return this.validationRules;
    }

    public int hashCode() {
        return C0KA.A00((((((AnonymousClass005.A0E(this.validationRules) + AnonymousClass006.A0D(this.keyboardType)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.placeholder)) * 31, this.isOptional);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCcvPostalFieldConfig(AHD ahd, HatchPostalKeyboardType hatchPostalKeyboardType, String str, String str2, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? null : hatchPostalKeyboardType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, C3cI.A1S(i, z));
    }

    public HatchCcvPostalFieldConfig() {
        this(AHI.A01, null, null, null, false);
    }
}
