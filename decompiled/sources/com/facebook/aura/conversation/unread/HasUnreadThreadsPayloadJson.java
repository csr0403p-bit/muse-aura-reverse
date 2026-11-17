package com.facebook.aura.conversation.unread;

import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HasUnreadThreadsPayloadJson {
    public static final Companion Companion = new Companion();
    public final Boolean has_unread_threads;

    public final class Companion {
        public final C9hr<HasUnreadThreadsPayloadJson> serializer() {
            return HasUnreadThreadsPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_unread_unread(HasUnreadThreadsPayloadJson hasUnreadThreadsPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hasUnreadThreadsPayloadJson.has_unread_threads != null) {
            c9j5.AAP(hasUnreadThreadsPayloadJson.has_unread_threads, C07839ix.A00, c9iZ, 0);
        }
    }

    public final Boolean getHas_unread_threads() {
        return this.has_unread_threads;
    }

    public /* synthetic */ HasUnreadThreadsPayloadJson(int i, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.has_unread_threads = null;
        } else {
            this.has_unread_threads = bool;
        }
    }

    public HasUnreadThreadsPayloadJson(Boolean bool) {
        this.has_unread_threads = bool;
    }

    public /* synthetic */ HasUnreadThreadsPayloadJson(Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool);
    }

    public HasUnreadThreadsPayloadJson() {
        this(null);
    }
}
