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
public final class PeerInviteAcceptResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String muse_id;
    public final String relationship_generation_id;

    public final class Companion {
        public final C9hr<PeerInviteAcceptResponseJson> serializer() {
            return PeerInviteAcceptResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteAcceptResponseJson peerInviteAcceptResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerInviteAcceptResponseJson.muse_id)) {
            c9j5.AAV(peerInviteAcceptResponseJson.muse_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(peerInviteAcceptResponseJson.relationship_generation_id)) {
            c9j5.AAV(peerInviteAcceptResponseJson.relationship_generation_id, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteAcceptResponseJson) {
                PeerInviteAcceptResponseJson peerInviteAcceptResponseJson = (PeerInviteAcceptResponseJson) obj;
                if (!C7384Etj.areEqual(this.muse_id, peerInviteAcceptResponseJson.muse_id) || !C7384Etj.areEqual(this.relationship_generation_id, peerInviteAcceptResponseJson.relationship_generation_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInviteAcceptResponseJson copy$default(PeerInviteAcceptResponseJson peerInviteAcceptResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteAcceptResponseJson.muse_id;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteAcceptResponseJson.relationship_generation_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new PeerInviteAcceptResponseJson(str, str2);
    }

    public final String component1() {
        return this.muse_id;
    }

    public final String component2() {
        return this.relationship_generation_id;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getRelationship_generation_id() {
        return this.relationship_generation_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.relationship_generation_id, AnonymousClass001.A0G(this.muse_id));
    }

    public PeerInviteAcceptResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.muse_id = str;
        this.relationship_generation_id = str2;
    }

    public final PeerInviteAcceptResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PeerInviteAcceptResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteAcceptResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.muse_id = "";
        } else {
            this.muse_id = str;
        }
        if ((i & 2) == 0) {
            this.relationship_generation_id = "";
        } else {
            this.relationship_generation_id = str2;
        }
    }

    public /* synthetic */ PeerInviteAcceptResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public PeerInviteAcceptResponseJson() {
        this("", "");
    }
}
