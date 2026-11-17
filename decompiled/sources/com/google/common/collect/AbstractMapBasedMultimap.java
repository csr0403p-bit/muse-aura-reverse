package com.google.common.collect;

import X.AbstractC5024DOu;
import X.BV4;
import X.BV5;
import X.C5002DNf;
import X.C5003DNg;
import X.C60O;
import X.DNa;
import X.DNk;
import X.DNl;
import X.DNm;
import X.DPV;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public abstract class AbstractMapBasedMultimap<K, V> extends AbstractC5024DOu<K, V> implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map<K, Collection<V>> A01;

    public final Collection<V> A00() {
        return this instanceof TreeMultimap ? new TreeSet(((TreeMultimap) this).A01) : this instanceof LinkedHashMultimap ? new CompactLinkedHashSet(((LinkedHashMultimap) this).A00) : this instanceof HashMultimap ? new CompactHashSet(((HashMultimap) this).A00) : this instanceof Multimaps$CustomListMultimap ? ((Multimaps$CustomListMultimap) this).A00.get() : C60O.A11(((ArrayListMultimap) this).A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.common.collect.AbstractMapBasedMultimap] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Collection<V> A01(K k) {
        ?? r2;
        if (this instanceof TreeMultimap) {
            TreeMultimap treeMultimap = (TreeMultimap) this;
            r2 = treeMultimap;
            if (k == null) {
                treeMultimap.A00.compare(k, k);
                r2 = treeMultimap;
            }
        } else {
            boolean z = this instanceof LinkedHashMultimap;
            this = this;
            if (z) {
                LinkedHashMultimap linkedHashMultimap = (LinkedHashMultimap) this;
                return new DPV(linkedHashMultimap, k, linkedHashMultimap.A00);
            }
        }
        return r2.A00();
    }

    public final Collection<V> A02(K key, Collection<V> collection) {
        if (this instanceof AbstractSetMultimap) {
            AbstractSetMultimap abstractSetMultimap = (AbstractSetMultimap) this;
            return abstractSetMultimap instanceof AbstractSortedSetMultimap ? collection instanceof NavigableSet ? new C5002DNf(null, abstractSetMultimap, key, (NavigableSet) collection) : new C5003DNg(null, abstractSetMultimap, key, (SortedSet) collection) : new DNl(abstractSetMultimap, key, (Set) collection);
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new DNm(null, this, key, list) : new DNk(null, this, key, list);
    }

    public final <E> Collection<E> A03(Collection<E> collection) {
        return this instanceof AbstractSetMultimap ? ((AbstractSetMultimap) this) instanceof AbstractSortedSetMultimap ? collection instanceof NavigableSet ? DNa.A01((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection) : Collections.unmodifiableList((List) collection);
    }

    public final void A04(Map<K, Collection<V>> map) {
        this.A01 = map;
        this.A00 = 0;
        Iterator itA10 = BV5.A10(map);
        while (itA10.hasNext()) {
            Collection collection = (Collection) itA10.next();
            Preconditions.checkArgument(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    @Override // X.InterfaceC5023DOs
    public Collection<V> AC1(K key) {
        Collection<V> collectionA01 = this.A01.get(key);
        if (collectionA01 == null) {
            collectionA01 = A01(key);
        }
        return A02(key, collectionA01);
    }

    /* JADX WARN: Incorrect return type in method signature: (TK;TV;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC5023DOs
    public final void AYl(Object key, Object value) {
        Collection<V> collection = this.A01.get(key);
        if (collection != null) {
            if (collection.add(value)) {
                this.A00++;
            }
        } else {
            Collection<V> collectionA01 = A01(key);
            if (!collectionA01.add(value)) {
                throw BV4.A0N("New Collection violated the Collection spec");
            }
            this.A00++;
            this.A01.put(key, collectionA01);
        }
    }

    @Override // X.InterfaceC5023DOs
    public Collection<V> Aah(Object obj) {
        Collection<V> collectionRemove = this.A01.remove(obj);
        if (collectionRemove != null) {
            Collection collectionA00 = A00();
            collectionA00.addAll(collectionRemove);
            this.A00 -= collectionRemove.size();
            collectionRemove.clear();
            return (Collection<V>) A03(collectionA00);
        }
        if (!(this instanceof AbstractSetMultimap)) {
            return Collections.EMPTY_LIST;
        }
        AbstractSetMultimap abstractSetMultimap = (AbstractSetMultimap) this;
        if (!(abstractSetMultimap instanceof AbstractSortedSetMultimap)) {
            return Collections.EMPTY_SET;
        }
        TreeSet treeSet = new TreeSet(((TreeMultimap) ((AbstractSortedSetMultimap) abstractSetMultimap)).A01);
        return treeSet instanceof NavigableSet ? DNa.A01(treeSet) : Collections.unmodifiableSortedSet(treeSet);
    }

    @Override // X.InterfaceC5023DOs
    public void clear() {
        Iterator itA10 = BV5.A10(this.A01);
        while (itA10.hasNext()) {
            ((Collection) itA10.next()).clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    @Override // X.InterfaceC5023DOs
    public final boolean containsKey(Object key) {
        return this.A01.containsKey(key);
    }

    @Override // X.InterfaceC5023DOs
    public final int size() {
        return this.A00;
    }
}
