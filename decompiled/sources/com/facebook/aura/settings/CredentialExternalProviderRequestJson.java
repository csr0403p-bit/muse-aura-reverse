package com.facebook.aura.settings;

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
/* loaded from: classes2.dex */
public final class CredentialExternalProviderRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String auth_provider;
    public final String capture_authorization;

    public final class Companion {
        public final C9hr<CredentialExternalProviderRequestJson> serializer() {
            return CredentialExternalProviderRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialExternalProviderRequestJson credentialExternalProviderRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(credentialExternalProviderRequestJson.capture_authorization, c9iZ, 0);
        c9j5.AAV(credentialExternalProviderRequestJson.auth_provider, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialExternalProviderRequestJson) {
                CredentialExternalProviderRequestJson credentialExternalProviderRequestJson = (CredentialExternalProviderRequestJson) obj;
                if (!C7384Etj.areEqual(this.capture_authorization, credentialExternalProviderRequestJson.capture_authorization) || !C7384Etj.areEqual(this.auth_provider, credentialExternalProviderRequestJson.auth_provider)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CredentialExternalProviderRequestJson copy$default(CredentialExternalProviderRequestJson credentialExternalProviderRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialExternalProviderRequestJson.capture_authorization;
        }
        if ((i & 2) != 0) {
            str2 = credentialExternalProviderRequestJson.auth_provider;
        }
        AnonymousClass003.A0u(str, str2);
        return new CredentialExternalProviderRequestJson(str, str2);
    }

    public final String component1() {
        return this.capture_authorization;
    }

    public final String component2() {
        return this.auth_provider;
    }

    public final String getAuth_provider() {
        return this.auth_provider;
    }

    public final String getCapture_authorization() {
        return this.capture_authorization;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.auth_provider, AnonymousClass001.A0G(this.capture_authorization));
    }

    public CredentialExternalProviderRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.capture_authorization = str;
        this.auth_provider = str2;
    }

    public final CredentialExternalProviderRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new CredentialExternalProviderRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialExternalProviderRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CredentialExternalProviderRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.capture_authorization = str;
        this.auth_provider = str2;
    }
}
