package X;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AIY<E> extends AbstractC0935AIm<E> implements Set<E>, Serializable, AGM {
    public static final AIY A00 = new AIY(C0924AIa.A00);
    public final C0924AIa<E, ?> backing;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 0);
        this.backing.A06();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.backing.A06();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.backing.A06();
        return super.retainAll(collection);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.backing.isReadOnly) {
            return new C0866A6n(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // X.AbstractC0935AIm
    public final int A00() {
        return this.backing.size();
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        return C8j3.A1Q(this.backing.A05(e));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C0929AIg(this.backing);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0924AIa<E, ?> c0924AIa = this.backing;
        c0924AIa.A06();
        int iA00 = C0924AIa.A00(obj, c0924AIa);
        if (iA00 < 0) {
            return false;
        }
        C0924AIa.A03(c0924AIa, iA00);
        return true;
    }

    public AIY(C0924AIa<E, ?> c0924AIa) {
        this.backing = c0924AIa;
    }

    public AIY() {
        this(C3cG.A0u());
    }
}
