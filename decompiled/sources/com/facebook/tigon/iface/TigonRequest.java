package com.facebook.tigon.iface;

import X.C7384Etj;
import X.CXp;
import X.CXt;
import X.CYV;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TigonRequest extends TigonPropertyContainer {
    public static final Companion Companion = new Companion();
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    public static final String POST = "POST";
    public final long addedToMiddlewareSinceEpochMS;
    public final TigonAuthHandler authHandler;
    public final long connectionTimeoutMS;
    public final Map<String, String> headers;
    public final CXp httpPriority;
    public final HttpPriorityContext httpPriorityContext;
    public final long idleTimeoutMS;
    public final String loggingId;
    public final String method;
    public final CXt purpose;
    public final boolean replaySafe;
    public final CYV requestCategory;
    public final long requestTimeoutMS;
    public final long responseTimeoutMS;
    public final boolean retryable;
    public final int startupStatusOnAdded;
    public final String url;

    public final class Companion {
    }

    public TigonRequest(String str, String str2, Map<String, String> map, CXp cXp, boolean z, boolean z2, CYV cyv, CXt cXt, long j, long j2, long j3, long j4, String str3, int i, long j5, TigonAuthHandler tigonAuthHandler, HttpPriorityContext httpPriorityContext) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(map, 2);
        C7384Etj.A0Y(cXp, 3);
        C7384Etj.A0Y(cyv, 6);
        C7384Etj.A0Y(cXt, 7);
        C7384Etj.A0Y(str3, 12);
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.httpPriority = cXp;
        this.retryable = z;
        this.replaySafe = z2;
        this.requestCategory = cyv;
        this.purpose = cXt;
        this.connectionTimeoutMS = j;
        this.idleTimeoutMS = j2;
        this.requestTimeoutMS = j3;
        this.responseTimeoutMS = j4;
        this.loggingId = str3;
        this.startupStatusOnAdded = i;
        this.addedToMiddlewareSinceEpochMS = j5;
        this.authHandler = tigonAuthHandler;
        this.httpPriorityContext = httpPriorityContext;
    }

    public final long addedToMiddlewareSinceEpochMS() {
        return this.addedToMiddlewareSinceEpochMS;
    }

    public final TigonAuthHandler authHandler() {
        return this.authHandler;
    }

    public final long connectionTimeoutMS() {
        return this.connectionTimeoutMS;
    }

    public final Map<String, String> headers() {
        return this.headers;
    }

    public final CXp httpPriority() {
        return this.httpPriority;
    }

    public final HttpPriorityContext httpPriorityContext() {
        return this.httpPriorityContext;
    }

    public final long idleTimeoutMS() {
        return this.idleTimeoutMS;
    }

    public final String loggingId() {
        return this.loggingId;
    }

    public final String method() {
        return this.method;
    }

    public final CXt purpose() {
        return this.purpose;
    }

    public final boolean replaySafe() {
        return this.replaySafe;
    }

    public final CYV requestCategory() {
        return this.requestCategory;
    }

    public final long requestTimeoutMS() {
        return this.requestTimeoutMS;
    }

    public final long responseTimeoutMS() {
        return this.responseTimeoutMS;
    }

    public final boolean retryable() {
        return this.retryable;
    }

    public final int startupStatusOnAdded() {
        return this.startupStatusOnAdded;
    }

    public final String url() {
        return this.url;
    }
}
