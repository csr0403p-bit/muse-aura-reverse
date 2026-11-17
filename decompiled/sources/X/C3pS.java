package X;

import kotlin.Unit;

/* renamed from: X.3pS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3pS<T, R> extends C3ud<T, R> {
    public final G0W<C20Z<? super R>, T, HtJ<? super Unit>, Object> A00;

    @Override // X.C3ud
    public final Object A04(C20Z<? super R> c20z, HtJ<? super Unit> htJ) {
        Object objA00 = Hxb.A00(new C60F(this, c20z, null, 2), htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    @Override // X.AbstractC05583ub
    public final AbstractC05583ub A03(Integer num, C78T c78t, int i) {
        return new C3pS(num, c78t, this.A00, ((C3ud) this).A00, i);
    }

    public C3pS(Integer num, C78T c78t, G0W g0w, C20Q c20q, int i) {
        super(num, c78t, c20q, i);
        this.A00 = g0w;
    }
}
