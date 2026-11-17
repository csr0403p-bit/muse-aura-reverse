package com.facebook.aura.network.tigon;

import X.AGH;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CXt;
import X.CYV;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AuraTigonHttpRequest {
    public final boolean addUserAgent;
    public final AuraTigonAuthPolicy authPolicy;
    public final AuraTigonBody body;
    public final boolean followRedirects;
    public final String friendlyName;
    public final Map<String, String> headers;
    public final String method;
    public final CYV requestCategory;
    public final CXt requestPurpose;
    public final Boolean retryable;
    public final Long timeoutMs;
    public final String url;
    public final boolean useOSStack;

    public final boolean getAddUserAgent() {
        return this.addUserAgent;
    }

    public final AuraTigonAuthPolicy getAuthPolicy() {
        return this.authPolicy;
    }

    public final AuraTigonBody getBody() {
        return this.body;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final CYV getRequestCategory() {
        return this.requestCategory;
    }

    public final CXt getRequestPurpose() {
        return this.requestPurpose;
    }

    public final Boolean getRetryable() {
        return this.retryable;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseOSStack() {
        return this.useOSStack;
    }

    public AuraTigonHttpRequest(String str, String str2, String str3, Map<String, String> map, AuraTigonBody auraTigonBody, Long l, boolean z, CYV cyv, CXt cXt, Boolean bool, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z2, boolean z3) {
        AnonymousClass005.A14(str, str2, str3, map);
        C60O.A1N(cyv, 7, cXt);
        C7384Etj.A0Y(auraTigonAuthPolicy, 10);
        this.method = str;
        this.url = str2;
        this.friendlyName = str3;
        this.headers = map;
        this.body = auraTigonBody;
        this.timeoutMs = l;
        this.followRedirects = z;
        this.requestCategory = cyv;
        this.requestPurpose = cXt;
        this.retryable = bool;
        this.authPolicy = auraTigonAuthPolicy;
        this.addUserAgent = z2;
        this.useOSStack = z3;
    }

    public /* synthetic */ AuraTigonHttpRequest(String str, String str2, String str3, Map map, AuraTigonBody auraTigonBody, Long l, boolean z, CYV cyv, CXt cXt, Boolean bool, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z2, boolean z3, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? AGH.A0E() : map, (i & 16) != 0 ? null : auraTigonBody, (i & 32) != 0 ? null : l, (i & 64) != 0 ? true : z, (i & 128) != 0 ? CYV.A03 : cyv, (i & 256) != 0 ? CXt.A04 : cXt, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? AuraTigonAuthPolicy.NONE : auraTigonAuthPolicy, (i & 2048) != 0 ? true : z2, C3cG.A1K(i & 4096, z3));
    }
}
