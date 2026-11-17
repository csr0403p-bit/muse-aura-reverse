package com.facebook.aura.auth.postconsolidation;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class PostConsolidationSurvivorFrlCredential {
    public static final int $stable = 0;
    public final String accessToken;
    public final String accountId;

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public PostConsolidationSurvivorFrlCredential(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.accountId = str;
        this.accessToken = str2;
    }
}
