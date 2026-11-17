package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.AIb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0925AIb<K, V> extends AbstractC0935AIm {
    public final C0924AIa<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        C0924AIa<K, V> c0924AIa = this.A00;
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!c0924AIa.A07((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.A00.A06();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.A00.A06();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.A00.A07(C8j4.A15(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C0930AIh(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entryA15 = C8j4.A15(obj);
        C0924AIa<K, V> c0924AIa = this.A00;
        c0924AIa.A06();
        int iA00 = C0924AIa.A00(entryA15.getKey(), c0924AIa);
        if (iA00 < 0) {
            return false;
        }
        V[] vArr = c0924AIa.valuesArray;
        C7384Etj.A0X(vArr);
        if (!C7384Etj.areEqual(vArr[iA00], entryA15.getValue())) {
            return false;
        }
        C0924AIa.A03(c0924AIa, iA00);
        return true;
    }

    public C0925AIb(C0924AIa<K, V> c0924AIa) {
        this.A00 = c0924AIa;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw C8j3.A17();
    }

    public C0925AIb() {
    }
}
