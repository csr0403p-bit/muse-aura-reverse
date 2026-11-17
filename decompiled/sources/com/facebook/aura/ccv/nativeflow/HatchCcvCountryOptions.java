package com.facebook.aura.ccv.nativeflow;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class HatchCcvCountryOptions extends C06G {
    public final AHD<HatchCcvCountryConfig> countries;
    public final String defaultCountry;
    public final boolean onlyDefaultCountryAllowed;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCcvCountryOptions) {
                HatchCcvCountryOptions hatchCcvCountryOptions = (HatchCcvCountryOptions) obj;
                if (!C7384Etj.areEqual(this.defaultCountry, hatchCcvCountryOptions.defaultCountry) || !C7384Etj.areEqual(this.countries, hatchCcvCountryOptions.countries) || this.onlyDefaultCountryAllowed != hatchCcvCountryOptions.onlyDefaultCountryAllowed) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCcvCountryOptions copy$default(HatchCcvCountryOptions hatchCcvCountryOptions, String str, AHD ahd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCcvCountryOptions.defaultCountry;
        }
        if ((i & 2) != 0) {
            ahd = hatchCcvCountryOptions.countries;
        }
        if ((i & 4) != 0) {
            z = hatchCcvCountryOptions.onlyDefaultCountryAllowed;
        }
        return hatchCcvCountryOptions.copy(str, ahd, z);
    }

    public final String component1() {
        return this.defaultCountry;
    }

    public final AHD<HatchCcvCountryConfig> component2() {
        return this.countries;
    }

    public final boolean component3() {
        return this.onlyDefaultCountryAllowed;
    }

    public final HatchCcvCountryConfig configFor(String str) {
        Object next;
        Iterator it = this.countries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(((HatchCcvCountryConfig) next).country, str)) {
                break;
            }
        }
        return (HatchCcvCountryConfig) next;
    }

    public final AHD<HatchCcvCountryConfig> getCountries() {
        return this.countries;
    }

    public final String getDefaultCountry() {
        return this.defaultCountry;
    }

    public final boolean getOnlyDefaultCountryAllowed() {
        return this.onlyDefaultCountryAllowed;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.countries, AnonymousClass001.A0G(this.defaultCountry)), this.onlyDefaultCountryAllowed);
    }

    public final boolean isCountrySelectable() {
        return !this.onlyDefaultCountryAllowed && this.countries.size() > 1;
    }

    public HatchCcvCountryOptions(String str, AHD<HatchCcvCountryConfig> ahd, boolean z) {
        AnonymousClass003.A0u(str, ahd);
        this.defaultCountry = str;
        this.countries = ahd;
        this.onlyDefaultCountryAllowed = z;
    }

    public final HatchCcvCountryOptions copy(String str, AHD<HatchCcvCountryConfig> ahd, boolean z) {
        AnonymousClass003.A0u(str, ahd);
        return new HatchCcvCountryOptions(str, ahd, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCcvCountryOptions(String str, AHD ahd, boolean z, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z));
    }
}
