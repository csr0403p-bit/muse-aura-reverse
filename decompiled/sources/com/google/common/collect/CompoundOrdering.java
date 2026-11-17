package com.google.common.collect;

import X.C60O;
import X.DOM;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class CompoundOrdering<T> extends DOM<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator<? super T>[] comparators;

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof CompoundOrdering) {
            return Arrays.equals(this.comparators, ((CompoundOrdering) object).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return C60O.A0r("Ordering.compound(", Arrays.toString(this.comparators));
    }

    public CompoundOrdering(Comparator<? super T> primary, Comparator<? super T> secondary2) {
        this.comparators = new Comparator[]{primary, secondary2};
    }
}
