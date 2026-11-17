package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInvitePendingSenderJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;

    public final class Companion {
        public final C9hr<PeerInvitePendingSenderJson> serializer() {
            return PeerInvitePendingSenderJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInvitePendingSenderJson peerInvitePendingSenderJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || peerInvitePendingSenderJson.display_name != null) {
            c9j5.AAP(peerInvitePendingSenderJson.display_name, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInvitePendingSenderJson) && C7384Etj.areEqual(this.display_name, ((PeerInvitePendingSenderJson) obj).display_name));
    }

    public static /* synthetic */ PeerInvitePendingSenderJson copy$default(PeerInvitePendingSenderJson peerInvitePendingSenderJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInvitePendingSenderJson.display_name;
        }
        return new PeerInvitePendingSenderJson(str);
    }

    public final String component1() {
        return this.display_name;
    }

    public final PeerInvitePendingSenderJson copy(String str) {
        return new PeerInvitePendingSenderJson(str);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.display_name);
    }

    public /* synthetic */ PeerInvitePendingSenderJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerInvitePendingSenderJson(String str) {
        this.display_name = str;
    }

    public /* synthetic */ PeerInvitePendingSenderJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public PeerInvitePendingSenderJson() {
        this(null);
    }
}
