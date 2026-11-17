package com.facebook.aura.pairs;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerTrustPresetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;

    public final class Companion {
        public final C9hr<PeerTrustPresetJson> serializer() {
            return PeerTrustPresetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerTrustPresetJson peerTrustPresetJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(peerTrustPresetJson.id)) {
            c9j5.AAV(peerTrustPresetJson.id, c9iZ, 0);
        }
    }

    public final PeerTrustPresetJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PeerTrustPresetJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerTrustPresetJson) && C7384Etj.areEqual(this.id, ((PeerTrustPresetJson) obj).id));
    }

    public static /* synthetic */ PeerTrustPresetJson copy$default(PeerTrustPresetJson peerTrustPresetJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerTrustPresetJson.id;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerTrustPresetJson(str);
    }

    public final String component1() {
        return this.id;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public /* synthetic */ PeerTrustPresetJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerTrustPresetJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
    }

    public /* synthetic */ PeerTrustPresetJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public PeerTrustPresetJson() {
        this("");
    }
}
