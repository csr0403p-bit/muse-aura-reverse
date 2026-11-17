package com.facebook.pando;

import X.AbstractC3081BxN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV7;
import X.C06H;
import X.C2428BbE;
import X.C2935BpD;
import X.C3cG;
import X.C5119DZv;
import X.C5120DZw;
import X.C5123Da7;
import X.C5165Dav;
import X.C5888DrS;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.DZe;
import X.DZg;
import X.DZl;
import X.Db2;
import X.ETi;
import X.EnumC5133DaN;
import X.G0U;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.jni.HybridClassBase;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public class NodeStoreJNI extends HybridClassBase {
    public static final NodeStoreJNI $redex_init_class = null;
    public final ConcurrentHashMap<C2428BbE, Object> fieldCache;
    public final ConcurrentHashMap<Long, C5123Da7> nodes;
    public final NodeViewScope scope;

    public final class NodeWithStore {
        public final C5123Da7 rootNode;
        public final long rootNodeKey;
        public final NodeStoreJNI store;

        public NodeWithStore(NodeStoreJNI nodeStoreJNI, long j) {
            C7384Etj.A0Y(nodeStoreJNI, 0);
            this.store = nodeStoreJNI;
            this.rootNodeKey = j;
            this.rootNode = nodeStoreJNI.node$fbandroid_libraries_pando_graphql_pando_graphql(j);
        }

        public final NodeWithStore copy(NodeStoreJNI nodeStoreJNI, long j) {
            C7384Etj.A0Y(nodeStoreJNI, 0);
            return new NodeWithStore(nodeStoreJNI, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof NodeWithStore) {
                    NodeWithStore nodeWithStore = (NodeWithStore) obj;
                    if (!C7384Etj.areEqual(this.store, nodeWithStore.store) || this.rootNodeKey != nodeWithStore.rootNodeKey) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ NodeWithStore copy$default(NodeWithStore nodeWithStore, NodeStoreJNI nodeStoreJNI, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                nodeStoreJNI = nodeWithStore.store;
            }
            if ((i & 2) != 0) {
                j = nodeWithStore.rootNodeKey;
            }
            C7384Etj.A0Y(nodeStoreJNI, 0);
            return new NodeWithStore(nodeStoreJNI, j);
        }

        public final NodeStoreJNI component1() {
            return this.store;
        }

        public final long component2() {
            return this.rootNodeKey;
        }

        public final C5123Da7 getRootNode() {
            return this.rootNode;
        }

        public final long getRootNodeKey() {
            return this.rootNodeKey;
        }

        public final NodeStoreJNI getStore() {
            return this.store;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.rootNodeKey, AnonymousClass005.A0E(this.store));
        }

        public String toString() {
            NodeStoreJNI nodeStoreJNI = this.store;
            long j = this.rootNodeKey;
            StringBuilder sbA0f = C3cG.A0f(nodeStoreJNI, "NodeWithStore(store=");
            sbA0f.append(", rootNodeKey=");
            sbA0f.append(j);
            return BV7.A10(sbA0f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeStoreJNI(NodeViewScope nodeViewScope) {
        this(nodeViewScope, null);
        C7384Etj.A0Y(nodeViewScope, 0);
    }

    private final native void addSnapshotToNative(TreeUpdaterJNI treeUpdaterJNI);

    private final native NodeWithStore applyNative(TreeUpdaterJNI treeUpdaterJNI, NodeViewScope nodeViewScope);

    private final native NodeWithStore applyToRootNative(long j, TreeUpdaterJNI treeUpdaterJNI, NodeViewScope nodeViewScope);

    /* JADX INFO: Access modifiers changed from: private */
    public final native char booleanFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native ImmutableList<Boolean> booleanListFieldNative(long j, String str);

    private final <T> T cachedResolverField(C5123Da7 c5123Da7, String str, Function0<? extends T> function0) {
        T t;
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<String, Object> concurrentHashMap = c5123Da7.resolverReads;
        if (concurrentHashMap == null || (t = (T) concurrentHashMap.get(str)) == null) {
            Object objCachedValue = this.fieldCache != null ? cachedValue(C2428BbE.A00(c5123Da7, EnumC5133DaN.A0D, str), new C5888DrS(str, function0, 0)) : function0.invoke();
            if (objCachedValue == null) {
                objCachedValue = C5165Dav.A00;
            }
            t = (T) c5123Da7.A02(str, objCachedValue);
        }
        if (t == C5165Dav.A00) {
            return null;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native double doubleFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native ImmutableList<Double> doubleListFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean fieldIsSetNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native char fieldStateNative(long j, String str, char c);

    public static final native NodeWithStore fromTreeNative(TreeJNI treeJNI, NodeViewScope nodeViewScope);

    public static final native NodeWithStore fromUpdaterNative(TreeUpdaterJNI treeUpdaterJNI, NodeViewScope nodeViewScope);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long intFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native ImmutableList<Integer> intListFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long longFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native ImmutableList<Long> longListFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long nodeFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native ImmutableList<Long> nodeListFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String stringFieldNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native ImmutableList<String> stringListFieldNative(long j, String str);

    private final native <T extends TreeJNI> T treeForNodeNative(long j, Class<T> cls, QueryVariablesJNI queryVariablesJNI, boolean z);

    private final native <T extends TreeJNI> T treeForNodeWithReaderNative(long j, Class<T> cls, QueryVariablesJNI queryVariablesJNI, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI, int i, boolean z);

    public final void addSnapshotTo$fbandroid_libraries_pando_graphql_pando_graphql(TreeUpdaterJNI treeUpdaterJNI) {
        C7384Etj.A0Y(treeUpdaterJNI, 0);
        addSnapshotToNative(treeUpdaterJNI);
    }

    public final NodeWithStore apply(TreeUpdaterJNI treeUpdaterJNI) {
        C7384Etj.A0Y(treeUpdaterJNI, 0);
        return applyNative(treeUpdaterJNI, this.scope);
    }

    public final NodeWithStore applyToRoot(long j, TreeUpdaterJNI treeUpdaterJNI) {
        C7384Etj.A0Y(treeUpdaterJNI, 1);
        return applyToRootNative(j, treeUpdaterJNI, this.scope);
    }

    public final Boolean booleanFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        boolean zA1a = AnonymousClass002.A1a(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A02;
        Object objA01 = c5123Da7.A01(str, zA1a ? 1 : 0);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 0) : decodeBooleanField(booleanFieldNative(c5123Da7.A00, str));
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, zA1a ? 1 : 0);
        }
        return (Boolean) BV7.A0q(objA01, objA01);
    }

    public C5123Da7 resolveNode(C5123Da7 c5123Da7) {
        C7384Etj.A0Y(c5123Da7, 0);
        return c5123Da7;
    }

    public final <T extends TreeJNI> T treeForNode(long j, Class<T> cls, boolean z) {
        C7384Etj.A0Y(cls, 1);
        return (T) treeForNodeNative(j, cls, treeVariables(z), this.scope.useSegmentedCanonicalArguments);
    }

    public final <T extends TreeJNI> T treeForNodeWithReader(long j, Class<T> cls, int i) {
        C7384Etj.A0Y(cls, 1);
        C5119DZv c5119DZvA00 = this.scope.assetReader;
        if (c5119DZvA00 == null) {
            c5119DZvA00 = AbstractC3081BxN.A00();
        }
        PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNIA00 = C5120DZw.A00(c5119DZvA00.A02(this.scope.buildConfigName));
        DZl dZl = this.scope.variables.A00;
        return (T) treeForNodeWithReaderNative(j, cls, dZl instanceof DZe ? ((DZe) dZl).A00 : (QueryVariablesJNI) ((DZg) dZl).A02.getValue(), pandoBuildConfigFlatbufferAssetReaderJNIA00, i, this.scope.useSegmentedCanonicalArguments);
    }

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean decodeBooleanField(char c) {
        boolean z;
        if (c == 'f') {
            z = false;
        } else {
            if (c != 't') {
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer decodeIntField(long j) {
        if (j == Long.MIN_VALUE || j == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return null;
        }
        return Integer.valueOf((int) j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long decodeLongField(long j, Function0<Character> function0) {
        if (j != Long.MIN_VALUE && j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return Long.valueOf(j);
        }
        Long lValueOf = Long.valueOf(j);
        if (function0.invoke().charValue() != 'v') {
            return null;
        }
        return lValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long decodeNodeKey(long j, Function0<Character> function0) {
        if (j != Long.MIN_VALUE && j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return Long.valueOf(j);
        }
        Long lValueOf = Long.valueOf(j);
        if (function0.invoke().charValue() != 'v') {
            return null;
        }
        return lValueOf;
    }

    private final <T> T readThroughSharedCache(C5123Da7 c5123Da7, String str, EnumC5133DaN enumC5133DaN, G0U<? super String, ? extends T> g0u) {
        return this.fieldCache != null ? (T) cachedValue(C2428BbE.A00(c5123Da7, enumC5133DaN, str), new C5888DrS(str, g0u, 1)) : g0u.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retireMemoizedString(C5123Da7 c5123Da7, String str) {
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0E;
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<C2935BpD, Object> concurrentHashMap = c5123Da7.reads;
        Object objRemove = concurrentHashMap != null ? concurrentHashMap.remove(new C2935BpD(str, 5)) : null;
        ConcurrentHashMap<C2428BbE, Object> concurrentHashMap2 = this.fieldCache;
        return objRemove == null ? concurrentHashMap2 != null ? concurrentHashMap2.remove(C2428BbE.A00(c5123Da7, enumC5133DaN, str)) : null : objRemove;
    }

    private final QueryVariablesJNI treeVariables(boolean z) {
        if (!z) {
            return null;
        }
        DZl dZl = this.scope.variables.A00;
        return dZl instanceof DZe ? ((DZe) dZl).A00 : (QueryVariablesJNI) ((DZg) dZl).A02.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapCached(Object obj) {
        if (obj == C5165Dav.A00) {
            return null;
        }
        return obj;
    }

    public final NodeViewScope getScope() {
        return this.scope;
    }

    public C5123Da7 node$fbandroid_libraries_pando_graphql_pando_graphql(long j) {
        C5123Da7 c5123Da7PutIfAbsent;
        ConcurrentHashMap<Long, C5123Da7> concurrentHashMap = this.nodes;
        Long lValueOf = Long.valueOf(j);
        C5123Da7 c5123Da7 = concurrentHashMap.get(lValueOf);
        return (c5123Da7 != null || (c5123Da7PutIfAbsent = this.nodes.putIfAbsent(lValueOf, (c5123Da7 = new C5123Da7(this, j)))) == null) ? c5123Da7 : c5123Da7PutIfAbsent;
    }

    private final <T> T cachedField(C5123Da7 c5123Da7, String str, EnumC5133DaN enumC5133DaN, G0U<? super String, ? extends T> g0u) {
        int iOrdinal = enumC5133DaN.ordinal();
        T t = (T) c5123Da7.A01(str, iOrdinal);
        if (t == null) {
            Object objCachedValue = this.fieldCache != null ? cachedValue(C2428BbE.A00(c5123Da7, enumC5133DaN, str), new C5888DrS(str, g0u, 1)) : g0u.invoke(str);
            if (objCachedValue == null) {
                objCachedValue = C5165Dav.A00;
            }
            t = (T) c5123Da7.A00(objCachedValue, str, iOrdinal);
        }
        if (t == C5165Dav.A00) {
            return null;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Double decodeDoubleField(double d, Function0<Character> function0) {
        boolean zIsNaN = Double.isNaN(d);
        Double dValueOf = Double.valueOf(d);
        if (!zIsNaN || function0.invoke().charValue() == 'v') {
            return dValueOf;
        }
        return null;
    }

    public static final NodeWithStore fromTree(TreeJNI treeJNI, NodeViewScope nodeViewScope) {
        AnonymousClass003.A0u(treeJNI, nodeViewScope);
        return fromTreeNative(treeJNI, nodeViewScope);
    }

    public static final NodeWithStore fromUpdater(TreeUpdaterJNI treeUpdaterJNI, NodeViewScope nodeViewScope) {
        AnonymousClass003.A0u(treeUpdaterJNI, nodeViewScope);
        return fromUpdaterNative(treeUpdaterJNI, nodeViewScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImmutableList<C5123Da7> mapToNodes(ImmutableList<Long> immutableList) {
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList.size());
        Iterator<Long> it = immutableList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            C7384Etj.A0X(next);
            builderBuilderWithExpectedSize.add((ImmutableList.Builder) node$fbandroid_libraries_pando_graphql_pando_graphql(next.longValue()));
        }
        ImmutableList<C5123Da7> immutableListBuild = builderBuilderWithExpectedSize.build();
        C7384Etj.A0U(immutableListBuild);
        return immutableListBuild;
    }

    private final ImmutableList<C5123Da7> mapToResolvedNodes(ImmutableList<C5123Da7> immutableList) {
        ImmutableList<C5123Da7> immutableListBuild;
        int size = immutableList.size();
        ImmutableList.Builder builderBuilderWithExpectedSize = null;
        for (int i = 0; i < size; i++) {
            C5123Da7 c5123Da7 = immutableList.get(i);
            C7384Etj.A0U(c5123Da7);
            C5123Da7 c5123Da72 = c5123Da7;
            C5123Da7 c5123Da7ResolveNode = resolveNode(c5123Da72);
            if (builderBuilderWithExpectedSize != null) {
                builderBuilderWithExpectedSize.add((ImmutableList.Builder) c5123Da7ResolveNode);
            } else if (c5123Da7ResolveNode != c5123Da72) {
                builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList.size());
                for (int i2 = 0; i2 < i; i2++) {
                    builderBuilderWithExpectedSize.add((ImmutableList.Builder) immutableList.get(i2));
                }
                builderBuilderWithExpectedSize.add((ImmutableList.Builder) c5123Da7ResolveNode);
            }
        }
        return (builderBuilderWithExpectedSize == null || (immutableListBuild = builderBuilderWithExpectedSize.build()) == null) ? immutableList : immutableListBuild;
    }

    public final ImmutableList<Boolean> booleanListFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        boolean zA1Y = C60P.A1Y(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A03;
        Object objA01 = c5123Da7.A01(str, 7);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, zA1Y ? 1 : 0) : booleanListFieldNative(c5123Da7.A00, str);
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 7);
        }
        return (ImmutableList) BV7.A0q(objA01, objA01);
    }

    public <T> T cachedValue(C2428BbE c2428BbE, Function0<? extends T> function0) {
        AnonymousClass003.A0u(c2428BbE, function0);
        ConcurrentHashMap<C2428BbE, Object> concurrentHashMap = this.fieldCache;
        if (concurrentHashMap == null) {
            throw BV4.A0U();
        }
        T tInvoke = (T) concurrentHashMap.get(c2428BbE);
        if (tInvoke == null) {
            tInvoke = function0.invoke();
            if (tInvoke == null) {
                tInvoke = (T) C5165Dav.A00;
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c2428BbE, tInvoke);
            if (objPutIfAbsent != null) {
                tInvoke = (T) objPutIfAbsent;
            }
        }
        if (tInvoke == C5165Dav.A00) {
            return null;
        }
        return tInvoke;
    }

    public final Double doubleFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A04;
        Object objA01 = c5123Da7.A01(str, 3);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 2) : decodeDoubleField(doubleFieldNative(c5123Da7.A00, str), new Db2(c5123Da7, this, str, 3));
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 3);
        }
        return (Double) BV7.A0q(objA01, objA01);
    }

    public final ImmutableList<Double> doubleListFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A05;
        Object objA01 = c5123Da7.A01(str, 9);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 4) : doubleListFieldNative(c5123Da7.A00, str);
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 9);
        }
        return (ImmutableList) BV7.A0q(objA01, objA01);
    }

    public final boolean fieldIsSetForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        Object objValueOf;
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0C;
        Object objA01 = c5123Da7.A01(str, 0);
        if (objA01 == null) {
            if (this.fieldCache != null) {
                objValueOf = Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 5);
                if (objValueOf == null) {
                    objValueOf = C5165Dav.A00;
                }
            } else {
                objValueOf = Boolean.valueOf(fieldIsSetNative(c5123Da7.A00, str));
            }
            objA01 = c5123Da7.A00(objValueOf, str, 0);
        }
        return AnonymousClass001.A1X(BV7.A0q(objA01, objA01));
    }

    public final Integer intFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A06;
        Object objA01 = c5123Da7.A01(str, 2);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 6) : decodeIntField(intFieldNative(c5123Da7.A00, str));
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 2);
        }
        return (Integer) BV7.A0q(objA01, objA01);
    }

    public final ImmutableList<Integer> intListFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A07;
        Object objA01 = c5123Da7.A01(str, 8);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 7) : intListFieldNative(c5123Da7.A00, str);
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 8);
        }
        return (ImmutableList) BV7.A0q(objA01, objA01);
    }

    public final Long longFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A08;
        Object objA01 = c5123Da7.A01(str, 4);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 8) : decodeLongField(longFieldNative(c5123Da7.A00, str), new Db2(c5123Da7, this, str, 9));
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 4);
        }
        return (Long) BV7.A0q(objA01, objA01);
    }

    public final ImmutableList<Long> longListFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A09;
        Object objA01 = c5123Da7.A01(str, 10);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 10) : longListFieldNative(c5123Da7.A00, str);
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 10);
        }
        return (ImmutableList) BV7.A0q(objA01, objA01);
    }

    public final C5123Da7 nodeFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        Object objNode$fbandroid_libraries_pando_graphql_pando_graphql;
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0A;
        Object objA01 = c5123Da7.A01(str, 6);
        if (objA01 == null) {
            if (this.fieldCache != null) {
                objNode$fbandroid_libraries_pando_graphql_pando_graphql = Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 11);
            } else {
                Long lDecodeNodeKey = decodeNodeKey(nodeFieldNative(c5123Da7.A00, str), new Db2(c5123Da7, this, str, 12));
                if (lDecodeNodeKey != null) {
                    objNode$fbandroid_libraries_pando_graphql_pando_graphql = node$fbandroid_libraries_pando_graphql_pando_graphql(lDecodeNodeKey.longValue());
                }
                objNode$fbandroid_libraries_pando_graphql_pando_graphql = C5165Dav.A00;
                objA01 = c5123Da7.A00(objNode$fbandroid_libraries_pando_graphql_pando_graphql, str, 6);
            }
            if (objNode$fbandroid_libraries_pando_graphql_pando_graphql == null) {
                objNode$fbandroid_libraries_pando_graphql_pando_graphql = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objNode$fbandroid_libraries_pando_graphql_pando_graphql, str, 6);
        }
        C5123Da7 c5123Da72 = (C5123Da7) BV7.A0q(objA01, objA01);
        if (c5123Da72 != null) {
            return resolveNode(c5123Da72);
        }
        return null;
    }

    public final ImmutableList<C5123Da7> nodeListFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        Object objMapToNodes;
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0B;
        Object objA01 = c5123Da7.A01(str, 12);
        if (objA01 == null) {
            if (this.fieldCache != null) {
                objMapToNodes = Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 13);
            } else {
                ImmutableList<Long> immutableListNodeListFieldNative = nodeListFieldNative(c5123Da7.A00, str);
                if (immutableListNodeListFieldNative != null) {
                    objMapToNodes = mapToNodes(immutableListNodeListFieldNative);
                }
                objMapToNodes = C5165Dav.A00;
                objA01 = c5123Da7.A00(objMapToNodes, str, 12);
            }
            if (objMapToNodes == null) {
                objMapToNodes = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objMapToNodes, str, 12);
        }
        ImmutableList<C5123Da7> immutableList = (ImmutableList) BV7.A0q(objA01, objA01);
        if (immutableList != null) {
            return mapToResolvedNodes(immutableList);
        }
        return null;
    }

    public final <A, T> T resolverFieldForNodeKey(C5123Da7 c5123Da7, String str, A a, G0U<? super A, ? extends T> g0u) {
        T t;
        AnonymousClass005.A0y(c5123Da7, str, g0u);
        ConcurrentHashMap<String, Object> concurrentHashMap = c5123Da7.resolverReads;
        if (concurrentHashMap == null || (t = (T) concurrentHashMap.get(str)) == null) {
            Object objCachedValue = this.fieldCache != null ? cachedValue(C2428BbE.A00(c5123Da7, EnumC5133DaN.A0D, str), new Db2(a, g0u, str, 14)) : g0u.invoke(a);
            if (objCachedValue == null) {
                objCachedValue = C5165Dav.A00;
            }
            t = (T) c5123Da7.A02(str, objCachedValue);
        }
        if (t == C5165Dav.A00) {
            return null;
        }
        return t;
    }

    public C5123Da7 rootNode$fbandroid_libraries_pando_graphql_pando_graphql(long j) {
        return node$fbandroid_libraries_pando_graphql_pando_graphql(j);
    }

    public final String stringFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0E;
        Object objA01 = c5123Da7.A01(str, 5);
        if (objA01 == null) {
            Object objA012 = c5123Da7.A01(str, 5);
            if (objA012 == null) {
                Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 15) : stringFieldNative(c5123Da7.A00, str);
                if (objA00 == null) {
                    objA00 = C5165Dav.A00;
                }
                objA012 = c5123Da7.A00(objA00, str, 5);
            }
            objA01 = BV7.A0q(objA012, objA012);
        } else if (objA01 == C5165Dav.A00) {
            return null;
        }
        return (String) objA01;
    }

    public final ImmutableList<String> stringListFieldForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        AnonymousClass003.A0u(c5123Da7, str);
        EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0F;
        Object objA01 = c5123Da7.A01(str, 11);
        if (objA01 == null) {
            Object objA00 = this.fieldCache != null ? Db2.A00(c5123Da7, C2428BbE.A00(c5123Da7, enumC5133DaN, str), this, str, 16) : stringListFieldNative(c5123Da7.A00, str);
            if (objA00 == null) {
                objA00 = C5165Dav.A00;
            }
            objA01 = c5123Da7.A00(objA00, str, 11);
        }
        return (ImmutableList) BV7.A0q(objA01, objA01);
    }

    private final void retireRawStringIfNowCompacted(C5123Da7 c5123Da7, String str) {
    }

    public final boolean listFieldHasNullItemsForNodeKey$fbandroid_libraries_pando_graphql_pando_graphql(C5123Da7 c5123Da7, String str) {
        return false;
    }

    public NodeStoreJNI(NodeViewScope nodeViewScope, ConcurrentHashMap<C2428BbE, Object> concurrentHashMap) {
        C7384Etj.A0Y(nodeViewScope, 0);
        this.scope = nodeViewScope;
        this.fieldCache = concurrentHashMap;
        this.nodes = C60O.A1C();
    }

    public final <T> T resolverFieldForNodeKey(C5123Da7 c5123Da7, String str, Function0<? extends T> function0) {
        Object objInvoke;
        T t;
        AnonymousClass003.A0u(c5123Da7, str);
        C7384Etj.A0Y(function0, 2);
        ConcurrentHashMap<String, Object> concurrentHashMap = c5123Da7.resolverReads;
        if (concurrentHashMap == null || (t = (T) concurrentHashMap.get(str)) == null) {
            EnumC5133DaN enumC5133DaN = EnumC5133DaN.A0D;
            if (this.fieldCache != null) {
                objInvoke = cachedValue(C2428BbE.A00(c5123Da7, enumC5133DaN, str), new C5888DrS(str, function0, 2));
            } else {
                objInvoke = function0.invoke();
            }
            if (objInvoke == null) {
                objInvoke = C5165Dav.A00;
            }
            t = (T) c5123Da7.A02(str, objInvoke);
        }
        if (t == C5165Dav.A00) {
            return null;
        }
        return t;
    }

    public /* synthetic */ NodeStoreJNI(NodeViewScope nodeViewScope, ConcurrentHashMap concurrentHashMap, int i, C06H c06h) {
        this(nodeViewScope, (i & 2) != 0 ? null : concurrentHashMap);
    }
}
