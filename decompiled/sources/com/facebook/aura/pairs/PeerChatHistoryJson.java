package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerChatHistoryJson extends C06G {
    public static final int $stable = 8;
    public final List<PeerChatEventJson> chat_events;
    public final boolean has_more;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, PeerChatHistoryJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PeerChatHistoryJson> serializer() {
            return PeerChatHistoryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PeerChatHistoryJson(List<PeerChatEventJson> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.chat_events = list;
        this.has_more = z;
    }

    public final PeerChatHistoryJson copy(List<PeerChatEventJson> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new PeerChatHistoryJson(list, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerChatHistoryJson) {
                PeerChatHistoryJson peerChatHistoryJson = (PeerChatHistoryJson) obj;
                if (!C7384Etj.areEqual(this.chat_events, peerChatHistoryJson.chat_events) || this.has_more != peerChatHistoryJson.has_more) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerChatHistoryJson copy$default(PeerChatHistoryJson peerChatHistoryJson, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = peerChatHistoryJson.chat_events;
        }
        if ((i & 2) != 0) {
            z = peerChatHistoryJson.has_more;
        }
        C7384Etj.A0Y(list, 0);
        return new PeerChatHistoryJson(list, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerChatHistoryJson peerChatHistoryJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(peerChatHistoryJson.chat_events)) {
            c9j5.AAQ(peerChatHistoryJson.chat_events, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || peerChatHistoryJson.has_more) {
            c9j5.AA7(c9iZ, 1, peerChatHistoryJson.has_more);
        }
    }

    public final List<PeerChatEventJson> component1() {
        return this.chat_events;
    }

    public final boolean component2() {
        return this.has_more;
    }

    public final List<PeerChatEventJson> getChat_events() {
        return this.chat_events;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.chat_events), this.has_more);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerChatHistoryJson(int i, List list, boolean z, C2hx c2hx) {
        this.chat_events = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.has_more = false;
        } else {
            this.has_more = z;
        }
    }

    public /* synthetic */ PeerChatHistoryJson(List list, boolean z, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass001.A1Q(i, z));
    }

    public PeerChatHistoryJson() {
        this(C0881AGi.A00, false);
    }
}
