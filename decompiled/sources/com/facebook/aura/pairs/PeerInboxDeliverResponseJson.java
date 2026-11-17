package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInboxDeliverResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean accepted;
    public final String rejection;

    public final class Companion {
        public final C9hr<PeerInboxDeliverResponseJson> serializer() {
            return PeerInboxDeliverResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInboxDeliverResponseJson peerInboxDeliverResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerInboxDeliverResponseJson.accepted) {
            c9j5.AA7(c9iZ, 0, peerInboxDeliverResponseJson.accepted);
        }
        if (zAfR || peerInboxDeliverResponseJson.rejection != null) {
            c9j5.AAP(peerInboxDeliverResponseJson.rejection, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInboxDeliverResponseJson) {
                PeerInboxDeliverResponseJson peerInboxDeliverResponseJson = (PeerInboxDeliverResponseJson) obj;
                if (this.accepted != peerInboxDeliverResponseJson.accepted || !C7384Etj.areEqual(this.rejection, peerInboxDeliverResponseJson.rejection)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerInboxDeliverResponseJson copy$default(PeerInboxDeliverResponseJson peerInboxDeliverResponseJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = peerInboxDeliverResponseJson.accepted;
        }
        if ((i & 2) != 0) {
            str = peerInboxDeliverResponseJson.rejection;
        }
        return new PeerInboxDeliverResponseJson(z, str);
    }

    public final boolean component1() {
        return this.accepted;
    }

    public final String component2() {
        return this.rejection;
    }

    public final PeerInboxDeliverResponseJson copy(boolean z, String str) {
        return new PeerInboxDeliverResponseJson(z, str);
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public final String getRejection() {
        return this.rejection;
    }

    public int hashCode() {
        return C0KA.A02(this.accepted) + AnonymousClass006.A0G(this.rejection);
    }

    public PeerInboxDeliverResponseJson(boolean z, String str) {
        this.accepted = z;
        this.rejection = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInboxDeliverResponseJson(int i, boolean z, String str, C2hx c2hx) {
        this.accepted = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.rejection = null;
        } else {
            this.rejection = str;
        }
    }

    public /* synthetic */ PeerInboxDeliverResponseJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str));
    }

    public PeerInboxDeliverResponseJson() {
        this(false, null);
    }
}
