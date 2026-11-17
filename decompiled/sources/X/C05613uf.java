package X;

import kotlin.Unit;

/* renamed from: X.3uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C05613uf<T> implements C20Z<T> {
    public final HxO<T> A00;

    @Override // X.C20Z
    public final Object emit(T t, HtJ<? super Unit> htJ) {
        Object objAcU = this.A00.AcU(t, htJ);
        return objAcU != EnumC10460Hji.A02 ? Unit.INSTANCE : objAcU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C05613uf(HxO<? super T> hxO) {
        this.A00 = hxO;
    }
}
