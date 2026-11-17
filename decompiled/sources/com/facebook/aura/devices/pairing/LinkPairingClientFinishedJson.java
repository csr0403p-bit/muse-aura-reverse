package com.facebook.aura.devices.pairing;

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
public final class LinkPairingClientFinishedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;

    public final class Companion {
        public final C9hr<LinkPairingClientFinishedJson> serializer() {
            return LinkPairingClientFinishedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkPairingClientFinishedJson linkPairingClientFinishedJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !LinkPairingProtocolStrings.ACTION_CLIENT_FINISHED.equals(linkPairingClientFinishedJson.action)) {
            c9j5.AAV(linkPairingClientFinishedJson.action, c9iZ, 0);
        }
    }

    public final LinkPairingClientFinishedJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new LinkPairingClientFinishedJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LinkPairingClientFinishedJson) && C7384Etj.areEqual(this.action, ((LinkPairingClientFinishedJson) obj).action));
    }

    public static /* synthetic */ LinkPairingClientFinishedJson copy$default(LinkPairingClientFinishedJson linkPairingClientFinishedJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkPairingClientFinishedJson.action;
        }
        C7384Etj.A0Y(str, 0);
        return new LinkPairingClientFinishedJson(str);
    }

    public final String component1() {
        return this.action;
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public /* synthetic */ LinkPairingClientFinishedJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.action = LinkPairingProtocolStrings.ACTION_CLIENT_FINISHED;
        } else {
            this.action = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public LinkPairingClientFinishedJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.action = str;
    }

    public /* synthetic */ LinkPairingClientFinishedJson(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? LinkPairingProtocolStrings.ACTION_CLIENT_FINISHED : str);
    }

    public LinkPairingClientFinishedJson() {
        this(LinkPairingProtocolStrings.ACTION_CLIENT_FINISHED);
    }
}
