package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jL;
import X.C9m3;
import X.C9m7;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetCredentialResponse {
    public static final Companion Companion = new Companion();
    public final String authenticatorAttachment;
    public final String id;
    public final byte[] rawId;
    public final Response response;

    public final class Companion {
        public final C9hr<GetCredentialResponse> serializer() {
            return C9m3.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(GetCredentialResponse getCredentialResponse, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(getCredentialResponse.id, c9iZ, 0);
        c9j5.AAQ(getCredentialResponse.rawId, C9jL.A00, c9iZ, 1);
        c9j5.AAV(getCredentialResponse.authenticatorAttachment, c9iZ, 2);
        c9j5.AAQ(getCredentialResponse.response, C9m7.A00, c9iZ, 3);
    }

    public static /* synthetic */ void getAuthenticatorAttachment$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getRawId$annotations() {
    }

    public static /* synthetic */ void getResponse$annotations() {
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final String getId() {
        return this.id;
    }

    public final byte[] getRawId() {
        return this.rawId;
    }

    public final Response getResponse() {
        return this.response;
    }

    public GetCredentialResponse(String str, byte[] bArr, String str2, Response response) {
        AnonymousClass005.A14(str, bArr, str2, response);
        this.id = str;
        this.rawId = bArr;
        this.authenticatorAttachment = str2;
        this.response = response;
    }

    public /* synthetic */ GetCredentialResponse(int i, String str, byte[] bArr, String str2, Response response, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(C9m3.A01, i, 15);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.rawId = bArr;
        this.authenticatorAttachment = str2;
        this.response = response;
    }
}
