package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CredentialCatalogDeleteResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean deleted;

    public final class Companion {
        public final C9hr<CredentialCatalogDeleteResponseJson> serializer() {
            return CredentialCatalogDeleteResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogDeleteResponseJson credentialCatalogDeleteResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || credentialCatalogDeleteResponseJson.deleted) {
            c9j5.AA7(c9iZ, 0, credentialCatalogDeleteResponseJson.deleted);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CredentialCatalogDeleteResponseJson) && this.deleted == ((CredentialCatalogDeleteResponseJson) obj).deleted);
    }

    public static /* synthetic */ CredentialCatalogDeleteResponseJson copy$default(CredentialCatalogDeleteResponseJson credentialCatalogDeleteResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = credentialCatalogDeleteResponseJson.deleted;
        }
        return new CredentialCatalogDeleteResponseJson(z);
    }

    public final boolean component1() {
        return this.deleted;
    }

    public final CredentialCatalogDeleteResponseJson copy(boolean z) {
        return new CredentialCatalogDeleteResponseJson(z);
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public int hashCode() {
        return this.deleted ? 1231 : 1237;
    }

    public /* synthetic */ CredentialCatalogDeleteResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.deleted = false;
        } else {
            this.deleted = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CredentialCatalogDeleteResponseJson(boolean z) {
        this.deleted = z;
    }

    public /* synthetic */ CredentialCatalogDeleteResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public CredentialCatalogDeleteResponseJson() {
        this(false);
    }
}
