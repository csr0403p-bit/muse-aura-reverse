package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerAcceptedJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean accepted;

    public final class Companion {
        public final C9hr<PeerAcceptedJson> serializer() {
            return PeerAcceptedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerAcceptedJson peerAcceptedJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || peerAcceptedJson.accepted) {
            c9j5.AA7(c9iZ, 0, peerAcceptedJson.accepted);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerAcceptedJson) && this.accepted == ((PeerAcceptedJson) obj).accepted);
    }

    public static /* synthetic */ PeerAcceptedJson copy$default(PeerAcceptedJson peerAcceptedJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = peerAcceptedJson.accepted;
        }
        return new PeerAcceptedJson(z);
    }

    public final boolean component1() {
        return this.accepted;
    }

    public final PeerAcceptedJson copy(boolean z) {
        return new PeerAcceptedJson(z);
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public int hashCode() {
        return this.accepted ? 1231 : 1237;
    }

    public /* synthetic */ PeerAcceptedJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.accepted = false;
        } else {
            this.accepted = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerAcceptedJson(boolean z) {
        this.accepted = z;
    }

    public /* synthetic */ PeerAcceptedJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public PeerAcceptedJson() {
        this(false);
    }
}
