package com.google.common.base;

import X.BV6;
import X.BV7;
import X.C60O;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class Predicates$CompositionPredicate<A, B> implements Predicate<A>, Serializable {
    public static final long serialVersionUID = 0;
    public final Function<A, ? extends B> f;
    public final Predicate<B> p;

    @Override // com.google.common.base.Predicate
    public boolean apply(A a) {
        return this.p.apply(this.f.apply(a));
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (!(obj instanceof Predicates$CompositionPredicate)) {
            return false;
        }
        Predicates$CompositionPredicate predicates$CompositionPredicate = (Predicates$CompositionPredicate) obj;
        return this.f.equals(predicates$CompositionPredicate.f) && this.p.equals(predicates$CompositionPredicate.p);
    }

    public int hashCode() {
        return BV6.A09(this.p, this.f.hashCode());
    }

    public Predicates$CompositionPredicate(Predicate<B> p, Function<A, ? extends B> f) {
        this.p = p;
        this.f = f;
    }

    public String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.p);
        sbA0w.append("(");
        sbA0w.append(this.f);
        return BV7.A10(sbA0w);
    }
}
