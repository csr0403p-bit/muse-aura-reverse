package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class CustomConnectorOAuthCredential extends C06G {
    public final List<String> domains;
    public final String name;
    public final CustomConnectorOAuthDetails oauth;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthCredential) {
                CustomConnectorOAuthCredential customConnectorOAuthCredential = (CustomConnectorOAuthCredential) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorOAuthCredential.name) || !C7384Etj.areEqual(this.domains, customConnectorOAuthCredential.domains) || !C7384Etj.areEqual(this.oauth, customConnectorOAuthCredential.oauth)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomConnectorOAuthCredential copy$default(CustomConnectorOAuthCredential customConnectorOAuthCredential, String str, List list, CustomConnectorOAuthDetails customConnectorOAuthDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorOAuthCredential.name;
        }
        if ((i & 2) != 0) {
            list = customConnectorOAuthCredential.domains;
        }
        if ((i & 4) != 0) {
            customConnectorOAuthDetails = customConnectorOAuthCredential.oauth;
        }
        return customConnectorOAuthCredential.copy(str, list, customConnectorOAuthDetails);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.domains;
    }

    public final CustomConnectorOAuthDetails component3() {
        return this.oauth;
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public final String getName() {
        return this.name;
    }

    public final CustomConnectorOAuthDetails getOauth() {
        return this.oauth;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.oauth, AnonymousClass005.A0F(this.domains, AnonymousClass001.A0G(this.name)));
    }

    public CustomConnectorOAuthCredential(String str, List<String> list, CustomConnectorOAuthDetails customConnectorOAuthDetails) {
        AnonymousClass005.A0x(str, list, customConnectorOAuthDetails);
        this.name = str;
        this.domains = list;
        this.oauth = customConnectorOAuthDetails;
    }

    public final CustomConnectorOAuthCredential copy(String str, List<String> list, CustomConnectorOAuthDetails customConnectorOAuthDetails) {
        AnonymousClass005.A0x(str, list, customConnectorOAuthDetails);
        return new CustomConnectorOAuthCredential(str, list, customConnectorOAuthDetails);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorOAuthCredential(String str, List list, CustomConnectorOAuthDetails customConnectorOAuthDetails, int i, C06H c06h) {
        this(str, C3cI.A11(list, i), customConnectorOAuthDetails);
    }
}
