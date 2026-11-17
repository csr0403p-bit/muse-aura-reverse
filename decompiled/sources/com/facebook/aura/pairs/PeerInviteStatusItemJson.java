package com.facebook.aura.pairs;

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
/* loaded from: classes3.dex */
public final class PeerInviteStatusItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String delivery_id;
    public final String state;

    public final class Companion {
        public final C9hr<PeerInviteStatusItemJson> serializer() {
            return PeerInviteStatusItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteStatusItemJson peerInviteStatusItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerInviteStatusItemJson.delivery_id)) {
            c9j5.AAV(peerInviteStatusItemJson.delivery_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(peerInviteStatusItemJson.state)) {
            c9j5.AAV(peerInviteStatusItemJson.state, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteStatusItemJson) {
                PeerInviteStatusItemJson peerInviteStatusItemJson = (PeerInviteStatusItemJson) obj;
                if (!C7384Etj.areEqual(this.delivery_id, peerInviteStatusItemJson.delivery_id) || !C7384Etj.areEqual(this.state, peerInviteStatusItemJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInviteStatusItemJson copy$default(PeerInviteStatusItemJson peerInviteStatusItemJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteStatusItemJson.delivery_id;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteStatusItemJson.state;
        }
        AnonymousClass003.A0u(str, str2);
        return new PeerInviteStatusItemJson(str, str2);
    }

    public final String component1() {
        return this.delivery_id;
    }

    public final String component2() {
        return this.state;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.state, AnonymousClass001.A0G(this.delivery_id));
    }

    public PeerInviteStatusItemJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.delivery_id = str;
        this.state = str2;
    }

    public final PeerInviteStatusItemJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PeerInviteStatusItemJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteStatusItemJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.delivery_id = "";
        } else {
            this.delivery_id = str;
        }
        if ((i & 2) == 0) {
            this.state = "";
        } else {
            this.state = str2;
        }
    }

    public /* synthetic */ PeerInviteStatusItemJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public PeerInviteStatusItemJson() {
        this("", "");
    }
}
