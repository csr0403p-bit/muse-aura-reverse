package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceTokenMintResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String refresh_token;

    public final class Companion {
        public final C9hr<DeviceTokenMintResponseJson> serializer() {
            return DeviceTokenMintResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(DeviceTokenMintResponseJson deviceTokenMintResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(deviceTokenMintResponseJson.access_token)) {
            c9j5.AAV(deviceTokenMintResponseJson.access_token, c9iZ, 0);
        }
        if (zAfR || !"".equals(deviceTokenMintResponseJson.refresh_token)) {
            c9j5.AAV(deviceTokenMintResponseJson.refresh_token, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceTokenMintResponseJson) {
                DeviceTokenMintResponseJson deviceTokenMintResponseJson = (DeviceTokenMintResponseJson) obj;
                if (!C7384Etj.areEqual(this.access_token, deviceTokenMintResponseJson.access_token) || !C7384Etj.areEqual(this.refresh_token, deviceTokenMintResponseJson.refresh_token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceTokenMintResponseJson copy$default(DeviceTokenMintResponseJson deviceTokenMintResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceTokenMintResponseJson.access_token;
        }
        if ((i & 2) != 0) {
            str2 = deviceTokenMintResponseJson.refresh_token;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeviceTokenMintResponseJson(str, str2);
    }

    public final String component1() {
        return this.access_token;
    }

    public final String component2() {
        return this.refresh_token;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.refresh_token, AnonymousClass001.A0G(this.access_token));
    }

    public DeviceTokenMintResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.access_token = str;
        this.refresh_token = str2;
    }

    public final DeviceTokenMintResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeviceTokenMintResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceTokenMintResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.access_token = "";
        } else {
            this.access_token = str;
        }
        if ((i & 2) == 0) {
            this.refresh_token = "";
        } else {
            this.refresh_token = str2;
        }
    }

    public /* synthetic */ DeviceTokenMintResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public DeviceTokenMintResponseJson() {
        this("", "");
    }
}
