package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class MarkChatAsSeenPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Boolean has_unread_threads;

    public final class Companion {
        public final C9hr<MarkChatAsSeenPayloadJson> serializer() {
            return MarkChatAsSeenPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(MarkChatAsSeenPayloadJson markChatAsSeenPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || markChatAsSeenPayloadJson.has_unread_threads != null) {
            c9j5.AAP(markChatAsSeenPayloadJson.has_unread_threads, C07839ix.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MarkChatAsSeenPayloadJson) && C7384Etj.areEqual(this.has_unread_threads, ((MarkChatAsSeenPayloadJson) obj).has_unread_threads));
    }

    public static /* synthetic */ MarkChatAsSeenPayloadJson copy$default(MarkChatAsSeenPayloadJson markChatAsSeenPayloadJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = markChatAsSeenPayloadJson.has_unread_threads;
        }
        return new MarkChatAsSeenPayloadJson(bool);
    }

    public final Boolean component1() {
        return this.has_unread_threads;
    }

    public final MarkChatAsSeenPayloadJson copy(Boolean bool) {
        return new MarkChatAsSeenPayloadJson(bool);
    }

    public final Boolean getHas_unread_threads() {
        return this.has_unread_threads;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.has_unread_threads);
    }

    public /* synthetic */ MarkChatAsSeenPayloadJson(int i, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.has_unread_threads = null;
        } else {
            this.has_unread_threads = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public MarkChatAsSeenPayloadJson(Boolean bool) {
        this.has_unread_threads = bool;
    }

    public /* synthetic */ MarkChatAsSeenPayloadJson(Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool);
    }

    public MarkChatAsSeenPayloadJson() {
        this(null);
    }
}
