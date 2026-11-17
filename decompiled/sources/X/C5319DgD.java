package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DgD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5319DgD<T> implements F0C<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<C5319DgD<?>, Object> A00 = AtomicReferenceFieldUpdater.newUpdater(C5319DgD.class, Object.class, "_value");
    public volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    public final Object f0final;
    public volatile Function0<? extends T> initializer;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C8j2.A00(1));
    }

    @Override // X.F0C
    public final boolean AOX() {
        return AnonymousClass006.A1Z(this._value, C5324DgI.A00);
    }

    @Override // X.F0C
    public final T getValue() {
        T tInvoke = (T) this._value;
        C5324DgI c5324DgI = C5324DgI.A00;
        if (tInvoke == c5324DgI) {
            Function0<? extends T> function0 = this.initializer;
            if (function0 != null) {
                tInvoke = function0.invoke();
                AtomicReferenceFieldUpdater<C5319DgD<?>, Object> atomicReferenceFieldUpdater = A00;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c5324DgI, tInvoke)) {
                    if (atomicReferenceFieldUpdater.get(this) != c5324DgI) {
                    }
                }
                this.initializer = null;
            }
            return (T) this._value;
        }
        return tInvoke;
    }

    public C5319DgD(Function0<? extends T> function0) {
        this.initializer = function0;
        C5324DgI c5324DgI = C5324DgI.A00;
        this._value = c5324DgI;
        this.f0final = c5324DgI;
    }

    private final Object writeReplace() {
        return new C5323DgH(getValue());
    }

    public final String toString() {
        return AOX() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
