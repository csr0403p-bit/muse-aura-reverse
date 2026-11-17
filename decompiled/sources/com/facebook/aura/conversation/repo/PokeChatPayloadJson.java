package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PokeChatPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String channel;
    public final boolean is_thread;
    public final String session_id;
    public final String stream_owner_message_id;

    public final class Companion {
        public final C9hr<PokeChatPayloadJson> serializer() {
            return PokeChatPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(PokeChatPayloadJson pokeChatPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(pokeChatPayloadJson.stream_owner_message_id)) {
            c9j5.AAV(pokeChatPayloadJson.stream_owner_message_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(pokeChatPayloadJson.channel)) {
            c9j5.AAV(pokeChatPayloadJson.channel, c9iZ, 1);
        }
        if (zAfR || !"".equals(pokeChatPayloadJson.session_id)) {
            c9j5.AAV(pokeChatPayloadJson.session_id, c9iZ, 2);
        }
        if (zAfR || pokeChatPayloadJson.is_thread) {
            c9j5.AA7(c9iZ, 3, pokeChatPayloadJson.is_thread);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PokeChatPayloadJson) {
                PokeChatPayloadJson pokeChatPayloadJson = (PokeChatPayloadJson) obj;
                if (!C7384Etj.areEqual(this.stream_owner_message_id, pokeChatPayloadJson.stream_owner_message_id) || !C7384Etj.areEqual(this.channel, pokeChatPayloadJson.channel) || !C7384Etj.areEqual(this.session_id, pokeChatPayloadJson.session_id) || this.is_thread != pokeChatPayloadJson.is_thread) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PokeChatPayloadJson copy$default(PokeChatPayloadJson pokeChatPayloadJson, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pokeChatPayloadJson.stream_owner_message_id;
        }
        if ((i & 2) != 0) {
            str2 = pokeChatPayloadJson.channel;
        }
        if ((i & 4) != 0) {
            str3 = pokeChatPayloadJson.session_id;
        }
        if ((i & 8) != 0) {
            z = pokeChatPayloadJson.is_thread;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new PokeChatPayloadJson(str, str2, str3, z);
    }

    public final String component1() {
        return this.stream_owner_message_id;
    }

    public final String component2() {
        return this.channel;
    }

    public final String component3() {
        return this.session_id;
    }

    public final boolean component4() {
        return this.is_thread;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getStream_owner_message_id() {
        return this.stream_owner_message_id;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.session_id, AnonymousClass005.A0I(this.channel, AnonymousClass001.A0G(this.stream_owner_message_id))), this.is_thread);
    }

    public final boolean is_thread() {
        return this.is_thread;
    }

    public final HatchChatPokeResponse toDomain() {
        return new HatchChatPokeResponse(this.stream_owner_message_id, this.channel, this.session_id, this.is_thread);
    }

    public /* synthetic */ PokeChatPayloadJson(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.stream_owner_message_id = "";
        } else {
            this.stream_owner_message_id = str;
        }
        if ((i & 2) == 0) {
            this.channel = "";
        } else {
            this.channel = str2;
        }
        if ((i & 4) == 0) {
            this.session_id = "";
        } else {
            this.session_id = str3;
        }
        if ((i & 8) == 0) {
            this.is_thread = false;
        } else {
            this.is_thread = z;
        }
    }

    public final PokeChatPayloadJson copy(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PokeChatPayloadJson(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public PokeChatPayloadJson(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.stream_owner_message_id = str;
        this.channel = str2;
        this.session_id = str3;
        this.is_thread = z;
    }

    public /* synthetic */ PokeChatPayloadJson(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, AnonymousClass005.A1P(i, z));
    }

    public PokeChatPayloadJson() {
        this("", "", "", false);
    }
}
