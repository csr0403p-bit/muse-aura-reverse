package com.facebook.pando;

import X.C5123Da7;
import X.C7384Etj;
import X.ETi;
import java.util.Map;

/* loaded from: classes5.dex */
public final class NodeStoreTreeUpdaterJNI extends TreeUpdaterJNI {
    public NodeStoreTreeUpdaterJNI(Map<String, ? extends Object> map, C5123Da7 c5123Da7) {
        C7384Etj.A0Y(c5123Da7, 1);
        initHybridForNodeStoreUpdateBuilder(c5123Da7.A01, c5123Da7.A00);
        constructTreeWithArgs(map);
    }

    private final native void initHybridForNodeStoreUpdateBuilder(NodeStoreJNI nodeStoreJNI, long j);

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }
}
