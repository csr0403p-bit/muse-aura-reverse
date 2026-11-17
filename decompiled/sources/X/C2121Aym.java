package X;

import android.view.Choreographer;

/* renamed from: X.Aym, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2121Aym implements BQr {
    public final Choreographer A00;
    public final C2119Ayk A01;

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.BQr
    public final <R> Object AiS(G0U<? super Long, ? extends R> g0u, HtJ<? super R> htJ) {
        C2334BUi c2334BUi;
        C2119Ayk c2119Ayk = this.A01;
        String str = GBL.__redex_internal_original_name;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        ChoreographerFrameCallbackC2122Ayn choreographerFrameCallbackC2122Ayn = new ChoreographerFrameCallbackC2122Ayn(this, g0u, gbl);
        Choreographer choreographer = c2119Ayk.A05;
        Choreographer choreographer2 = this.A00;
        if (C7384Etj.areEqual(choreographer, choreographer2)) {
            synchronized (c2119Ayk.A08) {
                c2119Ayk.A01.add(choreographerFrameCallbackC2122Ayn);
                if (!c2119Ayk.A02) {
                    c2119Ayk.A02 = true;
                    choreographer.postFrameCallback(c2119Ayk.A07);
                }
            }
            c2334BUi = new C2334BUi(17, choreographerFrameCallbackC2122Ayn, c2119Ayk);
        } else {
            choreographer2.postFrameCallback(choreographerFrameCallbackC2122Ayn);
            c2334BUi = new C2334BUi(18, choreographerFrameCallbackC2122Ayn, this);
        }
        gbl.AO2(c2334BUi);
        return gbl.A0F();
    }

    @Override // X.C78X
    public final /* synthetic */ C78I getKey() {
        return BQr.A00;
    }

    public C2121Aym(Choreographer choreographer, C2119Ayk c2119Ayk) {
        this.A00 = choreographer;
        this.A01 = c2119Ayk;
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
