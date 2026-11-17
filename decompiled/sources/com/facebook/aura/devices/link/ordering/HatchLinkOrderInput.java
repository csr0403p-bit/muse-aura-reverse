package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchLinkOrderInput extends C06G {
    public static final int $stable = 0;
    public final String city;
    public final String email;
    public final String firstName;
    public final String lastName;
    public final String phone;
    public final String postalCode;
    public final String state;
    public final String street1;
    public final String street2;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkOrderInput) {
                HatchLinkOrderInput hatchLinkOrderInput = (HatchLinkOrderInput) obj;
                if (!C7384Etj.areEqual(this.firstName, hatchLinkOrderInput.firstName) || !C7384Etj.areEqual(this.lastName, hatchLinkOrderInput.lastName) || !C7384Etj.areEqual(this.email, hatchLinkOrderInput.email) || !C7384Etj.areEqual(this.phone, hatchLinkOrderInput.phone) || !C7384Etj.areEqual(this.street1, hatchLinkOrderInput.street1) || !C7384Etj.areEqual(this.street2, hatchLinkOrderInput.street2) || !C7384Etj.areEqual(this.city, hatchLinkOrderInput.city) || !C7384Etj.areEqual(this.state, hatchLinkOrderInput.state) || !C7384Etj.areEqual(this.postalCode, hatchLinkOrderInput.postalCode)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkOrderInput copy$default(HatchLinkOrderInput hatchLinkOrderInput, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLinkOrderInput.firstName;
        }
        if ((i & 2) != 0) {
            str2 = hatchLinkOrderInput.lastName;
        }
        if ((i & 4) != 0) {
            str3 = hatchLinkOrderInput.email;
        }
        if ((i & 8) != 0) {
            str4 = hatchLinkOrderInput.phone;
        }
        if ((i & 16) != 0) {
            str5 = hatchLinkOrderInput.street1;
        }
        if ((i & 32) != 0) {
            str6 = hatchLinkOrderInput.street2;
        }
        if ((i & 64) != 0) {
            str7 = hatchLinkOrderInput.city;
        }
        if ((i & 128) != 0) {
            str8 = hatchLinkOrderInput.state;
        }
        if ((i & 256) != 0) {
            str9 = hatchLinkOrderInput.postalCode;
        }
        return hatchLinkOrderInput.copy(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.phone;
    }

    public final String component5() {
        return this.street1;
    }

    public final String component6() {
        return this.street2;
    }

    public final String component7() {
        return this.city;
    }

    public final String component8() {
        return this.state;
    }

    public final String component9() {
        return this.postalCode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
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
        return AnonymousClass001.A0H(this.postalCode, AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.city, AnonymousClass005.A0I(this.street2, AnonymousClass005.A0I(this.street1, AnonymousClass005.A0I(this.phone, AnonymousClass005.A0I(this.email, AnonymousClass005.A0I(this.lastName, AnonymousClass001.A0G(this.firstName)))))))));
    }

    public HatchLinkOrderInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        C7384Etj.A0Y(str9, 8);
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.phone = str4;
        this.street1 = str5;
        this.street2 = str6;
        this.city = str7;
        this.state = str8;
        this.postalCode = str9;
    }

    public final HatchLinkOrderInput copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        C7384Etj.A0Y(str9, 8);
        return new HatchLinkOrderInput(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public String toString() {
        return super.toString();
    }
}
