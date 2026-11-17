package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Db3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5170Db3<T> extends AH7<T> {
    public final int A00;
    public final /* synthetic */ Db1<T> A01;

    public C5170Db3(Db1<T> db1) {
        this.A01 = db1;
        AtomicReferenceFieldUpdater<Db1<?>, InterfaceC5173Db6> atomicReferenceFieldUpdater = Db1.A03;
        this.A00 = db1.A00;
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00;
    }

    @Override // X.AH7, java.util.List
    public final T get(int i) {
        return (T) Db1.A00(this.A01, i);
    }
}
