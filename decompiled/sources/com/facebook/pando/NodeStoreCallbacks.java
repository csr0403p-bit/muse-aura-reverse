package com.facebook.pando;

import X.A7O;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C3cG;
import X.C5113DZd;
import X.C5131DaF;
import X.C5136DaQ;
import X.C7384Etj;
import X.CPW;
import X.DZu;
import X.FGI;
import X.G0U;
import X.InterfaceC5117DZq;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.pando.NodeStoreJNI;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class NodeStoreCallbacks<T> {
    public final CPW<T> callbacks;
    public final G0U<A7O, T> constructor;
    public final String name;
    public final DZu readerFragment;
    public final AtomicReference<NodeViewScope> scope;
    public final InterfaceC5117DZq scopeSource;

    /* JADX WARN: Multi-variable type inference failed */
    public NodeStoreCallbacks(CPW<T> cpw, G0U<? super A7O, ? extends T> g0u, DZu dZu, String str, InterfaceC5117DZq interfaceC5117DZq) {
        C5113DZd c5113DZd;
        AnonymousClass005.A11(g0u, dZu, str, 1);
        C7384Etj.A0Y(interfaceC5117DZq, 4);
        this.callbacks = cpw;
        this.constructor = g0u;
        this.readerFragment = dZu;
        this.name = str;
        this.scopeSource = interfaceC5117DZq;
        NodeViewScope nodeViewScope = null;
        if ((interfaceC5117DZq instanceof C5113DZd) && (c5113DZd = (C5113DZd) interfaceC5117DZq) != null) {
            nodeViewScope = c5113DZd.A00;
        }
        this.scope = BV4.A16(nodeViewScope);
    }

    public final T modelOrReportError(NodeStoreJNI.NodeWithStore nodeWithStore) {
        C7384Etj.A0Y(nodeWithStore, 0);
        C5131DaF c5131DaF = new C5131DaF(this.readerFragment, nodeWithStore.rootNode, false);
        if (!(C5131DaF.A00(c5131DaF) instanceof C5136DaQ)) {
            return this.constructor.invoke(c5131DaF);
        }
        String str = this.name;
        C7384Etj.A0Y(str, 0);
        String strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", C5131DaF.A09(c5131DaF, str), null);
        CPW<T> cpw = this.callbacks;
        if (cpw != null) {
            CPW.A00(cpw, FGI.A0M("A root field is required but null, or is required and has a recursively required but null child field:\n", strA0L), null);
        }
        return null;
    }

    public final void onError(PandoError pandoError) {
        C7384Etj.A0Y(pandoError, 0);
        CPW<T> cpw = this.callbacks;
        if (cpw != null) {
            cpw.onError(pandoError);
        }
    }

    public final NodeViewScope scope() {
        return this.scope.get();
    }

    public final NodeViewScope scopeOrNewFrom(QueryVariablesJNI queryVariablesJNI) {
        InterfaceC5117DZq interfaceC5117DZq = this.scopeSource;
        if (interfaceC5117DZq instanceof C5113DZd) {
            return ((C5113DZd) interfaceC5117DZq).A00;
        }
        throw C3cG.A0q();
    }

    public final void onNodeStoreUpdate(NodeStoreJNI.NodeWithStore nodeWithStore, Summary summary) {
        CPW<T> cpw;
        AnonymousClass003.A0u(nodeWithStore, summary);
        T tModelOrReportError = modelOrReportError(nodeWithStore);
        if (tModelOrReportError == null || (cpw = this.callbacks) == null) {
            return;
        }
        cpw.onUpdate(tModelOrReportError, summary);
    }
}
