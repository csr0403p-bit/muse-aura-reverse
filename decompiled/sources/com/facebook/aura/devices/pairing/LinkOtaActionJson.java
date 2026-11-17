package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
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
public final class LinkOtaActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;
    public final boolean force;
    public final String url;

    public final class Companion {
        public final C9hr<LinkOtaActionJson> serializer() {
            return LinkOtaActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkOtaActionJson linkOtaActionJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !LinkPairingProtocolStrings.ACTION_OTA.equals(linkOtaActionJson.action)) {
            c9j5.AAV(linkOtaActionJson.action, c9iZ, 0);
        }
        c9j5.AAV(linkOtaActionJson.url, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, linkOtaActionJson.force);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkOtaActionJson) {
                LinkOtaActionJson linkOtaActionJson = (LinkOtaActionJson) obj;
                if (!C7384Etj.areEqual(this.action, linkOtaActionJson.action) || !C7384Etj.areEqual(this.url, linkOtaActionJson.url) || this.force != linkOtaActionJson.force) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkOtaActionJson copy$default(LinkOtaActionJson linkOtaActionJson, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkOtaActionJson.action;
        }
        if ((i & 2) != 0) {
            str2 = linkOtaActionJson.url;
        }
        if ((i & 4) != 0) {
            z = linkOtaActionJson.force;
        }
        return linkOtaActionJson.copy(str, str2, z);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.url;
    }

    public final boolean component3() {
        return this.force;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean getForce() {
        return this.force;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.action)), this.force);
    }

    public LinkOtaActionJson(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.action = str;
        this.url = str2;
        this.force = z;
    }

    public final LinkOtaActionJson copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new LinkOtaActionJson(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkOtaActionJson(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (6 != (i & 6)) {
            C9iI.A00(LinkOtaActionJson$$serializer.descriptor, i, 6);
            throw F60.createAndThrow();
        }
        this.action = (i & 1) == 0 ? LinkPairingProtocolStrings.ACTION_OTA : str;
        this.url = str2;
        this.force = z;
    }

    public /* synthetic */ LinkOtaActionJson(String str, String str2, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? LinkPairingProtocolStrings.ACTION_OTA : str, str2, z);
    }
}
