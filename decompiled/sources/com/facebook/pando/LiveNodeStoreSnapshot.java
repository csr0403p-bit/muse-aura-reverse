package com.facebook.pando;

import X.C5123Da7;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class LiveNodeStoreSnapshot {
    public final C5123Da7 rootNode;
    public final NodeStoreJNI store;
    public final TreeJNI tree;

    public LiveNodeStoreSnapshot(TreeJNI treeJNI, NodeStoreJNI nodeStoreJNI, long j) {
        C7384Etj.A0Y(treeJNI, 0);
        this.tree = treeJNI;
        this.store = nodeStoreJNI;
        this.rootNode = nodeStoreJNI != null ? nodeStoreJNI.node$fbandroid_libraries_pando_graphql_pando_graphql(j) : null;
    }

    public final C5123Da7 getRootNode() {
        return this.rootNode;
    }

    public final TreeJNI getTree() {
        return this.tree;
    }

    public final void invalidateSubLiveTreePointers() {
        LiveNodeStoreJNI liveNodeStoreJNI;
        NodeStoreJNI nodeStoreJNI = this.store;
        if (!(nodeStoreJNI instanceof LiveNodeStoreJNI) || (liveNodeStoreJNI = (LiveNodeStoreJNI) nodeStoreJNI) == null) {
            return;
        }
        liveNodeStoreJNI.invalidateSubLiveTreePointers$fbandroid_libraries_pando_graphql_pando_graphql();
    }
}
