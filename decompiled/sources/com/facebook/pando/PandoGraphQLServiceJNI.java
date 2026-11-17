package com.facebook.pando;

import X.A7O;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C5120DZw;
import X.C5131DaF;
import X.C5136DaQ;
import X.C7384Etj;
import X.CPW;
import X.DY8;
import X.DZV;
import X.DaK;
import X.ETi;
import X.EZ8;
import X.FGI;
import X.G0U;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.NodeStoreJNI;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class PandoGraphQLServiceJNI implements IPandoGraphQLService {
    public final PandoGraphQLConsistencyJNI mGraphqlConsistency;
    public final HybridData mHybridData;
    public final PandoParseConfig mPandoParseConfig;

    public PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, C5120DZw c5120DZw, int i, boolean z, List<? extends List<String>> list, PandoParseConfig pandoParseConfig, Executor executor, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.mGraphqlConsistency = pandoGraphQLConsistencyJNI;
        this.mPandoParseConfig = pandoParseConfig;
        this.mHybridData = initHybridData(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, C5120DZw.A00(c5120DZw), z, i, list, pandoParseConfig, executor, z2, z3, z4, z5);
    }

    public static final PandoGraphQLServiceJNI createDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, C5120DZw c5120DZw, List<? extends List<String>> list, Integer num, PandoParseConfig pandoParseConfig, Executor executor, boolean z, boolean z2) {
        AnonymousClass002.A1D(c5120DZw, 2, pandoParseConfig);
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, c5120DZw, num != null ? num.intValue() : 0, true, list, pandoParseConfig, executor, z, z2, false, false);
    }

    public static final PandoGraphQLServiceJNI createNonDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, PandoParseConfig pandoParseConfig, C5120DZw c5120DZw, Executor executor, List<? extends List<String>> list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass002.A1B(pandoParseConfig, 2, c5120DZw);
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, c5120DZw, 0, false, list, pandoParseConfig, executor, z, z2, z3, z4);
    }

    public static /* synthetic */ void getMGraphqlConsistency$annotations() {
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static /* synthetic */ void getMPandoParseConfig$annotations() {
    }

    private final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI, boolean z, int i, List<? extends List<String>> list, PandoParseConfig pandoParseConfig, Executor executor, boolean z2, boolean z3, boolean z4, boolean z5);

    private final native <T, TImpl extends TreeJNI> IPandoGraphQLService.Result<T> initiateNative(PandoDataJNI pandoDataJNI, PandoGraphQLRequest<T> pandoGraphQLRequest, NativeCallbacks<T, TImpl> nativeCallbacks, Executor executor);

    private final native <T> IPandoGraphQLService.Result<NodeStoreJNI.NodeWithStore> initiateWithNodeStoreResponsesNative(PandoDataJNI pandoDataJNI, PandoGraphQLRequest<T> pandoGraphQLRequest, NodeStoreCallbacks<T> nodeStoreCallbacks, Executor executor);

    public <T> IPandoGraphQLService.Result<T> initiate(PandoDataJNI pandoDataJNI, PandoGraphQLRequest<T> pandoGraphQLRequest, CPW<T> cpw, Executor executor) {
        DZV dzv;
        EZ8 ez8;
        EZ8 ez82;
        Object obj;
        IPandoGraphQLService.Token dy8;
        boolean zAreAllSelectionsOptionalOrNonnullNative;
        C7384Etj.A0Y(pandoGraphQLRequest, 1);
        PandoError pandoError = pandoGraphQLRequest.error;
        Object objInvoke = null;
        if (pandoError != null) {
            if (cpw != null) {
                cpw.onError(pandoError);
            }
            dy8 = new DY8();
        } else {
            G0U<A7O, T> responseBuilder = pandoGraphQLRequest.getResponseBuilder();
            if (responseBuilder != null) {
                dzv = new DZV(responseBuilder);
                ez8 = new EZ8(dzv, 5);
                ez82 = new EZ8(dzv, 4);
            } else {
                dzv = null;
                ez8 = null;
                ez82 = null;
            }
            IPandoGraphQLService.Result<T> resultInitiateNative = initiateNative(pandoDataJNI, pandoGraphQLRequest, cpw != null ? new NativeCallbacks(cpw, ez8, ez82) : null, executor);
            Object obj2 = resultInitiateNative.tree;
            if (!(obj2 instanceof A7O) || (obj = (A7O) obj2) == null) {
                obj = null;
            } else {
                if (obj instanceof C5131DaF) {
                    zAreAllSelectionsOptionalOrNonnullNative = !(C5131DaF.A00((C5131DaF) obj) instanceof C5136DaQ);
                } else if (obj instanceof TreeWithGraphQL) {
                    zAreAllSelectionsOptionalOrNonnullNative = ((TreeJNI) obj).areAllSelectionsOptionalOrNonnullNative();
                }
                if (!zAreAllSelectionsOptionalOrNonnullNative) {
                    String str = pandoGraphQLRequest.queryName;
                    C7384Etj.A0Y(str, 1);
                    String strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", obj instanceof C5131DaF ? C5131DaF.A09((C5131DaF) obj, str) : obj instanceof TreeWithGraphQL ? ((DaK) obj).A02(str) : C0881AGi.A00, null);
                    if (cpw != null) {
                        CPW.A00(cpw, FGI.A0M("A root field is required but null, or is required and has a recursively required but null child field:\n", strA0L), null);
                    }
                    dy8 = new DY8();
                }
            }
            if (dzv == null || obj == null) {
                return resultInitiateNative;
            }
            objInvoke = dzv.A00.invoke(obj);
            dy8 = resultInitiateNative.cancelToken;
        }
        return new IPandoGraphQLService.Result<>(objInvoke, dy8);
    }

    public final native <T extends TreeJNI> void pandoAppendEdgeNative(String str, T t);

    public IPandoGraphQLService.Token pandoLoadNextPage(String str, int i, int i2, boolean z, String str2, Executor executor) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str2, executor);
        return pandoLoadNextPageNative(str, i, i2, z, str2, executor);
    }

    public final native IPandoGraphQLService.Token pandoLoadNextPageNative(String str, int i, int i2, boolean z, String str2, Executor executor);

    public IPandoGraphQLService.Token pandoLoadPreviousPage(String str, int i, String str2, Executor executor) {
        AnonymousClass005.A11(str, str2, executor, 0);
        return pandoLoadPreviousPageNative(str, i, str2, executor);
    }

    public final native IPandoGraphQLService.Token pandoLoadPreviousPageNative(String str, int i, String str2, Executor executor);

    public final native <T extends TreeJNI> void pandoPrependEdgeNative(String str, T t);

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public static /* synthetic */ HybridData initHybridData$default(PandoGraphQLServiceJNI pandoGraphQLServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI, boolean z, int i, List list, PandoParseConfig pandoParseConfig, Executor executor, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 & 128) != 0) {
            executor = null;
        }
        return pandoGraphQLServiceJNI.initHybridData(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, pandoBuildConfigFlatbufferAssetReaderJNI, z, i, list, pandoParseConfig, executor, C3cG.A1K(i2 & 256, z2), C3cG.A1K(i2 & 512, z3), C3cG.A1K(i2 & 1024, z4), C3cG.A1K(i2 & 2048, z5));
    }

    public PandoGraphQLConsistencyJNI graphQLConsistency() {
        return this.mGraphqlConsistency;
    }

    public PandoParseConfig pandoParseConfig() {
        return this.mPandoParseConfig;
    }

    private final <T> IPandoGraphQLService.Result<T> initiateWithNodeStoreResponses(PandoDataJNI pandoDataJNI, PandoGraphQLRequest<T> pandoGraphQLRequest, NodeStoreCallbacks<T> nodeStoreCallbacks, Executor executor) {
        IPandoGraphQLService.Token dy8;
        IPandoGraphQLService.Result<NodeStoreJNI.NodeWithStore> resultInitiateWithNodeStoreResponsesNative = initiateWithNodeStoreResponsesNative(pandoDataJNI, pandoGraphQLRequest, nodeStoreCallbacks, executor);
        NodeStoreJNI.NodeWithStore nodeWithStore = resultInitiateWithNodeStoreResponsesNative.tree;
        if (nodeWithStore == null) {
            dy8 = resultInitiateWithNodeStoreResponsesNative.cancelToken;
        } else {
            T tModelOrReportError = nodeStoreCallbacks.modelOrReportError(nodeWithStore);
            if (tModelOrReportError != null) {
                return new IPandoGraphQLService.Result<>(tModelOrReportError, resultInitiateWithNodeStoreResponsesNative.cancelToken);
            }
            dy8 = new DY8();
        }
        return new IPandoGraphQLService.Result<>(null, dy8);
    }

    public <T extends TreeJNI> void pandoAppendEdge(String str, T t) {
        AnonymousClass003.A0u(str, t);
        pandoAppendEdgeNative(str, t);
    }

    public <T extends TreeJNI> void pandoPrependEdge(String str, T t) {
        AnonymousClass003.A0u(str, t);
        pandoPrependEdgeNative(str, t);
    }

    public /* synthetic */ PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, C5120DZw c5120DZw, int i, boolean z, List list, PandoParseConfig pandoParseConfig, Executor executor, boolean z2, boolean z3, boolean z4, boolean z5, int i2, C06H c06h) {
        this(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, c5120DZw, (i2 & 8) != 0 ? 0 : i, z, (i2 & 32) != 0 ? null : list, pandoParseConfig, (i2 & 128) != 0 ? null : executor, C3cG.A1K(i2 & 256, z2), C3cG.A1K(i2 & 512, z3), C3cG.A1K(i2 & 1024, z4), C3cG.A1K(i2 & 2048, z5));
    }
}
