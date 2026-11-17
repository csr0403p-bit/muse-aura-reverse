package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class PeerChatAuthorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String label;

    public final class Companion {
        public final C9hr<PeerChatAuthorJson> serializer() {
            return PeerChatAuthorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerChatAuthorJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.label = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerChatAuthorJson peerChatAuthorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(peerChatAuthorJson.kind)) {
            c9j5.AAV(peerChatAuthorJson.kind, c9iZ, 0);
        }
        if (zAfR || peerChatAuthorJson.label != null) {
            c9j5.AAP(peerChatAuthorJson.label, C07779iq.A01, c9iZ, 1);
        }
    }

    public final PeerChatAuthorJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new PeerChatAuthorJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerChatAuthorJson) {
                PeerChatAuthorJson peerChatAuthorJson = (PeerChatAuthorJson) obj;
                if (!C7384Etj.areEqual(this.kind, peerChatAuthorJson.kind) || !C7384Etj.areEqual(this.label, peerChatAuthorJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerChatAuthorJson copy$default(PeerChatAuthorJson peerChatAuthorJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerChatAuthorJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = peerChatAuthorJson.label;
        }
        C7384Etj.A0Y(str, 0);
        return new PeerChatAuthorJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.label;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.label);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerChatAuthorJson(int i, String str, String str2, C2hx c2hx) {
        this.kind = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
    }

    public /* synthetic */ PeerChatAuthorJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public PeerChatAuthorJson() {
        this("", null);
    }
}
