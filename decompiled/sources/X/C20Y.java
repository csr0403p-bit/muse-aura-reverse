package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.20Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20Y<T> implements C20Q<T> {
    public final /* synthetic */ Object A00;

    public C20Y(Object obj) {
        this.A00 = obj;
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<? super Unit> htJ) {
        Object objEmit = c20z.emit((Object) this.A00, htJ);
        return objEmit != EnumC10460Hji.A02 ? Unit.INSTANCE : objEmit;
    }
}
