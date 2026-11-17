package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class PeerInviteOpenResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String muse_id;
    public final String status;

    public final class Companion {
        public final C9hr<PeerInviteOpenResponseJson> serializer() {
            return PeerInviteOpenResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerInviteOpenResponseJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
        this.muse_id = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteOpenResponseJson peerInviteOpenResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(peerInviteOpenResponseJson.status)) {
            c9j5.AAV(peerInviteOpenResponseJson.status, c9iZ, 0);
        }
        if (zAfR || peerInviteOpenResponseJson.muse_id != null) {
            c9j5.AAP(peerInviteOpenResponseJson.muse_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public final PeerInviteOpenResponseJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new PeerInviteOpenResponseJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteOpenResponseJson) {
                PeerInviteOpenResponseJson peerInviteOpenResponseJson = (PeerInviteOpenResponseJson) obj;
                if (!C7384Etj.areEqual(this.status, peerInviteOpenResponseJson.status) || !C7384Etj.areEqual(this.muse_id, peerInviteOpenResponseJson.muse_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInviteOpenResponseJson copy$default(PeerInviteOpenResponseJson peerInviteOpenResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteOpenResponseJson.status;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteOpenResponseJson.muse_id;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerInviteOpenResponseJson(str, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.muse_id;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.status) + AnonymousClass006.A0G(this.muse_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteOpenResponseJson(int i, String str, String str2, C2hx c2hx) {
        this.status = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.muse_id = null;
        } else {
            this.muse_id = str2;
        }
    }

    public /* synthetic */ PeerInviteOpenResponseJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public PeerInviteOpenResponseJson() {
        this("", null);
    }
}
