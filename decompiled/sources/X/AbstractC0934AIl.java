package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;

/* renamed from: X.AIl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0934AIl<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC0884AGl {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        AbstractMap abstractMap;
        if (this instanceof C0933AIk) {
            abstractMap = ((C0933AIk) this).A00;
        } else if (this instanceof AJA) {
            abstractMap = ((AJA) this).A00;
        } else {
            if (this instanceof C0926AIc) {
                return ((C0926AIc) this).A00.size();
            }
            abstractMap = ((AJN) this).A00;
        }
        return abstractMap.size();
    }
}
