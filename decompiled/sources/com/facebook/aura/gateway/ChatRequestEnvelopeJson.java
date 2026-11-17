package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ChatRequestEnvelopeJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String accept_language;
    public final String connection_attempt_id;
    public final String id;
    public final String method;
    public final JsonObject params;
    public final String type;

    public final class Companion {
        public final C9hr<ChatRequestEnvelopeJson> serializer() {
            return ChatRequestEnvelopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ChatRequestEnvelopeJson chatRequestEnvelopeJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(chatRequestEnvelopeJson.type, c9iZ, 0);
        c9j5.AAV(chatRequestEnvelopeJson.id, c9iZ, 1);
        c9j5.AAV(chatRequestEnvelopeJson.method, c9iZ, 2);
        c9j5.AAQ(chatRequestEnvelopeJson.params, JsonObjectSerializer.A01, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || chatRequestEnvelopeJson.connection_attempt_id != null) {
            c9j5.AAP(chatRequestEnvelopeJson.connection_attempt_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || chatRequestEnvelopeJson.accept_language != null) {
            c9j5.AAP(chatRequestEnvelopeJson.accept_language, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatRequestEnvelopeJson) {
                ChatRequestEnvelopeJson chatRequestEnvelopeJson = (ChatRequestEnvelopeJson) obj;
                if (!C7384Etj.areEqual(this.type, chatRequestEnvelopeJson.type) || !C7384Etj.areEqual(this.id, chatRequestEnvelopeJson.id) || !C7384Etj.areEqual(this.method, chatRequestEnvelopeJson.method) || !C7384Etj.areEqual(this.params, chatRequestEnvelopeJson.params) || !C7384Etj.areEqual(this.connection_attempt_id, chatRequestEnvelopeJson.connection_attempt_id) || !C7384Etj.areEqual(this.accept_language, chatRequestEnvelopeJson.accept_language)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatRequestEnvelopeJson copy$default(ChatRequestEnvelopeJson chatRequestEnvelopeJson, String str, String str2, String str3, JsonObject jsonObject, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatRequestEnvelopeJson.type;
        }
        if ((i & 2) != 0) {
            str2 = chatRequestEnvelopeJson.id;
        }
        if ((i & 4) != 0) {
            str3 = chatRequestEnvelopeJson.method;
        }
        if ((i & 8) != 0) {
            jsonObject = chatRequestEnvelopeJson.params;
        }
        if ((i & 16) != 0) {
            str4 = chatRequestEnvelopeJson.connection_attempt_id;
        }
        if ((i & 32) != 0) {
            str5 = chatRequestEnvelopeJson.accept_language;
        }
        return chatRequestEnvelopeJson.copy(str, str2, str3, jsonObject, str4, str5);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.method;
    }

    public final JsonObject component4() {
        return this.params;
    }

    public final String component5() {
        return this.connection_attempt_id;
    }

    public final String component6() {
        return this.accept_language;
    }

    public final String getAccept_language() {
        return this.accept_language;
    }

    public final String getConnection_attempt_id() {
        return this.connection_attempt_id;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final JsonObject getParams() {
        return this.params;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.params, AnonymousClass005.A0I(this.method, AnonymousClass005.A0I(this.id, AnonymousClass001.A0G(this.type)))) + AnonymousClass006.A0G(this.connection_attempt_id)) * 31) + AnonymousClass005.A0H(this.accept_language);
    }

    public ChatRequestEnvelopeJson(String str, String str2, String str3, JsonObject jsonObject, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, jsonObject);
        this.type = str;
        this.id = str2;
        this.method = str3;
        this.params = jsonObject;
        this.connection_attempt_id = str4;
        this.accept_language = str5;
    }

    public final ChatRequestEnvelopeJson copy(String str, String str2, String str3, JsonObject jsonObject, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, jsonObject);
        return new ChatRequestEnvelopeJson(str, str2, str3, jsonObject, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChatRequestEnvelopeJson(String str, String str2, String str3, JsonObject jsonObject, String str4, String str5, int i, C06H c06h) {
        this(str, str2, str3, jsonObject, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public /* synthetic */ ChatRequestEnvelopeJson(int i, String str, String str2, String str3, JsonObject jsonObject, String str4, String str5, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(ChatRequestEnvelopeJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.id = str2;
        this.method = str3;
        this.params = jsonObject;
        if ((i & 16) == 0) {
            this.connection_attempt_id = null;
        } else {
            this.connection_attempt_id = str4;
        }
        if ((i & 32) == 0) {
            this.accept_language = null;
        } else {
            this.accept_language = str5;
        }
    }
}
