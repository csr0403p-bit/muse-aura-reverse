package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GDA<T> implements C20Q<T> {
    public final G0U<T, Object> A00;
    public final G0V<Object, Object, Boolean> A01;
    public final C20Q<T> A02;

    @Override // X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<? super Unit> htJ) {
        C10543Hqv c10543Hqv = new C10543Hqv();
        c10543Hqv.element = (T) HwN.A01;
        Object objCollect = this.A02.collect(new C10648I0s(this, c20z, c10543Hqv, 0), htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/20Q<+TT;>;LX/G0U<-TT;+Ljava/lang/Object;>;LX/G0V<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;>;)V */
    public GDA(G0U g0u, G0V g0v, C20Q c20q) {
        this.A02 = c20q;
        this.A00 = g0u;
        this.A01 = g0v;
    }
}
