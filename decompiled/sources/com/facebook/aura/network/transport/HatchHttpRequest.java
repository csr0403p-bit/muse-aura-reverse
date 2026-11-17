package com.facebook.aura.network.transport;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.network.transport.HatchRequestBody;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HatchHttpRequest {
    public static final Companion Companion = new Companion();
    public final HatchHttpRequestAttemptObserverFactory attemptObserverFactory;
    public final HatchRequestBody body;
    public final HatchHttpCachePolicy cachePolicy;
    public final HatchRequestCategory category;
    public final boolean followRedirects;
    public final Map<String, String> headers;
    public final Long idleTimeoutMs;
    public final HatchHttpMethod method;
    public final boolean ohaiFetchConfigInternally;
    public final HatchRequestPurpose purpose;
    public final Long requestTimeoutMs;
    public final HatchResponseBodyPolicy responseBodyPolicy;
    public final boolean retryable;
    public final boolean skipBodyObserver;
    public final Long timeoutMs;
    public final String url;
    public final boolean useOhai;

    /* loaded from: classes3.dex */
    public final class Companion {
        public static /* synthetic */ HatchHttpRequest get$default(Companion companion, String str, Map map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchHttpCachePolicy hatchHttpCachePolicy, boolean z, boolean z2, HatchResponseBodyPolicy hatchResponseBodyPolicy, int i, Object obj) {
            Map mapA0E = map;
            Long l4 = l;
            Long l5 = l2;
            Long l6 = l3;
            HatchRequestCategory hatchRequestCategory2 = hatchRequestCategory;
            HatchRequestPurpose hatchRequestPurpose2 = hatchRequestPurpose;
            HatchResponseBodyPolicy hatchResponseBodyPolicy2 = hatchResponseBodyPolicy;
            if ((i & 2) != 0) {
                mapA0E = AGH.A0E();
            }
            if ((i & 4) != 0) {
                l4 = null;
            }
            if ((i & 8) != 0) {
                l5 = l4;
            }
            if ((i & 16) != 0) {
                l6 = l4;
            }
            if ((i & 32) != 0) {
                hatchRequestCategory2 = HatchRequestCategory.API;
            }
            if ((i & 64) != 0) {
                hatchRequestPurpose2 = HatchRequestPurpose.FETCH;
            }
            HatchHttpCachePolicy hatchHttpCachePolicy2 = (i & 128) == 0 ? hatchHttpCachePolicy : null;
            boolean zA1K = C3cG.A1K(i & 256, z);
            boolean z3 = (i & 512) == 0 ? z2 : false;
            if ((i & 1024) != 0) {
                hatchResponseBodyPolicy2 = HatchResponseBodyPolicy.DEFAULT;
            }
            return companion.get(str, mapA0E, l4, l5, l6, hatchRequestCategory2, hatchRequestPurpose2, hatchHttpCachePolicy2, zA1K, z3, hatchResponseBodyPolicy2);
        }

        public final HatchHttpRequest delete(String str, HatchRequestBody hatchRequestBody, Map<String, String> map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchResponseBodyPolicy hatchResponseBodyPolicy) {
            boolean zA1Z = AnonymousClass005.A1Z(str, hatchRequestBody, map);
            AnonymousClass005.A13(hatchRequestCategory, hatchRequestPurpose, hatchResponseBodyPolicy, 6);
            return new HatchHttpRequest(str, HatchHttpMethod.DELETE, map, hatchRequestBody, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, null, false, false, zA1Z, hatchResponseBodyPolicy, null, false, zA1Z);
        }

        public final HatchHttpRequest get(String str, Map<String, String> map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchHttpCachePolicy hatchHttpCachePolicy, boolean z, boolean z2, HatchResponseBodyPolicy hatchResponseBodyPolicy) {
            C7384Etj.A0Y(str, 0);
            C7384Etj.A0Y(map, 1);
            C7384Etj.A0Y(hatchRequestCategory, 5);
            C7384Etj.A0Y(hatchRequestPurpose, 6);
            C7384Etj.A0Y(hatchResponseBodyPolicy, 10);
            return new HatchHttpRequest(str, HatchHttpMethod.GET, map, HatchRequestBody.Empty.INSTANCE, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, hatchHttpCachePolicy, z, z2, true, hatchResponseBodyPolicy, null, false, true);
        }

        public final HatchHttpRequest patch(String str, HatchRequestBody hatchRequestBody, Map<String, String> map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchResponseBodyPolicy hatchResponseBodyPolicy, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory) {
            boolean zA1Z = AnonymousClass005.A1Z(str, hatchRequestBody, map);
            AnonymousClass005.A13(hatchRequestCategory, hatchRequestPurpose, hatchResponseBodyPolicy, 6);
            return new HatchHttpRequest(str, HatchHttpMethod.PATCH, map, hatchRequestBody, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, null, false, false, z, hatchResponseBodyPolicy, hatchHttpRequestAttemptObserverFactory, false, zA1Z);
        }

        public final HatchHttpRequest post(String str, HatchRequestBody hatchRequestBody, Map<String, String> map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchHttpCachePolicy hatchHttpCachePolicy, boolean z, boolean z2, boolean z3, HatchResponseBodyPolicy hatchResponseBodyPolicy, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z4, boolean z5) {
            AnonymousClass005.A0x(str, hatchRequestBody, map);
            AnonymousClass003.A10(hatchRequestCategory, hatchRequestPurpose);
            C7384Etj.A0Y(hatchResponseBodyPolicy, 12);
            return new HatchHttpRequest(str, HatchHttpMethod.POST, map, hatchRequestBody, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, hatchHttpCachePolicy, z, z2, z3, hatchResponseBodyPolicy, hatchHttpRequestAttemptObserverFactory, z4, z5);
        }

        public final HatchHttpRequest put(String str, HatchRequestBody hatchRequestBody, Map<String, String> map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, boolean z, HatchResponseBodyPolicy hatchResponseBodyPolicy) {
            boolean zA1Z = AnonymousClass005.A1Z(str, hatchRequestBody, map);
            AnonymousClass003.A10(hatchRequestCategory, hatchRequestPurpose);
            C7384Etj.A0Y(hatchResponseBodyPolicy, 9);
            return new HatchHttpRequest(str, HatchHttpMethod.PUT, map, hatchRequestBody, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, null, false, false, z, hatchResponseBodyPolicy, null, false, zA1Z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HatchHttpRequest delete$default(Companion companion, String str, HatchRequestBody hatchRequestBody, Map map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchResponseBodyPolicy hatchResponseBodyPolicy, int i, Object obj) {
            if ((i & 2) != 0) {
                hatchRequestBody = HatchRequestBody.Empty.INSTANCE;
            }
            if ((i & 4) != 0) {
                map = AGH.A0E();
            }
            if ((i & 8) != 0) {
                l = null;
            }
            if ((i & 16) != 0) {
                l2 = l;
            }
            if ((i & 32) != 0) {
                l3 = l;
            }
            if ((i & 64) != 0) {
                hatchRequestCategory = HatchRequestCategory.API;
            }
            if ((i & 128) != 0) {
                hatchRequestPurpose = HatchRequestPurpose.FETCH;
            }
            if ((i & 256) != 0) {
                hatchResponseBodyPolicy = HatchResponseBodyPolicy.DEFAULT;
            }
            return companion.delete(str, hatchRequestBody, map, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, hatchResponseBodyPolicy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HatchHttpRequest patch$default(Companion companion, String str, HatchRequestBody hatchRequestBody, Map map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchResponseBodyPolicy hatchResponseBodyPolicy, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, int i, Object obj) {
            if ((i & 4) != 0) {
                map = AGH.A0E();
            }
            if ((i & 8) != 0) {
                l = null;
            }
            if ((i & 16) != 0) {
                l2 = l;
            }
            if ((i & 32) != 0) {
                l3 = l;
            }
            if ((i & 64) != 0) {
                hatchRequestCategory = HatchRequestCategory.API;
            }
            if ((i & 128) != 0) {
                hatchRequestPurpose = HatchRequestPurpose.FETCH;
            }
            if ((i & 256) != 0) {
                hatchResponseBodyPolicy = HatchResponseBodyPolicy.DEFAULT;
            }
            boolean zA1Q = C60Q.A1Q(i & 512, z);
            if ((i & 1024) != 0) {
                hatchHttpRequestAttemptObserverFactory = null;
            }
            return companion.patch(str, hatchRequestBody, map, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, hatchResponseBodyPolicy, zA1Q, hatchHttpRequestAttemptObserverFactory);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HatchHttpRequest post$default(Companion companion, String str, HatchRequestBody hatchRequestBody, Map map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchHttpCachePolicy hatchHttpCachePolicy, boolean z, boolean z2, boolean z3, HatchResponseBodyPolicy hatchResponseBodyPolicy, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 4) != 0) {
                map = AGH.A0E();
            }
            if ((i & 8) != 0) {
                l = null;
            }
            if ((i & 16) != 0) {
                l2 = l;
            }
            if ((i & 32) != 0) {
                l3 = l;
            }
            if ((i & 64) != 0) {
                hatchRequestCategory = HatchRequestCategory.API;
            }
            if ((i & 128) != 0) {
                hatchRequestPurpose = HatchRequestPurpose.FETCH;
            }
            if ((i & 256) != 0) {
                hatchHttpCachePolicy = null;
            }
            boolean zA1K = C3cG.A1K(i & 512, z);
            boolean zA1K2 = C3cG.A1K(i & 1024, z2);
            boolean zA1Q = C60Q.A1Q(i & 2048, z3);
            if ((i & 4096) != 0) {
                hatchResponseBodyPolicy = HatchResponseBodyPolicy.DEFAULT;
            }
            if ((i & 8192) != 0) {
                hatchHttpRequestAttemptObserverFactory = null;
            }
            return companion.post(str, hatchRequestBody, map, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, hatchHttpCachePolicy, zA1K, zA1K2, zA1Q, hatchResponseBodyPolicy, hatchHttpRequestAttemptObserverFactory, C3cG.A1K(i & 16384, z4), C60Q.A1Q(i & 32768, z5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HatchHttpRequest put$default(Companion companion, String str, HatchRequestBody hatchRequestBody, Map map, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, boolean z, HatchResponseBodyPolicy hatchResponseBodyPolicy, int i, Object obj) {
            if ((i & 4) != 0) {
                map = AGH.A0E();
            }
            if ((i & 8) != 0) {
                l = null;
            }
            if ((i & 16) != 0) {
                l2 = l;
            }
            if ((i & 32) != 0) {
                l3 = l;
            }
            if ((i & 64) != 0) {
                hatchRequestCategory = HatchRequestCategory.API;
            }
            if ((i & 128) != 0) {
                hatchRequestPurpose = HatchRequestPurpose.FETCH;
            }
            boolean zA1Q = C60Q.A1Q(i & 256, z);
            if ((i & 512) != 0) {
                hatchResponseBodyPolicy = HatchResponseBodyPolicy.DEFAULT;
            }
            return companion.put(str, hatchRequestBody, map, l, l2, l3, hatchRequestCategory, hatchRequestPurpose, zA1Q, hatchResponseBodyPolicy);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchHttpRequest(String str, HatchHttpMethod hatchHttpMethod, Map<String, String> map, HatchRequestBody hatchRequestBody, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchHttpCachePolicy hatchHttpCachePolicy, boolean z, boolean z2, boolean z3, HatchResponseBodyPolicy hatchResponseBodyPolicy, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z4, boolean z5) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(hatchHttpMethod, 1);
        C7384Etj.A0Y(map, 2);
        C7384Etj.A0Y(hatchRequestBody, 3);
        C7384Etj.A0Y(hatchRequestCategory, 7);
        C7384Etj.A0Y(hatchRequestPurpose, 8);
        C7384Etj.A0Y(hatchResponseBodyPolicy, 13);
        this.url = str;
        this.method = hatchHttpMethod;
        this.headers = map;
        this.body = hatchRequestBody;
        this.timeoutMs = l;
        this.requestTimeoutMs = l2;
        this.idleTimeoutMs = l3;
        this.category = hatchRequestCategory;
        this.purpose = hatchRequestPurpose;
        this.cachePolicy = hatchHttpCachePolicy;
        this.useOhai = z;
        this.ohaiFetchConfigInternally = z2;
        this.retryable = z3;
        this.responseBodyPolicy = hatchResponseBodyPolicy;
        this.attemptObserverFactory = hatchHttpRequestAttemptObserverFactory;
        this.skipBodyObserver = z4;
        this.followRedirects = z5;
    }

    public final HatchHttpRequestAttemptObserverFactory getAttemptObserverFactory() {
        return this.attemptObserverFactory;
    }

    public final HatchRequestBody getBody() {
        return this.body;
    }

    public final HatchHttpCachePolicy getCachePolicy() {
        return this.cachePolicy;
    }

    public final HatchRequestCategory getCategory() {
        return this.category;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final Long getIdleTimeoutMs() {
        return this.idleTimeoutMs;
    }

    public final HatchHttpMethod getMethod() {
        return this.method;
    }

    public final boolean getOhaiFetchConfigInternally() {
        return this.ohaiFetchConfigInternally;
    }

    public final HatchRequestPurpose getPurpose() {
        return this.purpose;
    }

    public final Long getRequestTimeoutMs() {
        return this.requestTimeoutMs;
    }

    public final HatchResponseBodyPolicy getResponseBodyPolicy() {
        return this.responseBodyPolicy;
    }

    public final boolean getRetryable() {
        return this.retryable;
    }

    public final boolean getSkipBodyObserver() {
        return this.skipBodyObserver;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseOhai() {
        return this.useOhai;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HatchHttpRequest(String str, HatchHttpMethod hatchHttpMethod, Map map, HatchRequestBody hatchRequestBody, Long l, Long l2, Long l3, HatchRequestCategory hatchRequestCategory, HatchRequestPurpose hatchRequestPurpose, HatchHttpCachePolicy hatchHttpCachePolicy, boolean z, boolean z2, boolean z3, HatchResponseBodyPolicy hatchResponseBodyPolicy, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z4, boolean z5, int i, C06H c06h) {
        map = (i & 4) != 0 ? AGH.A0E() : map;
        hatchRequestBody = (i & 8) != 0 ? HatchRequestBody.Empty.INSTANCE : hatchRequestBody;
        l = (i & 16) != 0 ? null : l;
        this(str, hatchHttpMethod, map, hatchRequestBody, l, (i & 32) != 0 ? l : l2, (i & 64) != 0 ? l : l3, (i & 128) != 0 ? HatchRequestCategory.API : hatchRequestCategory, (i & 256) != 0 ? HatchRequestPurpose.FETCH : hatchRequestPurpose, (i & 512) != 0 ? null : hatchHttpCachePolicy, C3cG.A1K(i & 1024, z), C3cG.A1K(i & 2048, z2), (i & 4096) != 0 ? true : z3, (i & 8192) != 0 ? HatchResponseBodyPolicy.DEFAULT : hatchResponseBodyPolicy, (i & 16384) != 0 ? null : hatchHttpRequestAttemptObserverFactory, C3cH.A1L(32768, i, z4), (i & 65536) != 0 ? true : z5);
    }
}
