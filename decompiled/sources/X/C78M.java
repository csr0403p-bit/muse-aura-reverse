package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.78M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78M implements BQr {
    public int A00;
    public long A01;
    public Hm1<? super Unit> A02;
    public final BOm A03;
    public final Object A04;
    public final Function0<Long> A05;
    public final C3UX A06;

    public /* synthetic */ C78M(C3UX c3ux) {
        C8i2 c8i2 = new C8i2(8);
        this.A06 = c3ux;
        this.A05 = c8i2;
        this.A03 = new BOm(new C8i4(this, 3));
        this.A04 = C3cG.A0T();
        this.A00 = 5;
    }

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    public final void A00() {
        synchronized (this.A04) {
            Hm1<? super Unit> hm1 = this.A02;
            if (hm1 != null) {
                hm1.A5x(null);
            }
        }
    }

    @Override // X.BQr
    public final <R> Object AiS(G0U<? super Long, ? extends R> g0u, HtJ<? super R> htJ) {
        return this.A03.AiS(g0u, htJ);
    }

    @Override // X.C78X
    public final /* synthetic */ C78I getKey() {
        return BQr.A00;
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
