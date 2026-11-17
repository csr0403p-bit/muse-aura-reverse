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
public final class CredentialCatalogUpdateFieldJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String name;
    public final String value;

    public final class Companion {
        public final C9hr<CredentialCatalogUpdateFieldJson> serializer() {
            return CredentialCatalogUpdateFieldJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogUpdateFieldJson credentialCatalogUpdateFieldJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(credentialCatalogUpdateFieldJson.name, c9iZ, 0);
        c9j5.AAV(credentialCatalogUpdateFieldJson.value, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCatalogUpdateFieldJson) {
                CredentialCatalogUpdateFieldJson credentialCatalogUpdateFieldJson = (CredentialCatalogUpdateFieldJson) obj;
                if (!C7384Etj.areEqual(this.name, credentialCatalogUpdateFieldJson.name) || !C7384Etj.areEqual(this.value, credentialCatalogUpdateFieldJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CredentialCatalogUpdateFieldJson copy$default(CredentialCatalogUpdateFieldJson credentialCatalogUpdateFieldJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCatalogUpdateFieldJson.name;
        }
        if ((i & 2) != 0) {
            str2 = credentialCatalogUpdateFieldJson.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new CredentialCatalogUpdateFieldJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.name));
    }

    public CredentialCatalogUpdateFieldJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.value = str2;
    }

    public final CredentialCatalogUpdateFieldJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new CredentialCatalogUpdateFieldJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCatalogUpdateFieldJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CredentialCatalogUpdateFieldJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.value = str2;
    }
}
