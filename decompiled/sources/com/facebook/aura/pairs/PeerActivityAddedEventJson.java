package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerActivityAddedEventJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final PeerActivityAddedPayloadJson payload;
    public final Long seq;

    public final class Companion {
        public final C9hr<PeerActivityAddedEventJson> serializer() {
            return PeerActivityAddedEventJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerActivityAddedEventJson peerActivityAddedEventJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerActivityAddedEventJson.payload != null) {
            c9j5.AAP(peerActivityAddedEventJson.payload, PeerActivityAddedPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || peerActivityAddedEventJson.seq != null) {
            c9j5.AAP(peerActivityAddedEventJson.seq, C9j1.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerActivityAddedEventJson) {
                PeerActivityAddedEventJson peerActivityAddedEventJson = (PeerActivityAddedEventJson) obj;
                if (!C7384Etj.areEqual(this.payload, peerActivityAddedEventJson.payload) || !C7384Etj.areEqual(this.seq, peerActivityAddedEventJson.seq)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerActivityAddedEventJson copy$default(PeerActivityAddedEventJson peerActivityAddedEventJson, PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            peerActivityAddedPayloadJson = peerActivityAddedEventJson.payload;
        }
        if ((i & 2) != 0) {
            l = peerActivityAddedEventJson.seq;
        }
        return new PeerActivityAddedEventJson(peerActivityAddedPayloadJson, l);
    }

    public final PeerActivityAddedPayloadJson component1() {
        return this.payload;
    }

    public final Long component2() {
        return this.seq;
    }

    public final PeerActivityAddedEventJson copy(PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, Long l) {
        return new PeerActivityAddedEventJson(peerActivityAddedPayloadJson, l);
    }

    public final PeerActivityAddedPayloadJson getPayload() {
        return this.payload;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.payload) * 31) + C3cH.A02(this.seq);
    }

    public PeerActivityAddedEventJson(PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, Long l) {
        this.payload = peerActivityAddedPayloadJson;
        this.seq = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerActivityAddedEventJson(int i, PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payload = null;
        } else {
            this.payload = peerActivityAddedPayloadJson;
        }
        if ((i & 2) == 0) {
            this.seq = null;
        } else {
            this.seq = l;
        }
    }

    public /* synthetic */ PeerActivityAddedEventJson(PeerActivityAddedPayloadJson peerActivityAddedPayloadJson, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : peerActivityAddedPayloadJson, (i & 2) != 0 ? null : l);
    }

    public PeerActivityAddedEventJson() {
        this(null, null);
    }
}
