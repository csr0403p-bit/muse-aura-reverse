package com.facebook.aura.settings;

import X.AnonymousClass005;

/* loaded from: classes.dex */
public final class ExternalGrantCapture {
    public final String authProvider;
    public final String captureAuthorization;
    public final String grant;
    public final String idempotencyKey;
    public final String key;
    public final String pageUrl;
    public final String sessionId;

    public final String getAuthProvider() {
        return this.authProvider;
    }

    public final String getCaptureAuthorization() {
        return this.captureAuthorization;
    }

    public final String getGrant() {
        return this.grant;
    }

    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public ExternalGrantCapture(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.key = str;
        this.pageUrl = str2;
        this.authProvider = str3;
        this.grant = str4;
        this.idempotencyKey = str5;
        this.sessionId = str6;
        this.captureAuthorization = str7;
    }
}
