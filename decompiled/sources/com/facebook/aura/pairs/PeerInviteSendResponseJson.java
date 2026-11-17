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
public final class PeerInviteSendResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String delivery_id;
    public final String status;

    public final class Companion {
        public final C9hr<PeerInviteSendResponseJson> serializer() {
            return PeerInviteSendResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerInviteSendResponseJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
        this.delivery_id = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteSendResponseJson peerInviteSendResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(peerInviteSendResponseJson.status)) {
            c9j5.AAV(peerInviteSendResponseJson.status, c9iZ, 0);
        }
        if (zAfR || peerInviteSendResponseJson.delivery_id != null) {
            c9j5.AAP(peerInviteSendResponseJson.delivery_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public final PeerInviteSendResponseJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new PeerInviteSendResponseJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteSendResponseJson) {
                PeerInviteSendResponseJson peerInviteSendResponseJson = (PeerInviteSendResponseJson) obj;
                if (!C7384Etj.areEqual(this.status, peerInviteSendResponseJson.status) || !C7384Etj.areEqual(this.delivery_id, peerInviteSendResponseJson.delivery_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInviteSendResponseJson copy$default(PeerInviteSendResponseJson peerInviteSendResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteSendResponseJson.status;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteSendResponseJson.delivery_id;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerInviteSendResponseJson(str, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.delivery_id;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.status) + AnonymousClass006.A0G(this.delivery_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteSendResponseJson(int i, String str, String str2, C2hx c2hx) {
        this.status = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.delivery_id = null;
        } else {
            this.delivery_id = str2;
        }
    }

    public /* synthetic */ PeerInviteSendResponseJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public PeerInviteSendResponseJson() {
        this("", null);
    }
}
