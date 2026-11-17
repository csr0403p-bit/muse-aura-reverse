package com.facebook.aura.skills.connect.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorRegisterResponse extends C06G {
    public final String authorizeUrl;
    public final String configPath;
    public final String name;
    public final boolean replaced;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorRegisterResponse) {
                CustomConnectorRegisterResponse customConnectorRegisterResponse = (CustomConnectorRegisterResponse) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorRegisterResponse.name) || !C7384Etj.areEqual(this.configPath, customConnectorRegisterResponse.configPath) || this.replaced != customConnectorRegisterResponse.replaced || !C7384Etj.areEqual(this.authorizeUrl, customConnectorRegisterResponse.authorizeUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorRegisterResponse copy$default(CustomConnectorRegisterResponse customConnectorRegisterResponse, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorRegisterResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorRegisterResponse.configPath;
        }
        if ((i & 4) != 0) {
            z = customConnectorRegisterResponse.replaced;
        }
        if ((i & 8) != 0) {
            str3 = customConnectorRegisterResponse.authorizeUrl;
        }
        AnonymousClass003.A0u(str, str2);
        return new CustomConnectorRegisterResponse(str, str2, z, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.configPath;
    }

    public final boolean component3() {
        return this.replaced;
    }

    public final String component4() {
        return this.authorizeUrl;
    }

    public final String getAuthorizeUrl() {
        return this.authorizeUrl;
    }

    public final String getConfigPath() {
        return this.configPath;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getReplaced() {
        return this.replaced;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.configPath, AnonymousClass001.A0G(this.name)), this.replaced) + AnonymousClass006.A0G(this.authorizeUrl);
    }

    public CustomConnectorRegisterResponse(String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.configPath = str2;
        this.replaced = z;
        this.authorizeUrl = str3;
    }

    public final CustomConnectorRegisterResponse copy(String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new CustomConnectorRegisterResponse(str, str2, z, str3);
    }

    public String toString() {
        return super.toString();
    }
}
