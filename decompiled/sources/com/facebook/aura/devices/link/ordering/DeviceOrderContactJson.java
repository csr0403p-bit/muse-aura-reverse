package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceOrderContactJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String email;
    public final String phone;

    public final class Companion {
        public final C9hr<DeviceOrderContactJson> serializer() {
            return DeviceOrderContactJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(DeviceOrderContactJson deviceOrderContactJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceOrderContactJson.email, c9iZ, 0);
        c9j5.AAV(deviceOrderContactJson.phone, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrderContactJson) {
                DeviceOrderContactJson deviceOrderContactJson = (DeviceOrderContactJson) obj;
                if (!C7384Etj.areEqual(this.email, deviceOrderContactJson.email) || !C7384Etj.areEqual(this.phone, deviceOrderContactJson.phone)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceOrderContactJson copy$default(DeviceOrderContactJson deviceOrderContactJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceOrderContactJson.email;
        }
        if ((i & 2) != 0) {
            str2 = deviceOrderContactJson.phone;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeviceOrderContactJson(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.phone;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.phone, AnonymousClass001.A0G(this.email));
    }

    public DeviceOrderContactJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.email = str;
        this.phone = str2;
    }

    public final DeviceOrderContactJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeviceOrderContactJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceOrderContactJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeviceOrderContactJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.email = str;
        this.phone = str2;
    }
}
