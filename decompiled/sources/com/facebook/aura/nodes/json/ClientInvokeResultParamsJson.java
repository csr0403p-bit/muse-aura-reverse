package com.facebook.aura.nodes.json;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ClientInvokeResultParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String card_json;
    public final String client_id;
    public final String description;
    public final ClientInvokeErrorJson error;
    public final JsonArray files;
    public final String invoke_id;
    public final boolean ok;
    public final String payload_json;

    public final class Companion {
        public final C9hr<ClientInvokeResultParamsJson> serializer() {
            return ClientInvokeResultParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ClientInvokeResultParamsJson(String str, String str2, boolean z, String str3, JsonArray jsonArray, ClientInvokeErrorJson clientInvokeErrorJson, String str4, String str5) {
        C7384Etj.A0Y(str2, 1);
        this.client_id = str;
        this.invoke_id = str2;
        this.ok = z;
        this.payload_json = str3;
        this.files = jsonArray;
        this.error = clientInvokeErrorJson;
        this.card_json = str4;
        this.description = str5;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(ClientInvokeResultParamsJson clientInvokeResultParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || clientInvokeResultParamsJson.client_id != null) {
            c9j5.AAP(clientInvokeResultParamsJson.client_id, C07779iq.A01, c9iZ, 0);
        }
        c9j5.AAV(clientInvokeResultParamsJson.invoke_id, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, clientInvokeResultParamsJson.ok);
        if (zAfR || clientInvokeResultParamsJson.payload_json != null) {
            c9j5.AAP(clientInvokeResultParamsJson.payload_json, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || clientInvokeResultParamsJson.files != null) {
            c9j5.AAP(clientInvokeResultParamsJson.files, JsonArraySerializer.A01, c9iZ, 4);
        }
        if (zAfR || clientInvokeResultParamsJson.error != null) {
            c9j5.AAP(clientInvokeResultParamsJson.error, ClientInvokeErrorJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || clientInvokeResultParamsJson.card_json != null) {
            c9j5.AAP(clientInvokeResultParamsJson.card_json, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || clientInvokeResultParamsJson.description != null) {
            c9j5.AAP(clientInvokeResultParamsJson.description, C07779iq.A01, c9iZ, 7);
        }
    }

    public final ClientInvokeResultParamsJson copy(String str, String str2, boolean z, String str3, JsonArray jsonArray, ClientInvokeErrorJson clientInvokeErrorJson, String str4, String str5) {
        C7384Etj.A0Y(str2, 1);
        return new ClientInvokeResultParamsJson(str, str2, z, str3, jsonArray, clientInvokeErrorJson, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientInvokeResultParamsJson) {
                ClientInvokeResultParamsJson clientInvokeResultParamsJson = (ClientInvokeResultParamsJson) obj;
                if (!C7384Etj.areEqual(this.client_id, clientInvokeResultParamsJson.client_id) || !C7384Etj.areEqual(this.invoke_id, clientInvokeResultParamsJson.invoke_id) || this.ok != clientInvokeResultParamsJson.ok || !C7384Etj.areEqual(this.payload_json, clientInvokeResultParamsJson.payload_json) || !C7384Etj.areEqual(this.files, clientInvokeResultParamsJson.files) || !C7384Etj.areEqual(this.error, clientInvokeResultParamsJson.error) || !C7384Etj.areEqual(this.card_json, clientInvokeResultParamsJson.card_json) || !C7384Etj.areEqual(this.description, clientInvokeResultParamsJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClientInvokeResultParamsJson copy$default(ClientInvokeResultParamsJson clientInvokeResultParamsJson, String str, String str2, boolean z, String str3, JsonArray jsonArray, ClientInvokeErrorJson clientInvokeErrorJson, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientInvokeResultParamsJson.client_id;
        }
        if ((i & 2) != 0) {
            str2 = clientInvokeResultParamsJson.invoke_id;
        }
        if ((i & 4) != 0) {
            z = clientInvokeResultParamsJson.ok;
        }
        if ((i & 8) != 0) {
            str3 = clientInvokeResultParamsJson.payload_json;
        }
        if ((i & 16) != 0) {
            jsonArray = clientInvokeResultParamsJson.files;
        }
        if ((i & 32) != 0) {
            clientInvokeErrorJson = clientInvokeResultParamsJson.error;
        }
        if ((i & 64) != 0) {
            str4 = clientInvokeResultParamsJson.card_json;
        }
        if ((i & 128) != 0) {
            str5 = clientInvokeResultParamsJson.description;
        }
        return clientInvokeResultParamsJson.copy(str, str2, z, str3, jsonArray, clientInvokeErrorJson, str4, str5);
    }

    public final String component1() {
        return this.client_id;
    }

    public final String component2() {
        return this.invoke_id;
    }

    public final boolean component3() {
        return this.ok;
    }

    public final String component4() {
        return this.payload_json;
    }

    public final JsonArray component5() {
        return this.files;
    }

    public final ClientInvokeErrorJson component6() {
        return this.error;
    }

    public final String component7() {
        return this.card_json;
    }

    public final String component8() {
        return this.description;
    }

    public final String getCard_json() {
        return this.card_json;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ClientInvokeErrorJson getError() {
        return this.error;
    }

    public final JsonArray getFiles() {
        return this.files;
    }

    public final String getInvoke_id() {
        return this.invoke_id;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getPayload_json() {
        return this.payload_json;
    }

    public int hashCode() {
        return ((((((((C0KA.A01(AnonymousClass005.A0I(this.invoke_id, AnonymousClass006.A0G(this.client_id) * 31), this.ok) + AnonymousClass006.A0G(this.payload_json)) * 31) + AnonymousClass006.A0D(this.files)) * 31) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass006.A0G(this.card_json)) * 31) + AnonymousClass005.A0H(this.description);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ClientInvokeResultParamsJson(String str, String str2, boolean z, String str3, JsonArray jsonArray, ClientInvokeErrorJson clientInvokeErrorJson, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : jsonArray, (i & 32) != 0 ? null : clientInvokeErrorJson, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }

    public /* synthetic */ ClientInvokeResultParamsJson(int i, String str, String str2, boolean z, String str3, JsonArray jsonArray, ClientInvokeErrorJson clientInvokeErrorJson, String str4, String str5, C2hx c2hx) {
        if (6 != (i & 6)) {
            C9iI.A00(ClientInvokeResultParamsJson$$serializer.descriptor, i, 6);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.client_id = null;
        } else {
            this.client_id = str;
        }
        this.invoke_id = str2;
        this.ok = z;
        if ((i & 8) == 0) {
            this.payload_json = null;
        } else {
            this.payload_json = str3;
        }
        if ((i & 16) == 0) {
            this.files = null;
        } else {
            this.files = jsonArray;
        }
        if ((i & 32) == 0) {
            this.error = null;
        } else {
            this.error = clientInvokeErrorJson;
        }
        if ((i & 64) == 0) {
            this.card_json = null;
        } else {
            this.card_json = str4;
        }
        if ((i & 128) == 0) {
            this.description = null;
        } else {
            this.description = str5;
        }
    }
}
