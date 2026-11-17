package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerImageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long byte_length;
    public final String sha256;

    public final class Companion {
        public final C9hr<PeerImageJson> serializer() {
            return PeerImageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerImageJson(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.sha256 = str;
        this.byte_length = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerImageJson peerImageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(peerImageJson.sha256)) {
            c9j5.AAV(peerImageJson.sha256, c9iZ, 0);
        }
        if (zAfR || peerImageJson.byte_length != 0) {
            c9j5.AAN(c9iZ, 1, peerImageJson.byte_length);
        }
    }

    public final PeerImageJson copy(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new PeerImageJson(str, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerImageJson) {
                PeerImageJson peerImageJson = (PeerImageJson) obj;
                if (!C7384Etj.areEqual(this.sha256, peerImageJson.sha256) || this.byte_length != peerImageJson.byte_length) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerImageJson copy$default(PeerImageJson peerImageJson, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerImageJson.sha256;
        }
        if ((i & 2) != 0) {
            j = peerImageJson.byte_length;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerImageJson(str, j);
    }

    public final String component1() {
        return this.sha256;
    }

    public final long component2() {
        return this.byte_length;
    }

    public final long getByte_length() {
        return this.byte_length;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.byte_length, AnonymousClass001.A0G(this.sha256));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerImageJson(int i, String str, long j, C2hx c2hx) {
        this.sha256 = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.byte_length = 0L;
        } else {
            this.byte_length = j;
        }
    }

    public /* synthetic */ PeerImageJson(String str, long j, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? 0L : j);
    }

    public PeerImageJson() {
        this("", 0L);
    }
}
