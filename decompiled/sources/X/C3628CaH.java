package X;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.UltralightOptionalBridge;
import java.io.Serializable;

/* renamed from: X.CaH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3628CaH<T> extends UltralightOptionalBridge<T> implements Serializable {
    public final F08<T> mLazyInjection;

    @Override // com.google.common.base.Optional
    public final boolean equals(Object obj) {
        return (obj instanceof C3628CaH) && this.mLazyInjection == ((C3628CaH) obj).mLazyInjection;
    }

    @Override // com.google.common.base.Optional
    public final T get() {
        F08<T> f08 = this.mLazyInjection;
        if (f08 == null) {
            throw C3cG.A0Q("This binding is not present so a value cannot be returned.  Please call isPresent() before calling get()");
        }
        T tAMN = f08.AMN();
        if (tAMN != null) {
            return tAMN;
        }
        throw BV4.A0a("The nullable provider returned a null value. If you want to handle null cases yourself, call .orNull() instead of .get() or check isPresent() first, which returns false for a null value.");
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return AnonymousClass006.A0D(this.mLazyInjection);
    }

    @Override // com.google.common.base.Optional
    public final boolean isPresent() {
        F08<T> f08 = this.mLazyInjection;
        return (f08 == null || f08.AMN() == null) ? false : true;
    }

    @Override // com.google.common.base.Optional
    public final T or(Supplier<? extends T> supplier) {
        F08<T> f08 = this.mLazyInjection;
        return f08 == null ? supplier.get() : f08.AMN();
    }

    @Override // com.google.common.base.Optional
    public final T orNull() {
        F08<T> f08 = this.mLazyInjection;
        if (f08 == null) {
            return null;
        }
        return f08.AMN();
    }

    @Override // com.google.common.base.Optional
    public final String toString() {
        F08<T> f08 = this.mLazyInjection;
        return FGI.A0M("OptionalOf: ", f08 == null ? "missing binding" : f08.toString());
    }

    public C3628CaH(F08<T> f08) {
        this.mLazyInjection = f08;
    }

    @Override // com.google.common.base.Optional
    public final T or(T t) {
        F08<T> f08 = this.mLazyInjection;
        if (f08 != null) {
            return f08.AMN();
        }
        return t;
    }

    @Override // com.google.common.base.Optional
    public final Optional<T> or(Optional<? extends T> optional) {
        throw C3cG.A0Q("Or(Optional) is not supported with Ultralight Optionals");
    }
}
