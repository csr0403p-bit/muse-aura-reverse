package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C07348in;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C79;
import X.C8O0;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SignalAllAcceptedCredentialsRequest {
    public final List<String> allAcceptedCredentialIds;
    public final String rpId;
    public final String userId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, new C07348in(6));

    public final class Companion {
        public final C9hr<SignalAllAcceptedCredentialsRequest> serializer() {
            return C8O0.A00;
        }
    }

    public static /* synthetic */ void getAllAcceptedCredentialIds$annotations() {
    }

    public static /* synthetic */ void getRpId$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(SignalAllAcceptedCredentialsRequest signalAllAcceptedCredentialsRequest, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(signalAllAcceptedCredentialsRequest.rpId, c9iZ, 0);
        c9j5.AAV(signalAllAcceptedCredentialsRequest.userId, c9iZ, 1);
        c9j5.AAQ(signalAllAcceptedCredentialsRequest.allAcceptedCredentialIds, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final List<String> getAllAcceptedCredentialIds() {
        return this.allAcceptedCredentialIds;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public SignalAllAcceptedCredentialsRequest(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.rpId = str;
        this.userId = str2;
        this.allAcceptedCredentialIds = list;
    }

    public /* synthetic */ SignalAllAcceptedCredentialsRequest(int i, String str, String str2, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C8O0.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.rpId = str;
        this.userId = str2;
        this.allAcceptedCredentialIds = list;
    }
}
