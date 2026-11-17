package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchLinkSavedAddress extends C06G {
    public static final int $stable = 0;
    public final String city;
    public final String id;
    public final String postalCode;
    public final String state;
    public final String street1;
    public final String street2;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkSavedAddress) {
                HatchLinkSavedAddress hatchLinkSavedAddress = (HatchLinkSavedAddress) obj;
                if (!C7384Etj.areEqual(this.id, hatchLinkSavedAddress.id) || !C7384Etj.areEqual(this.street1, hatchLinkSavedAddress.street1) || !C7384Etj.areEqual(this.street2, hatchLinkSavedAddress.street2) || !C7384Etj.areEqual(this.city, hatchLinkSavedAddress.city) || !C7384Etj.areEqual(this.state, hatchLinkSavedAddress.state) || !C7384Etj.areEqual(this.postalCode, hatchLinkSavedAddress.postalCode)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkSavedAddress copy$default(HatchLinkSavedAddress hatchLinkSavedAddress, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLinkSavedAddress.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchLinkSavedAddress.street1;
        }
        if ((i & 4) != 0) {
            str3 = hatchLinkSavedAddress.street2;
        }
        if ((i & 8) != 0) {
            str4 = hatchLinkSavedAddress.city;
        }
        if ((i & 16) != 0) {
            str5 = hatchLinkSavedAddress.state;
        }
        if ((i & 32) != 0) {
            str6 = hatchLinkSavedAddress.postalCode;
        }
        return hatchLinkSavedAddress.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.street1;
    }

    public final String component3() {
        return this.street2;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.state;
    }

    public final String component6() {
        return this.postalCode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet1() {
        return this.street1;
    }

    public final String getStreet2() {
        return this.street2;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.postalCode, AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.city, AnonymousClass005.A0I(this.street2, AnonymousClass005.A0I(this.street1, AnonymousClass001.A0G(this.id))))));
    }

    public HatchLinkSavedAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        this.id = str;
        this.street1 = str2;
        this.street2 = str3;
        this.city = str4;
        this.state = str5;
        this.postalCode = str6;
    }

    public final HatchLinkSavedAddress copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        return new HatchLinkSavedAddress(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }
}
