package com.google.common.base;

import X.BV7;
import X.C60O;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes5.dex */
public class Predicates$InPredicate<T> implements Predicate<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final Collection<?> target;

    @Override // com.google.common.base.Predicate
    public boolean apply(T t) {
        try {
            return this.target.contains(t);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (obj instanceof Predicates$InPredicate) {
            return this.target.equals(((Predicates$InPredicate) obj).target);
        }
        return false;
    }

    public int hashCode() {
        return this.target.hashCode();
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("Predicates.in(");
        sbA0x.append(this.target);
        return BV7.A10(sbA0x);
    }

    public Predicates$InPredicate(Collection<?> target) {
        target.getClass();
        this.target = target;
    }
}
