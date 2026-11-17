package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DgE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5320DgE<T> implements F0C<T>, Serializable {
    public Object _value;
    public Function0<? extends T> initializer;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C8j2.A00(1));
    }

    @Override // X.F0C
    public final boolean AOX() {
        return AnonymousClass006.A1Z(this._value, C5324DgI.A00);
    }

    @Override // X.F0C
    public final T getValue() {
        T t = (T) this._value;
        if (t != C5324DgI.A00) {
            return t;
        }
        Function0<? extends T> function0 = this.initializer;
        C7384Etj.A0X(function0);
        T tInvoke = function0.invoke();
        this._value = tInvoke;
        this.initializer = null;
        return tInvoke;
    }

    private final Object writeReplace() {
        return new C5323DgH(getValue());
    }

    public final String toString() {
        return AOX() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
