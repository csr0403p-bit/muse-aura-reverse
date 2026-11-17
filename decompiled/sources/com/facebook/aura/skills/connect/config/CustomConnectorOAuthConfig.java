package com.facebook.aura.skills.connect.config;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorOAuthConfig extends C06G {
    public final CustomConnectorOAuthCredential credential;
    public final int version;

    public CustomConnectorOAuthConfig(int i, CustomConnectorOAuthCredential customConnectorOAuthCredential) {
        C7384Etj.A0Y(customConnectorOAuthCredential, 1);
        this.version = i;
        this.credential = customConnectorOAuthCredential;
    }

    public final CustomConnectorOAuthConfig copy(int i, CustomConnectorOAuthCredential customConnectorOAuthCredential) {
        C7384Etj.A0Y(customConnectorOAuthCredential, 1);
        return new CustomConnectorOAuthConfig(i, customConnectorOAuthCredential);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthConfig) {
                CustomConnectorOAuthConfig customConnectorOAuthConfig = (CustomConnectorOAuthConfig) obj;
                if (this.version != customConnectorOAuthConfig.version || !C7384Etj.areEqual(this.credential, customConnectorOAuthConfig.credential)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorOAuthConfig copy$default(CustomConnectorOAuthConfig customConnectorOAuthConfig, int i, CustomConnectorOAuthCredential customConnectorOAuthCredential, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customConnectorOAuthConfig.version;
        }
        if ((i2 & 2) != 0) {
            customConnectorOAuthCredential = customConnectorOAuthConfig.credential;
        }
        C7384Etj.A0Y(customConnectorOAuthCredential, 1);
        return new CustomConnectorOAuthConfig(i, customConnectorOAuthCredential);
    }

    public final int component1() {
        return this.version;
    }

    public final CustomConnectorOAuthCredential component2() {
        return this.credential;
    }

    public final CustomConnectorOAuthCredential getCredential() {
        return this.credential;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.credential, this.version * 31);
    }

    public String toString() {
        return super.toString();
    }
}
