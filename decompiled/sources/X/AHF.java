package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public abstract class AHF<E> extends AH7<E> implements AHH<E> {
    @Override // X.AH7, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // X.AHD
    public final AHD<E> AgX(int i, int i2) {
        return new AH8(this, i, i2);
    }

    @Override // X.AHH
    @Deprecated(message = "Use addingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "addingAll(elements)", imports = {}))
    public AHH<E> A3M(Collection<? extends E> collection) {
        if (C8j4.A1Z(collection)) {
            return this;
        }
        AGK<E> agkA5c = A5c();
        agkA5c.addAll(collection);
        return agkA5c.A5R();
    }

    @Override // X.AHH
    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(elements)", imports = {}))
    public final AHH<E> Aai(Collection<? extends E> collection) {
        return !C8j4.A1Z(collection) ? Aaj(C2297BSx.A00(collection, 44)) : this;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return AnonymousClass002.A1P(indexOf(obj), -1);
    }

    @Override // X.AH7, X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return listIterator();
    }
}
