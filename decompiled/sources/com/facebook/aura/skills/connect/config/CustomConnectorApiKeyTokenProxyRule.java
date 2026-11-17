package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyTokenProxyRule extends C06G {
    public final String field;
    public final CustomConnectorApiKeyPlacement placement;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyTokenProxyRule) {
                CustomConnectorApiKeyTokenProxyRule customConnectorApiKeyTokenProxyRule = (CustomConnectorApiKeyTokenProxyRule) obj;
                if (!C7384Etj.areEqual(this.field, customConnectorApiKeyTokenProxyRule.field) || !C7384Etj.areEqual(this.placement, customConnectorApiKeyTokenProxyRule.placement)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorApiKeyTokenProxyRule copy$default(CustomConnectorApiKeyTokenProxyRule customConnectorApiKeyTokenProxyRule, String str, CustomConnectorApiKeyPlacement customConnectorApiKeyPlacement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorApiKeyTokenProxyRule.field;
        }
        if ((i & 2) != 0) {
            customConnectorApiKeyPlacement = customConnectorApiKeyTokenProxyRule.placement;
        }
        AnonymousClass003.A0u(str, customConnectorApiKeyPlacement);
        return new CustomConnectorApiKeyTokenProxyRule(str, customConnectorApiKeyPlacement);
    }

    public final String component1() {
        return this.field;
    }

    public final CustomConnectorApiKeyPlacement component2() {
        return this.placement;
    }

    public final String getField() {
        return this.field;
    }

    public final CustomConnectorApiKeyPlacement getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.placement, AnonymousClass001.A0G(this.field));
    }

    public CustomConnectorApiKeyTokenProxyRule(String str, CustomConnectorApiKeyPlacement customConnectorApiKeyPlacement) {
        AnonymousClass003.A0u(str, customConnectorApiKeyPlacement);
        this.field = str;
        this.placement = customConnectorApiKeyPlacement;
    }

    public final CustomConnectorApiKeyTokenProxyRule copy(String str, CustomConnectorApiKeyPlacement customConnectorApiKeyPlacement) {
        AnonymousClass003.A0u(str, customConnectorApiKeyPlacement);
        return new CustomConnectorApiKeyTokenProxyRule(str, customConnectorApiKeyPlacement);
    }

    public String toString() {
        return super.toString();
    }
}
