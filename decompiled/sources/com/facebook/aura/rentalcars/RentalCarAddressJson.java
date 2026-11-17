package com.facebook.aura.rentalcars;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarAddressJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String city_name;
    public final String country_code;
    public final String line_one;
    public final String region;

    public final class Companion {
        public final C9hr<RentalCarAddressJson> serializer() {
            return RentalCarAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarAddressJson rentalCarAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || rentalCarAddressJson.line_one != null) {
            c9j5.AAP(rentalCarAddressJson.line_one, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || rentalCarAddressJson.city_name != null) {
            c9j5.AAP(rentalCarAddressJson.city_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || rentalCarAddressJson.region != null) {
            c9j5.AAP(rentalCarAddressJson.region, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || rentalCarAddressJson.country_code != null) {
            c9j5.AAP(rentalCarAddressJson.country_code, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarAddressJson) {
                RentalCarAddressJson rentalCarAddressJson = (RentalCarAddressJson) obj;
                if (!C7384Etj.areEqual(this.line_one, rentalCarAddressJson.line_one) || !C7384Etj.areEqual(this.city_name, rentalCarAddressJson.city_name) || !C7384Etj.areEqual(this.region, rentalCarAddressJson.region) || !C7384Etj.areEqual(this.country_code, rentalCarAddressJson.country_code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarAddressJson copy$default(RentalCarAddressJson rentalCarAddressJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarAddressJson.line_one;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarAddressJson.city_name;
        }
        if ((i & 4) != 0) {
            str3 = rentalCarAddressJson.region;
        }
        if ((i & 8) != 0) {
            str4 = rentalCarAddressJson.country_code;
        }
        return new RentalCarAddressJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.line_one;
    }

    public final String component2() {
        return this.city_name;
    }

    public final String component3() {
        return this.region;
    }

    public final String component4() {
        return this.country_code;
    }

    public final RentalCarAddressJson copy(String str, String str2, String str3, String str4) {
        return new RentalCarAddressJson(str, str2, str3, str4);
    }

    public final String formatted() {
        String str = this.city_name;
        String strA0q = str != null ? C60O.A0q(AnonymousClass002.A0l(str)) : null;
        String str2 = this.region;
        String strA0L = AbstractC0878AGe.A0L(", ", "", "", C60Q.A0v(strA0q, str2 != null ? C60O.A0q(AnonymousClass002.A0l(str2)) : null), null);
        String str3 = this.line_one;
        return C60O.A0q(AnonymousClass002.A0l(AbstractC0878AGe.A0L(", ", "", "", C60Q.A0v(str3 != null ? C60O.A0q(AnonymousClass002.A0l(str3)) : null, C60O.A0q(AnonymousClass002.A0l(strA0L))), null)));
    }

    public final String getCity_name() {
        return this.city_name;
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final String getLine_one() {
        return this.line_one;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.line_one) * 31) + AnonymousClass006.A0G(this.city_name)) * 31) + AnonymousClass006.A0G(this.region)) * 31) + AnonymousClass005.A0H(this.country_code);
    }

    public /* synthetic */ RentalCarAddressJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.line_one = null;
        } else {
            this.line_one = str;
        }
        if ((i & 2) == 0) {
            this.city_name = null;
        } else {
            this.city_name = str2;
        }
        if ((i & 4) == 0) {
            this.region = null;
        } else {
            this.region = str3;
        }
        if ((i & 8) == 0) {
            this.country_code = null;
        } else {
            this.country_code = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RentalCarAddressJson(String str, String str2, String str3, String str4) {
        this.line_one = str;
        this.city_name = str2;
        this.region = str3;
        this.country_code = str4;
    }

    public /* synthetic */ RentalCarAddressJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public RentalCarAddressJson() {
        this(null, null, null, null);
    }
}
