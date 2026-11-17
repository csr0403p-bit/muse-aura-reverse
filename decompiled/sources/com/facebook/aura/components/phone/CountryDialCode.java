package com.facebook.aura.components.phone;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CountryDialCode extends C06G {
    public static final int $stable = 0;
    public final int dialCode;
    public final String iso;

    public CountryDialCode(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.iso = str;
        this.dialCode = i;
    }

    public final CountryDialCode copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new CountryDialCode(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CountryDialCode) {
                CountryDialCode countryDialCode = (CountryDialCode) obj;
                if (!C7384Etj.areEqual(this.iso, countryDialCode.iso) || this.dialCode != countryDialCode.dialCode) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CountryDialCode copy$default(CountryDialCode countryDialCode, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = countryDialCode.iso;
        }
        if ((i2 & 2) != 0) {
            i = countryDialCode.dialCode;
        }
        C7384Etj.A0Y(str, 0);
        return new CountryDialCode(str, i);
    }

    public final String component1() {
        return this.iso;
    }

    public final int component2() {
        return this.dialCode;
    }

    public final int getDialCode() {
        return this.dialCode;
    }

    public final String getIso() {
        return this.iso;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.iso) + this.dialCode;
    }

    public String toString() {
        return super.toString();
    }
}
