package com.google.common.base;

import X.BV7;
import X.C60O;

/* loaded from: classes5.dex */
public final class Present<T> extends Optional<T> {
    public static final long serialVersionUID = 0;
    public final T reference;

    @Override // com.google.common.base.Optional
    public boolean equals(Object object) {
        if (object instanceof Present) {
            return this.reference.equals(((Present) object).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        StringBuilder sbA0x = C60O.A0x("Optional.of(");
        sbA0x.append(this.reference);
        return BV7.A10(sbA0x);
    }

    public Present(T reference) {
        this.reference = reference;
    }

    @Override // com.google.common.base.Optional
    public T or(T defaultValue) {
        Preconditions.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        supplier.getClass();
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> secondChoice) {
        secondChoice.getClass();
        return this;
    }
}
