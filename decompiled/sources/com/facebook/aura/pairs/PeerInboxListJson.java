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
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class PeerInboxListJson extends C06G {
    public static final int $stable = 8;
    public final List<JsonElement> items;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, PeerInboxListJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PeerInboxListJson> serializer() {
            return PeerInboxListJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerInboxListJson copy(List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 0);
        return new PeerInboxListJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerInboxListJson) && C7384Etj.areEqual(this.items, ((PeerInboxListJson) obj).items));
    }

    public static /* synthetic */ PeerInboxListJson copy$default(PeerInboxListJson peerInboxListJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = peerInboxListJson.items;
        }
        C7384Etj.A0Y(list, 0);
        return new PeerInboxListJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInboxListJson peerInboxListJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(peerInboxListJson.items)) {
            c9j5.AAQ(peerInboxListJson.items, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<JsonElement> component1() {
        return this.items;
    }

    public final List<JsonElement> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public /* synthetic */ PeerInboxListJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PeerInboxListJson(List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
    }

    public /* synthetic */ PeerInboxListJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public PeerInboxListJson() {
        this(C0881AGi.A00);
    }
}
