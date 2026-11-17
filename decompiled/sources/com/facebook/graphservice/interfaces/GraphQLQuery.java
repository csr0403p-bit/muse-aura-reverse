package com.facebook.graphservice.interfaces;

import X.C3463COl;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class GraphQLQuery {
    public final HybridData mHybridData;

    public native int cacheTtlSeconds();

    public native int freshCacheTtlSeconds();

    public native boolean hasAnalyticsHints();

    public native boolean isLiveQuery();

    public native String queryName();

    public native boolean terminateAfterFreshResponse();

    static {
        C3463COl.loadLibrary("graphservice-jni");
    }

    public GraphQLQuery(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
