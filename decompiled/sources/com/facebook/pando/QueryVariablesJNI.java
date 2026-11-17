package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes5.dex */
public final class QueryVariablesJNI {
    public final HybridData mHybridData;

    public static final native QueryVariablesJNI forTree(TreeJNI treeJNI);

    public static final native QueryVariablesJNI fromEncodedVariables(Map<String, String> map, Map<String, String> map2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native Map<String, String> encodedNonTransientVariables();

    public final native Map<String, String> encodedTransientVariables();

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public QueryVariablesJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
