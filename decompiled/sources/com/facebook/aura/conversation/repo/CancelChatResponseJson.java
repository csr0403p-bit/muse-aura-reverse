package com.facebook.aura.conversation.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class CancelChatResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CancelChatPayloadJson payload;

    public final class Companion {
        public final C9hr<CancelChatResponseJson> serializer() {
            return CancelChatResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(CancelChatResponseJson cancelChatResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || cancelChatResponseJson.payload != null) {
            c9j5.AAP(cancelChatResponseJson.payload, CancelChatPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CancelChatResponseJson) && C7384Etj.areEqual(this.payload, ((CancelChatResponseJson) obj).payload));
    }

    public static /* synthetic */ CancelChatResponseJson copy$default(CancelChatResponseJson cancelChatResponseJson, CancelChatPayloadJson cancelChatPayloadJson, int i, Object obj) {
        if ((i & 1) != 0) {
            cancelChatPayloadJson = cancelChatResponseJson.payload;
        }
        return new CancelChatResponseJson(cancelChatPayloadJson);
    }

    public final CancelChatPayloadJson component1() {
        return this.payload;
    }

    public final CancelChatResponseJson copy(CancelChatPayloadJson cancelChatPayloadJson) {
        return new CancelChatResponseJson(cancelChatPayloadJson);
    }

    public final CancelChatPayloadJson getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.payload);
    }

    public /* synthetic */ CancelChatResponseJson(int i, CancelChatPayloadJson cancelChatPayloadJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payload = null;
        } else {
            this.payload = cancelChatPayloadJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CancelChatResponseJson(CancelChatPayloadJson cancelChatPayloadJson) {
        this.payload = cancelChatPayloadJson;
    }

    public /* synthetic */ CancelChatResponseJson(CancelChatPayloadJson cancelChatPayloadJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : cancelChatPayloadJson);
    }

    public CancelChatResponseJson() {
        this(null);
    }
}
