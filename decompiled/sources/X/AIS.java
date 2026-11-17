package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final class AIS implements Collection<Object>, BOA {
    public final AIR<Object> A00;

    public /* synthetic */ AIS(AIR air, C06H c06h, int i) {
        AIR<Object> air2 = AIU.A00;
        AIR<Object> air3 = new AIR<>();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        AIR.A02(air3, 6);
        this.A00 = air3;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.A00.A05();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A04(obj);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.A01);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new AIQ(this.A00).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.A00.A08(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.A00.A09(collection);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.A00.A04(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super Object> predicate) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    public AIS() {
        AIR<Object> air = AIU.A00;
        AIR<Object> air2 = new AIR<>();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        AIR.A02(air2, 6);
        this.A00 = air2;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
