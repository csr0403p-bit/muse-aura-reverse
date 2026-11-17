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
public final class PeerTrustPresetRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String trust_preset;

    public final class Companion {
        public final C9hr<PeerTrustPresetRequestJson> serializer() {
            return PeerTrustPresetRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerTrustPresetRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PeerTrustPresetRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerTrustPresetRequestJson) && C7384Etj.areEqual(this.trust_preset, ((PeerTrustPresetRequestJson) obj).trust_preset));
    }

    public /* synthetic */ PeerTrustPresetRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PeerTrustPresetRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.trust_preset = str;
    }

    public static /* synthetic */ PeerTrustPresetRequestJson copy$default(PeerTrustPresetRequestJson peerTrustPresetRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerTrustPresetRequestJson.trust_preset;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerTrustPresetRequestJson(str);
    }

    public final String component1() {
        return this.trust_preset;
    }

    public final String getTrust_preset() {
        return this.trust_preset;
    }

    public int hashCode() {
        return this.trust_preset.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PeerTrustPresetRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.trust_preset = str;
    }
}
