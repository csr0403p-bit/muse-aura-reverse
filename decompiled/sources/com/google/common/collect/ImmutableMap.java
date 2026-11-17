package com.google.common.collect;

import X.AbstractC3830CfJ;
import X.AbstractC7489Ext;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV7;
import X.BV8;
import X.C3cH;
import X.C8j3;
import X.DKL;
import X.DMu;
import X.DN7;
import X.DNa;
import X.DOJ;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSortedMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes5.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public static final long serialVersionUID = 912559;
    public transient ImmutableSet<Map.Entry<K, V>> entrySet;
    public transient ImmutableSet<K> keySet;
    public transient ImmutableCollection<V> values;

    public class Builder<K, V> {
        public Object[] alternatingKeysAndValues;
        public DKL duplicateKey;
        public boolean entriesUsed;
        public int size;

        public ImmutableMap<K, V> buildOrThrow() {
            RegularImmutableMap regularImmutableMap;
            DKL dkl = this.duplicateKey;
            if (dkl == null) {
                int iA0F = this.size;
                Object[] objArrCopyOf = this.alternatingKeysAndValues;
                this.entriesUsed = true;
                if (iA0F == 0) {
                    regularImmutableMap = (ImmutableMap<K, V>) RegularImmutableMap.A03;
                } else if (iA0F == 1) {
                    BV7.A1O(objArrCopyOf);
                    regularImmutableMap = new RegularImmutableMap(null, objArrCopyOf, 1);
                } else {
                    Preconditions.checkPositionIndex(iA0F, objArrCopyOf.length >> 1);
                    Object objA01 = RegularImmutableMap.A01(objArrCopyOf, iA0F, ImmutableSet.A00(iA0F), 0);
                    if (objA01 instanceof Object[]) {
                        Object[] objArr = (Object[]) objA01;
                        this.duplicateKey = (DKL) objArr[2];
                        Object obj = objArr[0];
                        iA0F = AnonymousClass001.A0F(objArr[1]);
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iA0F * 2);
                        objA01 = obj;
                    }
                    regularImmutableMap = new RegularImmutableMap(objA01, objArrCopyOf, iA0F);
                }
                dkl = this.duplicateKey;
                if (dkl == null) {
                    return regularImmutableMap;
                }
            }
            throw dkl.A00();
        }

        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            int size;
            Object[] objArr;
            int length;
            if ((entries instanceof Collection) && (size = (this.size + ((Collection) entries).size()) * 2) > (length = (objArr = this.alternatingKeysAndValues).length)) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, DOJ.A02(length, size));
                this.entriesUsed = false;
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                put(C3cH.A0l(it));
            }
            return this;
        }

        public Builder(int initialCapacity) {
            this.alternatingKeysAndValues = new Object[initialCapacity * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        /* renamed from: build */
        public ImmutableMap<K, V> buildOrThrow() {
            return buildOrThrow();
        }

        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            put(entry.getKey(), entry.getValue());
            return this;
        }

        public Builder() {
            this(4);
        }

        public Builder<K, V> put(K key, V value) {
            int i = (this.size + 1) * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            int length = objArr.length;
            if (i > length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, DOJ.A02(length, i));
                this.entriesUsed = false;
            }
            AbstractC3830CfJ.A01(key, value);
            Object[] objArr2 = this.alternatingKeysAndValues;
            int i2 = this.size;
            int i3 = i2 * 2;
            objArr2[i3] = key;
            objArr2[i3 + 1] = value;
            this.size = i2 + 1;
            return this;
        }
    }

    public class SerializedForm<K, V> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object keys;
        public final Object values;

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Builder dn7;
            Object obj = this.keys;
            if (obj instanceof ImmutableSet) {
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                ImmutableCollection immutableCollection2 = (ImmutableCollection) this.values;
                int size = immutableCollection.size();
                dn7 = this instanceof ImmutableSortedMap.SerializedForm ? new DN7(((ImmutableSortedMap.SerializedForm) this).comparator) : this instanceof ImmutableBiMap.SerializedForm ? new DMu(size) : new Builder(size);
                AbstractC7489Ext it = immutableCollection.iterator();
                AbstractC7489Ext it2 = immutableCollection2.iterator();
                while (it.hasNext()) {
                    dn7.put(it.next(), it2.next());
                }
            } else {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) this.values;
                int length = objArr.length;
                dn7 = this instanceof ImmutableSortedMap.SerializedForm ? new DN7(((ImmutableSortedMap.SerializedForm) this).comparator) : this instanceof ImmutableBiMap.SerializedForm ? new DMu(length) : new Builder(length);
                for (int i = 0; i < objArr.length; i++) {
                    dn7.put(objArr[i], objArr2[i]);
                }
            }
            return dn7.buildOrThrow();
        }

        public SerializedForm(ImmutableMap<K, V> map) {
            Object[] objArr = new Object[map.size()];
            Object[] objArr2 = new Object[map.size()];
            Iterator it = BV8.A0h(map).iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                objArr[i] = entryA0l.getKey();
                objArr2[i] = entryA0l.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public abstract V get(Object key);

    public abstract boolean isPartialView();

    public abstract Object writeReplace();

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        Builder builder = new Builder(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        builder.putAll(setEntrySet);
        return builder.buildOrThrow();
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.A03;
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Map) {
            return entrySet().equals(((Map) object).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    @Override // java.util.Map
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return AnonymousClass002.A1X(get(key));
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return BV8.A0h(this);
    }

    @Override // java.util.Map
    public final V getOrDefault(Object key, V defaultValue) {
        V v = get(key);
        return v != null ? v : defaultValue;
    }

    @Override // java.util.Map
    public int hashCode() {
        return DNa.A00(BV8.A0h(this));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object o) {
        throw C8j3.A17();
    }

    public String toString() {
        int size = size();
        AbstractC3830CfJ.A00(size, "size");
        StringBuilder sbA11 = BV8.A11(size);
        Iterator it = entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            if (!z) {
                C8j3.A1K(sbA11);
            }
            BV8.A1R(sbA11, entryA0l);
            z = false;
        }
        return C8j3.A15(sbA11);
    }
}
