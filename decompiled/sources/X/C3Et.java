package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.3Et, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Et<T> implements C20Q<T> {
    public final /* synthetic */ G0V A00;
    public final /* synthetic */ C20Q A01;

    public C3Et(G0V g0v, C20Q c20q) {
        this.A01 = c20q;
        this.A00 = g0v;
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<? super Unit> htJ) {
        Object objCollect = this.A01.collect(new C3bL(this.A00, new F1F(), c20z, 1), htJ);
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }
}
