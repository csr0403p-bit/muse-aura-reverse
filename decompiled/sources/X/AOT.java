package X;

import X.AOd;

/* JADX WARN: Unknown type variable: S in type: X.G0U<? super S, ? extends T> */
/* JADX WARN: Unknown type variable: S in type: X.G0U<? super X.AOB<S>, ? extends X.AOe<T>> */
/* loaded from: classes4.dex */
public final class AOT<T, V extends AOd> implements C1BO<T> {
    public G0U<? super S, ? extends T> A00;
    public G0U<? super AOB<S>, ? extends AOe<T>> A01;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<TS;>.TransitionAnimationState<TT;TV;>; */
    public final AOQ A02;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<TS;>.DeferredAnimation<TT;TV;>; */
    public final /* synthetic */ AOS A03;

    /* JADX WARN: Incorrect inner types in method signature: (LX/AOP<TS;>.TransitionAnimationState<TT;TV;>;LX/G0U<-LX/AOB<TS;>;+LX/AOe<TT;>;>;LX/G0U<-TS;+TT;>;)V */
    public AOT(AOS aos, AOQ aoq, G0U g0u, G0U g0u2) {
        this.A03 = aos;
        this.A02 = aoq;
        this.A01 = g0u;
        this.A00 = g0u2;
    }

    /* JADX WARN: Unknown type variable: S in type: X.AOB<S> */
    public final void A00(AOB<S> aob) {
        Object objInvoke = this.A00.invoke(aob.ALW());
        if (!this.A03.A02.A0G()) {
            this.A02.A03((AOe) this.A01.invoke(aob), objInvoke);
        } else {
            this.A02.A04((AOe) this.A01.invoke(aob), this.A00.invoke(aob.AGR()), objInvoke);
        }
    }

    @Override // X.C1BO
    public final T getValue() {
        A00(this.A03.A02.A03());
        return (T) this.A02.A0D.getValue();
    }
}
