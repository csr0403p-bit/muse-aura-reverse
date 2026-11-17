package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceTokenRevokeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean revoked;

    public final class Companion {
        public final C9hr<DeviceTokenRevokeResponseJson> serializer() {
            return DeviceTokenRevokeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(DeviceTokenRevokeResponseJson deviceTokenRevokeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || deviceTokenRevokeResponseJson.revoked) {
            c9j5.AA7(c9iZ, 0, deviceTokenRevokeResponseJson.revoked);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DeviceTokenRevokeResponseJson) && this.revoked == ((DeviceTokenRevokeResponseJson) obj).revoked);
    }

    public static /* synthetic */ DeviceTokenRevokeResponseJson copy$default(DeviceTokenRevokeResponseJson deviceTokenRevokeResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceTokenRevokeResponseJson.revoked;
        }
        return new DeviceTokenRevokeResponseJson(z);
    }

    public final boolean component1() {
        return this.revoked;
    }

    public final DeviceTokenRevokeResponseJson copy(boolean z) {
        return new DeviceTokenRevokeResponseJson(z);
    }

    public final boolean getRevoked() {
        return this.revoked;
    }

    public int hashCode() {
        return this.revoked ? 1231 : 1237;
    }

    public /* synthetic */ DeviceTokenRevokeResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.revoked = false;
        } else {
            this.revoked = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DeviceTokenRevokeResponseJson(boolean z) {
        this.revoked = z;
    }

    public /* synthetic */ DeviceTokenRevokeResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public DeviceTokenRevokeResponseJson() {
        this(false);
    }
}
