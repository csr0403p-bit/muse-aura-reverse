package com.facebook.pando;

import X.A7O;
import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C5123Da7;
import X.C5131DaF;
import X.C7384Etj;
import X.CFK;
import X.DYF;
import X.DZB;
import X.DZc;
import X.ETi;
import X.InterfaceC2619Bfl;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;
import com.facebook.pando.IPandoGraphQLService;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class PandoPaginationService {
    public static final PandoPaginationService $redex_init_class = null;
    public final HybridData mHybridData;

    private final native <TImpl extends TreeJNI> void appendEdgeNative(String str, TImpl timpl);

    private final native void appendNodeStoreEdgeNative(String str, NodeStoreJNI nodeStoreJNI, long j);

    private final native <TImpl extends TreeJNI> void deleteEdgeNative(String str, TImpl timpl);

    private final native void deleteNodeStoreEdgeNative(String str, long j);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager, boolean z);

    private final native IPandoGraphQLService.Token loadNextPageNative(String str, int i, int i2, boolean z, String str2, int i3, int i4, String str3, Executor executor, NativeMap nativeMap);

    private final native IPandoGraphQLService.Token loadPreviousPageNative(String str, int i, String str2, int i2, int i3, String str3, Executor executor, NativeMap nativeMap);

    private final native <TImpl extends TreeJNI> void prependEdgeNative(String str, TImpl timpl);

    private final native void prependNodeStoreEdgeNative(String str, NodeStoreJNI nodeStoreJNI, long j);

    static {
        ETi.loadLibrary("pando-pagination-jni");
    }

    public IPandoGraphQLService.Token loadNextPage(String str, int i, int i2, boolean z, String str2, Executor executor, DYF dyf, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> mapA0E = map;
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str2, executor);
        if (dyf != null) {
            throw BV4.A0a("getMarkerId");
        }
        NativeMap nativeMap = NativeMap.$redex_init_class;
        if (map == null) {
            mapA0E = AGH.A0E();
        }
        return loadNextPageNative(str, i, i2, z, str2, 0, 0, "", executor, new NativeMap(mapA0E));
    }

    public IPandoGraphQLService.Token loadPreviousPage(String str, int i, String str2, Executor executor, DYF dyf, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> mapA0E = map;
        AnonymousClass005.A11(str, str2, executor, 0);
        if (dyf != null) {
            throw BV4.A0a("getMarkerId");
        }
        NativeMap nativeMap = NativeMap.$redex_init_class;
        if (map == null) {
            mapA0E = AGH.A0E();
        }
        return loadPreviousPageNative(str, i, str2, 0, 0, "", executor, new NativeMap(mapA0E));
    }

    public PandoPaginationService(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager, boolean z) {
        AnonymousClass005.A0x(pandoConsistencyServiceJNI, pandoPrimaryExecution, connectionManager);
        this.mHybridData = initHybridData(pandoConsistencyServiceJNI, pandoPrimaryExecution, connectionManager, z);
    }

    private final C5123Da7 toNodeStoreGraphNodeOrNull(InterfaceC2619Bfl interfaceC2619Bfl) {
        C5131DaF c5131DaF;
        A7O a7oA00 = DZc.A00(interfaceC2619Bfl);
        if (!(a7oA00 instanceof C5131DaF) || (c5131DaF = (C5131DaF) a7oA00) == null) {
            return null;
        }
        return c5131DaF.A01;
    }

    private final TreeWithGraphQL treeOrReport(InterfaceC2619Bfl interfaceC2619Bfl) {
        TreeWithGraphQL treeWithGraphQLA00 = DZB.A00(interfaceC2619Bfl);
        if (treeWithGraphQLA00 == null) {
            CFK.A07("PandoPaginationService", "A model with no NodeStore form reached a subscription or an edge change.");
        }
        return treeWithGraphQLA00;
    }

    public <T extends InterfaceC2619Bfl> void appendEdge(String str, T t) {
        AnonymousClass003.A0u(str, t);
        C5123Da7 nodeStoreGraphNodeOrNull = toNodeStoreGraphNodeOrNull(t);
        if (nodeStoreGraphNodeOrNull != null) {
            appendNodeStoreEdgeNative(str, nodeStoreGraphNodeOrNull.A01, nodeStoreGraphNodeOrNull.A00);
            return;
        }
        TreeWithGraphQL treeWithGraphQLTreeOrReport = treeOrReport(t);
        if (treeWithGraphQLTreeOrReport != null) {
            appendEdgeNative(str, treeWithGraphQLTreeOrReport);
        }
    }

    public <T extends InterfaceC2619Bfl> void deleteEdge(String str, T t) {
        AnonymousClass003.A0u(str, t);
        C5123Da7 nodeStoreGraphNodeOrNull = toNodeStoreGraphNodeOrNull(t);
        if (nodeStoreGraphNodeOrNull != null) {
            deleteNodeStoreEdgeNative(str, nodeStoreGraphNodeOrNull.A00);
            return;
        }
        TreeWithGraphQL treeWithGraphQLTreeOrReport = treeOrReport(t);
        if (treeWithGraphQLTreeOrReport != null) {
            deleteEdgeNative(str, treeWithGraphQLTreeOrReport);
        }
    }

    public <T extends InterfaceC2619Bfl> void prependEdge(String str, T t) {
        AnonymousClass003.A0u(str, t);
        C5123Da7 nodeStoreGraphNodeOrNull = toNodeStoreGraphNodeOrNull(t);
        if (nodeStoreGraphNodeOrNull != null) {
            prependNodeStoreEdgeNative(str, nodeStoreGraphNodeOrNull.A01, nodeStoreGraphNodeOrNull.A00);
            return;
        }
        TreeWithGraphQL treeWithGraphQLTreeOrReport = treeOrReport(t);
        if (treeWithGraphQLTreeOrReport != null) {
            prependEdgeNative(str, treeWithGraphQLTreeOrReport);
        }
    }

    public /* synthetic */ PandoPaginationService(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager, boolean z, int i, C06H c06h) {
        this(pandoConsistencyServiceJNI, pandoPrimaryExecution, connectionManager, (i & 8) != 0 ? false : z);
    }
}
