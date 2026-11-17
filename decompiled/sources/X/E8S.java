package X;

import com.google.common.base.Equivalence;
import com.google.common.base.Ticker;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class E8S<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public Collection<V> A00;
    public Set<Map.Entry<K, V>> A01;
    public Set<K> A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Equivalence<Object> A09;
    public final Equivalence<Object> A0A;
    public final Ticker A0B;
    public final E9R A0C;
    public final EnumC6485E8p A0D;
    public final E8V A0E;
    public final E8V A0F;
    public final CQN<K, V> A0G;
    public final E98<K, V> A0H;
    public final Queue<DQn<K, V>> A0I;
    public final E8T<K, V>[] A0J;
    public static final Logger A0M = BV5.A1B(E8S.class);
    public static final E8d<Object, Object> A0K = new E8m();
    public static final Queue<?> A0L = new C6493E8x();

    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E8S(X.E8Q r16) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8S.<init>(X.E8Q):void");
    }

    private final int A00(Object key) {
        int iDoHash = this.A09.doHash(key);
        int i = iDoHash + ((iDoHash << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final boolean A01(E8b<K, V> entry, long now) {
        long j = this.A06;
        if (AnonymousClass002.A1N((j > 0L ? 1 : (j == 0L ? 0 : -1))) && now - entry.ACB() >= j) {
            return true;
        }
        long j2 = this.A07;
        return j2 > 0 && now - entry.AMt() >= j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        E8T<K, V>[] e8tArr = this.A0J;
        int length = e8tArr.length;
        for (int i = 0; i < length; i++) {
            E8T<K, V> e8t = e8tArr[i];
            if (e8t.count != 0) {
                e8t.lock();
                try {
                    E8T.A0A(e8t, E8T.A00(e8t));
                    AtomicReferenceArray<E8b<K, V>> atomicReferenceArray = e8t.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (E8b<K, V> e8bAHy = atomicReferenceArray.get(i2); e8bAHy != null; e8bAHy = e8bAHy.AHy()) {
                            if (e8bAHy.AMU().isActive()) {
                                K key = e8bAHy.getKey();
                                V v = e8bAHy.AMU().get();
                                E9S e9s = (key == null || v == null) ? E9S.A01 : E9S.A03;
                                e8bAHy.AGA();
                                E8T.A0E(e8t, e9s, key, v, e8bAHy.AMU().AMk());
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    E8V e8v = e8t.map.A0E;
                    E8V e8v2 = E8V.A01;
                    if (e8v != e8v2) {
                        while (e8t.keyReferenceQueue.poll() != null) {
                        }
                    }
                    if (e8t.map.A0F != e8v2) {
                        while (e8t.valueReferenceQueue.poll() != null) {
                        }
                    }
                    e8t.writeQueue.clear();
                    e8t.accessQueue.clear();
                    e8t.readCount.set(0);
                    E8T.A06(e8t);
                    e8t.count = 0;
                } finally {
                    e8t.unlock();
                    E8T.A07(e8t);
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        E8b e8bA03;
        if (key == null) {
            return false;
        }
        int iA00 = A00(key);
        E8T e8tA0g = BV8.A0g(this, iA00);
        try {
            boolean z = false;
            if (e8tA0g.count != 0 && (e8bA03 = E8T.A03(e8tA0g, key, iA00, E8T.A00(e8tA0g))) != null) {
                if (e8bA03.AMU().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            e8tA0g.A0H();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        V v;
        if (value != null) {
            long j = this.A0B.read();
            E8T<K, V>[] e8tArr = this.A0J;
            long j2 = -1;
            int i = 0;
            do {
                int length = e8tArr.length;
                long j3 = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    E8T<K, V> e8t = e8tArr[i2];
                    AtomicReferenceArray<E8b<K, V>> atomicReferenceArray = e8t.table;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (E8b<K, V> e8bAHy = atomicReferenceArray.get(i3); e8bAHy != null; e8bAHy = e8bAHy.AHy()) {
                            if (e8bAHy.getKey() == null || (v = e8bAHy.AMU().get()) == null) {
                                E8T.A08(e8t);
                            } else if (!e8t.map.A01(e8bAHy, j)) {
                                if (this.A0A.equivalent(value, v)) {
                                    return true;
                                }
                            } else if (e8t.tryLock()) {
                                try {
                                    E8T.A09(e8t, j);
                                } finally {
                                    e8t.unlock();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    j3 += e8t.modCount;
                }
                if (j3 == j2) {
                    break;
                }
                i++;
                j2 = j3;
            } while (i < 3);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A01;
        if (set != null) {
            return set;
        }
        DTC dtc = new DTC(this);
        this.A01 = dtc;
        return dtc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object key) {
        long jA00;
        E8b<K, V> e8bA03;
        if (key == null) {
            return null;
        }
        int iA00 = A00(key);
        E8T e8tA0g = BV8.A0g(this, iA00);
        try {
            if (e8tA0g.count != 0 && (e8bA03 = E8T.A03(e8tA0g, key, iA00, (jA00 = E8T.A00(e8tA0g)))) != null) {
                V v = e8bA03.AMU().get();
                if (v != null) {
                    if (e8tA0g.map.A06 > 0) {
                        e8bA03.Ace(jA00);
                    }
                    e8tA0g.recencyQueue.add(e8bA03);
                    e8bA03.getKey();
                    return v;
                }
                E8T.A08(e8tA0g);
            }
            return null;
        } finally {
            e8tA0g.A0H();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        E8T<K, V>[] e8tArr = this.A0J;
        int length = e8tArr.length;
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                if (j != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (e8tArr[i2].count != 0) {
                                break;
                            }
                            j -= r1.modCount;
                            i2++;
                        } else if (j == 0) {
                        }
                    }
                }
                return true;
            }
            if (e8tArr[i].count != 0) {
                break;
            }
            j += r1.modCount;
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
        DTA dta = new DTA(this);
        this.A02 = dta;
        return dta;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r6 = r8.AMU();
        r11 = r6.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r11 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r9 = X.E9S.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r6.isActive() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r9 = X.E9S.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        X.E8T.A06(r5);
        r1 = X.E8T.A01(r5, r6, r7, r8, r9, r10, r11);
        r0 = r5.count - 1;
        r3.set(r2, r1);
        r5.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r11;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            int r4 = r10.A00(r11)
            X.E8T r5 = X.BV8.A0g(r10, r4)
            r5.lock()
            long r0 = X.E8T.A00(r5)     // Catch: java.lang.Throwable -> L78
            X.E8T.A0A(r5, r0)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicReferenceArray<X.E8b<K, V>> r3 = r5.table     // Catch: java.lang.Throwable -> L78
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L78
            int r2 = r0 + (-1)
            r2 = r2 & r4
            java.lang.Object r7 = r3.get(r2)     // Catch: java.lang.Throwable -> L78
            X.E8b r7 = (X.E8b) r7     // Catch: java.lang.Throwable -> L78
            r8 = r7
        L26:
            r1 = 0
            if (r8 == 0) goto L71
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> L78
            int r0 = r8.AGA()     // Catch: java.lang.Throwable -> L78
            if (r0 != r4) goto L48
            if (r10 == 0) goto L48
            X.E8S<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L78
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.A09     // Catch: java.lang.Throwable -> L78
            boolean r0 = r0.equivalent(r11, r10)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L48
            X.E8d r6 = r8.AMU()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r11 = r6.get()     // Catch: java.lang.Throwable -> L78
            goto L4d
        L48:
            X.E8b r8 = r8.AHy()     // Catch: java.lang.Throwable -> L78
            goto L26
        L4d:
            if (r11 == 0) goto L52
            X.E9S r9 = X.E9S.A03     // Catch: java.lang.Throwable -> L78
            goto L5a
        L52:
            boolean r0 = r6.isActive()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L71
            X.E9S r9 = X.E9S.A01     // Catch: java.lang.Throwable -> L78
        L5a:
            X.E8T.A06(r5)     // Catch: java.lang.Throwable -> L78
            X.E8b r1 = X.E8T.A01(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L78
            int r0 = r5.count     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L78
            r5.count = r0     // Catch: java.lang.Throwable -> L78
            r5.unlock()
            X.E8T.A07(r5)
            return r11
        L71:
            r5.unlock()
            X.E8T.A07(r5)
            return r1
        L78:
            r0 = move-exception
            r5.unlock()
            X.E8T.A07(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8S.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i = 0; i < this.A0J.length; i++) {
            jMax += Math.max(0, r7[i].count);
        }
        return DX6.A01(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        DT6 dt6 = new DT6(this);
        this.A00 = dt6;
        return dt6;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(Object key, V defaultValue) {
        V v = get(key);
        return v != null ? v : defaultValue;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iA00 = A00(k);
        return (V) BV8.A0g(this, iA00).A0G(k, v, iA00, false);
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
        return (V) BV8.A0g(this, iA00).A0G(k, v, iA00, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r14, V r15) {
        /*
            r13 = this;
            r14.getClass()
            r15.getClass()
            int r5 = r13.A00(r14)
            X.E8T r7 = X.BV8.A0g(r13, r5)
            r7.lock()
            long r0 = X.E8T.A00(r7)     // Catch: java.lang.Throwable -> L89
            X.E8T.A0A(r7, r0)     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.atomic.AtomicReferenceArray<X.E8b<K, V>> r3 = r7.table     // Catch: java.lang.Throwable -> L89
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L89
            int r2 = r2 + (-1)
            r2 = r2 & r5
            java.lang.Object r9 = r3.get(r2)     // Catch: java.lang.Throwable -> L89
            X.E8b r9 = (X.E8b) r9     // Catch: java.lang.Throwable -> L89
            r10 = r9
        L28:
            r6 = 0
            if (r10 == 0) goto L82
            java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> L89
            int r4 = r10.AGA()     // Catch: java.lang.Throwable -> L89
            if (r4 != r5) goto L64
            if (r12 == 0) goto L64
            X.E8S<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L89
            com.google.common.base.Equivalence<java.lang.Object> r4 = r4.A09     // Catch: java.lang.Throwable -> L89
            boolean r4 = r4.equivalent(r14, r12)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L64
            X.E8d r8 = r10.AMU()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r13 = r8.get()     // Catch: java.lang.Throwable -> L89
            if (r13 != 0) goto L69
            boolean r0 = r8.isActive()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L82
            X.E8T.A06(r7)     // Catch: java.lang.Throwable -> L89
            X.E9S r11 = X.E9S.A01     // Catch: java.lang.Throwable -> L89
            X.E8b r1 = X.E8T.A01(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L89
            int r0 = r7.count     // Catch: java.lang.Throwable -> L89
            int r0 = r0 + (-1)
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L89
            r7.count = r0     // Catch: java.lang.Throwable -> L89
            goto L82
        L64:
            X.E8b r10 = r10.AHy()     // Catch: java.lang.Throwable -> L89
            goto L28
        L69:
            X.E8T.A06(r7)     // Catch: java.lang.Throwable -> L89
            int r3 = r8.AMk()     // Catch: java.lang.Throwable -> L89
            X.E9S r2 = X.E9S.A04     // Catch: java.lang.Throwable -> L89
            X.E8T.A0E(r7, r2, r14, r13, r3)     // Catch: java.lang.Throwable -> L89
            X.E8T.A0D(r7, r10, r15, r0)     // Catch: java.lang.Throwable -> L89
            X.E8T.A0B(r7, r10)     // Catch: java.lang.Throwable -> L89
            r7.unlock()
            X.E8T.A07(r7)
            return r13
        L82:
            r7.unlock()
            X.E8T.A07(r7)
            return r6
        L89:
            r0 = move-exception
            r7.unlock()
            X.E8T.A07(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8S.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r6 = r8.AMU();
        r11 = r6.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r5.map.A0A.equivalent(r12, r11) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r9 = X.E9S.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r11 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r6.isActive() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r9 = X.E9S.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        X.E8T.A06(r5);
        r1 = X.E8T.A01(r5, r6, r7, r8, r9, r10, r11);
        r0 = r5.count - 1;
        r3.set(r2, r1);
        r5.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r9 == X.E9S.A03) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        return r4;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L8c
            if (r12 == 0) goto L8c
            int r1 = r10.A00(r11)
            X.E8T r5 = X.BV8.A0g(r10, r1)
            r5.lock()
            long r2 = X.E8T.A00(r5)     // Catch: java.lang.Throwable -> L7e
            X.E8T.A0A(r5, r2)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.atomic.AtomicReferenceArray<X.E8b<K, V>> r3 = r5.table     // Catch: java.lang.Throwable -> L7e
            int r2 = r3.length()     // Catch: java.lang.Throwable -> L7e
            r4 = 1
            int r2 = r2 - r4
            r2 = r2 & r1
            java.lang.Object r7 = r3.get(r2)     // Catch: java.lang.Throwable -> L7e
            X.E8b r7 = (X.E8b) r7     // Catch: java.lang.Throwable -> L7e
            r8 = r7
        L26:
            if (r8 == 0) goto L86
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> L7e
            int r0 = r8.AGA()     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L4f
            if (r10 == 0) goto L4f
            X.E8S<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L7e
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.A09     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.equivalent(r11, r10)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L4f
            X.E8d r6 = r8.AMU()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r11 = r6.get()     // Catch: java.lang.Throwable -> L7e
            X.E8S<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L7e
            com.google.common.base.Equivalence<java.lang.Object> r0 = r0.A0A     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.equivalent(r12, r11)     // Catch: java.lang.Throwable -> L7e
            goto L54
        L4f:
            X.E8b r8 = r8.AHy()     // Catch: java.lang.Throwable -> L7e
            goto L26
        L54:
            if (r0 == 0) goto L59
            X.E9S r9 = X.E9S.A03     // Catch: java.lang.Throwable -> L7e
            goto L63
        L59:
            if (r11 != 0) goto L86
            boolean r0 = r6.isActive()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L86
            X.E9S r9 = X.E9S.A01     // Catch: java.lang.Throwable -> L7e
        L63:
            X.E8T.A06(r5)     // Catch: java.lang.Throwable -> L7e
            X.E8b r1 = X.E8T.A01(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
            int r0 = r5.count     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 - r4
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> L7e
            r5.count = r0     // Catch: java.lang.Throwable -> L7e
            X.E9S r0 = X.E9S.A03     // Catch: java.lang.Throwable -> L7e
            if (r9 == r0) goto L77
            r4 = 0
        L77:
            r5.unlock()
            X.E8T.A07(r5)
            return r4
        L7e:
            r0 = move-exception
            r5.unlock()
            X.E8T.A07(r5)
            throw r0
        L86:
            r5.unlock()
            X.E8T.A07(r5)
        L8c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8S.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        return false;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean replace(K r13, V r14, V r15) {
        /*
            r12 = this;
            r13.getClass()
            r4 = r15
            r15.getClass()
            r5 = r14
            if (r14 == 0) goto Lb0
            int r7 = r12.A00(r13)
            X.E8T r9 = X.BV8.A0g(r12, r7)
            r9.lock()
            long r0 = X.E8T.A00(r9)     // Catch: java.lang.Throwable -> La2
            X.E8T.A0A(r9, r0)     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.atomic.AtomicReferenceArray<X.E8b<K, V>> r3 = r9.table     // Catch: java.lang.Throwable -> La2
            int r2 = r3.length()     // Catch: java.lang.Throwable -> La2
            r8 = 1
            int r2 = r2 - r8
            r2 = r2 & r7
            java.lang.Object r11 = r3.get(r2)     // Catch: java.lang.Throwable -> La2
            X.E8b r11 = (X.E8b) r11     // Catch: java.lang.Throwable -> La2
            r12 = r11
        L2c:
            if (r12 == 0) goto Laa
            java.lang.Object r14 = r12.getKey()     // Catch: java.lang.Throwable -> La2
            int r6 = r12.AGA()     // Catch: java.lang.Throwable -> La2
            if (r6 != r7) goto L66
            if (r14 == 0) goto L66
            X.E8S<K, V> r6 = r9.map     // Catch: java.lang.Throwable -> La2
            com.google.common.base.Equivalence<java.lang.Object> r6 = r6.A09     // Catch: java.lang.Throwable -> La2
            boolean r6 = r6.equivalent(r13, r14)     // Catch: java.lang.Throwable -> La2
            if (r6 == 0) goto L66
            X.E8d r10 = r12.AMU()     // Catch: java.lang.Throwable -> La2
            java.lang.Object r15 = r10.get()     // Catch: java.lang.Throwable -> La2
            if (r15 != 0) goto L6b
            boolean r0 = r10.isActive()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto Laa
            X.E8T.A06(r9)     // Catch: java.lang.Throwable -> La2
            X.E9S r13 = X.E9S.A01     // Catch: java.lang.Throwable -> La2
            X.E8b r1 = X.E8T.A01(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> La2
            int r0 = r9.count     // Catch: java.lang.Throwable -> La2
            int r0 = r0 - r8
            r3.set(r2, r1)     // Catch: java.lang.Throwable -> La2
            r9.count = r0     // Catch: java.lang.Throwable -> La2
            goto Laa
        L66:
            X.E8b r12 = r12.AHy()     // Catch: java.lang.Throwable -> La2
            goto L2c
        L6b:
            X.E8S<K, V> r2 = r9.map     // Catch: java.lang.Throwable -> La2
            com.google.common.base.Equivalence<java.lang.Object> r2 = r2.A0A     // Catch: java.lang.Throwable -> La2
            boolean r2 = r2.equivalent(r5, r15)     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L8f
            X.E8T.A06(r9)     // Catch: java.lang.Throwable -> La2
            int r3 = r10.AMk()     // Catch: java.lang.Throwable -> La2
            X.E9S r2 = X.E9S.A04     // Catch: java.lang.Throwable -> La2
            X.E8T.A0E(r9, r2, r13, r15, r3)     // Catch: java.lang.Throwable -> La2
            X.E8T.A0D(r9, r12, r4, r0)     // Catch: java.lang.Throwable -> La2
            X.E8T.A0B(r9, r12)     // Catch: java.lang.Throwable -> La2
            r9.unlock()
            X.E8T.A07(r9)
            r0 = 1
            return r0
        L8f:
            X.E8S<K, V> r2 = r9.map     // Catch: java.lang.Throwable -> La2
            long r5 = r2.A06     // Catch: java.lang.Throwable -> La2
            r3 = 0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L9c
            r12.Ace(r0)     // Catch: java.lang.Throwable -> La2
        L9c:
            java.util.Queue<X.E8b<K, V>> r0 = r9.accessQueue     // Catch: java.lang.Throwable -> La2
            r0.add(r12)     // Catch: java.lang.Throwable -> La2
            goto Laa
        La2:
            r0 = move-exception
            r9.unlock()
            X.E8T.A07(r9)
            throw r0
        Laa:
            r9.unlock()
            X.E8T.A07(r9)
        Lb0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8S.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
