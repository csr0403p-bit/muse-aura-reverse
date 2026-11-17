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
public final class PeerInviteAcceptRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String fragment;

    public final class Companion {
        public final C9hr<PeerInviteAcceptRequestJson> serializer() {
            return PeerInviteAcceptRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerInviteAcceptRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PeerInviteAcceptRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInviteAcceptRequestJson) && C7384Etj.areEqual(this.fragment, ((PeerInviteAcceptRequestJson) obj).fragment));
    }

    public /* synthetic */ PeerInviteAcceptRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerInviteAcceptRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.fragment = str;
    }

    public static /* synthetic */ PeerInviteAcceptRequestJson copy$default(PeerInviteAcceptRequestJson peerInviteAcceptRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteAcceptRequestJson.fragment;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerInviteAcceptRequestJson(str);
    }

    public final String component1() {
        return this.fragment;
    }

    public final String getFragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.fragment.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteAcceptRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.fragment = str;
    }
}
