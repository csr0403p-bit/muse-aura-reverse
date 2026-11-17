package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class E8T<K, V> extends ReentrantLock {
    public final Queue<E8b<K, V>> accessQueue;
    public volatile int count;
    public final ReferenceQueue<K> keyReferenceQueue;
    public final E8S<K, V> map;
    public final long maxSegmentWeight;
    public int modCount;
    public final AtomicInteger readCount = new AtomicInteger();
    public final Queue<E8b<K, V>> recencyQueue;
    public final E9R statsCounter;
    public volatile AtomicReferenceArray<E8b<K, V>> table;
    public int threshold;
    public long totalWeight;
    public final ReferenceQueue<V> valueReferenceQueue;
    public final Queue<E8b<K, V>> writeQueue;

    /* JADX WARN: Incorrect types in method signature: (LX/E8b<TK;TV;>;ILX/E9S;)Z */
    private final boolean A0F(E8b entry, E9S hash, int cause) {
        AtomicReferenceArray<E8b<K, V>> atomicReferenceArray = this.table;
        int length = (atomicReferenceArray.length() - 1) & cause;
        E8b<K, V> e8b = atomicReferenceArray.get(length);
        for (E8b<K, V> e8bAHy = e8b; e8bAHy != null; e8bAHy = e8bAHy.AHy()) {
            if (e8bAHy == entry) {
                A06(this);
                E8b<K, V> e8bA01 = A01(this, e8bAHy.AMU(), e8b, e8bAHy, hash, e8bAHy.getKey(), e8bAHy.AMU().get());
                int i = this.count - 1;
                atomicReferenceArray.set(length, e8bA01);
                this.count = i;
                return true;
            }
        }
        return false;
    }

    public static long A00(E8T e8t) {
        return e8t.map.A0B.read();
    }

    public static final E8b A03(E8T e8t, Object obj, int i, long j) {
        E8b<K, V> e8bAHy = e8t.table.get((r1.length() - 1) & i);
        while (true) {
            if (e8bAHy == null) {
                e8bAHy = null;
                break;
            }
            if (e8bAHy.AGA() == i) {
                K key = e8bAHy.getKey();
                if (key == null) {
                    A08(e8t);
                } else if (e8t.map.A09.equivalent(obj, key)) {
                    break;
                }
            }
            e8bAHy = e8bAHy.AHy();
        }
        if (e8bAHy != null) {
            if (!e8t.map.A01(e8bAHy, j)) {
                return e8bAHy;
            }
            if (e8t.tryLock()) {
                try {
                    A09(e8t, j);
                    return null;
                } finally {
                    e8t.unlock();
                }
            }
        }
        return null;
    }

    private final void A04() {
        while (true) {
            E8b<K, V> e8bPoll = this.recencyQueue.poll();
            if (e8bPoll == null) {
                return;
            }
            if (this.accessQueue.contains(e8bPoll)) {
                this.accessQueue.add(e8bPoll);
            }
        }
    }

    private final void A05() {
        E8V e8v = this.map.A0E;
        E8V e8v2 = E8V.A01;
        if (e8v != e8v2) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    break;
                }
                E8b<K, V> e8b = (E8b) referencePoll;
                E8S<K, V> e8s = this.map;
                int iAGA = e8b.AGA();
                E8T e8tA0g = BV8.A0g(e8s, iAGA);
                e8tA0g.lock();
                try {
                    AtomicReferenceArray<E8b<K, V>> atomicReferenceArray = e8tA0g.table;
                    int length = (atomicReferenceArray.length() - 1) & iAGA;
                    E8b<K, V> e8b2 = atomicReferenceArray.get(length);
                    E8b<K, V> e8bAHy = e8b2;
                    while (true) {
                        if (e8bAHy == null) {
                            break;
                        }
                        if (e8bAHy == e8b) {
                            A06(e8tA0g);
                            E8b<K, V> e8bA01 = A01(e8tA0g, e8bAHy.AMU(), e8b2, e8bAHy, E9S.A01, e8bAHy.getKey(), e8bAHy.AMU().get());
                            int i2 = e8tA0g.count - 1;
                            atomicReferenceArray.set(length, e8bA01);
                            e8tA0g.count = i2;
                            break;
                        }
                        e8bAHy = e8bAHy.AHy();
                    }
                    e8tA0g.unlock();
                    A07(e8tA0g);
                    i++;
                } catch (Throwable th) {
                    e8tA0g.unlock();
                    A07(e8tA0g);
                    throw th;
                }
            } while (i != 16);
        }
        if (this.map.A0F != e8v2) {
            int i3 = 0;
            do {
                Reference<? extends V> referencePoll2 = this.valueReferenceQueue.poll();
                if (referencePoll2 == null) {
                    return;
                }
                E8d<K, V> e8d = (E8d) referencePoll2;
                E8S<K, V> e8s2 = this.map;
                E8b<K, V> e8bAFG = e8d.AFG();
                int iAGA2 = e8bAFG.AGA();
                E8T e8tA0g2 = BV8.A0g(e8s2, iAGA2);
                K key = e8bAFG.getKey();
                e8tA0g2.lock();
                try {
                    AtomicReferenceArray<E8b<K, V>> atomicReferenceArray2 = e8tA0g2.table;
                    int length2 = (atomicReferenceArray2.length() - 1) & iAGA2;
                    E8b<K, V> e8b3 = atomicReferenceArray2.get(length2);
                    E8b<K, V> e8bAHy2 = e8b3;
                    while (true) {
                        if (e8bAHy2 == null) {
                            break;
                        }
                        K key2 = e8bAHy2.getKey();
                        if (e8bAHy2.AGA() != iAGA2 || key2 == null || !e8tA0g2.map.A09.equivalent(key, key2)) {
                            e8bAHy2 = e8bAHy2.AHy();
                        } else if (e8bAHy2.AMU() == e8d) {
                            A06(e8tA0g2);
                            E8b<K, V> e8bA012 = A01(e8tA0g2, e8d, e8b3, e8bAHy2, E9S.A01, key2, e8d.get());
                            int i4 = e8tA0g2.count - 1;
                            atomicReferenceArray2.set(length2, e8bA012);
                            e8tA0g2.count = i4;
                        }
                    }
                    i3++;
                } finally {
                    e8tA0g2.unlock();
                    if (!e8tA0g2.isHeldByCurrentThread()) {
                        A07(e8tA0g2);
                    }
                }
            } while (i3 != 16);
        }
    }

    public static void A06(E8T e8t) {
        e8t.modCount++;
    }

    public static final void A0B(E8T e8t, E8b e8b) {
        if (e8t.map.A08 >= 0) {
            e8t.A04();
            if (e8b.AMU().AMk() > e8t.maxSegmentWeight) {
                if (!e8t.A0F(e8b, E9S.A05, e8b.AGA())) {
                    throw BV6.A0f();
                }
            }
            while (e8t.totalWeight > e8t.maxSegmentWeight) {
                for (E8b<K, V> e8b2 : e8t.accessQueue) {
                    if (e8b2.AMU().AMk() > 0) {
                        if (!e8t.A0F(e8b2, E9S.A05, e8b2.AGA())) {
                            throw BV6.A0f();
                        }
                    }
                }
                throw BV6.A0f();
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TK;ITV;ILX/E9S;)V */
    public static final void A0E(E8T key, E9S hash, Object value, Object weight, int cause) {
        key.totalWeight -= cause;
        if (key.map.A0I != E8S.A0L) {
            key.map.A0I.offer(new DQn<>(hash, value, weight));
        }
    }

    public final void A0H() {
        if ((this.readCount.incrementAndGet() & 63) == 0) {
            A0A(this, A00(this));
            A07(this);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/E8S<TK;TV;>;IJLX/E9R;)V */
    public E8T(E9R e9r, E8S e8s, int i, long j) {
        boolean z;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        this.map = e8s;
        this.maxSegmentWeight = j;
        e9r.getClass();
        this.statsCounter = e9r;
        AtomicReferenceArray<E8b<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.threshold = length;
        if (this.map.A0H == E8l.A01 && length == this.maxSegmentWeight) {
            this.threshold = length + 1;
        }
        this.table = atomicReferenceArray;
        E8V e8v = e8s.A0E;
        E8V e8v2 = E8V.A01;
        this.keyReferenceQueue = AnonymousClass006.A1Z(e8v, e8v2) ? new ReferenceQueue<>() : null;
        this.valueReferenceQueue = e8s.A0F != e8v2 ? new ReferenceQueue<>() : null;
        if (e8s.A06 > 0 || e8s.A08 >= 0) {
            z = true;
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        } else {
            z = false;
            concurrentLinkedQueue = (Queue<E8b<K, V>>) E8S.A0L;
        }
        this.recencyQueue = concurrentLinkedQueue;
        this.writeQueue = e8s.A07 > 0 ? new E8o() : (Queue<E8b<K, V>>) E8S.A0L;
        this.accessQueue = z ? new C6486E8q() : (Queue<E8b<K, V>>) E8S.A0L;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/E8b<TK;TV;>;LX/E8b<TK;TV;>;TK;ITV;LX/E8d<TK;TV;>;LX/E9S;)LX/E8b<TK;TV;>; */
    public static final E8b A01(E8T first, E8d entry, E8b key, E8b hash, E9S value, Object valueReference, Object cause) {
        A0E(first, value, valueReference, cause, entry.AMk());
        first.writeQueue.remove(hash);
        first.accessQueue.remove(hash);
        int i = first.count;
        E8b<K, V> e8bAHy = hash.AHy();
        while (key != hash) {
            E8b<K, V> e8bA02 = A02(first, key, e8bAHy);
            if (e8bA02 != null) {
                e8bAHy = e8bA02;
            } else {
                A0C(first, key);
                i--;
            }
            key = key.AHy();
        }
        first.count = i;
        return e8bAHy;
    }

    public static final E8b A02(E8T e8t, E8b e8b, E8b e8b2) {
        E8d<K, V> e8dAMU;
        V v;
        Object key = e8b.getKey();
        if (key == null || ((v = (e8dAMU = e8b.AMU()).get()) == null && e8dAMU.isActive())) {
            return null;
        }
        F4C f4c = (F4C) e8t.map.A0D;
        int i = f4c.$t;
        E8b<K, V> e8bA01 = f4c.A01(e8t, e8b2, key, e8b.AGA());
        switch (i) {
            case 1:
            case 5:
                EnumC6485E8p.A00(e8b, e8bA01);
                break;
            case 3:
            case 7:
                EnumC6485E8p.A00(e8b, e8bA01);
            case 2:
            case 6:
                e8bA01.AfH(e8b.AMt());
                E8b<K, V> e8bAJ0 = e8b.AJ0();
                e8bAJ0.Adq(e8bA01);
                e8bA01.AeE(e8bAJ0);
                E8b<K, V> e8bAI4 = e8b.AI4();
                e8bA01.Adq(e8bAI4);
                e8bAI4.AeE(e8bA01);
                E8k e8k = E8k.A01;
                e8b.Adq(e8k);
                e8b.AeE(e8k);
                break;
        }
        e8bA01.AfA(e8dAMU.A7M(e8bA01, v, e8t.valueReferenceQueue));
        return e8bA01;
    }

    public static final void A07(E8T e8t) {
        if (e8t.isHeldByCurrentThread()) {
            return;
        }
        while (e8t.map.A0I.poll() != null) {
        }
    }

    public static final void A08(E8T e8t) {
        if (e8t.tryLock()) {
            try {
                e8t.A05();
            } finally {
                e8t.unlock();
            }
        }
    }

    public static final void A09(E8T e8t, long j) {
        E8b<K, V> e8bPeek;
        E8b<K, V> e8bPeek2;
        e8t.A04();
        do {
            e8bPeek = e8t.writeQueue.peek();
            if (e8bPeek == null || !e8t.map.A01(e8bPeek, j)) {
                do {
                    e8bPeek2 = e8t.accessQueue.peek();
                    if (e8bPeek2 == null || !e8t.map.A01(e8bPeek2, j)) {
                        return;
                    }
                } while (e8t.A0F(e8bPeek2, E9S.A02, e8bPeek2.AGA()));
                throw BV6.A0f();
            }
        } while (e8t.A0F(e8bPeek, E9S.A02, e8bPeek.AGA()));
        throw BV6.A0f();
    }

    public static final void A0A(E8T e8t, long j) {
        if (e8t.tryLock()) {
            try {
                e8t.A05();
                A09(e8t, j);
                e8t.readCount.set(0);
            } finally {
                e8t.unlock();
            }
        }
    }

    public static final void A0C(E8T e8t, E8b e8b) {
        Object key = e8b.getKey();
        e8b.AGA();
        A0E(e8t, E9S.A01, key, e8b.AMU().get(), e8b.AMU().AMk());
        e8t.writeQueue.remove(e8b);
        e8t.accessQueue.remove(e8b);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/E8b<TK;TV;>;TK;TV;J)V */
    public static final void A0D(E8T entry, E8b key, Object value, long now) {
        key.AMU();
        E8V e8v = entry.map.A0F;
        key.AfA(e8v instanceof E8Y ? new E8c<>(key, value, entry.valueReferenceQueue) : e8v instanceof E8Z ? new E8h<>(key, value, entry.valueReferenceQueue) : new E8g<>(value));
        entry.A04();
        entry.totalWeight++;
        if (entry.map.A06 > 0) {
            key.Ace(now);
        }
        if (entry.map.A07 > 0) {
            key.AfH(now);
        }
        entry.accessQueue.add(key);
        entry.writeQueue.add(key);
    }

    /* JADX WARN: Incorrect types in method signature: (TK;ITV;Z)TV; */
    public final Object A0G(Object key, Object hash, int value, boolean onlyIfAbsent) {
        int i;
        AtomicReferenceArray<E8b<K, V>> atomicReferenceArray;
        int length;
        lock();
        try {
            long jA00 = A00(this);
            A0A(this, jA00);
            if (this.count + 1 > this.threshold && (length = (atomicReferenceArray = this.table).length()) < 1073741824) {
                int i2 = this.count;
                AtomicReferenceArray<E8b<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
                this.threshold = (atomicReferenceArray2.length() * 3) / 4;
                int length2 = atomicReferenceArray2.length() - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    E8b<K, V> e8bAHy = atomicReferenceArray.get(i3);
                    if (e8bAHy != null) {
                        E8b<K, V> e8bAHy2 = e8bAHy.AHy();
                        int iAGA = e8bAHy.AGA() & length2;
                        if (e8bAHy2 == null) {
                            atomicReferenceArray2.set(iAGA, e8bAHy);
                        } else {
                            E8b<K, V> e8b = e8bAHy;
                            do {
                                int iAGA2 = e8bAHy2.AGA() & length2;
                                if (iAGA2 != iAGA) {
                                    e8b = e8bAHy2;
                                    iAGA = iAGA2;
                                }
                                e8bAHy2 = e8bAHy2.AHy();
                            } while (e8bAHy2 != null);
                            atomicReferenceArray2.set(iAGA, e8b);
                            while (e8bAHy != e8b) {
                                int iAGA3 = e8bAHy.AGA() & length2;
                                E8b<K, V> e8bA02 = A02(this, e8bAHy, atomicReferenceArray2.get(iAGA3));
                                if (e8bA02 != null) {
                                    atomicReferenceArray2.set(iAGA3, e8bA02);
                                } else {
                                    A0C(this, e8bAHy);
                                    i2--;
                                }
                                e8bAHy = e8bAHy.AHy();
                            }
                        }
                    }
                }
                this.table = atomicReferenceArray2;
                this.count = i2;
            }
            AtomicReferenceArray<E8b<K, V>> atomicReferenceArray3 = this.table;
            int length3 = value & (atomicReferenceArray3.length() - 1);
            E8b e8b2 = atomicReferenceArray3.get(length3);
            E8b e8bA01 = e8b2;
            while (true) {
                if (e8bA01 == null) {
                    A06(this);
                    e8bA01 = this.map.A0D.A01(this, e8b2, key, value);
                    A0D(this, e8bA01, hash, jA00);
                    atomicReferenceArray3.set(length3, e8bA01);
                    i = this.count + 1;
                    break;
                }
                K key2 = e8bA01.getKey();
                if (e8bA01.AGA() == value && key2 != null && this.map.A09.equivalent(key, key2)) {
                    E8d<K, V> e8dAMU = e8bA01.AMU();
                    V v = e8dAMU.get();
                    if (v != null) {
                        if (onlyIfAbsent) {
                            if (this.map.A06 > 0) {
                                e8bA01.Ace(jA00);
                            }
                            this.accessQueue.add(e8bA01);
                        } else {
                            A06(this);
                            A0E(this, E9S.A04, key, v, e8dAMU.AMk());
                            A0D(this, e8bA01, hash, jA00);
                            A0B(this, e8bA01);
                        }
                        return v;
                    }
                    A06(this);
                    if (e8dAMU.isActive()) {
                        A0E(this, E9S.A01, key, v, e8dAMU.AMk());
                        A0D(this, e8bA01, hash, jA00);
                        i = this.count;
                    } else {
                        A0D(this, e8bA01, hash, jA00);
                        i = this.count + 1;
                    }
                } else {
                    e8bA01 = e8bA01.AHy();
                }
            }
            this.count = i;
            A0B(this, e8bA01);
            return null;
        } finally {
            unlock();
            A07(this);
        }
    }
}
