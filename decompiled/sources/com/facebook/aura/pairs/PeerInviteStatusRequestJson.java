package com.facebook.aura.pairs;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInviteStatusRequestJson extends C06G {
    public static final int $stable = 8;
    public final List<String> delivery_ids;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, PeerInviteStatusRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PeerInviteStatusRequestJson> serializer() {
            return PeerInviteStatusRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerInviteStatusRequestJson copy(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return new PeerInviteStatusRequestJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInviteStatusRequestJson) && C7384Etj.areEqual(this.delivery_ids, ((PeerInviteStatusRequestJson) obj).delivery_ids));
    }

    public /* synthetic */ PeerInviteStatusRequestJson(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerInviteStatusRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.delivery_ids = list;
    }

    public static /* synthetic */ PeerInviteStatusRequestJson copy$default(PeerInviteStatusRequestJson peerInviteStatusRequestJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = peerInviteStatusRequestJson.delivery_ids;
        }
        C7384Etj.A0Y(list, 0);
        return new PeerInviteStatusRequestJson(list);
    }

    public final List<String> component1() {
        return this.delivery_ids;
    }

    public final List<String> getDelivery_ids() {
        return this.delivery_ids;
    }

    public int hashCode() {
        return this.delivery_ids.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteStatusRequestJson(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.delivery_ids = list;
    }
}
