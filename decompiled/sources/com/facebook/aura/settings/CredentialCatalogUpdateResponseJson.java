package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class CredentialCatalogUpdateResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agent_permission;
    public final boolean updated;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C9hr<CredentialCatalogUpdateResponseJson> serializer() {
            return CredentialCatalogUpdateResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogUpdateResponseJson credentialCatalogUpdateResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || credentialCatalogUpdateResponseJson.updated) {
            c9j5.AA7(c9iZ, 0, credentialCatalogUpdateResponseJson.updated);
        }
        if (zAfR || credentialCatalogUpdateResponseJson.agent_permission != null) {
            c9j5.AAP(credentialCatalogUpdateResponseJson.agent_permission, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCatalogUpdateResponseJson) {
                CredentialCatalogUpdateResponseJson credentialCatalogUpdateResponseJson = (CredentialCatalogUpdateResponseJson) obj;
                if (this.updated != credentialCatalogUpdateResponseJson.updated || !C7384Etj.areEqual(this.agent_permission, credentialCatalogUpdateResponseJson.agent_permission)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CredentialCatalogUpdateResponseJson copy$default(CredentialCatalogUpdateResponseJson credentialCatalogUpdateResponseJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = credentialCatalogUpdateResponseJson.updated;
        }
        if ((i & 2) != 0) {
            str = credentialCatalogUpdateResponseJson.agent_permission;
        }
        return new CredentialCatalogUpdateResponseJson(z, str);
    }

    public final boolean component1() {
        return this.updated;
    }

    public final String component2() {
        return this.agent_permission;
    }

    public final CredentialCatalogUpdateResponseJson copy(boolean z, String str) {
        return new CredentialCatalogUpdateResponseJson(z, str);
    }

    public final String getAgent_permission() {
        return this.agent_permission;
    }

    public final boolean getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        return C0KA.A02(this.updated) + AnonymousClass006.A0G(this.agent_permission);
    }

    public CredentialCatalogUpdateResponseJson(boolean z, String str) {
        this.updated = z;
        this.agent_permission = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCatalogUpdateResponseJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str));
    }

    public /* synthetic */ CredentialCatalogUpdateResponseJson(int i, boolean z, String str, C2hx c2hx) {
        this.updated = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.agent_permission = null;
        } else {
            this.agent_permission = str;
        }
    }

    public CredentialCatalogUpdateResponseJson() {
        this(false, null);
    }
}
