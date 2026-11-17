package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public final class E8g<K, V> implements E8d<K, V> {
    public final V A00;

    @Override // X.E8d
    public final E8b<K, V> AFG() {
        return null;
    }

    @Override // X.E8d
    public final int AMk() {
        return 1;
    }

    @Override // X.E8d
    public final V get() {
        return this.A00;
    }

    @Override // X.E8d
    public final boolean isActive() {
        return true;
    }

    public E8g(V referent) {
        this.A00 = referent;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TV;LX/E8b<TK;TV;>;)LX/E8d<TK;TV;>; */
    @Override // X.E8d
    public final E8d A7M(E8b queue, Object value, ReferenceQueue entry) {
        return this;
    }
}
