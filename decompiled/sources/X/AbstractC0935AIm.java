package X;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: X.AIm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0935AIm<E> extends AbstractSet<E> implements Set<E>, AGM {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public int A00() {
        AbstractMap abstractMap;
        if (this instanceof C0932AIj) {
            abstractMap = ((C0932AIj) this).A00;
        } else if (this instanceof AJ6) {
            abstractMap = ((AJ6) this).A00;
        } else if (this instanceof C0936AIn) {
            abstractMap = ((C0936AIn) this).A00;
        } else if (this instanceof AIp) {
            abstractMap = ((AIp) this).A00;
        } else {
            if (this instanceof C0925AIb) {
                return ((C0925AIb) this).A00.size();
            }
            abstractMap = this instanceof AJM ? ((AJM) this).A00 : ((C0939AIs) this).A00;
        }
        return abstractMap.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return A00();
    }
}
