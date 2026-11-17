package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInvitePendingItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long created_at;
    public final String delivery_id;
    public final long expires_at;
    public final String invite_b64;
    public final PeerInvitePendingSenderJson sender;

    public final class Companion {
        public final C9hr<PeerInvitePendingItemJson> serializer() {
            return PeerInvitePendingItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInvitePendingItemJson peerInvitePendingItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(peerInvitePendingItemJson.delivery_id)) {
            c9j5.AAV(peerInvitePendingItemJson.delivery_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(peerInvitePendingItemJson.invite_b64)) {
            c9j5.AAV(peerInvitePendingItemJson.invite_b64, c9iZ, 1);
        }
        if (zAfR || peerInvitePendingItemJson.sender != null) {
            c9j5.AAP(peerInvitePendingItemJson.sender, PeerInvitePendingSenderJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || peerInvitePendingItemJson.created_at != 0) {
            c9j5.AAN(c9iZ, 3, peerInvitePendingItemJson.created_at);
        }
        if (zAfR || peerInvitePendingItemJson.expires_at != 0) {
            c9j5.AAN(c9iZ, 4, peerInvitePendingItemJson.expires_at);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInvitePendingItemJson) {
                PeerInvitePendingItemJson peerInvitePendingItemJson = (PeerInvitePendingItemJson) obj;
                if (!C7384Etj.areEqual(this.delivery_id, peerInvitePendingItemJson.delivery_id) || !C7384Etj.areEqual(this.invite_b64, peerInvitePendingItemJson.invite_b64) || !C7384Etj.areEqual(this.sender, peerInvitePendingItemJson.sender) || this.created_at != peerInvitePendingItemJson.created_at || this.expires_at != peerInvitePendingItemJson.expires_at) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInvitePendingItemJson copy$default(PeerInvitePendingItemJson peerInvitePendingItemJson, String str, String str2, PeerInvitePendingSenderJson peerInvitePendingSenderJson, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInvitePendingItemJson.delivery_id;
        }
        if ((i & 2) != 0) {
            str2 = peerInvitePendingItemJson.invite_b64;
        }
        if ((i & 4) != 0) {
            peerInvitePendingSenderJson = peerInvitePendingItemJson.sender;
        }
        if ((i & 8) != 0) {
            j = peerInvitePendingItemJson.created_at;
        }
        if ((i & 16) != 0) {
            j2 = peerInvitePendingItemJson.expires_at;
        }
        return peerInvitePendingItemJson.copy(str, str2, peerInvitePendingSenderJson, j, j2);
    }

    public final String component1() {
        return this.delivery_id;
    }

    public final String component2() {
        return this.invite_b64;
    }

    public final PeerInvitePendingSenderJson component3() {
        return this.sender;
    }

    public final long component4() {
        return this.created_at;
    }

    public final long component5() {
        return this.expires_at;
    }

    public final long getCreated_at() {
        return this.created_at;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final long getExpires_at() {
        return this.expires_at;
    }

    public final String getInvite_b64() {
        return this.invite_b64;
    }

    public final PeerInvitePendingSenderJson getSender() {
        return this.sender;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.created_at, (AnonymousClass005.A0I(this.invite_b64, AnonymousClass001.A0G(this.delivery_id)) + AnonymousClass006.A0D(this.sender)) * 31) + C3cG.A02(this.expires_at);
    }

    public PeerInvitePendingItemJson(String str, String str2, PeerInvitePendingSenderJson peerInvitePendingSenderJson, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        this.delivery_id = str;
        this.invite_b64 = str2;
        this.sender = peerInvitePendingSenderJson;
        this.created_at = j;
        this.expires_at = j2;
    }

    public final PeerInvitePendingItemJson copy(String str, String str2, PeerInvitePendingSenderJson peerInvitePendingSenderJson, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        return new PeerInvitePendingItemJson(str, str2, peerInvitePendingSenderJson, j, j2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInvitePendingItemJson(String str, String str2, PeerInvitePendingSenderJson peerInvitePendingSenderJson, long j, long j2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : peerInvitePendingSenderJson, (i & 8) != 0 ? 0L : j, C3cH.A03(i & 16, j2));
    }

    public /* synthetic */ PeerInvitePendingItemJson(int i, String str, String str2, PeerInvitePendingSenderJson peerInvitePendingSenderJson, long j, long j2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.delivery_id = "";
        } else {
            this.delivery_id = str;
        }
        if ((i & 2) == 0) {
            this.invite_b64 = "";
        } else {
            this.invite_b64 = str2;
        }
        if ((i & 4) == 0) {
            this.sender = null;
        } else {
            this.sender = peerInvitePendingSenderJson;
        }
        if ((i & 8) == 0) {
            this.created_at = 0L;
        } else {
            this.created_at = j;
        }
        if ((i & 16) == 0) {
            this.expires_at = 0L;
        } else {
            this.expires_at = j2;
        }
    }

    public PeerInvitePendingItemJson() {
        this("", "", null, 0L, 0L);
    }
}
