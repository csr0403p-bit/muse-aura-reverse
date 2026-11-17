package com.facebook.aura.settings;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CredentialExternalProviderResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String grant_request;

    public final class Companion {
        public final C9hr<CredentialExternalProviderResponseJson> serializer() {
            return CredentialExternalProviderResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CredentialExternalProviderResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CredentialExternalProviderResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CredentialExternalProviderResponseJson) && C7384Etj.areEqual(this.grant_request, ((CredentialExternalProviderResponseJson) obj).grant_request));
    }

    public /* synthetic */ CredentialExternalProviderResponseJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CredentialExternalProviderResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.grant_request = str;
    }

    public static /* synthetic */ CredentialExternalProviderResponseJson copy$default(CredentialExternalProviderResponseJson credentialExternalProviderResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialExternalProviderResponseJson.grant_request;
        }
        C7384Etj.A0Y(str, 0);
        return new CredentialExternalProviderResponseJson(str);
    }

    public final String component1() {
        return this.grant_request;
    }

    public final String getGrant_request() {
        return this.grant_request;
    }

    public int hashCode() {
        return this.grant_request.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public CredentialExternalProviderResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.grant_request = str;
    }
}
