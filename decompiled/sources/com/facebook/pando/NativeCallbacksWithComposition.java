package com.facebook.pando;

import X.A7O;
import X.AnonymousClass003;
import X.C7384Etj;
import X.CPW;
import X.G0U;

/* loaded from: classes5.dex */
public final class NativeCallbacksWithComposition<T> implements CPW<TreeWithGraphQL> {
    public final CPW<T> innerCallbacks;
    public final G0U<A7O, T> responseConstructor;

    @Override // X.CPW
    public void onError(PandoError pandoError) {
        C7384Etj.A0Y(pandoError, 0);
        this.innerCallbacks.onError(pandoError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeCallbacksWithComposition(G0U<? super A7O, ? extends T> g0u, CPW<T> cpw) {
        AnonymousClass003.A0u(g0u, cpw);
        this.responseConstructor = g0u;
        this.innerCallbacks = cpw;
    }

    @Override // X.CPW
    public void onUpdate(TreeWithGraphQL treeWithGraphQL, Summary summary) {
        AnonymousClass003.A0u(treeWithGraphQL, summary);
        this.innerCallbacks.onUpdate(this.responseConstructor.invoke(treeWithGraphQL), summary);
    }
}
