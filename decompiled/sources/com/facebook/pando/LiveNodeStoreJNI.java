package com.facebook.pando;

import X.AbstractC3081BxN;
import X.AnonymousClass003;
import X.BV4;
import X.C06H;
import X.C3007Brp;
import X.C5123Da7;
import X.C60O;
import X.C7384Etj;
import X.DZa;
import X.DZr;
import com.facebook.pando.NodeStoreJNI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class LiveNodeStoreJNI extends NodeStoreJNI {
    public final DZa childStoreResolver;
    public long rootNodeKey;

    public final class Factory {
        public volatile NodeViewScope currentScope;
        public volatile NodeViewScope defaultScope;
        public final DZr ownerLookup;
        public final AtomicLong generation = BV4.A14(0);
        public final AtomicLong storeCreationCount = BV4.A14(0);
        public final ConcurrentHashMap<C3007Brp, NodeViewScope> ownedScopes = C60O.A1C();

        private final NodeViewScope defaultScope(String str, boolean z) {
            NodeViewScope nodeViewScopeEmptyScope;
            synchronized (this) {
                nodeViewScopeEmptyScope = this.defaultScope;
                if (nodeViewScopeEmptyScope == null || !C7384Etj.areEqual(nodeViewScopeEmptyScope.buildConfigName, str) || nodeViewScopeEmptyScope.useSegmentedCanonicalArguments != z) {
                    nodeViewScopeEmptyScope = emptyScope(str, z);
                    this.defaultScope = nodeViewScopeEmptyScope;
                }
            }
            return nodeViewScopeEmptyScope;
        }

        public final NodeViewScope adoptScope(NodeViewScope nodeViewScope) {
            C7384Etj.A0Y(nodeViewScope, 0);
            NodeViewScope nodeViewScopeIntern = intern(nodeViewScope);
            this.currentScope = nodeViewScopeIntern;
            return nodeViewScopeIntern;
        }

        public final NodeStoreJNI createStoreForNative(long j, long j2, NodeViewScope nodeViewScope) {
            C7384Etj.A0Y(nodeViewScope, 2);
            this.storeCreationCount.incrementAndGet();
            return new LiveNodeStoreJNI(nodeViewScope, j, (DZr) null);
        }

        public final NodeViewScope scopeForRequester(NodeViewScope nodeViewScope) {
            C7384Etj.A0Y(nodeViewScope, 0);
            return intern(nodeViewScope);
        }

        public final NodeViewScope scopeForStores(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            NodeViewScope nodeViewScope = this.currentScope;
            return nodeViewScope == null ? defaultScope(str, z) : nodeViewScope;
        }

        public static /* synthetic */ NodeStoreJNI.NodeWithStore fromTree$default(Factory factory, TreeJNI treeJNI, NodeViewScope nodeViewScope, long j, int i, Object obj) {
            if ((i & 4) != 0) {
                j = factory.generation.get();
            }
            return factory.fromTree(treeJNI, nodeViewScope, j);
        }

        private final NodeViewScope intern(NodeViewScope nodeViewScope) {
            NodeViewScope nodeViewScopePutIfAbsent = this.ownedScopes.putIfAbsent(new C3007Brp(nodeViewScope.buildConfigName, nodeViewScope.assetReader, nodeViewScope.variables, nodeViewScope.useSegmentedCanonicalArguments), nodeViewScope);
            return nodeViewScopePutIfAbsent == null ? nodeViewScope : nodeViewScopePutIfAbsent;
        }

        public final long currentGeneration() {
            return this.generation.get();
        }

        public final NodeViewScope currentScope() {
            return this.currentScope;
        }

        public final long invalidate(int[] iArr) {
            return (iArr == null || iArr.length != 0) ? this.generation.incrementAndGet() : this.generation.get();
        }

        public final NodeViewScope knownScope() {
            NodeViewScope nodeViewScope = this.currentScope;
            return nodeViewScope == null ? this.defaultScope : nodeViewScope;
        }

        public final long storeCreationCountForTest() {
            return this.storeCreationCount.get();
        }

        public Factory(DZr dZr) {
            this.ownerLookup = dZr;
        }

        private final NodeViewScope emptyScope(String str, boolean z) {
            return intern(NodeViewScope.A00(str, AbstractC3081BxN.A00(), z));
        }

        public final NodeStoreJNI.NodeWithStore fromTree(TreeJNI treeJNI, NodeViewScope nodeViewScope, long j) {
            AnonymousClass003.A0u(treeJNI, nodeViewScope);
            this.storeCreationCount.incrementAndGet();
            LiveNodeStoreJNI liveNodeStoreJNI = new LiveNodeStoreJNI(treeJNI, nodeViewScope, (DZr) null);
            return new NodeStoreJNI.NodeWithStore(liveNodeStoreJNI, liveNodeStoreJNI.rootNodeKey);
        }
    }

    public LiveNodeStoreJNI(NodeViewScope nodeViewScope, DZr dZr) {
        super(nodeViewScope, null);
        this.childStoreResolver = new DZa(dZr);
    }

    private final native long initHybridForLiveTreeNative(TreeJNI treeJNI);

    @Override // com.facebook.pando.NodeStoreJNI
    public C5123Da7 resolveNode(C5123Da7 c5123Da7) {
        C7384Etj.A0Y(c5123Da7, 0);
        C5123Da7 c5123Da72 = this.childStoreResolver.A01.get(c5123Da7);
        return c5123Da72 != null ? c5123Da72 : c5123Da7;
    }

    public final void invalidateSubLiveTreePointers$fbandroid_libraries_pando_graphql_pando_graphql() {
        this.childStoreResolver.A01 = C60O.A1C();
    }

    public LiveNodeStoreJNI(TreeJNI treeJNI, NodeViewScope nodeViewScope, DZr dZr) {
        this(nodeViewScope, dZr);
        this.rootNodeKey = initHybridForLiveTreeNative(treeJNI);
    }

    public /* synthetic */ LiveNodeStoreJNI(NodeViewScope nodeViewScope, long j, DZr dZr, C06H c06h) {
        this(nodeViewScope, j, dZr);
    }

    public /* synthetic */ LiveNodeStoreJNI(TreeJNI treeJNI, NodeViewScope nodeViewScope, DZr dZr, C06H c06h) {
        this(treeJNI, nodeViewScope, dZr);
    }

    public LiveNodeStoreJNI(NodeViewScope nodeViewScope, long j, DZr dZr) {
        this(nodeViewScope, dZr);
        this.rootNodeKey = j;
    }
}
