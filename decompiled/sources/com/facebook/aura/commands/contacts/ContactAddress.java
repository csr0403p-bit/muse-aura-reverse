package com.facebook.aura.commands.contacts;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2nw;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7qW;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ContactAddress extends C06G {
    public final String city;
    public final String country;
    public final String label;
    public final String postalCode;
    public final String state;
    public final String street;

    public ContactAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        this.label = str;
        this.street = str2;
        this.city = str3;
        this.state = str4;
        this.postalCode = str5;
        this.country = str6;
    }

    public final ContactAddress copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        return new ContactAddress(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactAddress) {
                ContactAddress contactAddress = (ContactAddress) obj;
                if (!C7384Etj.areEqual(this.label, contactAddress.label) || !C7384Etj.areEqual(this.street, contactAddress.street) || !C7384Etj.areEqual(this.city, contactAddress.city) || !C7384Etj.areEqual(this.state, contactAddress.state) || !C7384Etj.areEqual(this.postalCode, contactAddress.postalCode) || !C7384Etj.areEqual(this.country, contactAddress.country)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactAddress copy$default(ContactAddress contactAddress, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactAddress.label;
        }
        if ((i & 2) != 0) {
            str2 = contactAddress.street;
        }
        if ((i & 4) != 0) {
            str3 = contactAddress.city;
        }
        if ((i & 8) != 0) {
            str4 = contactAddress.state;
        }
        if ((i & 16) != 0) {
            str5 = contactAddress.postalCode;
        }
        if ((i & 32) != 0) {
            str6 = contactAddress.country;
        }
        return contactAddress.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.street;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.country;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.label) + AnonymousClass006.A0G(this.street)) * 31) + AnonymousClass006.A0G(this.city)) * 31) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.postalCode)) * 31) + AnonymousClass005.A0H(this.country);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("label", this.label, c2nwA1K);
        C60R.A1M(this.street, "street", c2nwA1K);
        C60R.A1M(this.city, "city", c2nwA1K);
        C60R.A1M(this.state, "state", c2nwA1K);
        C60R.A1M(this.postalCode, "postalCode", c2nwA1K);
        C60R.A1M(this.country, "country", c2nwA1K);
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContactAddress(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
