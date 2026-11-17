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
public final class PeerInviteDeliveryIdJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String delivery_id;

    public final class Companion {
        public final C9hr<PeerInviteDeliveryIdJson> serializer() {
            return PeerInviteDeliveryIdJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerInviteDeliveryIdJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PeerInviteDeliveryIdJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInviteDeliveryIdJson) && C7384Etj.areEqual(this.delivery_id, ((PeerInviteDeliveryIdJson) obj).delivery_id));
    }

    public /* synthetic */ PeerInviteDeliveryIdJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerInviteDeliveryIdJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.delivery_id = str;
    }

    public static /* synthetic */ PeerInviteDeliveryIdJson copy$default(PeerInviteDeliveryIdJson peerInviteDeliveryIdJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteDeliveryIdJson.delivery_id;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerInviteDeliveryIdJson(str);
    }

    public final String component1() {
        return this.delivery_id;
    }

    public final String getDelivery_id() {
        return this.delivery_id;
    }

    public int hashCode() {
        return this.delivery_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteDeliveryIdJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.delivery_id = str;
    }
}
