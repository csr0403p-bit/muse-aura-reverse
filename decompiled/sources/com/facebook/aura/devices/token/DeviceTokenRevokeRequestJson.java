package com.facebook.aura.devices.token;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceTokenRevokeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_id;

    public final class Companion {
        public final C9hr<DeviceTokenRevokeRequestJson> serializer() {
            return DeviceTokenRevokeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final DeviceTokenRevokeRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new DeviceTokenRevokeRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DeviceTokenRevokeRequestJson) && C7384Etj.areEqual(this.device_id, ((DeviceTokenRevokeRequestJson) obj).device_id));
    }

    public /* synthetic */ DeviceTokenRevokeRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(DeviceTokenRevokeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.device_id = str;
    }

    public static /* synthetic */ DeviceTokenRevokeRequestJson copy$default(DeviceTokenRevokeRequestJson deviceTokenRevokeRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceTokenRevokeRequestJson.device_id;
        }
        C7384Etj.A0Y(str, 0);
        return new DeviceTokenRevokeRequestJson(str);
    }

    public final String component1() {
        return this.device_id;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public int hashCode() {
        return this.device_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public DeviceTokenRevokeRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.device_id = str;
    }
}
