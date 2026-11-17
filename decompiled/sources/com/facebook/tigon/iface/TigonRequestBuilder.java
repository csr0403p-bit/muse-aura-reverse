package com.facebook.tigon.iface;

import X.AGH;
import X.AbstractC4088Clr;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.CXp;
import X.CXt;
import X.CY4;
import X.CY5;
import X.CYV;
import com.facebook.tigon.iface.TigonPropertyContainer;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TigonRequestBuilder extends TigonPropertyContainer {
    public static final Companion Companion = new Companion();
    public long addedToMiddlewareSinceEpochMS;
    public TigonAuthHandler authHandler;
    public long connectionTimeoutMS;
    public final Map<String, String> headers;
    public CXp httpPriority;
    public HttpPriorityContext httpPriorityContext;
    public long idleTimeoutMS;
    public String loggingId;
    public final String method;
    public CXt purpose;
    public boolean replaySafe;
    public CYV requestCategory;
    public long requestTimeoutMS;
    public long responseTimeoutMS;
    public boolean retryable;
    public int startupStatusOnAdded;
    public final String url;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final TigonRequest create(String str, String str2, String[] strArr, boolean z, String str3, String str4, String str5) {
            TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder(str, str2);
            tigonRequestBuilder.retryable = z;
            int length = strArr.length;
            if ((length & 1) != 0) {
                throw C60O.A0i("must have even number of flattened headers");
            }
            for (int i = 0; i < length; i += 2) {
                tigonRequestBuilder.addHeader(strArr[i], strArr[i + 1]);
            }
            if (str3 != null) {
                if (str4 == null) {
                    str4 = "";
                }
                if (str5 == null) {
                    str5 = "";
                }
                tigonRequestBuilder.setFriendlyNameAndTags(str3, str4, str5);
            }
            return tigonRequestBuilder.build();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TigonRequestBuilder(TigonRequest tigonRequest) {
        C7384Etj.A0Y(tigonRequest, 0);
        String str = tigonRequest.method;
        String str2 = tigonRequest.url;
        Map<String, String> map = tigonRequest.headers;
        C7384Etj.A0Y(map, 0);
        this(str, str2, new LinkedHashMap(map), tigonRequest.httpPriority, tigonRequest.retryable, tigonRequest.replaySafe, tigonRequest.connectionTimeoutMS, tigonRequest.idleTimeoutMS, tigonRequest.requestTimeoutMS, tigonRequest.responseTimeoutMS, tigonRequest.requestCategory, tigonRequest.purpose, tigonRequest.loggingId, tigonRequest.startupStatusOnAdded, tigonRequest.addedToMiddlewareSinceEpochMS, tigonRequest.authHandler, tigonRequest.httpPriorityContext);
        tigonRequest.copyPropertiesTo(this);
    }

    public final TigonRequestBuilder addHeaders(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            addHeader(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final TigonRequestBuilder setFriendlyNameAndTags(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        CY4 cy4 = AbstractC4088Clr.A00;
        TigonPropertyContainer.Group group = new TigonPropertyContainer.Group();
        group.setProperty(CY5.A02, str, true);
        group.setProperty(CY5.A00, str2, true);
        group.setProperty(CY5.A01, str3, true);
        setPropertyGroup(cy4, group);
        return this;
    }

    public final TigonRequestBuilder setHttpPriority(CXp cXp) {
        C7384Etj.A0Y(cXp, 0);
        this.httpPriority = cXp;
        return this;
    }

    public final TigonRequestBuilder setLoggingId(String str) {
        C7384Etj.A0Y(str, 0);
        this.loggingId = str;
        return this;
    }

    public final TigonRequestBuilder setPurpose(CXt cXt) {
        C7384Etj.A0Y(cXt, 0);
        this.purpose = cXt;
        return this;
    }

    public final TigonRequestBuilder setRequestCategory(CYV cyv) {
        C7384Etj.A0Y(cyv, 0);
        this.requestCategory = cyv;
        return this;
    }

    public static final TigonRequest create(String str, String str2, String[] strArr, boolean z, String str3, String str4, String str5) {
        return Companion.create(str, str2, strArr, z, str3, str4, str5);
    }

    public final TigonRequestBuilder addHeader(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            this.headers.put(str, str2);
        }
        return this;
    }

    public final TigonRequest build() {
        TigonRequest tigonRequest = new TigonRequest(this.method, this.url, AGH.A0A(this.headers), this.httpPriority, this.retryable, this.replaySafe, this.requestCategory, this.purpose, this.connectionTimeoutMS, this.idleTimeoutMS, this.requestTimeoutMS, this.responseTimeoutMS, this.loggingId, this.startupStatusOnAdded, this.addedToMiddlewareSinceEpochMS, this.authHandler, this.httpPriorityContext);
        copyPropertiesTo(tigonRequest);
        return tigonRequest;
    }

    public final TigonRequestBuilder setConnectionTimeoutMS(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("ConnectionTimeout should be nonzero.");
        }
        this.connectionTimeoutMS = j;
        return this;
    }

    public final TigonRequestBuilder setIdleTimeoutMS(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("IdleTimeout should be nonzero.");
        }
        this.idleTimeoutMS = j;
        return this;
    }

    public final TigonRequestBuilder setRequestTimeoutMS(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("RequestTimeout should be nonzero.");
        }
        this.requestTimeoutMS = j;
        return this;
    }

    public final TigonRequestBuilder setResponseTimeoutMS(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("ResponseTimeout should be nonnegative.");
        }
        this.responseTimeoutMS = j;
        return this;
    }

    public final TigonRequestBuilder setAddedToMiddlewareSinceEpochMS(long j) {
        this.addedToMiddlewareSinceEpochMS = j;
        return this;
    }

    public final TigonRequestBuilder setAuthHandler(TigonAuthHandler tigonAuthHandler) {
        this.authHandler = tigonAuthHandler;
        return this;
    }

    public final TigonRequestBuilder setHttpPriorityContext(HttpPriorityContext httpPriorityContext) {
        this.httpPriorityContext = httpPriorityContext;
        return this;
    }

    public final TigonRequestBuilder setReplaySafe(boolean z) {
        this.replaySafe = z;
        return this;
    }

    public final TigonRequestBuilder setRetryable(boolean z) {
        this.retryable = z;
        return this;
    }

    public final TigonRequestBuilder setStartupStatusOnAdded(int i) {
        this.startupStatusOnAdded = i;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TigonRequestBuilder(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this(str, str2, new LinkedHashMap(), null, false, objArr, j, j, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131064, 0 == true ? 1 : 0);
    }

    public TigonRequestBuilder(String str, String str2, Map<String, String> map, CXp cXp, boolean z, boolean z2, long j, long j2, long j3, long j4, CYV cyv, CXt cXt, String str3, int i, long j5, TigonAuthHandler tigonAuthHandler, HttpPriorityContext httpPriorityContext) {
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.httpPriority = cXp;
        this.retryable = z;
        this.replaySafe = z2;
        this.connectionTimeoutMS = j;
        this.idleTimeoutMS = j2;
        this.requestTimeoutMS = j3;
        this.responseTimeoutMS = j4;
        this.requestCategory = cyv;
        this.purpose = cXt;
        this.loggingId = str3;
        this.startupStatusOnAdded = i;
        this.addedToMiddlewareSinceEpochMS = j5;
        this.authHandler = tigonAuthHandler;
        this.httpPriorityContext = httpPriorityContext;
    }

    public /* synthetic */ TigonRequestBuilder(String str, String str2, Map map, CXp cXp, boolean z, boolean z2, long j, long j2, long j3, long j4, CYV cyv, CXt cXt, String str3, int i, long j5, TigonAuthHandler tigonAuthHandler, HttpPriorityContext httpPriorityContext, int i2, C06H c06h) {
        this(str, str2, map, (i2 & 8) != 0 ? new CXp((byte) 3, true) : cXp, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 0L : j, (i2 & 128) != 0 ? 0L : j2, (i2 & 256) != 0 ? 0L : j3, (i2 & 512) != 0 ? 0L : j4, (i2 & 1024) != 0 ? CYV.A07 : cyv, (i2 & 2048) != 0 ? CXt.A04 : cXt, (i2 & 4096) != 0 ? "" : str3, (i2 & 8192) != 0 ? -1 : i, (i2 & 16384) != 0 ? -1L : j5, (32768 & i2) != 0 ? null : tigonAuthHandler, (i2 & 65536) != 0 ? null : httpPriorityContext);
    }
}
