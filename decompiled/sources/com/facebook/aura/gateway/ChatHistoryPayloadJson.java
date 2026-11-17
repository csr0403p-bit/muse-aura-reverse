package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ChatHistoryPayloadJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonArray chat_events;
    public final boolean has_more;

    public final class Companion {
        public final C9hr<ChatHistoryPayloadJson> serializer() {
            return ChatHistoryPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ChatHistoryPayloadJson chatHistoryPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || chatHistoryPayloadJson.has_more) {
            c9j5.AA7(c9iZ, 0, chatHistoryPayloadJson.has_more);
        }
        if (zAfR || chatHistoryPayloadJson.chat_events != null) {
            c9j5.AAP(chatHistoryPayloadJson.chat_events, JsonArraySerializer.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatHistoryPayloadJson) {
                ChatHistoryPayloadJson chatHistoryPayloadJson = (ChatHistoryPayloadJson) obj;
                if (this.has_more != chatHistoryPayloadJson.has_more || !C7384Etj.areEqual(this.chat_events, chatHistoryPayloadJson.chat_events)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatHistoryPayloadJson copy$default(ChatHistoryPayloadJson chatHistoryPayloadJson, boolean z, JsonArray jsonArray, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatHistoryPayloadJson.has_more;
        }
        if ((i & 2) != 0) {
            jsonArray = chatHistoryPayloadJson.chat_events;
        }
        return new ChatHistoryPayloadJson(z, jsonArray);
    }

    public final boolean component1() {
        return this.has_more;
    }

    public final JsonArray component2() {
        return this.chat_events;
    }

    public final ChatHistoryPayloadJson copy(boolean z, JsonArray jsonArray) {
        return new ChatHistoryPayloadJson(z, jsonArray);
    }

    public final JsonArray getChat_events() {
        return this.chat_events;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public int hashCode() {
        return C0KA.A02(this.has_more) + AnonymousClass006.A0D(this.chat_events);
    }

    public ChatHistoryPayloadJson(boolean z, JsonArray jsonArray) {
        this.has_more = z;
        this.chat_events = jsonArray;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChatHistoryPayloadJson(int i, boolean z, JsonArray jsonArray, C2hx c2hx) {
        this.has_more = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.chat_events = null;
        } else {
            this.chat_events = jsonArray;
        }
    }

    public /* synthetic */ ChatHistoryPayloadJson(boolean z, JsonArray jsonArray, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : jsonArray);
    }

    public ChatHistoryPayloadJson() {
        this(false, null);
    }
}
