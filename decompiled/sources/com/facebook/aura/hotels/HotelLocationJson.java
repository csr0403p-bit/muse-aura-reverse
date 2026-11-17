package com.facebook.aura.hotels;

import X.AGI;
import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HotelLocationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String address_line_1;
    public final String address_line_2;
    public final String city;
    public final String country;
    public final String formatted;
    public final String postal_code;
    public final String province;

    public final class Companion {
        public final C9hr<HotelLocationJson> serializer() {
            return HotelLocationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelLocationJson() {
        this(null, null, null, null, null, null, null);
    }

    public static /* synthetic */ HotelLocationJson copy$default(HotelLocationJson hotelLocationJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            str8 = hotelLocationJson.address_line_1;
        }
        if ((i & 2) != 0) {
            str9 = hotelLocationJson.address_line_2;
        }
        if ((i & 4) != 0) {
            str10 = hotelLocationJson.city;
        }
        if ((i & 8) != 0) {
            str11 = hotelLocationJson.province;
        }
        if ((i & 16) != 0) {
            str12 = hotelLocationJson.postal_code;
        }
        if ((i & 32) != 0) {
            str13 = hotelLocationJson.country;
        }
        if ((i & 64) != 0) {
            str14 = hotelLocationJson.formatted;
        }
        return new HotelLocationJson(str8, str9, str10, str11, str12, str13, str14);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelLocationJson hotelLocationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelLocationJson.address_line_1 != null) {
            c9j5.AAP(hotelLocationJson.address_line_1, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hotelLocationJson.address_line_2 != null) {
            c9j5.AAP(hotelLocationJson.address_line_2, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hotelLocationJson.city != null) {
            c9j5.AAP(hotelLocationJson.city, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hotelLocationJson.province != null) {
            c9j5.AAP(hotelLocationJson.province, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hotelLocationJson.postal_code != null) {
            c9j5.AAP(hotelLocationJson.postal_code, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hotelLocationJson.country != null) {
            c9j5.AAP(hotelLocationJson.country, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || hotelLocationJson.formatted != null) {
            c9j5.AAP(hotelLocationJson.formatted, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelLocationJson) {
                HotelLocationJson hotelLocationJson = (HotelLocationJson) obj;
                if (!C7384Etj.areEqual(this.address_line_1, hotelLocationJson.address_line_1) || !C7384Etj.areEqual(this.address_line_2, hotelLocationJson.address_line_2) || !C7384Etj.areEqual(this.city, hotelLocationJson.city) || !C7384Etj.areEqual(this.province, hotelLocationJson.province) || !C7384Etj.areEqual(this.postal_code, hotelLocationJson.postal_code) || !C7384Etj.areEqual(this.country, hotelLocationJson.country) || !C7384Etj.areEqual(this.formatted, hotelLocationJson.formatted)) {
                }
            }
            return false;
        }
        return true;
    }

    public final AHD<String> addressLines() {
        return AGI.A07(BFI.A0F(new String[]{HotelResultModelsKt.hotelNonBlank(this.address_line_1), HotelResultModelsKt.hotelNonBlank(this.address_line_2), HotelResultModelsKt.hotelNonBlank(C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, BFI.A0F(new String[]{HotelResultModelsKt.hotelNonBlank(this.city), HotelResultModelsKt.hotelNonBlank(this.province), HotelResultModelsKt.hotelNonBlank(this.postal_code)})))}));
    }

    public final String component1() {
        return this.address_line_1;
    }

    public final String component2() {
        return this.address_line_2;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.province;
    }

    public final String component5() {
        return this.postal_code;
    }

    public final String component6() {
        return this.country;
    }

    public final String component7() {
        return this.formatted;
    }

    public final HotelLocationJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new HotelLocationJson(str, str2, str3, str4, str5, str6, str7);
    }

    public final String getAddress_line_1() {
        return this.address_line_1;
    }

    public final String getAddress_line_2() {
        return this.address_line_2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public final String getPostal_code() {
        return this.postal_code;
    }

    public final String getProvince() {
        return this.province;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0G(this.address_line_1) * 31) + AnonymousClass006.A0G(this.address_line_2)) * 31) + AnonymousClass006.A0G(this.city)) * 31) + AnonymousClass006.A0G(this.province)) * 31) + AnonymousClass006.A0G(this.postal_code)) * 31) + AnonymousClass006.A0G(this.country)) * 31) + AnonymousClass005.A0H(this.formatted);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelLocationJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.address_line_1 = null;
        } else {
            this.address_line_1 = str;
        }
        if ((i & 2) == 0) {
            this.address_line_2 = null;
        } else {
            this.address_line_2 = str2;
        }
        if ((i & 4) == 0) {
            this.city = null;
        } else {
            this.city = str3;
        }
        if ((i & 8) == 0) {
            this.province = null;
        } else {
            this.province = str4;
        }
        if ((i & 16) == 0) {
            this.postal_code = null;
        } else {
            this.postal_code = str5;
        }
        if ((i & 32) == 0) {
            this.country = null;
        } else {
            this.country = str6;
        }
        if ((i & 64) == 0) {
            this.formatted = null;
        } else {
            this.formatted = str7;
        }
    }

    public HotelLocationJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.address_line_1 = str;
        this.address_line_2 = str2;
        this.city = str3;
        this.province = str4;
        this.postal_code = str5;
        this.country = str6;
        this.formatted = str7;
    }

    public /* synthetic */ HotelLocationJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
