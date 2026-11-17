package X;

import kotlin.Unit;

/* renamed from: X.3pT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3pT<T> extends C3ud<T, T> {
    @Override // X.AbstractC05583ub
    public final C20Q<T> A02() {
        return (C20Q<T>) ((C3ud) this).A00;
    }

    @Override // X.C3ud
    public final Object A04(C20Z<? super T> c20z, HtJ<? super Unit> htJ) {
        return C3cG.A0U(((C3ud) this).A00.collect(c20z, htJ));
    }
}
