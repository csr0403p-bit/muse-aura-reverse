package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9l5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SignalCurrentUserDetailsRequest {
    public static final Companion Companion = new Companion();
    public final String displayName;
    public final String name;
    public final String rpId;
    public final String userId;

    public final class Companion {
        public final C9hr<SignalCurrentUserDetailsRequest> serializer() {
            return C9l5.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(SignalCurrentUserDetailsRequest signalCurrentUserDetailsRequest, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(signalCurrentUserDetailsRequest.rpId, c9iZ, 0);
        c9j5.AAV(signalCurrentUserDetailsRequest.userId, c9iZ, 1);
        c9j5.AAV(signalCurrentUserDetailsRequest.name, c9iZ, 2);
        c9j5.AAV(signalCurrentUserDetailsRequest.displayName, c9iZ, 3);
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getRpId$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public SignalCurrentUserDetailsRequest(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.rpId = str;
        this.userId = str2;
        this.name = str3;
        this.displayName = str4;
    }

    public /* synthetic */ SignalCurrentUserDetailsRequest(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(C9l5.A01, i, 15);
            throw F60.createAndThrow();
        }
        this.rpId = str;
        this.userId = str2;
        this.name = str3;
        this.displayName = str4;
    }
}
