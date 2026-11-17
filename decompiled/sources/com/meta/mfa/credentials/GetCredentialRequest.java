package com.meta.mfa.credentials;

import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9ni;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class GetCredentialRequest {
    public static final Companion Companion = new Companion();
    public final GetCredentialRequestData publicKey;

    public final class Companion {
        public final C9hr<GetCredentialRequest> serializer() {
            return C9ni.A00;
        }
    }

    public /* synthetic */ GetCredentialRequest(int i, GetCredentialRequestData getCredentialRequestData, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9ni.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.publicKey = getCredentialRequestData;
    }

    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public final GetCredentialRequestData getPublicKey() {
        return this.publicKey;
    }

    public GetCredentialRequest(GetCredentialRequestData getCredentialRequestData) {
        C7384Etj.A0Y(getCredentialRequestData, 0);
        this.publicKey = getCredentialRequestData;
    }
}
