package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyConnector extends C06G {
    public final List<String> hosts;
    public final String mode;
    public final String name;
    public final List<CustomConnectorApiKeyTokenProxyRule> tokenProxy;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyConnector) {
                CustomConnectorApiKeyConnector customConnectorApiKeyConnector = (CustomConnectorApiKeyConnector) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorApiKeyConnector.name) || !C7384Etj.areEqual(this.mode, customConnectorApiKeyConnector.mode) || !C7384Etj.areEqual(this.hosts, customConnectorApiKeyConnector.hosts) || !C7384Etj.areEqual(this.tokenProxy, customConnectorApiKeyConnector.tokenProxy)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomConnectorApiKeyConnector copy$default(CustomConnectorApiKeyConnector customConnectorApiKeyConnector, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorApiKeyConnector.name;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorApiKeyConnector.mode;
        }
        if ((i & 4) != 0) {
            list = customConnectorApiKeyConnector.hosts;
        }
        if ((i & 8) != 0) {
            list2 = customConnectorApiKeyConnector.tokenProxy;
        }
        return customConnectorApiKeyConnector.copy(str, str2, list, list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mode;
    }

    public final List<String> component3() {
        return this.hosts;
    }

    public final List<CustomConnectorApiKeyTokenProxyRule> component4() {
        return this.tokenProxy;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final List<CustomConnectorApiKeyTokenProxyRule> getTokenProxy() {
        return this.tokenProxy;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tokenProxy, AnonymousClass005.A0F(this.hosts, AnonymousClass005.A0I(this.mode, AnonymousClass001.A0G(this.name))));
    }

    public CustomConnectorApiKeyConnector(String str, String str2, List<String> list, List<CustomConnectorApiKeyTokenProxyRule> list2) {
        AnonymousClass005.A14(str, str2, list, list2);
        this.name = str;
        this.mode = str2;
        this.hosts = list;
        this.tokenProxy = list2;
    }

    public final CustomConnectorApiKeyConnector copy(String str, String str2, List<String> list, List<CustomConnectorApiKeyTokenProxyRule> list2) {
        AnonymousClass005.A14(str, str2, list, list2);
        return new CustomConnectorApiKeyConnector(str, str2, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorApiKeyConnector(String str, String str2, List list, List list2, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? C0881AGi.A00 : list2);
    }
}
