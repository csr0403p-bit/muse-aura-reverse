package com.facebook.pando.primaryexecution.renderfromstore;

import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes5.dex */
public final class PandoRFSService extends PandoPrimaryExecution {
    public static final PandoRFSService $redex_init_class = null;

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI);

    static {
        ETi.loadLibrary("pando-client-render-from-store-jni");
    }
}
