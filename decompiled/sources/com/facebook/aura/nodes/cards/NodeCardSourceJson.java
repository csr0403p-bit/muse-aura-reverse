package com.facebook.aura.nodes.cards;

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
/* loaded from: classes2.dex */
public final class NodeCardSourceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String source_client_id;

    public final class Companion {
        public final C9hr<NodeCardSourceJson> serializer() {
            return NodeCardSourceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(NodeCardSourceJson nodeCardSourceJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || nodeCardSourceJson.source_client_id != null) {
            c9j5.AAP(nodeCardSourceJson.source_client_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NodeCardSourceJson) && C7384Etj.areEqual(this.source_client_id, ((NodeCardSourceJson) obj).source_client_id));
    }

    public static /* synthetic */ NodeCardSourceJson copy$default(NodeCardSourceJson nodeCardSourceJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeCardSourceJson.source_client_id;
        }
        return new NodeCardSourceJson(str);
    }

    public final String component1() {
        return this.source_client_id;
    }

    public final NodeCardSourceJson copy(String str) {
        return new NodeCardSourceJson(str);
    }

    public final String getSource_client_id() {
        return this.source_client_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.source_client_id);
    }

    public /* synthetic */ NodeCardSourceJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source_client_id = null;
        } else {
            this.source_client_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public NodeCardSourceJson(String str) {
        this.source_client_id = str;
    }

    public /* synthetic */ NodeCardSourceJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public NodeCardSourceJson() {
        this(null);
    }
}
