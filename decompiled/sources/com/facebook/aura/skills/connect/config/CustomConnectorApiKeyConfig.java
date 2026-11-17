package com.facebook.aura.skills.connect.config;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyConfig extends C06G {
    public final CustomConnectorApiKeyConnector connector;
    public final int version;

    public CustomConnectorApiKeyConfig(int i, CustomConnectorApiKeyConnector customConnectorApiKeyConnector) {
        C7384Etj.A0Y(customConnectorApiKeyConnector, 1);
        this.version = i;
        this.connector = customConnectorApiKeyConnector;
    }

    public final CustomConnectorApiKeyConfig copy(int i, CustomConnectorApiKeyConnector customConnectorApiKeyConnector) {
        C7384Etj.A0Y(customConnectorApiKeyConnector, 1);
        return new CustomConnectorApiKeyConfig(i, customConnectorApiKeyConnector);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyConfig) {
                CustomConnectorApiKeyConfig customConnectorApiKeyConfig = (CustomConnectorApiKeyConfig) obj;
                if (this.version != customConnectorApiKeyConfig.version || !C7384Etj.areEqual(this.connector, customConnectorApiKeyConfig.connector)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorApiKeyConfig copy$default(CustomConnectorApiKeyConfig customConnectorApiKeyConfig, int i, CustomConnectorApiKeyConnector customConnectorApiKeyConnector, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customConnectorApiKeyConfig.version;
        }
        if ((i2 & 2) != 0) {
            customConnectorApiKeyConnector = customConnectorApiKeyConfig.connector;
        }
        C7384Etj.A0Y(customConnectorApiKeyConnector, 1);
        return new CustomConnectorApiKeyConfig(i, customConnectorApiKeyConnector);
    }

    public final int component1() {
        return this.version;
    }

    public final CustomConnectorApiKeyConnector component2() {
        return this.connector;
    }

    public final CustomConnectorApiKeyConnector getConnector() {
        return this.connector;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connector, this.version * 31);
    }

    public String toString() {
        return super.toString();
    }
}
