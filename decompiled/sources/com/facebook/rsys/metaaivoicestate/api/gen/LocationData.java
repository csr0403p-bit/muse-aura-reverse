package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LocationData {
    public static G50<LocationData> CONVERTER = C8921Ftd.A00(8);
    public static long sMcfTypeId;
    public final String cityName;
    public final String countryName;
    public final String latitude;
    public final String locale;
    public final String longitude;
    public final String regionName;
    public final String serializedAddress;
    public final String userCountry;
    public final String userTimezone;

    public static native LocationData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationData) {
                LocationData locationData = (LocationData) obj;
                String str = this.locale;
                String str2 = locationData.locale;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.userTimezone;
                    String str4 = locationData.userTimezone;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    String str5 = this.latitude;
                    String str6 = locationData.latitude;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                    String str7 = this.longitude;
                    String str8 = locationData.longitude;
                    if (str7 == null) {
                        if (str8 != null) {
                            return false;
                        }
                    } else if (str7.equals(str8)) {
                    }
                    String str9 = this.serializedAddress;
                    String str10 = locationData.serializedAddress;
                    if (str9 == null) {
                        if (str10 != null) {
                            return false;
                        }
                    } else if (str9.equals(str10)) {
                    }
                    String str11 = this.cityName;
                    String str12 = locationData.cityName;
                    if (str11 == null) {
                        if (str12 != null) {
                            return false;
                        }
                    } else if (str11.equals(str12)) {
                    }
                    String str13 = this.countryName;
                    String str14 = locationData.countryName;
                    if (str13 == null) {
                        if (str14 != null) {
                            return false;
                        }
                    } else if (str13.equals(str14)) {
                    }
                    String str15 = this.regionName;
                    String str16 = locationData.regionName;
                    if (str15 == null) {
                        if (str16 != null) {
                            return false;
                        }
                    } else if (str15.equals(str16)) {
                    }
                    String str17 = this.userCountry;
                    String str18 = locationData.userCountry;
                    if (str17 == null) {
                        if (str18 != null) {
                            return false;
                        }
                    } else if (str17.equals(str18)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.locale)) + AnonymousClass006.A0G(this.userTimezone)) * 31) + AnonymousClass006.A0G(this.latitude)) * 31) + AnonymousClass006.A0G(this.longitude)) * 31) + AnonymousClass006.A0G(this.serializedAddress)) * 31) + AnonymousClass006.A0G(this.cityName)) * 31) + AnonymousClass006.A0G(this.countryName)) * 31) + AnonymousClass006.A0G(this.regionName)) * 31) + AnonymousClass005.A0H(this.userCountry);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("LocationData{locale=");
        sbA0x.append(this.locale);
        sbA0x.append(",userTimezone=");
        sbA0x.append(this.userTimezone);
        sbA0x.append(",latitude=");
        sbA0x.append(this.latitude);
        sbA0x.append(",longitude=");
        sbA0x.append(this.longitude);
        sbA0x.append(",serializedAddress=");
        sbA0x.append(this.serializedAddress);
        sbA0x.append(",cityName=");
        sbA0x.append(this.cityName);
        sbA0x.append(",countryName=");
        sbA0x.append(this.countryName);
        sbA0x.append(",regionName=");
        sbA0x.append(this.regionName);
        sbA0x.append(",userCountry=");
        return AbstractC7610F5x.A0w(this.userCountry, sbA0x);
    }

    public LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.locale = str;
        this.userTimezone = str2;
        this.latitude = str3;
        this.longitude = str4;
        this.serializedAddress = str5;
        this.cityName = str6;
        this.countryName = str7;
        this.regionName = str8;
        this.userCountry = str9;
    }
}
