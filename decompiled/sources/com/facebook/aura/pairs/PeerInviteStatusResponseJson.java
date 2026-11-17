package com.facebook.aura.pairs;

import X.C06G;
import X.C06H;
import X.C0881AGi;
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
public final class PeerInviteStatusResponseJson extends C06G {
    public static final int $stable = 8;
    public final List<PeerInviteStatusItemJson> items;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, PeerInviteStatusResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PeerInviteStatusResponseJson> serializer() {
            return PeerInviteStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerInviteStatusResponseJson copy(List<PeerInviteStatusItemJson> list) {
        C7384Etj.A0Y(list, 0);
        return new PeerInviteStatusResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInviteStatusResponseJson) && C7384Etj.areEqual(this.items, ((PeerInviteStatusResponseJson) obj).items));
    }

    public static /* synthetic */ PeerInviteStatusResponseJson copy$default(PeerInviteStatusResponseJson peerInviteStatusResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = peerInviteStatusResponseJson.items;
        }
        C7384Etj.A0Y(list, 0);
        return new PeerInviteStatusResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteStatusResponseJson peerInviteStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(peerInviteStatusResponseJson.items)) {
            c9j5.AAQ(peerInviteStatusResponseJson.items, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<PeerInviteStatusItemJson> component1() {
        return this.items;
    }

    public final List<PeerInviteStatusItemJson> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public /* synthetic */ PeerInviteStatusResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteStatusResponseJson(List<PeerInviteStatusItemJson> list) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
    }

    public /* synthetic */ PeerInviteStatusResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public PeerInviteStatusResponseJson() {
        this(C0881AGi.A00);
    }
}
