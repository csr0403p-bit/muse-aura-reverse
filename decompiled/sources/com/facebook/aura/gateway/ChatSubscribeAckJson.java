package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ChatSubscribeAckJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean is_primary;
    public final String session_id;

    public final class Companion {
        public final C9hr<ChatSubscribeAckJson> serializer() {
            return ChatSubscribeAckJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ChatSubscribeAckJson chatSubscribeAckJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || chatSubscribeAckJson.is_primary) {
            c9j5.AA7(c9iZ, 0, chatSubscribeAckJson.is_primary);
        }
        if (zAfR || chatSubscribeAckJson.session_id != null) {
            c9j5.AAP(chatSubscribeAckJson.session_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatSubscribeAckJson) {
                ChatSubscribeAckJson chatSubscribeAckJson = (ChatSubscribeAckJson) obj;
                if (this.is_primary != chatSubscribeAckJson.is_primary || !C7384Etj.areEqual(this.session_id, chatSubscribeAckJson.session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatSubscribeAckJson copy$default(ChatSubscribeAckJson chatSubscribeAckJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatSubscribeAckJson.is_primary;
        }
        if ((i & 2) != 0) {
            str = chatSubscribeAckJson.session_id;
        }
        return new ChatSubscribeAckJson(z, str);
    }

    public final boolean component1() {
        return this.is_primary;
    }

    public final String component2() {
        return this.session_id;
    }

    public final ChatSubscribeAckJson copy(boolean z, String str) {
        return new ChatSubscribeAckJson(z, str);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return C0KA.A02(this.is_primary) + AnonymousClass006.A0G(this.session_id);
    }

    public final boolean is_primary() {
        return this.is_primary;
    }

    public ChatSubscribeAckJson(boolean z, String str) {
        this.is_primary = z;
        this.session_id = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChatSubscribeAckJson(int i, boolean z, String str, C2hx c2hx) {
        this.is_primary = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str;
        }
    }

    public /* synthetic */ ChatSubscribeAckJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str));
    }

    public ChatSubscribeAckJson() {
        this(false, null);
    }
}
