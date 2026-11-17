package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class BFB implements C78X, BCT, InterfaceC1490Ajx {
    public static final C067178n A01 = new C067178n();
    public final BBI A00;

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.InterfaceC1490Ajx
    public final void A4s(Object obj, Throwable th) {
        AbstractC0980ALd.A00(th, new BTB(27, this, obj));
    }

    @Override // X.BCT
    public final List A5W() {
        return this.A00.A0X();
    }

    @Override // X.BCT
    public final boolean AKo() {
        return this.A00.A0R;
    }

    @Override // X.C78X
    public final C78I<?> getKey() {
        return A01;
    }

    public BFB(BBI bbi) {
        this.A00 = bbi;
    }

    @Override // X.C78X, X.C78T
    public final /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}
