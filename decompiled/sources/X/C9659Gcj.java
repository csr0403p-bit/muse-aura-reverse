package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Gcj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9659Gcj<TState> implements GRU<TState> {
    public final GRU<TState> A03;
    public final Object A01 = C3cG.A0T();
    public G0U<Object, ? extends Object> A00 = new FZI(this, 0);
    public final Function0<TState> A02 = new FZP(this, 26);
    public final G0U<G0V<? super TState, Object, ? extends TState>, Unit> A04 = new FZI(this, 1);
    public final G0U<Function0<Unit>, Function0<Unit>> A05 = new FZI(this, 2);

    @Override // X.GRU
    public final G0U<Object, Object> AEo() {
        return this instanceof C9658Gci ? ((C9658Gci) this).A00 : this.A00;
    }

    @Override // X.GRU
    public final Function0<TState> AFy() {
        if (!(this instanceof C9658Gci)) {
            return this.A02;
        }
        Function0<TState> function0 = ((C9658Gci) this).A01;
        if (function0 == null) {
            throw C3cG.A0Q("IllegalState - AtomicStateOverrideForGetState is null");
        }
        return function0;
    }

    @Override // X.GRU
    public final G0U<G0V<? super TState, Object, ? extends TState>, Unit> AJZ() {
        return this instanceof C9658Gci ? ((C9658Gci) this).A02 : this.A04;
    }

    @Override // X.GRU
    public final G0U<Function0<Unit>, Function0<Unit>> ALD() {
        return this instanceof C9658Gci ? ((C9658Gci) this).A03 : this.A05;
    }

    @Override // X.GRU
    public final void AdI(G0U<Object, ? extends Object> g0u) {
        if (this instanceof C9658Gci) {
            C7384Etj.A0Y(g0u, 0);
            ((C9658Gci) this).A00 = g0u;
        } else {
            C7384Etj.A0Y(g0u, 0);
            this.A00 = g0u;
        }
    }

    public C9659Gcj(GRU<TState> gru) {
        this.A03 = gru;
    }

    public static GRH A00(C9659Gcj c9659Gcj) {
        return (GRH) c9659Gcj.AFy().invoke();
    }
}
