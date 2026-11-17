package com.google.common.collect;

import X.DOM;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class ComparatorOrdering<T> extends DOM<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator<T> comparator;

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) object).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }

    public ComparatorOrdering(Comparator<T> comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }
}
