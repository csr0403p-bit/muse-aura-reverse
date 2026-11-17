package com.facebook.aura.memory;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraByteLruCache<K, V> implements AuraTrimmable {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int INITIAL_CAPACITY = 16;

    @Deprecated
    public static final float LOAD_FACTOR = 0.75f;
    public final LinkedHashMap<K, Entry<V>> entries;
    public final boolean keepNewest;
    public final Object lock;
    public final long lowRamMaxWeightBytes;
    public final int maxEntries;
    public final long maxEntryWeightBytes;
    public final long maxWeightBytes;
    public final G0V<K, V, Long> weigher;
    public long weightBytes;

    public final class Entry<V> {
        public final V value;
        public final long weightBytes;

        public final V getValue() {
            return this.value;
        }

        public final long getWeightBytes() {
            return this.weightBytes;
        }

        public Entry(V v, long j) {
            this.value = v;
            this.weightBytes = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraByteLruCache(int i, long j, long j2, boolean z, long j3, G0V<? super K, ? super V, Long> g0v) {
        C7384Etj.A0Y(g0v, 5);
        this.maxEntries = i;
        this.maxWeightBytes = j;
        this.lowRamMaxWeightBytes = j2;
        this.keepNewest = z;
        this.maxEntryWeightBytes = j3;
        this.weigher = g0v;
        this.lock = C3cG.A0T();
        this.entries = new LinkedHashMap<>(16, 0.75f, true);
        AuraMemoryPressure.INSTANCE.register(this);
    }

    public final boolean containsKey(K k) {
        boolean zContainsKey;
        C7384Etj.A0Y(k, 0);
        synchronized (this.lock) {
            zContainsKey = this.entries.containsKey(k);
        }
        return zContainsKey;
    }

    public final V get(K k) {
        V v;
        C7384Etj.A0Y(k, 0);
        synchronized (this.lock) {
            Entry<V> entry = this.entries.get(k);
            v = entry != null ? entry.value : null;
        }
        return v;
    }

    @Override // com.facebook.aura.memory.AuraTrimmable
    public void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
        C7384Etj.A0Y(auraMemoryPressureLevel, 0);
        synchronized (this.lock) {
            int iOrdinal = auraMemoryPressureLevel.ordinal();
            if (iOrdinal == 0) {
                trimToLocked(getBudgetBytes() / 2);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                trimToLocked(getBudgetBytes() / 4);
            } else {
                if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                if (this.keepNewest) {
                    trimToLocked(0L);
                } else {
                    clearLocked();
                }
            }
        }
    }

    public final V remove(K k) {
        V vRemoveLocked;
        C7384Etj.A0Y(k, 0);
        synchronized (this.lock) {
            vRemoveLocked = removeLocked(k);
        }
        return vRemoveLocked;
    }

    public final void removeIf(G0U<? super K, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        synchronized (this.lock) {
            Iterator itA0i = C3cG.A0i(this.entries);
            while (itA0i.hasNext()) {
                Object next = itA0i.next();
                C7384Etj.A0U(next);
                Map.Entry entry = (Map.Entry) next;
                Object key = entry.getKey();
                C7384Etj.A0U(key);
                if (AnonymousClass003.A1X(key, g0u)) {
                    this.weightBytes -= ((Entry) entry.getValue()).weightBytes;
                    itA0i.remove();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraMemoryPressureLevel.values().length];
            try {
                AnonymousClass002.A13(AuraMemoryPressureLevel.MODERATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraMemoryPressureLevel.BACKGROUNDED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraMemoryPressureLevel.LOW, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraMemoryPressureLevel.CRITICAL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void clearLocked() {
        this.entries.clear();
        this.weightBytes = 0L;
    }

    private final V removeLocked(K k) {
        Entry<V> entryRemove = this.entries.remove(k);
        if (entryRemove == null) {
            return null;
        }
        this.weightBytes -= entryRemove.weightBytes;
        return entryRemove.value;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    private final void trimToLocked(long j) {
        ?? r5 = this.keepNewest;
        while (true) {
            LinkedHashMap<K, Entry<V>> linkedHashMap = this.entries;
            if (linkedHashMap.size() <= r5) {
                return;
            }
            if (linkedHashMap.size() <= this.maxEntries && this.weightBytes <= j) {
                return;
            }
            Iterator itA0i = C3cG.A0i(linkedHashMap);
            if (!itA0i.hasNext()) {
                return;
            }
            this.weightBytes -= ((Entry) C3cH.A0l(itA0i).getValue()).weightBytes;
            itA0i.remove();
        }
    }

    public final void clear() {
        synchronized (this.lock) {
            this.entries.clear();
            this.weightBytes = 0L;
        }
    }

    public final void close() {
        AuraMemoryPressure.trimmables.remove(this);
        clear();
    }

    public final long getBudgetBytes() {
        return !AuraMemoryBudget.INSTANCE.isLowRamDevice() ? this.maxWeightBytes : this.lowRamMaxWeightBytes;
    }

    public final long getRetainedBytes() {
        long j;
        synchronized (this.lock) {
            j = this.weightBytes;
        }
        return j;
    }

    public final List<V> values() {
        ArrayList arrayListA0i;
        synchronized (this.lock) {
            Collection<Entry<V>> collectionValues = this.entries.values();
            C7384Etj.A0U(collectionValues);
            arrayListA0i = AnonymousClass003.A0i(collectionValues);
            Iterator<Entry<V>> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().value);
            }
        }
        return arrayListA0i;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void put(K k, V v) {
        AnonymousClass003.A0u(k, v);
        synchronized (this.lock) {
            long jA05 = C3cG.A05(this.weigher.invoke(k, v));
            if (jA05 <= this.maxEntryWeightBytes) {
                removeLocked(k);
                this.entries.put(k, new Entry<>(v, jA05));
                this.weightBytes += jA05;
                trimToLocked(getBudgetBytes());
            }
        }
    }

    public final V putIfAbsent(K k, V v) {
        AnonymousClass003.A0u(k, v);
        synchronized (this.lock) {
            Entry<V> entry = this.entries.get(k);
            if (entry != null) {
                return entry.value;
            }
            long jA05 = C3cG.A05(this.weigher.invoke(k, v));
            if (jA05 <= this.maxEntryWeightBytes) {
                this.entries.put(k, new Entry<>(v, jA05));
                this.weightBytes += jA05;
                trimToLocked(getBudgetBytes());
            }
            return v;
        }
    }

    public /* synthetic */ AuraByteLruCache(int i, long j, long j2, boolean z, long j3, G0V g0v, int i2, C06H c06h) {
        this(i, j, (i2 & 4) != 0 ? j / 2 : j2, C3cG.A1K(i2 & 8, z), (i2 & 16) != 0 ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : j3, g0v);
    }
}
