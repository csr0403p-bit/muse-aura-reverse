package com.facebook.aura.settings;

import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public abstract class SecureStorageCatalogRow {
    public final String displayName;
    public final String key;

    public final class Credential extends SecureStorageCatalogRow {
        public static final int $stable = 0;
        public final CredentialCandidate candidate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Credential(CredentialCandidate credentialCandidate) {
            super(FGI.A0M("credential:", credentialCandidate.id), credentialCandidate.displayName);
            C7384Etj.A0Y(credentialCandidate, 0);
            this.candidate = credentialCandidate;
        }

        public final CredentialCandidate getCandidate() {
            return this.candidate;
        }
    }

    public final class CustomConnector extends SecureStorageCatalogRow {
        public static final int $stable = 0;
        public final CustomConnectorCandidate connector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomConnector(CustomConnectorCandidate customConnectorCandidate) {
            super(FGI.A0M("custom_connector:", customConnectorCandidate.name), customConnectorCandidate.host);
            C7384Etj.A0Y(customConnectorCandidate, 0);
            this.connector = customConnectorCandidate;
        }

        public final CustomConnectorCandidate getConnector() {
            return this.connector;
        }
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getKey() {
        return this.key;
    }

    public SecureStorageCatalogRow(String str, String str2) {
        this.key = str;
        this.displayName = str2;
    }

    public /* synthetic */ SecureStorageCatalogRow(String str, String str2, C06H c06h) {
        this(str, str2);
    }
}
