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
public final class CredentialCatalogDeleteRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String credential_type;
    public final String id;

    public final class Companion {
        public final C9hr<CredentialCatalogDeleteRequestJson> serializer() {
            return CredentialCatalogDeleteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogDeleteRequestJson credentialCatalogDeleteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !"browser".equals(credentialCatalogDeleteRequestJson.credential_type)) {
            c9j5.AAV(credentialCatalogDeleteRequestJson.credential_type, c9iZ, 0);
        }
        c9j5.AAV(credentialCatalogDeleteRequestJson.id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCatalogDeleteRequestJson) {
                CredentialCatalogDeleteRequestJson credentialCatalogDeleteRequestJson = (CredentialCatalogDeleteRequestJson) obj;
                if (!C7384Etj.areEqual(this.credential_type, credentialCatalogDeleteRequestJson.credential_type) || !C7384Etj.areEqual(this.id, credentialCatalogDeleteRequestJson.id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CredentialCatalogDeleteRequestJson copy$default(CredentialCatalogDeleteRequestJson credentialCatalogDeleteRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCatalogDeleteRequestJson.credential_type;
        }
        if ((i & 2) != 0) {
            str2 = credentialCatalogDeleteRequestJson.id;
        }
        AnonymousClass003.A0u(str, str2);
        return new CredentialCatalogDeleteRequestJson(str, str2);
    }

    public final String component1() {
        return this.credential_type;
    }

    public final String component2() {
        return this.id;
    }

    public final String getCredential_type() {
        return this.credential_type;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.id, AnonymousClass001.A0G(this.credential_type));
    }

    public CredentialCatalogDeleteRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.credential_type = str;
        this.id = str2;
    }

    public final CredentialCatalogDeleteRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new CredentialCatalogDeleteRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCatalogDeleteRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (2 != (i & 2)) {
            C9iI.A00(CredentialCatalogDeleteRequestJson$$serializer.descriptor, i, 2);
            throw F60.createAndThrow();
        }
        this.credential_type = (i & 1) == 0 ? "browser" : str;
        this.id = str2;
    }

    public /* synthetic */ CredentialCatalogDeleteRequestJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "browser" : str, str2);
    }
}
