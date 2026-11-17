package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerActivityAddedPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String activity_id;

    public final class Companion {
        public final C9hr<PeerActivityAddedPayloadJson> serializer() {
            return PeerActivityAddedPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || peerActivityAddedPayloadJson.activity_id != null) {
            c9j5.AAP(peerActivityAddedPayloadJson.activity_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerActivityAddedPayloadJson) && C7384Etj.areEqual(this.activity_id, ((PeerActivityAddedPayloadJson) obj).activity_id));
    }

    public static /* synthetic */ PeerActivityAddedPayloadJson copy$default(PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerActivityAddedPayloadJson.activity_id;
        }
        return new PeerActivityAddedPayloadJson(str);
    }

    public final String component1() {
        return this.activity_id;
    }

    public final PeerActivityAddedPayloadJson copy(String str) {
        return new PeerActivityAddedPayloadJson(str);
    }

    public final String getActivity_id() {
        return this.activity_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.activity_id);
    }

    public /* synthetic */ PeerActivityAddedPayloadJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.activity_id = null;
        } else {
            this.activity_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerActivityAddedPayloadJson(String str) {
        this.activity_id = str;
    }

    public /* synthetic */ PeerActivityAddedPayloadJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public PeerActivityAddedPayloadJson() {
        this(null);
    }
}
