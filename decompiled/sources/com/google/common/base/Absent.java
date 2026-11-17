package com.google.common.base;

import X.AnonymousClass002;
import X.C3cG;

/* loaded from: classes5.dex */
public final class Absent<T> extends Optional<T> {
    public static final Absent<Object> INSTANCE = new Absent<>();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw C3cG.A0Q("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object object) {
        return AnonymousClass002.A1Z(object, this);
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        T t = supplier.get();
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of a Supplier that returns null");
        return t;
    }

    @Override // com.google.common.base.Optional
    public T or(T defaultValue) {
        Preconditions.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return defaultValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> secondChoice) {
        secondChoice.getClass();
        return secondChoice;
    }
}
