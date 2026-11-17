package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Optional<T> implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object object);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> secondChoice);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T defaultValue);

    public abstract T orNull();

    public abstract String toString();

    public static <T> Optional<T> absent() {
        return Absent.INSTANCE;
    }

    public static <T> Optional<T> of(T reference) {
        reference.getClass();
        return new Present(reference);
    }
}
