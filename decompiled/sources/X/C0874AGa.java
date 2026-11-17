package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: X.AGa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0874AGa implements Collection<BN1>, BOA {
    public static final C0874AGa A02 = new C0874AGa(C0881AGi.A00);
    public final int A00;
    public final List<BN1> A01;

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C0874AGa) && this.A01.equals(((C0874AGa) obj).A01));
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof BN1) {
            return this.A01.contains(obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.A01.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<BN1> iterator() {
        return this.A01.iterator();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A01, C60O.A0x("LocaleList(localeList="));
    }

    public C0874AGa(List<BN1> list) {
        this.A01 = list;
        this.A00 = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(BN1 bn1) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends BN1> collection) {
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
    public final boolean removeIf(Predicate<? super BN1> predicate) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
