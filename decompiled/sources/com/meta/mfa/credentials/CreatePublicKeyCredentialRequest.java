package com.meta.mfa.credentials;

import X.C2hx;
import X.C7384Etj;
import X.C9gx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CreatePublicKeyCredentialRequest {
    public static final Companion Companion = new Companion();
    public final CreatePublicKeyCredentialRequestData publicKey;

    public final class Companion {
        public final C9hr<CreatePublicKeyCredentialRequest> serializer() {
            return C9gx.A00;
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(int i, CreatePublicKeyCredentialRequestData createPublicKeyCredentialRequestData, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9gx.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.publicKey = createPublicKeyCredentialRequestData;
    }

    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public final CreatePublicKeyCredentialRequestData getPublicKey() {
        return this.publicKey;
    }

    public CreatePublicKeyCredentialRequest(CreatePublicKeyCredentialRequestData createPublicKeyCredentialRequestData) {
        C7384Etj.A0Y(createPublicKeyCredentialRequestData, 0);
        this.publicKey = createPublicKeyCredentialRequestData;
    }
}
