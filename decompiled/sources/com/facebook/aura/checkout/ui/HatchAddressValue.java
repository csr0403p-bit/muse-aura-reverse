package com.facebook.aura.checkout.ui;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchAddressValue extends C06G {
    public static final int $stable = 0;
    public final String addressLine1;
    public final String addressLine2;
    public final String city;
    public final String countryCode;
    public final String state;
    public final String zip;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddressValue) {
                HatchAddressValue hatchAddressValue = (HatchAddressValue) obj;
                if (!C7384Etj.areEqual(this.addressLine1, hatchAddressValue.addressLine1) || !C7384Etj.areEqual(this.addressLine2, hatchAddressValue.addressLine2) || !C7384Etj.areEqual(this.city, hatchAddressValue.city) || !C7384Etj.areEqual(this.state, hatchAddressValue.state) || !C7384Etj.areEqual(this.zip, hatchAddressValue.zip)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchAddressValue(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public static /* synthetic */ HatchAddressValue copy$default(HatchAddressValue hatchAddressValue, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAddressValue.addressLine1;
        }
        if ((i & 2) != 0) {
            str2 = hatchAddressValue.addressLine2;
        }
        if ((i & 4) != 0) {
            str3 = hatchAddressValue.city;
        }
        if ((i & 8) != 0) {
            str4 = hatchAddressValue.state;
        }
        if ((i & 16) != 0) {
            str5 = hatchAddressValue.zip;
        }
        return hatchAddressValue.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.addressLine1;
    }

    public final String component2() {
        return this.addressLine2;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.zip;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.zip, AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.city, AnonymousClass005.A0I(this.addressLine2, AnonymousClass001.A0G(this.addressLine1)))));
    }

    public final HatchAddressValue copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new HatchAddressValue(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAddressValue(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
        this.countryCode = "US";
    }

    public HatchAddressValue() {
        this("", "", "", "", "");
    }
}
