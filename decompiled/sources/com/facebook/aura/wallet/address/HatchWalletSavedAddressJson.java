package com.facebook.aura.wallet.address;

import X.AnonymousClass001;
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
/* loaded from: classes2.dex */
public final class HatchWalletSavedAddressJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String city;
    public final String country;
    public final String id;
    public final String postal_code;
    public final String state;
    public final String street1;
    public final String street2;

    public final class Companion {
        public final C9hr<HatchWalletSavedAddressJson> serializer() {
            return HatchWalletSavedAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchWalletSavedAddressJson() {
        this(null, "", null, "", "", "", "");
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_wallet_address_address(HatchWalletSavedAddressJson hatchWalletSavedAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchWalletSavedAddressJson.id != null) {
            c9j5.AAP(hatchWalletSavedAddressJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !"".equals(hatchWalletSavedAddressJson.street1)) {
            c9j5.AAV(hatchWalletSavedAddressJson.street1, c9iZ, 1);
        }
        if (zAfR || hatchWalletSavedAddressJson.street2 != null) {
            c9j5.AAP(hatchWalletSavedAddressJson.street2, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !"".equals(hatchWalletSavedAddressJson.city)) {
            c9j5.AAV(hatchWalletSavedAddressJson.city, c9iZ, 3);
        }
        if (zAfR || !"".equals(hatchWalletSavedAddressJson.state)) {
            c9j5.AAV(hatchWalletSavedAddressJson.state, c9iZ, 4);
        }
        if (zAfR || !"".equals(hatchWalletSavedAddressJson.postal_code)) {
            c9j5.AAV(hatchWalletSavedAddressJson.postal_code, c9iZ, 5);
        }
        if (zAfR || !"".equals(hatchWalletSavedAddressJson.country)) {
            c9j5.AAV(hatchWalletSavedAddressJson.country, c9iZ, 6);
        }
    }

    public final HatchWalletSavedAddressJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A16(str2, str4, str5, str6, 1);
        C7384Etj.A0Y(str7, 6);
        return new HatchWalletSavedAddressJson(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchWalletSavedAddressJson) {
                HatchWalletSavedAddressJson hatchWalletSavedAddressJson = (HatchWalletSavedAddressJson) obj;
                if (!C7384Etj.areEqual(this.id, hatchWalletSavedAddressJson.id) || !C7384Etj.areEqual(this.street1, hatchWalletSavedAddressJson.street1) || !C7384Etj.areEqual(this.street2, hatchWalletSavedAddressJson.street2) || !C7384Etj.areEqual(this.city, hatchWalletSavedAddressJson.city) || !C7384Etj.areEqual(this.state, hatchWalletSavedAddressJson.state) || !C7384Etj.areEqual(this.postal_code, hatchWalletSavedAddressJson.postal_code) || !C7384Etj.areEqual(this.country, hatchWalletSavedAddressJson.country)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchWalletSavedAddressJson copy$default(HatchWalletSavedAddressJson hatchWalletSavedAddressJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchWalletSavedAddressJson.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchWalletSavedAddressJson.street1;
        }
        if ((i & 4) != 0) {
            str3 = hatchWalletSavedAddressJson.street2;
        }
        if ((i & 8) != 0) {
            str4 = hatchWalletSavedAddressJson.city;
        }
        if ((i & 16) != 0) {
            str5 = hatchWalletSavedAddressJson.state;
        }
        if ((i & 32) != 0) {
            str6 = hatchWalletSavedAddressJson.postal_code;
        }
        if ((i & 64) != 0) {
            str7 = hatchWalletSavedAddressJson.country;
        }
        return hatchWalletSavedAddressJson.copy(str, str2, str3, str4, str5, str6, str7);
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
        return this.postal_code;
    }

    public final String component7() {
        return this.country;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPostal_code() {
        return this.postal_code;
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
        return AnonymousClass001.A0H(this.country, AnonymousClass005.A0I(this.postal_code, AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.city, (AnonymousClass005.A0I(this.street1, AnonymousClass006.A0G(this.id) * 31) + AnonymousClass005.A0H(this.street2)) * 31))));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchWalletSavedAddressJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.street1 = "";
        } else {
            this.street1 = str2;
        }
        if ((i & 4) == 0) {
            this.street2 = null;
        } else {
            this.street2 = str3;
        }
        if ((i & 8) == 0) {
            this.city = "";
        } else {
            this.city = str4;
        }
        if ((i & 16) == 0) {
            this.state = "";
        } else {
            this.state = str5;
        }
        if ((i & 32) == 0) {
            this.postal_code = "";
        } else {
            this.postal_code = str6;
        }
        if ((i & 64) == 0) {
            this.country = "";
        } else {
            this.country = str7;
        }
    }

    public HatchWalletSavedAddressJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A16(str2, str4, str5, str6, 1);
        C7384Etj.A0Y(str7, 6);
        this.id = str;
        this.street1 = str2;
        this.street2 = str3;
        this.city = str4;
        this.state = str5;
        this.postal_code = str6;
        this.country = str7;
    }

    public /* synthetic */ HatchWalletSavedAddressJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
