package com.facebook.aura.settings;

import X.AnonymousClass003;

/* loaded from: classes.dex */
public final class ExternalProviderGrantRequest {
    public static final int $stable = 8;
    public final String key;
    public final ExternalProviderGrantResult result;

    public final String getKey() {
        return this.key;
    }

    public final ExternalProviderGrantResult getResult() {
        return this.result;
    }

    public ExternalProviderGrantRequest(String str, ExternalProviderGrantResult externalProviderGrantResult) {
        AnonymousClass003.A0u(str, externalProviderGrantResult);
        this.key = str;
        this.result = externalProviderGrantResult;
    }
}
