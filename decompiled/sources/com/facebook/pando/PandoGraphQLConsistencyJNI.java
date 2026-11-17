package com.facebook.pando;

import X.A7N;
import X.A7O;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC3081BxN;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV6;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C5113DZd;
import X.C5119DZv;
import X.C5123Da7;
import X.C5130DaE;
import X.C5131DaF;
import X.C60Q;
import X.C7384Etj;
import X.C9jH;
import X.CFK;
import X.CPV;
import X.CPW;
import X.DY8;
import X.DYD;
import X.DZB;
import X.DZJ;
import X.DZP;
import X.DZQ;
import X.DZS;
import X.DZT;
import X.DZW;
import X.DZc;
import X.DZe;
import X.DZf;
import X.DZg;
import X.DZl;
import X.DZu;
import X.DaK;
import X.E86;
import X.EDo;
import X.EQe;
import X.ETi;
import X.F0r;
import X.FGI;
import X.G0U;
import X.InterfaceC2619Bfl;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class PandoGraphQLConsistencyJNI {
    public static final PandoGraphQLConsistencyJNI $redex_init_class = null;
    public final PandoConsistencyServiceJNI consistencyService;
    public final Executor flipperExecutor;
    public final HybridData mHybridData;
    public final PandoParseConfig parseConfig;
    public final int qplMarkerId;
    public final Executor subscribeExecutor;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoParseConfig pandoParseConfig, Executor executor, int i);

    private final native <T, TImpl extends TreeJNI> IPandoGraphQLService.Token lookupAndSubscribeNative(TreeUpdaterJNI treeUpdaterJNI, Class<TImpl> cls, NativeCallbacks<T, TImpl> nativeCallbacks, Executor executor);

    private final <T extends InterfaceC2619Bfl> G0U<A7O, T> modelConstructorFromClass(Class<T> cls) {
        if (cls == null || !A7N.class.isAssignableFrom(cls)) {
            return null;
        }
        return new EQe(cls, 9);
    }

    private final native void publishTreeUpdatersFromBuilders(List<? extends TreeUpdaterJNI> list);

    private final DZW readerFragmentIdentityFromClass(Class<? extends InterfaceC2619Bfl> cls) {
        Object objA0s;
        try {
            Object obj = cls.getField("Companion").get(null);
            Class<?> cls2 = obj.getClass();
            Object objInvoke = cls2.getMethod("getBUILD_CONFIG_NAME", null).invoke(obj, null);
            C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type kotlin.String");
            Object objInvoke2 = cls2.getMethod("getFRAGMENT_NAME_HASH", null).invoke(obj, null);
            C7384Etj.A0Z(objInvoke2, AnonymousClass000.A00(0));
            objA0s = new DZW((String) objInvoke, BV6.A07(objInvoke2));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (DZW) (objA0s instanceof C10571Hud ? null : objA0s);
    }

    private final native <T, TImpl extends TreeJNI> IPandoGraphQLService.Result<T> subscribeNative(TImpl timpl, Class<TImpl> cls, NativeCallbacks<T, TImpl> nativeCallbacks, Executor executor);

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends InterfaceC2619Bfl> IPandoGraphQLService.Token subscribeToBuilder(DYD dyd, CPW<T> cpw, Executor executor, G0U<? super A7O, ? extends T> g0u) {
        F0r f0r;
        DZT dzt;
        C7384Etj.A0Y(dyd, 0);
        if (!(dyd instanceof F0r) || (f0r = (F0r) dyd) == null || !(f0r instanceof DZT) || (dzt = (DZT) f0r) == null) {
            throw C60Q.A0U("Unsupported builder type: ", C60Q.A0e(dyd));
        }
        C5131DaF<?> c5131DaFCopiedTreeNodeResultOrNull = copiedTreeNodeResultOrNull(dzt);
        if (c5131DaFCopiedTreeNodeResultOrNull == null) {
            return lookupAndSubscribeNative(dzt.AhP(), dzt.AM5(), new NativeCallbacks(cpw, g0u, null), executor);
        }
        TreeWithGraphQL treeWithGraphQLA0F = c5131DaFCopiedTreeNodeResultOrNull.A0F();
        if (treeWithGraphQLA0F != null) {
            return subscribeWithFlatbufferASTNative(treeWithGraphQLA0F, treeWithGraphQLA0F.getClass(), new NativeCallbacks(cpw, g0u, null), executor);
        }
        CFK.A07("PandoGraphQLConsistencyJNI", "A model with no NodeStore form reached a subscription or an edge change.");
        return new DY8();
    }

    private final native <T> IPandoGraphQLService.Token subscribeToNodeStoreNative(NodeStoreJNI nodeStoreJNI, long j, int i, QueryVariablesJNI queryVariablesJNI, int i2, NodeStoreCallbacks<T> nodeStoreCallbacks, Executor executor, String str);

    private final native <T, TImpl extends TreeJNI> IPandoGraphQLService.Token subscribeWithFlatbufferASTNative(TImpl timpl, Class<TImpl> cls, NativeCallbacks<T, TImpl> nativeCallbacks, Executor executor);

    public final <T extends InterfaceC2619Bfl> IPandoGraphQLService.Token lookupAndSubscribe(DYD dyd, CPW<T> cpw, Executor executor, G0U<? super A7O, ? extends T> g0u) {
        AnonymousClass005.A0x(dyd, cpw, executor);
        return setUpSubscription(cpw, executor, new E86(dyd, cpw, this, executor, g0u, 0));
    }

    public final native void maybeSchedulePrune(boolean z);

    public final native void publish(String str);

    public final <T extends DYD> void publishBuilders(T... tArr) {
        F0r f0r;
        DZT dzt;
        C7384Etj.A0Y(tArr, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        for (T t : tArr) {
            C7384Etj.A0Y(t, 0);
            if (!(t instanceof F0r) || (f0r = (F0r) t) == null || !(f0r instanceof DZT) || (dzt = (DZT) f0r) == null) {
                throw C60Q.A0U("Unsupported builder type: ", C60Q.A0e(t));
            }
            arrayListA0h.add(dzt.AhP());
        }
        publishTreeUpdatersFromBuilders(arrayListA0h);
    }

    public final native void publishTreeUpdaters(List<? extends TreeUpdaterJNI> list, boolean z);

    public final <T extends TreeJNI> IPandoGraphQLService.Result<T> subscribe(T t, Class<T> cls, CPW<T> cpw, Executor executor) {
        C7384Etj.A0Y(t, 0);
        AnonymousClass005.A11(cls, cpw, executor, 1);
        IPandoGraphQLService.Result<T> resultSubscribeNative = subscribeNative(t, cls, new NativeCallbacks(cpw, null, null), executor);
        T t2 = resultSubscribeNative.tree;
        if (!(t2 instanceof TreeWithGraphQL)) {
            return resultSubscribeNative;
        }
        DaK daK = (DaK) t2;
        if (daK.areAllSelectionsOptionalOrNonnullNative()) {
            return resultSubscribeNative;
        }
        CPW.A00(cpw, FGI.A0M("A root field is required but null, or is required and has a recursively required but null child field:\n", AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", daK.A02(cls.toString()), null)), null);
        return new IPandoGraphQLService.Result<>(null, new DY8());
    }

    public final <T extends InterfaceC2619Bfl> IPandoGraphQLService.Token subscribeWithFlatbufferAST(T t, CPW<T> cpw, Executor executor) {
        AnonymousClass005.A0x(t, cpw, executor);
        return setUpSubscription(cpw, executor, new EDo(this, cpw, t, executor, 1));
    }

    public final native int subscriptionsCountRacey();

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    private final C5131DaF<?> copiedTreeNodeResultOrNull(DZT dzt) {
        if (!(dzt instanceof DZP)) {
            return null;
        }
        DZP dzp = (DZP) dzt;
        C5131DaF<?> c5131DaF = dzp.A01;
        DZJ dzj = (DZJ) dzp.A00;
        Map<String, Object> map = dzj.A02;
        C5123Da7 c5123Da7 = dzj.A00;
        NodeStoreTreeUpdaterJNI nodeStoreTreeUpdaterJNI = new NodeStoreTreeUpdaterJNI(map, c5123Da7);
        Iterator it = dzj.A01.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("addTo");
        }
        C5123Da7 c5123Da72 = c5123Da7.A01.applyToRoot(c5123Da7.A00, nodeStoreTreeUpdaterJNI).rootNode;
        DZu dZu = c5131DaF.A00;
        C7384Etj.A0Y(c5123Da72, 0);
        return new C5131DaF(dZu, c5123Da72, c5131DaF.A02);
    }

    public static /* synthetic */ void maybeSchedulePrune$default(PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pandoGraphQLConsistencyJNI.maybeSchedulePrune(z);
    }

    public static /* synthetic */ void publishTreeUpdaters$default(PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pandoGraphQLConsistencyJNI.publishTreeUpdaters(list, z);
    }

    private final <T> IPandoGraphQLService.Token setUpSubscription(CPW<T> cpw, Executor executor, Function0<? extends IPandoGraphQLService.Token> function0) {
        Executor executor2 = this.subscribeExecutor;
        if (executor2 == null) {
            return function0.invoke();
        }
        DZS dzs = new DZS();
        executor2.execute(new DZQ(dzs, cpw, executor, function0));
        return dzs;
    }

    private final <T> IPandoGraphQLService.Token subscribeToNodeStore(C5131DaF<C5123Da7> c5131DaF, String str, G0U<? super A7O, ? extends T> g0u, CPW<T> cpw, Executor executor) {
        if (c5131DaF == null) {
            CFK.A07("PandoGraphQLConsistencyJNI", "A model with no NodeStore form reached a subscription or an edge change.");
            executor.execute(new CPV(cpw, str));
        } else {
            C5123Da7 c5123Da7 = c5131DaF.A01;
            NodeStoreJNI nodeStoreJNI = c5123Da7.A01;
            long j = c5123Da7.A00;
            DZu dZu = c5131DaF.A00;
            int i = ((C5130DaE) dZu).A00;
            DZl dZl = nodeStoreJNI.scope.variables.A00;
            QueryVariablesJNI queryVariablesJNI = dZl instanceof DZe ? ((DZe) dZl).A00 : (QueryVariablesJNI) ((DZg) dZl).A02.getValue();
            C5119DZv c5119DZvA00 = nodeStoreJNI.scope.assetReader;
            if (c5119DZvA00 == null) {
                c5119DZvA00 = AbstractC3081BxN.A00();
            }
            IPandoGraphQLService.Token tokenSubscribeToNodeStoreNative = subscribeToNodeStoreNative(nodeStoreJNI, j, i, queryVariablesJNI, c5119DZvA00.A00(nodeStoreJNI.scope.buildConfigName), new NodeStoreCallbacks<>(cpw, g0u, dZu, str, new C5113DZd(nodeStoreJNI.scope)), executor, str);
            if (tokenSubscribeToNodeStoreNative != null) {
                return tokenSubscribeToNodeStoreNative;
            }
        }
        return new DY8();
    }

    public final PandoConsistencyServiceJNI getInnerConsistencyService() {
        return this.consistencyService;
    }

    public PandoGraphQLConsistencyJNI(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoParseConfig pandoParseConfig, Executor executor, int i, Executor executor2) {
        AnonymousClass003.A0u(pandoConsistencyServiceJNI, pandoParseConfig);
        this.consistencyService = pandoConsistencyServiceJNI;
        this.parseConfig = pandoParseConfig;
        this.flipperExecutor = executor;
        this.qplMarkerId = i;
        this.subscribeExecutor = executor2;
        this.mHybridData = initHybridData(pandoConsistencyServiceJNI, pandoParseConfig, executor, i);
    }

    private final DZu javaReaderFragment(DZW dzw) {
        return AbstractC3081BxN.A00().A01(dzw.A00, dzw.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C5131DaF<C5123Da7> nodeStoreTreeNodeOrNull(InterfaceC2619Bfl interfaceC2619Bfl) {
        DZu dZuJavaReaderFragment;
        Object objA00 = DZc.A00(interfaceC2619Bfl);
        if (objA00 instanceof C5131DaF) {
            C5131DaF c5131DaF = (C5131DaF) objA00;
            return new C5131DaF(c5131DaF.A00, c5131DaF.A01, c5131DaF.A02);
        }
        if (!(objA00 instanceof TreeWithGraphQL)) {
            return null;
        }
        TreeJNI treeJNI = (TreeJNI) objA00;
        DZW dzw = readerFragmentIdentityFromClass(interfaceC2619Bfl.getClass());
        if (dzw == null || (dZuJavaReaderFragment = javaReaderFragment(dzw)) == null) {
            return null;
        }
        NodeViewScope nodeViewScope = new NodeViewScope(dzw.A01, AbstractC3081BxN.A00(), new DZf(new DZe(QueryVariablesJNI.forTree(treeJNI))), treeJNI.getUseSegmentedCanonicalArguments());
        AtomicReferenceFieldUpdater<C5131DaF<?>, Object> atomicReferenceFieldUpdater = C5131DaF.A07;
        return new C5131DaF(dZuJavaReaderFragment, NodeStoreJNI.fromTreeNative(treeJNI, nodeViewScope).rootNode, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends InterfaceC2619Bfl> IPandoGraphQLService.Token subscribeToModel(T t, CPW<T> cpw, Executor executor) {
        G0U<A7O, T> g0uModelConstructorFromClass = modelConstructorFromClass(t.getClass());
        TreeWithGraphQL treeWithGraphQLA00 = DZB.A00(t);
        if (treeWithGraphQLA00 != null) {
            return subscribeWithFlatbufferASTNative(treeWithGraphQLA00, treeWithGraphQLA00.getClass(), new NativeCallbacks(cpw, g0uModelConstructorFromClass, null), executor);
        }
        CFK.A07("PandoGraphQLConsistencyJNI", "A model with no NodeStore form reached a subscription or an edge change.");
        return new DY8();
    }

    public final boolean hasSubscribersRacey() {
        return AnonymousClass002.A1N(subscriptionsCountRacey());
    }

    public /* synthetic */ PandoGraphQLConsistencyJNI(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoParseConfig pandoParseConfig, Executor executor, int i, Executor executor2, int i2, C06H c06h) {
        this(pandoConsistencyServiceJNI, (i2 & 2) != 0 ? new PandoParseConfig(false, false, null) : pandoParseConfig, (i2 & 4) != 0 ? null : executor, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : executor2);
    }

    private final C5131DaF<C5123Da7> nodeStoreTreeNodeOrNull(DZT dzt) {
        DZu dZuJavaReaderFragment;
        C5131DaF<?> c5131DaFCopiedTreeNodeResultOrNull = copiedTreeNodeResultOrNull(dzt);
        if (c5131DaFCopiedTreeNodeResultOrNull != null) {
            return new C5131DaF(c5131DaFCopiedTreeNodeResultOrNull.A00, c5131DaFCopiedTreeNodeResultOrNull.A01, c5131DaFCopiedTreeNodeResultOrNull.A02);
        }
        DZW dzwAJQ = dzt.AJQ();
        if (dzwAJQ == null || (dZuJavaReaderFragment = javaReaderFragment(dzwAJQ)) == null) {
            return null;
        }
        String str = dzwAJQ.A01;
        C5119DZv c5119DZvA00 = AbstractC3081BxN.A00();
        C9jH c9jHA0E = AGH.A0E();
        NodeViewScope nodeViewScope = new NodeViewScope(str, c5119DZvA00, c9jHA0E, c9jHA0E, false);
        AtomicReferenceFieldUpdater<C5131DaF<?>, Object> atomicReferenceFieldUpdater = C5131DaF.A07;
        TreeUpdaterJNI treeUpdaterJNIAhP = dzt.AhP();
        NodeStoreJNI nodeStoreJNI = NodeStoreJNI.$redex_init_class;
        C7384Etj.A0Y(treeUpdaterJNIAhP, 0);
        return new C5131DaF(dZuJavaReaderFragment, NodeStoreJNI.fromUpdaterNative(treeUpdaterJNIAhP, nodeViewScope).rootNode, false);
    }
}
