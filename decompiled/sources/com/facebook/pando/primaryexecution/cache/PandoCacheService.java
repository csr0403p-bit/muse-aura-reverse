package com.facebook.pando.primaryexecution.cache;

import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes5.dex */
public final class PandoCacheService extends PandoPrimaryExecution {
    private final native <T> void clearCacheNative(PandoGraphQLRequest<T> pandoGraphQLRequest);

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI);

    static {
        ETi.loadLibrary("pando-client-cache-jni");
    }
}
