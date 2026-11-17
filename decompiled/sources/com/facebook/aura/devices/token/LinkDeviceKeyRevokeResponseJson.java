package com.facebook.aura.devices.token;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkDeviceKeyRevokeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int revoked;

    public final class Companion {
        public final C9hr<LinkDeviceKeyRevokeResponseJson> serializer() {
            return LinkDeviceKeyRevokeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyRevokeResponseJson linkDeviceKeyRevokeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || linkDeviceKeyRevokeResponseJson.revoked != 0) {
            c9j5.AAK(c9iZ, 0, linkDeviceKeyRevokeResponseJson.revoked);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LinkDeviceKeyRevokeResponseJson) && this.revoked == ((LinkDeviceKeyRevokeResponseJson) obj).revoked);
    }

    public static /* synthetic */ LinkDeviceKeyRevokeResponseJson copy$default(LinkDeviceKeyRevokeResponseJson linkDeviceKeyRevokeResponseJson, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = linkDeviceKeyRevokeResponseJson.revoked;
        }
        return new LinkDeviceKeyRevokeResponseJson(i);
    }

    public final int component1() {
        return this.revoked;
    }

    public final LinkDeviceKeyRevokeResponseJson copy(int i) {
        return new LinkDeviceKeyRevokeResponseJson(i);
    }

    public final int getRevoked() {
        return this.revoked;
    }

    public int hashCode() {
        return this.revoked;
    }

    public /* synthetic */ LinkDeviceKeyRevokeResponseJson(int i, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.revoked = 0;
        } else {
            this.revoked = i2;
        }
    }

    public String toString() {
        return super.toString();
    }

    public LinkDeviceKeyRevokeResponseJson(int i) {
        this.revoked = i;
    }

    public /* synthetic */ LinkDeviceKeyRevokeResponseJson(int i, int i2, C06H c06h) {
        this(C3cI.A00(i2, i));
    }

    public LinkDeviceKeyRevokeResponseJson() {
        this(0);
    }
}
