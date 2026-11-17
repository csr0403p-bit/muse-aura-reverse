package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ClientInvokeErrorJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;
    public final String message;

    public final class Companion {
        public final C9hr<ClientInvokeErrorJson> serializer() {
            return ClientInvokeErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(ClientInvokeErrorJson clientInvokeErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(clientInvokeErrorJson.code, c9iZ, 0);
        c9j5.AAV(clientInvokeErrorJson.message, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientInvokeErrorJson) {
                ClientInvokeErrorJson clientInvokeErrorJson = (ClientInvokeErrorJson) obj;
                if (!C7384Etj.areEqual(this.code, clientInvokeErrorJson.code) || !C7384Etj.areEqual(this.message, clientInvokeErrorJson.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClientInvokeErrorJson copy$default(ClientInvokeErrorJson clientInvokeErrorJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientInvokeErrorJson.code;
        }
        if ((i & 2) != 0) {
            str2 = clientInvokeErrorJson.message;
        }
        AnonymousClass003.A0u(str, str2);
        return new ClientInvokeErrorJson(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.message, AnonymousClass001.A0G(this.code));
    }

    public ClientInvokeErrorJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.code = str;
        this.message = str2;
    }

    public final ClientInvokeErrorJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ClientInvokeErrorJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ClientInvokeErrorJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ClientInvokeErrorJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.code = str;
        this.message = str2;
    }
}
