package com.facebook.aura.pairs;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInviteOpenRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String invitation_url;

    public final class Companion {
        public final C9hr<PeerInviteOpenRequestJson> serializer() {
            return PeerInviteOpenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerInviteOpenRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PeerInviteOpenRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInviteOpenRequestJson) && C7384Etj.areEqual(this.invitation_url, ((PeerInviteOpenRequestJson) obj).invitation_url));
    }

    public /* synthetic */ PeerInviteOpenRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerInviteOpenRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.invitation_url = str;
    }

    public static /* synthetic */ PeerInviteOpenRequestJson copy$default(PeerInviteOpenRequestJson peerInviteOpenRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteOpenRequestJson.invitation_url;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerInviteOpenRequestJson(str);
    }

    public final String component1() {
        return this.invitation_url;
    }

    public final String getInvitation_url() {
        return this.invitation_url;
    }

    public int hashCode() {
        return this.invitation_url.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteOpenRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.invitation_url = str;
    }
}
