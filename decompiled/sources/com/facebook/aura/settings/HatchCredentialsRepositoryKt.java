package com.facebook.aura.settings;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.BFI;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.onepassword.OnePasswordCredentialsKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class HatchCredentialsRepositoryKt {
    public static final int CREDENTIAL_CATALOG_PAGE_LIMIT = 200;
    public static final Set<String> SUPPORTED_AGENT_PERMISSION_FIELDS = BFI.A0H(new String[]{"username", HatchConnectorQplLogger.AuthType.PASSWORD});

    public static final CredentialAgentPermission supportedAgentPermission(CredentialCatalogDetailsResponseJson credentialCatalogDetailsResponseJson) {
        if (!OnePasswordCredentialsKt.isOnePasswordCredential(credentialCatalogDetailsResponseJson.auth_provider, credentialCatalogDetailsResponseJson.protected_field_names)) {
            Set setA0g = AbstractC0878AGe.A0g(credentialCatalogDetailsResponseJson.protected_field_names);
            int size = setA0g.size();
            if (1 > size || size >= 3 || setA0g.size() != credentialCatalogDetailsResponseJson.protected_field_names.size()) {
                return null;
            }
            Set<String> set = SUPPORTED_AGENT_PERMISSION_FIELDS;
            if (!(setA0g instanceof Collection) || !setA0g.isEmpty()) {
                Iterator it = setA0g.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        return null;
                    }
                }
            }
        }
        return CredentialAgentPermission.Companion.fromWire(credentialCatalogDetailsResponseJson.agent_permission);
    }

    public static final CredentialCandidate toDomain(CredentialCatalogItemJson credentialCatalogItemJson) {
        AHD ahdA07 = AGI.A07(credentialCatalogItemJson.origins);
        String str = (String) AbstractC0878AGe.A0G(ahdA07);
        if (str == null) {
            str = "";
        }
        String host = Uri.parse(str).getHost();
        if (host == null || C7BY.A0j(host)) {
            host = str;
        }
        return new CredentialCandidate(credentialCatalogItemJson.id, host, ahdA07, AGI.A07(credentialCatalogItemJson.protected_field_names), credentialCatalogItemJson.label, credentialCatalogItemJson.available, OnePasswordCredentialsKt.isOnePasswordCredential(credentialCatalogItemJson.auth_provider, credentialCatalogItemJson.protected_field_names));
    }

    public static final CustomConnectorCandidate toDomain(CustomConnectorListItemJson customConnectorListItemJson) {
        String str = customConnectorListItemJson.name;
        String str2 = (String) AbstractC0878AGe.A0G(customConnectorListItemJson.hosts);
        if (str2 == null) {
            str2 = "";
        }
        return new CustomConnectorCandidate(str, str2);
    }
}
