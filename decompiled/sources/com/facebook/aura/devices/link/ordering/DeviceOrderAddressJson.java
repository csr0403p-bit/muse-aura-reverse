package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeviceOrderAddressJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String city;
    public final String country;
    public final String postal_code;
    public final String state;
    public final String street1;
    public final String street2;

    public final class Companion {
        public final C9hr<DeviceOrderAddressJson> serializer() {
            return DeviceOrderAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(DeviceOrderAddressJson deviceOrderAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceOrderAddressJson.street1, c9iZ, 0);
        c9j5.AAV(deviceOrderAddressJson.city, c9iZ, 1);
        c9j5.AAV(deviceOrderAddressJson.state, c9iZ, 2);
        c9j5.AAV(deviceOrderAddressJson.postal_code, c9iZ, 3);
        c9j5.AAV(deviceOrderAddressJson.country, c9iZ, 4);
        if (c9j5.AfR() || deviceOrderAddressJson.street2 != null) {
            c9j5.AAP(deviceOrderAddressJson.street2, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrderAddressJson) {
                DeviceOrderAddressJson deviceOrderAddressJson = (DeviceOrderAddressJson) obj;
                if (!C7384Etj.areEqual(this.street1, deviceOrderAddressJson.street1) || !C7384Etj.areEqual(this.city, deviceOrderAddressJson.city) || !C7384Etj.areEqual(this.state, deviceOrderAddressJson.state) || !C7384Etj.areEqual(this.postal_code, deviceOrderAddressJson.postal_code) || !C7384Etj.areEqual(this.country, deviceOrderAddressJson.country) || !C7384Etj.areEqual(this.street2, deviceOrderAddressJson.street2)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DeviceOrderAddressJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(DeviceOrderAddressJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.street1 = str;
        this.city = str2;
        this.state = str3;
        this.postal_code = str4;
        this.country = str5;
        this.street2 = (i & 32) == 0 ? null : str6;
    }

    public static /* synthetic */ DeviceOrderAddressJson copy$default(DeviceOrderAddressJson deviceOrderAddressJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceOrderAddressJson.street1;
        }
        if ((i & 2) != 0) {
            str2 = deviceOrderAddressJson.city;
        }
        if ((i & 4) != 0) {
            str3 = deviceOrderAddressJson.state;
        }
        if ((i & 8) != 0) {
            str4 = deviceOrderAddressJson.postal_code;
        }
        if ((i & 16) != 0) {
            str5 = deviceOrderAddressJson.country;
        }
        if ((i & 32) != 0) {
            str6 = deviceOrderAddressJson.street2;
        }
        return deviceOrderAddressJson.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.street1;
    }

    public final String component2() {
        return this.city;
    }

    public final String component3() {
        return this.state;
    }

    public final String component4() {
        return this.postal_code;
    }

    public final String component5() {
        return this.country;
    }

    public final String component6() {
        return this.street2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
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
        return AnonymousClass005.A0I(this.country, AnonymousClass005.A0I(this.postal_code, AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.city, AnonymousClass001.A0G(this.street1))))) + AnonymousClass006.A0G(this.street2);
    }

    public final DeviceOrderAddressJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new DeviceOrderAddressJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public DeviceOrderAddressJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.street1 = str;
        this.city = str2;
        this.state = str3;
        this.postal_code = str4;
        this.country = str5;
        this.street2 = str6;
    }

    public /* synthetic */ DeviceOrderAddressJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6);
    }
}
