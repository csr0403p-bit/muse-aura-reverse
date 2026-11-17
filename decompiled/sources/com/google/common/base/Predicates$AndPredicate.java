package com.google.common.base;

import X.AnonymousClass006;
import X.C3cI;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public class Predicates$AndPredicate<T> implements Predicate<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final List<? extends Predicate<? super T>> components;

    @Override // com.google.common.base.Predicate
    public boolean apply(T t) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!this.components.get(i).apply(t)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (obj instanceof Predicates$AndPredicate) {
            return this.components.equals(((Predicates$AndPredicate) obj).components);
        }
        return false;
    }

    public int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public String toString() {
        List<? extends Predicate<? super T>> list = this.components;
        StringBuilder sbA0x = C3cI.A0x("Predicates.", "and");
        sbA0x.append('(');
        boolean z = true;
        for (Predicate<? super T> predicate : list) {
            if (!z) {
                sbA0x.append(',');
            }
            sbA0x.append(predicate);
            z = false;
        }
        return AnonymousClass006.A0z(sbA0x);
    }

    public Predicates$AndPredicate(List<? extends Predicate<? super T>> components) {
        this.components = components;
    }
}
