package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorLink extends C06G {
    public final String connectorName;
    public final String encodedConfig;
    public final CustomConnectorMode mode;
    public final String service;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorLink) {
                CustomConnectorLink customConnectorLink = (CustomConnectorLink) obj;
                if (!C7384Etj.areEqual(this.url, customConnectorLink.url) || this.mode != customConnectorLink.mode || !C7384Etj.areEqual(this.encodedConfig, customConnectorLink.encodedConfig) || !C7384Etj.areEqual(this.service, customConnectorLink.service) || !C7384Etj.areEqual(this.connectorName, customConnectorLink.connectorName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorLink copy$default(CustomConnectorLink customConnectorLink, String str, CustomConnectorMode customConnectorMode, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorLink.url;
        }
        if ((i & 2) != 0) {
            customConnectorMode = customConnectorLink.mode;
        }
        if ((i & 4) != 0) {
            str2 = customConnectorLink.encodedConfig;
        }
        if ((i & 8) != 0) {
            str3 = customConnectorLink.service;
        }
        if ((i & 16) != 0) {
            str4 = customConnectorLink.connectorName;
        }
        return customConnectorLink.copy(str, customConnectorMode, str2, str3, str4);
    }

    public final String component1() {
        return this.url;
    }

    public final CustomConnectorMode component2() {
        return this.mode;
    }

    public final String component3() {
        return this.encodedConfig;
    }

    public final String component4() {
        return this.service;
    }

    public final String component5() {
        return this.connectorName;
    }

    public final String getConnectorName() {
        return this.connectorName;
    }

    public final String getEncodedConfig() {
        return this.encodedConfig;
    }

    public final CustomConnectorMode getMode() {
        return this.mode;
    }

    public final String getService() {
        return this.service;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.encodedConfig, AnonymousClass005.A0F(this.mode, AnonymousClass001.A0G(this.url))) + AnonymousClass006.A0G(this.service)) * 31) + AnonymousClass005.A0H(this.connectorName);
    }

    public CustomConnectorLink(String str, CustomConnectorMode customConnectorMode, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, customConnectorMode, str2);
        this.url = str;
        this.mode = customConnectorMode;
        this.encodedConfig = str2;
        this.service = str3;
        this.connectorName = str4;
    }

    public final CustomConnectorLink copy(String str, CustomConnectorMode customConnectorMode, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, customConnectorMode, str2);
        return new CustomConnectorLink(str, customConnectorMode, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
