package X;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DgG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5322DgG<T> implements F0C<T>, Serializable {
    public volatile Object _value = C5324DgI.A00;
    public Function0<? extends T> initializer;
    public final Object lock;

    public static C5322DgG A00(Object obj, int i) {
        return new C5322DgG(null, new EWq(obj, i));
    }

    public static C5322DgG A01(Function0 function0) {
        return new C5322DgG(null, function0);
    }

    @Override // X.F0C
    public final boolean AOX() {
        return AnonymousClass006.A1Z(this._value, C5324DgI.A00);
    }

    @Override // X.F0C
    public final T getValue() {
        T tInvoke;
        T t = (T) this._value;
        C5324DgI c5324DgI = C5324DgI.A00;
        if (t != c5324DgI) {
            return t;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == c5324DgI) {
                Function0<? extends T> function0 = this.initializer;
                C7384Etj.A0X(function0);
                tInvoke = function0.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5322DgG(Function0<? extends T> function0, Object obj) {
        this.initializer = obj;
        this.lock = function0 == null ? (Function0<? extends T>) this : function0;
    }

    private final Object writeReplace() {
        return new C5323DgH(getValue());
    }

    public final String toString() {
        return AOX() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
