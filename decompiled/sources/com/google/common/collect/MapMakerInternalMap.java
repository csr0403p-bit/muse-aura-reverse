package com.google.common.collect;

import X.AbstractConcurrentMapC5042DQj;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV8;
import X.C3cH;
import X.C5079DUu;
import X.C5080DUv;
import X.DR2;
import X.DR5;
import X.DUV;
import X.DUY;
import X.DUZ;
import X.DUa;
import X.DUb;
import X.DUc;
import X.DV1;
import X.DV2;
import X.DX6;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.Segment;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class MapMakerInternalMap<K, V, E extends DUZ<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final DUc A07 = new DUa();
    public static final long serialVersionUID = 5;
    public transient Collection<V> A00;
    public transient Set<Map.Entry<K, V>> A01;
    public transient Set<K> A02;
    public final transient int A03;
    public final transient int A04;
    public final transient DUY<K, V, E, S> A05;
    public final transient Segment<K, V, E, S>[] A06;
    public final int concurrencyLevel;
    public final Equivalence<Object> keyEquivalence;

    public abstract class Segment<K, V, E extends DUZ<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public volatile int count;
        public final MapMakerInternalMap<K, V, E, S> map;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        public volatile AtomicReferenceArray<E> table;
        public int threshold;

        private final void A07(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                DUZ duz = (DUZ) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.map;
                int iAGA = duz.AGA();
                Segment segmentA0i = BV8.A0i(mapMakerInternalMap, iAGA);
                segmentA0i.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segmentA0i.table;
                    int length = iAGA & (atomicReferenceArray.length() - 1);
                    DUZ duz2 = (DUZ) atomicReferenceArray.get(length);
                    DUZ duzAHz = duz2;
                    while (true) {
                        if (duzAHz == null) {
                            break;
                        }
                        if (duzAHz == duz) {
                            segmentA0i.modCount++;
                            DUZ duzA00 = A00(duz2, duzAHz, segmentA0i);
                            int i2 = segmentA0i.count - 1;
                            atomicReferenceArray.set(length, duzA00);
                            segmentA0i.count = i2;
                            break;
                        }
                        duzAHz = duzAHz.AHz();
                    }
                    segmentA0i.unlock();
                    i++;
                } catch (Throwable th) {
                    segmentA0i.unlock();
                    throw th;
                }
            } while (i != 16);
        }

        public static final DUZ A00(DUZ duz, DUZ duz2, Segment segment) {
            int i = segment.count;
            DUZ duzAHz = duz2.AHz();
            while (duz != duz2) {
                DUZ duzA7K = segment.map.A05.A7K(duz, duzAHz, segment);
                if (duzA7K != null) {
                    duzAHz = duzA7K;
                } else {
                    i--;
                }
                duz = duz.AHz();
            }
            segment.count = i;
            return duzAHz;
        }

        public static final DUZ A01(Segment segment, Object obj, int i) {
            if (segment.count == 0) {
                return null;
            }
            for (E eAHz = segment.table.get((r1.length() - 1) & i); eAHz != null; eAHz = eAHz.AHz()) {
                if (eAHz.AGA() == i) {
                    Object key = eAHz.getKey();
                    if (key == null) {
                        A03(segment);
                    } else if (segment.map.keyEquivalence.equivalent(obj, key)) {
                        return eAHz;
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void A05() {
            ReferenceQueue<V> referenceQueue;
            StrongKeyWeakValueSegment strongKeyWeakValueSegment;
            if (this instanceof WeakKeyWeakValueSegment) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) this;
                weakKeyWeakValueSegment.A07(weakKeyWeakValueSegment.queueForKeys);
                referenceQueue = weakKeyWeakValueSegment.queueForValues;
                strongKeyWeakValueSegment = weakKeyWeakValueSegment;
            } else if (this instanceof WeakKeyStrongValueSegment) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) this;
                weakKeyStrongValueSegment.A07(weakKeyStrongValueSegment.queueForKeys);
                return;
            } else {
                if (!(this instanceof StrongKeyWeakValueSegment)) {
                    return;
                }
                StrongKeyWeakValueSegment strongKeyWeakValueSegment2 = (StrongKeyWeakValueSegment) this;
                referenceQueue = strongKeyWeakValueSegment2.queueForValues;
                strongKeyWeakValueSegment = strongKeyWeakValueSegment2;
            }
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                DUc<K, V, E> dUc = (DUc) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = strongKeyWeakValueSegment.map;
                DUZ duzAFH = dUc.AFH();
                int iAGA = duzAFH.AGA();
                Segment segmentA0i = BV8.A0i(mapMakerInternalMap, iAGA);
                Object key = duzAFH.getKey();
                segmentA0i.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segmentA0i.table;
                    int length = (atomicReferenceArray.length() - 1) & iAGA;
                    DUZ duz = (DUZ) atomicReferenceArray.get(length);
                    DUZ duzAHz = duz;
                    while (true) {
                        if (duzAHz == null) {
                            break;
                        }
                        Object key2 = duzAHz.getKey();
                        if (duzAHz.AGA() != iAGA || key2 == null || !segmentA0i.map.keyEquivalence.equivalent(key, key2)) {
                            duzAHz = duzAHz.AHz();
                        } else if (((DUb) duzAHz).AMV() == dUc) {
                            segmentA0i.modCount++;
                            DUZ duzA00 = A00(duz, duzAHz, segmentA0i);
                            int i2 = segmentA0i.count - 1;
                            atomicReferenceArray.set(length, duzA00);
                            segmentA0i.count = i2;
                        }
                    }
                    segmentA0i.unlock();
                    i++;
                } catch (Throwable th) {
                    segmentA0i.unlock();
                    throw th;
                }
            } while (i != 16);
        }

        public final void A06() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                A02(this);
            }
        }

        public Segment(MapMakerInternalMap<K, V, E, S> map, int initialCapacity) {
            this.map = map;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(initialCapacity);
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public static final void A02(Segment segment) {
            if (segment.tryLock()) {
                try {
                    segment.A05();
                    segment.readCount.set(0);
                } finally {
                    segment.unlock();
                }
            }
        }

        public static final void A03(Segment segment) {
            if (segment.tryLock()) {
                try {
                    segment.A05();
                } finally {
                    segment.unlock();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
        
            return null;
         */
        /* JADX WARN: Incorrect types in method signature: (TK;ITV;Z)TV; */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A04(java.lang.Object r12, java.lang.Object r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.A04(java.lang.Object, java.lang.Object, int, boolean):java.lang.Object");
        }
    }

    public final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        public static final long serialVersionUID = 3;

        private Object readResolve() {
            return this.A00;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void readObject(java.io.ObjectInputStream r9) throws java.lang.ClassNotFoundException, java.io.IOException {
            /*
                r8 = this;
                r9.defaultReadObject()
                int r7 = r9.readInt()
                r0 = 1
                if (r7 >= 0) goto Lb
                r0 = 0
            Lb:
                com.google.common.base.Preconditions.checkArgument(r0)
                com.google.common.collect.MapMakerInternalMap$Strength r5 = r8.keyStrength
                r5.getClass()
                com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.A01
                com.google.common.collect.MapMakerInternalMap$Strength r1 = r8.valueStrength
                r1.getClass()
                com.google.common.base.Equivalence<java.lang.Object> r3 = r8.keyEquivalence
                r3.getClass()
                int r6 = r8.concurrencyLevel
                r0 = 1
                if (r6 > 0) goto L25
                r0 = 0
            L25:
                com.google.common.base.Preconditions.checkArgument(r0)
                if (r5 != r2) goto L4d
                if (r1 != r2) goto L46
                X.DUk<?, ?> r4 = X.C5073DUk.A00
            L2e:
                com.google.common.collect.MapMakerInternalMap r2 = new com.google.common.collect.MapMakerInternalMap
                r2.<init>(r3, r4, r5, r6, r7)
                r8.A00 = r2
            L35:
                java.lang.Object r2 = r9.readObject()
                if (r2 != 0) goto L3c
                return
            L3c:
                java.lang.Object r1 = r9.readObject()
                java.util.concurrent.ConcurrentMap<K, V> r0 = r8.A00
                r0.put(r2, r1)
                goto L35
            L46:
                com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.A02
                if (r1 != r0) goto L4d
                X.DUi<?, ?> r4 = X.DUi.A00
                goto L2e
            L4d:
                com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.A02
                if (r5 != r0) goto L5b
                if (r1 != r2) goto L56
                X.DUn<?, ?> r4 = X.C5074DUn.A00
                goto L2e
            L56:
                if (r1 != r0) goto L5b
                X.DUj<?, ?> r4 = X.DUj.A00
                goto L2e
            L5b:
                java.lang.AssertionError r0 = X.BV6.A0f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.SerializationProxy.readObject(java.io.ObjectInputStream):void");
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            out.writeInt(this.A00.size());
            Iterator itA0n = AnonymousClass002.A0n(this.A00);
            while (itA0n.hasNext()) {
                BV8.A1J(out, itA0n);
            }
            out.writeObject(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public abstract class Strength {
        public static final /* synthetic */ Strength[] A00;
        public static final Strength A01;
        public static final Strength A02;

        static {
            Strength strength = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            };
            A01 = strength;
            Strength strength2 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
                @Override // com.google.common.collect.MapMakerInternalMap.Strength
                public final Equivalence<Object> A00() {
                    return Equivalence.Identity.INSTANCE;
                }
            };
            A02 = strength2;
            A00 = new Strength[]{strength, strength2};
        }

        public static Strength valueOf(String name) {
            return (Strength) Enum.valueOf(Strength.class, name);
        }

        public static Strength[] values() {
            return (Strength[]) A00.clone();
        }

        public Equivalence<Object> A00() {
            return Equivalence.Equals.INSTANCE;
        }

        public Strength(String $enum$name, int $enum$ordinal) {
        }
    }

    public final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, DV2<K, V>, StrongKeyStrongValueSegment<K, V>> {
    }

    public Object writeReplace() {
        DUY<K, V, E, S> duy = this.A05;
        return new SerializationProxy(this.keyEquivalence, duy.AiG().A00(), duy.APS(), duy.AiG(), this, this.concurrencyLevel);
    }

    public abstract class AbstractSerializationProxy<K, V> extends AbstractConcurrentMapC5042DQj<K, V> implements Serializable {
        public static final long serialVersionUID = 3;
        public transient ConcurrentMap<K, V> A00;
        public final int concurrencyLevel;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;

        /* JADX WARN: Incorrect types in method signature: (Lcom/google/common/collect/MapMakerInternalMap$Strength;Lcom/google/common/collect/MapMakerInternalMap$Strength;Lcom/google/common/base/Equivalence<Ljava/lang/Object;>;Lcom/google/common/base/Equivalence<Ljava/lang/Object;>;ILjava/util/concurrent/ConcurrentMap<TK;TV;>;)V */
        public AbstractSerializationProxy(Equivalence keyStrength, Equivalence valueStrength, Strength keyEquivalence, Strength valueEquivalence, ConcurrentMap concurrencyLevel, int delegate) {
            this.keyStrength = keyEquivalence;
            this.valueStrength = valueEquivalence;
            this.keyEquivalence = keyStrength;
            this.valueEquivalence = valueStrength;
            this.concurrencyLevel = delegate;
            this.A00 = concurrencyLevel;
        }
    }

    public final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C5080DUv<K, V>, StrongKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, C5080DUv<K, V>, StrongKeyWeakValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForValues = new ReferenceQueue<>();
        }
    }

    public final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, DV1<K, V>, WeakKeyStrongValueSegment<K, V>> {
        public final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, DV1<K, V>, WeakKeyStrongValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new ReferenceQueue<>();
        }
    }

    public final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C5079DUu<K, V>, WeakKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue<K> queueForKeys;
        public final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, C5079DUu<K, V>, WeakKeyWeakValueSegment<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }
    }

    private final int A00(Object key) {
        int iDoHash = this.keyEquivalence.doHash(key);
        int i = iDoHash + ((iDoHash << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ReferenceQueue referenceQueue;
        Segment<K, V, E, S>[] segmentArr = this.A06;
        int length = segmentArr.length;
        for (int i = 0; i < length; i++) {
            Segment<K, V, E, S> segment = segmentArr[i];
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    if (segment instanceof WeakKeyWeakValueSegment) {
                        referenceQueue = ((WeakKeyWeakValueSegment) segment).queueForKeys;
                    } else if (segment instanceof WeakKeyStrongValueSegment) {
                        referenceQueue = ((WeakKeyStrongValueSegment) segment).queueForKeys;
                    } else {
                        if (segment instanceof StrongKeyWeakValueSegment) {
                            referenceQueue = ((StrongKeyWeakValueSegment) segment).queueForValues;
                        }
                        segment.readCount.set(0);
                        segment.modCount++;
                        segment.count = 0;
                    }
                    while (referenceQueue.poll() != null) {
                    }
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        DUZ duzA01;
        if (key == null) {
            return false;
        }
        int iA00 = A00(key);
        Segment segmentA0i = BV8.A0i(this, iA00);
        try {
            boolean z = false;
            if (segmentA0i.count != 0 && (duzA01 = Segment.A01(segmentA0i, key, iA00)) != null) {
                if (duzA01.getValue() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            segmentA0i.A06();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        Object value2;
        if (value == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.A06;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (Segment<K, V, E, S> segment : segmentArr) {
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    for (E eAHz = atomicReferenceArray.get(i2); eAHz != null; eAHz = eAHz.AHz()) {
                        if (eAHz.getKey() == null || (value2 = eAHz.getValue()) == null) {
                            Segment.A03(segment);
                        } else if (this.A05.AiG().A00().equivalent(value, value2)) {
                            return true;
                        }
                    }
                }
                j2 += segment.modCount;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        } while (i < 3);
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A01;
        if (set != null) {
            return set;
        }
        DUV duv = new DUV(this);
        this.A01 = duv;
        return duv;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA00 = A00(obj);
        Segment segmentA0i = BV8.A0i(this, iA00);
        try {
            DUZ duzA01 = Segment.A01(segmentA0i, obj, iA00);
            if (duzA01 == null) {
                return null;
            }
            V v = (V) duzA01.getValue();
            if (v == null) {
                Segment.A03(segmentA0i);
            }
            return v;
        } finally {
            segmentA0i.A06();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.A06;
        long j = 0;
        int i = 0;
        while (true) {
            int length = segmentArr.length;
            if (i >= length) {
                if (j != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (segmentArr[i2].count != 0) {
                                break;
                            }
                            j -= segmentArr[i2].modCount;
                            i2++;
                        } else if (j == 0) {
                        }
                    }
                }
                return true;
            }
            if (segmentArr[i].count != 0) {
                break;
            }
            j += segmentArr[i].modCount;
            i++;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.A02;
        if (set != null) {
            return set;
        }
        DR5 dr5 = new DR5(this);
        this.A02 = dr5;
        return dr5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r2 = (V) r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (X.AnonymousClass002.A1Y(r6.getValue()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r4.modCount++;
        r1 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r7, r6, r4);
        r0 = r4.count - 1;
        r5.set(r3, r1);
        r4.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r2;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r2 = r8.A00(r9)
            com.google.common.collect.MapMakerInternalMap$Segment r4 = X.BV8.A0i(r8, r2)
            r4.lock()
            com.google.common.collect.MapMakerInternalMap.Segment.A02(r4)     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.DUZ<K, V, E>> r5 = r4.table     // Catch: java.lang.Throwable -> L6c
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L6c
            int r3 = r0 + (-1)
            r3 = r3 & r2
            java.lang.Object r7 = r5.get(r3)     // Catch: java.lang.Throwable -> L6c
            X.DUZ r7 = (X.DUZ) r7     // Catch: java.lang.Throwable -> L6c
            r6 = r7
        L22:
            r8 = 0
            if (r6 == 0) goto L68
            java.lang.Object r1 = r6.getKey()     // Catch: java.lang.Throwable -> L6c
            int r0 = r6.AGA()     // Catch: java.lang.Throwable -> L6c
            if (r0 != r2) goto L5f
            if (r1 == 0) goto L5f
            com.google.common.collect.MapMakerInternalMap<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r4.map     // Catch: java.lang.Throwable -> L6c
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.equivalent(r9, r1)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r6.getValue()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L4b
            java.lang.Object r0 = r6.getValue()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            if (r0 == 0) goto L68
        L4b:
            int r0 = r4.modCount     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + 1
            r4.modCount = r0     // Catch: java.lang.Throwable -> L6c
            X.DUZ r1 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r7, r6, r4)     // Catch: java.lang.Throwable -> L6c
            int r0 = r4.count     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + (-1)
            r5.set(r3, r1)     // Catch: java.lang.Throwable -> L6c
            r4.count = r0     // Catch: java.lang.Throwable -> L6c
            goto L64
        L5f:
            X.DUZ r6 = r6.AHz()     // Catch: java.lang.Throwable -> L6c
            goto L22
        L64:
            r4.unlock()
            return r2
        L68:
            r4.unlock()
            return r8
        L6c:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.A06.length; i++) {
            j += r5[i].count;
        }
        return DX6.A01(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        DR2 dr2 = new DR2(this);
        this.A00 = dr2;
        return dr2;
    }

    public MapMakerInternalMap(Equivalence equivalence, DUY duy, Strength strength, int i, int i2) {
        int iMin = Math.min(i == -1 ? 4 : i, 65536);
        this.concurrencyLevel = iMin;
        Strength[] strengthArr = Strength.A00;
        Equivalence<Object> equivalenceA00 = strength.A00();
        if (equivalence == null) {
            if (equivalenceA00 == null) {
                throw BV4.A0a("Both parameters are null");
            }
            equivalence = equivalenceA00;
        }
        this.keyEquivalence = equivalence;
        this.A05 = duy;
        int iMin2 = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 < iMin) {
            i6++;
            i5 <<= 1;
        }
        this.A04 = 32 - i6;
        this.A03 = i5 - 1;
        this.A06 = new Segment[i5];
        int i7 = iMin2 / i5;
        while (i4 < (i5 * i7 < iMin2 ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.A06;
            if (i3 >= segmentArr.length) {
                return;
            }
            segmentArr[i3] = this.A05.ARF(this, i4);
            i3++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iA00 = A00(k);
        return (V) BV8.A0i(this, iA00).A04(k, v, iA00, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> m) {
        Iterator itA0n = AnonymousClass002.A0n(m);
        while (itA0n.hasNext()) {
            AnonymousClass006.A1R(this, C3cH.A0l(itA0n));
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int iA00 = A00(k);
        return (V) BV8.A0i(this, iA00).A04(k, v, iA00, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r10, V r11) {
        /*
            r9 = this;
            r10.getClass()
            r11.getClass()
            int r8 = r9.A00(r10)
            com.google.common.collect.MapMakerInternalMap$Segment r3 = X.BV8.A0i(r9, r8)
            r3.lock()
            com.google.common.collect.MapMakerInternalMap.Segment.A02(r3)     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.DUZ<K, V, E>> r4 = r3.table     // Catch: java.lang.Throwable -> L72
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L72
            int r2 = r0 + (-1)
            r2 = r2 & r8
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L72
            X.DUZ r5 = (X.DUZ) r5     // Catch: java.lang.Throwable -> L72
            r1 = r5
        L24:
            r7 = 0
            if (r1 == 0) goto L6e
            java.lang.Object r6 = r1.getKey()     // Catch: java.lang.Throwable -> L72
            int r0 = r1.AGA()     // Catch: java.lang.Throwable -> L72
            if (r0 != r8) goto L4c
            if (r6 == 0) goto L4c
            com.google.common.collect.MapMakerInternalMap<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.map     // Catch: java.lang.Throwable -> L72
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.equivalent(r10, r6)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L67
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L72
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            goto L51
        L4c:
            X.DUZ r1 = r1.AHz()     // Catch: java.lang.Throwable -> L72
            goto L24
        L51:
            if (r0 == 0) goto L6e
            int r0 = r3.modCount     // Catch: java.lang.Throwable -> L72
            int r0 = r0 + 1
            r3.modCount = r0     // Catch: java.lang.Throwable -> L72
            X.DUZ r1 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r5, r1, r3)     // Catch: java.lang.Throwable -> L72
            int r0 = r3.count     // Catch: java.lang.Throwable -> L72
            int r0 = r0 + (-1)
            r4.set(r2, r1)     // Catch: java.lang.Throwable -> L72
            r3.count = r0     // Catch: java.lang.Throwable -> L72
            goto L6e
        L67:
            X.DUY.A00(r1, r3, r11)     // Catch: java.lang.Throwable -> L72
            r3.unlock()
            return r0
        L6e:
            r3.unlock()
            return r7
        L72:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r3.map.A05.AiG().A00().equivalent(r12, r5.getValue()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r5.getValue() != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r3.modCount++;
        r1 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r6, r5, r3);
        r0 = r3.count - 1;
        r4.set(r2, r1);
        r3.count = r0;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L7a
            if (r12 == 0) goto L7a
            int r9 = r10.A00(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r3 = X.BV8.A0i(r10, r9)
            r3.lock()
            com.google.common.collect.MapMakerInternalMap.Segment.A02(r3)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.DUZ<K, V, E>> r4 = r3.table     // Catch: java.lang.Throwable -> L75
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L75
            r8 = 1
            int r2 = r2 - r8
            r2 = r2 & r9
            java.lang.Object r6 = r4.get(r2)     // Catch: java.lang.Throwable -> L75
            X.DUZ r6 = (X.DUZ) r6     // Catch: java.lang.Throwable -> L75
            r5 = r6
        L22:
            r7 = 0
            if (r5 == 0) goto L71
            java.lang.Object r1 = r5.getKey()     // Catch: java.lang.Throwable -> L75
            int r0 = r5.AGA()     // Catch: java.lang.Throwable -> L75
            if (r0 != r9) goto L52
            if (r1 == 0) goto L52
            com.google.common.collect.MapMakerInternalMap<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.map     // Catch: java.lang.Throwable -> L75
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.equivalent(r11, r1)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L52
            java.lang.Object r1 = r5.getValue()     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.map     // Catch: java.lang.Throwable -> L75
            X.DUY<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.A05     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r0.AiG()     // Catch: java.lang.Throwable -> L75
            com.google.common.base.Equivalence r0 = r0.A00()     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.equivalent(r12, r1)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L59
            goto L57
        L52:
            X.DUZ r5 = r5.AHz()     // Catch: java.lang.Throwable -> L75
            goto L22
        L57:
            r7 = 1
            goto L5f
        L59:
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L71
        L5f:
            int r0 = r3.modCount     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + 1
            r3.modCount = r0     // Catch: java.lang.Throwable -> L75
            X.DUZ r1 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r6, r5, r3)     // Catch: java.lang.Throwable -> L75
            int r0 = r3.count     // Catch: java.lang.Throwable -> L75
            int r0 = r0 - r8
            r4.set(r2, r1)     // Catch: java.lang.Throwable -> L75
            r3.count = r0     // Catch: java.lang.Throwable -> L75
        L71:
            r3.unlock()
            return r7
        L75:
            r0 = move-exception
            r3.unlock()
            throw r0
        L7a:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return false;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean replace(K r10, V r11, V r12) {
        /*
            r9 = this;
            r10.getClass()
            r12.getClass()
            if (r11 == 0) goto L84
            int r8 = r9.A00(r10)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = X.BV8.A0i(r9, r8)
            r2.lock()
            com.google.common.collect.MapMakerInternalMap.Segment.A02(r2)     // Catch: java.lang.Throwable -> L7c
            java.util.concurrent.atomic.AtomicReferenceArray<E extends X.DUZ<K, V, E>> r5 = r2.table     // Catch: java.lang.Throwable -> L7c
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L7c
            r7 = 1
            int r4 = r4 - r7
            r4 = r4 & r8
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L7c
            X.DUZ r6 = (X.DUZ) r6     // Catch: java.lang.Throwable -> L7c
            r3 = r6
        L26:
            if (r3 == 0) goto L81
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L7c
            int r0 = r3.AGA()     // Catch: java.lang.Throwable -> L7c
            if (r0 != r8) goto L5d
            if (r1 == 0) goto L5d
            com.google.common.collect.MapMakerInternalMap<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map     // Catch: java.lang.Throwable -> L7c
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.equivalent(r10, r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L62
            java.lang.Object r0 = r3.getValue()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L81
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + 1
            r2.modCount = r0     // Catch: java.lang.Throwable -> L7c
            X.DUZ r1 = com.google.common.collect.MapMakerInternalMap.Segment.A00(r6, r3, r2)     // Catch: java.lang.Throwable -> L7c
            int r0 = r2.count     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 - r7
            r5.set(r4, r1)     // Catch: java.lang.Throwable -> L7c
            r2.count = r0     // Catch: java.lang.Throwable -> L7c
            goto L81
        L5d:
            X.DUZ r3 = r3.AHz()     // Catch: java.lang.Throwable -> L7c
            goto L26
        L62:
            com.google.common.collect.MapMakerInternalMap<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map     // Catch: java.lang.Throwable -> L7c
            X.DUY<K, V, E extends X.DUZ<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.A05     // Catch: java.lang.Throwable -> L7c
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r0.AiG()     // Catch: java.lang.Throwable -> L7c
            com.google.common.base.Equivalence r0 = r0.A00()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.equivalent(r11, r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L81
            X.DUY.A00(r3, r2, r12)     // Catch: java.lang.Throwable -> L7c
            r2.unlock()
            r0 = 1
            return r0
        L7c:
            r0 = move-exception
            r2.unlock()
            throw r0
        L81:
            r2.unlock()
        L84:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
