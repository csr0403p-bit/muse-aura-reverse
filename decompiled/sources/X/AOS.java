package X;

import X.AOd;
import androidx.compose.runtime.MutableState;

/* JADX WARN: Unknown type variable: S in type: X.AOP<S> */
/* loaded from: classes4.dex */
public final class AOS<T, V extends AOd> {
    public final MutableState A00 = AbstractC1798ArH.A03();
    public final C31w<T, V> A01;
    public final /* synthetic */ AOP<S> A02;

    /* JADX WARN: Incorrect types in method signature: (LX/31w<TT;TV;>;Ljava/lang/String;)V */
    public AOS(AOP aop, C31w c31w) {
        this.A02 = aop;
        this.A01 = c31w;
    }

    /* JADX WARN: Unknown type variable: S in type: X.G0U<? super S, ? extends T> */
    /* JADX WARN: Unknown type variable: S in type: X.G0U<? super X.AOB<S>, ? extends X.AOe<T>> */
    public final C1BO<T> A00(G0U<? super AOB<S>, ? extends AOe<T>> g0u, G0U<? super S, ? extends T> g0u2) {
        MutableState mutableState = this.A00;
        AOT aot = (AOT) mutableState.getValue();
        if (aot == null) {
            AOP<S> aop = this.A02;
            AOH<S> aoh = aop.A02;
            Object objInvoke = g0u2.invoke(aoh.A09());
            C31w<T, V> c31w = this.A01;
            AOd aOdA00 = AOl.A00(c31w, g0u2.invoke(aoh.A09()));
            aOdA00.A04();
            aot = new AOT(this, new AOQ(aOdA00, aop, c31w, objInvoke), g0u, g0u2);
            mutableState.Af8(aot);
            aop.A0A.add(aot.A02);
        }
        AOP<S> aop2 = this.A02;
        aot.A00 = g0u2;
        aot.A01 = g0u;
        aot.A00(aop2.A03());
        return aot;
    }
}
