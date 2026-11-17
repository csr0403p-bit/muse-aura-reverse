package com.google.common.collect;

import X.AnonymousClass001;
import X.C60O;
import X.DOM;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ReverseOrdering<T> extends DOM<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final DOM<? super T> forwardOrder;

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) object).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public ReverseOrdering(DOM<? super T> forwardOrder) {
        this.forwardOrder = forwardOrder;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.forwardOrder);
        return AnonymousClass001.A0v(".reverse()", sbA0w);
    }
}
