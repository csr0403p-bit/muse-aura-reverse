package com.google.common.collect;

import X.DOM;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class NaturalOrdering extends DOM<Comparable<?>> implements Serializable {
    public static final NaturalOrdering A00 = new NaturalOrdering();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return A00;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
