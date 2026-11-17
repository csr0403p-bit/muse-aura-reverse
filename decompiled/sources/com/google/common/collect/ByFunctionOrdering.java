package com.google.common.collect;

import X.BV7;
import X.C60O;
import X.DOM;
import com.google.common.base.Function;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ByFunctionOrdering<F, T> extends DOM<F> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Function<F, ? extends T> function;
    public final DOM<T> ordering;

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object != this) {
            if (object instanceof ByFunctionOrdering) {
                ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) object;
                if (!this.function.equals(byFunctionOrdering.function) || !this.ordering.equals(byFunctionOrdering.ordering)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.function, this.ordering);
    }

    public ByFunctionOrdering(Function<F, ? extends T> function, DOM<T> ordering) {
        this.function = function;
        this.ordering = ordering;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.ordering);
        sbA0w.append(".onResultOf(");
        sbA0w.append(this.function);
        return BV7.A10(sbA0w);
    }
}
