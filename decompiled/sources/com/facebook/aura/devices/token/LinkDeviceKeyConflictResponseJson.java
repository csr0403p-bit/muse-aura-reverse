package com.facebook.aura.devices.token;

import X.AnonymousClass006;
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
public final class LinkDeviceKeyConflictResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final LinkDeviceKeyRecordJson existing;

    public final class Companion {
        public final C9hr<LinkDeviceKeyConflictResponseJson> serializer() {
            return LinkDeviceKeyConflictResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(LinkDeviceKeyConflictResponseJson linkDeviceKeyConflictResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || linkDeviceKeyConflictResponseJson.existing != null) {
            c9j5.AAP(linkDeviceKeyConflictResponseJson.existing, LinkDeviceKeyRecordJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LinkDeviceKeyConflictResponseJson) && C7384Etj.areEqual(this.existing, ((LinkDeviceKeyConflictResponseJson) obj).existing));
    }

    public static /* synthetic */ LinkDeviceKeyConflictResponseJson copy$default(LinkDeviceKeyConflictResponseJson linkDeviceKeyConflictResponseJson, LinkDeviceKeyRecordJson linkDeviceKeyRecordJson, int i, Object obj) {
        if ((i & 1) != 0) {
            linkDeviceKeyRecordJson = linkDeviceKeyConflictResponseJson.existing;
        }
        return new LinkDeviceKeyConflictResponseJson(linkDeviceKeyRecordJson);
    }

    public final LinkDeviceKeyRecordJson component1() {
        return this.existing;
    }

    public final LinkDeviceKeyConflictResponseJson copy(LinkDeviceKeyRecordJson linkDeviceKeyRecordJson) {
        return new LinkDeviceKeyConflictResponseJson(linkDeviceKeyRecordJson);
    }

    public final LinkDeviceKeyRecordJson getExisting() {
        return this.existing;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.existing);
    }

    public /* synthetic */ LinkDeviceKeyConflictResponseJson(int i, LinkDeviceKeyRecordJson linkDeviceKeyRecordJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.existing = null;
        } else {
            this.existing = linkDeviceKeyRecordJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public LinkDeviceKeyConflictResponseJson(LinkDeviceKeyRecordJson linkDeviceKeyRecordJson) {
        this.existing = linkDeviceKeyRecordJson;
    }

    public /* synthetic */ LinkDeviceKeyConflictResponseJson(LinkDeviceKeyRecordJson linkDeviceKeyRecordJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : linkDeviceKeyRecordJson);
    }

    public LinkDeviceKeyConflictResponseJson() {
        this(null);
    }
}
