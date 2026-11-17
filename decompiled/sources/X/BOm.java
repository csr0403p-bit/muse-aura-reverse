package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BOm implements BQr {
    public final B8q<C2270BQi<?>> A00;
    public final Function0<Unit> A01;

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.BQr
    public final <R> Object AiS(G0U<? super Long, ? extends R> g0u, HtJ<? super R> htJ) {
        String str = GBL.__redex_internal_original_name;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        B8q<C2270BQi<?>> b8q = this.A00;
        C2270BQi c2270BQi = new C2270BQi();
        c2270BQi.A01 = gbl;
        c2270BQi.A00 = g0u;
        gbl.AO2(new C2297BSx(b8q.A00(c2270BQi, this.A01), 21));
        return gbl.A0F();
    }

    @Override // X.C78X
    public final /* synthetic */ C78I getKey() {
        return BQr.A00;
    }

    public BOm(Function0<Unit> function0) {
        this.A01 = function0;
        this.A00 = new B8q<>();
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

    public BOm() {
        this(null);
    }
}
