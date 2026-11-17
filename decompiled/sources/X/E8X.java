package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class E8X<K, V> extends WeakReference<K> implements E8b<K, V> {
    public final int A00;
    public final E8b<K, V> A01;
    public volatile E8d<K, V> A02;

    @Override // X.E8b
    public final long ACB() {
        if (this instanceof C6487E8r) {
            return ((C6487E8r) this).A04;
        }
        if (this instanceof C6490E8u) {
            return ((C6490E8u) this).A02;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final int AGA() {
        return this.A00;
    }

    @Override // X.E8b
    public final E8b<K, V> AHy() {
        return this.A01;
    }

    @Override // X.E8b
    public final E8b<K, V> AI3() {
        if (this instanceof C6487E8r) {
            return ((C6487E8r) this).A00;
        }
        if (this instanceof C6490E8u) {
            return ((C6490E8u) this).A00;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AI4() {
        if (this instanceof C6489E8t) {
            return ((C6489E8t) this).A00;
        }
        if (this instanceof C6487E8r) {
            return ((C6487E8r) this).A01;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AIz() {
        if (this instanceof C6487E8r) {
            return ((C6487E8r) this).A02;
        }
        if (this instanceof C6490E8u) {
            return ((C6490E8u) this).A01;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8b<K, V> AJ0() {
        if (this instanceof C6489E8t) {
            return ((C6489E8t) this).A01;
        }
        if (this instanceof C6487E8r) {
            return ((C6487E8r) this).A03;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final E8d<K, V> AMU() {
        return this.A02;
    }

    @Override // X.E8b
    public final long AMt() {
        if (this instanceof C6489E8t) {
            return ((C6489E8t) this).A02;
        }
        if (this instanceof C6487E8r) {
            return ((C6487E8r) this).A05;
        }
        throw C8j3.A17();
    }

    @Override // X.E8b
    public final void Ace(long time) {
        if (this instanceof C6487E8r) {
            ((C6487E8r) this).A04 = time;
        } else {
            if (!(this instanceof C6490E8u)) {
                throw C8j3.A17();
            }
            ((C6490E8u) this).A02 = time;
        }
    }

    @Override // X.E8b
    public final void Adp(E8b<K, V> next) {
        if (this instanceof C6487E8r) {
            ((C6487E8r) this).A00 = next;
        } else {
            if (!(this instanceof C6490E8u)) {
                throw C8j3.A17();
            }
            ((C6490E8u) this).A00 = next;
        }
    }

    @Override // X.E8b
    public final void Adq(E8b<K, V> next) {
        if (this instanceof C6489E8t) {
            ((C6489E8t) this).A00 = next;
        } else {
            if (!(this instanceof C6487E8r)) {
                throw C8j3.A17();
            }
            ((C6487E8r) this).A01 = next;
        }
    }

    @Override // X.E8b
    public final void AeD(E8b<K, V> previous) {
        if (this instanceof C6487E8r) {
            ((C6487E8r) this).A02 = previous;
        } else {
            if (!(this instanceof C6490E8u)) {
                throw C8j3.A17();
            }
            ((C6490E8u) this).A01 = previous;
        }
    }

    @Override // X.E8b
    public final void AeE(E8b<K, V> previous) {
        if (this instanceof C6489E8t) {
            ((C6489E8t) this).A01 = previous;
        } else {
            if (!(this instanceof C6487E8r)) {
                throw C8j3.A17();
            }
            ((C6487E8r) this).A03 = previous;
        }
    }

    @Override // X.E8b
    public final void AfH(long time) {
        if (this instanceof C6489E8t) {
            ((C6489E8t) this).A02 = time;
        } else {
            if (!(this instanceof C6487E8r)) {
                throw C8j3.A17();
            }
            ((C6487E8r) this).A05 = time;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TK;>;TK;ILX/E8b<TK;TV;>;)V */
    public E8X(E8b e8b, Object obj, ReferenceQueue referenceQueue, int i) {
        super(obj, referenceQueue);
        this.A02 = (E8d<K, V>) E8S.A0K;
        this.A00 = i;
        this.A01 = e8b;
    }

    @Override // X.E8b
    public final void AfA(E8d<K, V> valueReference) {
        this.A02 = valueReference;
    }

    @Override // X.E8b
    public final K getKey() {
        return get();
    }
}
