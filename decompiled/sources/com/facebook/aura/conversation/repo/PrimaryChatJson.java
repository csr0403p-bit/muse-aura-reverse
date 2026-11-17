package com.facebook.aura.conversation.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PrimaryChatJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String chat_id;

    public final class Companion {
        public final C9hr<PrimaryChatJson> serializer() {
            return PrimaryChatJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(PrimaryChatJson primaryChatJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(primaryChatJson.chat_id)) {
            c9j5.AAV(primaryChatJson.chat_id, c9iZ, 0);
        }
    }

    public final PrimaryChatJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PrimaryChatJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PrimaryChatJson) && C7384Etj.areEqual(this.chat_id, ((PrimaryChatJson) obj).chat_id));
    }

    public static /* synthetic */ PrimaryChatJson copy$default(PrimaryChatJson primaryChatJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryChatJson.chat_id;
        }
        C7384Etj.A0Y(str, 0);
        return new PrimaryChatJson(str);
    }

    public final String component1() {
        return this.chat_id;
    }

    public final String getChat_id() {
        return this.chat_id;
    }

    public int hashCode() {
        return this.chat_id.hashCode();
    }

    public /* synthetic */ PrimaryChatJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.chat_id = "";
        } else {
            this.chat_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PrimaryChatJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.chat_id = str;
    }

    public /* synthetic */ PrimaryChatJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public PrimaryChatJson() {
        this("");
    }
}
