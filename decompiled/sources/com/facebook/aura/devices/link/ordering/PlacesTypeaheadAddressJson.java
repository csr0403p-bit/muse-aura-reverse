package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PlacesTypeaheadAddressJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String city;
    public final String country;
    public final String postalcode;
    public final String stateprovince;
    public final String streetaddress;

    public final class Companion {
        public final C9hr<PlacesTypeaheadAddressJson> serializer() {
            return PlacesTypeaheadAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(PlacesTypeaheadAddressJson placesTypeaheadAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || placesTypeaheadAddressJson.streetaddress != null) {
            c9j5.AAP(placesTypeaheadAddressJson.streetaddress, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || placesTypeaheadAddressJson.city != null) {
            c9j5.AAP(placesTypeaheadAddressJson.city, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || placesTypeaheadAddressJson.stateprovince != null) {
            c9j5.AAP(placesTypeaheadAddressJson.stateprovince, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || placesTypeaheadAddressJson.postalcode != null) {
            c9j5.AAP(placesTypeaheadAddressJson.postalcode, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || placesTypeaheadAddressJson.country != null) {
            c9j5.AAP(placesTypeaheadAddressJson.country, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesTypeaheadAddressJson) {
                PlacesTypeaheadAddressJson placesTypeaheadAddressJson = (PlacesTypeaheadAddressJson) obj;
                if (!C7384Etj.areEqual(this.streetaddress, placesTypeaheadAddressJson.streetaddress) || !C7384Etj.areEqual(this.city, placesTypeaheadAddressJson.city) || !C7384Etj.areEqual(this.stateprovince, placesTypeaheadAddressJson.stateprovince) || !C7384Etj.areEqual(this.postalcode, placesTypeaheadAddressJson.postalcode) || !C7384Etj.areEqual(this.country, placesTypeaheadAddressJson.country)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PlacesTypeaheadAddressJson copy$default(PlacesTypeaheadAddressJson placesTypeaheadAddressJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placesTypeaheadAddressJson.streetaddress;
        }
        if ((i & 2) != 0) {
            str2 = placesTypeaheadAddressJson.city;
        }
        if ((i & 4) != 0) {
            str3 = placesTypeaheadAddressJson.stateprovince;
        }
        if ((i & 8) != 0) {
            str4 = placesTypeaheadAddressJson.postalcode;
        }
        if ((i & 16) != 0) {
            str5 = placesTypeaheadAddressJson.country;
        }
        return placesTypeaheadAddressJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.streetaddress;
    }

    public final String component2() {
        return this.city;
    }

    public final String component3() {
        return this.stateprovince;
    }

    public final String component4() {
        return this.postalcode;
    }

    public final String component5() {
        return this.country;
    }

    public final PlacesTypeaheadAddressJson copy(String str, String str2, String str3, String str4, String str5) {
        return new PlacesTypeaheadAddressJson(str, str2, str3, str4, str5);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPostalcode() {
        return this.postalcode;
    }

    public final String getStateprovince() {
        return this.stateprovince;
    }

    public final String getStreetaddress() {
        return this.streetaddress;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.streetaddress) * 31) + AnonymousClass006.A0G(this.city)) * 31) + AnonymousClass006.A0G(this.stateprovince)) * 31) + AnonymousClass006.A0G(this.postalcode)) * 31) + AnonymousClass005.A0H(this.country);
    }

    public /* synthetic */ PlacesTypeaheadAddressJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.streetaddress = null;
        } else {
            this.streetaddress = str;
        }
        if ((i & 2) == 0) {
            this.city = null;
        } else {
            this.city = str2;
        }
        if ((i & 4) == 0) {
            this.stateprovince = null;
        } else {
            this.stateprovince = str3;
        }
        if ((i & 8) == 0) {
            this.postalcode = null;
        } else {
            this.postalcode = str4;
        }
        if ((i & 16) == 0) {
            this.country = null;
        } else {
            this.country = str5;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PlacesTypeaheadAddressJson(String str, String str2, String str3, String str4, String str5) {
        this.streetaddress = str;
        this.city = str2;
        this.stateprovince = str3;
        this.postalcode = str4;
        this.country = str5;
    }

    public /* synthetic */ PlacesTypeaheadAddressJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public PlacesTypeaheadAddressJson() {
        this(null, null, null, null, null);
    }
}
