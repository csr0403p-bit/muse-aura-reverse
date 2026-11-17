package com.meta.mfa.credentials;

import X.AnonymousClass003;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9lx;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CreatePublicKeyCredentialResponseData {
    public static final Companion Companion = new Companion();
    public final String attestationObject;
    public final String clientDataJSON;
    public final String publicKey;
    public final Integer publicKeyAlgorithm;

    public final class Companion {
        public final C9hr<CreatePublicKeyCredentialResponseData> serializer() {
            return C9lx.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(CreatePublicKeyCredentialResponseData createPublicKeyCredentialResponseData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(createPublicKeyCredentialResponseData.clientDataJSON, c9iZ, 0);
        c9j5.AAV(createPublicKeyCredentialResponseData.attestationObject, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || createPublicKeyCredentialResponseData.publicKeyAlgorithm != null) {
            c9j5.AAP(createPublicKeyCredentialResponseData.publicKeyAlgorithm, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || createPublicKeyCredentialResponseData.publicKey != null) {
            c9j5.AAP(createPublicKeyCredentialResponseData.publicKey, C07779iq.A01, c9iZ, 3);
        }
    }

    public static /* synthetic */ void getAttestationObject$annotations() {
    }

    public static /* synthetic */ void getClientDataJSON$annotations() {
    }

    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static /* synthetic */ void getPublicKeyAlgorithm$annotations() {
    }

    public final String getAttestationObject() {
        return this.attestationObject;
    }

    public final String getClientDataJSON() {
        return this.clientDataJSON;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final Integer getPublicKeyAlgorithm() {
        return this.publicKeyAlgorithm;
    }

    public CreatePublicKeyCredentialResponseData(String str, String str2, Integer num, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.clientDataJSON = str;
        this.attestationObject = str2;
        this.publicKeyAlgorithm = num;
        this.publicKey = str3;
    }

    public /* synthetic */ CreatePublicKeyCredentialResponseData(int i, String str, String str2, Integer num, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(C9lx.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.clientDataJSON = str;
        this.attestationObject = str2;
        if ((i & 4) == 0) {
            this.publicKeyAlgorithm = null;
        } else {
            this.publicKeyAlgorithm = num;
        }
        if ((i & 8) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str3;
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialResponseData(String str, String str2, Integer num, String str3, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
