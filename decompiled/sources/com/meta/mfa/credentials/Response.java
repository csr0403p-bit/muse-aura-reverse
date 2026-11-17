package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9m7;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class Response {
    public static final Companion Companion = new Companion();
    public final String authenticatorData;
    public final String clientDataJSON;
    public final String signature;

    public final class Companion {
        public final C9hr<Response> serializer() {
            return C9m7.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(Response response, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(response.clientDataJSON, c9iZ, 0);
        c9j5.AAV(response.authenticatorData, c9iZ, 1);
        c9j5.AAV(response.signature, c9iZ, 2);
    }

    public static /* synthetic */ void getAuthenticatorData$annotations() {
    }

    public static /* synthetic */ void getClientDataJSON$annotations() {
    }

    public static /* synthetic */ void getSignature$annotations() {
    }

    public final String getAuthenticatorData() {
        return this.authenticatorData;
    }

    public final String getClientDataJSON() {
        return this.clientDataJSON;
    }

    public final String getSignature() {
        return this.signature;
    }

    public Response(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.clientDataJSON = str;
        this.authenticatorData = str2;
        this.signature = str3;
    }

    public /* synthetic */ Response(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C9m7.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.clientDataJSON = str;
        this.authenticatorData = str2;
        this.signature = str3;
    }
}
