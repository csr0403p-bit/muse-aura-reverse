package com.facebook.pando;

import X.A7O;
import X.AbstractC0878AGe;
import X.AnonymousClass004;
import X.C06H;
import X.C0881AGi;
import X.C5131DaF;
import X.C5136DaQ;
import X.C7384Etj;
import X.CPW;
import X.DaK;
import X.FGI;
import X.G0U;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.pando.TreeJNI;

/* loaded from: classes5.dex */
public final class NativeCallbacks<T, TImpl extends TreeJNI> {
    public final G0U<A7O, A7O> graphQLDataPreparation;
    public final CPW<T> innerCallbacks;
    public final G0U<A7O, T> responseConstructor;

    public final void onError(PandoError pandoError) {
        C7384Etj.A0Y(pandoError, 0);
        this.innerCallbacks.onError(pandoError);
    }

    public /* synthetic */ NativeCallbacks(CPW cpw, G0U g0u, G0U g0u2, int i, C06H c06h) {
        this(cpw, g0u, (i & 4) != 0 ? null : g0u2);
    }

    public final void onModelUpdate(TImpl timpl, Summary summary) {
        A7O a7o;
        T tInvoke;
        boolean zAreAllSelectionsOptionalOrNonnullNative;
        A7O a7oInvoke;
        AnonymousClass004.A1b(timpl, summary);
        if (!(timpl instanceof A7O) || (a7o = (A7O) timpl) == null) {
            a7o = null;
        } else {
            G0U<A7O, A7O> g0u = this.graphQLDataPreparation;
            if (g0u != null && (a7oInvoke = g0u.invoke(a7o)) != null) {
                a7o = a7oInvoke;
            }
            boolean z = a7o instanceof C5131DaF;
            if (z) {
                zAreAllSelectionsOptionalOrNonnullNative = !(C5131DaF.A00((C5131DaF) a7o) instanceof C5136DaQ);
            } else if (a7o instanceof TreeWithGraphQL) {
                zAreAllSelectionsOptionalOrNonnullNative = ((TreeJNI) a7o).areAllSelectionsOptionalOrNonnullNative();
            }
            if (!zAreAllSelectionsOptionalOrNonnullNative) {
                String string = timpl.getClass().toString();
                CPW.A00(this.innerCallbacks, FGI.A0M("A root field is required but null, or is required and has a recursively required but null child field:\n", AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", z ? C5131DaF.A09((C5131DaF) a7o, string) : a7o instanceof TreeWithGraphQL ? ((DaK) a7o).A02(string) : C0881AGi.A00, null)), null);
                return;
            }
        }
        G0U<A7O, T> g0u2 = this.responseConstructor;
        if (g0u2 == null || a7o == null || (tInvoke = g0u2.invoke(a7o)) == null) {
            tInvoke = (T) timpl;
        }
        this.innerCallbacks.onUpdate(tInvoke, summary);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeCallbacks(CPW<T> cpw, G0U<? super A7O, ? extends T> g0u, G0U<? super A7O, ? extends A7O> g0u2) {
        C7384Etj.A0Y(cpw, 0);
        this.innerCallbacks = cpw;
        this.responseConstructor = g0u;
        this.graphQLDataPreparation = g0u2;
    }
}
