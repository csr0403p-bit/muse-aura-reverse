package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DeviceTokenMintRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long abra_device_app_fbid;
    public final String device_id;
    public final String sdk_token;

    public final class Companion {
        public final C9hr<DeviceTokenMintRequestJson> serializer() {
            return DeviceTokenMintRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DeviceTokenMintRequestJson(String str, String str2, long j) {
        C7384Etj.A0Y(str, 0);
        this.device_id = str;
        this.sdk_token = str2;
        this.abra_device_app_fbid = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(DeviceTokenMintRequestJson deviceTokenMintRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceTokenMintRequestJson.device_id, c9iZ, 0);
        if (c9j5.AfR() || deviceTokenMintRequestJson.sdk_token != null) {
            c9j5.AAP(deviceTokenMintRequestJson.sdk_token, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAN(c9iZ, 2, deviceTokenMintRequestJson.abra_device_app_fbid);
    }

    public final DeviceTokenMintRequestJson copy(String str, String str2, long j) {
        C7384Etj.A0Y(str, 0);
        return new DeviceTokenMintRequestJson(str, str2, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceTokenMintRequestJson) {
                DeviceTokenMintRequestJson deviceTokenMintRequestJson = (DeviceTokenMintRequestJson) obj;
                if (!C7384Etj.areEqual(this.device_id, deviceTokenMintRequestJson.device_id) || !C7384Etj.areEqual(this.sdk_token, deviceTokenMintRequestJson.sdk_token) || this.abra_device_app_fbid != deviceTokenMintRequestJson.abra_device_app_fbid) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceTokenMintRequestJson copy$default(DeviceTokenMintRequestJson deviceTokenMintRequestJson, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceTokenMintRequestJson.device_id;
        }
        if ((i & 2) != 0) {
            str2 = deviceTokenMintRequestJson.sdk_token;
        }
        if ((i & 4) != 0) {
            j = deviceTokenMintRequestJson.abra_device_app_fbid;
        }
        return deviceTokenMintRequestJson.copy(str, str2, j);
    }

    public final String component1() {
        return this.device_id;
    }

    public final String component2() {
        return this.sdk_token;
    }

    public final long component3() {
        return this.abra_device_app_fbid;
    }

    public final long getAbra_device_app_fbid() {
        return this.abra_device_app_fbid;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getSdk_token() {
        return this.sdk_token;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.abra_device_app_fbid, (AnonymousClass001.A0G(this.device_id) + AnonymousClass006.A0G(this.sdk_token)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceTokenMintRequestJson(int i, String str, String str2, long j, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(DeviceTokenMintRequestJson$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.device_id = str;
        this.sdk_token = C8j4.A0t(i, str2);
        this.abra_device_app_fbid = j;
    }

    public /* synthetic */ DeviceTokenMintRequestJson(String str, String str2, long j, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), j);
    }
}
