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
public final class DeviceOrderRecipientJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String first_name;
    public final String last_name;

    public final class Companion {
        public final C9hr<DeviceOrderRecipientJson> serializer() {
            return DeviceOrderRecipientJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(DeviceOrderRecipientJson deviceOrderRecipientJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceOrderRecipientJson.first_name, c9iZ, 0);
        c9j5.AAV(deviceOrderRecipientJson.last_name, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrderRecipientJson) {
                DeviceOrderRecipientJson deviceOrderRecipientJson = (DeviceOrderRecipientJson) obj;
                if (!C7384Etj.areEqual(this.first_name, deviceOrderRecipientJson.first_name) || !C7384Etj.areEqual(this.last_name, deviceOrderRecipientJson.last_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceOrderRecipientJson copy$default(DeviceOrderRecipientJson deviceOrderRecipientJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceOrderRecipientJson.first_name;
        }
        if ((i & 2) != 0) {
            str2 = deviceOrderRecipientJson.last_name;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeviceOrderRecipientJson(str, str2);
    }

    public final String component1() {
        return this.first_name;
    }

    public final String component2() {
        return this.last_name;
    }

    public final String getFirst_name() {
        return this.first_name;
    }

    public final String getLast_name() {
        return this.last_name;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.last_name, AnonymousClass001.A0G(this.first_name));
    }

    public DeviceOrderRecipientJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.first_name = str;
        this.last_name = str2;
    }

    public final DeviceOrderRecipientJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeviceOrderRecipientJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceOrderRecipientJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeviceOrderRecipientJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.first_name = str;
        this.last_name = str2;
    }
}
