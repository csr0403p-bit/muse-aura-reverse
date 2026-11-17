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
public final class PeerFeaturesJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean pairing;

    public final class Companion {
        public final C9hr<PeerFeaturesJson> serializer() {
            return PeerFeaturesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerFeaturesJson peerFeaturesJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || peerFeaturesJson.pairing) {
            c9j5.AA7(c9iZ, 0, peerFeaturesJson.pairing);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerFeaturesJson) && this.pairing == ((PeerFeaturesJson) obj).pairing);
    }

    public static /* synthetic */ PeerFeaturesJson copy$default(PeerFeaturesJson peerFeaturesJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = peerFeaturesJson.pairing;
        }
        return new PeerFeaturesJson(z);
    }

    public final boolean component1() {
        return this.pairing;
    }

    public final PeerFeaturesJson copy(boolean z) {
        return new PeerFeaturesJson(z);
    }

    public final boolean getPairing() {
        return this.pairing;
    }

    public int hashCode() {
        return this.pairing ? 1231 : 1237;
    }

    public /* synthetic */ PeerFeaturesJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.pairing = false;
        } else {
            this.pairing = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerFeaturesJson(boolean z) {
        this.pairing = z;
    }

    public /* synthetic */ PeerFeaturesJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public PeerFeaturesJson() {
        this(false);
    }
}
