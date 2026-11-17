package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.UltralightOptionalBridge;

/* renamed from: X.DKk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4988DKk<T> extends UltralightOptionalBridge<T> {
    public static final long serialVersionUID = 1;
    public final Optional<T> delegate;

    @Override // com.google.common.base.Optional
    public final boolean equals(Object obj) {
        return (obj instanceof C4988DKk) && this.delegate == ((C4988DKk) obj).delegate;
    }

    @Override // com.google.common.base.Optional
    public final T get() {
        return this.delegate.get();
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return System.identityHashCode(this.delegate);
    }

    @Override // com.google.common.base.Optional
    public final boolean isPresent() {
        return this.delegate.isPresent();
    }

    @Override // com.google.common.base.Optional
    public final Optional<T> or(Optional<? extends T> optional) {
        return this.delegate.or((Optional) optional);
    }

    @Override // com.google.common.base.Optional
    public final T orNull() {
        return this.delegate.orNull();
    }

    @Override // com.google.common.base.Optional
    public final String toString() {
        return BV8.A0v(this.delegate.isPresent() ? this.delegate.get() : BrowserOperationCatalogKt.ABSENT, C60O.A0x("DelegatingOptional{"));
    }

    public C4988DKk(Optional<T> optional) {
        this.delegate = optional;
    }

    @Override // com.google.common.base.Optional
    public final T or(Supplier<? extends T> supplier) {
        return this.delegate.or((Supplier) supplier);
    }

    @Override // com.google.common.base.Optional
    public final T or(T t) {
        return this.delegate.or((Optional<T>) t);
    }
}
