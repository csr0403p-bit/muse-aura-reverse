package com.meta.mfa.credentials;

import X.AnonymousClass003;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9l8;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SignalUnknownCredentialRequest {
    public static final Companion Companion = new Companion();
    public final String credentialId;
    public final String rpId;

    public final class Companion {
        public final C9hr<SignalUnknownCredentialRequest> serializer() {
            return C9l8.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(SignalUnknownCredentialRequest signalUnknownCredentialRequest, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(signalUnknownCredentialRequest.rpId, c9iZ, 0);
        c9j5.AAV(signalUnknownCredentialRequest.credentialId, c9iZ, 1);
    }

    public static /* synthetic */ void getCredentialId$annotations() {
    }

    public static /* synthetic */ void getRpId$annotations() {
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public SignalUnknownCredentialRequest(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.rpId = str;
        this.credentialId = str2;
    }

    public /* synthetic */ SignalUnknownCredentialRequest(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(C9l8.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.rpId = str;
        this.credentialId = str2;
    }
}
