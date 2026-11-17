package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9oX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oX implements Collection<FKC>, BOA {
    public final int[] A00;

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        int[] iArr = this.A00;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof FKC) || !BFI.A0L(iArr, ((FKC) obj).A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof FKC)) {
            return false;
        }
        return BFI.A0L(this.A00, ((FKC) obj).A00);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof C9oX) && this.A00.equals(((C9oX) obj).A00);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.length);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<FKC> iterator() {
        return new C9oH(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return C8j4.A0x("UIntArray(storage=", Arrays.toString(this.A00));
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(FKC fkc) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends FKC> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
