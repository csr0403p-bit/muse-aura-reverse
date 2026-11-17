package com.facebook.aura.network.transport.cache;

import X.AnonymousClass005;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchHttpCacheHit {
    public final byte[] body;
    public final String method;
    public final Map<String, String> requestHeaders;
    public final String requestId;
    public final Map<String, String> responseHeaders;
    public final int statusCode;
    public final String url;

    public final byte[] getBody() {
        return this.body;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public HatchHttpCacheHit(String str, String str2, String str3, Map<String, String> map, int i, Map<String, String> map2, byte[] bArr) {
        AnonymousClass005.A14(str, str2, str3, map);
        C7384Etj.A0Y(map2, 5);
        this.requestId = str;
        this.method = str2;
        this.url = str3;
        this.requestHeaders = map;
        this.statusCode = i;
        this.responseHeaders = map2;
        this.body = bArr;
    }
}
