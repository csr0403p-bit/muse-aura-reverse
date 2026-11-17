package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerLastActivityJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long at_ms;

    public final class Companion {
        public final C9hr<PeerLastActivityJson> serializer() {
            return PeerLastActivityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerLastActivityJson peerLastActivityJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || peerLastActivityJson.at_ms != 0) {
            c9j5.AAN(c9iZ, 0, peerLastActivityJson.at_ms);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerLastActivityJson) && this.at_ms == ((PeerLastActivityJson) obj).at_ms);
    }

    public static /* synthetic */ PeerLastActivityJson copy$default(PeerLastActivityJson peerLastActivityJson, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = peerLastActivityJson.at_ms;
        }
        return new PeerLastActivityJson(j);
    }

    public final long component1() {
        return this.at_ms;
    }

    public final PeerLastActivityJson copy(long j) {
        return new PeerLastActivityJson(j);
    }

    public final long getAt_ms() {
        return this.at_ms;
    }

    public int hashCode() {
        return AnonymousClass002.A0A(this.at_ms);
    }

    public /* synthetic */ PeerLastActivityJson(int i, long j, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.at_ms = 0L;
        } else {
            this.at_ms = j;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerLastActivityJson(long j) {
        this.at_ms = j;
    }

    public /* synthetic */ PeerLastActivityJson(long j, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j);
    }

    public PeerLastActivityJson() {
        this(0L);
    }
}
