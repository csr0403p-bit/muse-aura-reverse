package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ChatHistoryResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonArray chat_events;
    public final boolean has_more;
    public final ChatHistoryPayloadJson result;

    public final class Companion {
        public final C9hr<ChatHistoryResponseJson> serializer() {
            return ChatHistoryResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ChatHistoryResponseJson chatHistoryResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || chatHistoryResponseJson.result != null) {
            c9j5.AAP(chatHistoryResponseJson.result, ChatHistoryPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || chatHistoryResponseJson.has_more) {
            c9j5.AA7(c9iZ, 1, chatHistoryResponseJson.has_more);
        }
        if (zAfR || chatHistoryResponseJson.chat_events != null) {
            c9j5.AAP(chatHistoryResponseJson.chat_events, JsonArraySerializer.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatHistoryResponseJson) {
                ChatHistoryResponseJson chatHistoryResponseJson = (ChatHistoryResponseJson) obj;
                if (!C7384Etj.areEqual(this.result, chatHistoryResponseJson.result) || this.has_more != chatHistoryResponseJson.has_more || !C7384Etj.areEqual(this.chat_events, chatHistoryResponseJson.chat_events)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatHistoryResponseJson copy$default(ChatHistoryResponseJson chatHistoryResponseJson, ChatHistoryPayloadJson chatHistoryPayloadJson, boolean z, JsonArray jsonArray, int i, Object obj) {
        if ((i & 1) != 0) {
            chatHistoryPayloadJson = chatHistoryResponseJson.result;
        }
        if ((i & 2) != 0) {
            z = chatHistoryResponseJson.has_more;
        }
        if ((i & 4) != 0) {
            jsonArray = chatHistoryResponseJson.chat_events;
        }
        return new ChatHistoryResponseJson(chatHistoryPayloadJson, z, jsonArray);
    }

    public final ChatHistoryPayloadJson component1() {
        return this.result;
    }

    public final boolean component2() {
        return this.has_more;
    }

    public final JsonArray component3() {
        return this.chat_events;
    }

    public final ChatHistoryResponseJson copy(ChatHistoryPayloadJson chatHistoryPayloadJson, boolean z, JsonArray jsonArray) {
        return new ChatHistoryResponseJson(chatHistoryPayloadJson, z, jsonArray);
    }

    public final JsonArray getChat_events() {
        return this.chat_events;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final ChatHistoryPayloadJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass006.A0D(this.result) * 31, this.has_more) + C3cH.A02(this.chat_events);
    }

    public final ChatHistoryPayloadJson payload() {
        ChatHistoryPayloadJson chatHistoryPayloadJson = this.result;
        return chatHistoryPayloadJson == null ? new ChatHistoryPayloadJson(this.has_more, this.chat_events) : chatHistoryPayloadJson;
    }

    public ChatHistoryResponseJson(ChatHistoryPayloadJson chatHistoryPayloadJson, boolean z, JsonArray jsonArray) {
        this.result = chatHistoryPayloadJson;
        this.has_more = z;
        this.chat_events = jsonArray;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChatHistoryResponseJson(int i, ChatHistoryPayloadJson chatHistoryPayloadJson, boolean z, JsonArray jsonArray, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = chatHistoryPayloadJson;
        }
        if ((i & 2) == 0) {
            this.has_more = false;
        } else {
            this.has_more = z;
        }
        if ((i & 4) == 0) {
            this.chat_events = null;
        } else {
            this.chat_events = jsonArray;
        }
    }

    public /* synthetic */ ChatHistoryResponseJson(ChatHistoryPayloadJson chatHistoryPayloadJson, boolean z, JsonArray jsonArray, int i, C06H c06h) {
        this((i & 1) != 0 ? null : chatHistoryPayloadJson, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : jsonArray);
    }

    public ChatHistoryResponseJson() {
        this(null, false, null);
    }
}
