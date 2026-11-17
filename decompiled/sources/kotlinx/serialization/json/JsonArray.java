package kotlinx.serialization.json;

import X.AbstractC0878AGe;
import X.AbstractC0905AHh;
import X.BOA;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C9hr;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonArraySerializer.class)
/* loaded from: classes4.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, BOA {
    public static final Companion Companion = new Companion();
    public final List<JsonElement> A00;

    public final class Companion {
        public final C9hr<JsonArray> serializer() {
            return JsonArraySerializer.A01;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 0);
        this.A00 = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        C7384Etj.A0Y(obj, 0);
        return this.A00.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return C7384Etj.areEqual(this.A00, obj);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        C7384Etj.A0Y(obj, 0);
        return this.A00.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        C7384Etj.A0Y(obj, 0);
        return this.A00.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<JsonElement> listIterator(int i) {
        return this.A00.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public final List<JsonElement> subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public final String toString() {
        return AbstractC0878AGe.A0L(",", "[", "]", this.A00, null);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends JsonElement> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super JsonElement> comparator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final ListIterator<JsonElement> listIterator() {
        return this.A00.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
